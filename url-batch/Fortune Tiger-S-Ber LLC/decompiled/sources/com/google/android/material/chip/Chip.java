package com.google.android.material.chip;

import a2.i;
import a2.l;
import a2.n;
import a2.p;
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
import g2.o;
import g2.z;
import i0.f;
import i0.g;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k.q;
import k0.j0;
import k3.m;
import l2.a;
import m1.b;
import u1.c;
import u1.d;
import u1.e;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class Chip extends q implements d, z, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final l A;

    /* renamed from: j, reason: collision with root package name */
    public e f1255j;

    /* renamed from: k, reason: collision with root package name */
    public InsetDrawable f1256k;

    /* renamed from: l, reason: collision with root package name */
    public RippleDrawable f1257l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f1258m;

    /* renamed from: n, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1259n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1260o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1261p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1262q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1263r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1264s;

    /* renamed from: t, reason: collision with root package name */
    public int f1265t;

    /* renamed from: u, reason: collision with root package name */
    public int f1266u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1267v;

    /* renamed from: w, reason: collision with root package name */
    public final c f1268w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1269x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f1270y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f1271z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.gglhk.bofio.fortunetiger.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1270y = new Rect();
        this.f1271z = new RectF();
        this.A = new l(1, this);
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
        Context context3 = eVar.f3419s0;
        int[] iArr = l1.a.c;
        TypedArray e4 = p.e(context3, attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.S0 = e4.hasValue(39);
        Context context4 = eVar.f3419s0;
        ColorStateList u3 = m.u(context4, e4, 25);
        if (eVar.L != u3) {
            eVar.L = u3;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList u4 = m.u(context4, e4, 12);
        if (eVar.M != u4) {
            eVar.M = u4;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = e4.getDimension(20, 0.0f);
        if (eVar.N != dimension) {
            eVar.N = dimension;
            eVar.invalidateSelf();
            eVar.D();
        }
        if (e4.hasValue(13)) {
            eVar.J(e4.getDimension(13, 0.0f));
        }
        eVar.O(m.u(context4, e4, 23));
        eVar.P(e4.getDimension(24, 0.0f));
        eVar.Z(m.u(context4, e4, 38));
        String text = e4.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.S, text)) {
            eVar.S = text;
            eVar.f3425y0.f60d = true;
            eVar.invalidateSelf();
            eVar.D();
        }
        d2.d dVar = (!e4.hasValue(0) || (resourceId3 = e4.getResourceId(0, 0)) == 0) ? null : new d2.d(context4, resourceId3);
        dVar.f1482l = e4.getDimension(1, dVar.f1482l);
        int i4 = e4.hasValue(34) ? 34 : 7;
        if (e4.hasValue(i4)) {
            dVar.c = e4.getString(i4);
        }
        eVar.a0(dVar);
        int i5 = e4.getInt(3, 0);
        if (i5 == 1) {
            eVar.P0 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            eVar.P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            eVar.P0 = TextUtils.TruncateAt.END;
        }
        eVar.N(e4.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.N(e4.getBoolean(16, false));
        }
        eVar.K(m.x(context4, e4, 15));
        if (e4.hasValue(18)) {
            eVar.M(m.u(context4, e4, 18));
        }
        eVar.L(e4.getDimension(17, -1.0f));
        eVar.W(e4.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.W(e4.getBoolean(27, false));
        }
        eVar.Q(m.x(context4, e4, 26));
        eVar.V(m.u(context4, e4, 31));
        eVar.S(e4.getDimension(29, 0.0f));
        eVar.F(e4.getBoolean(6, false));
        eVar.I(e4.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.I(e4.getBoolean(9, false));
        }
        eVar.G(m.x(context4, e4, 8));
        if (e4.hasValue(10)) {
            eVar.H(m.u(context4, e4, 10));
        }
        eVar.f3409i0 = (!e4.hasValue(41) || (resourceId2 = e4.getResourceId(41, 0)) == 0) ? null : b.a(context4, resourceId2);
        eVar.f3410j0 = (!e4.hasValue(35) || (resourceId = e4.getResourceId(35, 0)) == 0) ? null : b.a(context4, resourceId);
        float dimension2 = e4.getDimension(22, 0.0f);
        if (eVar.f3411k0 != dimension2) {
            eVar.f3411k0 = dimension2;
            eVar.invalidateSelf();
            eVar.D();
        }
        eVar.Y(e4.getDimension(37, 0.0f));
        eVar.X(e4.getDimension(36, 0.0f));
        float dimension3 = e4.getDimension(43, 0.0f);
        if (eVar.f3414n0 != dimension3) {
            eVar.f3414n0 = dimension3;
            eVar.invalidateSelf();
            eVar.D();
        }
        float dimension4 = e4.getDimension(42, 0.0f);
        if (eVar.f3415o0 != dimension4) {
            eVar.f3415o0 = dimension4;
            eVar.invalidateSelf();
            eVar.D();
        }
        eVar.T(e4.getDimension(30, 0.0f));
        eVar.R(e4.getDimension(28, 0.0f));
        float dimension5 = e4.getDimension(14, 0.0f);
        if (eVar.f3418r0 != dimension5) {
            eVar.f3418r0 = dimension5;
            eVar.invalidateSelf();
            eVar.D();
        }
        eVar.R0 = e4.getDimensionPixelSize(4, Integer.MAX_VALUE);
        e4.recycle();
        p.a(context2, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1264s = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue X = k3.d.X(theme, com.gglhk.bofio.fortunetiger.R.attr.minTouchTargetSize);
        this.f1266u = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((X == null || X.type != 5) ? Float.NaN : X.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.p(getElevation());
        p.a(context2, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.f1268w = new c(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new u1.b(this));
        }
        setChecked(this.f1260o);
        setText(eVar.S);
        setEllipsize(eVar.P0);
        g();
        if (!this.f1255j.Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f1264s) {
            setMinHeight(this.f1266u);
        }
        this.f1265t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: u1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f1259n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1271z;
        rectF.setEmpty();
        if (c() && this.f1258m != null) {
            e eVar = this.f1255j;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.d0()) {
                float f4 = eVar.f3418r0 + eVar.f3417q0 + eVar.f3404c0 + eVar.f3416p0 + eVar.f3415o0;
                if (eVar.getLayoutDirection() == 0) {
                    float f5 = bounds.right;
                    rectF.right = f5;
                    rectF.left = f5 - f4;
                } else {
                    float f6 = bounds.left;
                    rectF.left = f6;
                    rectF.right = f6 + f4;
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
        int i4 = (int) closeIconTouchBounds.left;
        int i5 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i7 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1270y;
        rect.set(i4, i5, i6, i7);
        return rect;
    }

    private d2.d getTextAppearance() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3425y0.f62f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f1262q != z3) {
            this.f1262q = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f1261p != z3) {
            this.f1261p = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i4) {
        this.f1266u = i4;
        if (!this.f1264s) {
            InsetDrawable insetDrawable = this.f1256k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1256k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i4 - ((int) this.f1255j.N));
        int max2 = Math.max(0, i4 - this.f1255j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1256k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1256k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i5 = max2 > 0 ? max2 / 2 : 0;
        int i6 = max > 0 ? max / 2 : 0;
        if (this.f1256k != null) {
            Rect rect = new Rect();
            this.f1256k.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                e();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.f1256k = new InsetDrawable((Drawable) this.f1255j, i5, i6, i5, i6);
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        e eVar = this.f1255j;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.Z;
        if (obj != null) {
            if (obj instanceof d0.b) {
            }
            return obj == null;
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final void d() {
        e eVar;
        if (!c() || (eVar = this.f1255j) == null || !eVar.Y || this.f1258m == null) {
            j0.m(this, null);
            this.f1269x = false;
        } else {
            j0.m(this, this.f1268w);
            this.f1269x = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i4;
        if (!this.f1269x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f1268w;
        AccessibilityManager accessibilityManager = cVar.h;
        int i5 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                Chip chip = cVar.f3402q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x3, y3)) {
                    i5 = 1;
                }
                int i6 = cVar.f3103m;
                if (i6 != i5) {
                    cVar.f3103m = i5;
                    cVar.r(i5, 128);
                    cVar.r(i6, 256);
                    return true;
                }
            } else if (action == 10 && (i4 = cVar.f3103m) != Integer.MIN_VALUE) {
                if (i4 != Integer.MIN_VALUE) {
                    cVar.f3103m = Integer.MIN_VALUE;
                    cVar.r(Integer.MIN_VALUE, 128);
                    cVar.r(i4, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1269x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f1268w;
        cVar.getClass();
        boolean z3 = false;
        int i4 = 0;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i5 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i5 = 33;
                                } else if (keyCode == 21) {
                                    i5 = 17;
                                } else if (keyCode != 22) {
                                    i5 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i4 < repeatCount && cVar.m(i5, null)) {
                                    i4++;
                                    z4 = true;
                                }
                                z3 = z4;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i6 = cVar.f3102l;
                    if (i6 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f3402q;
                        if (i6 == 0) {
                            chip.performClick();
                        } else if (i6 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f1258m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1269x) {
                                chip.f1268w.r(1, 1);
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
        if (!z3 || cVar.f3102l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // k.q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1255j;
        boolean z3 = false;
        int i4 = 0;
        z3 = false;
        if (eVar != null && e.C(eVar.Z)) {
            e eVar2 = this.f1255j;
            ?? isEnabled = isEnabled();
            int i5 = isEnabled;
            if (this.f1263r) {
                i5 = isEnabled + 1;
            }
            int i6 = i5;
            if (this.f1262q) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (this.f1261p) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (isChecked()) {
                i8 = i7 + 1;
            }
            int[] iArr = new int[i8];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i4 = 1;
            }
            if (this.f1263r) {
                iArr[i4] = 16842908;
                i4++;
            }
            if (this.f1262q) {
                iArr[i4] = 16843623;
                i4++;
            }
            if (this.f1261p) {
                iArr[i4] = 16842919;
                i4++;
            }
            if (isChecked()) {
                iArr[i4] = 16842913;
            }
            z3 = eVar2.U(iArr);
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(e2.a.a(this.f1255j.R), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.f1255j);
        this.f1257l = rippleDrawable;
        this.f1255j.getClass();
        setBackground(this.f1257l);
        f();
    }

    public final void f() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f1255j) == null) {
            return;
        }
        int z3 = (int) (eVar.z() + eVar.f3418r0 + eVar.f3415o0);
        e eVar2 = this.f1255j;
        int y3 = (int) (eVar2.y() + eVar2.f3411k0 + eVar2.f3414n0);
        if (this.f1256k != null) {
            Rect rect = new Rect();
            this.f1256k.getPadding(rect);
            y3 += rect.left;
            z3 += rect.right;
        }
        setPaddingRelative(y3, getPaddingTop(), z3, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.f1255j;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        d2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1267v)) {
            return this.f1267v;
        }
        e eVar = this.f1255j;
        if (eVar == null || !eVar.f3406e0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1256k;
        return insetDrawable == null ? this.f1255j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3407g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3408h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return Math.max(0.0f, eVar.A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1255j;
    }

    public float getChipEndPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3418r0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f1255j;
        if (eVar == null || (drawable = eVar.U) == 0) {
            return null;
        }
        if (!(drawable instanceof d0.b)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.V;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3411k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1255j;
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
        e eVar = this.f1255j;
        if (eVar == null || (drawable = eVar.Z) == 0) {
            return null;
        }
        if (!(drawable instanceof d0.b)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3405d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3417q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3404c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3416p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3403b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1269x) {
            c cVar = this.f1268w;
            if (cVar.f3102l == 1 || cVar.f3101k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        e eVar = this.f1255j;
        if (eVar == null) {
            return super.getFontVariationSettings();
        }
        d2.d dVar = eVar.f3425y0.f62f;
        if (dVar != null) {
            return dVar.c;
        }
        return null;
    }

    public b getHideMotionSpec() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3410j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3413m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3412l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.R;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.f1255j.i();
    }

    public b getShowMotionSpec() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3409i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3415o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f1255j;
        if (eVar != null) {
            return eVar.f3414n0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.S(this, this.f1255j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        e eVar = this.f1255j;
        if (eVar != null && eVar.f3406e0) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (this.f1269x) {
            c cVar = this.f1268w;
            int i5 = cVar.f3102l;
            if (i5 != Integer.MIN_VALUE) {
                cVar.j(i5);
            }
            if (z3) {
                cVar.m(i4, rect);
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
        e eVar = this.f1255j;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f3406e0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f1265t != i4) {
            this.f1265t = i4;
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
                    if (this.f1261p) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z3 = true;
                    }
                }
                z3 = false;
            } else if (this.f1261p) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f1258m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1269x) {
                    this.f1268w.r(1, 1);
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
        this.f1267v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1257l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // k.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1257l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // k.q, android.view.View
    public void setBackgroundResource(int i4) {
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
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.F(z3);
        }
    }

    public void setCheckableResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.F(eVar.f3419s0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        e eVar = this.f1255j;
        if (eVar == null) {
            this.f1260o = z3;
        } else if (eVar.f3406e0) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.G(m.w(eVar.f3419s0, i4));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.H(k3.d.D(eVar.f3419s0, i4));
        }
    }

    public void setCheckedIconVisible(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.I(eVar.f3419s0.getResources().getBoolean(i4));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.M == colorStateList) {
            return;
        }
        eVar.M = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i4) {
        ColorStateList D2;
        e eVar = this.f1255j;
        if (eVar == null || eVar.M == (D2 = k3.d.D(eVar.f3419s0, i4))) {
            return;
        }
        eVar.M = D2;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.J(f4);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.J(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f1255j;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.O0 = new WeakReference(null);
            }
            this.f1255j = eVar;
            eVar.Q0 = false;
            eVar.O0 = new WeakReference(this);
            b(this.f1266u);
        }
    }

    public void setChipEndPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.f3418r0 == f4) {
            return;
        }
        eVar.f3418r0 = f4;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setChipEndPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            float dimension = eVar.f3419s0.getResources().getDimension(i4);
            if (eVar.f3418r0 != dimension) {
                eVar.f3418r0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.K(m.w(eVar.f3419s0, i4));
        }
    }

    public void setChipIconSize(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.L(f4);
        }
    }

    public void setChipIconSizeResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.L(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.M(k3.d.D(eVar.f3419s0, i4));
        }
    }

    public void setChipIconVisible(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.N(eVar.f3419s0.getResources().getBoolean(i4));
        }
    }

    public void setChipMinHeight(float f4) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.N == f4) {
            return;
        }
        eVar.N = f4;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setChipMinHeightResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            float dimension = eVar.f3419s0.getResources().getDimension(i4);
            if (eVar.N != dimension) {
                eVar.N = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setChipStartPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.f3411k0 == f4) {
            return;
        }
        eVar.f3411k0 = f4;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setChipStartPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            float dimension = eVar.f3419s0.getResources().getDimension(i4);
            if (eVar.f3411k0 != dimension) {
                eVar.f3411k0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.O(k3.d.D(eVar.f3419s0, i4));
        }
    }

    public void setChipStrokeWidth(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.P(f4);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.P(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.Q(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.f3405d0 == charSequence) {
            return;
        }
        String str = i0.b.f2084b;
        i0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? i0.b.f2086e : i0.b.f2085d;
        bVar.getClass();
        f fVar = g.f2094a;
        eVar.f3405d0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.R(f4);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.R(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.Q(m.w(eVar.f3419s0, i4));
        }
        d();
    }

    public void setCloseIconSize(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.S(f4);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.S(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.T(f4);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.T(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.V(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.V(k3.d.D(eVar.f3419s0, i4));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    @Override // k.q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // k.q, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.p(f4);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1255j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f1264s = z3;
        b(this.f1266u);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        e eVar = this.f1255j;
        if (eVar == null) {
            return false;
        }
        d2.d dVar = eVar.f3425y0.f62f;
        if (dVar != null) {
            dVar.c = str;
        }
        g();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(b bVar) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.f3410j0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.f3410j0 = b.a(eVar.f3419s0, i4);
        }
    }

    public void setIconEndPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.X(f4);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.X(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.Y(f4);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.Y(eVar.f3419s0.getResources().getDimension(i4));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f1255j == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.R0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i4);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1259n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1258m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.Z(colorStateList);
        }
        this.f1255j.getClass();
        e();
    }

    public void setRippleColorResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.Z(k3.d.D(eVar.f3419s0, i4));
            this.f1255j.getClass();
            e();
        }
    }

    @Override // g2.z
    public void setShapeAppearanceModel(o oVar) {
        this.f1255j.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(b bVar) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.f3409i0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.f3409i0 = b.a(eVar.f3419s0, i4);
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
        e eVar = this.f1255j;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.Q0 ? null : charSequence, bufferType);
        e eVar2 = this.f1255j;
        if (eVar2 == null || TextUtils.equals(eVar2.S, charSequence)) {
            return;
        }
        eVar2.S = charSequence;
        eVar2.f3425y0.f60d = true;
        eVar2.invalidateSelf();
        eVar2.D();
    }

    public void setTextAppearance(d2.d dVar) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.a0(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.f3415o0 == f4) {
            return;
        }
        eVar.f3415o0 = f4;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setTextEndPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            float dimension = eVar.f3419s0.getResources().getDimension(i4);
            if (eVar.f3415o0 != dimension) {
                eVar.f3415o0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        super.setTextSize(i4, f4);
        e eVar = this.f1255j;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i4, f4, getResources().getDisplayMetrics());
            n nVar = eVar.f3425y0;
            d2.d dVar = nVar.f62f;
            if (dVar != null) {
                dVar.f1482l = applyDimension;
                nVar.f58a.setTextSize(applyDimension);
                eVar.D();
                eVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f4) {
        e eVar = this.f1255j;
        if (eVar == null || eVar.f3414n0 == f4) {
            return;
        }
        eVar.f3414n0 = f4;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setTextStartPaddingResource(int i4) {
        e eVar = this.f1255j;
        if (eVar != null) {
            float dimension = eVar.f3419s0.getResources().getDimension(i4);
            if (eVar.f3414n0 != dimension) {
                eVar.f3414n0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.W(z3);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z3) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.I(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.N(z3);
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
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.a0(new d2.d(eVar.f3419s0, i4));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        e eVar = this.f1255j;
        if (eVar != null) {
            eVar.a0(new d2.d(eVar.f3419s0, i4));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(i iVar) {
    }
}
