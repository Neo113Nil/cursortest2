package com.google.android.material.button;

import A1.d;
import A1.m;
import E0.n;
import K0.j;
import K0.k;
import K0.v;
import L.T;
import P0.a;
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
import androidx.recyclerview.widget.RecyclerView;
import h.AbstractC0112a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C0202a0;
import m.C0233q;
import q0.AbstractC0285a;
import w0.C0311b;
import w0.C0312c;
import w0.InterfaceC0310a;

/* loaded from: classes.dex */
public class MaterialButton extends C0233q implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1813r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1814s = {R.attr.state_checked};
    public final C0312c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1815e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0310a f1816f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1817g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f1818h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1819j;

    /* renamed from: k, reason: collision with root package name */
    public int f1820k;

    /* renamed from: l, reason: collision with root package name */
    public int f1821l;

    /* renamed from: m, reason: collision with root package name */
    public int f1822m;

    /* renamed from: n, reason: collision with root package name */
    public int f1823n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1824o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1825p;

    /* renamed from: q, reason: collision with root package name */
    public int f1826q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winfour.winrandom.R.attr.materialButtonStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_Button), attributeSet, com.winfour.winrandom.R.attr.materialButtonStyle);
        this.f1815e = new LinkedHashSet();
        this.f1824o = false;
        this.f1825p = false;
        Context context2 = getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0285a.f3507j, com.winfour.winrandom.R.attr.materialButtonStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1823n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1817g = n.g(i, mode);
        this.f1818h = d.D(getContext(), f2, 14);
        this.i = d.G(getContext(), f2, 10);
        this.f1826q = f2.getInteger(11, 1);
        this.f1820k = f2.getDimensionPixelSize(13, 0);
        C0312c c0312c = new C0312c(this, k.b(context2, attributeSet, com.winfour.winrandom.R.attr.materialButtonStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_Button).a());
        this.d = c0312c;
        c0312c.f4185c = f2.getDimensionPixelOffset(1, 0);
        c0312c.d = f2.getDimensionPixelOffset(2, 0);
        c0312c.f4186e = f2.getDimensionPixelOffset(3, 0);
        c0312c.f4187f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            c0312c.f4188g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = c0312c.f4184b.e();
            e2.f421e = new K0.a(f3);
            e2.f422f = new K0.a(f3);
            e2.f423g = new K0.a(f3);
            e2.f424h = new K0.a(f3);
            c0312c.c(e2.a());
            c0312c.f4196p = true;
        }
        c0312c.f4189h = f2.getDimensionPixelSize(20, 0);
        c0312c.i = n.g(f2.getInt(7, -1), mode);
        c0312c.f4190j = d.D(getContext(), f2, 6);
        c0312c.f4191k = d.D(getContext(), f2, 19);
        c0312c.f4192l = d.D(getContext(), f2, 16);
        c0312c.f4197q = f2.getBoolean(5, false);
        c0312c.f4200t = f2.getDimensionPixelSize(9, 0);
        c0312c.f4198r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = T.f490a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            c0312c.f4195o = true;
            setSupportBackgroundTintList(c0312c.f4190j);
            setSupportBackgroundTintMode(c0312c.i);
        } else {
            c0312c.e();
        }
        setPaddingRelative(paddingStart + c0312c.f4185c, paddingTop + c0312c.f4186e, paddingEnd + c0312c.d, paddingBottom + c0312c.f4187f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1823n);
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
        float f2 = RecyclerView.A0;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        C0312c c0312c = this.d;
        return c0312c != null && c0312c.f4197q;
    }

    public final boolean b() {
        C0312c c0312c = this.d;
        return (c0312c == null || c0312c.f4195o) ? false : true;
    }

    public final void c() {
        int i = this.f1826q;
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
            E.a.h(mutate, this.f1818h);
            PorterDuff.Mode mode = this.f1817g;
            if (mode != null) {
                E.a.i(this.i, mode);
            }
            int i = this.f1820k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1820k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1821l;
            int i4 = this.f1822m;
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
        int i5 = this.f1826q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1826q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1821l = 0;
                if (i3 == 16) {
                    this.f1822m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f1820k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1823n) - getPaddingBottom()) / 2);
                if (this.f1822m != max) {
                    this.f1822m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1822m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1826q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1821l = 0;
            d(false);
            return;
        }
        int i6 = this.f1820k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = T.f490a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1823n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1826q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1821l != paddingEnd) {
            this.f1821l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1819j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1819j;
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
            return this.d.f4188g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1826q;
    }

    public int getIconPadding() {
        return this.f1823n;
    }

    public int getIconSize() {
        return this.f1820k;
    }

    public ColorStateList getIconTint() {
        return this.f1818h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1817g;
    }

    public int getInsetBottom() {
        return this.d.f4187f;
    }

    public int getInsetTop() {
        return this.d.f4186e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f4192l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f4184b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f4191k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.f4189h;
        }
        return 0;
    }

    @Override // m.C0233q
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.f4190j : super.getSupportBackgroundTintList();
    }

    @Override // m.C0233q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1824o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            m.g0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1813r);
        }
        if (this.f1824o) {
            View.mergeDrawableStates(onCreateDrawableState, f1814s);
        }
        return onCreateDrawableState;
    }

    @Override // m.C0233q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1824o);
    }

    @Override // m.C0233q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1824o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.C0233q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0311b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0311b c0311b = (C0311b) parcelable;
        super.onRestoreInstanceState(c0311b.f826a);
        setChecked(c0311b.f4182c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0311b c0311b = new C0311b(super.onSaveInstanceState());
        c0311b.f4182c = this.f1824o;
        return c0311b;
    }

    @Override // m.C0233q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f4198r) {
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
        this.f1819j = str;
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
        C0312c c0312c = this.d;
        if (c0312c.b(false) != null) {
            c0312c.b(false).setTint(i);
        }
    }

    @Override // m.C0233q, android.view.View
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
        C0312c c0312c = this.d;
        c0312c.f4195o = true;
        ColorStateList colorStateList = c0312c.f4190j;
        MaterialButton materialButton = c0312c.f4183a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0312c.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.C0233q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0112a.l(getContext(), i) : null);
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
            this.d.f4197q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1824o != z2) {
            this.f1824o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1824o;
                if (!materialButtonToggleGroup.f1832f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f1825p) {
                return;
            }
            this.f1825p = true;
            Iterator it = this.f1815e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1825p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            C0312c c0312c = this.d;
            if (c0312c.f4196p && c0312c.f4188g == i) {
                return;
            }
            c0312c.f4188g = i;
            c0312c.f4196p = true;
            float f2 = i;
            j e2 = c0312c.f4184b.e();
            e2.f421e = new K0.a(f2);
            e2.f422f = new K0.a(f2);
            e2.f423g = new K0.a(f2);
            e2.f424h = new K0.a(f2);
            c0312c.c(e2.a());
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
        if (this.f1826q != i) {
            this.f1826q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1823n != i) {
            this.f1823n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0112a.l(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1820k != i) {
            this.f1820k = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1818h != colorStateList) {
            this.f1818h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1817g != mode) {
            this.f1817g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(m.s(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0312c c0312c = this.d;
        c0312c.d(c0312c.f4186e, i);
    }

    public void setInsetTop(int i) {
        C0312c c0312c = this.d;
        c0312c.d(i, c0312c.f4187f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0310a interfaceC0310a) {
        this.f1816f = interfaceC0310a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0310a interfaceC0310a = this.f1816f;
        if (interfaceC0310a != null) {
            ((MaterialButtonToggleGroup) ((C0202a0) interfaceC0310a).f3068a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            C0312c c0312c = this.d;
            if (c0312c.f4192l != colorStateList) {
                c0312c.f4192l = colorStateList;
                MaterialButton materialButton = c0312c.f4183a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(I0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(m.s(getContext(), i));
        }
    }

    @Override // K0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            C0312c c0312c = this.d;
            c0312c.f4194n = z2;
            c0312c.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            C0312c c0312c = this.d;
            if (c0312c.f4191k != colorStateList) {
                c0312c.f4191k = colorStateList;
                c0312c.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(m.s(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            C0312c c0312c = this.d;
            if (c0312c.f4189h != i) {
                c0312c.f4189h = i;
                c0312c.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // m.C0233q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0312c c0312c = this.d;
        if (c0312c.f4190j != colorStateList) {
            c0312c.f4190j = colorStateList;
            if (c0312c.b(false) != null) {
                E.a.h(c0312c.b(false), c0312c.f4190j);
            }
        }
    }

    @Override // m.C0233q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0312c c0312c = this.d;
        if (c0312c.i != mode) {
            c0312c.i = mode;
            if (c0312c.b(false) == null || c0312c.i == null) {
                return;
            }
            E.a.i(c0312c.b(false), c0312c.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.d.f4198r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1824o);
    }
}
