package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import e2.i;
import e2.k;
import e2.o;
import java.lang.ref.WeakReference;
import java.util.Locale;
import l.r;
import l0.f;
import l0.g;
import l2.n;
import l2.y;
import n0.l0;
import o1.b;
import q2.a;
import z1.c;
import z1.d;
import z1.e;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class Chip extends r implements d, y, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final i A;

    /* renamed from: j, reason: collision with root package name */
    public e f882j;

    /* renamed from: k, reason: collision with root package name */
    public InsetDrawable f883k;

    /* renamed from: l, reason: collision with root package name */
    public RippleDrawable f884l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f885m;

    /* renamed from: n, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f886n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f887o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f888p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f889q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f890r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f891s;

    /* renamed from: t, reason: collision with root package name */
    public int f892t;

    /* renamed from: u, reason: collision with root package name */
    public int f893u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f894v;

    /* renamed from: w, reason: collision with root package name */
    public final c f895w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f896x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f897y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f898z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.oriondriftchasers.arordrft.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f897y = new Rect();
        this.f898z = new RectF();
        this.A = new i(1, this);
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
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f3871s0;
        int[] iArr = n1.a.f2813e;
        TypedArray f2 = o.f(context3, attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.S0 = f2.hasValue(37);
        Context context4 = eVar.f3871s0;
        ColorStateList t2 = h.a.t(context4, f2, 24);
        if (eVar.L != t2) {
            eVar.L = t2;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList t3 = h.a.t(context4, f2, 11);
        if (eVar.M != t3) {
            eVar.M = t3;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (eVar.N != dimension) {
            eVar.N = dimension;
            eVar.invalidateSelf();
            eVar.F();
        }
        if (f2.hasValue(12)) {
            eVar.L(f2.getDimension(12, 0.0f));
        }
        eVar.Q(h.a.t(context4, f2, 22));
        eVar.R(f2.getDimension(23, 0.0f));
        eVar.b0(h.a.t(context4, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(eVar.S, text);
        k kVar = eVar.f3877y0;
        if (!equals) {
            eVar.S = text;
            kVar.f1229e = true;
            eVar.invalidateSelf();
            eVar.F();
        }
        i2.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new i2.d(context4, resourceId3);
        dVar.f1826l = f2.getDimension(1, dVar.f1826l);
        kVar.b(dVar, context4);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            eVar.P0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            eVar.P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            eVar.P0 = TextUtils.TruncateAt.END;
        }
        eVar.P(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.P(f2.getBoolean(15, false));
        }
        eVar.M(h.a.y(context4, f2, 14));
        if (f2.hasValue(17)) {
            eVar.O(h.a.t(context4, f2, 17));
        }
        eVar.N(f2.getDimension(16, -1.0f));
        eVar.Y(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.Y(f2.getBoolean(26, false));
        }
        eVar.S(h.a.y(context4, f2, 25));
        eVar.X(h.a.t(context4, f2, 30));
        eVar.U(f2.getDimension(28, 0.0f));
        eVar.H(f2.getBoolean(6, false));
        eVar.K(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.K(f2.getBoolean(8, false));
        }
        eVar.I(h.a.y(context4, f2, 7));
        if (f2.hasValue(9)) {
            eVar.J(h.a.t(context4, f2, 9));
        }
        eVar.i0 = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : b.a(context4, resourceId2);
        eVar.f3862j0 = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : b.a(context4, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (eVar.f3863k0 != dimension2) {
            eVar.f3863k0 = dimension2;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.a0(f2.getDimension(35, 0.0f));
        eVar.Z(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (eVar.f3866n0 != dimension3) {
            eVar.f3866n0 = dimension3;
            eVar.invalidateSelf();
            eVar.F();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (eVar.f3867o0 != dimension4) {
            eVar.f3867o0 = dimension4;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.V(f2.getDimension(29, 0.0f));
        eVar.T(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (eVar.f3870r0 != dimension5) {
            eVar.f3870r0 = dimension5;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.R0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        o.a(context2, attributeSet, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action);
        this.f891s = obtainStyledAttributes.getBoolean(32, false);
        TypedValue a02 = h.a.a0(context2, com.oriondriftchasers.arordrft.R.attr.minTouchTargetSize);
        this.f893u = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) ((a02 == null || a02.type != 5) ? context2.getResources().getDimension(com.oriondriftchasers.arordrft.R.dimen.mtrl_min_touch_target_size) : a02.getDimension(context2.getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.p(getElevation());
        o.a(context2, attributeSet, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f895w = new c(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new z1.b(this));
        }
        setChecked(this.f887o);
        setText(eVar.S);
        setEllipsize(eVar.P0);
        g();
        if (!this.f882j.Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f891s) {
            setMinHeight(this.f893u);
        }
        this.f892t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f886n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f898z;
        rectF.setEmpty();
        if (c() && this.f885m != null) {
            e eVar = this.f882j;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.e0()) {
                float f2 = eVar.f3870r0 + eVar.f3869q0 + eVar.f3857c0 + eVar.f3868p0 + eVar.f3867o0;
                if (eVar.getLayoutDirection() == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f2;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f2;
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
        Rect rect = this.f897y;
        rect.set(i, i4, i5, i6);
        return rect;
    }

    private i2.d getTextAppearance() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3877y0.f1231g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f889q != z3) {
            this.f889q = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f888p != z3) {
            this.f888p = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f893u = i;
        if (!this.f891s) {
            InsetDrawable insetDrawable = this.f883k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f883k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f882j.N));
        int max2 = Math.max(0, i - this.f882j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f883k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f883k = null;
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
        if (this.f883k != null) {
            Rect rect = new Rect();
            this.f883k.getPadding(rect);
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
        this.f883k = new InsetDrawable((Drawable) this.f882j, i4, i5, i4, i5);
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        e eVar = this.f882j;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.Z;
        if (obj != null) {
            if (obj instanceof g0.b) {
            }
            return obj == null;
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final void d() {
        e eVar;
        if (!c() || (eVar = this.f882j) == null || !eVar.Y || this.f885m == null) {
            l0.m(this, null);
            this.f896x = false;
        } else {
            l0.m(this, this.f895w);
            this.f896x = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f896x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f895w;
        AccessibilityManager accessibilityManager = cVar.f3279h;
        int i4 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                Chip chip = cVar.f3854q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x3, y3)) {
                    i4 = 1;
                }
                int i5 = cVar.f3283m;
                if (i5 != i4) {
                    cVar.f3283m = i4;
                    cVar.r(i4, 128);
                    cVar.r(i5, 256);
                    return true;
                }
            } else if (action == 10 && (i = cVar.f3283m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    cVar.f3283m = Integer.MIN_VALUE;
                    cVar.r(Integer.MIN_VALUE, 128);
                    cVar.r(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f896x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f895w;
        cVar.getClass();
        boolean z3 = false;
        int i = 0;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
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
                                boolean z4 = false;
                                while (i < repeatCount && cVar.m(i4, null)) {
                                    i++;
                                    z4 = true;
                                }
                                z3 = z4;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = cVar.f3282l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f3854q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f885m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f896x) {
                                chip.f895w.r(1, 1);
                            }
                        }
                    }
                    z3 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z3 = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z3 = cVar.m(1, null);
            }
        }
        if (!z3 || cVar.f3282l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f882j;
        boolean z3 = false;
        int i = 0;
        z3 = false;
        if (eVar != null && e.E(eVar.Z)) {
            e eVar2 = this.f882j;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f890r) {
                i4 = isEnabled + 1;
            }
            int i5 = i4;
            if (this.f889q) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (this.f888p) {
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
            if (this.f890r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f889q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f888p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z3 = eVar2.W(iArr);
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        this.f884l = new RippleDrawable(j2.a.b(this.f882j.R), getBackgroundDrawable(), null);
        this.f882j.getClass();
        setBackground(this.f884l);
        f();
    }

    public final void f() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f882j) == null) {
            return;
        }
        int B2 = (int) (eVar.B() + eVar.f3870r0 + eVar.f3867o0);
        e eVar2 = this.f882j;
        int A = (int) (eVar2.A() + eVar2.f3863k0 + eVar2.f3866n0);
        if (this.f883k != null) {
            Rect rect = new Rect();
            this.f883k.getPadding(rect);
            A += rect.left;
            B2 += rect.right;
        }
        setPaddingRelative(A, getPaddingTop(), B2, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.f882j;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        i2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f894v)) {
            return this.f894v;
        }
        e eVar = this.f882j;
        if (eVar == null || !eVar.f3858e0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f883k;
        return insetDrawable == null ? this.f882j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3860g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3861h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f882j;
        if (eVar != null) {
            return Math.max(0.0f, eVar.C());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f882j;
    }

    public float getChipEndPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3870r0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f882j;
        if (eVar == null || (drawable = eVar.U) == 0) {
            return null;
        }
        if (!(drawable instanceof g0.b)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.V;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3863k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f882j;
        if (eVar == null || (drawable = eVar.Z) == 0) {
            return null;
        }
        if (!(drawable instanceof g0.b)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3869q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3857c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3868p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3856b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f896x) {
            c cVar = this.f895w;
            if (cVar.f3282l == 1 || cVar.f3281k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b getHideMotionSpec() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3862j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3865m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3864l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.R;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        return this.f882j.f2598g.f2581a;
    }

    public b getShowMotionSpec() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3867o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f882j;
        if (eVar != null) {
            return eVar.f3866n0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a.k0(this, this.f882j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        e eVar = this.f882j;
        if (eVar != null && eVar.f3858e0) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        if (this.f896x) {
            c cVar = this.f895w;
            int i4 = cVar.f3282l;
            if (i4 != Integer.MIN_VALUE) {
                cVar.j(i4);
            }
            if (z3) {
                cVar.m(i, rect);
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
        e eVar = this.f882j;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f3858e0);
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
        if (this.f892t != i) {
            this.f892t = i;
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
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f888p) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z3 = true;
                    }
                }
                z3 = false;
            } else if (this.f888p) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f885m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f896x) {
                    this.f895w.r(1, 1);
                }
                z3 = true;
                setCloseIconPressed(false);
            }
            z3 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z3 = true;
            }
            z3 = false;
        }
        return z3 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f894v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f884l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f884l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.r, android.view.View
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

    public void setCheckable(boolean z3) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.H(z3);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.H(eVar.f3871s0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        e eVar = this.f882j;
        if (eVar == null) {
            this.f887o = z3;
        } else if (eVar.f3858e0) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.I(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.I(h.a.x(eVar.f3871s0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.J(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.J(a.y.B(eVar.f3871s0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.K(eVar.f3871s0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f882j;
        if (eVar == null || eVar.M == colorStateList) {
            return;
        }
        eVar.M = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList B2;
        e eVar = this.f882j;
        if (eVar == null || eVar.M == (B2 = a.y.B(eVar.f3871s0, i))) {
            return;
        }
        eVar.M = B2;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.L(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.L(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f882j;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.O0 = new WeakReference(null);
            }
            this.f882j = eVar;
            eVar.Q0 = false;
            eVar.O0 = new WeakReference(this);
            b(this.f893u);
        }
    }

    public void setChipEndPadding(float f2) {
        e eVar = this.f882j;
        if (eVar == null || eVar.f3870r0 == f2) {
            return;
        }
        eVar.f3870r0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            float dimension = eVar.f3871s0.getResources().getDimension(i);
            if (eVar.f3870r0 != dimension) {
                eVar.f3870r0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.M(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.M(h.a.x(eVar.f3871s0, i));
        }
    }

    public void setChipIconSize(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.N(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.N(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.O(a.y.B(eVar.f3871s0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.P(eVar.f3871s0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        e eVar = this.f882j;
        if (eVar == null || eVar.N == f2) {
            return;
        }
        eVar.N = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            float dimension = eVar.f3871s0.getResources().getDimension(i);
            if (eVar.N != dimension) {
                eVar.N = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        e eVar = this.f882j;
        if (eVar == null || eVar.f3863k0 == f2) {
            return;
        }
        eVar.f3863k0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            float dimension = eVar.f3871s0.getResources().getDimension(i);
            if (eVar.f3863k0 != dimension) {
                eVar.f3863k0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.Q(a.y.B(eVar.f3871s0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.R(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.R(eVar.f3871s0.getResources().getDimension(i));
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
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.S(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f882j;
        if (eVar == null || eVar.d0 == charSequence) {
            return;
        }
        String str = l0.b.f2533b;
        l0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? l0.b.f2535e : l0.b.d;
        bVar.getClass();
        f fVar = g.f2543a;
        eVar.d0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.T(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.T(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.S(h.a.x(eVar.f3871s0, i));
        }
        d();
    }

    public void setCloseIconSize(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.U(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.U(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.V(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.V(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.X(a.y.B(eVar.f3871s0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.r, android.widget.TextView
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
    public void setElevation(float f2) {
        super.setElevation(f2);
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.p(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f882j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f891s = z3;
        b(this.f893u);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(b bVar) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.f3862j0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.f3862j0 = b.a(eVar.f3871s0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.Z(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.Z(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.a0(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.a0(eVar.f3871s0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f882j == null) {
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
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.R0 = i;
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
        this.f886n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f885m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.b0(colorStateList);
        }
        this.f882j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.b0(a.y.B(eVar.f3871s0, i));
            this.f882j.getClass();
            e();
        }
    }

    @Override // l2.y
    public void setShapeAppearanceModel(n nVar) {
        this.f882j.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(b bVar) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.i0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.i0 = b.a(eVar.f3871s0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f882j;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.Q0 ? null : charSequence, bufferType);
        e eVar2 = this.f882j;
        if (eVar2 == null || TextUtils.equals(eVar2.S, charSequence)) {
            return;
        }
        eVar2.S = charSequence;
        eVar2.f3877y0.f1229e = true;
        eVar2.invalidateSelf();
        eVar2.F();
    }

    public void setTextAppearance(i2.d dVar) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.f3877y0.b(dVar, eVar.f3871s0);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        e eVar = this.f882j;
        if (eVar == null || eVar.f3867o0 == f2) {
            return;
        }
        eVar.f3867o0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            float dimension = eVar.f3871s0.getResources().getDimension(i);
            if (eVar.f3867o0 != dimension) {
                eVar.f3867o0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        e eVar = this.f882j;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            k kVar = eVar.f3877y0;
            i2.d dVar = kVar.f1231g;
            if (dVar != null) {
                dVar.f1826l = applyDimension;
                kVar.f1226a.setTextSize(applyDimension);
                eVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f2) {
        e eVar = this.f882j;
        if (eVar == null || eVar.f3866n0 == f2) {
            return;
        }
        eVar.f3866n0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.f882j;
        if (eVar != null) {
            float dimension = eVar.f3871s0.getResources().getDimension(i);
            if (eVar.f3866n0 != dimension) {
                eVar.f3866n0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.Y(z3);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z3) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.K(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        e eVar = this.f882j;
        if (eVar != null) {
            eVar.P(z3);
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
        e eVar = this.f882j;
        if (eVar != null) {
            Context context2 = eVar.f3871s0;
            eVar.f3877y0.b(new i2.d(context2, i), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.f882j;
        if (eVar != null) {
            Context context = eVar.f3871s0;
            eVar.f3877y0.b(new i2.d(context, i), context);
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(e2.e eVar) {
    }
}
