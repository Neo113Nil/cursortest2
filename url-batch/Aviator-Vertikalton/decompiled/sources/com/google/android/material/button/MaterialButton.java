package com.google.android.material.button;

import B0.o;
import H0.j;
import H0.k;
import H0.v;
import K.X;
import M0.a;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0274n;
import l.C0282r;
import n0.AbstractC0303a;
import q1.d;
import t0.InterfaceC0343a;
import t0.b;
import t0.c;

/* loaded from: classes.dex */
public class MaterialButton extends C0282r implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1807r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1808s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f1809d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1810e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0343a f1811f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1812g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1813j;

    /* renamed from: k, reason: collision with root package name */
    public int f1814k;

    /* renamed from: l, reason: collision with root package name */
    public int f1815l;

    /* renamed from: m, reason: collision with root package name */
    public int f1816m;

    /* renamed from: n, reason: collision with root package name */
    public int f1817n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1818o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1819p;

    /* renamed from: q, reason: collision with root package name */
    public int f1820q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.fortuneink.neonpad.R.attr.materialButtonStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Button), attributeSet, com.fortuneink.neonpad.R.attr.materialButtonStyle);
        this.f1810e = new LinkedHashSet();
        this.f1818o = false;
        this.f1819p = false;
        Context context2 = getContext();
        TypedArray f2 = o.f(context2, attributeSet, AbstractC0303a.f3637j, com.fortuneink.neonpad.R.attr.materialButtonStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1817n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1812g = o.g(i, mode);
        this.h = d.y(getContext(), f2, 14);
        this.i = d.A(getContext(), f2, 10);
        this.f1820q = f2.getInteger(11, 1);
        this.f1814k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.fortuneink.neonpad.R.attr.materialButtonStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Button).a());
        this.f1809d = cVar;
        cVar.f4202c = f2.getDimensionPixelOffset(1, 0);
        cVar.f4203d = f2.getDimensionPixelOffset(2, 0);
        cVar.f4204e = f2.getDimensionPixelOffset(3, 0);
        cVar.f4205f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f4206g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = cVar.f4201b.e();
            e2.f298e = new H0.a(f3);
            e2.f299f = new H0.a(f3);
            e2.f300g = new H0.a(f3);
            e2.h = new H0.a(f3);
            cVar.c(e2.a());
            cVar.f4213p = true;
        }
        cVar.h = f2.getDimensionPixelSize(20, 0);
        cVar.i = o.g(f2.getInt(7, -1), mode);
        cVar.f4207j = d.y(getContext(), f2, 6);
        cVar.f4208k = d.y(getContext(), f2, 19);
        cVar.f4209l = d.y(getContext(), f2, 16);
        cVar.f4214q = f2.getBoolean(5, false);
        cVar.f4217t = f2.getDimensionPixelSize(9, 0);
        cVar.f4215r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = X.f418a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f4212o = true;
            setSupportBackgroundTintList(cVar.f4207j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f4202c, paddingTop + cVar.f4204e, paddingEnd + cVar.f4203d, paddingBottom + cVar.f4205f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1817n);
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
        c cVar = this.f1809d;
        return cVar != null && cVar.f4214q;
    }

    public final boolean b() {
        c cVar = this.f1809d;
        return (cVar == null || cVar.f4212o) ? false : true;
    }

    public final void c() {
        int i = this.f1820q;
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
            PorterDuff.Mode mode = this.f1812g;
            if (mode != null) {
                D.a.i(this.i, mode);
            }
            int i = this.f1814k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1814k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1815l;
            int i4 = this.f1816m;
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
        int i5 = this.f1820q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1820q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1815l = 0;
                if (i3 == 16) {
                    this.f1816m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f1814k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1817n) - getPaddingBottom()) / 2);
                if (this.f1816m != max) {
                    this.f1816m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1816m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1820q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1815l = 0;
            d(false);
            return;
        }
        int i6 = this.f1814k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = X.f418a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1817n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1820q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1815l != paddingEnd) {
            this.f1815l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1813j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1813j;
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
            return this.f1809d.f4206g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1820q;
    }

    public int getIconPadding() {
        return this.f1817n;
    }

    public int getIconSize() {
        return this.f1814k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1812g;
    }

    public int getInsetBottom() {
        return this.f1809d.f4205f;
    }

    public int getInsetTop() {
        return this.f1809d.f4204e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f1809d.f4209l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.f1809d.f4201b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f1809d.f4208k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f1809d.h;
        }
        return 0;
    }

    @Override // l.C0282r
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f1809d.f4207j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0282r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f1809d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1818o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            d.V(this, this.f1809d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1807r);
        }
        if (this.f1818o) {
            View.mergeDrawableStates(onCreateDrawableState, f1808s);
        }
        return onCreateDrawableState;
    }

    @Override // l.C0282r, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1818o);
    }

    @Override // l.C0282r, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1818o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0282r, android.widget.TextView, android.view.View
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
        super.onRestoreInstanceState(bVar.f735a);
        setChecked(bVar.f4199c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4199c = this.f1818o;
        return bVar;
    }

    @Override // l.C0282r, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f1809d.f4215r) {
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
        this.f1813j = str;
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
        c cVar = this.f1809d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // l.C0282r, android.view.View
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
        c cVar = this.f1809d;
        cVar.f4212o = true;
        ColorStateList colorStateList = cVar.f4207j;
        MaterialButton materialButton = cVar.f4200a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0282r, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d.z(getContext(), i) : null);
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
            this.f1809d.f4214q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1818o != z2) {
            this.f1818o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1818o;
                if (!materialButtonToggleGroup.f1827f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f1819p) {
                return;
            }
            this.f1819p = true;
            Iterator it = this.f1810e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1819p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.f1809d;
            if (cVar.f4213p && cVar.f4206g == i) {
                return;
            }
            cVar.f4206g = i;
            cVar.f4213p = true;
            float f2 = i;
            j e2 = cVar.f4201b.e();
            e2.f298e = new H0.a(f2);
            e2.f299f = new H0.a(f2);
            e2.f300g = new H0.a(f2);
            e2.h = new H0.a(f2);
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
            this.f1809d.b(false).i(f2);
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
        if (this.f1820q != i) {
            this.f1820q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1817n != i) {
            this.f1817n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? d.z(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1814k != i) {
            this.f1814k = i;
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
        if (this.f1812g != mode) {
            this.f1812g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d.w(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f1809d;
        cVar.d(cVar.f4204e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f1809d;
        cVar.d(i, cVar.f4205f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0343a interfaceC0343a) {
        this.f1811f = interfaceC0343a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0343a interfaceC0343a = this.f1811f;
        if (interfaceC0343a != null) {
            ((MaterialButtonToggleGroup) ((C0274n) interfaceC0343a).f3416a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f1809d;
            if (cVar.f4209l != colorStateList) {
                cVar.f4209l = colorStateList;
                MaterialButton materialButton = cVar.f4200a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(F0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(d.w(getContext(), i));
        }
    }

    @Override // H0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f1809d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.f1809d;
            cVar.f4211n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f1809d;
            if (cVar.f4208k != colorStateList) {
                cVar.f4208k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(d.w(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.f1809d;
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

    @Override // l.C0282r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f1809d;
        if (cVar.f4207j != colorStateList) {
            cVar.f4207j = colorStateList;
            if (cVar.b(false) != null) {
                D.a.h(cVar.b(false), cVar.f4207j);
            }
        }
    }

    @Override // l.C0282r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f1809d;
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
        this.f1809d.f4215r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1818o);
    }
}
