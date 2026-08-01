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
import defpackage.ba0;
import defpackage.bi;
import defpackage.c70;
import defpackage.d50;
import defpackage.e9;
import defpackage.gd0;
import defpackage.hm0;
import defpackage.mv;
import defpackage.n9;
import defpackage.oh0;
import defpackage.pb;
import defpackage.ph0;
import defpackage.qb;
import defpackage.qh0;
import defpackage.r20;
import defpackage.rb;
import defpackage.rd0;
import defpackage.s9;
import defpackage.sb;
import defpackage.x8;
import defpackage.y3;
import defpackage.z00;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class Chip extends y3 implements rd0, Checkable {
    public static final Rect C = new Rect();
    public static final int[] D = {R.attr.state_selected};
    public static final int[] E = {R.attr.state_checkable};
    public final RectF A;
    public final pb B;
    public sb j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View.OnClickListener m;
    public CompoundButton.OnCheckedChangeListener n;
    public z00 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public CharSequence w;
    public final rb x;
    public boolean y;
    public final Rect z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.trembin.nirefon.betfury.R.attr.chipStyle);
        int resourceId;
        this.z = new Rect();
        this.A = new RectF();
        this.B = new pb(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                s9.y("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                s9.y("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                s9.y("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                s9.y("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                s9.y("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        sb sbVar = new sb(context2, attributeSet);
        Context context3 = sbVar.t0;
        int[] iArr = c70.e;
        TypedArray E2 = d50.E(context3, attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        sbVar.T0 = E2.hasValue(39);
        Context context4 = sbVar.t0;
        ColorStateList r = mv.r(context4, E2, 25);
        if (sbVar.M != r) {
            sbVar.M = r;
            sbVar.onStateChange(sbVar.getState());
        }
        ColorStateList r2 = mv.r(context4, E2, 12);
        if (sbVar.N != r2) {
            sbVar.N = r2;
            sbVar.onStateChange(sbVar.getState());
        }
        float dimension = E2.getDimension(20, 0.0f);
        if (sbVar.O != dimension) {
            sbVar.O = dimension;
            sbVar.invalidateSelf();
            sbVar.G();
        }
        if (E2.hasValue(13)) {
            sbVar.M(E2.getDimension(13, 0.0f));
        }
        sbVar.R(mv.r(context4, E2, 23));
        sbVar.S(E2.getDimension(24, 0.0f));
        sbVar.c0(mv.r(context4, E2, 38));
        String text = E2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(sbVar.T, text)) {
            sbVar.T = text;
            sbVar.z0.d = true;
            sbVar.invalidateSelf();
            sbVar.G();
        }
        oh0 oh0Var = (!E2.hasValue(0) || (resourceId = E2.getResourceId(0, 0)) == 0) ? null : new oh0(context4, resourceId);
        oh0Var.l = E2.getDimension(1, oh0Var.l);
        int i = E2.hasValue(34) ? 34 : 7;
        if (E2.hasValue(i)) {
            oh0Var.c = E2.getString(i);
        }
        sbVar.d0(oh0Var);
        int i2 = E2.getInt(3, 0);
        if (i2 == 1) {
            sbVar.Q0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            sbVar.Q0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            sbVar.Q0 = TextUtils.TruncateAt.END;
        }
        sbVar.Q(E2.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            sbVar.Q(E2.getBoolean(16, false));
        }
        sbVar.N(mv.s(context4, E2, 15));
        if (E2.hasValue(18)) {
            sbVar.P(mv.r(context4, E2, 18));
        }
        sbVar.O(E2.getDimension(17, -1.0f));
        sbVar.Z(E2.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            sbVar.Z(E2.getBoolean(27, false));
        }
        sbVar.T(mv.s(context4, E2, 26));
        sbVar.Y(mv.r(context4, E2, 31));
        sbVar.V(E2.getDimension(29, 0.0f));
        sbVar.I(E2.getBoolean(6, false));
        sbVar.L(E2.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            sbVar.L(E2.getBoolean(9, false));
        }
        sbVar.J(mv.s(context4, E2, 8));
        if (E2.hasValue(10)) {
            sbVar.K(mv.r(context4, E2, 10));
        }
        sbVar.j0 = r20.a(context4, E2, 41);
        sbVar.k0 = r20.a(context4, E2, 35);
        float dimension2 = E2.getDimension(22, 0.0f);
        if (sbVar.l0 != dimension2) {
            sbVar.l0 = dimension2;
            sbVar.invalidateSelf();
            sbVar.G();
        }
        sbVar.b0(E2.getDimension(37, 0.0f));
        sbVar.a0(E2.getDimension(36, 0.0f));
        float dimension3 = E2.getDimension(43, 0.0f);
        if (sbVar.o0 != dimension3) {
            sbVar.o0 = dimension3;
            sbVar.invalidateSelf();
            sbVar.G();
        }
        float dimension4 = E2.getDimension(42, 0.0f);
        if (sbVar.p0 != dimension4) {
            sbVar.p0 = dimension4;
            sbVar.invalidateSelf();
            sbVar.G();
        }
        sbVar.W(E2.getDimension(30, 0.0f));
        sbVar.U(E2.getDimension(28, 0.0f));
        float dimension5 = E2.getDimension(14, 0.0f);
        if (sbVar.s0 != dimension5) {
            sbVar.s0 = dimension5;
            sbVar.invalidateSelf();
            sbVar.G();
        }
        sbVar.S0 = E2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        E2.recycle();
        d50.e(context2, attributeSet, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action);
        d50.g(context2, attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action);
        this.t = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue J = n9.J(theme, com.trembin.nirefon.betfury.R.attr.minTouchTargetSize);
        this.v = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((J == null || J.type != 5) ? Float.NaN : J.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.trembin.nirefon.betfury.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(sbVar);
        sbVar.q(getElevation());
        d50.e(context2, attributeSet, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action);
        d50.g(context2, attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.chipStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.x = new rb(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new qb(this));
        }
        setChecked(this.p);
        setText(sbVar.T);
        setEllipsize(sbVar.Q0);
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
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ob
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = Chip.this;
                z00 z00Var = chip.o;
                if (z00Var != null) {
                    gb gbVar = (gb) ((o0) z00Var).g;
                    if (!z ? gbVar.e(chip, gbVar.e) : gbVar.a(chip)) {
                        gbVar.d();
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
            sb sbVar = this.j;
            Rect bounds = sbVar.getBounds();
            rectF.setEmpty();
            if (sbVar.g0()) {
                float f = sbVar.s0 + sbVar.r0 + sbVar.d0 + sbVar.q0 + sbVar.p0;
                if (sbVar.getLayoutDirection() == 0) {
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

    private oh0 getTextAppearance() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.z0.f;
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
        sb sbVar = this.j;
        if (sbVar == null) {
            return false;
        }
        Drawable drawable = sbVar.a0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        sb sbVar;
        if (!c() || (sbVar = this.j) == null || !sbVar.Z || this.m == null) {
            hm0.m(this, null);
            this.y = false;
        } else {
            hm0.m(this, this.x);
            this.y = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.y) {
            return super.dispatchHoverEvent(motionEvent);
        }
        rb rbVar = this.x;
        AccessibilityManager accessibilityManager = rbVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = rbVar.n;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = rbVar.m;
                if (i3 != i2) {
                    rbVar.m = i2;
                    rbVar.q(i2, 128);
                    rbVar.q(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = rbVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    rbVar.m = Integer.MIN_VALUE;
                    rbVar.q(Integer.MIN_VALUE, 128);
                    rbVar.q(i, 256);
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
        rb rbVar = this.x;
        rbVar.getClass();
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
                                while (i < repeatCount && rbVar.m(i2, null)) {
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
                    int i3 = rbVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = rbVar.n;
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
                z = rbVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = rbVar.m(1, null);
            }
        }
        if (!z || rbVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.y3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        sb sbVar = this.j;
        boolean z = false;
        int i = 0;
        z = false;
        if (sbVar != null && sb.F(sbVar.a0)) {
            sb sbVar2 = this.j;
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
            z = sbVar2.X(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(ba0.a(this.j.S), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.j);
        this.l = rippleDrawable;
        this.j.getClass();
        setBackground(this.l);
        f();
    }

    public final void f() {
        sb sbVar;
        if (TextUtils.isEmpty(getText()) || (sbVar = this.j) == null) {
            return;
        }
        int C2 = (int) (sbVar.C() + sbVar.s0 + sbVar.p0);
        sb sbVar2 = this.j;
        int B = (int) (sbVar2.B() + sbVar2.l0 + sbVar2.o0);
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
        sb sbVar = this.j;
        if (sbVar != null) {
            paint.drawableState = sbVar.getState();
        }
        oh0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.B);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        sb sbVar = this.j;
        if (sbVar == null || !sbVar.f0) {
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
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.h0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.i0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.N;
        }
        return null;
    }

    public float getChipCornerRadius() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return Math.max(0.0f, sbVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.s0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        sb sbVar = this.j;
        if (sbVar == null || (drawable = sbVar.V) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.W;
        }
        return null;
    }

    public float getChipMinHeight() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.O;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.l0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.Q;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.R;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        sb sbVar = this.j;
        if (sbVar == null || (drawable = sbVar.a0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.e0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.r0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.d0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.c0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.y) {
            rb rbVar = this.x;
            if (rbVar.l == 1 || rbVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        sb sbVar = this.j;
        if (sbVar == null) {
            return super.getFontVariationSettings();
        }
        oh0 oh0Var = sbVar.z0.f;
        if (oh0Var != null) {
            return oh0Var.c;
        }
        return null;
    }

    public r20 getHideMotionSpec() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.k0;
        }
        return null;
    }

    public float getIconEndPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.n0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.m0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.S;
        }
        return null;
    }

    public gd0 getShapeAppearanceModel() {
        return this.j.i();
    }

    public r20 getShowMotionSpec() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.j0;
        }
        return null;
    }

    public float getTextEndPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.p0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        sb sbVar = this.j;
        if (sbVar != null) {
            return sbVar.o0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d50.Y(this, this.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        sb sbVar = this.j;
        if (sbVar != null && sbVar.f0) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.y) {
            rb rbVar = this.x;
            int i2 = rbVar.l;
            if (i2 != Integer.MIN_VALUE) {
                rbVar.j(i2);
            }
            if (z) {
                rbVar.m(i, rect);
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
        sb sbVar = this.j;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(sbVar != null && sbVar.f0);
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
            Object tag = getTag(com.trembin.nirefon.betfury.R.id.row_index_key);
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

    @Override // defpackage.y3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.y3, android.view.View
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
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.I(z);
        }
    }

    public void setCheckableResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.I(sbVar.t0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        sb sbVar = this.j;
        if (sbVar == null) {
            this.p = z;
        } else if (sbVar.f0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.J(drawable);
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
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.J(d50.v(sbVar.t0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.K(bi.A(sbVar.t0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.L(sbVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.N == colorStateList) {
            return;
        }
        sbVar.N = colorStateList;
        sbVar.onStateChange(sbVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A;
        sb sbVar = this.j;
        if (sbVar == null || sbVar.N == (A = bi.A(sbVar.t0, i))) {
            return;
        }
        sbVar.N = A;
        sbVar.onStateChange(sbVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.M(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(sb sbVar) {
        sb sbVar2 = this.j;
        if (sbVar2 != sbVar) {
            if (sbVar2 != null) {
                sbVar2.P0 = new WeakReference(null);
            }
            this.j = sbVar;
            sbVar.R0 = false;
            sbVar.P0 = new WeakReference(this);
            b(this.v);
        }
    }

    public void setChipEndPadding(float f) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.s0 == f) {
            return;
        }
        sbVar.s0 = f;
        sbVar.invalidateSelf();
        sbVar.G();
    }

    public void setChipEndPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            float dimension = sbVar.t0.getResources().getDimension(i);
            if (sbVar.s0 != dimension) {
                sbVar.s0 = dimension;
                sbVar.invalidateSelf();
                sbVar.G();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.N(drawable);
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
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.N(d50.v(sbVar.t0, i));
        }
    }

    public void setChipIconSize(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.O(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.O(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.P(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.P(bi.A(sbVar.t0, i));
        }
    }

    public void setChipIconVisible(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.Q(sbVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.O == f) {
            return;
        }
        sbVar.O = f;
        sbVar.invalidateSelf();
        sbVar.G();
    }

    public void setChipMinHeightResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            float dimension = sbVar.t0.getResources().getDimension(i);
            if (sbVar.O != dimension) {
                sbVar.O = dimension;
                sbVar.invalidateSelf();
                sbVar.G();
            }
        }
    }

    public void setChipStartPadding(float f) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.l0 == f) {
            return;
        }
        sbVar.l0 = f;
        sbVar.invalidateSelf();
        sbVar.G();
    }

    public void setChipStartPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            float dimension = sbVar.t0.getResources().getDimension(i);
            if (sbVar.l0 != dimension) {
                sbVar.l0 = dimension;
                sbVar.invalidateSelf();
                sbVar.G();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.R(bi.A(sbVar.t0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.S(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.S(sbVar.t0.getResources().getDimension(i));
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
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.T(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.e0 == charSequence) {
            return;
        }
        String str = x8.b;
        x8 x8Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? x8.e : x8.d;
        x8Var.getClass();
        e9 e9Var = ph0.a;
        sbVar.e0 = x8Var.c(charSequence);
        sbVar.invalidateSelf();
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
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.U(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.U(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.T(d50.v(sbVar.t0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.V(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.V(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.W(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.W(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.Y(bi.A(sbVar.t0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.y3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            s9.y("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            s9.y("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.y3, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            s9.y("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            s9.y("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            s9.y("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            s9.y("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            s9.y("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            s9.y("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            s9.y("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.Q0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.t = z;
        b(this.v);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        sb sbVar = this.j;
        if (sbVar == null) {
            return false;
        }
        oh0 oh0Var = sbVar.z0.f;
        if (oh0Var != null) {
            oh0Var.c = str;
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

    public void setHideMotionSpec(r20 r20Var) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.k0 = r20Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.k0 = r20.b(sbVar.t0, i);
        }
    }

    public void setIconEndPadding(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.a0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.a0(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.b0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.b0(sbVar.t0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(z00 z00Var) {
        this.o = z00Var;
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
            s9.y("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            s9.y("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.S0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            s9.y("Chip does not support multi-line text");
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
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.c0(colorStateList);
        }
        this.j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.c0(bi.A(sbVar.t0, i));
            this.j.getClass();
            e();
        }
    }

    @Override // defpackage.rd0
    public void setShapeAppearanceModel(gd0 gd0Var) {
        this.j.setShapeAppearanceModel(gd0Var);
    }

    public void setShowMotionSpec(r20 r20Var) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.j0 = r20Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.j0 = r20.b(sbVar.t0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            s9.y("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        sb sbVar = this.j;
        if (sbVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(sbVar.R0 ? null : charSequence, bufferType);
        sb sbVar2 = this.j;
        if (sbVar2 == null || TextUtils.equals(sbVar2.T, charSequence)) {
            return;
        }
        sbVar2.T = charSequence;
        sbVar2.z0.d = true;
        sbVar2.invalidateSelf();
        sbVar2.G();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.d0(new oh0(sbVar.t0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.p0 == f) {
            return;
        }
        sbVar.p0 = f;
        sbVar.invalidateSelf();
        sbVar.G();
    }

    public void setTextEndPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            float dimension = sbVar.t0.getResources().getDimension(i);
            if (sbVar.p0 != dimension) {
                sbVar.p0 = dimension;
                sbVar.invalidateSelf();
                sbVar.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        sb sbVar = this.j;
        if (sbVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            qh0 qh0Var = sbVar.z0;
            oh0 oh0Var = qh0Var.f;
            if (oh0Var != null) {
                oh0Var.l = applyDimension;
                qh0Var.a.setTextSize(applyDimension);
                sbVar.G();
                sbVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        sb sbVar = this.j;
        if (sbVar == null || sbVar.o0 == f) {
            return;
        }
        sbVar.o0 = f;
        sbVar.invalidateSelf();
        sbVar.G();
    }

    public void setTextStartPaddingResource(int i) {
        sb sbVar = this.j;
        if (sbVar != null) {
            float dimension = sbVar.t0.getResources().getDimension(i);
            if (sbVar.o0 != dimension) {
                sbVar.o0 = dimension;
                sbVar.invalidateSelf();
                sbVar.G();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.Z(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.L(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.Q(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            s9.y("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            s9.y("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            s9.y("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            s9.y("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(oh0 oh0Var) {
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.d0(oh0Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        sb sbVar = this.j;
        if (sbVar != null) {
            sbVar.d0(new oh0(sbVar.t0, i));
        }
        g();
    }
}
