package com.google.android.material.chip;

import a2.b;
import a2.c;
import a2.d;
import a2.e;
import a2.f;
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
import android.widget.CompoundButton;
import android.widget.TextView;
import b4.l;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import i2.h;
import i2.i;
import i2.m;
import i2.o;
import java.lang.ref.WeakReference;
import java.util.Locale;
import l.p;
import l0.g;
import n0.p0;
import o2.z;
import u2.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class Chip extends p implements e, z, i {
    public static final Rect C = new Rect();
    public static final int[] D = {R.attr.state_selected};
    public static final int[] E = {R.attr.state_checkable};
    public final RectF A;
    public final b B;

    /* renamed from: j, reason: collision with root package name */
    public f f1000j;

    /* renamed from: k, reason: collision with root package name */
    public InsetDrawable f1001k;

    /* renamed from: l, reason: collision with root package name */
    public RippleDrawable f1002l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f1003m;

    /* renamed from: n, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1004n;

    /* renamed from: o, reason: collision with root package name */
    public h f1005o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1006p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1007q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1008r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1009s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1010t;

    /* renamed from: u, reason: collision with root package name */
    public int f1011u;

    /* renamed from: v, reason: collision with root package name */
    public int f1012v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1013w;

    /* renamed from: x, reason: collision with root package name */
    public final d f1014x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1015y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1016z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.gdmhkmf.belbet.R.attr.chipStyle);
        int resourceId;
        this.f1016z = new Rect();
        this.A = new RectF();
        this.B = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.f126s0;
        int[] iArr = q1.a.f3142c;
        TypedArray e4 = o.e(context3, attributeSet, iArr, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.S0 = e4.hasValue(39);
        Context context4 = fVar.f126s0;
        ColorStateList r4 = l.r(context4, e4, 25);
        if (fVar.L != r4) {
            fVar.L = r4;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList r5 = l.r(context4, e4, 12);
        if (fVar.M != r5) {
            fVar.M = r5;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = e4.getDimension(20, 0.0f);
        if (fVar.N != dimension) {
            fVar.N = dimension;
            fVar.invalidateSelf();
            fVar.G();
        }
        if (e4.hasValue(13)) {
            fVar.M(e4.getDimension(13, 0.0f));
        }
        fVar.R(l.r(context4, e4, 23));
        fVar.S(e4.getDimension(24, 0.0f));
        fVar.c0(l.r(context4, e4, 38));
        String text = e4.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.S, text)) {
            fVar.S = text;
            fVar.f132y0.d = true;
            fVar.invalidateSelf();
            fVar.G();
        }
        l2.d dVar = (!e4.hasValue(0) || (resourceId = e4.getResourceId(0, 0)) == 0) ? null : new l2.d(context4, resourceId);
        dVar.f2714l = e4.getDimension(1, dVar.f2714l);
        int i = e4.hasValue(34) ? 34 : 7;
        if (e4.hasValue(i)) {
            dVar.f2708c = e4.getString(i);
        }
        fVar.d0(dVar);
        int i4 = e4.getInt(3, 0);
        if (i4 == 1) {
            fVar.P0 = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            fVar.P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            fVar.P0 = TextUtils.TruncateAt.END;
        }
        fVar.Q(e4.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.Q(e4.getBoolean(16, false));
        }
        fVar.N(l.u(context4, e4, 15));
        if (e4.hasValue(18)) {
            fVar.P(l.r(context4, e4, 18));
        }
        fVar.O(e4.getDimension(17, -1.0f));
        fVar.Z(e4.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.Z(e4.getBoolean(27, false));
        }
        fVar.T(l.u(context4, e4, 26));
        fVar.Y(l.r(context4, e4, 31));
        fVar.V(e4.getDimension(29, 0.0f));
        fVar.I(e4.getBoolean(6, false));
        fVar.L(e4.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.L(e4.getBoolean(9, false));
        }
        fVar.J(l.u(context4, e4, 8));
        if (e4.hasValue(10)) {
            fVar.K(l.r(context4, e4, 10));
        }
        fVar.i0 = r1.e.a(context4, e4, 41);
        fVar.f117j0 = r1.e.a(context4, e4, 35);
        float dimension2 = e4.getDimension(22, 0.0f);
        if (fVar.f118k0 != dimension2) {
            fVar.f118k0 = dimension2;
            fVar.invalidateSelf();
            fVar.G();
        }
        fVar.b0(e4.getDimension(37, 0.0f));
        fVar.a0(e4.getDimension(36, 0.0f));
        float dimension3 = e4.getDimension(43, 0.0f);
        if (fVar.f121n0 != dimension3) {
            fVar.f121n0 = dimension3;
            fVar.invalidateSelf();
            fVar.G();
        }
        float dimension4 = e4.getDimension(42, 0.0f);
        if (fVar.f122o0 != dimension4) {
            fVar.f122o0 = dimension4;
            fVar.invalidateSelf();
            fVar.G();
        }
        fVar.W(e4.getDimension(30, 0.0f));
        fVar.U(e4.getDimension(28, 0.0f));
        float dimension5 = e4.getDimension(14, 0.0f);
        if (fVar.f125r0 != dimension5) {
            fVar.f125r0 = dimension5;
            fVar.invalidateSelf();
            fVar.G();
        }
        fVar.R0 = e4.getDimensionPixelSize(4, Integer.MAX_VALUE);
        e4.recycle();
        o.a(context2, attributeSet, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1010t = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue O = b4.d.O(theme, com.gdmhkmf.belbet.R.attr.minTouchTargetSize);
        this.f1012v = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((O == null || O.type != 5) ? Float.NaN : O.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.gdmhkmf.belbet.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.q(getElevation());
        o.a(context2, attributeSet, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.f1014x = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f1006p);
        setText(fVar.S);
        setEllipsize(fVar.P0);
        g();
        if (!this.f1000j.Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f1010t) {
            setMinHeight(this.f1012v);
        }
        this.f1011u = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a2.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                Chip chip = Chip.this;
                i2.h hVar = chip.f1005o;
                if (hVar != null) {
                    i2.a aVar = (i2.a) ((a0.a) hVar).f79g;
                    if (!z4 ? aVar.e(chip, aVar.f2004e) : aVar.a(chip)) {
                        aVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f1004n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.A;
        rectF.setEmpty();
        if (c() && this.f1003m != null) {
            f fVar = this.f1000j;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.g0()) {
                float f5 = fVar.f125r0 + fVar.f124q0 + fVar.f112c0 + fVar.f123p0 + fVar.f122o0;
                if (fVar.getLayoutDirection() == 0) {
                    float f6 = bounds.right;
                    rectF.right = f6;
                    rectF.left = f6 - f5;
                } else {
                    float f7 = bounds.left;
                    rectF.left = f7;
                    rectF.right = f7 + f5;
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
        int i4 = (int) closeIconTouchBounds.top;
        int i5 = (int) closeIconTouchBounds.right;
        int i6 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1016z;
        rect.set(i, i4, i5, i6);
        return rect;
    }

    private l2.d getTextAppearance() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f132y0.f2061f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f1008r != z4) {
            this.f1008r = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f1007q != z4) {
            this.f1007q = z4;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1012v = i;
        if (!this.f1010t) {
            InsetDrawable insetDrawable = this.f1001k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1001k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1000j.N));
        int max2 = Math.max(0, i - this.f1000j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1001k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1001k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i5 = max > 0 ? max / 2 : 0;
        if (this.f1001k != null) {
            Rect rect = new Rect();
            this.f1001k.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
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
        this.f1001k = new InsetDrawable((Drawable) this.f1000j, i4, i5, i4, i5);
        e();
    }

    public final boolean c() {
        f fVar = this.f1000j;
        if (fVar == null) {
            return false;
        }
        Drawable drawable = fVar.Z;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f1000j) == null || !fVar.Y || this.f1003m == null) {
            p0.m(this, null);
            this.f1015y = false;
        } else {
            p0.m(this, this.f1014x);
            this.f1015y = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1015y) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f1014x;
        AccessibilityManager accessibilityManager = dVar.h;
        int i4 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                Chip chip = dVar.f109q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x4, y4)) {
                    i4 = 1;
                }
                int i5 = dVar.f3551m;
                if (i5 != i4) {
                    dVar.f3551m = i4;
                    dVar.r(i4, 128);
                    dVar.r(i5, 256);
                    return true;
                }
            } else if (action == 10 && (i = dVar.f3551m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    dVar.f3551m = Integer.MIN_VALUE;
                    dVar.r(Integer.MIN_VALUE, 128);
                    dVar.r(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1015y) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1014x;
        dVar.getClass();
        boolean z4 = false;
        int i = 0;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z5 = false;
                                while (i < repeatCount && dVar.m(i4, null)) {
                                    i++;
                                    z5 = true;
                                }
                                z4 = z5;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = dVar.f3550l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f109q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f1003m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1015y) {
                                chip.f1014x.r(1, 1);
                            }
                        }
                    }
                    z4 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z4 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z4 = dVar.m(1, null);
            }
        }
        if (!z4 || dVar.f3550l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1000j;
        boolean z4 = false;
        int i = 0;
        z4 = false;
        if (fVar != null && f.F(fVar.Z)) {
            f fVar2 = this.f1000j;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f1009s) {
                i4 = isEnabled + 1;
            }
            int i5 = i4;
            if (this.f1008r) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (this.f1007q) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (isChecked()) {
                i7 = i6 + 1;
            }
            int[] iArr = new int[i7];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f1009s) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1008r) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1007q) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z4 = fVar2.X(iArr);
        }
        if (z4) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(m2.a.a(this.f1000j.R), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.f1000j);
        this.f1002l = rippleDrawable;
        this.f1000j.getClass();
        setBackground(this.f1002l);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f1000j) == null) {
            return;
        }
        int C2 = (int) (fVar.C() + fVar.f125r0 + fVar.f122o0);
        f fVar2 = this.f1000j;
        int B = (int) (fVar2.B() + fVar2.f118k0 + fVar2.f121n0);
        if (this.f1001k != null) {
            Rect rect = new Rect();
            this.f1001k.getPadding(rect);
            B += rect.left;
            C2 += rect.right;
        }
        setPaddingRelative(B, getPaddingTop(), C2, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f1000j;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        l2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.B);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1013w)) {
            return this.f1013w;
        }
        f fVar = this.f1000j;
        if (fVar == null || !fVar.f113e0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f1020m.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1001k;
        return insetDrawable == null ? this.f1000j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f115g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f116h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return Math.max(0.0f, fVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1000j;
    }

    public float getChipEndPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f125r0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f1000j;
        if (fVar == null || (drawable = fVar.U) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.V;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f118k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f1000j;
        if (fVar == null || (drawable = fVar.Z) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f124q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f112c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f123p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f111b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1015y) {
            d dVar = this.f1014x;
            if (dVar.f3550l == 1 || dVar.f3549k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        f fVar = this.f1000j;
        if (fVar == null) {
            return super.getFontVariationSettings();
        }
        l2.d dVar = fVar.f132y0.f2061f;
        if (dVar != null) {
            return dVar.f2708c;
        }
        return null;
    }

    public r1.e getHideMotionSpec() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f117j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f120m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f119l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.R;
        }
        return null;
    }

    public o2.o getShapeAppearanceModel() {
        return this.f1000j.i();
    }

    public r1.e getShowMotionSpec() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f122o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f1000j;
        if (fVar != null) {
            return fVar.f121n0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.f0(this, this.f1000j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        f fVar = this.f1000j;
        if (fVar != null && fVar.f113e0) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        super.onFocusChanged(z4, i, rect);
        if (this.f1015y) {
            d dVar = this.f1014x;
            int i4 = dVar.f3550l;
            if (i4 != Integer.MIN_VALUE) {
                dVar.j(i4);
            }
            if (z4) {
                dVar.m(i, rect);
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
        f fVar = this.f1000j;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f113e0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.h) {
                i = 0;
                for (int i4 = 0; i4 < chipGroup.getChildCount(); i4++) {
                    View childAt = chipGroup.getChildAt(i4);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i4).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(com.gdmhkmf.belbet.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o0.f.a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).f2881a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f1011u != i) {
            this.f1011u = i;
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
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1007q) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z4 = true;
                    }
                }
                z4 = false;
            } else if (this.f1007q) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f1003m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1015y) {
                    this.f1014x.r(1, 1);
                }
                z4 = true;
                setCloseIconPressed(false);
            }
            z4 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z4 = true;
            }
            z4 = false;
        }
        return z4 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1013w = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1002l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1002l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.p, android.view.View
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

    public void setCheckable(boolean z4) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.I(z4);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.I(fVar.f126s0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        f fVar = this.f1000j;
        if (fVar == null) {
            this.f1006p = z4;
        } else if (fVar.f113e0) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.J(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.J(b4.d.y(fVar.f126s0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.K(c0.c.a(fVar.f126s0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.L(fVar.f126s0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.M == colorStateList) {
            return;
        }
        fVar.M = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList a5;
        f fVar = this.f1000j;
        if (fVar == null || fVar.M == (a5 = c0.c.a(fVar.f126s0, i))) {
            return;
        }
        fVar.M = a5;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.M(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.M(fVar.f126s0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f1000j;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.O0 = new WeakReference(null);
            }
            this.f1000j = fVar;
            fVar.Q0 = false;
            fVar.O0 = new WeakReference(this);
            b(this.f1012v);
        }
    }

    public void setChipEndPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.f125r0 == f5) {
            return;
        }
        fVar.f125r0 = f5;
        fVar.invalidateSelf();
        fVar.G();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            float dimension = fVar.f126s0.getResources().getDimension(i);
            if (fVar.f125r0 != dimension) {
                fVar.f125r0 = dimension;
                fVar.invalidateSelf();
                fVar.G();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.N(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.N(b4.d.y(fVar.f126s0, i));
        }
    }

    public void setChipIconSize(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.O(f5);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.O(fVar.f126s0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.P(c0.c.a(fVar.f126s0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.Q(fVar.f126s0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f5) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.N == f5) {
            return;
        }
        fVar.N = f5;
        fVar.invalidateSelf();
        fVar.G();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            float dimension = fVar.f126s0.getResources().getDimension(i);
            if (fVar.N != dimension) {
                fVar.N = dimension;
                fVar.invalidateSelf();
                fVar.G();
            }
        }
    }

    public void setChipStartPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.f118k0 == f5) {
            return;
        }
        fVar.f118k0 = f5;
        fVar.invalidateSelf();
        fVar.G();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            float dimension = fVar.f126s0.getResources().getDimension(i);
            if (fVar.f118k0 != dimension) {
                fVar.f118k0 = dimension;
                fVar.invalidateSelf();
                fVar.G();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.R(c0.c.a(fVar.f126s0, i));
        }
    }

    public void setChipStrokeWidth(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.S(f5);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.S(fVar.f126s0.getResources().getDimension(i));
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
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.T(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.d0 == charSequence) {
            return;
        }
        String str = l0.b.f2623b;
        l0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? l0.b.f2625e : l0.b.d;
        bVar.getClass();
        l0.f fVar2 = g.f2633a;
        fVar.d0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.U(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.U(fVar.f126s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.T(b4.d.y(fVar.f126s0, i));
        }
        d();
    }

    public void setCloseIconSize(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.V(f5);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.V(fVar.f126s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.W(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.W(fVar.f126s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.Y(c0.c.a(fVar.f126s0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i4, i5, i6);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i4, i5, i6);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.q(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1000j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f1010t = z4;
        b(this.f1012v);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        f fVar = this.f1000j;
        if (fVar == null) {
            return false;
        }
        l2.d dVar = fVar.f132y0.f2061f;
        if (dVar != null) {
            dVar.f2708c = str;
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

    public void setHideMotionSpec(r1.e eVar) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.f117j0 = eVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.f117j0 = r1.e.b(fVar.f126s0, i);
        }
    }

    public void setIconEndPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.a0(f5);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.a0(fVar.f126s0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.b0(f5);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.b0(fVar.f126s0.getResources().getDimension(i));
        }
    }

    @Override // i2.i
    public void setInternalOnCheckedChangeListener(h hVar) {
        this.f1005o = hVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1000j == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.R0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1004n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1003m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.c0(colorStateList);
        }
        this.f1000j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.c0(c0.c.a(fVar.f126s0, i));
            this.f1000j.getClass();
            e();
        }
    }

    @Override // o2.z
    public void setShapeAppearanceModel(o2.o oVar) {
        this.f1000j.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(r1.e eVar) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.i0 = eVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.i0 = r1.e.b(fVar.f126s0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f1000j;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.Q0 ? null : charSequence, bufferType);
        f fVar2 = this.f1000j;
        if (fVar2 == null || TextUtils.equals(fVar2.S, charSequence)) {
            return;
        }
        fVar2.S = charSequence;
        fVar2.f132y0.d = true;
        fVar2.invalidateSelf();
        fVar2.G();
    }

    public void setTextAppearance(l2.d dVar) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.d0(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.f122o0 == f5) {
            return;
        }
        fVar.f122o0 = f5;
        fVar.invalidateSelf();
        fVar.G();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            float dimension = fVar.f126s0.getResources().getDimension(i);
            if (fVar.f122o0 != dimension) {
                fVar.f122o0 = dimension;
                fVar.invalidateSelf();
                fVar.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f5) {
        super.setTextSize(i, f5);
        f fVar = this.f1000j;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f5, getResources().getDisplayMetrics());
            m mVar = fVar.f132y0;
            l2.d dVar = mVar.f2061f;
            if (dVar != null) {
                dVar.f2714l = applyDimension;
                mVar.f2057a.setTextSize(applyDimension);
                fVar.G();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f5) {
        f fVar = this.f1000j;
        if (fVar == null || fVar.f121n0 == f5) {
            return;
        }
        fVar.f121n0 = f5;
        fVar.invalidateSelf();
        fVar.G();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.f1000j;
        if (fVar != null) {
            float dimension = fVar.f126s0.getResources().getDimension(i);
            if (fVar.f121n0 != dimension) {
                fVar.f121n0 = dimension;
                fVar.invalidateSelf();
                fVar.G();
            }
        }
    }

    public void setCloseIconVisible(boolean z4) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.Z(z4);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z4) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.L(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.Q(z4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.d0(new l2.d(fVar.f126s0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f1000j;
        if (fVar != null) {
            fVar.d0(new l2.d(fVar.f126s0, i));
        }
        g();
    }
}
