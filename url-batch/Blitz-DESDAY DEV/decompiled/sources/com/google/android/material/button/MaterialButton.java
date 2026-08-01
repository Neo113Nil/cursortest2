package com.google.android.material.button;

import F0.m;
import L0.j;
import L0.k;
import L0.v;
import M.Q;
import Q0.a;
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
import l.C0176a0;
import l.C0207q;
import q0.AbstractC0257a;
import w0.C0296b;
import w0.C0297c;
import w0.InterfaceC0295a;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public class MaterialButton extends C0207q implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1796r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1797s = {R.attr.state_checked};
    public final C0297c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1798e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0295a f1799f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1800g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1801j;

    /* renamed from: k, reason: collision with root package name */
    public int f1802k;

    /* renamed from: l, reason: collision with root package name */
    public int f1803l;

    /* renamed from: m, reason: collision with root package name */
    public int f1804m;

    /* renamed from: n, reason: collision with root package name */
    public int f1805n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1806o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1807p;

    /* renamed from: q, reason: collision with root package name */
    public int f1808q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winfour.neondrop.R.attr.materialButtonStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Button), attributeSet, com.winfour.neondrop.R.attr.materialButtonStyle);
        this.f1798e = new LinkedHashSet();
        this.f1806o = false;
        this.f1807p = false;
        Context context2 = getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0257a.f3387k, com.winfour.neondrop.R.attr.materialButtonStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1805n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1800g = m.g(i, mode);
        this.h = d.v(getContext(), f2, 14);
        this.i = d.y(getContext(), f2, 10);
        this.f1808q = f2.getInteger(11, 1);
        this.f1802k = f2.getDimensionPixelSize(13, 0);
        C0297c c0297c = new C0297c(this, k.b(context2, attributeSet, com.winfour.neondrop.R.attr.materialButtonStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Button).a());
        this.d = c0297c;
        c0297c.f3919c = f2.getDimensionPixelOffset(1, 0);
        c0297c.d = f2.getDimensionPixelOffset(2, 0);
        c0297c.f3920e = f2.getDimensionPixelOffset(3, 0);
        c0297c.f3921f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            c0297c.f3922g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = c0297c.f3918b.e();
            e2.f456e = new L0.a(f3);
            e2.f457f = new L0.a(f3);
            e2.f458g = new L0.a(f3);
            e2.h = new L0.a(f3);
            c0297c.c(e2.a());
            c0297c.f3929p = true;
        }
        c0297c.h = f2.getDimensionPixelSize(20, 0);
        c0297c.i = m.g(f2.getInt(7, -1), mode);
        c0297c.f3923j = d.v(getContext(), f2, 6);
        c0297c.f3924k = d.v(getContext(), f2, 19);
        c0297c.f3925l = d.v(getContext(), f2, 16);
        c0297c.f3930q = f2.getBoolean(5, false);
        c0297c.f3933t = f2.getDimensionPixelSize(9, 0);
        c0297c.f3931r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = Q.f513a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            c0297c.f3928o = true;
            setSupportBackgroundTintList(c0297c.f3923j);
            setSupportBackgroundTintMode(c0297c.i);
        } else {
            c0297c.e();
        }
        setPaddingRelative(paddingStart + c0297c.f3919c, paddingTop + c0297c.f3920e, paddingEnd + c0297c.d, paddingBottom + c0297c.f3921f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1805n);
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
        C0297c c0297c = this.d;
        return c0297c != null && c0297c.f3930q;
    }

    public final boolean b() {
        C0297c c0297c = this.d;
        return (c0297c == null || c0297c.f3928o) ? false : true;
    }

    public final void c() {
        int i = this.f1808q;
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
            F.a.h(mutate, this.h);
            PorterDuff.Mode mode = this.f1800g;
            if (mode != null) {
                F.a.i(this.i, mode);
            }
            int i = this.f1802k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1802k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1803l;
            int i4 = this.f1804m;
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
        int i5 = this.f1808q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1808q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1803l = 0;
                if (i3 == 16) {
                    this.f1804m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f1802k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1805n) - getPaddingBottom()) / 2);
                if (this.f1804m != max) {
                    this.f1804m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1804m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1808q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1803l = 0;
            d(false);
            return;
        }
        int i6 = this.f1802k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = Q.f513a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1805n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1808q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1803l != paddingEnd) {
            this.f1803l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1801j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1801j;
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
            return this.d.f3922g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1808q;
    }

    public int getIconPadding() {
        return this.f1805n;
    }

    public int getIconSize() {
        return this.f1802k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1800g;
    }

    public int getInsetBottom() {
        return this.d.f3921f;
    }

    public int getInsetTop() {
        return this.d.f3920e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f3925l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f3918b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f3924k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // l.C0207q
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.f3923j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0207q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1806o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            l.s0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1796r);
        }
        if (this.f1806o) {
            View.mergeDrawableStates(onCreateDrawableState, f1797s);
        }
        return onCreateDrawableState;
    }

    @Override // l.C0207q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1806o);
    }

    @Override // l.C0207q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1806o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0207q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0296b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0296b c0296b = (C0296b) parcelable;
        super.onRestoreInstanceState(c0296b.f802a);
        setChecked(c0296b.f3916c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0296b c0296b = new C0296b(super.onSaveInstanceState());
        c0296b.f3916c = this.f1806o;
        return c0296b;
    }

    @Override // l.C0207q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f3931r) {
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
        this.f1801j = str;
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
        C0297c c0297c = this.d;
        if (c0297c.b(false) != null) {
            c0297c.b(false).setTint(i);
        }
    }

    @Override // l.C0207q, android.view.View
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
        C0297c c0297c = this.d;
        c0297c.f3928o = true;
        ColorStateList colorStateList = c0297c.f3923j;
        MaterialButton materialButton = c0297c.f3917a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0297c.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0207q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? l.F(getContext(), i) : null);
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
            this.d.f3930q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1806o != z2) {
            this.f1806o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1806o;
                if (!materialButtonToggleGroup.f1814f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f1807p) {
                return;
            }
            this.f1807p = true;
            Iterator it = this.f1798e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1807p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            C0297c c0297c = this.d;
            if (c0297c.f3929p && c0297c.f3922g == i) {
                return;
            }
            c0297c.f3922g = i;
            c0297c.f3929p = true;
            float f2 = i;
            j e2 = c0297c.f3918b.e();
            e2.f456e = new L0.a(f2);
            e2.f457f = new L0.a(f2);
            e2.f458g = new L0.a(f2);
            e2.h = new L0.a(f2);
            c0297c.c(e2.a());
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
            this.d.b(false).k(f2);
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
        if (this.f1808q != i) {
            this.f1808q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1805n != i) {
            this.f1805n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? l.F(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1802k != i) {
            this.f1802k = i;
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
        if (this.f1800g != mode) {
            this.f1800g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(l.D(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0297c c0297c = this.d;
        c0297c.d(c0297c.f3920e, i);
    }

    public void setInsetTop(int i) {
        C0297c c0297c = this.d;
        c0297c.d(i, c0297c.f3921f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0295a interfaceC0295a) {
        this.f1799f = interfaceC0295a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0295a interfaceC0295a = this.f1799f;
        if (interfaceC0295a != null) {
            ((MaterialButtonToggleGroup) ((C0176a0) interfaceC0295a).f2962a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            C0297c c0297c = this.d;
            if (c0297c.f3925l != colorStateList) {
                c0297c.f3925l = colorStateList;
                MaterialButton materialButton = c0297c.f3917a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(J0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(l.D(getContext(), i));
        }
    }

    @Override // L0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            C0297c c0297c = this.d;
            c0297c.f3927n = z2;
            c0297c.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            C0297c c0297c = this.d;
            if (c0297c.f3924k != colorStateList) {
                c0297c.f3924k = colorStateList;
                c0297c.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(l.D(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            C0297c c0297c = this.d;
            if (c0297c.h != i) {
                c0297c.h = i;
                c0297c.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.C0207q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0297c c0297c = this.d;
        if (c0297c.f3923j != colorStateList) {
            c0297c.f3923j = colorStateList;
            if (c0297c.b(false) != null) {
                F.a.h(c0297c.b(false), c0297c.f3923j);
            }
        }
    }

    @Override // l.C0207q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0297c c0297c = this.d;
        if (c0297c.i != mode) {
            c0297c.i = mode;
            if (c0297c.b(false) == null || c0297c.i == null) {
                return;
            }
            F.a.i(c0297c.b(false), c0297c.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.d.f3931r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1806o);
    }
}
