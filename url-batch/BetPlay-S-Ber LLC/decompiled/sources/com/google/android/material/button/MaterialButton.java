package com.google.android.material.button;

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
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c10;
import defpackage.c4;
import defpackage.g40;
import defpackage.h40;
import defpackage.i40;
import defpackage.j1;
import defpackage.j8;
import defpackage.l20;
import defpackage.l70;
import defpackage.ly;
import defpackage.ms;
import defpackage.n20;
import defpackage.ns;
import defpackage.o8;
import defpackage.op;
import defpackage.os;
import defpackage.ps;
import defpackage.q1;
import defpackage.qs;
import defpackage.rs;
import defpackage.rt;
import defpackage.u3;
import defpackage.u30;
import defpackage.u40;
import defpackage.us;
import defpackage.v30;
import defpackage.vs;
import defpackage.vw;
import defpackage.y20;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class MaterialButton extends u3 implements Checkable, y20 {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final os U = new os();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public int F;
    public int G;
    public LinearLayout.LayoutParams H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public i40 M;
    public int N;
    public rs O;
    public float P;
    public float Q;
    public u30 R;
    public final vs i;
    public final LinkedHashSet j;
    public ps k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public Drawable n;
    public PorterDuff.Mode o;
    public ColorStateList p;
    public Drawable q;
    public boolean r;
    public String s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(op.Y(com.awerser.monnit.betplay.R.attr.materialButtonStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.awerser.monnit.betplay.R.attr.materialSizeOverlay}), attributeSet, com.awerser.monnit.betplay.R.attr.materialButtonStyle);
        this.j = new LinkedHashSet();
        this.z = false;
        this.A = false;
        this.D = Integer.MIN_VALUE;
        this.E = -2.1474836E9f;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.O = rs.i;
        Context context2 = getContext();
        TypedArray Z = vw.Z(context2, attributeSet, ly.o, com.awerser.monnit.betplay.R.attr.materialButtonStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.w = Z.getDimensionPixelSize(13, 0);
        int i = Z.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.l = l70.H(i, mode);
        this.m = op.x(getContext(), Z, 15);
        this.n = op.A(getContext(), Z, 11);
        this.B = Z.getInteger(12, 1);
        this.t = Z.getDimensionPixelSize(14, 0);
        this.o = l70.H(Z.getInt(22, -1), mode);
        this.p = Z.hasValue(21) ? op.x(getContext(), Z, 21) : this.m;
        this.C = Z.getInteger(20, 3);
        Drawable A = op.A(getContext(), Z, 19);
        this.q = A;
        this.r = A == null;
        l20 h = g40.h(context2, Z, 23);
        h = h == null ? n20.g(context2, attributeSet, com.awerser.monnit.betplay.R.attr.materialButtonStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Button).a() : h;
        boolean z = Z.getBoolean(17, false);
        vs vsVar = new vs(this, h);
        this.i = vsVar;
        vsVar.e = Z.getDimensionPixelOffset(2, 0);
        vsVar.f = Z.getDimensionPixelOffset(3, 0);
        vsVar.g = Z.getDimensionPixelOffset(4, 0);
        vsVar.h = Z.getDimensionPixelOffset(5, 0);
        if (Z.hasValue(9)) {
            int dimensionPixelSize = Z.getDimensionPixelSize(9, -1);
            vsVar.i = dimensionPixelSize;
            vsVar.b = vsVar.b.a(dimensionPixelSize);
            vsVar.d();
            vsVar.r = true;
        }
        vsVar.j = Z.getDimensionPixelSize(26, 0);
        vsVar.k = l70.H(Z.getInt(8, -1), mode);
        vsVar.l = op.x(getContext(), Z, 7);
        vsVar.m = op.x(getContext(), Z, 25);
        vsVar.n = op.x(getContext(), Z, 18);
        vsVar.s = Z.getBoolean(6, false);
        vsVar.v = Z.getDimensionPixelSize(10, 0);
        vsVar.t = Z.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (Z.hasValue(0)) {
            vsVar.q = true;
            setSupportBackgroundTintList(vsVar.l);
            setSupportBackgroundTintMode(vsVar.k);
        } else {
            vsVar.c();
        }
        setPaddingRelative(paddingStart + vsVar.e, paddingTop + vsVar.g, paddingEnd + vsVar.f, paddingBottom + vsVar.h);
        setCheckedInternal(Z.getBoolean(1, false));
        if (h instanceof g40) {
            vsVar.c = vw.f0(getContext());
            if (vsVar.b instanceof g40) {
                vsVar.d();
            }
        }
        setOpticalCenterEnabled(z);
        Z.recycle();
        setCompoundDrawablePadding(this.w);
        t(this.n != null);
        w(this.q != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.J = materialButton.getOpticalCenterShift();
        materialButton.v();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.P;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        rt a;
        if (this.I && this.K && (a = this.i.a(false)) != null) {
            return (int) (a.h() * 0.11f);
        }
        return 0;
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
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        if (!j() || this.z == z) {
            return;
        }
        this.z = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.z;
            if (!materialButtonToggleGroup.s) {
                materialButtonToggleGroup.l(getId(), z2);
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            this.A = false;
        } else {
            it.next().getClass();
            o8.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.P != f) {
            this.P = f;
            v();
            invalidate();
            if (getParent() instanceof us) {
                us usVar = (us) getParent();
                int i = (int) this.P;
                int indexOfChild = usVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                MaterialButton h = usVar.h(indexOfChild);
                MaterialButton g = usVar.g(indexOfChild);
                if (h == null && g == null) {
                    return;
                }
                if (h == null) {
                    g.setDisplayedWidthDecrease(i);
                }
                if (g == null) {
                    h.setDisplayedWidthDecrease(i);
                }
                if (h == null || g == null) {
                    return;
                }
                h.setDisplayedWidthDecrease(i / 2);
                g.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (l() && o()) {
            return true;
        }
        if (k() && n()) {
            return true;
        }
        return m() && p();
    }

    public final boolean e(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final int f(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.n;
        if (drawable != null) {
            i3 = this.t;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            i4 = this.t;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.w) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int g(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.w) - getPaddingBottom()) / 2);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.s)) {
            return (j() ? CompoundButton.class : Button.class).getName();
        }
        return this.s;
    }

    public int getAllowedWidthDecrease() {
        return this.L;
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
        if (q()) {
            return this.i.i;
        }
        return 0;
    }

    public v30 getCornerSpringForce() {
        return this.i.c;
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.w;
    }

    public int getIconSize() {
        return this.t;
    }

    public ColorStateList getIconTint() {
        return this.m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.l;
    }

    public int getInsetBottom() {
        return this.i.h;
    }

    public int getInsetLeft() {
        return this.i.e;
    }

    public int getInsetRight() {
        return this.i.f;
    }

    public int getInsetTop() {
        return this.i.g;
    }

    public ColorStateList getRippleColor() {
        if (q()) {
            return this.i.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.q;
    }

    public int getSecondaryIconGravity() {
        return this.C;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.p;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.o;
    }

    public l20 getShapeAppearance() {
        if (q()) {
            return this.i.b;
        }
        o8.t("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public n20 getShapeAppearanceModel() {
        if (q()) {
            return this.i.b.d();
        }
        o8.t("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (q()) {
            return this.i.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (q()) {
            return this.i.j;
        }
        return 0;
    }

    @Override // defpackage.u3
    public ColorStateList getSupportBackgroundTintList() {
        return q() ? this.i.l : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.u3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return q() ? this.i.k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.q == null || !o()) {
                return null;
            }
            return this.q;
        }
        if (i == 1) {
            if (this.q == null || !p()) {
                return null;
            }
            return this.q;
        }
        if (i == 2 && this.q != null && n()) {
            return this.q;
        }
        return null;
    }

    public final Drawable i(int i) {
        if (i == 0) {
            if (this.n == null || !l()) {
                return null;
            }
            return this.n;
        }
        if (i == 1) {
            if (this.n == null || !k()) {
                return null;
            }
            return this.n;
        }
        if (i == 2 && this.n != null && k()) {
            return this.n;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    public final boolean j() {
        vs vsVar = this.i;
        return vsVar != null && vsVar.s;
    }

    public final boolean k() {
        int i = this.B;
        return i == 3 || i == 4;
    }

    public final boolean l() {
        int i = this.B;
        return i == 1 || i == 2;
    }

    public final boolean m() {
        int i = this.B;
        return i == 16 || i == 32;
    }

    public final boolean n() {
        int i = this.C;
        return i == 3 || i == 4;
    }

    public final boolean o() {
        int i = this.C;
        return i == 1 || i == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q()) {
            vw.j0(this, this.i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        if (this.z) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.u3, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.z);
    }

    @Override // defpackage.u3, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.u3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.D != i6) {
            this.D = i6;
            this.E = -2.1474836E9f;
        }
        if (this.E == -2.1474836E9f) {
            this.E = getMeasuredWidth();
            if (this.H == null && (getParent() instanceof us) && ((us) getParent()).getButtonSizeChange() != null) {
                this.H = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.H);
                layoutParams.width = (int) this.E;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.L == Integer.MIN_VALUE) {
            if (this.n == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.t;
                if (i7 == 0) {
                    i7 = this.n.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.L = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.F == Integer.MIN_VALUE) {
            this.F = getPaddingStart();
        }
        if (this.G == Integer.MIN_VALUE) {
            this.G = getPaddingEnd();
        }
        if ((getParent() instanceof us) && ((us) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.K = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qs qsVar = (qs) parcelable;
        super.onRestoreInstanceState(qsVar.getSuperState());
        setChecked(qsVar.f);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        qs qsVar = new qs(super.onSaveInstanceState());
        qsVar.f = this.z;
        return qsVar;
    }

    @Override // defpackage.u3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i = this.C;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.i.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public final boolean q() {
        vs vsVar = this.i;
        return (vsVar == null || vsVar.q) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r4 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z) {
        int i;
        if (this.M == null) {
            return;
        }
        if (this.R == null) {
            u30 u30Var = new u30(this, U);
            this.R = u30Var;
            u30Var.j = vw.f0(getContext());
        }
        if (this.K) {
            int ordinal = this.O.ordinal();
            int i2 = 0;
            int i3 = (ordinal == 1 || ordinal == 2) ? this.N / 2 : ordinal != 3 ? 0 : this.N;
            i40 i40Var = this.M;
            int[] drawableState = getDrawableState();
            int[][] iArr = i40Var.c;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= i40Var.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = i40Var.c;
                int i5 = 0;
                while (true) {
                    if (i5 >= i40Var.a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                i4 = i;
            }
            h40 h40Var = (h40) (i4 < 0 ? i40Var.b : i40Var.d[i4]).f;
            int width = getWidth();
            float f = h40Var.b;
            int i6 = h40Var.a;
            if (i6 == 1) {
                f *= width;
            }
            i2 = (int) f;
            this.R.a(Math.min(i3, i2));
            if (z) {
                this.R.d();
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.n != null) {
            if (this.n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final boolean s(Runnable runnable) {
        u30 u30Var = this.R;
        if (u30Var == null || !u30Var.e) {
            return false;
        }
        post(new c4(this, runnable, 2));
        return true;
    }

    public void setA11yClassName(String str) {
        this.s = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!q()) {
            super.setBackgroundColor(i);
            return;
        }
        vs vsVar = this.i;
        if (vsVar.a(false) != null) {
            vsVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.u3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!q()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        vs vsVar = this.i;
        vsVar.q = true;
        MaterialButton materialButton = vsVar.a;
        materialButton.setSupportBackgroundTintList(vsVar.l);
        materialButton.setSupportBackgroundTintMode(vsVar.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.u3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? l70.p(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (q()) {
            this.i.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.E = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (q()) {
            vs vsVar = this.i;
            if (vsVar.r && vsVar.i == i) {
                return;
            }
            vsVar.i = i;
            vsVar.r = true;
            vsVar.b = vsVar.b.a(i);
            vsVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (q()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(v30 v30Var) {
        vs vsVar = this.i;
        vsVar.c = v30Var;
        if (vsVar.b instanceof g40) {
            vsVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.Q = Math.min(i, this.L);
        v();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (q()) {
            this.i.a(false).q(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.n == drawable || s(new ms(this, drawable, 1))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.n = drawable;
        t(true);
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.B != i) {
            if (this.n != null && this.q != null && d()) {
                o8.j("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.B = i;
                u(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.w != i) {
            this.w = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? l70.p(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            o8.j("iconSize cannot be less than 0");
            return;
        }
        if (this.t == i || s(new ns(i, 0, this))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.t = i;
        t(true);
        w(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            t(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            t(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(j8.q(getContext(), i));
    }

    public void setInsetBottom(int i) {
        vs vsVar = this.i;
        vsVar.b(vsVar.e, vsVar.g, vsVar.f, i);
    }

    public void setInsetLeft(int i) {
        vs vsVar = this.i;
        vsVar.b(i, vsVar.g, vsVar.f, vsVar.h);
    }

    public void setInsetRight(int i) {
        vs vsVar = this.i;
        vsVar.b(vsVar.e, vsVar.g, i, vsVar.h);
    }

    public void setInsetTop(int i) {
        vs vsVar = this.i;
        vsVar.b(vsVar.e, i, vsVar.f, vsVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(ps psVar) {
        this.k = psVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.I != z) {
            this.I = z;
            vs vsVar = this.i;
            if (z) {
                u40 u40Var = new u40(5, this);
                vsVar.d = u40Var;
                rt a = vsVar.a(false);
                if (a != null) {
                    a.I = u40Var;
                }
            } else {
                vsVar.d = null;
                rt a2 = vsVar.a(false);
                if (a2 != null) {
                    a2.I = null;
                }
            }
            post(new q1(9, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ps psVar = this.k;
        if (psVar != null) {
            ((MaterialButtonToggleGroup) ((j1) psVar).g).invalidate();
        }
        super.setPressed(z);
        r(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (q()) {
            vs vsVar = this.i;
            MaterialButton materialButton = vsVar.a;
            if (vsVar.n != colorStateList) {
                vsVar.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(c10.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (q()) {
            setRippleColor(j8.q(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.q == drawable || s(new ms(this, drawable, 0))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.q = drawable;
        this.r = false;
        w(true);
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.C != i) {
            if (this.q != null && this.n != null && d()) {
                o8.j("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.C = i;
                x(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? l70.p(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            w(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.o != mode) {
            this.o = mode;
            w(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(j8.q(getContext(), i));
    }

    public void setShapeAppearance(l20 l20Var) {
        if (!q()) {
            o8.t("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        vs vsVar = this.i;
        if (vsVar.c == null && l20Var.f()) {
            vsVar.c = vw.f0(getContext());
            if (vsVar.b instanceof g40) {
                vsVar.d();
            }
        }
        vsVar.b = l20Var;
        vsVar.d();
    }

    @Override // defpackage.y20
    public void setShapeAppearanceModel(n20 n20Var) {
        if (!q()) {
            o8.t("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        vs vsVar = this.i;
        vsVar.b = n20Var;
        vsVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (q()) {
            vs vsVar = this.i;
            vsVar.p = z;
            vsVar.e();
        }
    }

    public void setSizeChange(i40 i40Var) {
        if (this.M != i40Var) {
            this.M = i40Var;
            r(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (q()) {
            vs vsVar = this.i;
            if (vsVar.m != colorStateList) {
                vsVar.m = colorStateList;
                vsVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (q()) {
            setStrokeColor(j8.q(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (q()) {
            vs vsVar = this.i;
            if (vsVar.j != i) {
                vsVar.j = i;
                vsVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (q()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.u3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!q()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        vs vsVar = this.i;
        if (vsVar.l != colorStateList) {
            vsVar.l = colorStateList;
            if (vsVar.a(false) != null) {
                vsVar.a(false).setTintList(vsVar.l);
            }
        }
    }

    @Override // defpackage.u3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!q()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        vs vsVar = this.i;
        if (vsVar.k != mode) {
            vsVar.k = mode;
            if (vsVar.a(false) == null || vsVar.k == null) {
                return;
            }
            vsVar.a(false).setTintMode(vsVar.k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.E = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.u3, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.E = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // defpackage.u3, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.E = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.i.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.E = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(rs rsVar) {
        if (this.O != rsVar) {
            this.O = rsVar;
            r(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.N != i) {
            this.N = i;
            r(true);
        }
    }

    public final void t(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.n = mutate;
            mutate.setTintList(this.m);
            PorterDuff.Mode mode = this.l;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int i = this.t;
            if (i == 0) {
                i = this.n.getIntrinsicWidth();
            }
            int i2 = this.t;
            if (i2 == 0) {
                i2 = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i3 = this.u;
            int i4 = this.v;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.n.setVisible(true, z);
        }
        if (this.n != null && this.q != null && d()) {
            o8.j("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.n == null && this.q != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (l() && compoundDrawablesRelative[0] != this.n) || (k() && compoundDrawablesRelative[2] != this.n) || (m() && compoundDrawablesRelative[1] != this.n);
        if (z || z2) {
            if (l()) {
                setCompoundDrawablesRelative(this.n, h(1), h(2), null);
            } else if (k()) {
                setCompoundDrawablesRelative(h(0), h(1), this.n, null);
            } else if (m()) {
                setCompoundDrawablesRelative(h(0), this.n, h(2), null);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.z);
    }

    public final void u(int i, int i2) {
        if (this.n == null || getLayout() == null) {
            return;
        }
        if (l() || k()) {
            this.v = 0;
            if (e(this.B)) {
                this.u = 0;
                t(false);
                return;
            }
            int f = f(i, this.B);
            if (this.u != f) {
                this.u = f;
                t(false);
                return;
            }
            return;
        }
        if (m()) {
            this.u = 0;
            if (this.B == 16) {
                this.v = 0;
                t(false);
                return;
            }
            int i3 = this.t;
            if (i3 == 0) {
                i3 = this.n.getIntrinsicHeight();
            }
            int g = g(i2, i3);
            if (this.v != g) {
                this.v = g;
                t(false);
            }
        }
    }

    public final void v() {
        int i = (int) (this.P - this.Q);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.J;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.E + i);
        }
        setPaddingRelative(this.F + i3, getPaddingTop(), (this.G + i) - i3, getPaddingBottom());
    }

    public final void w(boolean z) {
        Drawable drawable = this.q;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.q = mutate;
            mutate.setTintList(this.p);
            PorterDuff.Mode mode = this.o;
            if (mode != null) {
                this.q.setTintMode(mode);
            }
            int i = this.t;
            if (i == 0) {
                i = this.q.getIntrinsicWidth();
            }
            int i2 = this.t;
            if (i2 == 0) {
                i2 = this.q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.q;
            int i3 = this.x;
            int i4 = this.y;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.q.setVisible(true, z);
        }
        if (this.q != null && this.n != null && d()) {
            o8.j("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.q == null) {
            if (this.r) {
                return;
            }
            if (this.n != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (o() && compoundDrawablesRelative[0] != this.q) || (n() && compoundDrawablesRelative[2] != this.q) || (p() && compoundDrawablesRelative[1] != this.q);
        if (z || z2) {
            if (o()) {
                setCompoundDrawablesRelative(this.q, i(1), i(2), null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), i(1), this.q, null);
            } else if (p()) {
                setCompoundDrawablesRelative(i(0), this.q, i(2), null);
            }
        }
    }

    public final void x(int i, int i2) {
        if (this.q == null || getLayout() == null) {
            return;
        }
        if (o() || n()) {
            this.y = 0;
            if (e(this.C)) {
                this.x = 0;
                w(false);
                return;
            }
            int f = f(i, this.C);
            if (this.x != f) {
                this.x = f;
                w(false);
                return;
            }
            return;
        }
        if (p()) {
            this.x = 0;
            if (this.C == 16) {
                this.y = 0;
                w(false);
                return;
            }
            int i3 = this.t;
            if (i3 == 0) {
                i3 = this.q.getIntrinsicHeight();
            }
            int g = g(i2, i3);
            if (this.y != g) {
                this.y = g;
                w(false);
            }
        }
    }
}
