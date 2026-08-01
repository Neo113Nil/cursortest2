package com.google.android.material.chip;

import A0.b;
import A0.c;
import A0.d;
import A0.e;
import A0.f;
import F0.m;
import K.g;
import K.h;
import L0.k;
import L0.v;
import M.F;
import M.Q;
import Q0.a;
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
import l.r;
import q0.AbstractC0257a;
import r0.C0261b;
import z1.l;

/* loaded from: classes.dex */
public class Chip extends r implements e, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f1825w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1826x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1827y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public f f1828e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1829f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1830g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1831j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1832k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1833l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1834m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1835n;

    /* renamed from: o, reason: collision with root package name */
    public int f1836o;

    /* renamed from: p, reason: collision with root package name */
    public int f1837p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1838q;

    /* renamed from: r, reason: collision with root package name */
    public final d f1839r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1840s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1841t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1842u;

    /* renamed from: v, reason: collision with root package name */
    public final b f1843v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.winfour.neondrop.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1841t = new Rect();
        this.f1842u = new RectF();
        this.f1843v = new b(0, this);
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
        int[] iArr = AbstractC0257a.d;
        TypedArray f2 = m.f(fVar.f43e0, attributeSet, iArr, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f18E0 = f2.hasValue(37);
        Context context3 = fVar.f43e0;
        ColorStateList v2 = z1.d.v(context3, f2, 24);
        if (fVar.f61x != v2) {
            fVar.f61x = v2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList v3 = z1.d.v(context3, f2, 11);
        if (fVar.f63y != v3) {
            fVar.f63y = v3;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (fVar.f65z != dimension) {
            fVar.f65z = dimension;
            fVar.invalidateSelf();
            fVar.y();
        }
        if (f2.hasValue(12)) {
            fVar.E(f2.getDimension(12, 0.0f));
        }
        fVar.J(z1.d.v(context3, f2, 22));
        fVar.K(f2.getDimension(23, 0.0f));
        fVar.T(z1.d.v(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f17E, text)) {
            fVar.f17E = text;
            fVar.f49k0.d = true;
            fVar.invalidateSelf();
            fVar.y();
        }
        I0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new I0.d(context3, resourceId3);
        dVar.f349k = f2.getDimension(1, dVar.f349k);
        fVar.U(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            fVar.B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.B0 = TextUtils.TruncateAt.END;
        }
        fVar.I(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.I(f2.getBoolean(15, false));
        }
        fVar.F(z1.d.y(context3, f2, 14));
        if (f2.hasValue(17)) {
            fVar.H(z1.d.v(context3, f2, 17));
        }
        fVar.G(f2.getDimension(16, -1.0f));
        fVar.Q(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.Q(f2.getBoolean(26, false));
        }
        fVar.L(z1.d.y(context3, f2, 25));
        fVar.P(z1.d.v(context3, f2, 30));
        fVar.N(f2.getDimension(28, 0.0f));
        fVar.A(f2.getBoolean(6, false));
        fVar.D(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.D(f2.getBoolean(8, false));
        }
        fVar.B(z1.d.y(context3, f2, 7));
        if (f2.hasValue(9)) {
            fVar.C(z1.d.v(context3, f2, 9));
        }
        fVar.f33U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : C0261b.a(context3, resourceId2);
        fVar.f34V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : C0261b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (fVar.f35W != dimension2) {
            fVar.f35W = dimension2;
            fVar.invalidateSelf();
            fVar.y();
        }
        fVar.S(f2.getDimension(35, 0.0f));
        fVar.R(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (fVar.f38Z != dimension3) {
            fVar.f38Z = dimension3;
            fVar.invalidateSelf();
            fVar.y();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (fVar.f39a0 != dimension4) {
            fVar.f39a0 = dimension4;
            fVar.invalidateSelf();
            fVar.y();
        }
        fVar.O(f2.getDimension(29, 0.0f));
        fVar.M(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (fVar.f42d0 != dimension5) {
            fVar.f42d0 = dimension5;
            fVar.invalidateSelf();
            fVar.y();
        }
        fVar.f16D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        m.a(context2, attributeSet, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1835n = obtainStyledAttributes.getBoolean(32, false);
        this.f1837p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.k(F.i(this));
        m.a(context2, attributeSet, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1839r = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f1831j);
        setText(fVar.f17E);
        setEllipsize(fVar.B0);
        h();
        if (!this.f1828e.f14C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1835n) {
            setMinHeight(this.f1837p);
        }
        this.f1836o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A0.a
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
        RectF rectF = this.f1842u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            f fVar = this.f1828e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.X()) {
                float f2 = fVar.f42d0 + fVar.f41c0 + fVar.f27O + fVar.f40b0 + fVar.f39a0;
                if (F.b.a(fVar) == 0) {
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
        Rect rect = this.f1841t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private I0.d getTextAppearance() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f49k0.f315f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1833l != z2) {
            this.f1833l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1832k != z2) {
            this.f1832k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1837p = i;
        if (!this.f1835n) {
            InsetDrawable insetDrawable = this.f1829f;
            if (insetDrawable == null) {
                int[] iArr = J0.a.f383a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1829f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = J0.a.f383a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1828e.f65z));
        int max2 = Math.max(0, i - this.f1828e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1829f;
            if (insetDrawable2 == null) {
                int[] iArr3 = J0.a.f383a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1829f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = J0.a.f383a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f1829f != null) {
            Rect rect = new Rect();
            this.f1829f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = J0.a.f383a;
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
        this.f1829f = new InsetDrawable((Drawable) this.f1828e, i2, i3, i2, i3);
        int[] iArr6 = J0.a.f383a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        f fVar = this.f1828e;
        if (fVar != null) {
            Object obj = fVar.f24L;
            if (obj != null) {
                if (obj instanceof F.d) {
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
        f fVar = this.f1828e;
        return fVar != null && fVar.f29Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1840s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f1839r;
        AccessibilityManager accessibilityManager = dVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = dVar.f8q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = dVar.f836m;
                if (i3 != i2) {
                    dVar.f836m = i2;
                    dVar.q(i2, 128);
                    dVar.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = dVar.f836m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f836m = Integer.MIN_VALUE;
                dVar.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1840s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1839r;
        dVar.getClass();
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
                                while (i < repeatCount && dVar.m(i2, null)) {
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
                    int i3 = dVar.f835l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f8q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1840s) {
                                chip.f1839r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = dVar.m(1, null);
            }
        }
        if (!z2 || dVar.f835l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.f1828e;
        boolean z2 = false;
        if (fVar != null && f.x(fVar.f24L)) {
            f fVar2 = this.f1828e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f1834m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f1833l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1832k) {
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
            if (this.f1834m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1833l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1832k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(fVar2.f64y0, iArr)) {
                fVar2.f64y0 = iArr;
                if (fVar2.X()) {
                    z2 = fVar2.z(fVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.f1828e) == null || !fVar.f23K || this.h == null) {
            Q.l(this, null);
            this.f1840s = false;
        } else {
            Q.l(this, this.f1839r);
            this.f1840s = true;
        }
    }

    public final void f() {
        this.f1830g = new RippleDrawable(J0.a.a(this.f1828e.f15D), getBackgroundDrawable(), null);
        this.f1828e.getClass();
        RippleDrawable rippleDrawable = this.f1830g;
        WeakHashMap weakHashMap = Q.f513a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f1828e) == null) {
            return;
        }
        int u2 = (int) (fVar.u() + fVar.f42d0 + fVar.f39a0);
        f fVar2 = this.f1828e;
        int t2 = (int) (fVar2.t() + fVar2.f35W + fVar2.f38Z);
        if (this.f1829f != null) {
            Rect rect = new Rect();
            this.f1829f.getPadding(rect);
            t2 += rect.left;
            u2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = Q.f513a;
        setPaddingRelative(t2, paddingTop, u2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1838q)) {
            return this.f1838q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1829f;
        return insetDrawable == null ? this.f1828e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f31S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f32T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f63y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1828e;
    }

    public float getChipEndPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f42d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f1828e;
        if (fVar == null || (drawable = fVar.f20G) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof F.d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f21I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f65z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f35W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f12B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f13C;
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
        f fVar = this.f1828e;
        if (fVar == null || (drawable = fVar.f24L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof F.d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f28P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f41c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f27O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f40b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f26N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1840s) {
            d dVar = this.f1839r;
            if (dVar.f835l == 1 || dVar.f834k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0261b getHideMotionSpec() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f34V;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f37Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f36X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f15D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f1828e.f433a.f419a;
    }

    public C0261b getShowMotionSpec() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f33U;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f39a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f1828e;
        if (fVar != null) {
            return fVar.f38Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f1828e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        I0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1843v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.s0(this, this.f1828e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1826x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1827y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f1840s) {
            d dVar = this.f1839r;
            int i2 = dVar.f835l;
            if (i2 != Integer.MIN_VALUE) {
                dVar.j(i2);
            }
            if (z2) {
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
        if (this.f1836o != i) {
            this.f1836o = i;
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
                    if (this.f1832k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f1832k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1840s) {
                    this.f1839r.q(1, 1);
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
        this.f1838q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1830g) {
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
        if (drawable == getBackgroundDrawable() || drawable == this.f1830g) {
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

    public void setCheckable(boolean z2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.A(z2);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.A(fVar.f43e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.f1828e;
        if (fVar == null) {
            this.f1831j = z2;
        } else if (fVar.f29Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.B(drawable);
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.B(l.F(fVar.f43e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.C(l.D(fVar.f43e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.D(fVar.f43e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f63y == colorStateList) {
            return;
        }
        fVar.f63y = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList D2;
        f fVar = this.f1828e;
        if (fVar == null || fVar.f63y == (D2 = l.D(fVar.f43e0, i))) {
            return;
        }
        fVar.f63y = D2;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.E(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.E(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f1828e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f11A0 = new WeakReference(null);
            }
            this.f1828e = fVar;
            fVar.f14C0 = false;
            fVar.f11A0 = new WeakReference(this);
            b(this.f1837p);
        }
    }

    public void setChipEndPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f42d0 == f2) {
            return;
        }
        fVar.f42d0 = f2;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            float dimension = fVar.f43e0.getResources().getDimension(i);
            if (fVar.f42d0 != dimension) {
                fVar.f42d0 = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.F(drawable);
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.F(l.F(fVar.f43e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.G(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.G(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.H(l.D(fVar.f43e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.I(fVar.f43e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f65z == f2) {
            return;
        }
        fVar.f65z = f2;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            float dimension = fVar.f43e0.getResources().getDimension(i);
            if (fVar.f65z != dimension) {
                fVar.f65z = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f35W == f2) {
            return;
        }
        fVar.f35W = f2;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            float dimension = fVar.f43e0.getResources().getDimension(i);
            if (fVar.f35W != dimension) {
                fVar.f35W = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.J(l.D(fVar.f43e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.K(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.K(fVar.f43e0.getResources().getDimension(i));
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.L(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f28P == charSequence) {
            return;
        }
        String str = K.b.f389b;
        K.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? K.b.f391e : K.b.d;
        bVar.getClass();
        g gVar = h.f399a;
        fVar.f28P = bVar.c(charSequence);
        fVar.invalidateSelf();
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.M(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.M(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.L(l.F(fVar.f43e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.N(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.N(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.O(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.O(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.P(l.D(fVar.f43e0, i));
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.k(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1828e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1835n = z2;
        b(this.f1837p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0261b c0261b) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.f34V = c0261b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.f34V = C0261b.a(fVar.f43e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.R(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.R(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.S(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.S(fVar.f43e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(F0.g gVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1828e == null) {
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.f16D0 = i;
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.T(colorStateList);
        }
        this.f1828e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.T(l.D(fVar.f43e0, i));
            this.f1828e.getClass();
            f();
        }
    }

    @Override // L0.v
    public void setShapeAppearanceModel(k kVar) {
        this.f1828e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0261b c0261b) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.f33U = c0261b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.f33U = C0261b.a(fVar.f43e0, i);
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
        f fVar = this.f1828e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f14C0 ? null : charSequence, bufferType);
        f fVar2 = this.f1828e;
        if (fVar2 == null || TextUtils.equals(fVar2.f17E, charSequence)) {
            return;
        }
        fVar2.f17E = charSequence;
        fVar2.f49k0.d = true;
        fVar2.invalidateSelf();
        fVar2.y();
    }

    public void setTextAppearance(I0.d dVar) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.U(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f39a0 == f2) {
            return;
        }
        fVar.f39a0 = f2;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            float dimension = fVar.f43e0.getResources().getDimension(i);
            if (fVar.f39a0 != dimension) {
                fVar.f39a0 = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        f fVar = this.f1828e;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            F0.k kVar = fVar.f49k0;
            I0.d dVar = kVar.f315f;
            if (dVar != null) {
                dVar.f349k = applyDimension;
                kVar.f311a.setTextSize(applyDimension);
                fVar.y();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        f fVar = this.f1828e;
        if (fVar == null || fVar.f38Z == f2) {
            return;
        }
        fVar.f38Z = f2;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.f1828e;
        if (fVar != null) {
            float dimension = fVar.f43e0.getResources().getDimension(i);
            if (fVar.f38Z != dimension) {
                fVar.f38Z = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.Q(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.D(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.I(z2);
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
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.U(new I0.d(fVar.f43e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f1828e;
        if (fVar != null) {
            fVar.U(new I0.d(fVar.f43e0, i));
        }
        h();
    }
}
