package com.google.android.material.chip;

import D0.j;
import D0.n;
import I.g;
import I.h;
import J0.k;
import J0.v;
import K.H;
import K.T;
import O0.a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.C0228q;
import p0.AbstractC0282a;
import q0.C0290b;
import w1.l;
import y0.b;
import y0.c;
import y0.d;
import y0.e;

/* loaded from: classes.dex */
public class Chip extends C0228q implements d, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f1741w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1742x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1743y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public e f1744e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1745f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1746g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1747j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1748k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1749l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1750m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1751n;

    /* renamed from: o, reason: collision with root package name */
    public int f1752o;

    /* renamed from: p, reason: collision with root package name */
    public int f1753p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1754q;

    /* renamed from: r, reason: collision with root package name */
    public final c f1755r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1756s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1757t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1758u;

    /* renamed from: v, reason: collision with root package name */
    public final j f1759v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.playbag.tripgear.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1757t = new Rect();
        this.f1758u = new RectF();
        this.f1759v = new j(1, this);
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
        int[] iArr = AbstractC0282a.f3432c;
        TypedArray f2 = n.f(eVar.f4290e0, attributeSet, iArr, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.E0 = f2.hasValue(37);
        Context context3 = eVar.f4290e0;
        ColorStateList v2 = l.v(context3, f2, 24);
        if (eVar.f4307x != v2) {
            eVar.f4307x = v2;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList v3 = l.v(context3, f2, 11);
        if (eVar.f4309y != v3) {
            eVar.f4309y = v3;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = f2.getDimension(19, RecyclerView.f1530C0);
        if (eVar.f4311z != dimension) {
            eVar.f4311z = dimension;
            eVar.invalidateSelf();
            eVar.u();
        }
        if (f2.hasValue(12)) {
            eVar.A(f2.getDimension(12, RecyclerView.f1530C0));
        }
        eVar.F(l.v(context3, f2, 22));
        eVar.G(f2.getDimension(23, RecyclerView.f1530C0));
        eVar.P(l.v(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.f4265E, text)) {
            eVar.f4265E = text;
            eVar.k0.d = true;
            eVar.invalidateSelf();
            eVar.u();
        }
        G0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new G0.d(context3, resourceId3);
        dVar.f248k = f2.getDimension(1, dVar.f248k);
        eVar.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            eVar.f4260B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            eVar.f4260B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            eVar.f4260B0 = TextUtils.TruncateAt.END;
        }
        eVar.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.E(f2.getBoolean(15, false));
        }
        eVar.B(l.A(context3, f2, 14));
        if (f2.hasValue(17)) {
            eVar.D(l.v(context3, f2, 17));
        }
        eVar.C(f2.getDimension(16, -1.0f));
        eVar.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.M(f2.getBoolean(26, false));
        }
        eVar.H(l.A(context3, f2, 25));
        eVar.L(l.v(context3, f2, 30));
        eVar.J(f2.getDimension(28, RecyclerView.f1530C0));
        eVar.w(f2.getBoolean(6, false));
        eVar.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.z(f2.getBoolean(8, false));
        }
        eVar.x(l.A(context3, f2, 7));
        if (f2.hasValue(9)) {
            eVar.y(l.v(context3, f2, 9));
        }
        eVar.f4280U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : C0290b.a(context3, resourceId2);
        eVar.f4281V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : C0290b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, RecyclerView.f1530C0);
        if (eVar.f4282W != dimension2) {
            eVar.f4282W = dimension2;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.O(f2.getDimension(35, RecyclerView.f1530C0));
        eVar.N(f2.getDimension(34, RecyclerView.f1530C0));
        float dimension3 = f2.getDimension(41, RecyclerView.f1530C0);
        if (eVar.f4285Z != dimension3) {
            eVar.f4285Z = dimension3;
            eVar.invalidateSelf();
            eVar.u();
        }
        float dimension4 = f2.getDimension(40, RecyclerView.f1530C0);
        if (eVar.f4286a0 != dimension4) {
            eVar.f4286a0 = dimension4;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.K(f2.getDimension(29, RecyclerView.f1530C0));
        eVar.I(f2.getDimension(27, RecyclerView.f1530C0));
        float dimension5 = f2.getDimension(13, RecyclerView.f1530C0);
        if (eVar.f4289d0 != dimension5) {
            eVar.f4289d0 = dimension5;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.f4264D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        n.a(context2, attributeSet, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1751n = obtainStyledAttributes.getBoolean(32, false);
        this.f1753p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.i(H.i(this));
        n.a(context2, attributeSet, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.playbag.tripgear.R.attr.chipStyle, com.playbag.tripgear.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1755r = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new b(this));
        }
        setChecked(this.f1747j);
        setText(eVar.f4265E);
        setEllipsize(eVar.f4260B0);
        h();
        if (!this.f1744e.f4262C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1751n) {
            setMinHeight(this.f1753p);
        }
        this.f1752o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y0.a
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
        RectF rectF = this.f1758u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            e eVar = this.f1744e;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.T()) {
                float f2 = eVar.f4289d0 + eVar.f4288c0 + eVar.f4274O + eVar.f4287b0 + eVar.f4286a0;
                if (D.b.a(eVar) == 0) {
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
        Rect rect = this.f1757t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private G0.d getTextAppearance() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.k0.f214f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1749l != z2) {
            this.f1749l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1748k != z2) {
            this.f1748k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1753p = i;
        if (!this.f1751n) {
            InsetDrawable insetDrawable = this.f1745f;
            if (insetDrawable == null) {
                int[] iArr = H0.a.f285a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1745f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = H0.a.f285a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1744e.f4311z));
        int max2 = Math.max(0, i - this.f1744e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1745f;
            if (insetDrawable2 == null) {
                int[] iArr3 = H0.a.f285a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1745f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = H0.a.f285a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f1745f != null) {
            Rect rect = new Rect();
            this.f1745f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = H0.a.f285a;
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
        this.f1745f = new InsetDrawable((Drawable) this.f1744e, i2, i3, i2, i3);
        int[] iArr6 = H0.a.f285a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        e eVar = this.f1744e;
        if (eVar != null) {
            Object obj = eVar.f4271L;
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
        e eVar = this.f1744e;
        return eVar != null && eVar.f4276Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1756s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f1755r;
        AccessibilityManager accessibilityManager = cVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = cVar.f4254q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = cVar.f807m;
                if (i3 != i2) {
                    cVar.f807m = i2;
                    cVar.q(i2, 128);
                    cVar.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = cVar.f807m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                cVar.f807m = Integer.MIN_VALUE;
                cVar.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1756s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f1755r;
        cVar.getClass();
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
                                while (i < repeatCount && cVar.m(i2, null)) {
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
                    int i3 = cVar.f806l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f4254q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1756s) {
                                chip.f1755r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = cVar.m(1, null);
            }
        }
        if (!z2 || cVar.f806l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0228q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        e eVar = this.f1744e;
        boolean z2 = false;
        if (eVar != null && e.t(eVar.f4271L)) {
            e eVar2 = this.f1744e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f1750m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f1749l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1748k) {
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
            if (this.f1750m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1749l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1748k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(eVar2.f4310y0, iArr)) {
                eVar2.f4310y0 = iArr;
                if (eVar2.T()) {
                    z2 = eVar2.v(eVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!c() || (eVar = this.f1744e) == null || !eVar.f4270K || this.h == null) {
            T.l(this, null);
            this.f1756s = false;
        } else {
            T.l(this, this.f1755r);
            this.f1756s = true;
        }
    }

    public final void f() {
        this.f1746g = new RippleDrawable(H0.a.a(this.f1744e.f4263D), getBackgroundDrawable(), null);
        this.f1744e.getClass();
        RippleDrawable rippleDrawable = this.f1746g;
        WeakHashMap weakHashMap = T.f423a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f1744e) == null) {
            return;
        }
        int q2 = (int) (eVar.q() + eVar.f4289d0 + eVar.f4286a0);
        e eVar2 = this.f1744e;
        int p2 = (int) (eVar2.p() + eVar2.f4282W + eVar2.f4285Z);
        if (this.f1745f != null) {
            Rect rect = new Rect();
            this.f1745f.getPadding(rect);
            p2 += rect.left;
            q2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = T.f423a;
        setPaddingRelative(p2, paddingTop, q2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1754q)) {
            return this.f1754q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1745f;
        return insetDrawable == null ? this.f1744e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4278S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4279T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4309y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f1744e;
        return eVar != null ? Math.max(RecyclerView.f1530C0, eVar.r()) : RecyclerView.f1530C0;
    }

    public Drawable getChipDrawable() {
        return this.f1744e;
    }

    public float getChipEndPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4289d0 : RecyclerView.f1530C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f1744e;
        if (eVar == null || (drawable = eVar.f4266G) == 0) {
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
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4268I : RecyclerView.f1530C0;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4267H;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4311z : RecyclerView.f1530C0;
    }

    public float getChipStartPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4282W : RecyclerView.f1530C0;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4259B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4261C : RecyclerView.f1530C0;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f1744e;
        if (eVar == null || (drawable = eVar.f4271L) == 0) {
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
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4275P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4288c0 : RecyclerView.f1530C0;
    }

    public float getCloseIconSize() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4274O : RecyclerView.f1530C0;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4287b0 : RecyclerView.f1530C0;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4273N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4260B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1756s) {
            c cVar = this.f1755r;
            if (cVar.f806l == 1 || cVar.f805k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0290b getHideMotionSpec() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4281V;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4284Y : RecyclerView.f1530C0;
    }

    public float getIconStartPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4283X : RecyclerView.f1530C0;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4263D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f1744e.f335a.f321a;
    }

    public C0290b getShowMotionSpec() {
        e eVar = this.f1744e;
        if (eVar != null) {
            return eVar.f4280U;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4286a0 : RecyclerView.f1530C0;
    }

    public float getTextStartPadding() {
        e eVar = this.f1744e;
        return eVar != null ? eVar.f4285Z : RecyclerView.f1530C0;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f1744e;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        G0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1759v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1.d.p0(this, this.f1744e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1742x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1743y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f1756s) {
            c cVar = this.f1755r;
            int i2 = cVar.f806l;
            if (i2 != Integer.MIN_VALUE) {
                cVar.j(i2);
            }
            if (z2) {
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
        if (this.f1752o != i) {
            this.f1752o = i;
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
                    if (this.f1748k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f1748k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1756s) {
                    this.f1755r.q(1, 1);
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
        this.f1754q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1746g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0228q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1746g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0228q, android.view.View
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.w(eVar.f4290e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        e eVar = this.f1744e;
        if (eVar == null) {
            this.f1747j = z2;
        } else if (eVar.f4276Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.x(drawable);
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.x(l.z(eVar.f4290e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.y(w1.d.A(eVar.f4290e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.z(eVar.f4290e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4309y == colorStateList) {
            return;
        }
        eVar.f4309y = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A2;
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4309y == (A2 = w1.d.A(eVar.f4290e0, i))) {
            return;
        }
        eVar.f4309y = A2;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.A(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f1744e;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f4258A0 = new WeakReference(null);
            }
            this.f1744e = eVar;
            eVar.f4262C0 = false;
            eVar.f4258A0 = new WeakReference(this);
            b(this.f1753p);
        }
    }

    public void setChipEndPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4289d0 == f2) {
            return;
        }
        eVar.f4289d0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            float dimension = eVar.f4290e0.getResources().getDimension(i);
            if (eVar.f4289d0 != dimension) {
                eVar.f4289d0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.B(drawable);
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.B(l.z(eVar.f4290e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.C(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.D(w1.d.A(eVar.f4290e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.E(eVar.f4290e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4311z == f2) {
            return;
        }
        eVar.f4311z = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            float dimension = eVar.f4290e0.getResources().getDimension(i);
            if (eVar.f4311z != dimension) {
                eVar.f4311z = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4282W == f2) {
            return;
        }
        eVar.f4282W = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            float dimension = eVar.f4290e0.getResources().getDimension(i);
            if (eVar.f4282W != dimension) {
                eVar.f4282W = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.F(w1.d.A(eVar.f4290e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.G(eVar.f4290e0.getResources().getDimension(i));
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4275P == charSequence) {
            return;
        }
        String str = I.b.f291b;
        I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f293e : I.b.d;
        bVar.getClass();
        g gVar = h.f301a;
        eVar.f4275P = bVar.c(charSequence);
        eVar.invalidateSelf();
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.I(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.H(l.z(eVar.f4290e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.J(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.K(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.L(w1.d.A(eVar.f4290e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0228q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0228q, android.widget.TextView
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1744e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.f4260B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1751n = z2;
        b(this.f1753p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0290b c0290b) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.f4281V = c0290b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.f4281V = C0290b.a(eVar.f4290e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.N(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.O(eVar.f4290e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(D0.g gVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1744e == null) {
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.f4264D0 = i;
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.P(colorStateList);
        }
        this.f1744e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.P(w1.d.A(eVar.f4290e0, i));
            this.f1744e.getClass();
            f();
        }
    }

    @Override // J0.v
    public void setShapeAppearanceModel(k kVar) {
        this.f1744e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0290b c0290b) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.f4280U = c0290b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.f4280U = C0290b.a(eVar.f4290e0, i);
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
        e eVar = this.f1744e;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.f4262C0 ? null : charSequence, bufferType);
        e eVar2 = this.f1744e;
        if (eVar2 == null || TextUtils.equals(eVar2.f4265E, charSequence)) {
            return;
        }
        eVar2.f4265E = charSequence;
        eVar2.k0.d = true;
        eVar2.invalidateSelf();
        eVar2.u();
    }

    public void setTextAppearance(G0.d dVar) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4286a0 == f2) {
            return;
        }
        eVar.f4286a0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            float dimension = eVar.f4290e0.getResources().getDimension(i);
            if (eVar.f4286a0 != dimension) {
                eVar.f4286a0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        e eVar = this.f1744e;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            D0.l lVar = eVar.k0;
            G0.d dVar = lVar.f214f;
            if (dVar != null) {
                dVar.f248k = applyDimension;
                lVar.f210a.setTextSize(applyDimension);
                eVar.u();
                eVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        e eVar = this.f1744e;
        if (eVar == null || eVar.f4285Z == f2) {
            return;
        }
        eVar.f4285Z = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.f1744e;
        if (eVar != null) {
            float dimension = eVar.f4290e0.getResources().getDimension(i);
            if (eVar.f4285Z != dimension) {
                eVar.f4285Z = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.M(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.E(z2);
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
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.Q(new G0.d(eVar.f4290e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.f1744e;
        if (eVar != null) {
            eVar.Q(new G0.d(eVar.f4290e0, i));
        }
        h();
    }
}
