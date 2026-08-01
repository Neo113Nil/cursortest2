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
import defpackage.ba0;
import defpackage.bi;
import defpackage.c70;
import defpackage.cv;
import defpackage.d50;
import defpackage.e00;
import defpackage.e4;
import defpackage.ed0;
import defpackage.f00;
import defpackage.g00;
import defpackage.g10;
import defpackage.gd0;
import defpackage.gf0;
import defpackage.h00;
import defpackage.hf0;
import defpackage.i00;
import defpackage.if0;
import defpackage.jf0;
import defpackage.kz;
import defpackage.l00;
import defpackage.mv;
import defpackage.r1;
import defpackage.rd0;
import defpackage.s9;
import defpackage.te0;
import defpackage.ue0;
import defpackage.w3;
import defpackage.xc0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class MaterialButton extends w3 implements Checkable, rd0 {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final g00 U = new g00();
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
    public jf0 M;
    public int N;
    public a O;
    public float P;
    public float Q;
    public te0 R;
    public final l00 i;
    public final LinkedHashSet j;
    public h00 k;
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

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public enum a {
        NONE,
        START,
        END,
        BOTH
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(mv.U(com.trembin.nirefon.betfury.R.attr.materialButtonStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.trembin.nirefon.betfury.R.attr.materialSizeOverlay}), attributeSet, com.trembin.nirefon.betfury.R.attr.materialButtonStyle);
        this.j = new LinkedHashSet();
        this.z = false;
        this.A = false;
        this.D = Integer.MIN_VALUE;
        this.E = -2.1474836E9f;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.O = a.BOTH;
        Context context2 = getContext();
        TypedArray E = d50.E(context2, attributeSet, c70.p, com.trembin.nirefon.betfury.R.attr.materialButtonStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.w = E.getDimensionPixelSize(13, 0);
        int i = E.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.l = xc0.b(i, mode);
        this.m = mv.r(getContext(), E, 15);
        this.n = mv.s(getContext(), E, 11);
        this.B = E.getInteger(12, 1);
        this.t = E.getDimensionPixelSize(14, 0);
        this.o = xc0.b(E.getInt(22, -1), mode);
        this.p = E.hasValue(21) ? mv.r(getContext(), E, 21) : this.m;
        this.C = E.getInteger(20, 3);
        Drawable s = mv.s(getContext(), E, 19);
        this.q = s;
        this.r = s == null;
        ed0 h = gf0.h(context2, E, 23);
        h = h == null ? gd0.g(context2, attributeSet, com.trembin.nirefon.betfury.R.attr.materialButtonStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Button).a() : h;
        boolean z = E.getBoolean(17, false);
        l00 l00Var = new l00(this, h);
        this.i = l00Var;
        l00Var.e = E.getDimensionPixelOffset(2, 0);
        l00Var.f = E.getDimensionPixelOffset(3, 0);
        l00Var.g = E.getDimensionPixelOffset(4, 0);
        l00Var.h = E.getDimensionPixelOffset(5, 0);
        if (E.hasValue(9)) {
            int dimensionPixelSize = E.getDimensionPixelSize(9, -1);
            l00Var.i = dimensionPixelSize;
            l00Var.b = l00Var.b.a(dimensionPixelSize);
            l00Var.d();
            l00Var.r = true;
        }
        l00Var.j = E.getDimensionPixelSize(26, 0);
        l00Var.k = xc0.b(E.getInt(8, -1), mode);
        l00Var.l = mv.r(getContext(), E, 7);
        l00Var.m = mv.r(getContext(), E, 25);
        l00Var.n = mv.r(getContext(), E, 18);
        l00Var.s = E.getBoolean(6, false);
        l00Var.v = E.getDimensionPixelSize(10, 0);
        l00Var.t = E.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (E.hasValue(0)) {
            l00Var.q = true;
            setSupportBackgroundTintList(l00Var.l);
            setSupportBackgroundTintMode(l00Var.k);
        } else {
            l00Var.c();
        }
        setPaddingRelative(paddingStart + l00Var.e, paddingTop + l00Var.g, paddingEnd + l00Var.f, paddingBottom + l00Var.h);
        setCheckedInternal(E.getBoolean(1, false));
        if (h instanceof gf0) {
            l00Var.c = d50.T(getContext());
            if (l00Var.b instanceof gf0) {
                l00Var.d();
            }
        }
        setOpticalCenterEnabled(z);
        E.recycle();
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
        g10 a2;
        if (this.I && this.K && (a2 = this.i.a(false)) != null) {
            return (int) (a2.h() * 0.11f);
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
            s9.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.P != f) {
            this.P = f;
            v();
            invalidate();
            if (getParent() instanceof com.google.android.material.button.a) {
                com.google.android.material.button.a aVar = (com.google.android.material.button.a) getParent();
                int i = (int) this.P;
                int indexOfChild = aVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                MaterialButton h = aVar.h(indexOfChild);
                MaterialButton g = aVar.g(indexOfChild);
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

    public ue0 getCornerSpringForce() {
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

    public ed0 getShapeAppearance() {
        if (q()) {
            return this.i.b;
        }
        s9.u("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public gd0 getShapeAppearanceModel() {
        if (q()) {
            return this.i.b.d();
        }
        s9.u("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
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

    @Override // defpackage.w3
    public ColorStateList getSupportBackgroundTintList() {
        return q() ? this.i.l : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.w3
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
        l00 l00Var = this.i;
        return l00Var != null && l00Var.s;
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
            d50.Y(this, this.i.a(false));
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

    @Override // defpackage.w3, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.z);
    }

    @Override // defpackage.w3, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.w3, android.widget.TextView, android.view.View
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
            if (this.H == null && (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getButtonSizeChange() != null) {
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
        if ((getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.K = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i00)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i00 i00Var = (i00) parcelable;
        super.onRestoreInstanceState(i00Var.f);
        setChecked(i00Var.h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        i00 i00Var = new i00(super.onSaveInstanceState());
        i00Var.h = this.z;
        return i00Var;
    }

    @Override // defpackage.w3, android.widget.TextView
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
        l00 l00Var = this.i;
        return (l00Var == null || l00Var.q) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r1 == defpackage.if0.PIXELS) goto L41;
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
            te0 te0Var = new te0(this, U);
            this.R = te0Var;
            te0Var.j = d50.T(getContext());
        }
        if (this.K) {
            int ordinal = this.O.ordinal();
            int i2 = 0;
            int i3 = (ordinal == 1 || ordinal == 2) ? this.N / 2 : ordinal != 3 ? 0 : this.N;
            jf0 jf0Var = this.M;
            int[] drawableState = getDrawableState();
            int[][] iArr = jf0Var.c;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= jf0Var.a) {
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
                int[][] iArr3 = jf0Var.c;
                int i5 = 0;
                while (true) {
                    if (i5 >= jf0Var.a) {
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
            hf0 hf0Var = (hf0) (i4 < 0 ? jf0Var.b : jf0Var.d[i4]).f;
            int width = getWidth();
            float f = hf0Var.b;
            if0 if0Var = hf0Var.a;
            if (if0Var == if0.PERCENT) {
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
        te0 te0Var = this.R;
        if (te0Var == null || !te0Var.e) {
            return false;
        }
        post(new e4(this, runnable, 2));
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
        l00 l00Var = this.i;
        if (l00Var.a(false) != null) {
            l00Var.a(false).setTint(i);
        }
    }

    @Override // defpackage.w3, android.view.View
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
        l00 l00Var = this.i;
        l00Var.q = true;
        MaterialButton materialButton = l00Var.a;
        materialButton.setSupportBackgroundTintList(l00Var.l);
        materialButton.setSupportBackgroundTintMode(l00Var.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.w3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d50.v(getContext(), i) : null);
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
            l00 l00Var = this.i;
            if (l00Var.r && l00Var.i == i) {
                return;
            }
            l00Var.i = i;
            l00Var.r = true;
            l00Var.b = l00Var.b.a(i);
            l00Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (q()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(ue0 ue0Var) {
        l00 l00Var = this.i;
        l00Var.c = ue0Var;
        if (l00Var.b instanceof gf0) {
            l00Var.d();
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
        if (this.n == drawable || s(new e00(this, drawable, 1))) {
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
                s9.k("iconGravity cannot have the same alignment as secondaryIconGravity");
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
        setIcon(i != 0 ? d50.v(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            s9.k("iconSize cannot be less than 0");
            return;
        }
        if (this.t == i || s(new f00(i, 0, this))) {
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
        setIconTint(bi.A(getContext(), i));
    }

    public void setInsetBottom(int i) {
        l00 l00Var = this.i;
        l00Var.b(l00Var.e, l00Var.g, l00Var.f, i);
    }

    public void setInsetLeft(int i) {
        l00 l00Var = this.i;
        l00Var.b(i, l00Var.g, l00Var.f, l00Var.h);
    }

    public void setInsetRight(int i) {
        l00 l00Var = this.i;
        l00Var.b(l00Var.e, l00Var.g, i, l00Var.h);
    }

    public void setInsetTop(int i) {
        l00 l00Var = this.i;
        l00Var.b(l00Var.e, i, l00Var.f, l00Var.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(h00 h00Var) {
        this.k = h00Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.I != z) {
            this.I = z;
            l00 l00Var = this.i;
            if (z) {
                cv cvVar = new cv(this);
                l00Var.d = cvVar;
                g10 a2 = l00Var.a(false);
                if (a2 != null) {
                    a2.J = cvVar;
                }
            } else {
                l00Var.d = null;
                g10 a3 = l00Var.a(false);
                if (a3 != null) {
                    a3.J = null;
                }
            }
            post(new r1(9, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        h00 h00Var = this.k;
        if (h00Var != null) {
            ((MaterialButtonToggleGroup) ((kz) h00Var).f).invalidate();
        }
        super.setPressed(z);
        r(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (q()) {
            l00 l00Var = this.i;
            MaterialButton materialButton = l00Var.a;
            if (l00Var.n != colorStateList) {
                l00Var.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ba0.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (q()) {
            setRippleColor(bi.A(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.q == drawable || s(new e00(this, drawable, 0))) {
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
                s9.k("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.C = i;
                x(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? d50.v(getContext(), i) : null);
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
        setSecondaryIconTint(bi.A(getContext(), i));
    }

    public void setShapeAppearance(ed0 ed0Var) {
        if (!q()) {
            s9.u("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        l00 l00Var = this.i;
        if (l00Var.c == null && ed0Var.f()) {
            l00Var.c = d50.T(getContext());
            if (l00Var.b instanceof gf0) {
                l00Var.d();
            }
        }
        l00Var.b = ed0Var;
        l00Var.d();
    }

    @Override // defpackage.rd0
    public void setShapeAppearanceModel(gd0 gd0Var) {
        if (!q()) {
            s9.u("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        l00 l00Var = this.i;
        l00Var.b = gd0Var;
        l00Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (q()) {
            l00 l00Var = this.i;
            l00Var.p = z;
            l00Var.e();
        }
    }

    public void setSizeChange(jf0 jf0Var) {
        if (this.M != jf0Var) {
            this.M = jf0Var;
            r(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (q()) {
            l00 l00Var = this.i;
            if (l00Var.m != colorStateList) {
                l00Var.m = colorStateList;
                l00Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (q()) {
            setStrokeColor(bi.A(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (q()) {
            l00 l00Var = this.i;
            if (l00Var.j != i) {
                l00Var.j = i;
                l00Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (q()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.w3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!q()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        l00 l00Var = this.i;
        if (l00Var.l != colorStateList) {
            l00Var.l = colorStateList;
            if (l00Var.a(false) != null) {
                l00Var.a(false).setTintList(l00Var.l);
            }
        }
    }

    @Override // defpackage.w3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!q()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        l00 l00Var = this.i;
        if (l00Var.k != mode) {
            l00Var.k = mode;
            if (l00Var.a(false) == null || l00Var.k == null) {
                return;
            }
            l00Var.a(false).setTintMode(l00Var.k);
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

    @Override // defpackage.w3, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.E = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // defpackage.w3, android.widget.TextView
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

    public void setWidthChangeDirection(a aVar) {
        if (this.O != aVar) {
            this.O = aVar;
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
            s9.k("iconGravity cannot have the same alignment as secondaryIconGravity");
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
            s9.k("secondaryIconGravity cannot have the same alignment as iconGravity");
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
