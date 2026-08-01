package com.google.android.material.button;

import H0.m;
import H1.d;
import H1.l;
import M.P;
import N0.j;
import N0.k;
import N0.v;
import S0.a;
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
import n.C0288n;
import n.C0296r;
import t0.AbstractC0383a;
import z0.InterfaceC0434a;
import z0.b;
import z0.c;

/* loaded from: classes.dex */
public class MaterialButton extends C0296r implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2310r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f2311s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f2312d;
    public final LinkedHashSet e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0434a f2313f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2314g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f2315h;
    public Drawable i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f2316k;

    /* renamed from: l, reason: collision with root package name */
    public int f2317l;

    /* renamed from: m, reason: collision with root package name */
    public int f2318m;

    /* renamed from: n, reason: collision with root package name */
    public int f2319n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2320o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2321p;

    /* renamed from: q, reason: collision with root package name */
    public int f2322q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winpower.neonfit.R.attr.materialButtonStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_Button), attributeSet, com.winpower.neonfit.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.f2320o = false;
        this.f2321p = false;
        Context context2 = getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0383a.j, com.winpower.neonfit.R.attr.materialButtonStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2319n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2314g = m.g(i, mode);
        this.f2315h = d.C(getContext(), f2, 14);
        this.i = d.G(getContext(), f2, 10);
        this.f2322q = f2.getInteger(11, 1);
        this.f2316k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.winpower.neonfit.R.attr.materialButtonStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_Button).a());
        this.f2312d = cVar;
        cVar.f4787c = f2.getDimensionPixelOffset(1, 0);
        cVar.f4788d = f2.getDimensionPixelOffset(2, 0);
        cVar.e = f2.getDimensionPixelOffset(3, 0);
        cVar.f4789f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f4790g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e = cVar.f4786b.e();
            e.e = new N0.a(f3);
            e.f924f = new N0.a(f3);
            e.f925g = new N0.a(f3);
            e.f926h = new N0.a(f3);
            cVar.c(e.a());
            cVar.f4797p = true;
        }
        cVar.f4791h = f2.getDimensionPixelSize(20, 0);
        cVar.i = m.g(f2.getInt(7, -1), mode);
        cVar.j = d.C(getContext(), f2, 6);
        cVar.f4792k = d.C(getContext(), f2, 19);
        cVar.f4793l = d.C(getContext(), f2, 16);
        cVar.f4798q = f2.getBoolean(5, false);
        cVar.f4801t = f2.getDimensionPixelSize(9, 0);
        cVar.f4799r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = P.f711a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f4796o = true;
            setSupportBackgroundTintList(cVar.j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f4787c, paddingTop + cVar.e, paddingEnd + cVar.f4788d, paddingBottom + cVar.f4789f);
        f2.recycle();
        setCompoundDrawablePadding(this.f2319n);
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
        c cVar = this.f2312d;
        return cVar != null && cVar.f4798q;
    }

    public final boolean b() {
        c cVar = this.f2312d;
        return (cVar == null || cVar.f4796o) ? false : true;
    }

    public final void c() {
        int i = this.f2322q;
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
            F.a.h(mutate, this.f2315h);
            PorterDuff.Mode mode = this.f2314g;
            if (mode != null) {
                F.a.i(this.i, mode);
            }
            int i = this.f2316k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f2316k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f2317l;
            int i4 = this.f2318m;
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
        int i5 = this.f2322q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f2322q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f2317l = 0;
                if (i3 == 16) {
                    this.f2318m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f2316k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f2319n) - getPaddingBottom()) / 2);
                if (this.f2318m != max) {
                    this.f2318m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2318m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f2322q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2317l = 0;
            d(false);
            return;
        }
        int i6 = this.f2316k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = P.f711a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f2319n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2322q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2317l != paddingEnd) {
            this.f2317l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.j;
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
            return this.f2312d.f4790g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f2322q;
    }

    public int getIconPadding() {
        return this.f2319n;
    }

    public int getIconSize() {
        return this.f2316k;
    }

    public ColorStateList getIconTint() {
        return this.f2315h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2314g;
    }

    public int getInsetBottom() {
        return this.f2312d.f4789f;
    }

    public int getInsetTop() {
        return this.f2312d.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f2312d.f4793l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.f2312d.f4786b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f2312d.f4792k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f2312d.f4791h;
        }
        return 0;
    }

    @Override // n.C0296r
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f2312d.j : super.getSupportBackgroundTintList();
    }

    @Override // n.C0296r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f2312d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2320o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            l.c0(this, this.f2312d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f2310r);
        }
        if (this.f2320o) {
            View.mergeDrawableStates(onCreateDrawableState, f2311s);
        }
        return onCreateDrawableState;
    }

    @Override // n.C0296r, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2320o);
    }

    @Override // n.C0296r, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f2320o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // n.C0296r, android.widget.TextView, android.view.View
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
        super.onRestoreInstanceState(bVar.f1148a);
        setChecked(bVar.f4784c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4784c = this.f2320o;
        return bVar;
    }

    @Override // n.C0296r, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2312d.f4799r) {
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
        this.j = str;
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
        c cVar = this.f2312d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // n.C0296r, android.view.View
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
        c cVar = this.f2312d;
        cVar.f4796o = true;
        ColorStateList colorStateList = cVar.j;
        MaterialButton materialButton = cVar.f4785a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // n.C0296r, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d.F(getContext(), i) : null);
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
            this.f2312d.f4798q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f2320o != z2) {
            this.f2320o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2320o;
                if (!materialButtonToggleGroup.f2328f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f2321p) {
                return;
            }
            this.f2321p = true;
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f2321p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.f2312d;
            if (cVar.f4797p && cVar.f4790g == i) {
                return;
            }
            cVar.f4790g = i;
            cVar.f4797p = true;
            float f2 = i;
            j e = cVar.f4786b.e();
            e.e = new N0.a(f2);
            e.f924f = new N0.a(f2);
            e.f925g = new N0.a(f2);
            e.f926h = new N0.a(f2);
            cVar.c(e.a());
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
            this.f2312d.b(false).i(f2);
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
        if (this.f2322q != i) {
            this.f2322q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2319n != i) {
            this.f2319n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? d.F(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2316k != i) {
            this.f2316k = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2315h != colorStateList) {
            this.f2315h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2314g != mode) {
            this.f2314g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(l.v(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f2312d;
        cVar.d(cVar.e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f2312d;
        cVar.d(i, cVar.f4789f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0434a interfaceC0434a) {
        this.f2313f = interfaceC0434a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0434a interfaceC0434a = this.f2313f;
        if (interfaceC0434a != null) {
            ((MaterialButtonToggleGroup) ((C0288n) interfaceC0434a).f3677b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f2312d;
            if (cVar.f4793l != colorStateList) {
                cVar.f4793l = colorStateList;
                MaterialButton materialButton = cVar.f4785a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(L0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(l.v(getContext(), i));
        }
    }

    @Override // N0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2312d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.f2312d;
            cVar.f4795n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f2312d;
            if (cVar.f4792k != colorStateList) {
                cVar.f4792k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(l.v(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.f2312d;
            if (cVar.f4791h != i) {
                cVar.f4791h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // n.C0296r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f2312d;
        if (cVar.j != colorStateList) {
            cVar.j = colorStateList;
            if (cVar.b(false) != null) {
                F.a.h(cVar.b(false), cVar.j);
            }
        }
    }

    @Override // n.C0296r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f2312d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            F.a.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2312d.f4799r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2320o);
    }
}
