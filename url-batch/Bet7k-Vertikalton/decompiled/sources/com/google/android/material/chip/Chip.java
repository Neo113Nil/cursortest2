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
import l.C0258s;
import n0.AbstractC0278a;
import o0.b;
import q1.d;
import q1.l;
import w0.C0331b;
import w0.C0332c;
import w0.C0334e;
import w0.InterfaceC0333d;

/* loaded from: classes.dex */
public class Chip extends C0258s implements InterfaceC0333d, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f1616w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1617x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1618y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public C0334e f1619e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1620f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1621g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1622j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1623k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1624l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1626n;

    /* renamed from: o, reason: collision with root package name */
    public int f1627o;

    /* renamed from: p, reason: collision with root package name */
    public int f1628p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1629q;

    /* renamed from: r, reason: collision with root package name */
    public final C0332c f1630r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1631s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1632t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1633u;

    /* renamed from: v, reason: collision with root package name */
    public final k f1634v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.shotwins.games.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1632t = new Rect();
        this.f1633u = new RectF();
        this.f1634v = new k(1, this);
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
        C0334e c0334e = new C0334e(context2, attributeSet);
        int[] iArr = AbstractC0278a.f3284c;
        TypedArray f2 = o.f(c0334e.f4148e0, attributeSet, iArr, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0334e.f4123E0 = f2.hasValue(37);
        Context context3 = c0334e.f4148e0;
        ColorStateList B2 = d.B(context3, f2, 24);
        if (c0334e.f4166x != B2) {
            c0334e.f4166x = B2;
            c0334e.onStateChange(c0334e.getState());
        }
        ColorStateList B3 = d.B(context3, f2, 11);
        if (c0334e.f4167y != B3) {
            c0334e.f4167y = B3;
            c0334e.onStateChange(c0334e.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (c0334e.f4169z != dimension) {
            c0334e.f4169z = dimension;
            c0334e.invalidateSelf();
            c0334e.u();
        }
        if (f2.hasValue(12)) {
            c0334e.A(f2.getDimension(12, 0.0f));
        }
        c0334e.F(d.B(context3, f2, 22));
        c0334e.G(f2.getDimension(23, 0.0f));
        c0334e.P(d.B(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0334e.f4122E, text)) {
            c0334e.f4122E = text;
            c0334e.f4153k0.d = true;
            c0334e.invalidateSelf();
            c0334e.u();
        }
        E0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new E0.d(context3, resourceId3);
        dVar.f181k = f2.getDimension(1, dVar.f181k);
        c0334e.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            c0334e.f4118B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0334e.f4118B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0334e.f4118B0 = TextUtils.TruncateAt.END;
        }
        c0334e.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0334e.E(f2.getBoolean(15, false));
        }
        c0334e.B(d.E(context3, f2, 14));
        if (f2.hasValue(17)) {
            c0334e.D(d.B(context3, f2, 17));
        }
        c0334e.C(f2.getDimension(16, -1.0f));
        c0334e.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0334e.M(f2.getBoolean(26, false));
        }
        c0334e.H(d.E(context3, f2, 25));
        c0334e.L(d.B(context3, f2, 30));
        c0334e.J(f2.getDimension(28, 0.0f));
        c0334e.w(f2.getBoolean(6, false));
        c0334e.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0334e.z(f2.getBoolean(8, false));
        }
        c0334e.x(d.E(context3, f2, 7));
        if (f2.hasValue(9)) {
            c0334e.y(d.B(context3, f2, 9));
        }
        c0334e.f4138U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : b.a(context3, resourceId2);
        c0334e.f4139V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (c0334e.f4140W != dimension2) {
            c0334e.f4140W = dimension2;
            c0334e.invalidateSelf();
            c0334e.u();
        }
        c0334e.O(f2.getDimension(35, 0.0f));
        c0334e.N(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (c0334e.f4143Z != dimension3) {
            c0334e.f4143Z = dimension3;
            c0334e.invalidateSelf();
            c0334e.u();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (c0334e.f4144a0 != dimension4) {
            c0334e.f4144a0 = dimension4;
            c0334e.invalidateSelf();
            c0334e.u();
        }
        c0334e.K(f2.getDimension(29, 0.0f));
        c0334e.I(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (c0334e.f4147d0 != dimension5) {
            c0334e.f4147d0 = dimension5;
            c0334e.invalidateSelf();
            c0334e.u();
        }
        c0334e.f4121D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        o.a(context2, attributeSet, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1626n = obtainStyledAttributes.getBoolean(32, false);
        this.f1628p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c0334e);
        c0334e.i(H.i(this));
        o.a(context2, attributeSet, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.shotwins.games.R.attr.chipStyle, com.shotwins.games.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1630r = new C0332c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new C0331b(this));
        }
        setChecked(this.f1622j);
        setText(c0334e.f4122E);
        setEllipsize(c0334e.f4118B0);
        h();
        if (!this.f1619e.C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1626n) {
            setMinHeight(this.f1628p);
        }
        this.f1627o = getLayoutDirection();
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
        RectF rectF = this.f1633u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            C0334e c0334e = this.f1619e;
            Rect bounds = c0334e.getBounds();
            rectF.setEmpty();
            if (c0334e.T()) {
                float f2 = c0334e.f4147d0 + c0334e.f4146c0 + c0334e.f4132O + c0334e.f4145b0 + c0334e.f4144a0;
                if (D.b.a(c0334e) == 0) {
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
        Rect rect = this.f1632t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private E0.d getTextAppearance() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4153k0.f136f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1624l != z2) {
            this.f1624l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1623k != z2) {
            this.f1623k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1628p = i;
        if (!this.f1626n) {
            InsetDrawable insetDrawable = this.f1620f;
            if (insetDrawable == null) {
                int[] iArr = F0.a.f185a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1620f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = F0.a.f185a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1619e.f4169z));
        int max2 = Math.max(0, i - this.f1619e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1620f;
            if (insetDrawable2 == null) {
                int[] iArr3 = F0.a.f185a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1620f = null;
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
        if (this.f1620f != null) {
            Rect rect = new Rect();
            this.f1620f.getPadding(rect);
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
        this.f1620f = new InsetDrawable((Drawable) this.f1619e, i2, i3, i2, i3);
        int[] iArr6 = F0.a.f185a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            Object obj = c0334e.f4129L;
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
        C0334e c0334e = this.f1619e;
        return c0334e != null && c0334e.f4134Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1631s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C0332c c0332c = this.f1630r;
        AccessibilityManager accessibilityManager = c0332c.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = c0332c.f4112q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = c0332c.f687m;
                if (i3 != i2) {
                    c0332c.f687m = i2;
                    c0332c.q(i2, 128);
                    c0332c.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c0332c.f687m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c0332c.f687m = Integer.MIN_VALUE;
                c0332c.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1631s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0332c c0332c = this.f1630r;
        c0332c.getClass();
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
                                while (i < repeatCount && c0332c.m(i2, null)) {
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
                    int i3 = c0332c.f686l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = c0332c.f4112q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1631s) {
                                chip.f1630r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c0332c.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c0332c.m(1, null);
            }
        }
        if (!z2 || c0332c.f686l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0258s, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0334e c0334e = this.f1619e;
        boolean z2 = false;
        if (c0334e != null && C0334e.t(c0334e.f4129L)) {
            C0334e c0334e2 = this.f1619e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f1625m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f1624l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1623k) {
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
            if (this.f1625m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1624l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1623k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0334e2.f4168y0, iArr)) {
                c0334e2.f4168y0 = iArr;
                if (c0334e2.T()) {
                    z2 = c0334e2.v(c0334e2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        C0334e c0334e;
        if (!c() || (c0334e = this.f1619e) == null || !c0334e.f4128K || this.h == null) {
            T.l(this, null);
            this.f1631s = false;
        } else {
            T.l(this, this.f1630r);
            this.f1631s = true;
        }
    }

    public final void f() {
        this.f1621g = new RippleDrawable(F0.a.a(this.f1619e.f4120D), getBackgroundDrawable(), null);
        this.f1619e.getClass();
        RippleDrawable rippleDrawable = this.f1621g;
        WeakHashMap weakHashMap = T.f381a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        C0334e c0334e;
        if (TextUtils.isEmpty(getText()) || (c0334e = this.f1619e) == null) {
            return;
        }
        int q2 = (int) (c0334e.q() + c0334e.f4147d0 + c0334e.f4144a0);
        C0334e c0334e2 = this.f1619e;
        int p2 = (int) (c0334e2.p() + c0334e2.f4140W + c0334e2.f4143Z);
        if (this.f1620f != null) {
            Rect rect = new Rect();
            this.f1620f.getPadding(rect);
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
        if (!TextUtils.isEmpty(this.f1629q)) {
            return this.f1629q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1620f;
        return insetDrawable == null ? this.f1619e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4136S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4137T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4167y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return Math.max(0.0f, c0334e.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1619e;
    }

    public float getChipEndPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4147d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0334e c0334e = this.f1619e;
        if (c0334e == null || (drawable = c0334e.f4124G) == 0) {
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4126I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4125H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4169z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4140W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4117B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4119C;
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
        C0334e c0334e = this.f1619e;
        if (c0334e == null || (drawable = c0334e.f4129L) == 0) {
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4133P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4146c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4132O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4145b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4131N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4118B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1631s) {
            C0332c c0332c = this.f1630r;
            if (c0332c.f686l == 1 || c0332c.f685k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b getHideMotionSpec() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4139V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4142Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4141X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4120D;
        }
        return null;
    }

    public H0.k getShapeAppearanceModel() {
        return this.f1619e.f256a.f242a;
    }

    public b getShowMotionSpec() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4138U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4144a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            return c0334e.f4143Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            paint.drawableState = c0334e.getState();
        }
        E0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1634v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.Z(this, this.f1619e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1617x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1618y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f1631s) {
            C0332c c0332c = this.f1630r;
            int i2 = c0332c.f686l;
            if (i2 != Integer.MIN_VALUE) {
                c0332c.j(i2);
            }
            if (z2) {
                c0332c.m(i, rect);
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
        if (this.f1627o != i) {
            this.f1627o = i;
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
                    if (this.f1623k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f1623k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1631s) {
                    this.f1630r.q(1, 1);
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
        this.f1629q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1621g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0258s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1621g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0258s, android.view.View
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.w(c0334e.f4148e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null) {
            this.f1622j = z2;
        } else if (c0334e.f4134Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.x(drawable);
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.x(l.v(c0334e.f4148e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.y(d.z(c0334e.f4148e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.z(c0334e.f4148e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4167y == colorStateList) {
            return;
        }
        c0334e.f4167y = colorStateList;
        c0334e.onStateChange(c0334e.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList z2;
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4167y == (z2 = d.z(c0334e.f4148e0, i))) {
            return;
        }
        c0334e.f4167y = z2;
        c0334e.onStateChange(c0334e.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.A(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0334e c0334e) {
        C0334e c0334e2 = this.f1619e;
        if (c0334e2 != c0334e) {
            if (c0334e2 != null) {
                c0334e2.f4116A0 = new WeakReference(null);
            }
            this.f1619e = c0334e;
            c0334e.C0 = false;
            c0334e.f4116A0 = new WeakReference(this);
            b(this.f1628p);
        }
    }

    public void setChipEndPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4147d0 == f2) {
            return;
        }
        c0334e.f4147d0 = f2;
        c0334e.invalidateSelf();
        c0334e.u();
    }

    public void setChipEndPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            float dimension = c0334e.f4148e0.getResources().getDimension(i);
            if (c0334e.f4147d0 != dimension) {
                c0334e.f4147d0 = dimension;
                c0334e.invalidateSelf();
                c0334e.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.B(drawable);
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.B(l.v(c0334e.f4148e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.C(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.D(d.z(c0334e.f4148e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.E(c0334e.f4148e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4169z == f2) {
            return;
        }
        c0334e.f4169z = f2;
        c0334e.invalidateSelf();
        c0334e.u();
    }

    public void setChipMinHeightResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            float dimension = c0334e.f4148e0.getResources().getDimension(i);
            if (c0334e.f4169z != dimension) {
                c0334e.f4169z = dimension;
                c0334e.invalidateSelf();
                c0334e.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4140W == f2) {
            return;
        }
        c0334e.f4140W = f2;
        c0334e.invalidateSelf();
        c0334e.u();
    }

    public void setChipStartPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            float dimension = c0334e.f4148e0.getResources().getDimension(i);
            if (c0334e.f4140W != dimension) {
                c0334e.f4140W = dimension;
                c0334e.invalidateSelf();
                c0334e.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.F(d.z(c0334e.f4148e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.G(c0334e.f4148e0.getResources().getDimension(i));
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4133P == charSequence) {
            return;
        }
        String str = I.b.f328b;
        I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f330e : I.b.d;
        bVar.getClass();
        g gVar = h.f338a;
        c0334e.f4133P = bVar.c(charSequence);
        c0334e.invalidateSelf();
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.I(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.H(l.v(c0334e.f4148e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.J(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.K(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.L(d.z(c0334e.f4148e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0258s, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0258s, android.widget.TextView
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1619e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.f4118B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1626n = z2;
        b(this.f1628p);
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.f4139V = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.f4139V = b.a(c0334e.f4148e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.N(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.O(c0334e.f4148e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(B0.h hVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1619e == null) {
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.f4121D0 = i;
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.P(colorStateList);
        }
        this.f1619e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.P(d.z(c0334e.f4148e0, i));
            this.f1619e.getClass();
            f();
        }
    }

    @Override // H0.v
    public void setShapeAppearanceModel(H0.k kVar) {
        this.f1619e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(b bVar) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.f4138U = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.f4138U = b.a(c0334e.f4148e0, i);
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
        C0334e c0334e = this.f1619e;
        if (c0334e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0334e.C0 ? null : charSequence, bufferType);
        C0334e c0334e2 = this.f1619e;
        if (c0334e2 == null || TextUtils.equals(c0334e2.f4122E, charSequence)) {
            return;
        }
        c0334e2.f4122E = charSequence;
        c0334e2.f4153k0.d = true;
        c0334e2.invalidateSelf();
        c0334e2.u();
    }

    public void setTextAppearance(E0.d dVar) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4144a0 == f2) {
            return;
        }
        c0334e.f4144a0 = f2;
        c0334e.invalidateSelf();
        c0334e.u();
    }

    public void setTextEndPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            float dimension = c0334e.f4148e0.getResources().getDimension(i);
            if (c0334e.f4144a0 != dimension) {
                c0334e.f4144a0 = dimension;
                c0334e.invalidateSelf();
                c0334e.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            m mVar = c0334e.f4153k0;
            E0.d dVar = mVar.f136f;
            if (dVar != null) {
                dVar.f181k = applyDimension;
                mVar.f132a.setTextSize(applyDimension);
                c0334e.u();
                c0334e.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        C0334e c0334e = this.f1619e;
        if (c0334e == null || c0334e.f4143Z == f2) {
            return;
        }
        c0334e.f4143Z = f2;
        c0334e.invalidateSelf();
        c0334e.u();
    }

    public void setTextStartPaddingResource(int i) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            float dimension = c0334e.f4148e0.getResources().getDimension(i);
            if (c0334e.f4143Z != dimension) {
                c0334e.f4143Z = dimension;
                c0334e.invalidateSelf();
                c0334e.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.M(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.E(z2);
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
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.Q(new E0.d(c0334e.f4148e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0334e c0334e = this.f1619e;
        if (c0334e != null) {
            c0334e.Q(new E0.d(c0334e.f4148e0, i));
        }
        h();
    }
}
