package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.bv;
import defpackage.c10;
import defpackage.da;
import defpackage.e8;
import defpackage.e90;
import defpackage.ea;
import defpackage.fa;
import defpackage.ga;
import defpackage.j8;
import defpackage.kt;
import defpackage.l70;
import defpackage.ly;
import defpackage.n20;
import defpackage.o8;
import defpackage.op;
import defpackage.p50;
import defpackage.q50;
import defpackage.r50;
import defpackage.s50;
import defpackage.vw;
import defpackage.w3;
import defpackage.y20;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class Chip extends w3 implements y20, Checkable {
    public static final Rect C = new Rect();
    public static final int[] D = {R.attr.state_selected};
    public static final int[] E = {R.attr.state_checkable};
    public final RectF A;
    public final da B;
    public ga j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View.OnClickListener m;
    public CompoundButton.OnCheckedChangeListener n;
    public kt o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public CharSequence w;
    public final fa x;
    public boolean y;
    public final Rect z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.awerser.monnit.betplay.R.attr.chipStyle);
        int resourceId;
        this.z = new Rect();
        this.A = new RectF();
        this.B = new da(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                o8.w("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                o8.w("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                o8.w("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                o8.w("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                o8.w("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ga gaVar = new ga(context2, attributeSet);
        Context context3 = gaVar.s0;
        int[] iArr = ly.c;
        TypedArray Z = vw.Z(context3, attributeSet, iArr, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        gaVar.S0 = Z.hasValue(39);
        Context context4 = gaVar.s0;
        ColorStateList x = op.x(context4, Z, 25);
        if (gaVar.L != x) {
            gaVar.L = x;
            gaVar.onStateChange(gaVar.getState());
        }
        ColorStateList x2 = op.x(context4, Z, 12);
        if (gaVar.M != x2) {
            gaVar.M = x2;
            gaVar.onStateChange(gaVar.getState());
        }
        float dimension = Z.getDimension(20, 0.0f);
        if (gaVar.N != dimension) {
            gaVar.N = dimension;
            gaVar.invalidateSelf();
            gaVar.G();
        }
        if (Z.hasValue(13)) {
            gaVar.M(Z.getDimension(13, 0.0f));
        }
        gaVar.R(op.x(context4, Z, 23));
        gaVar.S(Z.getDimension(24, 0.0f));
        gaVar.c0(op.x(context4, Z, 38));
        String text = Z.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(gaVar.S, text)) {
            gaVar.S = text;
            gaVar.y0.d = true;
            gaVar.invalidateSelf();
            gaVar.G();
        }
        p50 p50Var = (!Z.hasValue(0) || (resourceId = Z.getResourceId(0, 0)) == 0) ? null : new p50(context4, resourceId);
        p50Var.l = Z.getDimension(1, p50Var.l);
        int i = Z.hasValue(34) ? 34 : 7;
        if (Z.hasValue(i)) {
            p50Var.c = Z.getString(i);
        }
        gaVar.d0(p50Var);
        int i2 = Z.getInt(3, 0);
        if (i2 == 1) {
            gaVar.P0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            gaVar.P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            gaVar.P0 = TextUtils.TruncateAt.END;
        }
        gaVar.Q(Z.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            gaVar.Q(Z.getBoolean(16, false));
        }
        gaVar.N(op.A(context4, Z, 15));
        if (Z.hasValue(18)) {
            gaVar.P(op.x(context4, Z, 18));
        }
        gaVar.O(Z.getDimension(17, -1.0f));
        gaVar.Z(Z.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            gaVar.Z(Z.getBoolean(27, false));
        }
        gaVar.T(op.A(context4, Z, 26));
        gaVar.Y(op.x(context4, Z, 31));
        gaVar.V(Z.getDimension(29, 0.0f));
        gaVar.I(Z.getBoolean(6, false));
        gaVar.L(Z.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            gaVar.L(Z.getBoolean(9, false));
        }
        gaVar.J(op.A(context4, Z, 8));
        if (Z.hasValue(10)) {
            gaVar.K(op.x(context4, Z, 10));
        }
        gaVar.i0 = bv.a(context4, Z, 41);
        gaVar.j0 = bv.a(context4, Z, 35);
        float dimension2 = Z.getDimension(22, 0.0f);
        if (gaVar.k0 != dimension2) {
            gaVar.k0 = dimension2;
            gaVar.invalidateSelf();
            gaVar.G();
        }
        gaVar.b0(Z.getDimension(37, 0.0f));
        gaVar.a0(Z.getDimension(36, 0.0f));
        float dimension3 = Z.getDimension(43, 0.0f);
        if (gaVar.n0 != dimension3) {
            gaVar.n0 = dimension3;
            gaVar.invalidateSelf();
            gaVar.G();
        }
        float dimension4 = Z.getDimension(42, 0.0f);
        if (gaVar.o0 != dimension4) {
            gaVar.o0 = dimension4;
            gaVar.invalidateSelf();
            gaVar.G();
        }
        gaVar.W(Z.getDimension(30, 0.0f));
        gaVar.U(Z.getDimension(28, 0.0f));
        float dimension5 = Z.getDimension(14, 0.0f);
        if (gaVar.r0 != dimension5) {
            gaVar.r0 = dimension5;
            gaVar.invalidateSelf();
            gaVar.G();
        }
        gaVar.R0 = Z.getDimensionPixelSize(4, Integer.MAX_VALUE);
        Z.recycle();
        vw.n(context2, attributeSet, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action);
        vw.r(context2, attributeSet, iArr, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action);
        this.t = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue P = l70.P(theme, com.awerser.monnit.betplay.R.attr.minTouchTargetSize);
        this.v = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((P == null || P.type != 5) ? Float.NaN : P.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.awerser.monnit.betplay.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(gaVar);
        gaVar.q(getElevation());
        vw.n(context2, attributeSet, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action);
        vw.r(context2, attributeSet, iArr, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.x = new fa(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new ea(this));
        }
        setChecked(this.p);
        setText(gaVar.S);
        setEllipsize(gaVar.P0);
        g();
        if (!this.j.Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.t) {
            setMinHeight(this.v);
        }
        this.u = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ca
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = Chip.this;
                kt ktVar = chip.o;
                if (ktVar != null) {
                    w9 w9Var = (w9) ((j1) ktVar).g;
                    if (!z ? w9Var.e(chip, w9Var.e) : w9Var.a(chip)) {
                        w9Var.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.A;
        rectF.setEmpty();
        if (c() && this.m != null) {
            ga gaVar = this.j;
            Rect bounds = gaVar.getBounds();
            rectF.setEmpty();
            if (gaVar.g0()) {
                float f = gaVar.r0 + gaVar.q0 + gaVar.c0 + gaVar.p0 + gaVar.o0;
                if (gaVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.z;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private p50 getTextAppearance() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.y0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.r != z) {
            this.r = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.v = i;
        if (!this.t) {
            InsetDrawable insetDrawable = this.k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.j.N));
        int max2 = Math.max(0, i - this.j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.k = new InsetDrawable((Drawable) this.j, i2, i3, i2, i3);
        e();
    }

    public final boolean c() {
        ga gaVar = this.j;
        if (gaVar == null) {
            return false;
        }
        Drawable drawable = gaVar.Z;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        ga gaVar;
        if (!c() || (gaVar = this.j) == null || !gaVar.Y || this.m == null) {
            e90.m(this, null);
            this.y = false;
        } else {
            e90.m(this, this.x);
            this.y = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.y) {
            return super.dispatchHoverEvent(motionEvent);
        }
        fa faVar = this.x;
        AccessibilityManager accessibilityManager = faVar.e;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = faVar.k;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = faVar.j;
                if (i3 != i2) {
                    faVar.j = i2;
                    faVar.h(i2, 128);
                    faVar.h(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = faVar.j) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    faVar.j = Integer.MIN_VALUE;
                    faVar.h(Integer.MIN_VALUE, 128);
                    faVar.h(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.y) {
            return super.dispatchKeyEvent(keyEvent);
        }
        fa faVar = this.x;
        faVar.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && faVar.d(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = faVar.i;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = faVar.k;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.y) {
                                chip.x.h(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = faVar.d(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = faVar.d(1, null);
            }
        }
        if (!z || faVar.i == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.w3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ga gaVar = this.j;
        boolean z = false;
        int i = 0;
        z = false;
        if (gaVar != null && ga.F(gaVar.Z)) {
            ga gaVar2 = this.j;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.s) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.r) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.q) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.s) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.r) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.q) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = gaVar2.X(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(c10.a(this.j.R), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.j);
        this.l = rippleDrawable;
        this.j.getClass();
        setBackground(this.l);
        f();
    }

    public final void f() {
        ga gaVar;
        if (TextUtils.isEmpty(getText()) || (gaVar = this.j) == null) {
            return;
        }
        int C2 = (int) (gaVar.C() + gaVar.r0 + gaVar.o0);
        ga gaVar2 = this.j;
        int B = (int) (gaVar2.B() + gaVar2.k0 + gaVar2.n0);
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            B += rect.left;
            C2 += rect.right;
        }
        setPaddingRelative(B, getPaddingTop(), C2, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        ga gaVar = this.j;
        if (gaVar != null) {
            paint.drawableState = gaVar.getState();
        }
        p50 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.B);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        ga gaVar = this.j;
        if (gaVar == null || !gaVar.e0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).m.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.k;
        return insetDrawable == null ? this.j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return Math.max(0.0f, gaVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.r0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ga gaVar = this.j;
        if (gaVar == null || (drawable = gaVar.U) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.V;
        }
        return null;
    }

    public float getChipMinHeight() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ga gaVar = this.j;
        if (gaVar == null || (drawable = gaVar.Z) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.y) {
            fa faVar = this.x;
            if (faVar.i == 1 || faVar.h == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        ga gaVar = this.j;
        if (gaVar == null) {
            return super.getFontVariationSettings();
        }
        p50 p50Var = gaVar.y0.f;
        if (p50Var != null) {
            return p50Var.c;
        }
        return null;
    }

    public bv getHideMotionSpec() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.R;
        }
        return null;
    }

    public n20 getShapeAppearanceModel() {
        return this.j.i();
    }

    public bv getShowMotionSpec() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ga gaVar = this.j;
        if (gaVar != null) {
            return gaVar.n0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vw.j0(this, this.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        ga gaVar = this.j;
        if (gaVar != null && gaVar.e0) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.y) {
            fa faVar = this.x;
            int i2 = faVar.i;
            if (i2 != Integer.MIN_VALUE) {
                faVar.a(i2);
            }
            if (z) {
                faVar.d(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ga gaVar = this.j;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(gaVar != null && gaVar.e0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.h) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(com.awerser.monnit.betplay.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.u != i) {
            this.u = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.q) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.q) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.y) {
                    this.x.h(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.w = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.w3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.w3, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.I(z);
        }
    }

    public void setCheckableResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.I(gaVar.s0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ga gaVar = this.j;
        if (gaVar == null) {
            this.p = z;
        } else if (gaVar.e0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.J(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.J(l70.p(gaVar.s0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.K(j8.q(gaVar.s0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.L(gaVar.s0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.M == colorStateList) {
            return;
        }
        gaVar.M = colorStateList;
        gaVar.onStateChange(gaVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList q;
        ga gaVar = this.j;
        if (gaVar == null || gaVar.M == (q = j8.q(gaVar.s0, i))) {
            return;
        }
        gaVar.M = q;
        gaVar.onStateChange(gaVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.M(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ga gaVar) {
        ga gaVar2 = this.j;
        if (gaVar2 != gaVar) {
            if (gaVar2 != null) {
                gaVar2.O0 = new WeakReference(null);
            }
            this.j = gaVar;
            gaVar.Q0 = false;
            gaVar.O0 = new WeakReference(this);
            b(this.v);
        }
    }

    public void setChipEndPadding(float f) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.r0 == f) {
            return;
        }
        gaVar.r0 = f;
        gaVar.invalidateSelf();
        gaVar.G();
    }

    public void setChipEndPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            float dimension = gaVar.s0.getResources().getDimension(i);
            if (gaVar.r0 != dimension) {
                gaVar.r0 = dimension;
                gaVar.invalidateSelf();
                gaVar.G();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.N(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.N(l70.p(gaVar.s0, i));
        }
    }

    public void setChipIconSize(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.O(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.O(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.P(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.P(j8.q(gaVar.s0, i));
        }
    }

    public void setChipIconVisible(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.Q(gaVar.s0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.N == f) {
            return;
        }
        gaVar.N = f;
        gaVar.invalidateSelf();
        gaVar.G();
    }

    public void setChipMinHeightResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            float dimension = gaVar.s0.getResources().getDimension(i);
            if (gaVar.N != dimension) {
                gaVar.N = dimension;
                gaVar.invalidateSelf();
                gaVar.G();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.k0 == f) {
            return;
        }
        gaVar.k0 = f;
        gaVar.invalidateSelf();
        gaVar.G();
    }

    public void setChipStartPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            float dimension = gaVar.s0.getResources().getDimension(i);
            if (gaVar.k0 != dimension) {
                gaVar.k0 = dimension;
                gaVar.invalidateSelf();
                gaVar.G();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.R(j8.q(gaVar.s0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.S(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.S(gaVar.s0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.T(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.d0 == charSequence) {
            return;
        }
        String str = e8.b;
        e8 e8Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e8.e : e8.d;
        e8Var.getClass();
        q50 q50Var = r50.a;
        gaVar.d0 = e8Var.c(charSequence);
        gaVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.U(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.U(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.T(l70.p(gaVar.s0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.V(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.V(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.W(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.W(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.Y(j8.q(gaVar.s0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.w3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            o8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            o8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.w3, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            o8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            o8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            o8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            o8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            o8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            o8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            o8.w("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.t = z;
        b(this.v);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        ga gaVar = this.j;
        if (gaVar == null) {
            return false;
        }
        p50 p50Var = gaVar.y0.f;
        if (p50Var != null) {
            p50Var.c = str;
        }
        g();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(bv bvVar) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.j0 = bvVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.j0 = bv.b(gaVar.s0, i);
        }
    }

    public void setIconEndPadding(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.a0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.a0(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.b0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.b0(gaVar.s0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(kt ktVar) {
        this.o = ktVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.j == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            o8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            o8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.R0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            o8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.c0(colorStateList);
        }
        this.j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.c0(j8.q(gaVar.s0, i));
            this.j.getClass();
            e();
        }
    }

    @Override // defpackage.y20
    public void setShapeAppearanceModel(n20 n20Var) {
        this.j.setShapeAppearanceModel(n20Var);
    }

    public void setShowMotionSpec(bv bvVar) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.i0 = bvVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.i0 = bv.b(gaVar.s0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            o8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ga gaVar = this.j;
        if (gaVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(gaVar.Q0 ? null : charSequence, bufferType);
        ga gaVar2 = this.j;
        if (gaVar2 == null || TextUtils.equals(gaVar2.S, charSequence)) {
            return;
        }
        gaVar2.S = charSequence;
        gaVar2.y0.d = true;
        gaVar2.invalidateSelf();
        gaVar2.G();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.d0(new p50(gaVar.s0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.o0 == f) {
            return;
        }
        gaVar.o0 = f;
        gaVar.invalidateSelf();
        gaVar.G();
    }

    public void setTextEndPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            float dimension = gaVar.s0.getResources().getDimension(i);
            if (gaVar.o0 != dimension) {
                gaVar.o0 = dimension;
                gaVar.invalidateSelf();
                gaVar.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ga gaVar = this.j;
        if (gaVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            s50 s50Var = gaVar.y0;
            p50 p50Var = s50Var.f;
            if (p50Var != null) {
                p50Var.l = applyDimension;
                s50Var.a.setTextSize(applyDimension);
                gaVar.G();
                gaVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        ga gaVar = this.j;
        if (gaVar == null || gaVar.n0 == f) {
            return;
        }
        gaVar.n0 = f;
        gaVar.invalidateSelf();
        gaVar.G();
    }

    public void setTextStartPaddingResource(int i) {
        ga gaVar = this.j;
        if (gaVar != null) {
            float dimension = gaVar.s0.getResources().getDimension(i);
            if (gaVar.n0 != dimension) {
                gaVar.n0 = dimension;
                gaVar.invalidateSelf();
                gaVar.G();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.Z(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.L(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.Q(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            o8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            o8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            o8.w("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            o8.w("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(p50 p50Var) {
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.d0(p50Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ga gaVar = this.j;
        if (gaVar != null) {
            gaVar.d0(new p50(gaVar.s0, i));
        }
        g();
    }
}
