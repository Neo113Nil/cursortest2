package com.google.android.material.button;

import a.g0;
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
import b4.l;
import e0.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.o;
import o2.c0;
import o2.d0;
import o2.e0;
import o2.j;
import o2.m;
import o2.z;
import u2.a;
import v0.f;
import w1.b;
import w1.c;
import w1.d;
import w1.e;
import w1.h;
import w1.i;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class MaterialButton extends o implements Checkable, z {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final b U = new b();
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
    public e0 M;
    public int N;
    public e O;
    public float P;
    public float Q;
    public v0.e R;
    public final i i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f965j;

    /* renamed from: k, reason: collision with root package name */
    public c f966k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f967l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f968m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f969n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f970o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f971p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f972q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f973r;

    /* renamed from: s, reason: collision with root package name */
    public String f974s;

    /* renamed from: t, reason: collision with root package name */
    public int f975t;

    /* renamed from: u, reason: collision with root package name */
    public int f976u;

    /* renamed from: v, reason: collision with root package name */
    public int f977v;

    /* renamed from: w, reason: collision with root package name */
    public int f978w;

    /* renamed from: x, reason: collision with root package name */
    public int f979x;

    /* renamed from: y, reason: collision with root package name */
    public int f980y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f981z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(com.gdmhkmf.belbet.R.attr.materialButtonStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.gdmhkmf.belbet.R.attr.materialSizeOverlay}), attributeSet, com.gdmhkmf.belbet.R.attr.materialButtonStyle);
        this.f965j = new LinkedHashSet();
        this.f981z = false;
        this.A = false;
        this.D = Integer.MIN_VALUE;
        this.E = -2.1474836E9f;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.O = e.i;
        Context context2 = getContext();
        TypedArray e4 = i2.o.e(context2, attributeSet, q1.a.f3151o, com.gdmhkmf.belbet.R.attr.materialButtonStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f978w = e4.getDimensionPixelSize(13, 0);
        int i = e4.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f967l = i2.o.f(i, mode);
        this.f968m = l.r(getContext(), e4, 15);
        this.f969n = l.u(getContext(), e4, 11);
        this.B = e4.getInteger(12, 1);
        this.f975t = e4.getDimensionPixelSize(14, 0);
        this.f970o = i2.o.f(e4.getInt(22, -1), mode);
        this.f971p = e4.hasValue(21) ? l.r(getContext(), e4, 21) : this.f968m;
        this.C = e4.getInteger(20, 3);
        Drawable u4 = l.u(getContext(), e4, 19);
        this.f972q = u4;
        this.f973r = u4 == null;
        m h = c0.h(context2, e4, 23);
        h = h == null ? o2.o.g(context2, attributeSet, com.gdmhkmf.belbet.R.attr.materialButtonStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Button).a() : h;
        boolean z4 = e4.getBoolean(17, false);
        i iVar = new i(this, h);
        this.i = iVar;
        iVar.f3798e = e4.getDimensionPixelOffset(2, 0);
        iVar.f3799f = e4.getDimensionPixelOffset(3, 0);
        iVar.f3800g = e4.getDimensionPixelOffset(4, 0);
        iVar.h = e4.getDimensionPixelOffset(5, 0);
        if (e4.hasValue(9)) {
            int dimensionPixelSize = e4.getDimensionPixelSize(9, -1);
            iVar.i = dimensionPixelSize;
            iVar.f3796b = iVar.f3796b.a(dimensionPixelSize);
            iVar.d();
            iVar.f3809r = true;
        }
        iVar.f3801j = e4.getDimensionPixelSize(26, 0);
        iVar.f3802k = i2.o.f(e4.getInt(8, -1), mode);
        iVar.f3803l = l.r(getContext(), e4, 7);
        iVar.f3804m = l.r(getContext(), e4, 25);
        iVar.f3805n = l.r(getContext(), e4, 18);
        iVar.f3810s = e4.getBoolean(6, false);
        iVar.f3813v = e4.getDimensionPixelSize(10, 0);
        iVar.f3811t = e4.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (e4.hasValue(0)) {
            iVar.f3808q = true;
            setSupportBackgroundTintList(iVar.f3803l);
            setSupportBackgroundTintMode(iVar.f3802k);
        } else {
            iVar.c();
        }
        setPaddingRelative(paddingStart + iVar.f3798e, paddingTop + iVar.f3800g, paddingEnd + iVar.f3799f, paddingBottom + iVar.h);
        setCheckedInternal(e4.getBoolean(1, false));
        if (h instanceof c0) {
            iVar.f3797c = l.X(getContext());
            if (iVar.f3796b instanceof c0) {
                iVar.d();
            }
        }
        setOpticalCenterEnabled(z4);
        e4.recycle();
        setCompoundDrawablePadding(this.f978w);
        t(this.f969n != null);
        w(this.f972q != null);
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
        j a5;
        if (this.I && this.K && (a5 = this.i.a(false)) != null) {
            return (int) (a5.h() * 0.11f);
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
        float f5 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f5 = Math.max(f5, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f5);
    }

    private void setCheckedInternal(boolean z4) {
        if (!j() || this.f981z == z4) {
            return;
        }
        this.f981z = z4;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z5 = this.f981z;
            if (!materialButtonToggleGroup.f984s) {
                materialButtonToggleGroup.l(getId(), z5);
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.f965j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f5) {
        if (this.P != f5) {
            this.P = f5;
            v();
            invalidate();
            if (getParent() instanceof h) {
                h hVar = (h) getParent();
                int i = (int) this.P;
                int indexOfChild = hVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                MaterialButton h = hVar.h(indexOfChild);
                MaterialButton g3 = hVar.g(indexOfChild);
                if (h == null && g3 == null) {
                    return;
                }
                if (h == null) {
                    g3.setDisplayedWidthDecrease(i);
                }
                if (g3 == null) {
                    h.setDisplayedWidthDecrease(i);
                }
                if (h == null || g3 == null) {
                    return;
                }
                h.setDisplayedWidthDecrease(i / 2);
                g3.setDisplayedWidthDecrease((i + 1) / 2);
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

    public final int f(int i, int i4) {
        int i5;
        int i6;
        Drawable drawable = this.f969n;
        if (drawable != null) {
            i5 = this.f975t;
            if (i5 == 0) {
                i5 = drawable.getIntrinsicWidth();
            }
        } else {
            i5 = 0;
        }
        Drawable drawable2 = this.f972q;
        if (drawable2 != null) {
            i6 = this.f975t;
            if (i6 == 0) {
                i6 = drawable2.getIntrinsicWidth();
            }
        } else {
            i6 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i5) - i6) - this.f978w) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i4 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int g(int i, int i4) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i4) - this.f978w) - getPaddingBottom()) / 2);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f974s)) {
            return (j() ? CompoundButton.class : Button.class).getName();
        }
        return this.f974s;
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

    public f getCornerSpringForce() {
        return this.i.f3797c;
    }

    public Drawable getIcon() {
        return this.f969n;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.f978w;
    }

    public int getIconSize() {
        return this.f975t;
    }

    public ColorStateList getIconTint() {
        return this.f968m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f967l;
    }

    public int getInsetBottom() {
        return this.i.h;
    }

    public int getInsetLeft() {
        return this.i.f3798e;
    }

    public int getInsetRight() {
        return this.i.f3799f;
    }

    public int getInsetTop() {
        return this.i.f3800g;
    }

    public ColorStateList getRippleColor() {
        if (q()) {
            return this.i.f3805n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f972q;
    }

    public int getSecondaryIconGravity() {
        return this.C;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f971p;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f970o;
    }

    public m getShapeAppearance() {
        if (q()) {
            return this.i.f3796b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
    }

    public o2.o getShapeAppearanceModel() {
        if (q()) {
            return this.i.f3796b.d();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (q()) {
            return this.i.f3804m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (q()) {
            return this.i.f3801j;
        }
        return 0;
    }

    @Override // l.o
    public ColorStateList getSupportBackgroundTintList() {
        return q() ? this.i.f3803l : super.getSupportBackgroundTintList();
    }

    @Override // l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return q() ? this.i.f3802k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.f972q == null || !o()) {
                return null;
            }
            return this.f972q;
        }
        if (i == 1) {
            if (this.f972q == null || !p()) {
                return null;
            }
            return this.f972q;
        }
        if (i == 2 && this.f972q != null && n()) {
            return this.f972q;
        }
        return null;
    }

    public final Drawable i(int i) {
        if (i == 0) {
            if (this.f969n == null || !l()) {
                return null;
            }
            return this.f969n;
        }
        if (i == 1) {
            if (this.f969n == null || !k()) {
                return null;
            }
            return this.f969n;
        }
        if (i == 2 && this.f969n != null && k()) {
            return this.f969n;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f981z;
    }

    public final boolean j() {
        i iVar = this.i;
        return iVar != null && iVar.f3810s;
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
            l.f0(this, this.i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        if (this.f981z) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    @Override // l.o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f981z);
    }

    @Override // l.o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.f981z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z4, i, i4, i5, i6);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
        int i8 = getResources().getConfiguration().orientation;
        if (this.D != i8) {
            this.D = i8;
            this.E = -2.1474836E9f;
        }
        if (this.E == -2.1474836E9f) {
            this.E = getMeasuredWidth();
            if (this.H == null && (getParent() instanceof h) && ((h) getParent()).getButtonSizeChange() != null) {
                this.H = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.H);
                layoutParams.width = (int) this.E;
                setLayoutParams(layoutParams);
            }
        }
        boolean z5 = false;
        if (this.L == Integer.MIN_VALUE) {
            if (this.f969n == null) {
                i7 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i9 = this.f975t;
                if (i9 == 0) {
                    i9 = this.f969n.getIntrinsicWidth();
                }
                i7 = iconPadding + i9;
            }
            this.L = (getMeasuredWidth() - getTextLayoutWidth()) - i7;
        }
        if (this.F == Integer.MIN_VALUE) {
            this.F = getPaddingStart();
        }
        if (this.G == Integer.MIN_VALUE) {
            this.G = getPaddingEnd();
        }
        if ((getParent() instanceof h) && ((h) getParent()).getOrientation() == 0) {
            z5 = true;
        }
        this.K = z5;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f3386f);
        setChecked(dVar.h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.h = this.f981z;
        return dVar;
    }

    @Override // l.o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i = this.C;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z4;
        if (isEnabled() && this.i.f3811t) {
            toggle();
            z4 = true;
        } else {
            z4 = false;
        }
        boolean performClick = super.performClick();
        if (z4 && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public final boolean q() {
        i iVar = this.i;
        return (iVar == null || iVar.f3808q) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r4 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z4) {
        int i;
        if (this.M == null) {
            return;
        }
        if (this.R == null) {
            v0.e eVar = new v0.e(this, U);
            this.R = eVar;
            eVar.f3714j = l.X(getContext());
        }
        if (this.K) {
            int ordinal = this.O.ordinal();
            int i4 = 0;
            int i5 = (ordinal == 1 || ordinal == 2) ? this.N / 2 : ordinal != 3 ? 0 : this.N;
            e0 e0Var = this.M;
            int[] drawableState = getDrawableState();
            int[][] iArr = e0Var.f2937c;
            int i6 = 0;
            while (true) {
                i = -1;
                if (i6 >= e0Var.f2935a) {
                    i6 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i6], drawableState)) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = e0Var.f2937c;
                int i7 = 0;
                while (true) {
                    if (i7 >= e0Var.f2935a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i7], iArr2)) {
                        i = i7;
                        break;
                    }
                    i7++;
                }
                i6 = i;
            }
            d0 d0Var = (d0) (i6 < 0 ? e0Var.f2936b : e0Var.d[i6]).f79g;
            int width = getWidth();
            float f5 = d0Var.f2934b;
            int i8 = d0Var.f2933a;
            if (i8 == 1) {
                f5 *= width;
            }
            i4 = (int) f5;
            this.R.a(Math.min(i5, i4));
            if (z4) {
                this.R.d();
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f969n != null) {
            if (this.f969n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final boolean s(Runnable runnable) {
        v0.e eVar = this.R;
        if (eVar == null || !eVar.f3711e) {
            return false;
        }
        post(new a.b(this, runnable, 4));
        return true;
    }

    public void setA11yClassName(String str) {
        this.f974s = str;
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
        i iVar = this.i;
        if (iVar.a(false) != null) {
            iVar.a(false).setTint(i);
        }
    }

    @Override // l.o, android.view.View
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
        i iVar = this.i;
        iVar.f3808q = true;
        MaterialButton materialButton = iVar.f3795a;
        materialButton.setSupportBackgroundTintList(iVar.f3803l);
        materialButton.setSupportBackgroundTintMode(iVar.f3802k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.o, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? b4.d.y(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (q()) {
            this.i.f3810s = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedInternal(z4);
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
            i iVar = this.i;
            if (iVar.f3809r && iVar.i == i) {
                return;
            }
            iVar.i = i;
            iVar.f3809r = true;
            iVar.f3796b = iVar.f3796b.a(i);
            iVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (q()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(f fVar) {
        i iVar = this.i;
        iVar.f3797c = fVar;
        if (iVar.f3796b instanceof c0) {
            iVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.Q = Math.min(i, this.L);
        v();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        if (q()) {
            this.i.a(false).q(f5);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f969n == drawable || s(new w1.a(this, drawable, 1))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f969n = drawable;
        t(true);
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.B != i) {
            if (this.f969n != null && this.f972q != null && d()) {
                throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
            }
            this.B = i;
            u(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f978w != i) {
            this.f978w = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? b4.d.y(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f975t == i || s(new k(i, 2, this))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f975t = i;
        t(true);
        w(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f968m != colorStateList) {
            this.f968m = colorStateList;
            t(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f967l != mode) {
            this.f967l = mode;
            t(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(c0.c.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        i iVar = this.i;
        iVar.b(iVar.f3798e, iVar.f3800g, iVar.f3799f, i);
    }

    public void setInsetLeft(int i) {
        i iVar = this.i;
        iVar.b(i, iVar.f3800g, iVar.f3799f, iVar.h);
    }

    public void setInsetRight(int i) {
        i iVar = this.i;
        iVar.b(iVar.f3798e, iVar.f3800g, i, iVar.h);
    }

    public void setInsetTop(int i) {
        i iVar = this.i;
        iVar.b(iVar.f3798e, i, iVar.f3799f, iVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f966k = cVar;
    }

    public void setOpticalCenterEnabled(boolean z4) {
        if (this.I != z4) {
            this.I = z4;
            i iVar = this.i;
            if (z4) {
                g0 g0Var = new g0(8, this);
                iVar.d = g0Var;
                j a5 = iVar.a(false);
                if (a5 != null) {
                    a5.I = g0Var;
                }
            } else {
                iVar.d = null;
                j a6 = iVar.a(false);
                if (a6 != null) {
                    a6.I = null;
                }
            }
            post(new a.j(13, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        c cVar = this.f966k;
        if (cVar != null) {
            ((MaterialButtonToggleGroup) ((q3.a) cVar).f3172a).invalidate();
        }
        super.setPressed(z4);
        r(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (q()) {
            i iVar = this.i;
            MaterialButton materialButton = iVar.f3795a;
            if (iVar.f3805n != colorStateList) {
                iVar.f3805n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(m2.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (q()) {
            setRippleColor(c0.c.a(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f972q == drawable || s(new w1.a(this, drawable, 0))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f972q = drawable;
        this.f973r = false;
        w(true);
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.C != i) {
            if (this.f972q != null && this.f969n != null && d()) {
                throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
            }
            this.C = i;
            x(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? b4.d.y(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f971p != colorStateList) {
            this.f971p = colorStateList;
            w(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f970o != mode) {
            this.f970o = mode;
            w(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(c0.c.a(getContext(), i));
    }

    public void setShapeAppearance(m mVar) {
        if (!q()) {
            throw new IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
        }
        i iVar = this.i;
        if (iVar.f3797c == null && mVar.f()) {
            iVar.f3797c = l.X(getContext());
            if (iVar.f3796b instanceof c0) {
                iVar.d();
            }
        }
        iVar.f3796b = mVar;
        iVar.d();
    }

    @Override // o2.z
    public void setShapeAppearanceModel(o2.o oVar) {
        if (!q()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        i iVar = this.i;
        iVar.f3796b = oVar;
        iVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (q()) {
            i iVar = this.i;
            iVar.f3807p = z4;
            iVar.e();
        }
    }

    public void setSizeChange(e0 e0Var) {
        if (this.M != e0Var) {
            this.M = e0Var;
            r(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (q()) {
            i iVar = this.i;
            if (iVar.f3804m != colorStateList) {
                iVar.f3804m = colorStateList;
                iVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (q()) {
            setStrokeColor(c0.c.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (q()) {
            i iVar = this.i;
            if (iVar.f3801j != i) {
                iVar.f3801j = i;
                iVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (q()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!q()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        i iVar = this.i;
        if (iVar.f3803l != colorStateList) {
            iVar.f3803l = colorStateList;
            if (iVar.a(false) != null) {
                iVar.a(false).setTintList(iVar.f3803l);
            }
        }
    }

    @Override // l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!q()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        i iVar = this.i;
        if (iVar.f3802k != mode) {
            iVar.f3802k = mode;
            if (iVar.a(false) == null || iVar.f3802k == null) {
                return;
            }
            iVar.a(false).setTintMode(iVar.f3802k);
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

    @Override // l.o, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.E = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // l.o, android.widget.TextView
    public final void setTextSize(int i, float f5) {
        this.E = -2.1474836E9f;
        super.setTextSize(i, f5);
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.i.f3811t = z4;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.E = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(e eVar) {
        if (this.O != eVar) {
            this.O = eVar;
            r(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.N != i) {
            this.N = i;
            r(true);
        }
    }

    public final void t(boolean z4) {
        Drawable drawable = this.f969n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f969n = mutate;
            mutate.setTintList(this.f968m);
            PorterDuff.Mode mode = this.f967l;
            if (mode != null) {
                this.f969n.setTintMode(mode);
            }
            int i = this.f975t;
            if (i == 0) {
                i = this.f969n.getIntrinsicWidth();
            }
            int i4 = this.f975t;
            if (i4 == 0) {
                i4 = this.f969n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f969n;
            int i5 = this.f976u;
            int i6 = this.f977v;
            drawable2.setBounds(i5, i6, i + i5, i4 + i6);
            this.f969n.setVisible(true, z4);
        }
        if (this.f969n != null && this.f972q != null && d()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (this.f969n == null && this.f972q != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z5 = (l() && compoundDrawablesRelative[0] != this.f969n) || (k() && compoundDrawablesRelative[2] != this.f969n) || (m() && compoundDrawablesRelative[1] != this.f969n);
        if (z4 || z5) {
            if (l()) {
                setCompoundDrawablesRelative(this.f969n, h(1), h(2), null);
            } else if (k()) {
                setCompoundDrawablesRelative(h(0), h(1), this.f969n, null);
            } else if (m()) {
                setCompoundDrawablesRelative(h(0), this.f969n, h(2), null);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f981z);
    }

    public final void u(int i, int i4) {
        if (this.f969n == null || getLayout() == null) {
            return;
        }
        if (l() || k()) {
            this.f977v = 0;
            if (e(this.B)) {
                this.f976u = 0;
                t(false);
                return;
            }
            int f5 = f(i, this.B);
            if (this.f976u != f5) {
                this.f976u = f5;
                t(false);
                return;
            }
            return;
        }
        if (m()) {
            this.f976u = 0;
            if (this.B == 16) {
                this.f977v = 0;
                t(false);
                return;
            }
            int i5 = this.f975t;
            if (i5 == 0) {
                i5 = this.f969n.getIntrinsicHeight();
            }
            int g3 = g(i4, i5);
            if (this.f977v != g3) {
                this.f977v = g3;
                t(false);
            }
        }
    }

    public final void v() {
        int i = (int) (this.P - this.Q);
        int i4 = (i / 2) + (getLayoutDirection() == 1 ? -this.J : this.J);
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.E + i);
        }
        setPaddingRelative(this.F + i4, getPaddingTop(), (this.G + i) - i4, getPaddingBottom());
    }

    public final void w(boolean z4) {
        Drawable drawable = this.f972q;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f972q = mutate;
            mutate.setTintList(this.f971p);
            PorterDuff.Mode mode = this.f970o;
            if (mode != null) {
                this.f972q.setTintMode(mode);
            }
            int i = this.f975t;
            if (i == 0) {
                i = this.f972q.getIntrinsicWidth();
            }
            int i4 = this.f975t;
            if (i4 == 0) {
                i4 = this.f972q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f972q;
            int i5 = this.f979x;
            int i6 = this.f980y;
            drawable2.setBounds(i5, i6, i + i5, i4 + i6);
            this.f972q.setVisible(true, z4);
        }
        if (this.f972q != null && this.f969n != null && d()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (this.f972q == null) {
            if (this.f973r) {
                return;
            }
            if (this.f969n != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z5 = (o() && compoundDrawablesRelative[0] != this.f972q) || (n() && compoundDrawablesRelative[2] != this.f972q) || (p() && compoundDrawablesRelative[1] != this.f972q);
        if (z4 || z5) {
            if (o()) {
                setCompoundDrawablesRelative(this.f972q, i(1), i(2), null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), i(1), this.f972q, null);
            } else if (p()) {
                setCompoundDrawablesRelative(i(0), this.f972q, i(2), null);
            }
        }
    }

    public final void x(int i, int i4) {
        if (this.f972q == null || getLayout() == null) {
            return;
        }
        if (o() || n()) {
            this.f980y = 0;
            if (e(this.C)) {
                this.f979x = 0;
                w(false);
                return;
            }
            int f5 = f(i, this.C);
            if (this.f979x != f5) {
                this.f979x = f5;
                w(false);
                return;
            }
            return;
        }
        if (p()) {
            this.f979x = 0;
            if (this.C == 16) {
                this.f980y = 0;
                w(false);
                return;
            }
            int i5 = this.f975t;
            if (i5 == 0) {
                i5 = this.f972q.getIntrinsicHeight();
            }
            int g3 = g(i4, i5);
            if (this.f980y != g3) {
                this.f980y = g3;
                w(false);
            }
        }
    }
}
