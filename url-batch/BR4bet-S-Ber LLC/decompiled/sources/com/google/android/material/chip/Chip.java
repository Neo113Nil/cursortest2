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
import defpackage.b9;
import defpackage.f50;
import defpackage.g9;
import defpackage.ic0;
import defpackage.kr;
import defpackage.la0;
import defpackage.m8;
import defpackage.mz;
import defpackage.nx;
import defpackage.p80;
import defpackage.q3;
import defpackage.q50;
import defpackage.q80;
import defpackage.r30;
import defpackage.r80;
import defpackage.s8;
import defpackage.ta;
import defpackage.ua;
import defpackage.va;
import defpackage.wa;
import defpackage.wv;
import defpackage.y00;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class Chip extends q3 implements q50, Checkable {
    public static final Rect C = new Rect();
    public static final int[] D = {R.attr.state_selected};
    public static final int[] E = {R.attr.state_checkable};
    public final RectF A;
    public final ta B;
    public wa j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View.OnClickListener m;
    public CompoundButton.OnCheckedChangeListener n;
    public wv o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public CharSequence w;
    public final va x;
    public boolean y;
    public final Rect z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.moontiko.really.admiralcasino.R.attr.chipStyle);
        int resourceId;
        this.z = new Rect();
        this.A = new RectF();
        this.B = new ta(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                g9.u("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                g9.u("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                g9.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                g9.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                g9.u("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        wa waVar = new wa(context2, attributeSet);
        Context context3 = waVar.t0;
        int[] iArr = y00.e;
        TypedArray O = la0.O(context3, attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        waVar.T0 = O.hasValue(39);
        Context context4 = waVar.t0;
        ColorStateList w = kr.w(context4, O, 25);
        if (waVar.M != w) {
            waVar.M = w;
            waVar.onStateChange(waVar.getState());
        }
        ColorStateList w2 = kr.w(context4, O, 12);
        if (waVar.N != w2) {
            waVar.N = w2;
            waVar.onStateChange(waVar.getState());
        }
        float dimension = O.getDimension(20, 0.0f);
        if (waVar.O != dimension) {
            waVar.O = dimension;
            waVar.invalidateSelf();
            waVar.G();
        }
        if (O.hasValue(13)) {
            waVar.M(O.getDimension(13, 0.0f));
        }
        waVar.R(kr.w(context4, O, 23));
        waVar.S(O.getDimension(24, 0.0f));
        waVar.c0(kr.w(context4, O, 38));
        String text = O.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(waVar.T, text)) {
            waVar.T = text;
            waVar.z0.d = true;
            waVar.invalidateSelf();
            waVar.G();
        }
        p80 p80Var = (!O.hasValue(0) || (resourceId = O.getResourceId(0, 0)) == 0) ? null : new p80(context4, resourceId);
        p80Var.l = O.getDimension(1, p80Var.l);
        int i = O.hasValue(34) ? 34 : 7;
        if (O.hasValue(i)) {
            p80Var.c = O.getString(i);
        }
        waVar.d0(p80Var);
        int i2 = O.getInt(3, 0);
        if (i2 == 1) {
            waVar.Q0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            waVar.Q0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            waVar.Q0 = TextUtils.TruncateAt.END;
        }
        waVar.Q(O.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            waVar.Q(O.getBoolean(16, false));
        }
        waVar.N(kr.y(context4, O, 15));
        if (O.hasValue(18)) {
            waVar.P(kr.w(context4, O, 18));
        }
        waVar.O(O.getDimension(17, -1.0f));
        waVar.Z(O.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            waVar.Z(O.getBoolean(27, false));
        }
        waVar.T(kr.y(context4, O, 26));
        waVar.Y(kr.w(context4, O, 31));
        waVar.V(O.getDimension(29, 0.0f));
        waVar.I(O.getBoolean(6, false));
        waVar.L(O.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            waVar.L(O.getBoolean(9, false));
        }
        waVar.J(kr.y(context4, O, 8));
        if (O.hasValue(10)) {
            waVar.K(kr.w(context4, O, 10));
        }
        waVar.j0 = nx.a(context4, O, 41);
        waVar.k0 = nx.a(context4, O, 35);
        float dimension2 = O.getDimension(22, 0.0f);
        if (waVar.l0 != dimension2) {
            waVar.l0 = dimension2;
            waVar.invalidateSelf();
            waVar.G();
        }
        waVar.b0(O.getDimension(37, 0.0f));
        waVar.a0(O.getDimension(36, 0.0f));
        float dimension3 = O.getDimension(43, 0.0f);
        if (waVar.o0 != dimension3) {
            waVar.o0 = dimension3;
            waVar.invalidateSelf();
            waVar.G();
        }
        float dimension4 = O.getDimension(42, 0.0f);
        if (waVar.p0 != dimension4) {
            waVar.p0 = dimension4;
            waVar.invalidateSelf();
            waVar.G();
        }
        waVar.W(O.getDimension(30, 0.0f));
        waVar.U(O.getDimension(28, 0.0f));
        float dimension5 = O.getDimension(14, 0.0f);
        if (waVar.s0 != dimension5) {
            waVar.s0 = dimension5;
            waVar.invalidateSelf();
            waVar.G();
        }
        waVar.S0 = O.getDimensionPixelSize(4, Integer.MAX_VALUE);
        O.recycle();
        la0.j(context2, attributeSet, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action);
        la0.m(context2, attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action);
        this.t = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue K = b9.K(theme, com.moontiko.really.admiralcasino.R.attr.minTouchTargetSize);
        this.v = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((K == null || K.type != 5) ? Float.NaN : K.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.moontiko.really.admiralcasino.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(waVar);
        waVar.q(getElevation());
        la0.j(context2, attributeSet, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action);
        la0.m(context2, attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.chipStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.x = new va(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new ua(this));
        }
        setChecked(this.p);
        setText(waVar.T);
        setEllipsize(waVar.Q0);
        g();
        if (!this.j.R0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.t) {
            setMinHeight(this.v);
        }
        this.u = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sa
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = Chip.this;
                wv wvVar = chip.o;
                if (wvVar != null) {
                    ma maVar = (ma) ((rc0) wvVar).g;
                    if (!z ? maVar.e(chip, maVar.e) : maVar.a(chip)) {
                        maVar.d();
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
            wa waVar = this.j;
            Rect bounds = waVar.getBounds();
            rectF.setEmpty();
            if (waVar.g0()) {
                float f = waVar.s0 + waVar.r0 + waVar.d0 + waVar.q0 + waVar.p0;
                if (waVar.getLayoutDirection() == 0) {
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

    private p80 getTextAppearance() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.z0.f;
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
        int max = Math.max(0, i - ((int) this.j.O));
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
        wa waVar = this.j;
        if (waVar == null) {
            return false;
        }
        Drawable drawable = waVar.a0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        wa waVar;
        if (!c() || (waVar = this.j) == null || !waVar.Z || this.m == null) {
            ic0.m(this, null);
            this.y = false;
        } else {
            ic0.m(this, this.x);
            this.y = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.y) {
            return super.dispatchHoverEvent(motionEvent);
        }
        va vaVar = this.x;
        AccessibilityManager accessibilityManager = vaVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = vaVar.n;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = vaVar.m;
                if (i3 != i2) {
                    vaVar.m = i2;
                    vaVar.q(i2, 128);
                    vaVar.q(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = vaVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    vaVar.m = Integer.MIN_VALUE;
                    vaVar.q(Integer.MIN_VALUE, 128);
                    vaVar.q(i, 256);
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
        va vaVar = this.x;
        vaVar.getClass();
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
                                while (i < repeatCount && vaVar.m(i2, null)) {
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
                    int i3 = vaVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = vaVar.n;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.y) {
                                chip.x.q(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = vaVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = vaVar.m(1, null);
            }
        }
        if (!z || vaVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.q3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wa waVar = this.j;
        boolean z = false;
        int i = 0;
        z = false;
        if (waVar != null && wa.F(waVar.a0)) {
            wa waVar2 = this.j;
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
            z = waVar2.X(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(r30.a(this.j.S), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.j);
        this.l = rippleDrawable;
        this.j.getClass();
        setBackground(this.l);
        f();
    }

    public final void f() {
        wa waVar;
        if (TextUtils.isEmpty(getText()) || (waVar = this.j) == null) {
            return;
        }
        int C2 = (int) (waVar.C() + waVar.s0 + waVar.p0);
        wa waVar2 = this.j;
        int B = (int) (waVar2.B() + waVar2.l0 + waVar2.o0);
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
        wa waVar = this.j;
        if (waVar != null) {
            paint.drawableState = waVar.getState();
        }
        p80 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.B);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        wa waVar = this.j;
        if (waVar == null || !waVar.f0) {
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
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.h0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.i0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.N;
        }
        return null;
    }

    public float getChipCornerRadius() {
        wa waVar = this.j;
        if (waVar != null) {
            return Math.max(0.0f, waVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.s0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        wa waVar = this.j;
        if (waVar == null || (drawable = waVar.V) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.W;
        }
        return null;
    }

    public float getChipMinHeight() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.O;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.l0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.Q;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.R;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        wa waVar = this.j;
        if (waVar == null || (drawable = waVar.a0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.e0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.r0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.d0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.c0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.y) {
            va vaVar = this.x;
            if (vaVar.l == 1 || vaVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        wa waVar = this.j;
        if (waVar == null) {
            return super.getFontVariationSettings();
        }
        p80 p80Var = waVar.z0.f;
        if (p80Var != null) {
            return p80Var.c;
        }
        return null;
    }

    public nx getHideMotionSpec() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.k0;
        }
        return null;
    }

    public float getIconEndPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.n0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.m0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.S;
        }
        return null;
    }

    public f50 getShapeAppearanceModel() {
        return this.j.i();
    }

    public nx getShowMotionSpec() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.j0;
        }
        return null;
    }

    public float getTextEndPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.p0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        wa waVar = this.j;
        if (waVar != null) {
            return waVar.o0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mz.J(this, this.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        wa waVar = this.j;
        if (waVar != null && waVar.f0) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.y) {
            va vaVar = this.x;
            int i2 = vaVar.l;
            if (i2 != Integer.MIN_VALUE) {
                vaVar.j(i2);
            }
            if (z) {
                vaVar.m(i, rect);
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
        wa waVar = this.j;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(waVar != null && waVar.f0);
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
            Object tag = getTag(com.moontiko.really.admiralcasino.R.id.row_index_key);
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
                    this.x.q(1, 1);
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

    @Override // defpackage.q3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.q3, android.view.View
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
        wa waVar = this.j;
        if (waVar != null) {
            waVar.I(z);
        }
    }

    public void setCheckableResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.I(waVar.t0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        wa waVar = this.j;
        if (waVar == null) {
            this.p = z;
        } else if (waVar.f0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.J(drawable);
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
        wa waVar = this.j;
        if (waVar != null) {
            waVar.J(mz.m(waVar.t0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.K(la0.w(waVar.t0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.L(waVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        wa waVar = this.j;
        if (waVar == null || waVar.N == colorStateList) {
            return;
        }
        waVar.N = colorStateList;
        waVar.onStateChange(waVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList w;
        wa waVar = this.j;
        if (waVar == null || waVar.N == (w = la0.w(waVar.t0, i))) {
            return;
        }
        waVar.N = w;
        waVar.onStateChange(waVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.M(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(wa waVar) {
        wa waVar2 = this.j;
        if (waVar2 != waVar) {
            if (waVar2 != null) {
                waVar2.P0 = new WeakReference(null);
            }
            this.j = waVar;
            waVar.R0 = false;
            waVar.P0 = new WeakReference(this);
            b(this.v);
        }
    }

    public void setChipEndPadding(float f) {
        wa waVar = this.j;
        if (waVar == null || waVar.s0 == f) {
            return;
        }
        waVar.s0 = f;
        waVar.invalidateSelf();
        waVar.G();
    }

    public void setChipEndPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            float dimension = waVar.t0.getResources().getDimension(i);
            if (waVar.s0 != dimension) {
                waVar.s0 = dimension;
                waVar.invalidateSelf();
                waVar.G();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.N(drawable);
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
        wa waVar = this.j;
        if (waVar != null) {
            waVar.N(mz.m(waVar.t0, i));
        }
    }

    public void setChipIconSize(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.O(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.O(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.P(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.P(la0.w(waVar.t0, i));
        }
    }

    public void setChipIconVisible(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.Q(waVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        wa waVar = this.j;
        if (waVar == null || waVar.O == f) {
            return;
        }
        waVar.O = f;
        waVar.invalidateSelf();
        waVar.G();
    }

    public void setChipMinHeightResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            float dimension = waVar.t0.getResources().getDimension(i);
            if (waVar.O != dimension) {
                waVar.O = dimension;
                waVar.invalidateSelf();
                waVar.G();
            }
        }
    }

    public void setChipStartPadding(float f) {
        wa waVar = this.j;
        if (waVar == null || waVar.l0 == f) {
            return;
        }
        waVar.l0 = f;
        waVar.invalidateSelf();
        waVar.G();
    }

    public void setChipStartPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            float dimension = waVar.t0.getResources().getDimension(i);
            if (waVar.l0 != dimension) {
                waVar.l0 = dimension;
                waVar.invalidateSelf();
                waVar.G();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.R(la0.w(waVar.t0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.S(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.S(waVar.t0.getResources().getDimension(i));
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
        wa waVar = this.j;
        if (waVar != null) {
            waVar.T(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        wa waVar = this.j;
        if (waVar == null || waVar.e0 == charSequence) {
            return;
        }
        String str = m8.b;
        m8 m8Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? m8.e : m8.d;
        m8Var.getClass();
        s8 s8Var = q80.a;
        waVar.e0 = m8Var.c(charSequence);
        waVar.invalidateSelf();
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
        wa waVar = this.j;
        if (waVar != null) {
            waVar.U(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.U(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.T(mz.m(waVar.t0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.V(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.V(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.W(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.W(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.Y(la0.w(waVar.t0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.q3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            g9.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            g9.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.q3, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            g9.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            g9.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            g9.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            g9.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            g9.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            g9.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        wa waVar = this.j;
        if (waVar != null) {
            waVar.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            g9.u("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        wa waVar = this.j;
        if (waVar != null) {
            waVar.Q0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.t = z;
        b(this.v);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        wa waVar = this.j;
        if (waVar == null) {
            return false;
        }
        p80 p80Var = waVar.z0.f;
        if (p80Var != null) {
            p80Var.c = str;
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

    public void setHideMotionSpec(nx nxVar) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.k0 = nxVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.k0 = nx.b(waVar.t0, i);
        }
    }

    public void setIconEndPadding(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.a0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.a0(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.b0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.b0(waVar.t0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(wv wvVar) {
        this.o = wvVar;
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
            g9.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            g9.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        wa waVar = this.j;
        if (waVar != null) {
            waVar.S0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            g9.u("Chip does not support multi-line text");
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
        wa waVar = this.j;
        if (waVar != null) {
            waVar.c0(colorStateList);
        }
        this.j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.c0(la0.w(waVar.t0, i));
            this.j.getClass();
            e();
        }
    }

    @Override // defpackage.q50
    public void setShapeAppearanceModel(f50 f50Var) {
        this.j.setShapeAppearanceModel(f50Var);
    }

    public void setShowMotionSpec(nx nxVar) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.j0 = nxVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.j0 = nx.b(waVar.t0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            g9.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        wa waVar = this.j;
        if (waVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(waVar.R0 ? null : charSequence, bufferType);
        wa waVar2 = this.j;
        if (waVar2 == null || TextUtils.equals(waVar2.T, charSequence)) {
            return;
        }
        waVar2.T = charSequence;
        waVar2.z0.d = true;
        waVar2.invalidateSelf();
        waVar2.G();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wa waVar = this.j;
        if (waVar != null) {
            waVar.d0(new p80(waVar.t0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        wa waVar = this.j;
        if (waVar == null || waVar.p0 == f) {
            return;
        }
        waVar.p0 = f;
        waVar.invalidateSelf();
        waVar.G();
    }

    public void setTextEndPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            float dimension = waVar.t0.getResources().getDimension(i);
            if (waVar.p0 != dimension) {
                waVar.p0 = dimension;
                waVar.invalidateSelf();
                waVar.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        wa waVar = this.j;
        if (waVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            r80 r80Var = waVar.z0;
            p80 p80Var = r80Var.f;
            if (p80Var != null) {
                p80Var.l = applyDimension;
                r80Var.a.setTextSize(applyDimension);
                waVar.G();
                waVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        wa waVar = this.j;
        if (waVar == null || waVar.o0 == f) {
            return;
        }
        waVar.o0 = f;
        waVar.invalidateSelf();
        waVar.G();
    }

    public void setTextStartPaddingResource(int i) {
        wa waVar = this.j;
        if (waVar != null) {
            float dimension = waVar.t0.getResources().getDimension(i);
            if (waVar.o0 != dimension) {
                waVar.o0 = dimension;
                waVar.invalidateSelf();
                waVar.G();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.Z(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.L(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.Q(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            g9.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            g9.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            g9.u("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            g9.u("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(p80 p80Var) {
        wa waVar = this.j;
        if (waVar != null) {
            waVar.d0(p80Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        wa waVar = this.j;
        if (waVar != null) {
            waVar.d0(new p80(waVar.t0, i));
        }
        g();
    }
}
