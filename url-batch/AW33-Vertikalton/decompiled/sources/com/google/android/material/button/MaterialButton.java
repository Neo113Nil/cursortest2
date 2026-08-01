package com.google.android.material.button;

import B0.o;
import H0.j;
import H0.k;
import H0.v;
import K.T;
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
import l.C0242k;
import l.C0256r;
import n0.AbstractC0278a;
import q1.d;
import q1.l;
import t0.InterfaceC0316a;
import t0.b;
import t0.c;

/* loaded from: classes.dex */
public class MaterialButton extends C0256r implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1589r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1590s = {R.attr.state_checked};
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1591e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0316a f1592f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1593g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1594j;

    /* renamed from: k, reason: collision with root package name */
    public int f1595k;

    /* renamed from: l, reason: collision with root package name */
    public int f1596l;

    /* renamed from: m, reason: collision with root package name */
    public int f1597m;

    /* renamed from: n, reason: collision with root package name */
    public int f1598n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1599o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1600p;

    /* renamed from: q, reason: collision with root package name */
    public int f1601q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.luckycalc.loanfinance.R.attr.materialButtonStyle, com.luckycalc.loanfinance.R.style.Widget_MaterialComponents_Button), attributeSet, com.luckycalc.loanfinance.R.attr.materialButtonStyle);
        this.f1591e = new LinkedHashSet();
        this.f1599o = false;
        this.f1600p = false;
        Context context2 = getContext();
        TypedArray f2 = o.f(context2, attributeSet, AbstractC0278a.f3284j, com.luckycalc.loanfinance.R.attr.materialButtonStyle, com.luckycalc.loanfinance.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1598n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1593g = o.g(i, mode);
        this.h = d.A(getContext(), f2, 14);
        this.i = d.D(getContext(), f2, 10);
        this.f1601q = f2.getInteger(11, 1);
        this.f1595k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.luckycalc.loanfinance.R.attr.materialButtonStyle, com.luckycalc.loanfinance.R.style.Widget_MaterialComponents_Button).a());
        this.d = cVar;
        cVar.f3800c = f2.getDimensionPixelOffset(1, 0);
        cVar.d = f2.getDimensionPixelOffset(2, 0);
        cVar.f3801e = f2.getDimensionPixelOffset(3, 0);
        cVar.f3802f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f3803g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = cVar.f3799b.e();
            e2.f279e = new H0.a(f3);
            e2.f280f = new H0.a(f3);
            e2.f281g = new H0.a(f3);
            e2.h = new H0.a(f3);
            cVar.c(e2.a());
            cVar.f3810p = true;
        }
        cVar.h = f2.getDimensionPixelSize(20, 0);
        cVar.i = o.g(f2.getInt(7, -1), mode);
        cVar.f3804j = d.A(getContext(), f2, 6);
        cVar.f3805k = d.A(getContext(), f2, 19);
        cVar.f3806l = d.A(getContext(), f2, 16);
        cVar.f3811q = f2.getBoolean(5, false);
        cVar.f3814t = f2.getDimensionPixelSize(9, 0);
        cVar.f3812r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = T.f381a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f3809o = true;
            setSupportBackgroundTintList(cVar.f3804j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f3800c, paddingTop + cVar.f3801e, paddingEnd + cVar.d, paddingBottom + cVar.f3802f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1598n);
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
        return cVar != null && cVar.f3811q;
    }

    public final boolean b() {
        c cVar = this.d;
        return (cVar == null || cVar.f3809o) ? false : true;
    }

    public final void c() {
        int i = this.f1601q;
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
            PorterDuff.Mode mode = this.f1593g;
            if (mode != null) {
                D.a.i(this.i, mode);
            }
            int i = this.f1595k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1595k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1596l;
            int i4 = this.f1597m;
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
        int i5 = this.f1601q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1601q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1596l = 0;
                if (i3 == 16) {
                    this.f1597m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f1595k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1598n) - getPaddingBottom()) / 2);
                if (this.f1597m != max) {
                    this.f1597m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1597m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1601q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1596l = 0;
            d(false);
            return;
        }
        int i6 = this.f1595k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = T.f381a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1598n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1601q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1596l != paddingEnd) {
            this.f1596l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1594j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1594j;
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
            return this.d.f3803g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1601q;
    }

    public int getIconPadding() {
        return this.f1598n;
    }

    public int getIconSize() {
        return this.f1595k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1593g;
    }

    public int getInsetBottom() {
        return this.d.f3802f;
    }

    public int getInsetTop() {
        return this.d.f3801e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f3806l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f3799b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f3805k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // l.C0256r
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.f3804j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0256r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1599o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            l.Z(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1589r);
        }
        if (this.f1599o) {
            View.mergeDrawableStates(onCreateDrawableState, f1590s);
        }
        return onCreateDrawableState;
    }

    @Override // l.C0256r, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1599o);
    }

    @Override // l.C0256r, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1599o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0256r, android.widget.TextView, android.view.View
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
        super.onRestoreInstanceState(bVar.f668a);
        setChecked(bVar.f3797c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3797c = this.f1599o;
        return bVar;
    }

    @Override // l.C0256r, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f3812r) {
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
        this.f1594j = str;
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

    @Override // l.C0256r, android.view.View
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
        cVar.f3809o = true;
        ColorStateList colorStateList = cVar.f3804j;
        MaterialButton materialButton = cVar.f3798a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0256r, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? l.v(getContext(), i) : null);
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
            this.d.f3811q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1599o != z2) {
            this.f1599o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1599o;
                if (!materialButtonToggleGroup.f1607f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f1600p) {
                return;
            }
            this.f1600p = true;
            Iterator it = this.f1591e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1600p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f3810p && cVar.f3803g == i) {
                return;
            }
            cVar.f3803g = i;
            cVar.f3810p = true;
            float f2 = i;
            j e2 = cVar.f3799b.e();
            e2.f279e = new H0.a(f2);
            e2.f280f = new H0.a(f2);
            e2.f281g = new H0.a(f2);
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
        if (this.f1601q != i) {
            this.f1601q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1598n != i) {
            this.f1598n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? l.v(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1595k != i) {
            this.f1595k = i;
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
        if (this.f1593g != mode) {
            this.f1593g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d.y(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.d;
        cVar.d(cVar.f3801e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.d;
        cVar.d(i, cVar.f3802f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0316a interfaceC0316a) {
        this.f1592f = interfaceC0316a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0316a interfaceC0316a = this.f1592f;
        if (interfaceC0316a != null) {
            ((MaterialButtonToggleGroup) ((C0242k) interfaceC0316a).f3003a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f3806l != colorStateList) {
                cVar.f3806l = colorStateList;
                MaterialButton materialButton = cVar.f3798a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(F0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(d.y(getContext(), i));
        }
    }

    @Override // H0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.d;
            cVar.f3808n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f3805k != colorStateList) {
                cVar.f3805k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(d.y(getContext(), i));
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

    @Override // l.C0256r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.d;
        if (cVar.f3804j != colorStateList) {
            cVar.f3804j = colorStateList;
            if (cVar.b(false) != null) {
                D.a.h(cVar.b(false), cVar.f3804j);
            }
        }
    }

    @Override // l.C0256r
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
        this.d.f3812r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1599o);
    }
}
