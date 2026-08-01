package com.google.android.material.chip;

import B0.k;
import B0.m;
import B0.o;
import D.b;
import H0.v;
import I.g;
import I.h;
import K.L;
import K.X;
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
import l.C0284s;
import n0.AbstractC0303a;
import o0.C0306b;
import q1.d;
import w0.C0357b;
import w0.C0358c;
import w0.C0360e;
import w0.InterfaceC0359d;

/* loaded from: classes.dex */
public class Chip extends C0284s implements InterfaceC0359d, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f1833w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1834x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1835y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public C0360e f1836e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1837f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1838g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1839j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1840k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1841l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1842m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1843n;

    /* renamed from: o, reason: collision with root package name */
    public int f1844o;

    /* renamed from: p, reason: collision with root package name */
    public int f1845p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1846q;

    /* renamed from: r, reason: collision with root package name */
    public final C0358c f1847r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1848s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1849t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1850u;

    /* renamed from: v, reason: collision with root package name */
    public final k f1851v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.fortuneink.neonpad.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1849t = new Rect();
        this.f1850u = new RectF();
        this.f1851v = new k(1, this);
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
        C0360e c0360e = new C0360e(context2, attributeSet);
        int[] iArr = AbstractC0303a.f3632c;
        TypedArray f2 = o.f(c0360e.f4565e0, attributeSet, iArr, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0360e.f4540E0 = f2.hasValue(37);
        Context context3 = c0360e.f4565e0;
        ColorStateList y2 = d.y(context3, f2, 24);
        if (c0360e.f4582x != y2) {
            c0360e.f4582x = y2;
            c0360e.onStateChange(c0360e.getState());
        }
        ColorStateList y3 = d.y(context3, f2, 11);
        if (c0360e.f4583y != y3) {
            c0360e.f4583y = y3;
            c0360e.onStateChange(c0360e.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (c0360e.f4585z != dimension) {
            c0360e.f4585z = dimension;
            c0360e.invalidateSelf();
            c0360e.u();
        }
        if (f2.hasValue(12)) {
            c0360e.A(f2.getDimension(12, 0.0f));
        }
        c0360e.F(d.y(context3, f2, 22));
        c0360e.G(f2.getDimension(23, 0.0f));
        c0360e.P(d.y(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0360e.f4539E, text)) {
            c0360e.f4539E = text;
            c0360e.f4570k0.f144d = true;
            c0360e.invalidateSelf();
            c0360e.u();
        }
        E0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new E0.d(context3, resourceId3);
        dVar.f191k = f2.getDimension(1, dVar.f191k);
        c0360e.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            c0360e.f4535B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0360e.f4535B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0360e.f4535B0 = TextUtils.TruncateAt.END;
        }
        c0360e.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0360e.E(f2.getBoolean(15, false));
        }
        c0360e.B(d.A(context3, f2, 14));
        if (f2.hasValue(17)) {
            c0360e.D(d.y(context3, f2, 17));
        }
        c0360e.C(f2.getDimension(16, -1.0f));
        c0360e.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0360e.M(f2.getBoolean(26, false));
        }
        c0360e.H(d.A(context3, f2, 25));
        c0360e.L(d.y(context3, f2, 30));
        c0360e.J(f2.getDimension(28, 0.0f));
        c0360e.w(f2.getBoolean(6, false));
        c0360e.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0360e.z(f2.getBoolean(8, false));
        }
        c0360e.x(d.A(context3, f2, 7));
        if (f2.hasValue(9)) {
            c0360e.y(d.y(context3, f2, 9));
        }
        c0360e.f4555U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : C0306b.a(context3, resourceId2);
        c0360e.f4556V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : C0306b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (c0360e.f4557W != dimension2) {
            c0360e.f4557W = dimension2;
            c0360e.invalidateSelf();
            c0360e.u();
        }
        c0360e.O(f2.getDimension(35, 0.0f));
        c0360e.N(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (c0360e.f4560Z != dimension3) {
            c0360e.f4560Z = dimension3;
            c0360e.invalidateSelf();
            c0360e.u();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (c0360e.f4561a0 != dimension4) {
            c0360e.f4561a0 = dimension4;
            c0360e.invalidateSelf();
            c0360e.u();
        }
        c0360e.K(f2.getDimension(29, 0.0f));
        c0360e.I(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (c0360e.f4564d0 != dimension5) {
            c0360e.f4564d0 = dimension5;
            c0360e.invalidateSelf();
            c0360e.u();
        }
        c0360e.f4538D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        o.a(context2, attributeSet, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1843n = obtainStyledAttributes.getBoolean(32, false);
        this.f1845p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c0360e);
        c0360e.i(L.i(this));
        o.a(context2, attributeSet, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.fortuneink.neonpad.R.attr.chipStyle, com.fortuneink.neonpad.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1847r = new C0358c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new C0357b(this));
        }
        setChecked(this.f1839j);
        setText(c0360e.f4539E);
        setEllipsize(c0360e.f4535B0);
        h();
        if (!this.f1836e.C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1843n) {
            setMinHeight(this.f1845p);
        }
        this.f1844o = getLayoutDirection();
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
        RectF rectF = this.f1850u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            C0360e c0360e = this.f1836e;
            Rect bounds = c0360e.getBounds();
            rectF.setEmpty();
            if (c0360e.T()) {
                float f2 = c0360e.f4564d0 + c0360e.f4563c0 + c0360e.f4549O + c0360e.f4562b0 + c0360e.f4561a0;
                if (b.a(c0360e) == 0) {
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
        Rect rect = this.f1849t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private E0.d getTextAppearance() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4570k0.f146f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1841l != z2) {
            this.f1841l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1840k != z2) {
            this.f1840k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1845p = i;
        if (!this.f1843n) {
            InsetDrawable insetDrawable = this.f1837f;
            if (insetDrawable == null) {
                int[] iArr = F0.a.f195a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1837f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = F0.a.f195a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1836e.f4585z));
        int max2 = Math.max(0, i - this.f1836e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1837f;
            if (insetDrawable2 == null) {
                int[] iArr3 = F0.a.f195a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1837f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = F0.a.f195a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f1837f != null) {
            Rect rect = new Rect();
            this.f1837f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = F0.a.f195a;
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
        this.f1837f = new InsetDrawable((Drawable) this.f1836e, i2, i3, i2, i3);
        int[] iArr6 = F0.a.f195a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            Object obj = c0360e.f4546L;
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
        C0360e c0360e = this.f1836e;
        return c0360e != null && c0360e.f4551Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1848s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C0358c c0358c = this.f1847r;
        AccessibilityManager accessibilityManager = c0358c.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = c0358c.f4529q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = c0358c.f748m;
                if (i3 != i2) {
                    c0358c.f748m = i2;
                    c0358c.q(i2, 128);
                    c0358c.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c0358c.f748m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c0358c.f748m = Integer.MIN_VALUE;
                c0358c.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1848s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0358c c0358c = this.f1847r;
        c0358c.getClass();
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
                                while (i < repeatCount && c0358c.m(i2, null)) {
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
                    int i3 = c0358c.f747l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = c0358c.f4529q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1848s) {
                                chip.f1847r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c0358c.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c0358c.m(1, null);
            }
        }
        if (!z2 || c0358c.f747l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0284s, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0360e c0360e = this.f1836e;
        boolean z2 = false;
        if (c0360e != null && C0360e.t(c0360e.f4546L)) {
            C0360e c0360e2 = this.f1836e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f1842m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f1841l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1840k) {
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
            if (this.f1842m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1841l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1840k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0360e2.f4584y0, iArr)) {
                c0360e2.f4584y0 = iArr;
                if (c0360e2.T()) {
                    z2 = c0360e2.v(c0360e2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        C0360e c0360e;
        if (!c() || (c0360e = this.f1836e) == null || !c0360e.f4545K || this.h == null) {
            X.l(this, null);
            this.f1848s = false;
        } else {
            X.l(this, this.f1847r);
            this.f1848s = true;
        }
    }

    public final void f() {
        this.f1838g = new RippleDrawable(F0.a.a(this.f1836e.f4537D), getBackgroundDrawable(), null);
        this.f1836e.getClass();
        RippleDrawable rippleDrawable = this.f1838g;
        WeakHashMap weakHashMap = X.f418a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        C0360e c0360e;
        if (TextUtils.isEmpty(getText()) || (c0360e = this.f1836e) == null) {
            return;
        }
        int q2 = (int) (c0360e.q() + c0360e.f4564d0 + c0360e.f4561a0);
        C0360e c0360e2 = this.f1836e;
        int p2 = (int) (c0360e2.p() + c0360e2.f4557W + c0360e2.f4560Z);
        if (this.f1837f != null) {
            Rect rect = new Rect();
            this.f1837f.getPadding(rect);
            p2 += rect.left;
            q2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = X.f418a;
        setPaddingRelative(p2, paddingTop, q2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1846q)) {
            return this.f1846q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1837f;
        return insetDrawable == null ? this.f1836e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4553S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4554T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4583y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return Math.max(0.0f, c0360e.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1836e;
    }

    public float getChipEndPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4564d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0360e c0360e = this.f1836e;
        if (c0360e == null || (drawable = c0360e.f4541G) == 0) {
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4543I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4542H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4585z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4557W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4534B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4536C;
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
        C0360e c0360e = this.f1836e;
        if (c0360e == null || (drawable = c0360e.f4546L) == 0) {
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4550P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4563c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4549O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4562b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4548N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4535B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1848s) {
            C0358c c0358c = this.f1847r;
            if (c0358c.f747l == 1 || c0358c.f746k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0306b getHideMotionSpec() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4556V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4559Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4558X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4537D;
        }
        return null;
    }

    public H0.k getShapeAppearanceModel() {
        return this.f1836e.f273a.f258a;
    }

    public C0306b getShowMotionSpec() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4555U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4561a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            return c0360e.f4560Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            paint.drawableState = c0360e.getState();
        }
        E0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1851v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d.V(this, this.f1836e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1834x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1835y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f1848s) {
            C0358c c0358c = this.f1847r;
            int i2 = c0358c.f747l;
            if (i2 != Integer.MIN_VALUE) {
                c0358c.j(i2);
            }
            if (z2) {
                c0358c.m(i, rect);
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
        if (this.f1844o != i) {
            this.f1844o = i;
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
                    if (this.f1840k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f1840k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1848s) {
                    this.f1847r.q(1, 1);
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
        this.f1846q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1838g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0284s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1838g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0284s, android.view.View
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.w(c0360e.f4565e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null) {
            this.f1839j = z2;
        } else if (c0360e.f4551Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.x(drawable);
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.x(d.z(c0360e.f4565e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.y(d.w(c0360e.f4565e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.z(c0360e.f4565e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4583y == colorStateList) {
            return;
        }
        c0360e.f4583y = colorStateList;
        c0360e.onStateChange(c0360e.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList w2;
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4583y == (w2 = d.w(c0360e.f4565e0, i))) {
            return;
        }
        c0360e.f4583y = w2;
        c0360e.onStateChange(c0360e.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.A(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0360e c0360e) {
        C0360e c0360e2 = this.f1836e;
        if (c0360e2 != c0360e) {
            if (c0360e2 != null) {
                c0360e2.f4533A0 = new WeakReference(null);
            }
            this.f1836e = c0360e;
            c0360e.C0 = false;
            c0360e.f4533A0 = new WeakReference(this);
            b(this.f1845p);
        }
    }

    public void setChipEndPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4564d0 == f2) {
            return;
        }
        c0360e.f4564d0 = f2;
        c0360e.invalidateSelf();
        c0360e.u();
    }

    public void setChipEndPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            float dimension = c0360e.f4565e0.getResources().getDimension(i);
            if (c0360e.f4564d0 != dimension) {
                c0360e.f4564d0 = dimension;
                c0360e.invalidateSelf();
                c0360e.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.B(drawable);
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.B(d.z(c0360e.f4565e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.C(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.D(d.w(c0360e.f4565e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.E(c0360e.f4565e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4585z == f2) {
            return;
        }
        c0360e.f4585z = f2;
        c0360e.invalidateSelf();
        c0360e.u();
    }

    public void setChipMinHeightResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            float dimension = c0360e.f4565e0.getResources().getDimension(i);
            if (c0360e.f4585z != dimension) {
                c0360e.f4585z = dimension;
                c0360e.invalidateSelf();
                c0360e.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4557W == f2) {
            return;
        }
        c0360e.f4557W = f2;
        c0360e.invalidateSelf();
        c0360e.u();
    }

    public void setChipStartPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            float dimension = c0360e.f4565e0.getResources().getDimension(i);
            if (c0360e.f4557W != dimension) {
                c0360e.f4557W = dimension;
                c0360e.invalidateSelf();
                c0360e.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.F(d.w(c0360e.f4565e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.G(c0360e.f4565e0.getResources().getDimension(i));
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4550P == charSequence) {
            return;
        }
        String str = I.b.f354b;
        I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f357e : I.b.f356d;
        bVar.getClass();
        g gVar = h.f366a;
        c0360e.f4550P = bVar.c(charSequence);
        c0360e.invalidateSelf();
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.I(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.H(d.z(c0360e.f4565e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.J(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.K(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.L(d.w(c0360e.f4565e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0284s, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0284s, android.widget.TextView
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1836e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.f4535B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1843n = z2;
        b(this.f1845p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0306b c0306b) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.f4556V = c0306b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.f4556V = C0306b.a(c0360e.f4565e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.N(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.O(c0360e.f4565e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(B0.h hVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1836e == null) {
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.f4538D0 = i;
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.P(colorStateList);
        }
        this.f1836e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.P(d.w(c0360e.f4565e0, i));
            this.f1836e.getClass();
            f();
        }
    }

    @Override // H0.v
    public void setShapeAppearanceModel(H0.k kVar) {
        this.f1836e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0306b c0306b) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.f4555U = c0306b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.f4555U = C0306b.a(c0360e.f4565e0, i);
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
        C0360e c0360e = this.f1836e;
        if (c0360e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0360e.C0 ? null : charSequence, bufferType);
        C0360e c0360e2 = this.f1836e;
        if (c0360e2 == null || TextUtils.equals(c0360e2.f4539E, charSequence)) {
            return;
        }
        c0360e2.f4539E = charSequence;
        c0360e2.f4570k0.f144d = true;
        c0360e2.invalidateSelf();
        c0360e2.u();
    }

    public void setTextAppearance(E0.d dVar) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4561a0 == f2) {
            return;
        }
        c0360e.f4561a0 = f2;
        c0360e.invalidateSelf();
        c0360e.u();
    }

    public void setTextEndPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            float dimension = c0360e.f4565e0.getResources().getDimension(i);
            if (c0360e.f4561a0 != dimension) {
                c0360e.f4561a0 = dimension;
                c0360e.invalidateSelf();
                c0360e.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            m mVar = c0360e.f4570k0;
            E0.d dVar = mVar.f146f;
            if (dVar != null) {
                dVar.f191k = applyDimension;
                mVar.f141a.setTextSize(applyDimension);
                c0360e.u();
                c0360e.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        C0360e c0360e = this.f1836e;
        if (c0360e == null || c0360e.f4560Z == f2) {
            return;
        }
        c0360e.f4560Z = f2;
        c0360e.invalidateSelf();
        c0360e.u();
    }

    public void setTextStartPaddingResource(int i) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            float dimension = c0360e.f4565e0.getResources().getDimension(i);
            if (c0360e.f4560Z != dimension) {
                c0360e.f4560Z = dimension;
                c0360e.invalidateSelf();
                c0360e.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.M(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.E(z2);
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
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.Q(new E0.d(c0360e.f4565e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0360e c0360e = this.f1836e;
        if (c0360e != null) {
            c0360e.Q(new E0.d(c0360e.f4565e0, i));
        }
        h();
    }
}
