package com.google.android.material.button;

import D0.a;
import D0.b;
import D0.c;
import H1.d;
import H1.l;
import K.Q;
import L0.k;
import R0.j;
import R0.v;
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
import c1.AbstractC0091d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0254q;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class MaterialButton extends C0254q implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2197r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f2198s = {R.attr.state_checked};
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2199e;

    /* renamed from: f, reason: collision with root package name */
    public a f2200f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2201g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f2202j;

    /* renamed from: k, reason: collision with root package name */
    public int f2203k;

    /* renamed from: l, reason: collision with root package name */
    public int f2204l;

    /* renamed from: m, reason: collision with root package name */
    public int f2205m;

    /* renamed from: n, reason: collision with root package name */
    public int f2206n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2207o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2208p;

    /* renamed from: q, reason: collision with root package name */
    public int f2209q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(W0.a.a(context, attributeSet, com.fortunequest.neontrack.R.attr.materialButtonStyle, com.fortunequest.neontrack.R.style.Widget_MaterialComponents_Button), attributeSet, com.fortunequest.neontrack.R.attr.materialButtonStyle);
        this.f2199e = new LinkedHashSet();
        this.f2207o = false;
        this.f2208p = false;
        Context context2 = getContext();
        TypedArray f2 = k.f(context2, attributeSet, AbstractC0393a.f4549j, com.fortunequest.neontrack.R.attr.materialButtonStyle, com.fortunequest.neontrack.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2206n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2201g = k.g(i, mode);
        this.h = l.B(getContext(), f2, 14);
        this.i = l.F(getContext(), f2, 10);
        this.f2209q = f2.getInteger(11, 1);
        this.f2203k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, R0.k.b(context2, attributeSet, com.fortunequest.neontrack.R.attr.materialButtonStyle, com.fortunequest.neontrack.R.style.Widget_MaterialComponents_Button).a());
        this.d = cVar;
        cVar.f127c = f2.getDimensionPixelOffset(1, 0);
        cVar.d = f2.getDimensionPixelOffset(2, 0);
        cVar.f128e = f2.getDimensionPixelOffset(3, 0);
        cVar.f129f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f130g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = cVar.f126b.e();
            e2.f940e = new R0.a(f3);
            e2.f941f = new R0.a(f3);
            e2.f942g = new R0.a(f3);
            e2.h = new R0.a(f3);
            cVar.c(e2.a());
            cVar.f137p = true;
        }
        cVar.h = f2.getDimensionPixelSize(20, 0);
        cVar.i = k.g(f2.getInt(7, -1), mode);
        cVar.f131j = l.B(getContext(), f2, 6);
        cVar.f132k = l.B(getContext(), f2, 19);
        cVar.f133l = l.B(getContext(), f2, 16);
        cVar.f138q = f2.getBoolean(5, false);
        cVar.f141t = f2.getDimensionPixelSize(9, 0);
        cVar.f139r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = Q.f578a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f136o = true;
            setSupportBackgroundTintList(cVar.f131j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f127c, paddingTop + cVar.f128e, paddingEnd + cVar.d, paddingBottom + cVar.f129f);
        f2.recycle();
        setCompoundDrawablePadding(this.f2206n);
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
        float f2 = RecyclerView.f1937A0;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        c cVar = this.d;
        return cVar != null && cVar.f138q;
    }

    public final boolean b() {
        c cVar = this.d;
        return (cVar == null || cVar.f136o) ? false : true;
    }

    public final void c() {
        int i = this.f2209q;
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
            PorterDuff.Mode mode = this.f2201g;
            if (mode != null) {
                D.a.i(this.i, mode);
            }
            int i = this.f2203k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f2203k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f2204l;
            int i4 = this.f2205m;
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
        int i5 = this.f2209q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f2209q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f2204l = 0;
                if (i3 == 16) {
                    this.f2205m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f2203k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f2206n) - getPaddingBottom()) / 2);
                if (this.f2205m != max) {
                    this.f2205m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2205m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f2209q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2204l = 0;
            d(false);
            return;
        }
        int i6 = this.f2203k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = Q.f578a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f2206n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2209q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2204l != paddingEnd) {
            this.f2204l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f2202j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f2202j;
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
            return this.d.f130g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f2209q;
    }

    public int getIconPadding() {
        return this.f2206n;
    }

    public int getIconSize() {
        return this.f2203k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2201g;
    }

    public int getInsetBottom() {
        return this.d.f129f;
    }

    public int getInsetTop() {
        return this.d.f128e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f133l;
        }
        return null;
    }

    public R0.k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f126b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f132k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // l.C0254q
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.f131j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0254q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2207o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            l.f0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f2197r);
        }
        if (this.f2207o) {
            View.mergeDrawableStates(onCreateDrawableState, f2198s);
        }
        return onCreateDrawableState;
    }

    @Override // l.C0254q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2207o);
    }

    @Override // l.C0254q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f2207o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0254q, android.widget.TextView, android.view.View
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
        super.onRestoreInstanceState(bVar.f986a);
        setChecked(bVar.f124c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f124c = this.f2207o;
        return bVar;
    }

    @Override // l.C0254q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f139r) {
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
        this.f2202j = str;
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

    @Override // l.C0254q, android.view.View
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
        cVar.f136o = true;
        ColorStateList colorStateList = cVar.f131j;
        MaterialButton materialButton = cVar.f125a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0254q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0091d.j(getContext(), i) : null);
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
            this.d.f138q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f2207o != z2) {
            this.f2207o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2207o;
                if (!materialButtonToggleGroup.f2215f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f2208p) {
                return;
            }
            this.f2208p = true;
            Iterator it = this.f2199e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f2208p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f137p && cVar.f130g == i) {
                return;
            }
            cVar.f130g = i;
            cVar.f137p = true;
            float f2 = i;
            j e2 = cVar.f126b.e();
            e2.f940e = new R0.a(f2);
            e2.f941f = new R0.a(f2);
            e2.f942g = new R0.a(f2);
            e2.h = new R0.a(f2);
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
        if (this.f2209q != i) {
            this.f2209q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2206n != i) {
            this.f2206n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0091d.j(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2203k != i) {
            this.f2203k = i;
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
        if (this.f2201g != mode) {
            this.f2201g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d.z(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.d;
        cVar.d(cVar.f128e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.d;
        cVar.d(i, cVar.f129f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f2200f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f2200f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((A0.c) aVar).f6b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f133l != colorStateList) {
                cVar.f133l = colorStateList;
                MaterialButton materialButton = cVar.f125a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(P0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(d.z(getContext(), i));
        }
    }

    @Override // R0.v
    public void setShapeAppearanceModel(R0.k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.d;
            cVar.f135n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f132k != colorStateList) {
                cVar.f132k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(d.z(getContext(), i));
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

    @Override // l.C0254q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.d;
        if (cVar.f131j != colorStateList) {
            cVar.f131j = colorStateList;
            if (cVar.b(false) != null) {
                D.a.h(cVar.b(false), cVar.f131j);
            }
        }
    }

    @Override // l.C0254q
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
        this.d.f139r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2207o);
    }
}
