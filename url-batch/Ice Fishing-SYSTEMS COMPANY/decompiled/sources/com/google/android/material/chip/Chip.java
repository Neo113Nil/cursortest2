package com.google.android.material.chip;

import C3.v;
import H.g;
import H3.a;
import M.h;
import M.i;
import O.L;
import O.X;
import W2.e;
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
import com.bumptech.glide.d;
import com.bumptech.glide.f;
import com.facebook.ads.AdError;
import com.google.android.material.chip.Chip;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import j3.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C4755q;
import r3.C4959b;
import r3.C4960c;
import r3.C4961d;
import r3.C4963f;
import r3.InterfaceC4962e;
import w3.InterfaceC5166e;
import w3.k;
import z3.C5277d;

/* loaded from: classes2.dex */
public class Chip extends C4755q implements InterfaceC4962e, v, Checkable {

    /* renamed from: P, reason: collision with root package name */
    public static final Rect f36075P = new Rect();

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f36076Q = {R.attr.state_selected};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f36077R = {R.attr.state_checkable};

    /* renamed from: A, reason: collision with root package name */
    public View.OnClickListener f36078A;

    /* renamed from: B, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f36079B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f36080C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f36081D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f36082E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36083F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f36084G;

    /* renamed from: H, reason: collision with root package name */
    public int f36085H;

    /* renamed from: I, reason: collision with root package name */
    public int f36086I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public final C4961d f36087K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f36088L;

    /* renamed from: M, reason: collision with root package name */
    public final Rect f36089M;

    /* renamed from: N, reason: collision with root package name */
    public final RectF f36090N;

    /* renamed from: O, reason: collision with root package name */
    public final C4959b f36091O;

    /* renamed from: x, reason: collision with root package name */
    public C4963f f36092x;

    /* renamed from: y, reason: collision with root package name */
    public InsetDrawable f36093y;

