package com.google.android.material.textfield;

import A.b;
import B0.e;
import B0.o;
import H0.c;
import H0.f;
import H0.g;
import H0.i;
import H0.j;
import H0.k;
import K.C0011g;
import K.N;
import K.X;
import K0.A;
import K0.B;
import K0.C;
import K0.D;
import K0.E;
import K0.F;
import K0.n;
import K0.q;
import K0.t;
import K0.u;
import K0.x;
import K0.z;
import M0.a;
import T.r;
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
import j0.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0277o0;
import l.C0257e0;
import l.C0292w;
import n0.AbstractC0303a;
import o0.AbstractC0305a;
import q1.d;
import q1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1978A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1979A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1980B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1981B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1982C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1983D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1984E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1985G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1986H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1987I;

    /* renamed from: J, reason: collision with root package name */
    public g f1988J;

    /* renamed from: K, reason: collision with root package name */
    public g f1989K;

    /* renamed from: L, reason: collision with root package name */
    public k f1990L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1991M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1992N;

    /* renamed from: O, reason: collision with root package name */
    public int f1993O;

    /* renamed from: P, reason: collision with root package name */
    public int f1994P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1995Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1996R;

    /* renamed from: S, reason: collision with root package name */
    public int f1997S;

    /* renamed from: T, reason: collision with root package name */
    public int f1998T;

    /* renamed from: U, reason: collision with root package name */
    public int f1999U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2000V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2001W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2002a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2003a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f2004b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2005b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f2006c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2007c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f2008d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2009d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2010e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2011e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2012f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2013f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2014g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2015g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2016h0;
    public int i;
    public ColorStateList i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f2017j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2018j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2019k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2020k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2021l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2022l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2023m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public E f2024n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2025n0;

    /* renamed from: o, reason: collision with root package name */
    public C0257e0 f2026o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2027o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2028p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2029p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2030q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2031q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2032r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2033r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2034s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2035s0;

    /* renamed from: t, reason: collision with root package name */
    public C0257e0 f2036t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2037t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2038u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2039u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2040v;

    /* renamed from: v0, reason: collision with root package name */
    public final e f2041v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2042w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2043w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2044x;
    public boolean x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2045y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2046y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2047z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2048z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.fortuneink.neonpad.R.attr.textInputStyle, com.fortuneink.neonpad.R.style.Widget_Design_TextInputLayout), attributeSet, com.fortuneink.neonpad.R.attr.textInputStyle);
        this.f2012f = -1;
        this.f2014g = -1;
        this.h = -1;
        this.i = -1;
        this.f2017j = new u(this);
        this.f2024n = new C0011g(2);
        this.f2000V = new Rect();
        this.f2001W = new Rect();
        this.f2003a0 = new RectF();
        this.f2011e0 = new LinkedHashSet();
        e eVar = new e(this);
        this.f2041v0 = eVar;
        this.f1981B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2002a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0305a.f3712a;
        eVar.f83Q = linearInterpolator;
        eVar.h(false);
        eVar.f82P = linearInterpolator;
        eVar.h(false);
        if (eVar.f105g != 8388659) {
            eVar.f105g = 8388659;
            eVar.h(false);
        }
        int[] iArr = AbstractC0303a.f3628A;
        o.a(context2, attributeSet, com.fortuneink.neonpad.R.attr.textInputStyle, com.fortuneink.neonpad.R.style.Widget_Design_TextInputLayout);
        o.b(context2, attributeSet, iArr, com.fortuneink.neonpad.R.attr.textInputStyle, com.fortuneink.neonpad.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.fortuneink.neonpad.R.attr.textInputStyle, com.fortuneink.neonpad.R.style.Widget_Design_TextInputLayout);
        r rVar = new r(context2, obtainStyledAttributes);
        z zVar = new z(this, rVar);
        this.f2004b = zVar;
        this.f1982C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2043w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1990L = k.b(context2, attributeSet, com.fortuneink.neonpad.R.attr.textInputStyle, com.fortuneink.neonpad.R.style.Widget_Design_TextInputLayout).a();
        this.f1992N = context2.getResources().getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1994P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1996R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1997S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1995Q = this.f1996R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1990L.e();
        if (dimension >= 0.0f) {
            e2.f298e = new H0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f299f = new H0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f300g = new H0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new H0.a(dimension4);
        }
        this.f1990L = e2.a();
        ColorStateList x2 = d.x(context2, rVar, 7);
        if (x2 != null) {
            int defaultColor = x2.getDefaultColor();
            this.f2027o0 = defaultColor;
            this.f1999U = defaultColor;
            if (x2.isStateful()) {
                this.f2029p0 = x2.getColorForState(new int[]{-16842910}, -1);
                this.f2031q0 = x2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2033r0 = x2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2031q0 = this.f2027o0;
                ColorStateList w2 = d.w(context2, com.fortuneink.neonpad.R.color.mtrl_filled_background_color);
                this.f2029p0 = w2.getColorForState(new int[]{-16842910}, -1);
                this.f2033r0 = w2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1999U = 0;
            this.f2027o0 = 0;
            this.f2029p0 = 0;
            this.f2031q0 = 0;
            this.f2033r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = rVar.g(1);
            this.f2018j0 = g2;
            this.i0 = g2;
        }
        ColorStateList x3 = d.x(context2, rVar, 14);
        this.m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2020k0 = b.a(context2, com.fortuneink.neonpad.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2035s0 = b.a(context2, com.fortuneink.neonpad.R.color.mtrl_textinput_disabled_color);
        this.f2022l0 = b.a(context2, com.fortuneink.neonpad.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (x3 != null) {
            setBoxStrokeColorStateList(x3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(d.x(context2, rVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1978A = rVar.g(24);
        this.f1980B = rVar.g(25);
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
        this.f2030q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2028p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2028p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2030q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(rVar.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(rVar.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(rVar.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(rVar.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(rVar.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(rVar.g(58));
        }
        q qVar = new q(this, rVar);
        this.f2006c = qVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        rVar.t();
        setImportantForAccessibility(2);
        N.m(this, 1);
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
        EditText editText = this.f2008d;
        if (!(editText instanceof AutoCompleteTextView) || d.J(editText)) {
            return this.F;
        }
        int h = i1.r.h(this.f2008d, com.fortuneink.neonpad.R.attr.colorControlHighlight);
        int i = this.f1993O;
        int[][] iArr = C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1999U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{i1.r.l(h, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue h02 = l.h0(context, com.fortuneink.neonpad.R.attr.colorSurface, "TextInputLayout");
        int i3 = h02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : h02.data;
        g gVar3 = new g(gVar2.f273a.f258a);
        int l2 = i1.r.l(h, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{l2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{l2, a2});
        g gVar4 = new g(gVar2.f273a.f258a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1986H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1986H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1986H.addState(new int[0], f(false));
        }
        return this.f1986H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1985G == null) {
            this.f1985G = f(true);
        }
        return this.f1985G;
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
        if (this.f2008d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2008d = editText;
        int i = this.f2012f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2014g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1987I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.f2008d.getTypeface();
        e eVar = this.f2041v0;
        eVar.m(typeface);
        float textSize = this.f2008d.getTextSize();
        if (eVar.h != textSize) {
            eVar.h = textSize;
            eVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2008d.getLetterSpacing();
        if (eVar.f89W != letterSpacing) {
            eVar.f89W = letterSpacing;
            eVar.h(false);
        }
        int gravity = this.f2008d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (eVar.f105g != i4) {
            eVar.f105g = i4;
            eVar.h(false);
        }
        if (eVar.f103f != gravity) {
            eVar.f103f = gravity;
            eVar.h(false);
        }
        WeakHashMap weakHashMap = X.f418a;
        this.f2037t0 = editText.getMinimumHeight();
        this.f2008d.addTextChangedListener(new A(this, editText));
        if (this.i0 == null) {
            this.i0 = this.f2008d.getHintTextColors();
        }
        if (this.f1982C) {
            if (TextUtils.isEmpty(this.f1983D)) {
                CharSequence hint = this.f2008d.getHint();
                this.f2010e = hint;
                setHint(hint);
                this.f2008d.setHint((CharSequence) null);
            }
            this.f1984E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2026o != null) {
            n(this.f2008d.getText());
        }
        r();
        this.f2017j.b();
        this.f2004b.bringToFront();
        q qVar = this.f2006c;
        qVar.bringToFront();
        Iterator it = this.f2011e0.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1983D)) {
            return;
        }
        this.f1983D = charSequence;
        e eVar = this.f2041v0;
        if (charSequence == null || !TextUtils.equals(eVar.f68A, charSequence)) {
            eVar.f68A = charSequence;
            eVar.f69B = null;
            Bitmap bitmap = eVar.f72E;
            if (bitmap != null) {
                bitmap.recycle();
                eVar.f72E = null;
            }
            eVar.h(false);
        }
        if (this.f2039u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2034s == z2) {
            return;
        }
        if (z2) {
            C0257e0 c0257e0 = this.f2036t;
            if (c0257e0 != null) {
                this.f2002a.addView(c0257e0);
                this.f2036t.setVisibility(0);
            }
        } else {
            C0257e0 c0257e02 = this.f2036t;
            if (c0257e02 != null) {
                c0257e02.setVisibility(8);
            }
            this.f2036t = null;
        }
        this.f2034s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        e eVar = this.f2041v0;
        if (eVar.f95b == f2) {
            return;
        }
        if (this.f2046y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2046y0 = valueAnimator;
            valueAnimator.setInterpolator(l.g0(getContext(), com.fortuneink.neonpad.R.attr.motionEasingEmphasizedInterpolator, AbstractC0305a.f3713b));
            this.f2046y0.setDuration(l.f0(getContext(), com.fortuneink.neonpad.R.attr.motionDurationMedium4, 167));
            this.f2046y0.addUpdateListener(new C(i, this));
        }
        this.f2046y0.setFloatValues(eVar.f95b, f2);
        this.f2046y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2002a;
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
        k kVar = gVar.f273a.f258a;
        k kVar2 = this.f1990L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1993O == 2 && (i = this.f1995Q) > -1 && (i2 = this.f1998T) != 0) {
            g gVar2 = this.F;
            gVar2.f273a.f265j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f273a;
            if (fVar.f261d != valueOf) {
                fVar.f261d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1999U;
        if (this.f1993O == 1) {
            i3 = C.a.b(this.f1999U, i1.r.g(getContext(), com.fortuneink.neonpad.R.attr.colorSurface, 0));
        }
        this.f1999U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1988J;
        if (gVar3 != null && this.f1989K != null) {
            if (this.f1995Q > -1 && this.f1998T != 0) {
                gVar3.j(this.f2008d.isFocused() ? ColorStateList.valueOf(this.f2020k0) : ColorStateList.valueOf(this.f1998T));
                this.f1989K.j(ColorStateList.valueOf(this.f1998T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f1982C) {
            return 0;
        }
        int i = this.f1993O;
        e eVar = this.f2041v0;
        if (i == 0) {
            d2 = eVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d2 = eVar.d() / 2.0f;
        }
        return (int) d2;
    }

    public final h d() {
        h hVar = new h();
        hVar.f2932c = l.f0(getContext(), com.fortuneink.neonpad.R.attr.motionDurationShort2, 87);
        hVar.f2933d = l.g0(getContext(), com.fortuneink.neonpad.R.attr.motionEasingLinearInterpolator, AbstractC0305a.f3712a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2008d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2010e != null) {
            boolean z2 = this.f1984E;
            this.f1984E = false;
            CharSequence hint = editText.getHint();
            this.f2008d.setHint(this.f2010e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2008d.setHint(hint);
                this.f1984E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2002a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f2008d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1979A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1979A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1982C;
        e eVar = this.f2041v0;
        if (z2) {
            eVar.getClass();
            int save = canvas.save();
            if (eVar.f69B != null) {
                RectF rectF = eVar.f101e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = eVar.f80N;
                    textPaint.setTextSize(eVar.f73G);
                    float f2 = eVar.f112p;
                    float f3 = eVar.f113q;
                    float f4 = eVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (eVar.f100d0 <= 1 || eVar.f70C) {
                        canvas.translate(f2, f3);
                        eVar.f91Y.draw(canvas);
                    } else {
                        float lineStart = eVar.f112p - eVar.f91Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (eVar.f96b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = eVar.f74H;
                            float f7 = eVar.f75I;
                            float f8 = eVar.f76J;
                            int i3 = eVar.f77K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        eVar.f91Y.draw(canvas);
                        textPaint.setAlpha((int) (eVar.f94a0 * f5));
                        if (i2 >= 31) {
                            float f9 = eVar.f74H;
                            float f10 = eVar.f75I;
                            float f11 = eVar.f76J;
                            int i4 = eVar.f77K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = eVar.f91Y.getLineBaseline(0);
                        CharSequence charSequence = eVar.f98c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(eVar.f74H, eVar.f75I, eVar.f76J, eVar.f77K);
                        }
                        String trim = eVar.f98c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(eVar.f91Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1989K == null || (gVar = this.f1988J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f2008d.isFocused()) {
            Rect bounds = this.f1989K.getBounds();
            Rect bounds2 = this.f1988J.getBounds();
            float f13 = eVar.f95b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0305a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0305a.c(centerX, bounds2.right, f13);
            this.f1989K.draw(canvas);
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
        if (this.f2048z0) {
            return;
        }
        this.f2048z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        e eVar = this.f2041v0;
        if (eVar != null) {
            eVar.f78L = drawableState;
            ColorStateList colorStateList2 = eVar.f107k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = eVar.f106j) != null && colorStateList.isStateful())) {
                eVar.h(false);
                z2 = true;
                if (this.f2008d != null) {
                    WeakHashMap weakHashMap = X.f418a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2048z0 = false;
            }
        }
        z2 = false;
        if (this.f2008d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2048z0 = false;
    }

    public final boolean e() {
        return this.f1982C && !TextUtils.isEmpty(this.f1983D) && (this.F instanceof K0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2008d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        H0.e eVar = new H0.e(i);
        H0.e eVar2 = new H0.e(i);
        H0.e eVar3 = new H0.e(i);
        H0.e eVar4 = new H0.e(i);
        H0.a aVar = new H0.a(f2);
        H0.a aVar2 = new H0.a(f2);
        H0.a aVar3 = new H0.a(dimensionPixelOffset);
        H0.a aVar4 = new H0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f304a = iVar;
        kVar.f305b = iVar2;
        kVar.f306c = iVar3;
        kVar.f307d = iVar4;
        kVar.f308e = aVar;
        kVar.f309f = aVar2;
        kVar.f310g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f311j = eVar2;
        kVar.f312k = eVar3;
        kVar.f313l = eVar4;
        EditText editText2 = this.f2008d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f272w;
            TypedValue h02 = l.h0(context, com.fortuneink.neonpad.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = h02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : h02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f273a;
        if (fVar.f264g == null) {
            fVar.f264g = new Rect();
        }
        gVar.f273a.f264g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2008d.getCompoundPaddingLeft() : this.f2006c.c() : this.f2004b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2008d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f1993O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1999U;
    }

    public int getBoxBackgroundMode() {
        return this.f1993O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1994P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = o.e(this);
        RectF rectF = this.f2003a0;
        return e2 ? this.f1990L.h.a(rectF) : this.f1990L.f310g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = o.e(this);
        RectF rectF = this.f2003a0;
        return e2 ? this.f1990L.f310g.a(rectF) : this.f1990L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = o.e(this);
        RectF rectF = this.f2003a0;
        return e2 ? this.f1990L.f308e.a(rectF) : this.f1990L.f309f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = o.e(this);
        RectF rectF = this.f2003a0;
        return e2 ? this.f1990L.f309f.a(rectF) : this.f1990L.f308e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2025n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1996R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1997S;
    }

    public int getCounterMaxLength() {
        return this.f2021l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0257e0 c0257e0;
        if (this.f2019k && this.f2023m && (c0257e0 = this.f2026o) != null) {
            return c0257e0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2047z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2045y;
    }

    public ColorStateList getCursorColor() {
        return this.f1978A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1980B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.f2008d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2006c.f578g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2006c.f578g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2006c.f582m;
    }

    public int getEndIconMode() {
        return this.f2006c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2006c.f583n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2006c.f578g;
    }

    public CharSequence getError() {
        u uVar = this.f2017j;
        if (uVar.f618q) {
            return uVar.f617p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2017j.f621t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2017j.f620s;
    }

    public int getErrorCurrentTextColors() {
        C0257e0 c0257e0 = this.f2017j.f619r;
        if (c0257e0 != null) {
            return c0257e0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2006c.f574c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f2017j;
        if (uVar.f625x) {
            return uVar.f624w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0257e0 c0257e0 = this.f2017j.f626y;
        if (c0257e0 != null) {
            return c0257e0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1982C) {
            return this.f1983D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2041v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        e eVar = this.f2041v0;
        return eVar.e(eVar.f107k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2018j0;
    }

    public E getLengthCounter() {
        return this.f2024n;
    }

    public int getMaxEms() {
        return this.f2014g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2012f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2006c.f578g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2006c.f578g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2034s) {
            return this.f2032r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2040v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2038u;
    }

    public CharSequence getPrefixText() {
        return this.f2004b.f644c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2004b.f643b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2004b.f643b;
    }

    public k getShapeAppearanceModel() {
        return this.f1990L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2004b.f645d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2004b.f645d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2004b.f648g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2004b.h;
    }

    public CharSequence getSuffixText() {
        return this.f2006c.f585p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2006c.f586q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2006c.f586q;
    }

    public Typeface getTypeface() {
        return this.f2005b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2008d.getCompoundPaddingRight() : this.f2004b.a() : this.f2006c.c());
    }

    public final void i() {
        int i = this.f1993O;
        if (i == 0) {
            this.F = null;
            this.f1988J = null;
            this.f1989K = null;
        } else if (i == 1) {
            this.F = new g(this.f1990L);
            this.f1988J = new g();
            this.f1989K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1993O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1982C || (this.F instanceof K0.h)) {
                this.F = new g(this.f1990L);
            } else {
                k kVar = this.f1990L;
                int i2 = K0.h.f547y;
                if (kVar == null) {
                    kVar = new k();
                }
                K0.g gVar = new K0.g(kVar, new RectF());
                K0.h hVar = new K0.h(gVar);
                hVar.f548x = gVar;
                this.F = hVar;
            }
            this.f1988J = null;
            this.f1989K = null;
        }
        s();
        x();
        if (this.f1993O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1994P = getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (d.K(getContext())) {
                this.f1994P = getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2008d != null && this.f1993O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2008d;
                WeakHashMap weakHashMap = X.f418a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2008d.getPaddingEnd(), getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (d.K(getContext())) {
                EditText editText2 = this.f2008d;
                WeakHashMap weakHashMap2 = X.f418a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2008d.getPaddingEnd(), getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1993O != 0) {
            t();
        }
        EditText editText3 = this.f2008d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1993O;
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
            int width = this.f2008d.getWidth();
            int gravity = this.f2008d.getGravity();
            e eVar = this.f2041v0;
            boolean b2 = eVar.b(eVar.f68A);
            eVar.f70C = b2;
            Rect rect = eVar.f99d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = eVar.f92Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = eVar.f92Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2003a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (eVar.f92Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (eVar.f70C) {
                        f5 = max + eVar.f92Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (eVar.f70C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = eVar.f92Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = eVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1992N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1995Q);
                K0.h hVar = (K0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = eVar.f92Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2003a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (eVar.f92Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = eVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0257e0 c0257e0, int i) {
        try {
            c0257e0.setTextAppearance(i);
            if (c0257e0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0257e0.setTextAppearance(com.fortuneink.neonpad.R.style.TextAppearance_AppCompat_Caption);
        c0257e0.setTextColor(b.a(getContext(), com.fortuneink.neonpad.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f2017j;
        return (uVar.f616o != 1 || uVar.f619r == null || TextUtils.isEmpty(uVar.f617p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0011g) this.f2024n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2023m;
        int i = this.f2021l;
        String str = null;
        if (i == -1) {
            this.f2026o.setText(String.valueOf(length));
            this.f2026o.setContentDescription(null);
            this.f2023m = false;
        } else {
            this.f2023m = length > i;
            Context context = getContext();
            this.f2026o.setContentDescription(context.getString(this.f2023m ? com.fortuneink.neonpad.R.string.character_counter_overflowed_content_description : com.fortuneink.neonpad.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2021l)));
            if (z2 != this.f2023m) {
                o();
            }
            String str2 = I.b.f354b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f357e : I.b.f356d;
            C0257e0 c0257e0 = this.f2026o;
            String string = getContext().getString(com.fortuneink.neonpad.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2021l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f366a;
                str = bVar.c(string).toString();
            }
            c0257e0.setText(str);
        }
        if (this.f2008d == null || z2 == this.f2023m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0257e0 c0257e0 = this.f2026o;
        if (c0257e0 != null) {
            l(c0257e0, this.f2023m ? this.f2028p : this.f2030q);
            if (!this.f2023m && (colorStateList2 = this.f2045y) != null) {
                this.f2026o.setTextColor(colorStateList2);
            }
            if (!this.f2023m || (colorStateList = this.f2047z) == null) {
                return;
            }
            this.f2026o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2041v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f2006c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1981B0 = false;
        if (this.f2008d != null && this.f2008d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f2004b.getMeasuredHeight()))) {
            this.f2008d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.f2008d.post(new B0.q(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.f2008d;
        if (editText != null) {
            ThreadLocal threadLocal = B0.f.f123a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2000V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = B0.f.f123a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            B0.f.a(this, editText, matrix);
            ThreadLocal threadLocal3 = B0.f.f124b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1988J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1996R, rect.right, i5);
            }
            g gVar2 = this.f1989K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1997S, rect.right, i6);
            }
            if (this.f1982C) {
                float textSize = this.f2008d.getTextSize();
                e eVar = this.f2041v0;
                if (eVar.h != textSize) {
                    eVar.h = textSize;
                    eVar.h(false);
                }
                int gravity = this.f2008d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (eVar.f105g != i7) {
                    eVar.f105g = i7;
                    eVar.h(false);
                }
                if (eVar.f103f != gravity) {
                    eVar.f103f = gravity;
                    eVar.h(false);
                }
                if (this.f2008d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = o.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2001W;
                rect2.bottom = i8;
                int i9 = this.f1993O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1994P;
                    rect2.right = h(rect.right, e2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e2);
                } else {
                    rect2.left = this.f2008d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f2008d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = eVar.f99d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    eVar.f79M = true;
                }
                if (this.f2008d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = eVar.f81O;
                textPaint.setTextSize(eVar.h);
                textPaint.setTypeface(eVar.f117u);
                textPaint.setLetterSpacing(eVar.f89W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f2008d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1993O != 1 || this.f2008d.getMinLines() > 1) ? rect.top + this.f2008d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f2008d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1993O != 1 || this.f2008d.getMinLines() > 1) ? rect.bottom - this.f2008d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = eVar.f97c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    eVar.f79M = true;
                }
                eVar.h(false);
                if (!e() || this.f2039u0) {
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
        boolean z2 = this.f1981B0;
        q qVar = this.f2006c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1981B0 = true;
        }
        if (this.f2036t != null && (editText = this.f2008d) != null) {
            this.f2036t.setGravity(editText.getGravity());
            this.f2036t.setPadding(this.f2008d.getCompoundPaddingLeft(), this.f2008d.getCompoundPaddingTop(), this.f2008d.getCompoundPaddingRight(), this.f2008d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f735a);
        setError(f2.f528c);
        if (f2.f529d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1991M) {
            c cVar = this.f1990L.f308e;
            RectF rectF = this.f2003a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1990L.f309f.a(rectF);
            float a4 = this.f1990L.h.a(rectF);
            float a5 = this.f1990L.f310g.a(rectF);
            k kVar = this.f1990L;
            l lVar = kVar.f304a;
            l lVar2 = kVar.f305b;
            l lVar3 = kVar.f307d;
            l lVar4 = kVar.f306c;
            H0.e eVar = new H0.e(0);
            H0.e eVar2 = new H0.e(0);
            H0.e eVar3 = new H0.e(0);
            H0.e eVar4 = new H0.e(0);
            j.b(lVar2);
            j.b(lVar);
            j.b(lVar4);
            j.b(lVar3);
            H0.a aVar = new H0.a(a3);
            H0.a aVar2 = new H0.a(a2);
            H0.a aVar3 = new H0.a(a5);
            H0.a aVar4 = new H0.a(a4);
            k kVar2 = new k();
            kVar2.f304a = lVar2;
            kVar2.f305b = lVar;
            kVar2.f306c = lVar3;
            kVar2.f307d = lVar4;
            kVar2.f308e = aVar;
            kVar2.f309f = aVar2;
            kVar2.f310g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f311j = eVar2;
            kVar2.f312k = eVar3;
            kVar2.f313l = eVar4;
            this.f1991M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f528c = getError();
        }
        q qVar = this.f2006c;
        f2.f529d = qVar.i != 0 && qVar.f578g.f1939d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1978A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue d02 = l.d0(context, com.fortuneink.neonpad.R.attr.colorControlActivated);
            if (d02 != null) {
                int i = d02.resourceId;
                if (i != 0) {
                    colorStateList2 = d.w(context, i);
                } else {
                    int i2 = d02.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2008d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f2008d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f2026o != null && this.f2023m)) && (colorStateList = this.f1980B) != null) {
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
        if (this.f2008d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            z zVar = this.f2004b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.f2008d.getPaddingLeft();
                if (this.f2007c0 == null || this.f2009d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2007c0 = colorDrawable3;
                    this.f2009d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f2008d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2007c0;
                if (drawable2 != colorDrawable4) {
                    this.f2008d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f2006c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f585p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f586q.getMeasuredWidth() - this.f2008d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f574c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f578g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f2008d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2013f0;
                        if (colorDrawable != null || this.f2015g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2013f0 = colorDrawable5;
                                this.f2015g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2013f0;
                            if (drawable == colorDrawable2) {
                                this.f2016h0 = drawable;
                                this.f2008d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2015g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f2008d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2013f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2013f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.f2008d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2013f0) {
                            this.f2008d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2016h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2013f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f2006c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f586q.getMeasuredWidth() - this.f2008d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f2008d.getCompoundDrawablesRelative();
                colorDrawable = this.f2013f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2013f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2007c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f2008d.getCompoundDrawablesRelative();
            this.f2008d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2007c0 = null;
            z2 = true;
            qVar = this.f2006c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f586q.getMeasuredWidth() - this.f2008d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f2008d.getCompoundDrawablesRelative();
            colorDrawable = this.f2013f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2013f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f2006c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f586q.getMeasuredWidth() - this.f2008d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f2008d.getCompoundDrawablesRelative();
        colorDrawable = this.f2013f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2013f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0257e0 c0257e0;
        EditText editText = this.f2008d;
        if (editText == null || this.f1993O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0277o0.f3417a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0292w.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2023m && (c0257e0 = this.f2026o) != null) {
            mutate.setColorFilter(C0292w.c(c0257e0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f2008d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f2008d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.f1987I || editText.getBackground() == null) && this.f1993O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2008d;
            WeakHashMap weakHashMap = X.f418a;
            editText2.setBackground(editTextBoxBackground);
            this.f1987I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1999U != i) {
            this.f1999U = i;
            this.f2027o0 = i;
            this.f2031q0 = i;
            this.f2033r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2027o0 = defaultColor;
        this.f1999U = defaultColor;
        this.f2029p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2031q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2033r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1993O) {
            return;
        }
        this.f1993O = i;
        if (this.f2008d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1994P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1990L.e();
        c cVar = this.f1990L.f308e;
        l r2 = d.r(i);
        e2.f294a = r2;
        j.b(r2);
        e2.f298e = cVar;
        c cVar2 = this.f1990L.f309f;
        l r3 = d.r(i);
        e2.f295b = r3;
        j.b(r3);
        e2.f299f = cVar2;
        c cVar3 = this.f1990L.h;
        l r4 = d.r(i);
        e2.f297d = r4;
        j.b(r4);
        e2.h = cVar3;
        c cVar4 = this.f1990L.f310g;
        l r5 = d.r(i);
        e2.f296c = r5;
        j.b(r5);
        e2.f300g = cVar4;
        this.f1990L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.m0 != i) {
            this.m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2020k0 = colorStateList.getDefaultColor();
            this.f2035s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2022l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.m0 != colorStateList.getDefaultColor()) {
            this.m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2025n0 != colorStateList) {
            this.f2025n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1996R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1997S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2019k != z2) {
            u uVar = this.f2017j;
            if (z2) {
                C0257e0 c0257e0 = new C0257e0(getContext(), null);
                this.f2026o = c0257e0;
                c0257e0.setId(com.fortuneink.neonpad.R.id.textinput_counter);
                Typeface typeface = this.f2005b0;
                if (typeface != null) {
                    this.f2026o.setTypeface(typeface);
                }
                this.f2026o.setMaxLines(1);
                uVar.a(this.f2026o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2026o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.fortuneink.neonpad.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2026o != null) {
                    EditText editText = this.f2008d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f2026o, 2);
                this.f2026o = null;
            }
            this.f2019k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2021l != i) {
            if (i > 0) {
                this.f2021l = i;
            } else {
                this.f2021l = -1;
            }
            if (!this.f2019k || this.f2026o == null) {
                return;
            }
            EditText editText = this.f2008d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2028p != i) {
            this.f2028p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2047z != colorStateList) {
            this.f2047z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2030q != i) {
            this.f2030q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2045y != colorStateList) {
            this.f2045y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1978A != colorStateList) {
            this.f1978A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1980B != colorStateList) {
            this.f1980B = colorStateList;
            if (m() || (this.f2026o != null && this.f2023m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.i0 = colorStateList;
        this.f2018j0 = colorStateList;
        if (this.f2008d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2006c.f578g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2006c.f578g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f2006c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f578g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f2006c;
        Drawable z2 = i != 0 ? d.z(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f578g;
        checkableImageButton.setImageDrawable(z2);
        if (z2 != null) {
            ColorStateList colorStateList = qVar.f580k;
            PorterDuff.Mode mode = qVar.f581l;
            TextInputLayout textInputLayout = qVar.f572a;
            l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            l.c0(textInputLayout, checkableImageButton, qVar.f580k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f2006c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f582m) {
            qVar.f582m = i;
            CheckableImageButton checkableImageButton = qVar.f578g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f574c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2006c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2006c;
        View.OnLongClickListener onLongClickListener = qVar.f584o;
        CheckableImageButton checkableImageButton = qVar.f578g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2006c;
        qVar.f584o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f578g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f2006c;
        qVar.f583n = scaleType;
        qVar.f578g.setScaleType(scaleType);
        qVar.f574c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2006c;
        if (qVar.f580k != colorStateList) {
            qVar.f580k = colorStateList;
            l.d(qVar.f572a, qVar.f578g, colorStateList, qVar.f581l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2006c;
        if (qVar.f581l != mode) {
            qVar.f581l = mode;
            l.d(qVar.f572a, qVar.f578g, qVar.f580k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2006c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f2017j;
        if (!uVar.f618q) {
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
        uVar.f617p = charSequence;
        uVar.f619r.setText(charSequence);
        int i = uVar.f615n;
        if (i != 1) {
            uVar.f616o = 1;
        }
        uVar.i(i, uVar.f616o, uVar.h(uVar.f619r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f2017j;
        uVar.f621t = i;
        C0257e0 c0257e0 = uVar.f619r;
        if (c0257e0 != null) {
            WeakHashMap weakHashMap = X.f418a;
            c0257e0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f2017j;
        uVar.f620s = charSequence;
        C0257e0 c0257e0 = uVar.f619r;
        if (c0257e0 != null) {
            c0257e0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f2017j;
        if (uVar.f618q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0257e0 c0257e0 = new C0257e0(uVar.f610g, null);
            uVar.f619r = c0257e0;
            c0257e0.setId(com.fortuneink.neonpad.R.id.textinput_error);
            uVar.f619r.setTextAlignment(5);
            Typeface typeface = uVar.f603B;
            if (typeface != null) {
                uVar.f619r.setTypeface(typeface);
            }
            int i = uVar.f622u;
            uVar.f622u = i;
            C0257e0 c0257e02 = uVar.f619r;
            if (c0257e02 != null) {
                textInputLayout.l(c0257e02, i);
            }
            ColorStateList colorStateList = uVar.f623v;
            uVar.f623v = colorStateList;
            C0257e0 c0257e03 = uVar.f619r;
            if (c0257e03 != null && colorStateList != null) {
                c0257e03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f620s;
            uVar.f620s = charSequence;
            C0257e0 c0257e04 = uVar.f619r;
            if (c0257e04 != null) {
                c0257e04.setContentDescription(charSequence);
            }
            int i2 = uVar.f621t;
            uVar.f621t = i2;
            C0257e0 c0257e05 = uVar.f619r;
            if (c0257e05 != null) {
                WeakHashMap weakHashMap = X.f418a;
                c0257e05.setAccessibilityLiveRegion(i2);
            }
            uVar.f619r.setVisibility(4);
            uVar.a(uVar.f619r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f619r, 0);
            uVar.f619r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f618q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f2006c;
        qVar.i(i != 0 ? d.z(qVar.getContext(), i) : null);
        l.c0(qVar.f572a, qVar.f574c, qVar.f575d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2006c;
        CheckableImageButton checkableImageButton = qVar.f574c;
        View.OnLongClickListener onLongClickListener = qVar.f577f;
        checkableImageButton.setOnClickListener(onClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2006c;
        qVar.f577f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f574c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2006c;
        if (qVar.f575d != colorStateList) {
            qVar.f575d = colorStateList;
            l.d(qVar.f572a, qVar.f574c, colorStateList, qVar.f576e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2006c;
        if (qVar.f576e != mode) {
            qVar.f576e = mode;
            l.d(qVar.f572a, qVar.f574c, qVar.f575d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f2017j;
        uVar.f622u = i;
        C0257e0 c0257e0 = uVar.f619r;
        if (c0257e0 != null) {
            uVar.h.l(c0257e0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f2017j;
        uVar.f623v = colorStateList;
        C0257e0 c0257e0 = uVar.f619r;
        if (c0257e0 == null || colorStateList == null) {
            return;
        }
        c0257e0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2043w0 != z2) {
            this.f2043w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f2017j;
        if (isEmpty) {
            if (uVar.f625x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f625x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f624w = charSequence;
        uVar.f626y.setText(charSequence);
        int i = uVar.f615n;
        if (i != 2) {
            uVar.f616o = 2;
        }
        uVar.i(i, uVar.f616o, uVar.h(uVar.f626y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f2017j;
        uVar.f602A = colorStateList;
        C0257e0 c0257e0 = uVar.f626y;
        if (c0257e0 == null || colorStateList == null) {
            return;
        }
        c0257e0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f2017j;
        if (uVar.f625x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0257e0 c0257e0 = new C0257e0(uVar.f610g, null);
            uVar.f626y = c0257e0;
            c0257e0.setId(com.fortuneink.neonpad.R.id.textinput_helper_text);
            uVar.f626y.setTextAlignment(5);
            Typeface typeface = uVar.f603B;
            if (typeface != null) {
                uVar.f626y.setTypeface(typeface);
            }
            uVar.f626y.setVisibility(4);
            uVar.f626y.setAccessibilityLiveRegion(1);
            int i = uVar.f627z;
            uVar.f627z = i;
            C0257e0 c0257e02 = uVar.f626y;
            if (c0257e02 != null) {
                c0257e02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f602A;
            uVar.f602A = colorStateList;
            C0257e0 c0257e03 = uVar.f626y;
            if (c0257e03 != null && colorStateList != null) {
                c0257e03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f626y, 1);
            uVar.f626y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f615n;
            if (i2 == 2) {
                uVar.f616o = 0;
            }
            uVar.i(i2, uVar.f616o, uVar.h(uVar.f626y, ""));
            uVar.g(uVar.f626y, 1);
            uVar.f626y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f625x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f2017j;
        uVar.f627z = i;
        C0257e0 c0257e0 = uVar.f626y;
        if (c0257e0 != null) {
            c0257e0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1982C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1982C) {
            this.f1982C = z2;
            if (z2) {
                CharSequence hint = this.f2008d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1983D)) {
                        setHint(hint);
                    }
                    this.f2008d.setHint((CharSequence) null);
                }
                this.f1984E = true;
            } else {
                this.f1984E = false;
                if (!TextUtils.isEmpty(this.f1983D) && TextUtils.isEmpty(this.f2008d.getHint())) {
                    this.f2008d.setHint(this.f1983D);
                }
                setHintInternal(null);
            }
            if (this.f2008d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        e eVar = this.f2041v0;
        TextInputLayout textInputLayout = eVar.f93a;
        E0.d dVar = new E0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f190j;
        if (colorStateList != null) {
            eVar.f107k = colorStateList;
        }
        float f2 = dVar.f191k;
        if (f2 != 0.0f) {
            eVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f183a;
        if (colorStateList2 != null) {
            eVar.f87U = colorStateList2;
        }
        eVar.f85S = dVar.f187e;
        eVar.f86T = dVar.f188f;
        eVar.f84R = dVar.f189g;
        eVar.f88V = dVar.i;
        E0.a aVar = eVar.f121y;
        if (aVar != null) {
            aVar.i = true;
        }
        B0.d dVar2 = new B0.d(0, eVar);
        dVar.a();
        eVar.f121y = new E0.a(dVar2, dVar.f194n);
        dVar.c(textInputLayout.getContext(), eVar.f121y);
        eVar.h(false);
        this.f2018j0 = eVar.f107k;
        if (this.f2008d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2018j0 != colorStateList) {
            if (this.i0 == null) {
                e eVar = this.f2041v0;
                if (eVar.f107k != colorStateList) {
                    eVar.f107k = colorStateList;
                    eVar.h(false);
                }
            }
            this.f2018j0 = colorStateList;
            if (this.f2008d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f2024n = e2;
    }

    public void setMaxEms(int i) {
        this.f2014g = i;
        EditText editText = this.f2008d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.f2008d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2012f = i;
        EditText editText = this.f2008d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.f2008d;
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
        q qVar = this.f2006c;
        qVar.f578g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f2006c;
        qVar.f578g.setImageDrawable(i != 0 ? d.z(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f2006c;
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
        q qVar = this.f2006c;
        qVar.f580k = colorStateList;
        l.d(qVar.f572a, qVar.f578g, colorStateList, qVar.f581l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2006c;
        qVar.f581l = mode;
        l.d(qVar.f572a, qVar.f578g, qVar.f580k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2036t == null) {
            C0257e0 c0257e0 = new C0257e0(getContext(), null);
            this.f2036t = c0257e0;
            c0257e0.setId(com.fortuneink.neonpad.R.id.textinput_placeholder);
            this.f2036t.setImportantForAccessibility(2);
            h d2 = d();
            this.f2042w = d2;
            d2.f2931b = 67L;
            this.f2044x = d();
            setPlaceholderTextAppearance(this.f2040v);
            setPlaceholderTextColor(this.f2038u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2034s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2032r = charSequence;
        }
        EditText editText = this.f2008d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2040v = i;
        C0257e0 c0257e0 = this.f2036t;
        if (c0257e0 != null) {
            c0257e0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2038u != colorStateList) {
            this.f2038u = colorStateList;
            C0257e0 c0257e0 = this.f2036t;
            if (c0257e0 == null || colorStateList == null) {
                return;
            }
            c0257e0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f2004b;
        zVar.getClass();
        zVar.f644c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f643b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2004b.f643b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2004b.f643b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f273a.f258a == kVar) {
            return;
        }
        this.f1990L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2004b.f645d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2004b.f645d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? d.z(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f2004b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f648g) {
            zVar.f648g = i;
            CheckableImageButton checkableImageButton = zVar.f645d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f2004b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.f645d;
        checkableImageButton.setOnClickListener(onClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f2004b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f645d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f2004b;
        zVar.h = scaleType;
        zVar.f645d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f2004b;
        if (zVar.f646e != colorStateList) {
            zVar.f646e = colorStateList;
            l.d(zVar.f642a, zVar.f645d, colorStateList, zVar.f647f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f2004b;
        if (zVar.f647f != mode) {
            zVar.f647f = mode;
            l.d(zVar.f642a, zVar.f645d, zVar.f646e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2004b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f2006c;
        qVar.getClass();
        qVar.f585p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f586q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2006c.f586q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2006c.f586q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d2) {
        EditText editText = this.f2008d;
        if (editText != null) {
            X.l(editText, d2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2005b0) {
            this.f2005b0 = typeface;
            this.f2041v0.m(typeface);
            u uVar = this.f2017j;
            if (typeface != uVar.f603B) {
                uVar.f603B = typeface;
                C0257e0 c0257e0 = uVar.f619r;
                if (c0257e0 != null) {
                    c0257e0.setTypeface(typeface);
                }
                C0257e0 c0257e02 = uVar.f626y;
                if (c0257e02 != null) {
                    c0257e02.setTypeface(typeface);
                }
            }
            C0257e0 c0257e03 = this.f2026o;
            if (c0257e03 != null) {
                c0257e03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1993O != 1) {
            FrameLayout frameLayout = this.f2002a;
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
        C0257e0 c0257e0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2008d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2008d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.i0;
        e eVar = this.f2041v0;
        if (colorStateList2 != null) {
            eVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.i0;
            eVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2035s0) : this.f2035s0));
        } else if (m()) {
            C0257e0 c0257e02 = this.f2017j.f619r;
            eVar.i(c0257e02 != null ? c0257e02.getTextColors() : null);
        } else if (this.f2023m && (c0257e0 = this.f2026o) != null) {
            eVar.i(c0257e0.getTextColors());
        } else if (z5 && (colorStateList = this.f2018j0) != null && eVar.f107k != colorStateList) {
            eVar.f107k = colorStateList;
            eVar.h(false);
        }
        q qVar = this.f2006c;
        z zVar = this.f2004b;
        if (z4 || !this.f2043w0 || (isEnabled() && z5)) {
            if (z3 || this.f2039u0) {
                ValueAnimator valueAnimator = this.f2046y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2046y0.cancel();
                }
                if (z2 && this.x0) {
                    a(1.0f);
                } else {
                    eVar.k(1.0f);
                }
                this.f2039u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f2008d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f649j = false;
                zVar.e();
                qVar.f587r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2039u0) {
            ValueAnimator valueAnimator2 = this.f2046y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2046y0.cancel();
            }
            if (z2 && this.x0) {
                a(0.0f);
            } else {
                eVar.k(0.0f);
            }
            if (e() && !((K0.h) this.F).f548x.f546q.isEmpty() && e()) {
                ((K0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2039u0 = true;
            C0257e0 c0257e03 = this.f2036t;
            if (c0257e03 != null && this.f2034s) {
                c0257e03.setText((CharSequence) null);
                j0.q.a(this.f2002a, this.f2044x);
                this.f2036t.setVisibility(4);
            }
            zVar.f649j = true;
            zVar.e();
            qVar.f587r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0011g) this.f2024n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2002a;
        if (length != 0 || this.f2039u0) {
            C0257e0 c0257e0 = this.f2036t;
            if (c0257e0 == null || !this.f2034s) {
                return;
            }
            c0257e0.setText((CharSequence) null);
            j0.q.a(frameLayout, this.f2044x);
            this.f2036t.setVisibility(4);
            return;
        }
        if (this.f2036t == null || !this.f2034s || TextUtils.isEmpty(this.f2032r)) {
            return;
        }
        this.f2036t.setText(this.f2032r);
        j0.q.a(frameLayout, this.f2042w);
        this.f2036t.setVisibility(0);
        this.f2036t.bringToFront();
        announceForAccessibility(this.f2032r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2025n0.getDefaultColor();
        int colorForState = this.f2025n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2025n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1998T = colorForState2;
        } else if (z3) {
            this.f1998T = colorForState;
        } else {
            this.f1998T = defaultColor;
        }
    }

    public final void x() {
        C0257e0 c0257e0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1993O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2008d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2008d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1998T = this.f2035s0;
        } else if (m()) {
            if (this.f2025n0 != null) {
                w(z3, z2);
            } else {
                this.f1998T = getErrorCurrentTextColors();
            }
        } else if (!this.f2023m || (c0257e0 = this.f2026o) == null) {
            if (z3) {
                this.f1998T = this.m0;
            } else if (z2) {
                this.f1998T = this.f2022l0;
            } else {
                this.f1998T = this.f2020k0;
            }
        } else if (this.f2025n0 != null) {
            w(z3, z2);
        } else {
            this.f1998T = c0257e0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f2006c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f574c;
        ColorStateList colorStateList = qVar.f575d;
        TextInputLayout textInputLayout = qVar.f572a;
        l.c0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f580k;
        CheckableImageButton checkableImageButton2 = qVar.f578g;
        l.c0(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof K0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                l.d(textInputLayout, checkableImageButton2, qVar.f580k, qVar.f581l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f2004b;
        l.c0(zVar.f642a, zVar.f645d, zVar.f646e);
        if (this.f1993O == 2) {
            int i = this.f1995Q;
            if (z3 && isEnabled()) {
                this.f1995Q = this.f1997S;
            } else {
                this.f1995Q = this.f1996R;
            }
            if (this.f1995Q != i && e() && !this.f2039u0) {
                if (e()) {
                    ((K0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1993O == 1) {
            if (!isEnabled()) {
                this.f1999U = this.f2029p0;
            } else if (z2 && !z3) {
                this.f1999U = this.f2033r0;
            } else if (z3) {
                this.f1999U = this.f2031q0;
            } else {
                this.f1999U = this.f2027o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2004b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2006c.f578g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2006c.f578g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2006c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2006c.f578g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f2006c;
        CheckableImageButton checkableImageButton = qVar.f578g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f580k;
            PorterDuff.Mode mode = qVar.f581l;
            TextInputLayout textInputLayout = qVar.f572a;
            l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            l.c0(textInputLayout, checkableImageButton, qVar.f580k);
        }
    }
}
