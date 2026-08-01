package com.google.android.material.chip;

import B0.k;
import B0.m;
import B0.o;
import H0.v;
import I.g;
import I.h;
import K.H;
import K.T;
import M0.a;
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
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.C0259s;
import n0.AbstractC0279a;
import o0.b;
import q1.d;
import q1.l;
import w0.C0332b;
import w0.C0333c;
import w0.C0335e;
import w0.InterfaceC0334d;

/* loaded from: classes.dex */
public class Chip extends C0259s implements InterfaceC0334d, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f1619w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1620x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1621y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public C0335e f1622e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1623f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1624g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1625j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1626k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1627l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1628m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1629n;

    /* renamed from: o, reason: collision with root package name */
    public int f1630o;

    /* renamed from: p, reason: collision with root package name */
    public int f1631p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1632q;

    /* renamed from: r, reason: collision with root package name */
    public final C0333c f1633r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1634s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1635t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1636u;

    /* renamed from: v, reason: collision with root package name */
    public final k f1637v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.skydrop.fallring.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1635t = new Rect();
        this.f1636u = new RectF();
        this.f1637v = new k(1, this);
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
        C0335e c0335e = new C0335e(context2, attributeSet);
        int[] iArr = AbstractC0279a.f3268c;
        TypedArray f2 = o.f(c0335e.f4132e0, attributeSet, iArr, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0335e.f4107E0 = f2.hasValue(37);
        Context context3 = c0335e.f4132e0;
        ColorStateList B2 = d.B(context3, f2, 24);
        if (c0335e.f4150x != B2) {
            c0335e.f4150x = B2;
            c0335e.onStateChange(c0335e.getState());
        }
        ColorStateList B3 = d.B(context3, f2, 11);
        if (c0335e.f4151y != B3) {
            c0335e.f4151y = B3;
            c0335e.onStateChange(c0335e.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (c0335e.f4153z != dimension) {
            c0335e.f4153z = dimension;
            c0335e.invalidateSelf();
            c0335e.u();
        }
        if (f2.hasValue(12)) {
            c0335e.A(f2.getDimension(12, 0.0f));
        }
        c0335e.F(d.B(context3, f2, 22));
        c0335e.G(f2.getDimension(23, 0.0f));
        c0335e.P(d.B(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0335e.f4106E, text)) {
            c0335e.f4106E = text;
            c0335e.f4137k0.d = true;
            c0335e.invalidateSelf();
            c0335e.u();
        }
        E0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new E0.d(context3, resourceId3);
        dVar.f181k = f2.getDimension(1, dVar.f181k);
        c0335e.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            c0335e.f4102B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0335e.f4102B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0335e.f4102B0 = TextUtils.TruncateAt.END;
        }
        c0335e.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0335e.E(f2.getBoolean(15, false));
        }
        c0335e.B(d.E(context3, f2, 14));
        if (f2.hasValue(17)) {
            c0335e.D(d.B(context3, f2, 17));
        }
        c0335e.C(f2.getDimension(16, -1.0f));
        c0335e.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0335e.M(f2.getBoolean(26, false));
        }
        c0335e.H(d.E(context3, f2, 25));
        c0335e.L(d.B(context3, f2, 30));
        c0335e.J(f2.getDimension(28, 0.0f));
        c0335e.w(f2.getBoolean(6, false));
        c0335e.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0335e.z(f2.getBoolean(8, false));
        }
        c0335e.x(d.E(context3, f2, 7));
        if (f2.hasValue(9)) {
            c0335e.y(d.B(context3, f2, 9));
        }
        c0335e.f4122U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : b.a(context3, resourceId2);
        c0335e.f4123V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (c0335e.f4124W != dimension2) {
            c0335e.f4124W = dimension2;
            c0335e.invalidateSelf();
            c0335e.u();
        }
        c0335e.O(f2.getDimension(35, 0.0f));
        c0335e.N(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (c0335e.f4127Z != dimension3) {
            c0335e.f4127Z = dimension3;
            c0335e.invalidateSelf();
            c0335e.u();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (c0335e.f4128a0 != dimension4) {
            c0335e.f4128a0 = dimension4;
            c0335e.invalidateSelf();
            c0335e.u();
        }
        c0335e.K(f2.getDimension(29, 0.0f));
        c0335e.I(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (c0335e.f4131d0 != dimension5) {
            c0335e.f4131d0 = dimension5;
            c0335e.invalidateSelf();
            c0335e.u();
        }
        c0335e.f4105D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        o.a(context2, attributeSet, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1629n = obtainStyledAttributes.getBoolean(32, false);
        this.f1631p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c0335e);
        c0335e.i(H.i(this));
        o.a(context2, attributeSet, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.skydrop.fallring.R.attr.chipStyle, com.skydrop.fallring.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1633r = new C0333c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new C0332b(this));
        }
        setChecked(this.f1625j);
        setText(c0335e.f4106E);
        setEllipsize(c0335e.f4102B0);
        h();
        if (!this.f1622e.C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1629n) {
            setMinHeight(this.f1631p);
        }
        this.f1630o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1636u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            C0335e c0335e = this.f1622e;
            Rect bounds = c0335e.getBounds();
            rectF.setEmpty();
            if (c0335e.T()) {
                float f2 = c0335e.f4131d0 + c0335e.f4130c0 + c0335e.f4116O + c0335e.f4129b0 + c0335e.f4128a0;
                if (D.b.a(c0335e) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
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
        Rect rect = this.f1635t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private E0.d getTextAppearance() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4137k0.f136f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1627l != z2) {
            this.f1627l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1626k != z2) {
            this.f1626k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1631p = i;
        if (!this.f1629n) {
            InsetDrawable insetDrawable = this.f1623f;
            if (insetDrawable == null) {
                int[] iArr = F0.a.f185a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1623f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = F0.a.f185a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1622e.f4153z));
        int max2 = Math.max(0, i - this.f1622e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1623f;
            if (insetDrawable2 == null) {
                int[] iArr3 = F0.a.f185a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1623f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = F0.a.f185a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f1623f != null) {
            Rect rect = new Rect();
            this.f1623f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = F0.a.f185a;
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f1623f = new InsetDrawable((Drawable) this.f1622e, i2, i3, i2, i3);
        int[] iArr6 = F0.a.f185a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            Object obj = c0335e.f4113L;
            if (obj != null) {
                if (obj instanceof D.d) {
                }
                if (obj == null) {
                    return true;
                }
            }
            obj = null;
            if (obj == null) {
            }
        }
        return false;
    }

    public final boolean d() {
        C0335e c0335e = this.f1622e;
        return c0335e != null && c0335e.f4118Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1634s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C0333c c0333c = this.f1633r;
        AccessibilityManager accessibilityManager = c0333c.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = c0333c.f4096q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = c0333c.f687m;
                if (i3 != i2) {
                    c0333c.f687m = i2;
                    c0333c.q(i2, 128);
                    c0333c.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c0333c.f687m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c0333c.f687m = Integer.MIN_VALUE;
                c0333c.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1634s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0333c c0333c = this.f1633r;
        c0333c.getClass();
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
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
                                boolean z3 = false;
                                while (i < repeatCount && c0333c.m(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = c0333c.f686l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = c0333c.f4096q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1634s) {
                                chip.f1633r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c0333c.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c0333c.m(1, null);
            }
        }
        if (!z2 || c0333c.f686l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0259s, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0335e c0335e = this.f1622e;
        boolean z2 = false;
        if (c0335e != null && C0335e.t(c0335e.f4113L)) {
            C0335e c0335e2 = this.f1622e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f1628m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f1627l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1626k) {
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
            } else {
                i = 0;
            }
            if (this.f1628m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1627l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1626k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0335e2.f4152y0, iArr)) {
                c0335e2.f4152y0 = iArr;
                if (c0335e2.T()) {
                    z2 = c0335e2.v(c0335e2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        C0335e c0335e;
        if (!c() || (c0335e = this.f1622e) == null || !c0335e.f4112K || this.h == null) {
            T.l(this, null);
            this.f1634s = false;
        } else {
            T.l(this, this.f1633r);
            this.f1634s = true;
        }
    }

    public final void f() {
        this.f1624g = new RippleDrawable(F0.a.a(this.f1622e.f4104D), getBackgroundDrawable(), null);
        this.f1622e.getClass();
        RippleDrawable rippleDrawable = this.f1624g;
        WeakHashMap weakHashMap = T.f381a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        C0335e c0335e;
        if (TextUtils.isEmpty(getText()) || (c0335e = this.f1622e) == null) {
            return;
        }
        int q2 = (int) (c0335e.q() + c0335e.f4131d0 + c0335e.f4128a0);
        C0335e c0335e2 = this.f1622e;
        int p2 = (int) (c0335e2.p() + c0335e2.f4124W + c0335e2.f4127Z);
        if (this.f1623f != null) {
            Rect rect = new Rect();
            this.f1623f.getPadding(rect);
            p2 += rect.left;
            q2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = T.f381a;
        setPaddingRelative(p2, paddingTop, q2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1632q)) {
            return this.f1632q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1623f;
        return insetDrawable == null ? this.f1622e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4120S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4121T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4151y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return Math.max(0.0f, c0335e.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1622e;
    }

    public float getChipEndPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4131d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0335e c0335e = this.f1622e;
        if (c0335e == null || (drawable = c0335e.f4108G) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof D.d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4110I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4109H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4153z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4124W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4101B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4103C;
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
        C0335e c0335e = this.f1622e;
        if (c0335e == null || (drawable = c0335e.f4113L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof D.d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4117P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4130c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4116O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4129b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4115N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4102B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1634s) {
            C0333c c0333c = this.f1633r;
            if (c0333c.f686l == 1 || c0333c.f685k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b getHideMotionSpec() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4123V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4126Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4125X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4104D;
        }
        return null;
    }

    public H0.k getShapeAppearanceModel() {
        return this.f1622e.f256a.f242a;
    }

    public b getShowMotionSpec() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4122U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4128a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            return c0335e.f4127Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            paint.drawableState = c0335e.getState();
        }
        E0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1637v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.Z(this, this.f1622e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1620x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1621y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f1634s) {
            C0333c c0333c = this.f1633r;
            int i2 = c0333c.f686l;
            if (i2 != Integer.MIN_VALUE) {
                c0333c.j(i2);
            }
            if (z2) {
                c0333c.m(i, rect);
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
        accessibilityNodeInfo.setCheckable(d());
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
        if (this.f1630o != i) {
            this.f1630o = i;
            g();
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
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1626k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f1626k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1634s) {
                    this.f1633r.q(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1632q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1624g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0259s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1624g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0259s, android.view.View
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

    public void setCheckable(boolean z2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.w(c0335e.f4132e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null) {
            this.f1625j = z2;
        } else if (c0335e.f4118Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.x(l.v(c0335e.f4132e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.y(d.z(c0335e.f4132e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.z(c0335e.f4132e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4151y == colorStateList) {
            return;
        }
        c0335e.f4151y = colorStateList;
        c0335e.onStateChange(c0335e.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList z2;
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4151y == (z2 = d.z(c0335e.f4132e0, i))) {
            return;
        }
        c0335e.f4151y = z2;
        c0335e.onStateChange(c0335e.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.A(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0335e c0335e) {
        C0335e c0335e2 = this.f1622e;
        if (c0335e2 != c0335e) {
            if (c0335e2 != null) {
                c0335e2.f4100A0 = new WeakReference(null);
            }
            this.f1622e = c0335e;
            c0335e.C0 = false;
            c0335e.f4100A0 = new WeakReference(this);
            b(this.f1631p);
        }
    }

    public void setChipEndPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4131d0 == f2) {
            return;
        }
        c0335e.f4131d0 = f2;
        c0335e.invalidateSelf();
        c0335e.u();
    }

    public void setChipEndPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            float dimension = c0335e.f4132e0.getResources().getDimension(i);
            if (c0335e.f4131d0 != dimension) {
                c0335e.f4131d0 = dimension;
                c0335e.invalidateSelf();
                c0335e.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.B(l.v(c0335e.f4132e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.C(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.D(d.z(c0335e.f4132e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.E(c0335e.f4132e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4153z == f2) {
            return;
        }
        c0335e.f4153z = f2;
        c0335e.invalidateSelf();
        c0335e.u();
    }

    public void setChipMinHeightResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            float dimension = c0335e.f4132e0.getResources().getDimension(i);
            if (c0335e.f4153z != dimension) {
                c0335e.f4153z = dimension;
                c0335e.invalidateSelf();
                c0335e.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4124W == f2) {
            return;
        }
        c0335e.f4124W = f2;
        c0335e.invalidateSelf();
        c0335e.u();
    }

    public void setChipStartPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            float dimension = c0335e.f4132e0.getResources().getDimension(i);
            if (c0335e.f4124W != dimension) {
                c0335e.f4124W = dimension;
                c0335e.invalidateSelf();
                c0335e.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.F(d.z(c0335e.f4132e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.G(c0335e.f4132e0.getResources().getDimension(i));
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
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4117P == charSequence) {
            return;
        }
        String str = I.b.f328b;
        I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f330e : I.b.d;
        bVar.getClass();
        g gVar = h.f338a;
        c0335e.f4117P = bVar.c(charSequence);
        c0335e.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.I(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.H(l.v(c0335e.f4132e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.J(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.K(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.L(d.z(c0335e.f4132e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0259s, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0259s, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1622e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.f4102B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1629n = z2;
        b(this.f1631p);
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
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.f4123V = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.f4123V = b.a(c0335e.f4132e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.N(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.O(c0335e.f4132e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(B0.h hVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1622e == null) {
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
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.f4105D0 = i;
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
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.P(colorStateList);
        }
        this.f1622e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.P(d.z(c0335e.f4132e0, i));
            this.f1622e.getClass();
            f();
        }
    }

    @Override // H0.v
    public void setShapeAppearanceModel(H0.k kVar) {
        this.f1622e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(b bVar) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.f4122U = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.f4122U = b.a(c0335e.f4132e0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0335e.C0 ? null : charSequence, bufferType);
        C0335e c0335e2 = this.f1622e;
        if (c0335e2 == null || TextUtils.equals(c0335e2.f4106E, charSequence)) {
            return;
        }
        c0335e2.f4106E = charSequence;
        c0335e2.f4137k0.d = true;
        c0335e2.invalidateSelf();
        c0335e2.u();
    }

    public void setTextAppearance(E0.d dVar) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4128a0 == f2) {
            return;
        }
        c0335e.f4128a0 = f2;
        c0335e.invalidateSelf();
        c0335e.u();
    }

    public void setTextEndPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            float dimension = c0335e.f4132e0.getResources().getDimension(i);
            if (c0335e.f4128a0 != dimension) {
                c0335e.f4128a0 = dimension;
                c0335e.invalidateSelf();
                c0335e.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            m mVar = c0335e.f4137k0;
            E0.d dVar = mVar.f136f;
            if (dVar != null) {
                dVar.f181k = applyDimension;
                mVar.f132a.setTextSize(applyDimension);
                c0335e.u();
                c0335e.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        C0335e c0335e = this.f1622e;
        if (c0335e == null || c0335e.f4127Z == f2) {
            return;
        }
        c0335e.f4127Z = f2;
        c0335e.invalidateSelf();
        c0335e.u();
    }

    public void setTextStartPaddingResource(int i) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            float dimension = c0335e.f4132e0.getResources().getDimension(i);
            if (c0335e.f4127Z != dimension) {
                c0335e.f4127Z = dimension;
                c0335e.invalidateSelf();
                c0335e.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.M(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.E(z2);
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
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.Q(new E0.d(c0335e.f4132e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0335e c0335e = this.f1622e;
        if (c0335e != null) {
            c0335e.Q(new E0.d(c0335e.f4132e0, i));
        }
        h();
    }
}
