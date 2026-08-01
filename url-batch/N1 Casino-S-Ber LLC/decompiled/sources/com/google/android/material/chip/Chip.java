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
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.d20;
import defpackage.e70;
import defpackage.e8;
import defpackage.fa;
import defpackage.g3;
import defpackage.ga;
import defpackage.ha;
import defpackage.i50;
import defpackage.ia;
import defpackage.j50;
import defpackage.k50;
import defpackage.m00;
import defpackage.mu;
import defpackage.o20;
import defpackage.o8;
import defpackage.t8;
import defpackage.vs;
import defpackage.vx;
import defpackage.x80;
import defpackage.z7;
import defpackage.zo;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class Chip extends g3 implements o20, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final fa A;
    public ia j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View.OnClickListener m;
    public CompoundButton.OnCheckedChangeListener n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public CharSequence v;
    public final ha w;
    public boolean x;
    public final Rect y;
    public final RectF z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.derinko.gbini.n1casino.R.attr.chipStyle);
        int resourceId;
        this.y = new Rect();
        this.z = new RectF();
        this.A = new fa(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                t8.w("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                t8.w("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                t8.w("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                t8.w("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                t8.w("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ia iaVar = new ia(context2, attributeSet);
        Context context3 = iaVar.t0;
        int[] iArr = vx.e;
        TypedArray W = o8.W(context3, attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        iaVar.T0 = W.hasValue(39);
        Context context4 = iaVar.t0;
        ColorStateList y = e70.y(context4, W, 25);
        if (iaVar.M != y) {
            iaVar.M = y;
            iaVar.onStateChange(iaVar.getState());
        }
        ColorStateList y2 = e70.y(context4, W, 12);
        if (iaVar.N != y2) {
            iaVar.N = y2;
            iaVar.onStateChange(iaVar.getState());
        }
        float dimension = W.getDimension(20, 0.0f);
        if (iaVar.O != dimension) {
            iaVar.O = dimension;
            iaVar.invalidateSelf();
            iaVar.G();
        }
        if (W.hasValue(13)) {
            iaVar.M(W.getDimension(13, 0.0f));
        }
        iaVar.R(e70.y(context4, W, 23));
        iaVar.S(W.getDimension(24, 0.0f));
        iaVar.c0(e70.y(context4, W, 38));
        String text = W.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(iaVar.T, text)) {
            iaVar.T = text;
            iaVar.z0.d = true;
            iaVar.invalidateSelf();
            iaVar.G();
        }
        i50 i50Var = (!W.hasValue(0) || (resourceId = W.getResourceId(0, 0)) == 0) ? null : new i50(context4, resourceId);
        i50Var.l = W.getDimension(1, i50Var.l);
        int i = W.hasValue(34) ? 34 : 7;
        if (W.hasValue(i)) {
            i50Var.c = W.getString(i);
        }
        iaVar.d0(i50Var);
        int i2 = W.getInt(3, 0);
        if (i2 == 1) {
            iaVar.Q0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            iaVar.Q0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            iaVar.Q0 = TextUtils.TruncateAt.END;
        }
        iaVar.Q(W.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            iaVar.Q(W.getBoolean(16, false));
        }
        iaVar.N(e70.z(context4, W, 15));
        if (W.hasValue(18)) {
            iaVar.P(e70.y(context4, W, 18));
        }
        iaVar.O(W.getDimension(17, -1.0f));
        iaVar.Z(W.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            iaVar.Z(W.getBoolean(27, false));
        }
        iaVar.T(e70.z(context4, W, 26));
        iaVar.Y(e70.y(context4, W, 31));
        iaVar.V(W.getDimension(29, 0.0f));
        iaVar.I(W.getBoolean(6, false));
        iaVar.L(W.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            iaVar.L(W.getBoolean(9, false));
        }
        iaVar.J(e70.z(context4, W, 8));
        if (W.hasValue(10)) {
            iaVar.K(e70.y(context4, W, 10));
        }
        iaVar.j0 = mu.a(context4, W, 41);
        iaVar.k0 = mu.a(context4, W, 35);
        float dimension2 = W.getDimension(22, 0.0f);
        if (iaVar.l0 != dimension2) {
            iaVar.l0 = dimension2;
            iaVar.invalidateSelf();
            iaVar.G();
        }
        iaVar.b0(W.getDimension(37, 0.0f));
        iaVar.a0(W.getDimension(36, 0.0f));
        float dimension3 = W.getDimension(43, 0.0f);
        if (iaVar.o0 != dimension3) {
            iaVar.o0 = dimension3;
            iaVar.invalidateSelf();
            iaVar.G();
        }
        float dimension4 = W.getDimension(42, 0.0f);
        if (iaVar.p0 != dimension4) {
            iaVar.p0 = dimension4;
            iaVar.invalidateSelf();
            iaVar.G();
        }
        iaVar.W(W.getDimension(30, 0.0f));
        iaVar.U(W.getDimension(28, 0.0f));
        float dimension5 = W.getDimension(14, 0.0f);
        if (iaVar.s0 != dimension5) {
            iaVar.s0 = dimension5;
            iaVar.invalidateSelf();
            iaVar.G();
        }
        iaVar.S0 = W.getDimensionPixelSize(4, Integer.MAX_VALUE);
        W.recycle();
        o8.h(context2, attributeSet, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action);
        o8.k(context2, attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action);
        this.s = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue I = zo.I(theme, com.derinko.gbini.n1casino.R.attr.minTouchTargetSize);
        this.u = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((I == null || I.type != 5) ? Float.NaN : I.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.derinko.gbini.n1casino.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(iaVar);
        iaVar.q(getElevation());
        o8.h(context2, attributeSet, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action);
        o8.k(context2, attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.w = new ha(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new ga(this));
        }
        setChecked(this.o);
        setText(iaVar.T);
        setEllipsize(iaVar.Q0);
        g();
        if (!this.j.R0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.s) {
            setMinHeight(this.u);
        }
        this.t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ea
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.z;
        rectF.setEmpty();
        if (c() && this.m != null) {
            ia iaVar = this.j;
            Rect bounds = iaVar.getBounds();
            rectF.setEmpty();
            if (iaVar.g0()) {
                float f = iaVar.s0 + iaVar.r0 + iaVar.d0 + iaVar.q0 + iaVar.p0;
                if (iaVar.getLayoutDirection() == 0) {
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
        Rect rect = this.y;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private i50 getTextAppearance() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.z0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.u = i;
        if (!this.s) {
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
        ia iaVar = this.j;
        if (iaVar == null) {
            return false;
        }
        Drawable drawable = iaVar.a0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        ia iaVar;
        if (!c() || (iaVar = this.j) == null || !iaVar.Z || this.m == null) {
            x80.m(this, null);
            this.x = false;
        } else {
            x80.m(this, this.w);
            this.x = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        ha haVar = this.w;
        AccessibilityManager accessibilityManager = haVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = haVar.n;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = haVar.m;
                if (i3 != i2) {
                    haVar.m = i2;
                    haVar.q(i2, 128);
                    haVar.q(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = haVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    haVar.m = Integer.MIN_VALUE;
                    haVar.q(Integer.MIN_VALUE, 128);
                    haVar.q(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ha haVar = this.w;
        haVar.getClass();
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
                                while (i < repeatCount && haVar.m(i2, null)) {
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
                    int i3 = haVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = haVar.n;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.x) {
                                chip.w.q(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = haVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = haVar.m(1, null);
            }
        }
        if (!z || haVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.g3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ia iaVar = this.j;
        boolean z = false;
        int i = 0;
        z = false;
        if (iaVar != null && ia.F(iaVar.a0)) {
            ia iaVar2 = this.j;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.r) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.q) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.p) {
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
            if (this.r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = iaVar2.X(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(m00.a(this.j.S), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.j);
        this.l = rippleDrawable;
        this.j.getClass();
        setBackground(this.l);
        f();
    }

    public final void f() {
        ia iaVar;
        if (TextUtils.isEmpty(getText()) || (iaVar = this.j) == null) {
            return;
        }
        int C2 = (int) (iaVar.C() + iaVar.s0 + iaVar.p0);
        ia iaVar2 = this.j;
        int B2 = (int) (iaVar2.B() + iaVar2.l0 + iaVar2.o0);
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            B2 += rect.left;
            C2 += rect.right;
        }
        setPaddingRelative(B2, getPaddingTop(), C2, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        ia iaVar = this.j;
        if (iaVar != null) {
            paint.drawableState = iaVar.getState();
        }
        i50 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.v)) {
            return this.v;
        }
        ia iaVar = this.j;
        if (iaVar == null || !iaVar.f0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.k;
        return insetDrawable == null ? this.j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.h0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.i0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.N;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return Math.max(0.0f, iaVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.s0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ia iaVar = this.j;
        if (iaVar == null || (drawable = iaVar.V) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.W;
        }
        return null;
    }

    public float getChipMinHeight() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.O;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.l0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.Q;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.R;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ia iaVar = this.j;
        if (iaVar == null || (drawable = iaVar.a0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.e0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.r0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.d0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.c0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.x) {
            ha haVar = this.w;
            if (haVar.l == 1 || haVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        ia iaVar = this.j;
        if (iaVar == null) {
            return super.getFontVariationSettings();
        }
        i50 i50Var = iaVar.z0.f;
        if (i50Var != null) {
            return i50Var.c;
        }
        return null;
    }

    public mu getHideMotionSpec() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.k0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.n0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.m0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.S;
        }
        return null;
    }

    public d20 getShapeAppearanceModel() {
        return this.j.i();
    }

    public mu getShowMotionSpec() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.j0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.p0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ia iaVar = this.j;
        if (iaVar != null) {
            return iaVar.o0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o8.m0(this, this.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        ia iaVar = this.j;
        if (iaVar != null && iaVar.f0) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.x) {
            ha haVar = this.w;
            int i2 = haVar.l;
            if (i2 != Integer.MIN_VALUE) {
                haVar.j(i2);
            }
            if (z) {
                haVar.m(i, rect);
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
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ia iaVar = this.j;
        accessibilityNodeInfo.setCheckable(iaVar != null && iaVar.f0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.t != i) {
            this.t = i;
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
                    if (this.p) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.p) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.x) {
                    this.w.q(1, 1);
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
        this.v = charSequence;
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

    @Override // defpackage.g3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.g3, android.view.View
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
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.I(z);
        }
    }

    public void setCheckableResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.I(iaVar.t0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ia iaVar = this.j;
        if (iaVar == null) {
            this.o = z;
        } else if (iaVar.f0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.J(drawable);
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
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.J(zo.s(iaVar.t0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.K(zo.q(iaVar.t0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.L(iaVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.N == colorStateList) {
            return;
        }
        iaVar.N = colorStateList;
        iaVar.onStateChange(iaVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList q;
        ia iaVar = this.j;
        if (iaVar == null || iaVar.N == (q = zo.q(iaVar.t0, i))) {
            return;
        }
        iaVar.N = q;
        iaVar.onStateChange(iaVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.M(iaVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ia iaVar) {
        ia iaVar2 = this.j;
        if (iaVar2 != iaVar) {
            if (iaVar2 != null) {
                iaVar2.P0 = new WeakReference(null);
            }
            this.j = iaVar;
            iaVar.R0 = false;
            iaVar.P0 = new WeakReference(this);
            b(this.u);
        }
    }

    public void setChipEndPadding(float f) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.s0 == f) {
            return;
        }
        iaVar.s0 = f;
        iaVar.invalidateSelf();
        iaVar.G();
    }

    public void setChipEndPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            float dimension = iaVar.t0.getResources().getDimension(i);
            if (iaVar.s0 != dimension) {
                iaVar.s0 = dimension;
                iaVar.invalidateSelf();
                iaVar.G();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.N(drawable);
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
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.N(zo.s(iaVar.t0, i));
        }
    }

    public void setChipIconSize(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.O(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.O(iaVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.P(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.P(zo.q(iaVar.t0, i));
        }
    }

    public void setChipIconVisible(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.Q(iaVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.O == f) {
            return;
        }
        iaVar.O = f;
        iaVar.invalidateSelf();
        iaVar.G();
    }

    public void setChipMinHeightResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            float dimension = iaVar.t0.getResources().getDimension(i);
            if (iaVar.O != dimension) {
                iaVar.O = dimension;
                iaVar.invalidateSelf();
                iaVar.G();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.l0 == f) {
            return;
        }
        iaVar.l0 = f;
        iaVar.invalidateSelf();
        iaVar.G();
    }

    public void setChipStartPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            float dimension = iaVar.t0.getResources().getDimension(i);
            if (iaVar.l0 != dimension) {
                iaVar.l0 = dimension;
                iaVar.invalidateSelf();
                iaVar.G();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.R(zo.q(iaVar.t0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.S(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.S(iaVar.t0.getResources().getDimension(i));
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
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.T(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.e0 == charSequence) {
            return;
        }
        String str = z7.b;
        z7 z7Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? z7.e : z7.d;
        z7Var.getClass();
        e8 e8Var = j50.a;
        iaVar.e0 = z7Var.c(charSequence);
        iaVar.invalidateSelf();
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
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.U(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.U(iaVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.T(zo.s(iaVar.t0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.V(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.V(iaVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.W(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.W(iaVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.Y(zo.q(iaVar.t0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.g3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            t8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            t8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.g3, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            t8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            t8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            t8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            t8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            t8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            t8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            t8.w("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.Q0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.s = z;
        b(this.u);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        ia iaVar = this.j;
        if (iaVar == null) {
            return false;
        }
        i50 i50Var = iaVar.z0.f;
        if (i50Var != null) {
            i50Var.c = str;
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

    public void setHideMotionSpec(mu muVar) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.k0 = muVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.k0 = mu.b(iaVar.t0, i);
        }
    }

    public void setIconEndPadding(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.a0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.a0(iaVar.t0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.b0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.b0(iaVar.t0.getResources().getDimension(i));
        }
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
            t8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            t8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.S0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            t8.w("Chip does not support multi-line text");
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
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.c0(colorStateList);
        }
        this.j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.c0(zo.q(iaVar.t0, i));
            this.j.getClass();
            e();
        }
    }

    @Override // defpackage.o20
    public void setShapeAppearanceModel(d20 d20Var) {
        this.j.setShapeAppearanceModel(d20Var);
    }

    public void setShowMotionSpec(mu muVar) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.j0 = muVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.j0 = mu.b(iaVar.t0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            t8.w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ia iaVar = this.j;
        if (iaVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(iaVar.R0 ? null : charSequence, bufferType);
        ia iaVar2 = this.j;
        if (iaVar2 == null || TextUtils.equals(iaVar2.T, charSequence)) {
            return;
        }
        iaVar2.T = charSequence;
        iaVar2.z0.d = true;
        iaVar2.invalidateSelf();
        iaVar2.G();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.d0(new i50(iaVar.t0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.p0 == f) {
            return;
        }
        iaVar.p0 = f;
        iaVar.invalidateSelf();
        iaVar.G();
    }

    public void setTextEndPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            float dimension = iaVar.t0.getResources().getDimension(i);
            if (iaVar.p0 != dimension) {
                iaVar.p0 = dimension;
                iaVar.invalidateSelf();
                iaVar.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ia iaVar = this.j;
        if (iaVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            k50 k50Var = iaVar.z0;
            i50 i50Var = k50Var.f;
            if (i50Var != null) {
                i50Var.l = applyDimension;
                k50Var.a.setTextSize(applyDimension);
                iaVar.G();
                iaVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        ia iaVar = this.j;
        if (iaVar == null || iaVar.o0 == f) {
            return;
        }
        iaVar.o0 = f;
        iaVar.invalidateSelf();
        iaVar.G();
    }

    public void setTextStartPaddingResource(int i) {
        ia iaVar = this.j;
        if (iaVar != null) {
            float dimension = iaVar.t0.getResources().getDimension(i);
            if (iaVar.o0 != dimension) {
                iaVar.o0 = dimension;
                iaVar.invalidateSelf();
                iaVar.G();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.Z(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.L(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.Q(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            t8.w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            t8.w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            t8.w("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            t8.w("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(i50 i50Var) {
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.d0(i50Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ia iaVar = this.j;
        if (iaVar != null) {
            iaVar.d0(new i50(iaVar.t0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(vs vsVar) {
    }
}