    /* renamed from: z, reason: collision with root package name */
    public RippleDrawable f36094z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action), attributeSet, C5284R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f36089M = new Rect();
        this.f36090N = new RectF();
        this.f36091O = new C4959b(0, this);
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
        C4963f c4963f = new C4963f(context2, attributeSet);
        int[] iArr = AbstractC4576a.f38294c;
        TypedArray f6 = k.f(c4963f.f40297K0, attributeSet, iArr, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c4963f.f40332k1 = f6.hasValue(37);
        Context context3 = c4963f.f40297K0;
        ColorStateList o9 = d.o(context3, f6, 24);
        if (c4963f.f40303Q != o9) {
            c4963f.f40303Q = o9;
            c4963f.onStateChange(c4963f.getState());
        }
        ColorStateList o10 = d.o(context3, f6, 11);
        if (c4963f.f40305R != o10) {
            c4963f.f40305R = o10;
            c4963f.onStateChange(c4963f.getState());
        }
        float dimension = f6.getDimension(19, 0.0f);
        if (c4963f.f40307S != dimension) {
            c4963f.f40307S = dimension;
            c4963f.invalidateSelf();
            c4963f.u();
        }
        if (f6.hasValue(12)) {
            c4963f.A(f6.getDimension(12, 0.0f));
        }
        c4963f.F(d.o(context3, f6, 22));
        c4963f.G(f6.getDimension(23, 0.0f));
        c4963f.P(d.o(context3, f6, 36));
        String text = f6.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c4963f.f40317X, text)) {
            c4963f.f40317X = text;
            c4963f.f40304Q0.f41670d = true;
            c4963f.invalidateSelf();
            c4963f.u();
        }
        C5277d c5277d = (!f6.hasValue(0) || (resourceId3 = f6.getResourceId(0, 0)) == 0) ? null : new C5277d(context3, resourceId3);
        c5277d.f42172k = f6.getDimension(1, c5277d.f42172k);
        c4963f.Q(c5277d);
        int i = f6.getInt(3, 0);
        if (i == 1) {
            c4963f.f40329h1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c4963f.f40329h1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c4963f.f40329h1 = TextUtils.TruncateAt.END;
        }
        c4963f.E(f6.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c4963f.E(f6.getBoolean(15, false));
        }
        c4963f.B(d.r(context3, f6, 14));
        if (f6.hasValue(17)) {
            c4963f.D(d.o(context3, f6, 17));
        }
        c4963f.C(f6.getDimension(16, -1.0f));
        c4963f.M(f6.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c4963f.M(f6.getBoolean(26, false));
        }
        c4963f.H(d.r(context3, f6, 25));
        c4963f.L(d.o(context3, f6, 30));
        c4963f.J(f6.getDimension(28, 0.0f));
        c4963f.w(f6.getBoolean(6, false));
        c4963f.z(f6.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c4963f.z(f6.getBoolean(8, false));
        }
        c4963f.x(d.r(context3, f6, 7));
        if (f6.hasValue(9)) {
            c4963f.y(d.o(context3, f6, 9));
        }
        c4963f.f40288A0 = (!f6.hasValue(39) || (resourceId2 = f6.getResourceId(39, 0)) == 0) ? null : b.a(context3, resourceId2);
        c4963f.f40289B0 = (!f6.hasValue(33) || (resourceId = f6.getResourceId(33, 0)) == 0) ? null : b.a(context3, resourceId);
        float dimension2 = f6.getDimension(21, 0.0f);
        if (c4963f.C0 != dimension2) {
            c4963f.C0 = dimension2;
            c4963f.invalidateSelf();
            c4963f.u();
        }
        c4963f.O(f6.getDimension(35, 0.0f));
        c4963f.N(f6.getDimension(34, 0.0f));
        float dimension3 = f6.getDimension(41, 0.0f);
        if (c4963f.f40292F0 != dimension3) {
            c4963f.f40292F0 = dimension3;
            c4963f.invalidateSelf();
            c4963f.u();
        }
        float dimension4 = f6.getDimension(40, 0.0f);
        if (c4963f.f40293G0 != dimension4) {
            c4963f.f40293G0 = dimension4;
            c4963f.invalidateSelf();
            c4963f.u();
        }
        c4963f.K(f6.getDimension(29, 0.0f));
        c4963f.I(f6.getDimension(27, 0.0f));
        float dimension5 = f6.getDimension(13, 0.0f);
        if (c4963f.f40296J0 != dimension5) {
            c4963f.f40296J0 = dimension5;
            c4963f.invalidateSelf();
            c4963f.u();
        }
        c4963f.f40331j1 = f6.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f6.recycle();
        k.a(context2, attributeSet, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action);
        this.f36084G = obtainStyledAttributes.getBoolean(32, false);
        this.f36086I = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c4963f);
        c4963f.i(L.i(this));
        k.a(context2, attributeSet, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f36087K = new C4961d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new C4960c(this));
        }
        setChecked(this.f36080C);
        setText(c4963f.f40317X);
        setEllipsize(c4963f.f40329h1);
        g();
        if (!this.f36092x.f40330i1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f36084G) {
            setMinHeight(this.f36086I);
        }
        this.f36085H = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r3.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f36079B;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z8);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f36090N;
        rectF.setEmpty();
        if (c() && this.f36078A != null) {
            C4963f c4963f = this.f36092x;
            Rect bounds = c4963f.getBounds();
            rectF.setEmpty();
            if (c4963f.T()) {
                float f6 = c4963f.f40296J0 + c4963f.f40295I0 + c4963f.f40340u0 + c4963f.f40294H0 + c4963f.f40293G0;
                if (H.b.a(c4963f) == 0) {
                    float f9 = bounds.right;
                    rectF.right = f9;
                    rectF.left = f9 - f6;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f6;
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
        int i9 = (int) closeIconTouchBounds.right;
        int i10 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f36089M;
        rect.set(i, i4, i9, i10);
        return rect;
    }

    private C5277d getTextAppearance() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40304Q0.f41672f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z8) {
        if (this.f36082E != z8) {
            this.f36082E = z8;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z8) {
        if (this.f36081D != z8) {
            this.f36081D = z8;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f36086I = i;
        if (!this.f36084G) {
            InsetDrawable insetDrawable = this.f36093y;
            if (insetDrawable == null) {
                int[] iArr = A3.a.f35a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f36093y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = A3.a.f35a;
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f36092x.f40307S));
        int max2 = Math.max(0, i - this.f36092x.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f36093y;
            if (insetDrawable2 == null) {
                int[] iArr3 = A3.a.f35a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f36093y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = A3.a.f35a;
                    e();
                    return;
                }
                return;
            }
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i9 = max > 0 ? max / 2 : 0;
        if (this.f36093y != null) {
            Rect rect = new Rect();
            this.f36093y.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i4 && rect.right == i4) {
                int[] iArr5 = A3.a.f35a;
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
        this.f36093y = new InsetDrawable((Drawable) this.f36092x, i4, i9, i4, i9);
        int[] iArr6 = A3.a.f35a;
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        C4963f c4963f = this.f36092x;
        if (c4963f == null) {
            return false;
        }
        Object obj = c4963f.f40337r0;
        if (obj != null) {
            if (obj instanceof g) {
            }
            return obj == null;
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final void d() {
        C4963f c4963f;
        if (!c() || (c4963f = this.f36092x) == null || !c4963f.f40336q0 || this.f36078A == null) {
            X.o(this, null);
            this.f36088L = false;
        } else {
            X.o(this, this.f36087K);
            this.f36088L = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f36088L) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C4961d c4961d = this.f36087K;
        AccessibilityManager accessibilityManager = c4961d.f3381h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y6 = motionEvent.getY();
                Chip chip = c4961d.f40285q;
                int i4 = (chip.c() && chip.getCloseIconTouchBounds().contains(x3, y6)) ? 1 : 0;
                int i9 = c4961d.f3385m;
                if (i9 != i4) {
                    c4961d.f3385m = i4;
                    c4961d.q(i4, 128);
                    c4961d.q(i9, 256);
                }
            } else if (action == 10 && (i = c4961d.f3385m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    c4961d.f3385m = Integer.MIN_VALUE;
                    c4961d.q(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f36088L) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C4961d c4961d = this.f36087K;
        c4961d.getClass();
        boolean z8 = false;
        int i = 0;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
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
                                    i4 = com.anythink.expressad.video.module.a.a.f21889U;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z9 = false;
                                while (i < repeatCount && c4961d.m(i4, null)) {
                                    i++;
                                    z9 = true;
                                }
                                z8 = z9;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i9 = c4961d.f3384l;
                    if (i9 != Integer.MIN_VALUE) {
                        Chip chip = c4961d.f40285q;
                        if (i9 == 0) {
                            chip.performClick();
                        } else if (i9 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f36078A;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f36088L) {
                                chip.f36087K.q(1, 1);
                            }
                        }
                    }
                    z8 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z8 = c4961d.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z8 = c4961d.m(1, null);
            }
        }
        if (!z8 || c4961d.f3384l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.C4755q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C4963f c4963f = this.f36092x;
        boolean z8 = false;
        if (c4963f != null && C4963f.t(c4963f.f40337r0)) {
            C4963f c4963f2 = this.f36092x;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f36083F) {
                i4 = isEnabled + 1;
            }
            int i9 = i4;
            if (this.f36082E) {
                i9 = i4 + 1;
            }
            int i10 = i9;
            if (this.f36081D) {
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
            } else {
                i = 0;
            }
            if (this.f36083F) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f36082E) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f36081D) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c4963f2.f40326e1, iArr)) {
                c4963f2.f40326e1 = iArr;
                if (c4963f2.T()) {
                    z8 = c4963f2.v(c4963f2.getState(), iArr);
                }
            }
        }
        if (z8) {
            invalidate();
        }
    }

    public final void e() {
        this.f36094z = new RippleDrawable(A3.a.a(this.f36092x.f40315W), getBackgroundDrawable(), null);
        this.f36092x.getClass();
        RippleDrawable rippleDrawable = this.f36094z;
        WeakHashMap weakHashMap = X.f2240a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        C4963f c4963f;
        if (TextUtils.isEmpty(getText()) || (c4963f = this.f36092x) == null) {
            return;
        }
        int q6 = (int) (c4963f.q() + c4963f.f40296J0 + c4963f.f40293G0);
        C4963f c4963f2 = this.f36092x;
        int p6 = (int) (c4963f2.p() + c4963f2.C0 + c4963f2.f40292F0);
        if (this.f36093y != null) {
            Rect rect = new Rect();
            this.f36093y.getPadding(rect);
            p6 += rect.left;
            q6 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = X.f2240a;
        setPaddingRelative(p6, paddingTop, q6, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            paint.drawableState = c4963f.getState();
        }
        C5277d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f36091O);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        C4963f c4963f = this.f36092x;
        if (!(c4963f != null && c4963f.f40342w0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f36093y;
        return insetDrawable == null ? this.f36092x : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40344y0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40345z0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40305R;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return Math.max(0.0f, c4963f.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f36092x;
    }

    public float getChipEndPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40296J0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C4963f c4963f = this.f36092x;
        if (c4963f == null || (drawable = c4963f.f40320Z) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40334o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40333n0;
        }
        return null;
    }

    public float getChipMinHeight() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40307S;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.C0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40311U;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40313V;
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
        C4963f c4963f = this.f36092x;
        if (c4963f == null || (drawable = c4963f.f40337r0) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40341v0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40295I0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40340u0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40294H0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40339t0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40329h1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f36088L) {
            C4961d c4961d = this.f36087K;
            if (c4961d.f3384l == 1 || c4961d.f3383k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b getHideMotionSpec() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40289B0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40291E0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40290D0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40315W;
        }
        return null;
    }

    public C3.k getShapeAppearanceModel() {
        return this.f36092x.f413n.f383a;
    }

    public b getShowMotionSpec() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40288A0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40293G0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            return c4963f.f40292F0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.p(this, this.f36092x);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f36076Q);
        }
        C4963f c4963f = this.f36092x;
        if (c4963f != null && c4963f.f40342w0) {
            View.mergeDrawableStates(onCreateDrawableState, f36077R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z8, int i, Rect rect) {
        super.onFocusChanged(z8, i, rect);
        if (this.f36088L) {
            C4961d c4961d = this.f36087K;
            int i4 = c4961d.f3384l;
            if (i4 != Integer.MIN_VALUE) {
                c4961d.j(i4);
            }
            if (z8) {
                c4961d.m(i, rect);
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
        C4963f c4963f = this.f36092x;
        accessibilityNodeInfo.setCheckable(c4963f != null && c4963f.f40342w0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f36085H != i) {
            this.f36085H = i;
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
        boolean z8;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f36081D) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z8 = true;
                    }
                }
                z8 = false;
            } else if (this.f36081D) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f36078A;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f36088L) {
                    this.f36087K.q(1, 1);
                }
                z8 = true;
                setCloseIconPressed(false);
            }
            z8 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z8 = true;
            }
            z8 = false;
        }
        return z8 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36094z) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.C4755q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36094z) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.C4755q, android.view.View
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

    public void setCheckable(boolean z8) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.w(z8);
        }
    }

    public void setCheckableResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.w(c4963f.f40297K0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null) {
            this.f36080C = z8;
        } else if (c4963f.f40342w0) {
            super.setChecked(z8);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.x(f.h(c4963f.f40297K0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.y(E.e.c(c4963f.f40297K0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.z(c4963f.f40297K0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40305R == colorStateList) {
            return;
        }
        c4963f.f40305R = colorStateList;
        c4963f.onStateChange(c4963f.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList c4;
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40305R == (c4 = E.e.c(c4963f.f40297K0, i))) {
            return;
        }
        c4963f.f40305R = c4;
        c4963f.onStateChange(c4963f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.A(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.A(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C4963f c4963f) {
        C4963f c4963f2 = this.f36092x;
        if (c4963f2 != c4963f) {
            if (c4963f2 != null) {
                c4963f2.f40328g1 = new WeakReference(null);
            }
            this.f36092x = c4963f;
            c4963f.f40330i1 = false;
            c4963f.f40328g1 = new WeakReference(this);
            b(this.f36086I);
        }
    }

    public void setChipEndPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40296J0 == f6) {
            return;
        }
        c4963f.f40296J0 = f6;
        c4963f.invalidateSelf();
        c4963f.u();
    }

    public void setChipEndPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            float dimension = c4963f.f40297K0.getResources().getDimension(i);
            if (c4963f.f40296J0 != dimension) {
                c4963f.f40296J0 = dimension;
                c4963f.invalidateSelf();
                c4963f.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.B(f.h(c4963f.f40297K0, i));
        }
    }

    public void setChipIconSize(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.C(f6);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.C(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.D(E.e.c(c4963f.f40297K0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.E(c4963f.f40297K0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40307S == f6) {
            return;
        }
        c4963f.f40307S = f6;
        c4963f.invalidateSelf();
        c4963f.u();
    }

    public void setChipMinHeightResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            float dimension = c4963f.f40297K0.getResources().getDimension(i);
            if (c4963f.f40307S != dimension) {
                c4963f.f40307S = dimension;
                c4963f.invalidateSelf();
                c4963f.u();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.C0 == f6) {
            return;
        }
        c4963f.C0 = f6;
        c4963f.invalidateSelf();
        c4963f.u();
    }

    public void setChipStartPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            float dimension = c4963f.f40297K0.getResources().getDimension(i);
            if (c4963f.C0 != dimension) {
                c4963f.C0 = dimension;
                c4963f.invalidateSelf();
                c4963f.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.F(E.e.c(c4963f.f40297K0, i));
        }
    }

    public void setChipStrokeWidth(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.G(f6);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.G(c4963f.f40297K0.getResources().getDimension(i));
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
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40341v0 == charSequence) {
            return;
        }
        String str = M.b.f1817b;
        M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1820e : M.b.f1819d;
        bVar.getClass();
        h hVar = i.f1829a;
        c4963f.f40341v0 = bVar.c(charSequence);
        c4963f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.I(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.I(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.H(f.h(c4963f.f40297K0, i));
        }
        d();
    }

    public void setCloseIconSize(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.J(f6);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.J(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.K(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.K(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.L(E.e.c(c4963f.f40297K0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.C4755q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.C4755q, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i4, i9, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i4, i9, i10);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.i(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f36092x == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.f40329h1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.f36084G = z8;
        b(this.f36086I);
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
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.f40289B0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.f40289B0 = b.a(c4963f.f40297K0, i);
        }
    }

    public void setIconEndPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.N(f6);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.N(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.O(f6);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.O(c4963f.f40297K0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f36092x == null) {
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
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.f40331j1 = i;
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
        this.f36079B = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f36078A = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.P(colorStateList);
        }
        this.f36092x.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.P(E.e.c(c4963f.f40297K0, i));
            this.f36092x.getClass();
            e();
        }
    }

    @Override // C3.v
    public void setShapeAppearanceModel(C3.k kVar) {
        this.f36092x.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(b bVar) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.f40288A0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.f40288A0 = b.a(c4963f.f40297K0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z8) {
        if (!z8) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z8);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c4963f.f40330i1 ? null : charSequence, bufferType);
        C4963f c4963f2 = this.f36092x;
        if (c4963f2 == null || TextUtils.equals(c4963f2.f40317X, charSequence)) {
            return;
        }
        c4963f2.f40317X = charSequence;
        c4963f2.f40304Q0.f41670d = true;
        c4963f2.invalidateSelf();
        c4963f2.u();
    }

    public void setTextAppearance(C5277d c5277d) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.Q(c5277d);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40293G0 == f6) {
            return;
        }
        c4963f.f40293G0 = f6;
        c4963f.invalidateSelf();
        c4963f.u();
    }

    public void setTextEndPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            float dimension = c4963f.f40297K0.getResources().getDimension(i);
            if (c4963f.f40293G0 != dimension) {
                c4963f.f40293G0 = dimension;
                c4963f.invalidateSelf();
                c4963f.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        super.setTextSize(i, f6);
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            float applyDimension = TypedValue.applyDimension(i, f6, getResources().getDisplayMetrics());
            w3.i iVar = c4963f.f40304Q0;
            C5277d c5277d = iVar.f41672f;
            if (c5277d != null) {
                c5277d.f42172k = applyDimension;
                iVar.f41667a.setTextSize(applyDimension);
                c4963f.u();
                c4963f.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f6) {
        C4963f c4963f = this.f36092x;
        if (c4963f == null || c4963f.f40292F0 == f6) {
            return;
        }
        c4963f.f40292F0 = f6;
        c4963f.invalidateSelf();
        c4963f.u();
    }

    public void setTextStartPaddingResource(int i) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            float dimension = c4963f.f40297K0.getResources().getDimension(i);
            if (c4963f.f40292F0 != dimension) {
                c4963f.f40292F0 = dimension;
                c4963f.invalidateSelf();
                c4963f.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z8) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.M(z8);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z8) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.z(z8);
        }
    }

    public void setChipIconVisible(boolean z8) {
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.E(z8);
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
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.Q(new C5277d(c4963f.f40297K0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4963f c4963f = this.f36092x;
        if (c4963f != null) {
            c4963f.Q(new C5277d(c4963f.f40297K0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC5166e interfaceC5166e) {
    }
}
