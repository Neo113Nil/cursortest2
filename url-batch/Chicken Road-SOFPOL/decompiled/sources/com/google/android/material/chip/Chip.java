package com.google.android.material.chip;

import a6.a;
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
import java.util.Locale;
import l.p;
import n5.b;
import n5.c;
import n5.d;
import n5.e;
import n5.f;
import q3.k0;
import r2.o;
import r2.r;
import r5.i;
import r5.k;
import w5.n;
import w5.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class Chip extends p implements e, y, Checkable {

    /* renamed from: h, reason: collision with root package name */
    public f f1901h;
    public InsetDrawable i;

    /* renamed from: j, reason: collision with root package name */
    public RippleDrawable f1902j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f1903k;

    /* renamed from: l, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1904l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1905m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1906n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1907o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1908p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1909q;

    /* renamed from: r, reason: collision with root package name */
    public int f1910r;

    /* renamed from: s, reason: collision with root package name */
    public int f1911s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f1912t;

    /* renamed from: u, reason: collision with root package name */
    public final d f1913u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1914v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1915w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f1916x;

    /* renamed from: y, reason: collision with root package name */
    public final b f1917y;

    /* renamed from: z, reason: collision with root package name */
    public static final Rect f1900z = new Rect();
    public static final int[] A = {R.attr.state_selected};
    public static final int[] B = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1915w = new Rect();
        this.f1916x = new RectF();
        this.f1917y = new b(0, this);
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
        Context context3 = fVar.f5396q0;
        int[] iArr = f5.a.f2738c;
        TypedArray e8 = k.e(context3, attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.Q0 = e8.hasValue(37);
        Context context4 = fVar.f5396q0;
        ColorStateList C = o.C(context4, e8, 24);
        if (fVar.J != C) {
            fVar.J = C;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList C2 = o.C(context4, e8, 11);
        if (fVar.K != C2) {
            fVar.K = C2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = e8.getDimension(19, 0.0f);
        if (fVar.L != dimension) {
            fVar.L = dimension;
            fVar.invalidateSelf();
            fVar.A();
        }
        if (e8.hasValue(12)) {
            fVar.G(e8.getDimension(12, 0.0f));
        }
        fVar.L(o.C(context4, e8, 22));
        fVar.M(e8.getDimension(23, 0.0f));
        fVar.W(o.C(context4, e8, 36));
        String text = e8.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.Q, text)) {
            fVar.Q = text;
            fVar.f5402w0.f6674d = true;
            fVar.invalidateSelf();
            fVar.A();
        }
        t5.d dVar = (!e8.hasValue(0) || (resourceId3 = e8.getResourceId(0, 0)) == 0) ? null : new t5.d(context4, resourceId3);
        dVar.f6917l = e8.getDimension(1, dVar.f6917l);
        fVar.X(dVar);
        int i = e8.getInt(3, 0);
        if (i == 1) {
            fVar.N0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.N0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.N0 = TextUtils.TruncateAt.END;
        }
        fVar.K(e8.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.K(e8.getBoolean(15, false));
        }
        fVar.H(o.E(context4, e8, 14));
        if (e8.hasValue(17)) {
            fVar.J(o.C(context4, e8, 17));
        }
        fVar.I(e8.getDimension(16, -1.0f));
        fVar.T(e8.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.T(e8.getBoolean(26, false));
        }
        fVar.N(o.E(context4, e8, 25));
        fVar.S(o.C(context4, e8, 30));
        fVar.P(e8.getDimension(28, 0.0f));
        fVar.C(e8.getBoolean(6, false));
        fVar.F(e8.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.F(e8.getBoolean(8, false));
        }
        fVar.D(o.E(context4, e8, 7));
        if (e8.hasValue(9)) {
            fVar.E(o.C(context4, e8, 9));
        }
        fVar.f5386g0 = (!e8.hasValue(39) || (resourceId2 = e8.getResourceId(39, 0)) == 0) ? null : g5.b.a(context4, resourceId2);
        fVar.f5387h0 = (!e8.hasValue(33) || (resourceId = e8.getResourceId(33, 0)) == 0) ? null : g5.b.a(context4, resourceId);
        float dimension2 = e8.getDimension(21, 0.0f);
        if (fVar.f5388i0 != dimension2) {
            fVar.f5388i0 = dimension2;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.V(e8.getDimension(35, 0.0f));
        fVar.U(e8.getDimension(34, 0.0f));
        float dimension3 = e8.getDimension(41, 0.0f);
        if (fVar.f5391l0 != dimension3) {
            fVar.f5391l0 = dimension3;
            fVar.invalidateSelf();
            fVar.A();
        }
        float dimension4 = e8.getDimension(40, 0.0f);
        if (fVar.f5392m0 != dimension4) {
            fVar.f5392m0 = dimension4;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.Q(e8.getDimension(29, 0.0f));
        fVar.O(e8.getDimension(27, 0.0f));
        float dimension5 = e8.getDimension(13, 0.0f);
        if (fVar.f5395p0 != dimension5) {
            fVar.f5395p0 = dimension5;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.P0 = e8.getDimensionPixelSize(4, Integer.MAX_VALUE);
        e8.recycle();
        k.a(context2, attributeSet, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1909q = obtainStyledAttributes.getBoolean(32, false);
        TypedValue P = r.P(context2, com.snovikpovik.vuevnxsj.R.attr.minTouchTargetSize);
        this.f1911s = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) ((P == null || P.type != 5) ? context2.getResources().getDimension(com.snovikpovik.vuevnxsj.R.dimen.mtrl_min_touch_target_size) : P.getDimension(context2.getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.m(getElevation());
        k.a(context2, attributeSet, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1913u = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f1905m);
        setText(fVar.Q);
        setEllipsize(fVar.N0);
        g();
        if (!this.f1901h.O0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f1909q) {
            setMinHeight(this.f1911s);
        }
        this.f1910r = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n5.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f1904l;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1916x;
        rectF.setEmpty();
        if (c() && this.f1903k != null) {
            f fVar = this.f1901h;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.a0()) {
                float f6 = fVar.f5395p0 + fVar.f5394o0 + fVar.f5380a0 + fVar.f5393n0 + fVar.f5392m0;
                if (fVar.getLayoutDirection() == 0) {
                    float f8 = bounds.right;
                    rectF.right = f8;
                    rectF.left = f8 - f6;
                } else {
                    float f9 = bounds.left;
                    rectF.left = f9;
                    rectF.right = f9 + f6;
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
        int i8 = (int) closeIconTouchBounds.top;
        int i9 = (int) closeIconTouchBounds.right;
        int i10 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1915w;
        rect.set(i, i8, i9, i10);
        return rect;
    }

    private t5.d getTextAppearance() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5402w0.f6676f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f1907o != z3) {
            this.f1907o = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f1906n != z3) {
            this.f1906n = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1911s = i;
        if (!this.f1909q) {
            InsetDrawable insetDrawable = this.i;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1901h.L));
        int max2 = Math.max(0, i - this.f1901h.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.i;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i8 = max2 > 0 ? max2 / 2 : 0;
        int i9 = max > 0 ? max / 2 : 0;
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i8 && rect.right == i8) {
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
        this.i = new InsetDrawable((Drawable) this.f1901h, i8, i9, i8, i9);
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        f fVar = this.f1901h;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.X;
        if (obj != null) {
            if (obj instanceof j3.b) {
            }
            return obj == null;
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f1901h) == null || !fVar.W || this.f1903k == null) {
            k0.k(this, null);
            this.f1914v = false;
        } else {
            k0.k(this, this.f1913u);
            this.f1914v = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1914v) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f1913u;
        AccessibilityManager accessibilityManager = dVar.f8622h;
        int i8 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x7 = motionEvent.getX();
                float y7 = motionEvent.getY();
                Chip chip = dVar.f5379q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x7, y7)) {
                    i8 = 1;
                }
                int i9 = dVar.f8626m;
                if (i9 != i8) {
                    dVar.f8626m = i8;
                    dVar.r(i8, 128);
                    dVar.r(i9, 256);
                    return true;
                }
            } else if (action == 10 && (i = dVar.f8626m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    dVar.f8626m = Integer.MIN_VALUE;
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
        if (!this.f1914v) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1913u;
        dVar.getClass();
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
                int i8 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i8 = 33;
                                } else if (keyCode == 21) {
                                    i8 = 17;
                                } else if (keyCode != 22) {
                                    i8 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z7 = false;
                                while (i < repeatCount && dVar.m(i8, null)) {
                                    i++;
                                    z7 = true;
                                }
                                z3 = z7;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i9 = dVar.f8625l;
                    if (i9 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f5379q;
                        if (i9 == 0) {
                            chip.performClick();
                        } else if (i9 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f1903k;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1914v) {
                                chip.f1913u.r(1, 1);
                            }
                        }
                    }
                    z3 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z3 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z3 = dVar.m(1, null);
            }
        }
        if (!z3 || dVar.f8625l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1901h;
        boolean z3 = false;
        int i = 0;
        z3 = false;
        if (fVar != null && f.z(fVar.X)) {
            f fVar2 = this.f1901h;
            ?? isEnabled = isEnabled();
            int i8 = isEnabled;
            if (this.f1908p) {
                i8 = isEnabled + 1;
            }
            int i9 = i8;
            if (this.f1907o) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (this.f1906n) {
                i10 = i9 + 1;
            }
            int i11 = i10;
            if (isChecked()) {
                i11 = i10 + 1;
            }
            int[] iArr = new int[i11];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f1908p) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1907o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1906n) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z3 = fVar2.R(iArr);
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        this.f1902j = new RippleDrawable(u5.a.a(this.f1901h.P), getBackgroundDrawable(), null);
        this.f1901h.getClass();
        setBackground(this.f1902j);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f1901h) == null) {
            return;
        }
        int w7 = (int) (fVar.w() + fVar.f5395p0 + fVar.f5392m0);
        f fVar2 = this.f1901h;
        int v7 = (int) (fVar2.v() + fVar2.f5388i0 + fVar2.f5391l0);
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            v7 += rect.left;
            w7 += rect.right;
        }
        setPaddingRelative(v7, getPaddingTop(), w7, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f1901h;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        t5.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f1917y);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1912t)) {
            return this.f1912t;
        }
        f fVar = this.f1901h;
        if (fVar == null || !fVar.f5382c0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.i;
        return insetDrawable == null ? this.f1901h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5384e0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5385f0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.K;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return Math.max(0.0f, fVar.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1901h;
    }

    public float getChipEndPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5395p0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f1901h;
        if (fVar == null || (drawable = fVar.S) == 0) {
            return null;
        }
        if (!(drawable instanceof j3.b)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.U;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.T;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.L;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5388i0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.N;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.O;
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
        f fVar = this.f1901h;
        if (fVar == null || (drawable = fVar.X) == 0) {
            return null;
        }
        if (!(drawable instanceof j3.b)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5381b0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5394o0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5380a0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5393n0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.Z;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.N0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1914v) {
            d dVar = this.f1913u;
            if (dVar.f8625l == 1 || dVar.f8624k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g5.b getHideMotionSpec() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5387h0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5390k0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5389j0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.P;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        return this.f1901h.f8105e.f8087a;
    }

    public g5.b getShowMotionSpec() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5386g0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5392m0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f1901h;
        if (fVar != null) {
            return fVar.f5391l0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o.n0(this, this.f1901h);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        f fVar = this.f1901h;
        if (fVar != null && fVar.f5382c0) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        if (this.f1914v) {
            d dVar = this.f1913u;
            int i8 = dVar.f8625l;
            if (i8 != Integer.MIN_VALUE) {
                dVar.j(i8);
            }
            if (z3) {
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
        f fVar = this.f1901h;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f5382c0);
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
        if (this.f1910r != i) {
            this.f1910r = i;
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
                    if (this.f1906n) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z3 = true;
                    }
                }
                z3 = false;
            } else if (this.f1906n) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f1903k;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1914v) {
                    this.f1913u.r(1, 1);
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
        this.f1912t = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1902j) {
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
        if (drawable == getBackgroundDrawable() || drawable == this.f1902j) {
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

    public void setCheckable(boolean z3) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.C(z3);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.C(fVar.f5396q0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        f fVar = this.f1901h;
        if (fVar == null) {
            this.f1905m = z3;
        } else if (fVar.f5382c0) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.D(drawable);
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
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.D(h0.a.D(fVar.f5396q0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.E(s6.a.q(fVar.f5396q0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.F(fVar.f5396q0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.K == colorStateList) {
            return;
        }
        fVar.K = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList q4;
        f fVar = this.f1901h;
        if (fVar == null || fVar.K == (q4 = s6.a.q(fVar.f5396q0, i))) {
            return;
        }
        fVar.K = q4;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.G(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.G(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f1901h;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.M0 = new WeakReference(null);
            }
            this.f1901h = fVar;
            fVar.O0 = false;
            fVar.M0 = new WeakReference(this);
            b(this.f1911s);
        }
    }

    public void setChipEndPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.f5395p0 == f6) {
            return;
        }
        fVar.f5395p0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            float dimension = fVar.f5396q0.getResources().getDimension(i);
            if (fVar.f5395p0 != dimension) {
                fVar.f5395p0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.H(drawable);
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
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.H(h0.a.D(fVar.f5396q0, i));
        }
    }

    public void setChipIconSize(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.I(f6);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.I(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.J(s6.a.q(fVar.f5396q0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.K(fVar.f5396q0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f6) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.L == f6) {
            return;
        }
        fVar.L = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            float dimension = fVar.f5396q0.getResources().getDimension(i);
            if (fVar.L != dimension) {
                fVar.L = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.f5388i0 == f6) {
            return;
        }
        fVar.f5388i0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            float dimension = fVar.f5396q0.getResources().getDimension(i);
            if (fVar.f5388i0 != dimension) {
                fVar.f5388i0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.L(s6.a.q(fVar.f5396q0, i));
        }
    }

    public void setChipStrokeWidth(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.M(f6);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.M(fVar.f5396q0.getResources().getDimension(i));
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
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.f5381b0 == charSequence) {
            return;
        }
        String str = o3.b.f5604b;
        o3.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? o3.b.f5607e : o3.b.f5606d;
        bVar.getClass();
        k5.c cVar = o3.f.f5614a;
        fVar.f5381b0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.O(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.O(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.N(h0.a.D(fVar.f5396q0, i));
        }
        d();
    }

    public void setCloseIconSize(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.P(f6);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.P(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.Q(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.Q(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.S(s6.a.q(fVar.f5396q0, i));
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i8, i9, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i8, i9, i10);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.m(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1901h == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.N0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f1909q = z3;
        b(this.f1911s);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(g5.b bVar) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.f5387h0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.f5387h0 = g5.b.a(fVar.f5396q0, i);
        }
    }

    public void setIconEndPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.U(f6);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.U(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.V(f6);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.V(fVar.f5396q0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1901h == null) {
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
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.P0 = i;
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
        this.f1904l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1903k = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.W(colorStateList);
        }
        this.f1901h.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.W(s6.a.q(fVar.f5396q0, i));
            this.f1901h.getClass();
            e();
        }
    }

    @Override // w5.y
    public void setShapeAppearanceModel(n nVar) {
        this.f1901h.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(g5.b bVar) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.f5386g0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.f5386g0 = g5.b.a(fVar.f5396q0, i);
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
        f fVar = this.f1901h;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.O0 ? null : charSequence, bufferType);
        f fVar2 = this.f1901h;
        if (fVar2 == null || TextUtils.equals(fVar2.Q, charSequence)) {
            return;
        }
        fVar2.Q = charSequence;
        fVar2.f5402w0.f6674d = true;
        fVar2.invalidateSelf();
        fVar2.A();
    }

    public void setTextAppearance(t5.d dVar) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.X(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.f5392m0 == f6) {
            return;
        }
        fVar.f5392m0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            float dimension = fVar.f5396q0.getResources().getDimension(i);
            if (fVar.f5392m0 != dimension) {
                fVar.f5392m0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        super.setTextSize(i, f6);
        f fVar = this.f1901h;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f6, getResources().getDisplayMetrics());
            i iVar = fVar.f5402w0;
            t5.d dVar = iVar.f6676f;
            if (dVar != null) {
                dVar.f6917l = applyDimension;
                iVar.f6671a.setTextSize(applyDimension);
                fVar.A();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f6) {
        f fVar = this.f1901h;
        if (fVar == null || fVar.f5391l0 == f6) {
            return;
        }
        fVar.f5391l0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.f1901h;
        if (fVar != null) {
            float dimension = fVar.f5396q0.getResources().getDimension(i);
            if (fVar.f5391l0 != dimension) {
                fVar.f5391l0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.T(z3);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z3) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.F(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.K(z3);
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
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.X(new t5.d(fVar.f5396q0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f1901h;
        if (fVar != null) {
            fVar.X(new t5.d(fVar.f5396q0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(r5.e eVar) {
    }
}
