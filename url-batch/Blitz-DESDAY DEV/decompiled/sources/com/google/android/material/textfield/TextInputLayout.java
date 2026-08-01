package com.google.android.material.textfield;

import A1.j;
import C.b;
import F0.d;
import F0.m;
import L0.c;
import L0.e;
import L0.f;
import L0.g;
import L0.i;
import L0.k;
import M.C0006g;
import M.H;
import M.Q;
import O0.A;
import O0.B;
import O0.C;
import O0.D;
import O0.E;
import O0.F;
import O0.n;
import O0.q;
import O0.t;
import O0.u;
import O0.x;
import O0.z;
import Q0.a;
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
import l.AbstractC0202n0;
import l.C0182d0;
import l.C0214u;
import m0.h;
import q0.AbstractC0257a;
import r0.AbstractC0260a;
import z1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1968C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1969A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1970A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1971B;
    public boolean B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1972C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1973D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1974E;

    /* renamed from: F, reason: collision with root package name */
    public g f1975F;

    /* renamed from: G, reason: collision with root package name */
    public g f1976G;
    public StateListDrawable H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1977I;

    /* renamed from: J, reason: collision with root package name */
    public g f1978J;

    /* renamed from: K, reason: collision with root package name */
    public g f1979K;

    /* renamed from: L, reason: collision with root package name */
    public k f1980L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1981M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1982N;

    /* renamed from: O, reason: collision with root package name */
    public int f1983O;

    /* renamed from: P, reason: collision with root package name */
    public int f1984P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1985Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1986R;

    /* renamed from: S, reason: collision with root package name */
    public int f1987S;

    /* renamed from: T, reason: collision with root package name */
    public int f1988T;

    /* renamed from: U, reason: collision with root package name */
    public int f1989U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1990V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1991W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1992a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1993a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1994b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1995b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1996c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1997c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1998d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1999e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2000e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2001f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2002f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2003g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2004g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2005h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2006i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f2007j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2008j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2009k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2010k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2011l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2012l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2013m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2014m0;

    /* renamed from: n, reason: collision with root package name */
    public E f2015n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2016n0;

    /* renamed from: o, reason: collision with root package name */
    public C0182d0 f2017o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2018o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2019p;
    public int p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2020q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2021q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2022r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2023r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2024s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2025s0;

    /* renamed from: t, reason: collision with root package name */
    public C0182d0 f2026t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2027t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2028u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2029u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2030v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f2031v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2032w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2033w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2034x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2035x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2036y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2037y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2038z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2039z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winfour.neondrop.R.attr.textInputStyle, com.winfour.neondrop.R.style.Widget_Design_TextInputLayout), attributeSet, com.winfour.neondrop.R.attr.textInputStyle);
        this.f2001f = -1;
        this.f2003g = -1;
        this.h = -1;
        this.i = -1;
        this.f2007j = new u(this);
        this.f2015n = new C0006g(2);
        this.f1990V = new Rect();
        this.f1991W = new Rect();
        this.f1993a0 = new RectF();
        this.f2000e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f2031v0 = dVar;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1992a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0260a.f3420a;
        dVar.f256Q = linearInterpolator;
        dVar.h(false);
        dVar.f255P = linearInterpolator;
        dVar.h(false);
        if (dVar.f277g != 8388659) {
            dVar.f277g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0257a.f3378C;
        m.a(context2, attributeSet, com.winfour.neondrop.R.attr.textInputStyle, com.winfour.neondrop.R.style.Widget_Design_TextInputLayout);
        m.b(context2, attributeSet, iArr, com.winfour.neondrop.R.attr.textInputStyle, com.winfour.neondrop.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winfour.neondrop.R.attr.textInputStyle, com.winfour.neondrop.R.style.Widget_Design_TextInputLayout);
        j jVar = new j(context2, obtainStyledAttributes);
        z zVar = new z(this, jVar);
        this.f1994b = zVar;
        this.f1972C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2035x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2033w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1980L = k.b(context2, attributeSet, com.winfour.neondrop.R.attr.textInputStyle, com.winfour.neondrop.R.style.Widget_Design_TextInputLayout).a();
        this.f1982N = context2.getResources().getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1984P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1986R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1987S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1985Q = this.f1986R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        L0.j e2 = this.f1980L.e();
        if (dimension >= 0.0f) {
            e2.f456e = new L0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f457f = new L0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f458g = new L0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new L0.a(dimension4);
        }
        this.f1980L = e2.a();
        ColorStateList u2 = z1.d.u(context2, jVar, 7);
        if (u2 != null) {
            int defaultColor = u2.getDefaultColor();
            this.f2018o0 = defaultColor;
            this.f1989U = defaultColor;
            if (u2.isStateful()) {
                this.p0 = u2.getColorForState(new int[]{-16842910}, -1);
                this.f2021q0 = u2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2023r0 = u2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2021q0 = this.f2018o0;
                ColorStateList D2 = l.D(context2, com.winfour.neondrop.R.color.mtrl_filled_background_color);
                this.p0 = D2.getColorForState(new int[]{-16842910}, -1);
                this.f2023r0 = D2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1989U = 0;
            this.f2018o0 = 0;
            this.p0 = 0;
            this.f2021q0 = 0;
            this.f2023r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList i = jVar.i(1);
            this.f2008j0 = i;
            this.f2006i0 = i;
        }
        ColorStateList u3 = z1.d.u(context2, jVar, 14);
        this.f2014m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2010k0 = b.a(context2, com.winfour.neondrop.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2025s0 = b.a(context2, com.winfour.neondrop.R.color.mtrl_textinput_disabled_color);
        this.f2012l0 = b.a(context2, com.winfour.neondrop.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (u3 != null) {
            setBoxStrokeColorStateList(u3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(z1.d.u(context2, jVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1969A = jVar.i(24);
        this.f1971B = jVar.i(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i2 = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f2020q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2019p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f2019p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2020q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(jVar.i(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(jVar.i(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(jVar.i(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(jVar.i(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(jVar.i(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(jVar.i(58));
        }
        q qVar = new q(this, jVar);
        this.f1996c = qVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        jVar.v();
        setImportantForAccessibility(2);
        H.m(this, 1);
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
        if (!(editText instanceof AutoCompleteTextView) || l.V(editText)) {
            return this.f1975F;
        }
        int t2 = z1.d.t(this.d, com.winfour.neondrop.R.attr.colorControlHighlight);
        int i = this.f1983O;
        int[][] iArr = f1968C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f1975F;
            int i2 = this.f1989U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{z1.d.I(t2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f1975F;
        TypedValue o02 = l.o0(context, com.winfour.neondrop.R.attr.colorSurface, "TextInputLayout");
        int i3 = o02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : o02.data;
        g gVar3 = new g(gVar2.f433a.f419a);
        int I2 = z1.d.I(t2, a2, 0.1f);
        gVar3.l(new ColorStateList(iArr, new int[]{I2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I2, a2});
        g gVar4 = new g(gVar2.f433a.f419a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], f(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1976G == null) {
            this.f1976G = f(true);
        }
        return this.f1976G;
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
        int i = this.f2001f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2003g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1977I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f2031v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f262W != letterSpacing) {
            dVar.f262W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f277g != i4) {
            dVar.f277g = i4;
            dVar.h(false);
        }
        if (dVar.f275f != gravity) {
            dVar.f275f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = Q.f513a;
        this.f2027t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f2006i0 == null) {
            this.f2006i0 = this.d.getHintTextColors();
        }
        if (this.f1972C) {
            if (TextUtils.isEmpty(this.f1973D)) {
                CharSequence hint = this.d.getHint();
                this.f1999e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1974E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2017o != null) {
            n(this.d.getText());
        }
        r();
        this.f2007j.b();
        this.f1994b.bringToFront();
        q qVar = this.f1996c;
        qVar.bringToFront();
        Iterator it = this.f2000e0.iterator();
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
        if (TextUtils.equals(charSequence, this.f1973D)) {
            return;
        }
        this.f1973D = charSequence;
        d dVar = this.f2031v0;
        if (charSequence == null || !TextUtils.equals(dVar.f241A, charSequence)) {
            dVar.f241A = charSequence;
            dVar.f242B = null;
            Bitmap bitmap = dVar.f245E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f245E = null;
            }
            dVar.h(false);
        }
        if (this.f2029u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2024s == z2) {
            return;
        }
        if (z2) {
            C0182d0 c0182d0 = this.f2026t;
            if (c0182d0 != null) {
                this.f1992a.addView(c0182d0);
                this.f2026t.setVisibility(0);
            }
        } else {
            C0182d0 c0182d02 = this.f2026t;
            if (c0182d02 != null) {
                c0182d02.setVisibility(8);
            }
            this.f2026t = null;
        }
        this.f2024s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f2031v0;
        if (dVar.f268b == f2) {
            return;
        }
        if (this.f2037y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2037y0 = valueAnimator;
            valueAnimator.setInterpolator(l.n0(getContext(), com.winfour.neondrop.R.attr.motionEasingEmphasizedInterpolator, AbstractC0260a.f3421b));
            this.f2037y0.setDuration(l.m0(getContext(), com.winfour.neondrop.R.attr.motionDurationMedium4, 167));
            this.f2037y0.addUpdateListener(new C(i, this));
        }
        this.f2037y0.setFloatValues(dVar.f268b, f2);
        this.f2037y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1992a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.f1975F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f433a.f419a;
        k kVar2 = this.f1980L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1983O == 2 && (i = this.f1985Q) > -1 && (i2 = this.f1988T) != 0) {
            g gVar2 = this.f1975F;
            gVar2.f433a.f425j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f433a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1989U;
        if (this.f1983O == 1) {
            i3 = E.a.b(this.f1989U, z1.d.s(getContext(), com.winfour.neondrop.R.attr.colorSurface, 0));
        }
        this.f1989U = i3;
        this.f1975F.l(ColorStateList.valueOf(i3));
        g gVar3 = this.f1978J;
        if (gVar3 != null && this.f1979K != null) {
            if (this.f1985Q > -1 && this.f1988T != 0) {
                gVar3.l(this.d.isFocused() ? ColorStateList.valueOf(this.f2010k0) : ColorStateList.valueOf(this.f1988T));
                this.f1979K.l(ColorStateList.valueOf(this.f1988T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1972C) {
            return 0;
        }
        int i = this.f1983O;
        d dVar = this.f2031v0;
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

    public final h d() {
        h hVar = new h();
        hVar.f3174c = l.m0(getContext(), com.winfour.neondrop.R.attr.motionDurationShort2, 87);
        hVar.d = l.n0(getContext(), com.winfour.neondrop.R.attr.motionEasingLinearInterpolator, AbstractC0260a.f3420a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1999e != null) {
            boolean z2 = this.f1974E;
            this.f1974E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1999e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1974E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1992a;
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
        this.f1970A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1970A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1972C;
        d dVar = this.f2031v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f242B != null) {
                RectF rectF = dVar.f273e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = dVar.f253N;
                    textPaint.setTextSize(dVar.f247G);
                    float f2 = dVar.f284p;
                    float f3 = dVar.f285q;
                    float f4 = dVar.f246F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f272d0 <= 1 || dVar.f243C) {
                        canvas.translate(f2, f3);
                        dVar.f264Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f284p - dVar.f264Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f269b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.H;
                            float f7 = dVar.f248I;
                            float f8 = dVar.f249J;
                            int i3 = dVar.f250K;
                            textPaint.setShadowLayer(f6, f7, f8, E.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f264Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f267a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.H;
                            float f10 = dVar.f248I;
                            float f11 = dVar.f249J;
                            int i4 = dVar.f250K;
                            textPaint.setShadowLayer(f9, f10, f11, E.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f264Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f271c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.H, dVar.f248I, dVar.f249J, dVar.f250K);
                        }
                        String trim = dVar.f271c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f264Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1979K == null || (gVar = this.f1978J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1979K.getBounds();
            Rect bounds2 = this.f1978J.getBounds();
            float f13 = dVar.f268b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0260a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0260a.c(centerX, bounds2.right, f13);
            this.f1979K.draw(canvas);
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
        if (this.f2039z0) {
            return;
        }
        this.f2039z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f2031v0;
        if (dVar != null) {
            dVar.f251L = drawableState;
            ColorStateList colorStateList2 = dVar.f279k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f278j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = Q.f513a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2039z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2039z0 = false;
    }

    public final boolean e() {
        return this.f1972C && !TextUtils.isEmpty(this.f1973D) && (this.f1975F instanceof O0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.winfour.neondrop.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        L0.a aVar = new L0.a(f2);
        L0.a aVar2 = new L0.a(f2);
        L0.a aVar3 = new L0.a(dimensionPixelOffset);
        L0.a aVar4 = new L0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f462a = iVar;
        kVar.f463b = iVar2;
        kVar.f464c = iVar3;
        kVar.d = iVar4;
        kVar.f465e = aVar;
        kVar.f466f = aVar2;
        kVar.f467g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f468j = eVar2;
        kVar.f469k = eVar3;
        kVar.f470l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f432w;
            TypedValue o02 = l.o0(context, com.winfour.neondrop.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = o02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : o02.data);
        }
        g gVar = new g();
        gVar.i(context);
        gVar.l(dropDownBackgroundTintList);
        gVar.k(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f433a;
        if (fVar.f424g == null) {
            fVar.f424g = new Rect();
        }
        gVar.f433a.f424g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1996c.c() : this.f1994b.a()) + i;
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
        int i = this.f1983O;
        if (i == 1 || i == 2) {
            return this.f1975F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1989U;
    }

    public int getBoxBackgroundMode() {
        return this.f1983O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1984P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1993a0;
        return e2 ? this.f1980L.h.a(rectF) : this.f1980L.f467g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1993a0;
        return e2 ? this.f1980L.f467g.a(rectF) : this.f1980L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1993a0;
        return e2 ? this.f1980L.f465e.a(rectF) : this.f1980L.f466f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1993a0;
        return e2 ? this.f1980L.f466f.a(rectF) : this.f1980L.f465e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2014m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2016n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1986R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1987S;
    }

    public int getCounterMaxLength() {
        return this.f2011l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0182d0 c0182d0;
        if (this.f2009k && this.f2013m && (c0182d0 = this.f2017o) != null) {
            return c0182d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2038z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2036y;
    }

    public ColorStateList getCursorColor() {
        return this.f1969A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1971B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2006i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1996c.f696g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1996c.f696g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1996c.f700m;
    }

    public int getEndIconMode() {
        return this.f1996c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1996c.f701n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1996c.f696g;
    }

    public CharSequence getError() {
        u uVar = this.f2007j;
        if (uVar.f733q) {
            return uVar.f732p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2007j.f736t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2007j.f735s;
    }

    public int getErrorCurrentTextColors() {
        C0182d0 c0182d0 = this.f2007j.f734r;
        if (c0182d0 != null) {
            return c0182d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1996c.f693c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f2007j;
        if (uVar.f740x) {
            return uVar.f739w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0182d0 c0182d0 = this.f2007j.f741y;
        if (c0182d0 != null) {
            return c0182d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1972C) {
            return this.f1973D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2031v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f2031v0;
        return dVar.e(dVar.f279k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2008j0;
    }

    public E getLengthCounter() {
        return this.f2015n;
    }

    public int getMaxEms() {
        return this.f2003g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2001f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1996c.f696g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1996c.f696g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2024s) {
            return this.f2022r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2030v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2028u;
    }

    public CharSequence getPrefixText() {
        return this.f1994b.f759c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1994b.f758b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1994b.f758b;
    }

    public k getShapeAppearanceModel() {
        return this.f1980L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1994b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1994b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1994b.f762g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1994b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1996c.f703p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1996c.f704q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1996c.f704q;
    }

    public Typeface getTypeface() {
        return this.f1995b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1994b.a() : this.f1996c.c());
    }

    public final void i() {
        int i = this.f1983O;
        if (i == 0) {
            this.f1975F = null;
            this.f1978J = null;
            this.f1979K = null;
        } else if (i == 1) {
            this.f1975F = new g(this.f1980L);
            this.f1978J = new g();
            this.f1979K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1983O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1972C || (this.f1975F instanceof O0.h)) {
                this.f1975F = new g(this.f1980L);
            } else {
                k kVar = this.f1980L;
                int i2 = O0.h.f667y;
                if (kVar == null) {
                    kVar = new k();
                }
                O0.g gVar = new O0.g(kVar, new RectF());
                O0.h hVar = new O0.h(gVar);
                hVar.f668x = gVar;
                this.f1975F = hVar;
            }
            this.f1978J = null;
            this.f1979K = null;
        }
        s();
        x();
        if (this.f1983O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1984P = getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (z1.d.G(getContext())) {
                this.f1984P = getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1983O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = Q.f513a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (z1.d.G(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = Q.f513a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1983O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1983O;
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
            d dVar = this.f2031v0;
            boolean b2 = dVar.b(dVar.f241A);
            dVar.f243C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f265Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f265Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1993a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f265Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f243C) {
                        f5 = max + dVar.f265Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f243C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f265Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1982N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1985Q);
                O0.h hVar = (O0.h) this.f1975F;
                hVar.getClass();
                hVar.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f265Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1993a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f265Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0182d0 c0182d0, int i) {
        try {
            c0182d0.setTextAppearance(i);
            if (c0182d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0182d0.setTextAppearance(com.winfour.neondrop.R.style.TextAppearance_AppCompat_Caption);
        c0182d0.setTextColor(b.a(getContext(), com.winfour.neondrop.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f2007j;
        return (uVar.f731o != 1 || uVar.f734r == null || TextUtils.isEmpty(uVar.f732p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0006g) this.f2015n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2013m;
        int i = this.f2011l;
        String str = null;
        if (i == -1) {
            this.f2017o.setText(String.valueOf(length));
            this.f2017o.setContentDescription(null);
            this.f2013m = false;
        } else {
            this.f2013m = length > i;
            Context context = getContext();
            this.f2017o.setContentDescription(context.getString(this.f2013m ? com.winfour.neondrop.R.string.character_counter_overflowed_content_description : com.winfour.neondrop.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2011l)));
            if (z2 != this.f2013m) {
                o();
            }
            String str2 = K.b.f389b;
            K.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? K.b.f391e : K.b.d;
            C0182d0 c0182d0 = this.f2017o;
            String string = getContext().getString(com.winfour.neondrop.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2011l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                K.g gVar = K.h.f399a;
                str = bVar.c(string).toString();
            }
            c0182d0.setText(str);
        }
        if (this.d == null || z2 == this.f2013m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0182d0 c0182d0 = this.f2017o;
        if (c0182d0 != null) {
            l(c0182d0, this.f2013m ? this.f2019p : this.f2020q);
            if (!this.f2013m && (colorStateList2 = this.f2036y) != null) {
                this.f2017o.setTextColor(colorStateList2);
            }
            if (!this.f2013m || (colorStateList = this.f2038z) == null) {
                return;
            }
            this.f2017o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2031v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1996c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1994b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new B.a(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = F0.e.f295a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1990V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = F0.e.f295a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            F0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = F0.e.f296b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1978J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1986R, rect.right, i5);
            }
            g gVar2 = this.f1979K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1987S, rect.right, i6);
            }
            if (this.f1972C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f2031v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f277g != i7) {
                    dVar.f277g = i7;
                    dVar.h(false);
                }
                if (dVar.f275f != gravity) {
                    dVar.f275f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = m.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1991W;
                rect2.bottom = i8;
                int i9 = this.f1983O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1984P;
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
                    dVar.f252M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f254O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f289u);
                textPaint.setLetterSpacing(dVar.f262W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1983O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1983O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f270c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f252M = true;
                }
                dVar.h(false);
                if (!e() || this.f2029u0) {
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
        boolean z2 = this.B0;
        q qVar = this.f1996c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        if (this.f2026t != null && (editText = this.d) != null) {
            this.f2026t.setGravity(editText.getGravity());
            this.f2026t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f802a);
        setError(f2.f649c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1981M) {
            c cVar = this.f1980L.f465e;
            RectF rectF = this.f1993a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1980L.f466f.a(rectF);
            float a4 = this.f1980L.h.a(rectF);
            float a5 = this.f1980L.f467g.a(rectF);
            k kVar = this.f1980L;
            z1.d dVar = kVar.f462a;
            z1.d dVar2 = kVar.f463b;
            z1.d dVar3 = kVar.d;
            z1.d dVar4 = kVar.f464c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            L0.j.b(dVar2);
            L0.j.b(dVar);
            L0.j.b(dVar4);
            L0.j.b(dVar3);
            L0.a aVar = new L0.a(a3);
            L0.a aVar2 = new L0.a(a2);
            L0.a aVar3 = new L0.a(a5);
            L0.a aVar4 = new L0.a(a4);
            k kVar2 = new k();
            kVar2.f462a = dVar2;
            kVar2.f463b = dVar;
            kVar2.f464c = dVar3;
            kVar2.d = dVar4;
            kVar2.f465e = aVar;
            kVar2.f466f = aVar2;
            kVar2.f467g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f468j = eVar2;
            kVar2.f469k = eVar3;
            kVar2.f470l = eVar4;
            this.f1981M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f649c = getError();
        }
        q qVar = this.f1996c;
        f2.d = qVar.i != 0 && qVar.f696g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1969A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue k02 = l.k0(context, com.winfour.neondrop.R.attr.colorControlActivated);
            if (k02 != null) {
                int i = k02.resourceId;
                if (i != 0) {
                    colorStateList2 = l.D(context, i);
                } else {
                    int i2 = k02.data;
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
            if ((m() || (this.f2017o != null && this.f2013m)) && (colorStateList = this.f1971B) != null) {
                colorStateList2 = colorStateList;
            }
            F.a.h(mutate, colorStateList2);
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
            z zVar = this.f1994b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1997c0 == null || this.f1998d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1997c0 = colorDrawable3;
                    this.f1998d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1997c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1996c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f703p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f704q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f693c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f696g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2002f0;
                        if (colorDrawable != null || this.f2004g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2002f0 = colorDrawable5;
                                this.f2004g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2002f0;
                            if (drawable == colorDrawable2) {
                                this.f2005h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2004g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2002f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2002f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2002f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2005h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2002f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1996c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f704q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f2002f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2002f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1997c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1997c0 = null;
            z2 = true;
            qVar = this.f1996c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f704q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f2002f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2002f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1996c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f704q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f2002f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2002f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0182d0 c0182d0;
        EditText editText = this.d;
        if (editText == null || this.f1983O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0202n0.f3038a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0214u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2013m && (c0182d0 = this.f2017o) != null) {
            mutate.setColorFilter(C0214u.c(c0182d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.f1975F == null) {
            return;
        }
        if ((this.f1977I || editText.getBackground() == null) && this.f1983O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = Q.f513a;
            editText2.setBackground(editTextBoxBackground);
            this.f1977I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1989U != i) {
            this.f1989U = i;
            this.f2018o0 = i;
            this.f2021q0 = i;
            this.f2023r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2018o0 = defaultColor;
        this.f1989U = defaultColor;
        this.p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2021q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2023r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1983O) {
            return;
        }
        this.f1983O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1984P = i;
    }

    public void setBoxCornerFamily(int i) {
        L0.j e2 = this.f1980L.e();
        c cVar = this.f1980L.f465e;
        z1.d A2 = l.A(i);
        e2.f453a = A2;
        L0.j.b(A2);
        e2.f456e = cVar;
        c cVar2 = this.f1980L.f466f;
        z1.d A3 = l.A(i);
        e2.f454b = A3;
        L0.j.b(A3);
        e2.f457f = cVar2;
        c cVar3 = this.f1980L.h;
        z1.d A4 = l.A(i);
        e2.d = A4;
        L0.j.b(A4);
        e2.h = cVar3;
        c cVar4 = this.f1980L.f467g;
        z1.d A5 = l.A(i);
        e2.f455c = A5;
        L0.j.b(A5);
        e2.f458g = cVar4;
        this.f1980L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2014m0 != i) {
            this.f2014m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2010k0 = colorStateList.getDefaultColor();
            this.f2025s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2012l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2014m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2014m0 != colorStateList.getDefaultColor()) {
            this.f2014m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2016n0 != colorStateList) {
            this.f2016n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1986R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1987S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2009k != z2) {
            u uVar = this.f2007j;
            if (z2) {
                C0182d0 c0182d0 = new C0182d0(getContext(), null);
                this.f2017o = c0182d0;
                c0182d0.setId(com.winfour.neondrop.R.id.textinput_counter);
                Typeface typeface = this.f1995b0;
                if (typeface != null) {
                    this.f2017o.setTypeface(typeface);
                }
                this.f2017o.setMaxLines(1);
                uVar.a(this.f2017o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2017o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.winfour.neondrop.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2017o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f2017o, 2);
                this.f2017o = null;
            }
            this.f2009k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2011l != i) {
            if (i > 0) {
                this.f2011l = i;
            } else {
                this.f2011l = -1;
            }
            if (!this.f2009k || this.f2017o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2019p != i) {
            this.f2019p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2038z != colorStateList) {
            this.f2038z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2020q != i) {
            this.f2020q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2036y != colorStateList) {
            this.f2036y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1969A != colorStateList) {
            this.f1969A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1971B != colorStateList) {
            this.f1971B = colorStateList;
            if (m() || (this.f2017o != null && this.f2013m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2006i0 = colorStateList;
        this.f2008j0 = colorStateList;
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
        this.f1996c.f696g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1996c.f696g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1996c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f696g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1996c;
        Drawable F2 = i != 0 ? l.F(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f696g;
        checkableImageButton.setImageDrawable(F2);
        if (F2 != null) {
            ColorStateList colorStateList = qVar.f698k;
            PorterDuff.Mode mode = qVar.f699l;
            TextInputLayout textInputLayout = qVar.f691a;
            z1.d.a(textInputLayout, checkableImageButton, colorStateList, mode);
            z1.d.R(textInputLayout, checkableImageButton, qVar.f698k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1996c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f700m) {
            qVar.f700m = i;
            CheckableImageButton checkableImageButton = qVar.f696g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f693c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1996c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1996c;
        View.OnLongClickListener onLongClickListener = qVar.f702o;
        CheckableImageButton checkableImageButton = qVar.f696g;
        checkableImageButton.setOnClickListener(onClickListener);
        z1.d.a0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1996c;
        qVar.f702o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f696g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        z1.d.a0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1996c;
        qVar.f701n = scaleType;
        qVar.f696g.setScaleType(scaleType);
        qVar.f693c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1996c;
        if (qVar.f698k != colorStateList) {
            qVar.f698k = colorStateList;
            z1.d.a(qVar.f691a, qVar.f696g, colorStateList, qVar.f699l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1996c;
        if (qVar.f699l != mode) {
            qVar.f699l = mode;
            z1.d.a(qVar.f691a, qVar.f696g, qVar.f698k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1996c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f2007j;
        if (!uVar.f733q) {
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
        uVar.f732p = charSequence;
        uVar.f734r.setText(charSequence);
        int i = uVar.f730n;
        if (i != 1) {
            uVar.f731o = 1;
        }
        uVar.i(i, uVar.f731o, uVar.h(uVar.f734r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f2007j;
        uVar.f736t = i;
        C0182d0 c0182d0 = uVar.f734r;
        if (c0182d0 != null) {
            WeakHashMap weakHashMap = Q.f513a;
            c0182d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f2007j;
        uVar.f735s = charSequence;
        C0182d0 c0182d0 = uVar.f734r;
        if (c0182d0 != null) {
            c0182d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f2007j;
        if (uVar.f733q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0182d0 c0182d0 = new C0182d0(uVar.f725g, null);
            uVar.f734r = c0182d0;
            c0182d0.setId(com.winfour.neondrop.R.id.textinput_error);
            uVar.f734r.setTextAlignment(5);
            Typeface typeface = uVar.f719B;
            if (typeface != null) {
                uVar.f734r.setTypeface(typeface);
            }
            int i = uVar.f737u;
            uVar.f737u = i;
            C0182d0 c0182d02 = uVar.f734r;
            if (c0182d02 != null) {
                textInputLayout.l(c0182d02, i);
            }
            ColorStateList colorStateList = uVar.f738v;
            uVar.f738v = colorStateList;
            C0182d0 c0182d03 = uVar.f734r;
            if (c0182d03 != null && colorStateList != null) {
                c0182d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f735s;
            uVar.f735s = charSequence;
            C0182d0 c0182d04 = uVar.f734r;
            if (c0182d04 != null) {
                c0182d04.setContentDescription(charSequence);
            }
            int i2 = uVar.f736t;
            uVar.f736t = i2;
            C0182d0 c0182d05 = uVar.f734r;
            if (c0182d05 != null) {
                WeakHashMap weakHashMap = Q.f513a;
                c0182d05.setAccessibilityLiveRegion(i2);
            }
            uVar.f734r.setVisibility(4);
            uVar.a(uVar.f734r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f734r, 0);
            uVar.f734r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f733q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1996c;
        qVar.i(i != 0 ? l.F(qVar.getContext(), i) : null);
        z1.d.R(qVar.f691a, qVar.f693c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1996c;
        CheckableImageButton checkableImageButton = qVar.f693c;
        View.OnLongClickListener onLongClickListener = qVar.f695f;
        checkableImageButton.setOnClickListener(onClickListener);
        z1.d.a0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1996c;
        qVar.f695f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f693c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        z1.d.a0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1996c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            z1.d.a(qVar.f691a, qVar.f693c, colorStateList, qVar.f694e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1996c;
        if (qVar.f694e != mode) {
            qVar.f694e = mode;
            z1.d.a(qVar.f691a, qVar.f693c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f2007j;
        uVar.f737u = i;
        C0182d0 c0182d0 = uVar.f734r;
        if (c0182d0 != null) {
            uVar.h.l(c0182d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f2007j;
        uVar.f738v = colorStateList;
        C0182d0 c0182d0 = uVar.f734r;
        if (c0182d0 == null || colorStateList == null) {
            return;
        }
        c0182d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2033w0 != z2) {
            this.f2033w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f2007j;
        if (isEmpty) {
            if (uVar.f740x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f740x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f739w = charSequence;
        uVar.f741y.setText(charSequence);
        int i = uVar.f730n;
        if (i != 2) {
            uVar.f731o = 2;
        }
        uVar.i(i, uVar.f731o, uVar.h(uVar.f741y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f2007j;
        uVar.f718A = colorStateList;
        C0182d0 c0182d0 = uVar.f741y;
        if (c0182d0 == null || colorStateList == null) {
            return;
        }
        c0182d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f2007j;
        if (uVar.f740x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0182d0 c0182d0 = new C0182d0(uVar.f725g, null);
            uVar.f741y = c0182d0;
            c0182d0.setId(com.winfour.neondrop.R.id.textinput_helper_text);
            uVar.f741y.setTextAlignment(5);
            Typeface typeface = uVar.f719B;
            if (typeface != null) {
                uVar.f741y.setTypeface(typeface);
            }
            uVar.f741y.setVisibility(4);
            uVar.f741y.setAccessibilityLiveRegion(1);
            int i = uVar.f742z;
            uVar.f742z = i;
            C0182d0 c0182d02 = uVar.f741y;
            if (c0182d02 != null) {
                c0182d02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f718A;
            uVar.f718A = colorStateList;
            C0182d0 c0182d03 = uVar.f741y;
            if (c0182d03 != null && colorStateList != null) {
                c0182d03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f741y, 1);
            uVar.f741y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f730n;
            if (i2 == 2) {
                uVar.f731o = 0;
            }
            uVar.i(i2, uVar.f731o, uVar.h(uVar.f741y, ""));
            uVar.g(uVar.f741y, 1);
            uVar.f741y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f740x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f2007j;
        uVar.f742z = i;
        C0182d0 c0182d0 = uVar.f741y;
        if (c0182d0 != null) {
            c0182d0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1972C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2035x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1972C) {
            this.f1972C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1973D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1974E = true;
            } else {
                this.f1974E = false;
                if (!TextUtils.isEmpty(this.f1973D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1973D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f2031v0;
        TextInputLayout textInputLayout = dVar.f266a;
        I0.d dVar2 = new I0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f348j;
        if (colorStateList != null) {
            dVar.f279k = colorStateList;
        }
        float f2 = dVar2.f349k;
        if (f2 != 0.0f) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f342a;
        if (colorStateList2 != null) {
            dVar.f260U = colorStateList2;
        }
        dVar.f258S = dVar2.f345e;
        dVar.f259T = dVar2.f346f;
        dVar.f257R = dVar2.f347g;
        dVar.f261V = dVar2.i;
        I0.a aVar = dVar.f293y;
        if (aVar != null) {
            aVar.f338c = true;
        }
        E.g gVar = new E.g(1, dVar);
        dVar2.a();
        dVar.f293y = new I0.a(gVar, dVar2.f352n);
        dVar2.c(textInputLayout.getContext(), dVar.f293y);
        dVar.h(false);
        this.f2008j0 = dVar.f279k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2008j0 != colorStateList) {
            if (this.f2006i0 == null) {
                d dVar = this.f2031v0;
                if (dVar.f279k != colorStateList) {
                    dVar.f279k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f2008j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f2015n = e2;
    }

    public void setMaxEms(int i) {
        this.f2003g = i;
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
        this.f2001f = i;
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
        q qVar = this.f1996c;
        qVar.f696g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1996c;
        qVar.f696g.setImageDrawable(i != 0 ? l.F(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1996c;
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
        q qVar = this.f1996c;
        qVar.f698k = colorStateList;
        z1.d.a(qVar.f691a, qVar.f696g, colorStateList, qVar.f699l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1996c;
        qVar.f699l = mode;
        z1.d.a(qVar.f691a, qVar.f696g, qVar.f698k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2026t == null) {
            C0182d0 c0182d0 = new C0182d0(getContext(), null);
            this.f2026t = c0182d0;
            c0182d0.setId(com.winfour.neondrop.R.id.textinput_placeholder);
            this.f2026t.setImportantForAccessibility(2);
            h d = d();
            this.f2032w = d;
            d.f3173b = 67L;
            this.f2034x = d();
            setPlaceholderTextAppearance(this.f2030v);
            setPlaceholderTextColor(this.f2028u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2024s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2022r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2030v = i;
        C0182d0 c0182d0 = this.f2026t;
        if (c0182d0 != null) {
            c0182d0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2028u != colorStateList) {
            this.f2028u = colorStateList;
            C0182d0 c0182d0 = this.f2026t;
            if (c0182d0 == null || colorStateList == null) {
                return;
            }
            c0182d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1994b;
        zVar.getClass();
        zVar.f759c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f758b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1994b.f758b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1994b.f758b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f1975F;
        if (gVar == null || gVar.f433a.f419a == kVar) {
            return;
        }
        this.f1980L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1994b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1994b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? l.F(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1994b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f762g) {
            zVar.f762g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1994b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        z1.d.a0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1994b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        z1.d.a0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1994b;
        zVar.h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1994b;
        if (zVar.f760e != colorStateList) {
            zVar.f760e = colorStateList;
            z1.d.a(zVar.f757a, zVar.d, colorStateList, zVar.f761f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1994b;
        if (zVar.f761f != mode) {
            zVar.f761f = mode;
            z1.d.a(zVar.f757a, zVar.d, zVar.f760e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1994b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1996c;
        qVar.getClass();
        qVar.f703p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f704q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1996c.f704q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1996c.f704q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            Q.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1995b0) {
            this.f1995b0 = typeface;
            this.f2031v0.m(typeface);
            u uVar = this.f2007j;
            if (typeface != uVar.f719B) {
                uVar.f719B = typeface;
                C0182d0 c0182d0 = uVar.f734r;
                if (c0182d0 != null) {
                    c0182d0.setTypeface(typeface);
                }
                C0182d0 c0182d02 = uVar.f741y;
                if (c0182d02 != null) {
                    c0182d02.setTypeface(typeface);
                }
            }
            C0182d0 c0182d03 = this.f2017o;
            if (c0182d03 != null) {
                c0182d03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1983O != 1) {
            FrameLayout frameLayout = this.f1992a;
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
        C0182d0 c0182d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2006i0;
        d dVar = this.f2031v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2006i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2025s0) : this.f2025s0));
        } else if (m()) {
            C0182d0 c0182d02 = this.f2007j.f734r;
            dVar.i(c0182d02 != null ? c0182d02.getTextColors() : null);
        } else if (this.f2013m && (c0182d0 = this.f2017o) != null) {
            dVar.i(c0182d0.getTextColors());
        } else if (z5 && (colorStateList = this.f2008j0) != null && dVar.f279k != colorStateList) {
            dVar.f279k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f1996c;
        z zVar = this.f1994b;
        if (z4 || !this.f2033w0 || (isEnabled() && z5)) {
            if (z3 || this.f2029u0) {
                ValueAnimator valueAnimator = this.f2037y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2037y0.cancel();
                }
                if (z2 && this.f2035x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f2029u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f763j = false;
                zVar.e();
                qVar.f705r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2029u0) {
            ValueAnimator valueAnimator2 = this.f2037y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2037y0.cancel();
            }
            if (z2 && this.f2035x0) {
                a(0.0f);
            } else {
                dVar.k(0.0f);
            }
            if (e() && !((O0.h) this.f1975F).f668x.f666q.isEmpty() && e()) {
                ((O0.h) this.f1975F).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2029u0 = true;
            C0182d0 c0182d03 = this.f2026t;
            if (c0182d03 != null && this.f2024s) {
                c0182d03.setText((CharSequence) null);
                m0.q.a(this.f1992a, this.f2034x);
                this.f2026t.setVisibility(4);
            }
            zVar.f763j = true;
            zVar.e();
            qVar.f705r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0006g) this.f2015n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1992a;
        if (length != 0 || this.f2029u0) {
            C0182d0 c0182d0 = this.f2026t;
            if (c0182d0 == null || !this.f2024s) {
                return;
            }
            c0182d0.setText((CharSequence) null);
            m0.q.a(frameLayout, this.f2034x);
            this.f2026t.setVisibility(4);
            return;
        }
        if (this.f2026t == null || !this.f2024s || TextUtils.isEmpty(this.f2022r)) {
            return;
        }
        this.f2026t.setText(this.f2022r);
        m0.q.a(frameLayout, this.f2032w);
        this.f2026t.setVisibility(0);
        this.f2026t.bringToFront();
        announceForAccessibility(this.f2022r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2016n0.getDefaultColor();
        int colorForState = this.f2016n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2016n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1988T = colorForState2;
        } else if (z3) {
            this.f1988T = colorForState;
        } else {
            this.f1988T = defaultColor;
        }
    }

    public final void x() {
        C0182d0 c0182d0;
        EditText editText;
        EditText editText2;
        if (this.f1975F == null || this.f1983O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1988T = this.f2025s0;
        } else if (m()) {
            if (this.f2016n0 != null) {
                w(z3, z2);
            } else {
                this.f1988T = getErrorCurrentTextColors();
            }
        } else if (!this.f2013m || (c0182d0 = this.f2017o) == null) {
            if (z3) {
                this.f1988T = this.f2014m0;
            } else if (z2) {
                this.f1988T = this.f2012l0;
            } else {
                this.f1988T = this.f2010k0;
            }
        } else if (this.f2016n0 != null) {
            w(z3, z2);
        } else {
            this.f1988T = c0182d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1996c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f693c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f691a;
        z1.d.R(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f698k;
        CheckableImageButton checkableImageButton2 = qVar.f696g;
        z1.d.R(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof O0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                z1.d.a(textInputLayout, checkableImageButton2, qVar.f698k, qVar.f699l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                F.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1994b;
        z1.d.R(zVar.f757a, zVar.d, zVar.f760e);
        if (this.f1983O == 2) {
            int i = this.f1985Q;
            if (z3 && isEnabled()) {
                this.f1985Q = this.f1987S;
            } else {
                this.f1985Q = this.f1986R;
            }
            if (this.f1985Q != i && e() && !this.f2029u0) {
                if (e()) {
                    ((O0.h) this.f1975F).r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1983O == 1) {
            if (!isEnabled()) {
                this.f1989U = this.p0;
            } else if (z2 && !z3) {
                this.f1989U = this.f2023r0;
            } else if (z3) {
                this.f1989U = this.f2021q0;
            } else {
                this.f1989U = this.f2018o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1994b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1996c.f696g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1996c.f696g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1996c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1996c.f696g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1996c;
        CheckableImageButton checkableImageButton = qVar.f696g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f698k;
            PorterDuff.Mode mode = qVar.f699l;
            TextInputLayout textInputLayout = qVar.f691a;
            z1.d.a(textInputLayout, checkableImageButton, colorStateList, mode);
            z1.d.R(textInputLayout, checkableImageButton, qVar.f698k);
        }
    }
}
