package com.google.android.material.textfield;

import A.b;
import C0.d;
import C0.n;
import C0.p;
import I0.c;
import I0.e;
import I0.f;
import I0.g;
import I0.i;
import I0.j;
import I0.k;
import K.C0006g;
import K.C0011l;
import K.I;
import K.S;
import L0.A;
import L0.B;
import L0.C;
import L0.D;
import L0.E;
import L0.F;
import L0.h;
import L0.q;
import L0.t;
import L0.u;
import L0.x;
import L0.z;
import N0.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.C0187h;
import k0.r;
import l.AbstractC0233n0;
import l.C0213d0;
import l.C0246u;
import o0.AbstractC0278a;
import p0.AbstractC0281a;
import u1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1819C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1820A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1821A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1822B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1823B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1824C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1825D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1826E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1827G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1828H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1829I;

    /* renamed from: J, reason: collision with root package name */
    public g f1830J;

    /* renamed from: K, reason: collision with root package name */
    public g f1831K;

    /* renamed from: L, reason: collision with root package name */
    public k f1832L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1833M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1834N;

    /* renamed from: O, reason: collision with root package name */
    public int f1835O;

    /* renamed from: P, reason: collision with root package name */
    public int f1836P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1837Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1838R;

    /* renamed from: S, reason: collision with root package name */
    public int f1839S;

    /* renamed from: T, reason: collision with root package name */
    public int f1840T;

    /* renamed from: U, reason: collision with root package name */
    public int f1841U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1842V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1843W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1844a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1845a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1846b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1847b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1848c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1849c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1850d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1851e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1852e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1853f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1854f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1855g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1856g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1857h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f1858i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f1859j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f1860j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1861k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1862k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1863l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1864l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1865m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1866m0;

    /* renamed from: n, reason: collision with root package name */
    public E f1867n;
    public ColorStateList n0;

    /* renamed from: o, reason: collision with root package name */
    public C0213d0 f1868o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1869o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1870p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1871p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1872q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1873q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1874r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1875r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1876s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1877s0;

    /* renamed from: t, reason: collision with root package name */
    public C0213d0 f1878t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1879t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f1880u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1881u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1882v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f1883v0;

    /* renamed from: w, reason: collision with root package name */
    public C0187h f1884w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1885w0;

    /* renamed from: x, reason: collision with root package name */
    public C0187h f1886x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1887x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1888y;
    public ValueAnimator y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1889z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1890z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.playgen.securelock.R.attr.textInputStyle, com.playgen.securelock.R.style.Widget_Design_TextInputLayout), attributeSet, com.playgen.securelock.R.attr.textInputStyle);
        this.f1853f = -1;
        this.f1855g = -1;
        this.h = -1;
        this.i = -1;
        this.f1859j = new u(this);
        this.f1867n = new C0006g(2);
        this.f1842V = new Rect();
        this.f1843W = new Rect();
        this.f1845a0 = new RectF();
        this.f1852e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f1883v0 = dVar;
        this.f1823B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1844a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0281a.f3380a;
        dVar.f96Q = linearInterpolator;
        dVar.h(false);
        dVar.f95P = linearInterpolator;
        dVar.h(false);
        if (dVar.f117g != 8388659) {
            dVar.f117g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0278a.f3332A;
        n.a(context2, attributeSet, com.playgen.securelock.R.attr.textInputStyle, com.playgen.securelock.R.style.Widget_Design_TextInputLayout);
        n.b(context2, attributeSet, iArr, com.playgen.securelock.R.attr.textInputStyle, com.playgen.securelock.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.playgen.securelock.R.attr.textInputStyle, com.playgen.securelock.R.style.Widget_Design_TextInputLayout);
        C0011l c0011l = new C0011l(context2, obtainStyledAttributes);
        z zVar = new z(this, c0011l);
        this.f1846b = zVar;
        this.f1824C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f1887x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1885w0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f1832L = k.b(context2, attributeSet, com.playgen.securelock.R.attr.textInputStyle, com.playgen.securelock.R.style.Widget_Design_TextInputLayout).a();
        this.f1834N = context2.getResources().getDimensionPixelOffset(com.playgen.securelock.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1836P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1838R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1839S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1837Q = this.f1838R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1832L.e();
        if (dimension >= 0.0f) {
            e2.f298e = new I0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f299f = new I0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f300g = new I0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new I0.a(dimension4);
        }
        this.f1832L = e2.a();
        ColorStateList C2 = u1.d.C(context2, c0011l, 7);
        if (C2 != null) {
            int defaultColor = C2.getDefaultColor();
            this.f1869o0 = defaultColor;
            this.f1841U = defaultColor;
            if (C2.isStateful()) {
                this.f1871p0 = C2.getColorForState(new int[]{-16842910}, -1);
                this.f1873q0 = C2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1875r0 = C2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1873q0 = this.f1869o0;
                ColorStateList B2 = u1.d.B(context2, com.playgen.securelock.R.color.mtrl_filled_background_color);
                this.f1871p0 = B2.getColorForState(new int[]{-16842910}, -1);
                this.f1875r0 = B2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1841U = 0;
            this.f1869o0 = 0;
            this.f1871p0 = 0;
            this.f1873q0 = 0;
            this.f1875r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = c0011l.g(1);
            this.f1860j0 = g2;
            this.f1858i0 = g2;
        }
        ColorStateList C3 = u1.d.C(context2, c0011l, 14);
        this.f1866m0 = obtainStyledAttributes.getColor(14, 0);
        this.f1862k0 = b.a(context2, com.playgen.securelock.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1877s0 = b.a(context2, com.playgen.securelock.R.color.mtrl_textinput_disabled_color);
        this.f1864l0 = b.a(context2, com.playgen.securelock.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (C3 != null) {
            setBoxStrokeColorStateList(C3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(u1.d.C(context2, c0011l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1820A = c0011l.g(24);
        this.f1822B = c0011l.g(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1872q = obtainStyledAttributes.getResourceId(22, 0);
        this.f1870p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1870p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1872q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0011l.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0011l.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0011l.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0011l.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0011l.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0011l.g(58));
        }
        q qVar = new q(this, c0011l);
        this.f1848c = qVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0011l.t();
        setImportantForAccessibility(2);
        I.m(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || l.F(editText)) {
            return this.F;
        }
        int j2 = k0.k.j(this.d, com.playgen.securelock.R.attr.colorControlHighlight);
        int i = this.f1835O;
        int[][] iArr = f1819C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1841U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{k0.k.n(j2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue W2 = l.W(context, com.playgen.securelock.R.attr.colorSurface, "TextInputLayout");
        int i3 = W2.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : W2.data;
        g gVar3 = new g(gVar2.f275a.f261a);
        int n2 = k0.k.n(j2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{n2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{n2, a2});
        g gVar4 = new g(gVar2.f275a.f261a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1828H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1828H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1828H.addState(new int[0], f(false));
        }
        return this.f1828H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1827G == null) {
            this.f1827G = f(true);
        }
        return this.f1827G;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.f1853f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1855g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1829I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f1883v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f102W != letterSpacing) {
            dVar.f102W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f117g != i4) {
            dVar.f117g = i4;
            dVar.h(false);
        }
        if (dVar.f115f != gravity) {
            dVar.f115f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = S.f369a;
        this.f1879t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f1858i0 == null) {
            this.f1858i0 = this.d.getHintTextColors();
        }
        if (this.f1824C) {
            if (TextUtils.isEmpty(this.f1825D)) {
                CharSequence hint = this.d.getHint();
                this.f1851e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1826E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f1868o != null) {
            n(this.d.getText());
        }
        r();
        this.f1859j.b();
        this.f1846b.bringToFront();
        q qVar = this.f1848c;
        qVar.bringToFront();
        Iterator it = this.f1852e0.iterator();
        while (it.hasNext()) {
            ((L0.n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1825D)) {
            return;
        }
        this.f1825D = charSequence;
        d dVar = this.f1883v0;
        if (charSequence == null || !TextUtils.equals(dVar.f81A, charSequence)) {
            dVar.f81A = charSequence;
            dVar.f82B = null;
            Bitmap bitmap = dVar.f85E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f85E = null;
            }
            dVar.h(false);
        }
        if (this.f1881u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1876s == z2) {
            return;
        }
        if (z2) {
            C0213d0 c0213d0 = this.f1878t;
            if (c0213d0 != null) {
                this.f1844a.addView(c0213d0);
                this.f1878t.setVisibility(0);
            }
        } else {
            C0213d0 c0213d02 = this.f1878t;
            if (c0213d02 != null) {
                c0213d02.setVisibility(8);
            }
            this.f1878t = null;
        }
        this.f1876s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f1883v0;
        if (dVar.f108b == f2) {
            return;
        }
        if (this.y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.y0 = valueAnimator;
            valueAnimator.setInterpolator(l.V(getContext(), com.playgen.securelock.R.attr.motionEasingEmphasizedInterpolator, AbstractC0281a.f3381b));
            this.y0.setDuration(l.U(getContext(), com.playgen.securelock.R.attr.motionDurationMedium4, 167));
            this.y0.addUpdateListener(new C(i, this));
        }
        this.y0.setFloatValues(dVar.f108b, f2);
        this.y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1844a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f275a.f261a;
        k kVar2 = this.f1832L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1835O == 2 && (i = this.f1837Q) > -1 && (i2 = this.f1840T) != 0) {
            g gVar2 = this.F;
            gVar2.f275a.f267j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f275a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1841U;
        if (this.f1835O == 1) {
            i3 = C.a.b(this.f1841U, k0.k.i(getContext(), com.playgen.securelock.R.attr.colorSurface, 0));
        }
        this.f1841U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1830J;
        if (gVar3 != null && this.f1831K != null) {
            if (this.f1837Q > -1 && this.f1840T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f1862k0) : ColorStateList.valueOf(this.f1840T));
                this.f1831K.j(ColorStateList.valueOf(this.f1840T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1824C) {
            return 0;
        }
        int i = this.f1835O;
        d dVar = this.f1883v0;
        if (i == 0) {
            d = dVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = dVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final C0187h d() {
        C0187h c0187h = new C0187h();
        c0187h.f2739c = l.U(getContext(), com.playgen.securelock.R.attr.motionDurationShort2, 87);
        c0187h.d = l.V(getContext(), com.playgen.securelock.R.attr.motionEasingLinearInterpolator, AbstractC0281a.f3380a);
        return c0187h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1851e != null) {
            boolean z2 = this.f1826E;
            this.f1826E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1851e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1826E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1844a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1821A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1821A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1824C;
        d dVar = this.f1883v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f82B != null) {
                RectF rectF = dVar.f113e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = dVar.f93N;
                    textPaint.setTextSize(dVar.f86G);
                    float f2 = dVar.f124p;
                    float f3 = dVar.f125q;
                    float f4 = dVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f112d0 <= 1 || dVar.f83C) {
                        canvas.translate(f2, f3);
                        dVar.f104Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f124p - dVar.f104Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f109b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f87H;
                            float f7 = dVar.f88I;
                            float f8 = dVar.f89J;
                            int i3 = dVar.f90K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f104Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f107a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f87H;
                            float f10 = dVar.f88I;
                            float f11 = dVar.f89J;
                            int i4 = dVar.f90K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f104Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f111c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f87H, dVar.f88I, dVar.f89J, dVar.f90K);
                        }
                        String trim = dVar.f111c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f104Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1831K == null || (gVar = this.f1830J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1831K.getBounds();
            Rect bounds2 = this.f1830J.getBounds();
            float f13 = dVar.f108b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0281a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0281a.c(centerX, bounds2.right, f13);
            this.f1831K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f1890z0) {
            return;
        }
        this.f1890z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f1883v0;
        if (dVar != null) {
            dVar.f91L = drawableState;
            ColorStateList colorStateList2 = dVar.f119k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f118j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = S.f369a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f1890z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f1890z0 = false;
    }

    public final boolean e() {
        return this.f1824C && !TextUtils.isEmpty(this.f1825D) && (this.F instanceof h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.playgen.securelock.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.playgen.securelock.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.playgen.securelock.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        I0.a aVar = new I0.a(f2);
        I0.a aVar2 = new I0.a(f2);
        I0.a aVar3 = new I0.a(dimensionPixelOffset);
        I0.a aVar4 = new I0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f304a = iVar;
        kVar.f305b = iVar2;
        kVar.f306c = iVar3;
        kVar.d = iVar4;
        kVar.f307e = aVar;
        kVar.f308f = aVar2;
        kVar.f309g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f310j = eVar2;
        kVar.f311k = eVar3;
        kVar.f312l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f274w;
            TypedValue W2 = l.W(context, com.playgen.securelock.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = W2.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : W2.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f275a;
        if (fVar.f266g == null) {
            fVar.f266g = new Rect();
        }
        gVar.f275a.f266g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1848c.c() : this.f1846b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f1835O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1841U;
    }

    public int getBoxBackgroundMode() {
        return this.f1835O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1836P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1845a0;
        return e2 ? this.f1832L.h.a(rectF) : this.f1832L.f309g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1845a0;
        return e2 ? this.f1832L.f309g.a(rectF) : this.f1832L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1845a0;
        return e2 ? this.f1832L.f307e.a(rectF) : this.f1832L.f308f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1845a0;
        return e2 ? this.f1832L.f308f.a(rectF) : this.f1832L.f307e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1866m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1838R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1839S;
    }

    public int getCounterMaxLength() {
        return this.f1863l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0213d0 c0213d0;
        if (this.f1861k && this.f1865m && (c0213d0 = this.f1868o) != null) {
            return c0213d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1889z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1888y;
    }

    public ColorStateList getCursorColor() {
        return this.f1820A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1822B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1858i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1848c.f546g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1848c.f546g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1848c.f550m;
    }

    public int getEndIconMode() {
        return this.f1848c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1848c.f551n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1848c.f546g;
    }

    public CharSequence getError() {
        u uVar = this.f1859j;
        if (uVar.f583q) {
            return uVar.f582p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1859j.f586t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1859j.f585s;
    }

    public int getErrorCurrentTextColors() {
        C0213d0 c0213d0 = this.f1859j.f584r;
        if (c0213d0 != null) {
            return c0213d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1848c.f543c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1859j;
        if (uVar.f590x) {
            return uVar.f589w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0213d0 c0213d0 = this.f1859j.f591y;
        if (c0213d0 != null) {
            return c0213d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1824C) {
            return this.f1825D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1883v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f1883v0;
        return dVar.e(dVar.f119k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1860j0;
    }

    public E getLengthCounter() {
        return this.f1867n;
    }

    public int getMaxEms() {
        return this.f1855g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1853f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1848c.f546g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1848c.f546g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1876s) {
            return this.f1874r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1882v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1880u;
    }

    public CharSequence getPrefixText() {
        return this.f1846b.f609c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1846b.f608b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1846b.f608b;
    }

    public k getShapeAppearanceModel() {
        return this.f1832L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1846b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1846b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1846b.f612g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1846b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1848c.f553p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1848c.f554q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1848c.f554q;
    }

    public Typeface getTypeface() {
        return this.f1847b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1846b.a() : this.f1848c.c());
    }

    public final void i() {
        int i = this.f1835O;
        if (i == 0) {
            this.F = null;
            this.f1830J = null;
            this.f1831K = null;
        } else if (i == 1) {
            this.F = new g(this.f1832L);
            this.f1830J = new g();
            this.f1831K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1835O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1824C || (this.F instanceof h)) {
                this.F = new g(this.f1832L);
            } else {
                k kVar = this.f1832L;
                int i2 = h.f516y;
                if (kVar == null) {
                    kVar = new k();
                }
                L0.g gVar = new L0.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f517x = gVar;
                this.F = hVar;
            }
            this.f1830J = null;
            this.f1831K = null;
        }
        s();
        x();
        if (this.f1835O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1836P = getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (u1.d.V(getContext())) {
                this.f1836P = getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1835O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = S.f369a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (u1.d.V(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = S.f369a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1835O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1835O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        int i2;
        if (e()) {
            int width = this.d.getWidth();
            int gravity = this.d.getGravity();
            d dVar = this.f1883v0;
            boolean b2 = dVar.b(dVar.f81A);
            dVar.f83C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f105Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f105Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1845a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f105Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f83C) {
                        f5 = max + dVar.f105Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f83C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f105Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1834N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1837Q);
                h hVar = (h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f105Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1845a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f105Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0213d0 c0213d0, int i) {
        try {
            c0213d0.setTextAppearance(i);
            if (c0213d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0213d0.setTextAppearance(com.playgen.securelock.R.style.TextAppearance_AppCompat_Caption);
        c0213d0.setTextColor(b.a(getContext(), com.playgen.securelock.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f1859j;
        return (uVar.f581o != 1 || uVar.f584r == null || TextUtils.isEmpty(uVar.f582p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0006g) this.f1867n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f1865m;
        int i = this.f1863l;
        String str = null;
        if (i == -1) {
            this.f1868o.setText(String.valueOf(length));
            this.f1868o.setContentDescription(null);
            this.f1865m = false;
        } else {
            this.f1865m = length > i;
            Context context = getContext();
            this.f1868o.setContentDescription(context.getString(this.f1865m ? com.playgen.securelock.R.string.character_counter_overflowed_content_description : com.playgen.securelock.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1863l)));
            if (z2 != this.f1865m) {
                o();
            }
            String str2 = I.b.f243b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f245e : I.b.d;
            C0213d0 c0213d0 = this.f1868o;
            String string = getContext().getString(com.playgen.securelock.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1863l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f253a;
                str = bVar.c(string).toString();
            }
            c0213d0.setText(str);
        }
        if (this.d == null || z2 == this.f1865m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0213d0 c0213d0 = this.f1868o;
        if (c0213d0 != null) {
            l(c0213d0, this.f1865m ? this.f1870p : this.f1872q);
            if (!this.f1865m && (colorStateList2 = this.f1888y) != null) {
                this.f1868o.setTextColor(colorStateList2);
            }
            if (!this.f1865m || (colorStateList = this.f1889z) == null) {
                return;
            }
            this.f1868o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1883v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1848c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1823B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1846b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new p(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = C0.e.f135a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1842V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = C0.e.f135a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            C0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = C0.e.f136b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1830J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1838R, rect.right, i5);
            }
            g gVar2 = this.f1831K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1839S, rect.right, i6);
            }
            if (this.f1824C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f1883v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f117g != i7) {
                    dVar.f117g = i7;
                    dVar.h(false);
                }
                if (dVar.f115f != gravity) {
                    dVar.f115f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = n.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1843W;
                rect2.bottom = i8;
                int i9 = this.f1835O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1836P;
                    rect2.right = h(rect.right, e2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e2);
                } else {
                    rect2.left = this.d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = dVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    dVar.f92M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f94O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f129u);
                textPaint.setLetterSpacing(dVar.f102W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1835O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1835O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f110c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f92M = true;
                }
                dVar.h(false);
                if (!e() || this.f1881u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.f1823B0;
        q qVar = this.f1848c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1823B0 = true;
        }
        if (this.f1878t != null && (editText = this.d) != null) {
            this.f1878t.setGravity(editText.getGravity());
            this.f1878t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        qVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F f2 = (F) parcelable;
        super.onRestoreInstanceState(f2.f714a);
        setError(f2.f498c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1833M) {
            c cVar = this.f1832L.f307e;
            RectF rectF = this.f1845a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1832L.f308f.a(rectF);
            float a4 = this.f1832L.h.a(rectF);
            float a5 = this.f1832L.f309g.a(rectF);
            k kVar = this.f1832L;
            l lVar = kVar.f304a;
            l lVar2 = kVar.f305b;
            l lVar3 = kVar.d;
            l lVar4 = kVar.f306c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(lVar2);
            j.b(lVar);
            j.b(lVar4);
            j.b(lVar3);
            I0.a aVar = new I0.a(a3);
            I0.a aVar2 = new I0.a(a2);
            I0.a aVar3 = new I0.a(a5);
            I0.a aVar4 = new I0.a(a4);
            k kVar2 = new k();
            kVar2.f304a = lVar2;
            kVar2.f305b = lVar;
            kVar2.f306c = lVar3;
            kVar2.d = lVar4;
            kVar2.f307e = aVar;
            kVar2.f308f = aVar2;
            kVar2.f309g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f310j = eVar2;
            kVar2.f311k = eVar3;
            kVar2.f312l = eVar4;
            this.f1833M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f498c = getError();
        }
        q qVar = this.f1848c;
        f2.d = qVar.i != 0 && qVar.f546g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1820A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue S2 = l.S(context, com.playgen.securelock.R.attr.colorControlActivated);
            if (S2 != null) {
                int i = S2.resourceId;
                if (i != 0) {
                    colorStateList2 = u1.d.B(context, i);
                } else {
                    int i2 = S2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f1868o != null && this.f1865m)) && (colorStateList = this.f1822B) != null) {
                colorStateList2 = colorStateList;
            }
            D.a.h(mutate, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z2;
        q qVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            z zVar = this.f1846b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1849c0 == null || this.f1850d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1849c0 = colorDrawable3;
                    this.f1850d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1849c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1848c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f553p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f554q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f543c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f546g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1854f0;
                        if (colorDrawable != null || this.f1856g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1854f0 = colorDrawable5;
                                this.f1856g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1854f0;
                            if (drawable == colorDrawable2) {
                                this.f1857h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1856g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1854f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1854f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1854f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1857h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1854f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1848c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f554q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1854f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1854f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1849c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1849c0 = null;
            z2 = true;
            qVar = this.f1848c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f554q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1854f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1854f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1848c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f554q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1854f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1854f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0213d0 c0213d0;
        EditText editText = this.d;
        if (editText == null || this.f1835O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0233n0.f2965a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0246u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1865m && (c0213d0 = this.f1868o) != null) {
            mutate.setColorFilter(C0246u.c(c0213d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.f1829I || editText.getBackground() == null) && this.f1835O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = S.f369a;
            editText2.setBackground(editTextBoxBackground);
            this.f1829I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1841U != i) {
            this.f1841U = i;
            this.f1869o0 = i;
            this.f1873q0 = i;
            this.f1875r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1869o0 = defaultColor;
        this.f1841U = defaultColor;
        this.f1871p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1873q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1875r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1835O) {
            return;
        }
        this.f1835O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1836P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1832L.e();
        c cVar = this.f1832L.f307e;
        l v2 = u1.d.v(i);
        e2.f295a = v2;
        j.b(v2);
        e2.f298e = cVar;
        c cVar2 = this.f1832L.f308f;
        l v3 = u1.d.v(i);
        e2.f296b = v3;
        j.b(v3);
        e2.f299f = cVar2;
        c cVar3 = this.f1832L.h;
        l v4 = u1.d.v(i);
        e2.d = v4;
        j.b(v4);
        e2.h = cVar3;
        c cVar4 = this.f1832L.f309g;
        l v5 = u1.d.v(i);
        e2.f297c = v5;
        j.b(v5);
        e2.f300g = cVar4;
        this.f1832L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1866m0 != i) {
            this.f1866m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1862k0 = colorStateList.getDefaultColor();
            this.f1877s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1864l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1866m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1866m0 != colorStateList.getDefaultColor()) {
            this.f1866m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1838R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1839S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1861k != z2) {
            u uVar = this.f1859j;
            if (z2) {
                C0213d0 c0213d0 = new C0213d0(getContext(), null);
                this.f1868o = c0213d0;
                c0213d0.setId(com.playgen.securelock.R.id.textinput_counter);
                Typeface typeface = this.f1847b0;
                if (typeface != null) {
                    this.f1868o.setTypeface(typeface);
                }
                this.f1868o.setMaxLines(1);
                uVar.a(this.f1868o, 2);
                ((ViewGroup.MarginLayoutParams) this.f1868o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.playgen.securelock.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1868o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f1868o, 2);
                this.f1868o = null;
            }
            this.f1861k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1863l != i) {
            if (i > 0) {
                this.f1863l = i;
            } else {
                this.f1863l = -1;
            }
            if (!this.f1861k || this.f1868o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1870p != i) {
            this.f1870p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1889z != colorStateList) {
            this.f1889z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1872q != i) {
            this.f1872q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1888y != colorStateList) {
            this.f1888y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1820A != colorStateList) {
            this.f1820A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1822B != colorStateList) {
            this.f1822B = colorStateList;
            if (m() || (this.f1868o != null && this.f1865m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1858i0 = colorStateList;
        this.f1860j0 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f1848c.f546g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1848c.f546g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1848c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f546g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1848c;
        Drawable G2 = i != 0 ? u1.d.G(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f546g;
        checkableImageButton.setImageDrawable(G2);
        if (G2 != null) {
            ColorStateList colorStateList = qVar.f548k;
            PorterDuff.Mode mode = qVar.f549l;
            TextInputLayout textInputLayout = qVar.f541a;
            u1.d.h(textInputLayout, checkableImageButton, colorStateList, mode);
            u1.d.h0(textInputLayout, checkableImageButton, qVar.f548k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1848c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f550m) {
            qVar.f550m = i;
            CheckableImageButton checkableImageButton = qVar.f546g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f543c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1848c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1848c;
        View.OnLongClickListener onLongClickListener = qVar.f552o;
        CheckableImageButton checkableImageButton = qVar.f546g;
        checkableImageButton.setOnClickListener(onClickListener);
        u1.d.n0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1848c;
        qVar.f552o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f546g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u1.d.n0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1848c;
        qVar.f551n = scaleType;
        qVar.f546g.setScaleType(scaleType);
        qVar.f543c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1848c;
        if (qVar.f548k != colorStateList) {
            qVar.f548k = colorStateList;
            u1.d.h(qVar.f541a, qVar.f546g, colorStateList, qVar.f549l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1848c;
        if (qVar.f549l != mode) {
            qVar.f549l = mode;
            u1.d.h(qVar.f541a, qVar.f546g, qVar.f548k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1848c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1859j;
        if (!uVar.f583q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            uVar.f();
            return;
        }
        uVar.c();
        uVar.f582p = charSequence;
        uVar.f584r.setText(charSequence);
        int i = uVar.f580n;
        if (i != 1) {
            uVar.f581o = 1;
        }
        uVar.i(i, uVar.f581o, uVar.h(uVar.f584r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f1859j;
        uVar.f586t = i;
        C0213d0 c0213d0 = uVar.f584r;
        if (c0213d0 != null) {
            WeakHashMap weakHashMap = S.f369a;
            c0213d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1859j;
        uVar.f585s = charSequence;
        C0213d0 c0213d0 = uVar.f584r;
        if (c0213d0 != null) {
            c0213d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1859j;
        if (uVar.f583q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0213d0 c0213d0 = new C0213d0(uVar.f575g, null);
            uVar.f584r = c0213d0;
            c0213d0.setId(com.playgen.securelock.R.id.textinput_error);
            uVar.f584r.setTextAlignment(5);
            Typeface typeface = uVar.f569B;
            if (typeface != null) {
                uVar.f584r.setTypeface(typeface);
            }
            int i = uVar.f587u;
            uVar.f587u = i;
            C0213d0 c0213d02 = uVar.f584r;
            if (c0213d02 != null) {
                textInputLayout.l(c0213d02, i);
            }
            ColorStateList colorStateList = uVar.f588v;
            uVar.f588v = colorStateList;
            C0213d0 c0213d03 = uVar.f584r;
            if (c0213d03 != null && colorStateList != null) {
                c0213d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f585s;
            uVar.f585s = charSequence;
            C0213d0 c0213d04 = uVar.f584r;
            if (c0213d04 != null) {
                c0213d04.setContentDescription(charSequence);
            }
            int i2 = uVar.f586t;
            uVar.f586t = i2;
            C0213d0 c0213d05 = uVar.f584r;
            if (c0213d05 != null) {
                WeakHashMap weakHashMap = S.f369a;
                c0213d05.setAccessibilityLiveRegion(i2);
            }
            uVar.f584r.setVisibility(4);
            uVar.a(uVar.f584r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f584r, 0);
            uVar.f584r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f583q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1848c;
        qVar.i(i != 0 ? u1.d.G(qVar.getContext(), i) : null);
        u1.d.h0(qVar.f541a, qVar.f543c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1848c;
        CheckableImageButton checkableImageButton = qVar.f543c;
        View.OnLongClickListener onLongClickListener = qVar.f545f;
        checkableImageButton.setOnClickListener(onClickListener);
        u1.d.n0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1848c;
        qVar.f545f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f543c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u1.d.n0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1848c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            u1.d.h(qVar.f541a, qVar.f543c, colorStateList, qVar.f544e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1848c;
        if (qVar.f544e != mode) {
            qVar.f544e = mode;
            u1.d.h(qVar.f541a, qVar.f543c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f1859j;
        uVar.f587u = i;
        C0213d0 c0213d0 = uVar.f584r;
        if (c0213d0 != null) {
            uVar.h.l(c0213d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1859j;
        uVar.f588v = colorStateList;
        C0213d0 c0213d0 = uVar.f584r;
        if (c0213d0 == null || colorStateList == null) {
            return;
        }
        c0213d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f1885w0 != z2) {
            this.f1885w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1859j;
        if (isEmpty) {
            if (uVar.f590x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f590x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f589w = charSequence;
        uVar.f591y.setText(charSequence);
        int i = uVar.f580n;
        if (i != 2) {
            uVar.f581o = 2;
        }
        uVar.i(i, uVar.f581o, uVar.h(uVar.f591y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1859j;
        uVar.f568A = colorStateList;
        C0213d0 c0213d0 = uVar.f591y;
        if (c0213d0 == null || colorStateList == null) {
            return;
        }
        c0213d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1859j;
        if (uVar.f590x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0213d0 c0213d0 = new C0213d0(uVar.f575g, null);
            uVar.f591y = c0213d0;
            c0213d0.setId(com.playgen.securelock.R.id.textinput_helper_text);
            uVar.f591y.setTextAlignment(5);
            Typeface typeface = uVar.f569B;
            if (typeface != null) {
                uVar.f591y.setTypeface(typeface);
            }
            uVar.f591y.setVisibility(4);
            uVar.f591y.setAccessibilityLiveRegion(1);
            int i = uVar.f592z;
            uVar.f592z = i;
            C0213d0 c0213d02 = uVar.f591y;
            if (c0213d02 != null) {
                c0213d02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f568A;
            uVar.f568A = colorStateList;
            C0213d0 c0213d03 = uVar.f591y;
            if (c0213d03 != null && colorStateList != null) {
                c0213d03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f591y, 1);
            uVar.f591y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f580n;
            if (i2 == 2) {
                uVar.f581o = 0;
            }
            uVar.i(i2, uVar.f581o, uVar.h(uVar.f591y, ""));
            uVar.g(uVar.f591y, 1);
            uVar.f591y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f590x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f1859j;
        uVar.f592z = i;
        C0213d0 c0213d0 = uVar.f591y;
        if (c0213d0 != null) {
            c0213d0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1824C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f1887x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1824C) {
            this.f1824C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1825D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1826E = true;
            } else {
                this.f1826E = false;
                if (!TextUtils.isEmpty(this.f1825D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1825D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f1883v0;
        TextInputLayout textInputLayout = dVar.f106a;
        F0.d dVar2 = new F0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f182j;
        if (colorStateList != null) {
            dVar.f119k = colorStateList;
        }
        float f2 = dVar2.f183k;
        if (f2 != 0.0f) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f176a;
        if (colorStateList2 != null) {
            dVar.f100U = colorStateList2;
        }
        dVar.f98S = dVar2.f179e;
        dVar.f99T = dVar2.f180f;
        dVar.f97R = dVar2.f181g;
        dVar.f101V = dVar2.i;
        F0.a aVar = dVar.f133y;
        if (aVar != null) {
            aVar.f172g = true;
        }
        C.g gVar = new C.g(1, dVar);
        dVar2.a();
        dVar.f133y = new F0.a(gVar, dVar2.f186n);
        dVar2.c(textInputLayout.getContext(), dVar.f133y);
        dVar.h(false);
        this.f1860j0 = dVar.f119k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1860j0 != colorStateList) {
            if (this.f1858i0 == null) {
                d dVar = this.f1883v0;
                if (dVar.f119k != colorStateList) {
                    dVar.f119k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f1860j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f1867n = e2;
    }

    public void setMaxEms(int i) {
        this.f1855g = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1853f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        q qVar = this.f1848c;
        qVar.f546g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1848c;
        qVar.f546g.setImageDrawable(i != 0 ? u1.d.G(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1848c;
        if (z2 && qVar.i != 1) {
            qVar.g(1);
        } else if (z2) {
            qVar.getClass();
        } else {
            qVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f1848c;
        qVar.f548k = colorStateList;
        u1.d.h(qVar.f541a, qVar.f546g, colorStateList, qVar.f549l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1848c;
        qVar.f549l = mode;
        u1.d.h(qVar.f541a, qVar.f546g, qVar.f548k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1878t == null) {
            C0213d0 c0213d0 = new C0213d0(getContext(), null);
            this.f1878t = c0213d0;
            c0213d0.setId(com.playgen.securelock.R.id.textinput_placeholder);
            this.f1878t.setImportantForAccessibility(2);
            C0187h d = d();
            this.f1884w = d;
            d.f2738b = 67L;
            this.f1886x = d();
            setPlaceholderTextAppearance(this.f1882v);
            setPlaceholderTextColor(this.f1880u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1876s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1874r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1882v = i;
        C0213d0 c0213d0 = this.f1878t;
        if (c0213d0 != null) {
            c0213d0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1880u != colorStateList) {
            this.f1880u = colorStateList;
            C0213d0 c0213d0 = this.f1878t;
            if (c0213d0 == null || colorStateList == null) {
                return;
            }
            c0213d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1846b;
        zVar.getClass();
        zVar.f609c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f608b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1846b.f608b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1846b.f608b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f275a.f261a == kVar) {
            return;
        }
        this.f1832L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1846b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1846b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? u1.d.G(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1846b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f612g) {
            zVar.f612g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1846b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        u1.d.n0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1846b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u1.d.n0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1846b;
        zVar.h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1846b;
        if (zVar.f610e != colorStateList) {
            zVar.f610e = colorStateList;
            u1.d.h(zVar.f607a, zVar.d, colorStateList, zVar.f611f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1846b;
        if (zVar.f611f != mode) {
            zVar.f611f = mode;
            u1.d.h(zVar.f607a, zVar.d, zVar.f610e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1846b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1848c;
        qVar.getClass();
        qVar.f553p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f554q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1848c.f554q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1848c.f554q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            S.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1847b0) {
            this.f1847b0 = typeface;
            this.f1883v0.m(typeface);
            u uVar = this.f1859j;
            if (typeface != uVar.f569B) {
                uVar.f569B = typeface;
                C0213d0 c0213d0 = uVar.f584r;
                if (c0213d0 != null) {
                    c0213d0.setTypeface(typeface);
                }
                C0213d0 c0213d02 = uVar.f591y;
                if (c0213d02 != null) {
                    c0213d02.setTypeface(typeface);
                }
            }
            C0213d0 c0213d03 = this.f1868o;
            if (c0213d03 != null) {
                c0213d03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1835O != 1) {
            FrameLayout frameLayout = this.f1844a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0213d0 c0213d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1858i0;
        d dVar = this.f1883v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1858i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1877s0) : this.f1877s0));
        } else if (m()) {
            C0213d0 c0213d02 = this.f1859j.f584r;
            dVar.i(c0213d02 != null ? c0213d02.getTextColors() : null);
        } else if (this.f1865m && (c0213d0 = this.f1868o) != null) {
            dVar.i(c0213d0.getTextColors());
        } else if (z5 && (colorStateList = this.f1860j0) != null && dVar.f119k != colorStateList) {
            dVar.f119k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f1848c;
        z zVar = this.f1846b;
        if (z4 || !this.f1885w0 || (isEnabled() && z5)) {
            if (z3 || this.f1881u0) {
                ValueAnimator valueAnimator = this.y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.y0.cancel();
                }
                if (z2 && this.f1887x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f1881u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f613j = false;
                zVar.e();
                qVar.f555r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f1881u0) {
            ValueAnimator valueAnimator2 = this.y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.y0.cancel();
            }
            if (z2 && this.f1887x0) {
                a(0.0f);
            } else {
                dVar.k(0.0f);
            }
            if (e() && !((h) this.F).f517x.f515q.isEmpty() && e()) {
                ((h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1881u0 = true;
            C0213d0 c0213d03 = this.f1878t;
            if (c0213d03 != null && this.f1876s) {
                c0213d03.setText((CharSequence) null);
                r.a(this.f1844a, this.f1886x);
                this.f1878t.setVisibility(4);
            }
            zVar.f613j = true;
            zVar.e();
            qVar.f555r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0006g) this.f1867n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1844a;
        if (length != 0 || this.f1881u0) {
            C0213d0 c0213d0 = this.f1878t;
            if (c0213d0 == null || !this.f1876s) {
                return;
            }
            c0213d0.setText((CharSequence) null);
            r.a(frameLayout, this.f1886x);
            this.f1878t.setVisibility(4);
            return;
        }
        if (this.f1878t == null || !this.f1876s || TextUtils.isEmpty(this.f1874r)) {
            return;
        }
        this.f1878t.setText(this.f1874r);
        r.a(frameLayout, this.f1884w);
        this.f1878t.setVisibility(0);
        this.f1878t.bringToFront();
        announceForAccessibility(this.f1874r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1840T = colorForState2;
        } else if (z3) {
            this.f1840T = colorForState;
        } else {
            this.f1840T = defaultColor;
        }
    }

    public final void x() {
        C0213d0 c0213d0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1835O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1840T = this.f1877s0;
        } else if (m()) {
            if (this.n0 != null) {
                w(z3, z2);
            } else {
                this.f1840T = getErrorCurrentTextColors();
            }
        } else if (!this.f1865m || (c0213d0 = this.f1868o) == null) {
            if (z3) {
                this.f1840T = this.f1866m0;
            } else if (z2) {
                this.f1840T = this.f1864l0;
            } else {
                this.f1840T = this.f1862k0;
            }
        } else if (this.n0 != null) {
            w(z3, z2);
        } else {
            this.f1840T = c0213d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1848c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f543c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f541a;
        u1.d.h0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f548k;
        CheckableImageButton checkableImageButton2 = qVar.f546g;
        u1.d.h0(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof L0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                u1.d.h(textInputLayout, checkableImageButton2, qVar.f548k, qVar.f549l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1846b;
        u1.d.h0(zVar.f607a, zVar.d, zVar.f610e);
        if (this.f1835O == 2) {
            int i = this.f1837Q;
            if (z3 && isEnabled()) {
                this.f1837Q = this.f1839S;
            } else {
                this.f1837Q = this.f1838R;
            }
            if (this.f1837Q != i && e() && !this.f1881u0) {
                if (e()) {
                    ((h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1835O == 1) {
            if (!isEnabled()) {
                this.f1841U = this.f1871p0;
            } else if (z2 && !z3) {
                this.f1841U = this.f1875r0;
            } else if (z3) {
                this.f1841U = this.f1873q0;
            } else {
                this.f1841U = this.f1869o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1846b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1848c.f546g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1848c.f546g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1848c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1848c.f546g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1848c;
        CheckableImageButton checkableImageButton = qVar.f546g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f548k;
            PorterDuff.Mode mode = qVar.f549l;
            TextInputLayout textInputLayout = qVar.f541a;
            u1.d.h(textInputLayout, checkableImageButton, colorStateList, mode);
            u1.d.h0(textInputLayout, checkableImageButton, qVar.f548k);
        }
    }
}
