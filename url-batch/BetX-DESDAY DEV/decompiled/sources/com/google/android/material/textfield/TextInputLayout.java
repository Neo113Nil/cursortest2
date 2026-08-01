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
import l.AbstractC0277n0;
import l.C0257d0;
import l.C0292v;
import n0.AbstractC0305a;
import o0.AbstractC0307a;
import q1.d;
import q1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1956A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1957A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1958B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1959B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1960C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1961D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1962E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1963G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1964H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1965I;

    /* renamed from: J, reason: collision with root package name */
    public g f1966J;

    /* renamed from: K, reason: collision with root package name */
    public g f1967K;

    /* renamed from: L, reason: collision with root package name */
    public k f1968L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1969M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1970N;

    /* renamed from: O, reason: collision with root package name */
    public int f1971O;

    /* renamed from: P, reason: collision with root package name */
    public int f1972P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1973Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1974R;

    /* renamed from: S, reason: collision with root package name */
    public int f1975S;

    /* renamed from: T, reason: collision with root package name */
    public int f1976T;

    /* renamed from: U, reason: collision with root package name */
    public int f1977U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1978V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1979W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1980a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1981a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1982b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1983b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1984c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1985c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f1986d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1987d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1988e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1989e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1990f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1991f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1992g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1993g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1994h0;
    public int i;
    public ColorStateList i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f1995j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f1996j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1997k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1998k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1999l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2000l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2001m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public E f2002n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2003n0;

    /* renamed from: o, reason: collision with root package name */
    public C0257d0 f2004o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2005o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2006p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2007p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2008q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2009q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2010r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2011r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2012s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2013s0;

    /* renamed from: t, reason: collision with root package name */
    public C0257d0 f2014t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2015t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2016u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2017u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2018v;

    /* renamed from: v0, reason: collision with root package name */
    public final e f2019v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2020w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2021w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2022x;
    public boolean x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2023y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2024y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2025z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2026z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.luckyarcade.spinthrow.R.attr.textInputStyle, com.luckyarcade.spinthrow.R.style.Widget_Design_TextInputLayout), attributeSet, com.luckyarcade.spinthrow.R.attr.textInputStyle);
        this.f1990f = -1;
        this.f1992g = -1;
        this.h = -1;
        this.i = -1;
        this.f1995j = new u(this);
        this.f2002n = new C0011g(2);
        this.f1978V = new Rect();
        this.f1979W = new Rect();
        this.f1981a0 = new RectF();
        this.f1989e0 = new LinkedHashSet();
        e eVar = new e(this);
        this.f2019v0 = eVar;
        this.f1959B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1980a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0307a.f3716a;
        eVar.f82Q = linearInterpolator;
        eVar.h(false);
        eVar.f81P = linearInterpolator;
        eVar.h(false);
        if (eVar.f104g != 8388659) {
            eVar.f104g = 8388659;
            eVar.h(false);
        }
        int[] iArr = AbstractC0305a.f3632A;
        o.a(context2, attributeSet, com.luckyarcade.spinthrow.R.attr.textInputStyle, com.luckyarcade.spinthrow.R.style.Widget_Design_TextInputLayout);
        o.b(context2, attributeSet, iArr, com.luckyarcade.spinthrow.R.attr.textInputStyle, com.luckyarcade.spinthrow.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.luckyarcade.spinthrow.R.attr.textInputStyle, com.luckyarcade.spinthrow.R.style.Widget_Design_TextInputLayout);
        r rVar = new r(context2, obtainStyledAttributes);
        z zVar = new z(this, rVar);
        this.f1982b = zVar;
        this.f1960C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2021w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1968L = k.b(context2, attributeSet, com.luckyarcade.spinthrow.R.attr.textInputStyle, com.luckyarcade.spinthrow.R.style.Widget_Design_TextInputLayout).a();
        this.f1970N = context2.getResources().getDimensionPixelOffset(com.luckyarcade.spinthrow.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1972P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1974R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1975S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1973Q = this.f1974R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1968L.e();
        if (dimension >= 0.0f) {
            e2.f297e = new H0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f298f = new H0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f299g = new H0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new H0.a(dimension4);
        }
        this.f1968L = e2.a();
        ColorStateList x2 = d.x(context2, rVar, 7);
        if (x2 != null) {
            int defaultColor = x2.getDefaultColor();
            this.f2005o0 = defaultColor;
            this.f1977U = defaultColor;
            if (x2.isStateful()) {
                this.f2007p0 = x2.getColorForState(new int[]{-16842910}, -1);
                this.f2009q0 = x2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2011r0 = x2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2009q0 = this.f2005o0;
                ColorStateList w2 = d.w(context2, com.luckyarcade.spinthrow.R.color.mtrl_filled_background_color);
                this.f2007p0 = w2.getColorForState(new int[]{-16842910}, -1);
                this.f2011r0 = w2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1977U = 0;
            this.f2005o0 = 0;
            this.f2007p0 = 0;
            this.f2009q0 = 0;
            this.f2011r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = rVar.g(1);
            this.f1996j0 = g2;
            this.i0 = g2;
        }
        ColorStateList x3 = d.x(context2, rVar, 14);
        this.m0 = obtainStyledAttributes.getColor(14, 0);
        this.f1998k0 = b.a(context2, com.luckyarcade.spinthrow.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2013s0 = b.a(context2, com.luckyarcade.spinthrow.R.color.mtrl_textinput_disabled_color);
        this.f2000l0 = b.a(context2, com.luckyarcade.spinthrow.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (x3 != null) {
            setBoxStrokeColorStateList(x3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(d.x(context2, rVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1956A = rVar.g(24);
        this.f1958B = rVar.g(25);
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
        this.f2008q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2006p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2006p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2008q);
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
        this.f1984c = qVar;
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
        EditText editText = this.f1986d;
        if (!(editText instanceof AutoCompleteTextView) || d.J(editText)) {
            return this.F;
        }
        int h = i1.r.h(this.f1986d, com.luckyarcade.spinthrow.R.attr.colorControlHighlight);
        int i = this.f1971O;
        int[][] iArr = C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1977U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{i1.r.l(h, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue h02 = l.h0(context, com.luckyarcade.spinthrow.R.attr.colorSurface, "TextInputLayout");
        int i3 = h02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : h02.data;
        g gVar3 = new g(gVar2.f272a.f257a);
        int l2 = i1.r.l(h, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{l2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{l2, a2});
        g gVar4 = new g(gVar2.f272a.f257a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1964H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1964H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1964H.addState(new int[0], f(false));
        }
        return this.f1964H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1963G == null) {
            this.f1963G = f(true);
        }
        return this.f1963G;
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
        if (this.f1986d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1986d = editText;
        int i = this.f1990f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1992g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1965I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.f1986d.getTypeface();
        e eVar = this.f2019v0;
        eVar.m(typeface);
        float textSize = this.f1986d.getTextSize();
        if (eVar.h != textSize) {
            eVar.h = textSize;
            eVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f1986d.getLetterSpacing();
        if (eVar.f88W != letterSpacing) {
            eVar.f88W = letterSpacing;
            eVar.h(false);
        }
        int gravity = this.f1986d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (eVar.f104g != i4) {
            eVar.f104g = i4;
            eVar.h(false);
        }
        if (eVar.f102f != gravity) {
            eVar.f102f = gravity;
            eVar.h(false);
        }
        WeakHashMap weakHashMap = X.f419a;
        this.f2015t0 = editText.getMinimumHeight();
        this.f1986d.addTextChangedListener(new A(this, editText));
        if (this.i0 == null) {
            this.i0 = this.f1986d.getHintTextColors();
        }
        if (this.f1960C) {
            if (TextUtils.isEmpty(this.f1961D)) {
                CharSequence hint = this.f1986d.getHint();
                this.f1988e = hint;
                setHint(hint);
                this.f1986d.setHint((CharSequence) null);
            }
            this.f1962E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2004o != null) {
            n(this.f1986d.getText());
        }
        r();
        this.f1995j.b();
        this.f1982b.bringToFront();
        q qVar = this.f1984c;
        qVar.bringToFront();
        Iterator it = this.f1989e0.iterator();
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
        if (TextUtils.equals(charSequence, this.f1961D)) {
            return;
        }
        this.f1961D = charSequence;
        e eVar = this.f2019v0;
        if (charSequence == null || !TextUtils.equals(eVar.f67A, charSequence)) {
            eVar.f67A = charSequence;
            eVar.f68B = null;
            Bitmap bitmap = eVar.f71E;
            if (bitmap != null) {
                bitmap.recycle();
                eVar.f71E = null;
            }
            eVar.h(false);
        }
        if (this.f2017u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2012s == z2) {
            return;
        }
        if (z2) {
            C0257d0 c0257d0 = this.f2014t;
            if (c0257d0 != null) {
                this.f1980a.addView(c0257d0);
                this.f2014t.setVisibility(0);
            }
        } else {
            C0257d0 c0257d02 = this.f2014t;
            if (c0257d02 != null) {
                c0257d02.setVisibility(8);
            }
            this.f2014t = null;
        }
        this.f2012s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        e eVar = this.f2019v0;
        if (eVar.f94b == f2) {
            return;
        }
        if (this.f2024y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2024y0 = valueAnimator;
            valueAnimator.setInterpolator(l.g0(getContext(), com.luckyarcade.spinthrow.R.attr.motionEasingEmphasizedInterpolator, AbstractC0307a.f3717b));
            this.f2024y0.setDuration(l.f0(getContext(), com.luckyarcade.spinthrow.R.attr.motionDurationMedium4, 167));
            this.f2024y0.addUpdateListener(new C(i, this));
        }
        this.f2024y0.setFloatValues(eVar.f94b, f2);
        this.f2024y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1980a;
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
        k kVar = gVar.f272a.f257a;
        k kVar2 = this.f1968L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1971O == 2 && (i = this.f1973Q) > -1 && (i2 = this.f1976T) != 0) {
            g gVar2 = this.F;
            gVar2.f272a.f264j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f272a;
            if (fVar.f260d != valueOf) {
                fVar.f260d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1977U;
        if (this.f1971O == 1) {
            i3 = C.a.b(this.f1977U, i1.r.g(getContext(), com.luckyarcade.spinthrow.R.attr.colorSurface, 0));
        }
        this.f1977U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1966J;
        if (gVar3 != null && this.f1967K != null) {
            if (this.f1973Q > -1 && this.f1976T != 0) {
                gVar3.j(this.f1986d.isFocused() ? ColorStateList.valueOf(this.f1998k0) : ColorStateList.valueOf(this.f1976T));
                this.f1967K.j(ColorStateList.valueOf(this.f1976T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f1960C) {
            return 0;
        }
        int i = this.f1971O;
        e eVar = this.f2019v0;
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
        hVar.f2936c = l.f0(getContext(), com.luckyarcade.spinthrow.R.attr.motionDurationShort2, 87);
        hVar.f2937d = l.g0(getContext(), com.luckyarcade.spinthrow.R.attr.motionEasingLinearInterpolator, AbstractC0307a.f3716a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f1986d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1988e != null) {
            boolean z2 = this.f1962E;
            this.f1962E = false;
            CharSequence hint = editText.getHint();
            this.f1986d.setHint(this.f1988e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f1986d.setHint(hint);
                this.f1962E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1980a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f1986d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1957A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1957A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1960C;
        e eVar = this.f2019v0;
        if (z2) {
            eVar.getClass();
            int save = canvas.save();
            if (eVar.f68B != null) {
                RectF rectF = eVar.f100e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = eVar.f79N;
                    textPaint.setTextSize(eVar.f72G);
                    float f2 = eVar.f111p;
                    float f3 = eVar.f112q;
                    float f4 = eVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (eVar.f99d0 <= 1 || eVar.f69C) {
                        canvas.translate(f2, f3);
                        eVar.f90Y.draw(canvas);
                    } else {
                        float lineStart = eVar.f111p - eVar.f90Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (eVar.f95b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = eVar.f73H;
                            float f7 = eVar.f74I;
                            float f8 = eVar.f75J;
                            int i3 = eVar.f76K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        eVar.f90Y.draw(canvas);
                        textPaint.setAlpha((int) (eVar.f93a0 * f5));
                        if (i2 >= 31) {
                            float f9 = eVar.f73H;
                            float f10 = eVar.f74I;
                            float f11 = eVar.f75J;
                            int i4 = eVar.f76K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = eVar.f90Y.getLineBaseline(0);
                        CharSequence charSequence = eVar.f97c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(eVar.f73H, eVar.f74I, eVar.f75J, eVar.f76K);
                        }
                        String trim = eVar.f97c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(eVar.f90Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1967K == null || (gVar = this.f1966J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f1986d.isFocused()) {
            Rect bounds = this.f1967K.getBounds();
            Rect bounds2 = this.f1966J.getBounds();
            float f13 = eVar.f94b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0307a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0307a.c(centerX, bounds2.right, f13);
            this.f1967K.draw(canvas);
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
        if (this.f2026z0) {
            return;
        }
        this.f2026z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        e eVar = this.f2019v0;
        if (eVar != null) {
            eVar.f77L = drawableState;
            ColorStateList colorStateList2 = eVar.f106k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = eVar.f105j) != null && colorStateList.isStateful())) {
                eVar.h(false);
                z2 = true;
                if (this.f1986d != null) {
                    WeakHashMap weakHashMap = X.f419a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2026z0 = false;
            }
        }
        z2 = false;
        if (this.f1986d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2026z0 = false;
    }

    public final boolean e() {
        return this.f1960C && !TextUtils.isEmpty(this.f1961D) && (this.F instanceof K0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.luckyarcade.spinthrow.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1986d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.luckyarcade.spinthrow.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.luckyarcade.spinthrow.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
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
        kVar.f303a = iVar;
        kVar.f304b = iVar2;
        kVar.f305c = iVar3;
        kVar.f306d = iVar4;
        kVar.f307e = aVar;
        kVar.f308f = aVar2;
        kVar.f309g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f310j = eVar2;
        kVar.f311k = eVar3;
        kVar.f312l = eVar4;
        EditText editText2 = this.f1986d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f271w;
            TypedValue h02 = l.h0(context, com.luckyarcade.spinthrow.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = h02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : h02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f272a;
        if (fVar.f263g == null) {
            fVar.f263g = new Rect();
        }
        gVar.f272a.f263g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f1986d.getCompoundPaddingLeft() : this.f1984c.c() : this.f1982b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1986d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f1971O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1977U;
    }

    public int getBoxBackgroundMode() {
        return this.f1971O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1972P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1981a0;
        return e2 ? this.f1968L.h.a(rectF) : this.f1968L.f309g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1981a0;
        return e2 ? this.f1968L.f309g.a(rectF) : this.f1968L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1981a0;
        return e2 ? this.f1968L.f307e.a(rectF) : this.f1968L.f308f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1981a0;
        return e2 ? this.f1968L.f308f.a(rectF) : this.f1968L.f307e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2003n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1974R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1975S;
    }

    public int getCounterMaxLength() {
        return this.f1999l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0257d0 c0257d0;
        if (this.f1997k && this.f2001m && (c0257d0 = this.f2004o) != null) {
            return c0257d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2025z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2023y;
    }

    public ColorStateList getCursorColor() {
        return this.f1956A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1958B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.f1986d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1984c.f579g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1984c.f579g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1984c.f583m;
    }

    public int getEndIconMode() {
        return this.f1984c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1984c.f584n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1984c.f579g;
    }

    public CharSequence getError() {
        u uVar = this.f1995j;
        if (uVar.f619q) {
            return uVar.f618p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1995j.f622t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1995j.f621s;
    }

    public int getErrorCurrentTextColors() {
        C0257d0 c0257d0 = this.f1995j.f620r;
        if (c0257d0 != null) {
            return c0257d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1984c.f575c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1995j;
        if (uVar.f626x) {
            return uVar.f625w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0257d0 c0257d0 = this.f1995j.f627y;
        if (c0257d0 != null) {
            return c0257d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1960C) {
            return this.f1961D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2019v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        e eVar = this.f2019v0;
        return eVar.e(eVar.f106k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1996j0;
    }

    public E getLengthCounter() {
        return this.f2002n;
    }

    public int getMaxEms() {
        return this.f1992g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1990f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1984c.f579g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1984c.f579g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2012s) {
            return this.f2010r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2018v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2016u;
    }

    public CharSequence getPrefixText() {
        return this.f1982b.f645c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1982b.f644b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1982b.f644b;
    }

    public k getShapeAppearanceModel() {
        return this.f1968L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1982b.f646d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1982b.f646d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1982b.f649g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1982b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1984c.f586p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1984c.f587q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1984c.f587q;
    }

    public Typeface getTypeface() {
        return this.f1983b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f1986d.getCompoundPaddingRight() : this.f1982b.a() : this.f1984c.c());
    }

    public final void i() {
        int i = this.f1971O;
        if (i == 0) {
            this.F = null;
            this.f1966J = null;
            this.f1967K = null;
        } else if (i == 1) {
            this.F = new g(this.f1968L);
            this.f1966J = new g();
            this.f1967K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1971O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1960C || (this.F instanceof K0.h)) {
                this.F = new g(this.f1968L);
            } else {
                k kVar = this.f1968L;
                int i2 = K0.h.f548y;
                if (kVar == null) {
                    kVar = new k();
                }
                K0.g gVar = new K0.g(kVar, new RectF());
                K0.h hVar = new K0.h(gVar);
                hVar.f549x = gVar;
                this.F = hVar;
            }
            this.f1966J = null;
            this.f1967K = null;
        }
        s();
        x();
        if (this.f1971O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1972P = getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (d.K(getContext())) {
                this.f1972P = getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f1986d != null && this.f1971O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f1986d;
                WeakHashMap weakHashMap = X.f419a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1986d.getPaddingEnd(), getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (d.K(getContext())) {
                EditText editText2 = this.f1986d;
                WeakHashMap weakHashMap2 = X.f419a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1986d.getPaddingEnd(), getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1971O != 0) {
            t();
        }
        EditText editText3 = this.f1986d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1971O;
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
            int width = this.f1986d.getWidth();
            int gravity = this.f1986d.getGravity();
            e eVar = this.f2019v0;
            boolean b2 = eVar.b(eVar.f67A);
            eVar.f69C = b2;
            Rect rect = eVar.f98d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = eVar.f91Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = eVar.f91Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1981a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (eVar.f91Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (eVar.f69C) {
                        f5 = max + eVar.f91Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (eVar.f69C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = eVar.f91Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = eVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1970N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1973Q);
                K0.h hVar = (K0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = eVar.f91Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1981a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (eVar.f91Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = eVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0257d0 c0257d0, int i) {
        try {
            c0257d0.setTextAppearance(i);
            if (c0257d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0257d0.setTextAppearance(com.luckyarcade.spinthrow.R.style.TextAppearance_AppCompat_Caption);
        c0257d0.setTextColor(b.a(getContext(), com.luckyarcade.spinthrow.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f1995j;
        return (uVar.f617o != 1 || uVar.f620r == null || TextUtils.isEmpty(uVar.f618p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0011g) this.f2002n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2001m;
        int i = this.f1999l;
        String str = null;
        if (i == -1) {
            this.f2004o.setText(String.valueOf(length));
            this.f2004o.setContentDescription(null);
            this.f2001m = false;
        } else {
            this.f2001m = length > i;
            Context context = getContext();
            this.f2004o.setContentDescription(context.getString(this.f2001m ? com.luckyarcade.spinthrow.R.string.character_counter_overflowed_content_description : com.luckyarcade.spinthrow.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1999l)));
            if (z2 != this.f2001m) {
                o();
            }
            String str2 = I.b.f353b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f356e : I.b.f355d;
            C0257d0 c0257d0 = this.f2004o;
            String string = getContext().getString(com.luckyarcade.spinthrow.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1999l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f365a;
                str = bVar.c(string).toString();
            }
            c0257d0.setText(str);
        }
        if (this.f1986d == null || z2 == this.f2001m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0257d0 c0257d0 = this.f2004o;
        if (c0257d0 != null) {
            l(c0257d0, this.f2001m ? this.f2006p : this.f2008q);
            if (!this.f2001m && (colorStateList2 = this.f2023y) != null) {
                this.f2004o.setTextColor(colorStateList2);
            }
            if (!this.f2001m || (colorStateList = this.f2025z) == null) {
                return;
            }
            this.f2004o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2019v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1984c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1959B0 = false;
        if (this.f1986d != null && this.f1986d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1982b.getMeasuredHeight()))) {
            this.f1986d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.f1986d.post(new B0.q(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.f1986d;
        if (editText != null) {
            ThreadLocal threadLocal = B0.f.f122a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1978V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = B0.f.f122a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            B0.f.a(this, editText, matrix);
            ThreadLocal threadLocal3 = B0.f.f123b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1966J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1974R, rect.right, i5);
            }
            g gVar2 = this.f1967K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1975S, rect.right, i6);
            }
            if (this.f1960C) {
                float textSize = this.f1986d.getTextSize();
                e eVar = this.f2019v0;
                if (eVar.h != textSize) {
                    eVar.h = textSize;
                    eVar.h(false);
                }
                int gravity = this.f1986d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (eVar.f104g != i7) {
                    eVar.f104g = i7;
                    eVar.h(false);
                }
                if (eVar.f102f != gravity) {
                    eVar.f102f = gravity;
                    eVar.h(false);
                }
                if (this.f1986d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = o.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1979W;
                rect2.bottom = i8;
                int i9 = this.f1971O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1972P;
                    rect2.right = h(rect.right, e2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e2);
                } else {
                    rect2.left = this.f1986d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f1986d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = eVar.f98d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    eVar.f78M = true;
                }
                if (this.f1986d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = eVar.f80O;
                textPaint.setTextSize(eVar.h);
                textPaint.setTypeface(eVar.f116u);
                textPaint.setLetterSpacing(eVar.f88W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f1986d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1971O != 1 || this.f1986d.getMinLines() > 1) ? rect.top + this.f1986d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f1986d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1971O != 1 || this.f1986d.getMinLines() > 1) ? rect.bottom - this.f1986d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = eVar.f96c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    eVar.f78M = true;
                }
                eVar.h(false);
                if (!e() || this.f2017u0) {
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
        boolean z2 = this.f1959B0;
        q qVar = this.f1984c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1959B0 = true;
        }
        if (this.f2014t != null && (editText = this.f1986d) != null) {
            this.f2014t.setGravity(editText.getGravity());
            this.f2014t.setPadding(this.f1986d.getCompoundPaddingLeft(), this.f1986d.getCompoundPaddingTop(), this.f1986d.getCompoundPaddingRight(), this.f1986d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f736a);
        setError(f2.f529c);
        if (f2.f530d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1969M) {
            c cVar = this.f1968L.f307e;
            RectF rectF = this.f1981a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1968L.f308f.a(rectF);
            float a4 = this.f1968L.h.a(rectF);
            float a5 = this.f1968L.f309g.a(rectF);
            k kVar = this.f1968L;
            l lVar = kVar.f303a;
            l lVar2 = kVar.f304b;
            l lVar3 = kVar.f306d;
            l lVar4 = kVar.f305c;
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
            kVar2.f303a = lVar2;
            kVar2.f304b = lVar;
            kVar2.f305c = lVar3;
            kVar2.f306d = lVar4;
            kVar2.f307e = aVar;
            kVar2.f308f = aVar2;
            kVar2.f309g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f310j = eVar2;
            kVar2.f311k = eVar3;
            kVar2.f312l = eVar4;
            this.f1969M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f529c = getError();
        }
        q qVar = this.f1984c;
        f2.f530d = qVar.i != 0 && qVar.f579g.f1917d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1956A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue d02 = l.d0(context, com.luckyarcade.spinthrow.R.attr.colorControlActivated);
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
        EditText editText = this.f1986d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f1986d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f2004o != null && this.f2001m)) && (colorStateList = this.f1958B) != null) {
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
        if (this.f1986d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            z zVar = this.f1982b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.f1986d.getPaddingLeft();
                if (this.f1985c0 == null || this.f1987d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1985c0 = colorDrawable3;
                    this.f1987d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f1986d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1985c0;
                if (drawable2 != colorDrawable4) {
                    this.f1986d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1984c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f586p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f587q.getMeasuredWidth() - this.f1986d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f575c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f579g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f1986d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1991f0;
                        if (colorDrawable != null || this.f1993g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1991f0 = colorDrawable5;
                                this.f1993g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1991f0;
                            if (drawable == colorDrawable2) {
                                this.f1994h0 = drawable;
                                this.f1986d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1993g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f1986d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1991f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1991f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.f1986d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1991f0) {
                            this.f1986d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1994h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1991f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1984c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f587q.getMeasuredWidth() - this.f1986d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f1986d.getCompoundDrawablesRelative();
                colorDrawable = this.f1991f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1991f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1985c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f1986d.getCompoundDrawablesRelative();
            this.f1986d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1985c0 = null;
            z2 = true;
            qVar = this.f1984c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f587q.getMeasuredWidth() - this.f1986d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f1986d.getCompoundDrawablesRelative();
            colorDrawable = this.f1991f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1991f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1984c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f587q.getMeasuredWidth() - this.f1986d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f1986d.getCompoundDrawablesRelative();
        colorDrawable = this.f1991f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1991f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0257d0 c0257d0;
        EditText editText = this.f1986d;
        if (editText == null || this.f1971O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0277n0.f3416a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0292v.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2001m && (c0257d0 = this.f2004o) != null) {
            mutate.setColorFilter(C0292v.c(c0257d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f1986d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f1986d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.f1965I || editText.getBackground() == null) && this.f1971O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f1986d;
            WeakHashMap weakHashMap = X.f419a;
            editText2.setBackground(editTextBoxBackground);
            this.f1965I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1977U != i) {
            this.f1977U = i;
            this.f2005o0 = i;
            this.f2009q0 = i;
            this.f2011r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2005o0 = defaultColor;
        this.f1977U = defaultColor;
        this.f2007p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2009q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2011r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1971O) {
            return;
        }
        this.f1971O = i;
        if (this.f1986d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1972P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1968L.e();
        c cVar = this.f1968L.f307e;
        l r2 = d.r(i);
        e2.f293a = r2;
        j.b(r2);
        e2.f297e = cVar;
        c cVar2 = this.f1968L.f308f;
        l r3 = d.r(i);
        e2.f294b = r3;
        j.b(r3);
        e2.f298f = cVar2;
        c cVar3 = this.f1968L.h;
        l r4 = d.r(i);
        e2.f296d = r4;
        j.b(r4);
        e2.h = cVar3;
        c cVar4 = this.f1968L.f309g;
        l r5 = d.r(i);
        e2.f295c = r5;
        j.b(r5);
        e2.f299g = cVar4;
        this.f1968L = e2.a();
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
            this.f1998k0 = colorStateList.getDefaultColor();
            this.f2013s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2000l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.m0 != colorStateList.getDefaultColor()) {
            this.m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2003n0 != colorStateList) {
            this.f2003n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1974R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1975S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1997k != z2) {
            u uVar = this.f1995j;
            if (z2) {
                C0257d0 c0257d0 = new C0257d0(getContext(), null);
                this.f2004o = c0257d0;
                c0257d0.setId(com.luckyarcade.spinthrow.R.id.textinput_counter);
                Typeface typeface = this.f1983b0;
                if (typeface != null) {
                    this.f2004o.setTypeface(typeface);
                }
                this.f2004o.setMaxLines(1);
                uVar.a(this.f2004o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2004o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.luckyarcade.spinthrow.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2004o != null) {
                    EditText editText = this.f1986d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f2004o, 2);
                this.f2004o = null;
            }
            this.f1997k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1999l != i) {
            if (i > 0) {
                this.f1999l = i;
            } else {
                this.f1999l = -1;
            }
            if (!this.f1997k || this.f2004o == null) {
                return;
            }
            EditText editText = this.f1986d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2006p != i) {
            this.f2006p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2025z != colorStateList) {
            this.f2025z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2008q != i) {
            this.f2008q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2023y != colorStateList) {
            this.f2023y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1956A != colorStateList) {
            this.f1956A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1958B != colorStateList) {
            this.f1958B = colorStateList;
            if (m() || (this.f2004o != null && this.f2001m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.i0 = colorStateList;
        this.f1996j0 = colorStateList;
        if (this.f1986d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f1984c.f579g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1984c.f579g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1984c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f579g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1984c;
        Drawable z2 = i != 0 ? d.z(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f579g;
        checkableImageButton.setImageDrawable(z2);
        if (z2 != null) {
            ColorStateList colorStateList = qVar.f581k;
            PorterDuff.Mode mode = qVar.f582l;
            TextInputLayout textInputLayout = qVar.f573a;
            l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            l.c0(textInputLayout, checkableImageButton, qVar.f581k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1984c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f583m) {
            qVar.f583m = i;
            CheckableImageButton checkableImageButton = qVar.f579g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f575c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1984c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1984c;
        View.OnLongClickListener onLongClickListener = qVar.f585o;
        CheckableImageButton checkableImageButton = qVar.f579g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1984c;
        qVar.f585o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f579g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1984c;
        qVar.f584n = scaleType;
        qVar.f579g.setScaleType(scaleType);
        qVar.f575c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1984c;
        if (qVar.f581k != colorStateList) {
            qVar.f581k = colorStateList;
            l.d(qVar.f573a, qVar.f579g, colorStateList, qVar.f582l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1984c;
        if (qVar.f582l != mode) {
            qVar.f582l = mode;
            l.d(qVar.f573a, qVar.f579g, qVar.f581k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1984c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1995j;
        if (!uVar.f619q) {
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
        uVar.f618p = charSequence;
        uVar.f620r.setText(charSequence);
        int i = uVar.f616n;
        if (i != 1) {
            uVar.f617o = 1;
        }
        uVar.i(i, uVar.f617o, uVar.h(uVar.f620r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f1995j;
        uVar.f622t = i;
        C0257d0 c0257d0 = uVar.f620r;
        if (c0257d0 != null) {
            WeakHashMap weakHashMap = X.f419a;
            c0257d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1995j;
        uVar.f621s = charSequence;
        C0257d0 c0257d0 = uVar.f620r;
        if (c0257d0 != null) {
            c0257d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1995j;
        if (uVar.f619q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0257d0 c0257d0 = new C0257d0(uVar.f611g, null);
            uVar.f620r = c0257d0;
            c0257d0.setId(com.luckyarcade.spinthrow.R.id.textinput_error);
            uVar.f620r.setTextAlignment(5);
            Typeface typeface = uVar.f604B;
            if (typeface != null) {
                uVar.f620r.setTypeface(typeface);
            }
            int i = uVar.f623u;
            uVar.f623u = i;
            C0257d0 c0257d02 = uVar.f620r;
            if (c0257d02 != null) {
                textInputLayout.l(c0257d02, i);
            }
            ColorStateList colorStateList = uVar.f624v;
            uVar.f624v = colorStateList;
            C0257d0 c0257d03 = uVar.f620r;
            if (c0257d03 != null && colorStateList != null) {
                c0257d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f621s;
            uVar.f621s = charSequence;
            C0257d0 c0257d04 = uVar.f620r;
            if (c0257d04 != null) {
                c0257d04.setContentDescription(charSequence);
            }
            int i2 = uVar.f622t;
            uVar.f622t = i2;
            C0257d0 c0257d05 = uVar.f620r;
            if (c0257d05 != null) {
                WeakHashMap weakHashMap = X.f419a;
                c0257d05.setAccessibilityLiveRegion(i2);
            }
            uVar.f620r.setVisibility(4);
            uVar.a(uVar.f620r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f620r, 0);
            uVar.f620r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f619q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1984c;
        qVar.i(i != 0 ? d.z(qVar.getContext(), i) : null);
        l.c0(qVar.f573a, qVar.f575c, qVar.f576d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1984c;
        CheckableImageButton checkableImageButton = qVar.f575c;
        View.OnLongClickListener onLongClickListener = qVar.f578f;
        checkableImageButton.setOnClickListener(onClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1984c;
        qVar.f578f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f575c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1984c;
        if (qVar.f576d != colorStateList) {
            qVar.f576d = colorStateList;
            l.d(qVar.f573a, qVar.f575c, colorStateList, qVar.f577e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1984c;
        if (qVar.f577e != mode) {
            qVar.f577e = mode;
            l.d(qVar.f573a, qVar.f575c, qVar.f576d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f1995j;
        uVar.f623u = i;
        C0257d0 c0257d0 = uVar.f620r;
        if (c0257d0 != null) {
            uVar.h.l(c0257d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1995j;
        uVar.f624v = colorStateList;
        C0257d0 c0257d0 = uVar.f620r;
        if (c0257d0 == null || colorStateList == null) {
            return;
        }
        c0257d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2021w0 != z2) {
            this.f2021w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1995j;
        if (isEmpty) {
            if (uVar.f626x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f626x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f625w = charSequence;
        uVar.f627y.setText(charSequence);
        int i = uVar.f616n;
        if (i != 2) {
            uVar.f617o = 2;
        }
        uVar.i(i, uVar.f617o, uVar.h(uVar.f627y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1995j;
        uVar.f603A = colorStateList;
        C0257d0 c0257d0 = uVar.f627y;
        if (c0257d0 == null || colorStateList == null) {
            return;
        }
        c0257d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1995j;
        if (uVar.f626x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0257d0 c0257d0 = new C0257d0(uVar.f611g, null);
            uVar.f627y = c0257d0;
            c0257d0.setId(com.luckyarcade.spinthrow.R.id.textinput_helper_text);
            uVar.f627y.setTextAlignment(5);
            Typeface typeface = uVar.f604B;
            if (typeface != null) {
                uVar.f627y.setTypeface(typeface);
            }
            uVar.f627y.setVisibility(4);
            uVar.f627y.setAccessibilityLiveRegion(1);
            int i = uVar.f628z;
            uVar.f628z = i;
            C0257d0 c0257d02 = uVar.f627y;
            if (c0257d02 != null) {
                c0257d02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f603A;
            uVar.f603A = colorStateList;
            C0257d0 c0257d03 = uVar.f627y;
            if (c0257d03 != null && colorStateList != null) {
                c0257d03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f627y, 1);
            uVar.f627y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f616n;
            if (i2 == 2) {
                uVar.f617o = 0;
            }
            uVar.i(i2, uVar.f617o, uVar.h(uVar.f627y, ""));
            uVar.g(uVar.f627y, 1);
            uVar.f627y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f626x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f1995j;
        uVar.f628z = i;
        C0257d0 c0257d0 = uVar.f627y;
        if (c0257d0 != null) {
            c0257d0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1960C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1960C) {
            this.f1960C = z2;
            if (z2) {
                CharSequence hint = this.f1986d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1961D)) {
                        setHint(hint);
                    }
                    this.f1986d.setHint((CharSequence) null);
                }
                this.f1962E = true;
            } else {
                this.f1962E = false;
                if (!TextUtils.isEmpty(this.f1961D) && TextUtils.isEmpty(this.f1986d.getHint())) {
                    this.f1986d.setHint(this.f1961D);
                }
                setHintInternal(null);
            }
            if (this.f1986d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        e eVar = this.f2019v0;
        TextInputLayout textInputLayout = eVar.f92a;
        E0.d dVar = new E0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f189j;
        if (colorStateList != null) {
            eVar.f106k = colorStateList;
        }
        float f2 = dVar.f190k;
        if (f2 != 0.0f) {
            eVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f182a;
        if (colorStateList2 != null) {
            eVar.f86U = colorStateList2;
        }
        eVar.f84S = dVar.f186e;
        eVar.f85T = dVar.f187f;
        eVar.f83R = dVar.f188g;
        eVar.f87V = dVar.i;
        E0.a aVar = eVar.f120y;
        if (aVar != null) {
            aVar.i = true;
        }
        B0.d dVar2 = new B0.d(0, eVar);
        dVar.a();
        eVar.f120y = new E0.a(dVar2, dVar.f193n);
        dVar.c(textInputLayout.getContext(), eVar.f120y);
        eVar.h(false);
        this.f1996j0 = eVar.f106k;
        if (this.f1986d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1996j0 != colorStateList) {
            if (this.i0 == null) {
                e eVar = this.f2019v0;
                if (eVar.f106k != colorStateList) {
                    eVar.f106k = colorStateList;
                    eVar.h(false);
                }
            }
            this.f1996j0 = colorStateList;
            if (this.f1986d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f2002n = e2;
    }

    public void setMaxEms(int i) {
        this.f1992g = i;
        EditText editText = this.f1986d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.f1986d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1990f = i;
        EditText editText = this.f1986d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.f1986d;
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
        q qVar = this.f1984c;
        qVar.f579g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1984c;
        qVar.f579g.setImageDrawable(i != 0 ? d.z(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1984c;
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
        q qVar = this.f1984c;
        qVar.f581k = colorStateList;
        l.d(qVar.f573a, qVar.f579g, colorStateList, qVar.f582l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1984c;
        qVar.f582l = mode;
        l.d(qVar.f573a, qVar.f579g, qVar.f581k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2014t == null) {
            C0257d0 c0257d0 = new C0257d0(getContext(), null);
            this.f2014t = c0257d0;
            c0257d0.setId(com.luckyarcade.spinthrow.R.id.textinput_placeholder);
            this.f2014t.setImportantForAccessibility(2);
            h d2 = d();
            this.f2020w = d2;
            d2.f2935b = 67L;
            this.f2022x = d();
            setPlaceholderTextAppearance(this.f2018v);
            setPlaceholderTextColor(this.f2016u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2012s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2010r = charSequence;
        }
        EditText editText = this.f1986d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2018v = i;
        C0257d0 c0257d0 = this.f2014t;
        if (c0257d0 != null) {
            c0257d0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2016u != colorStateList) {
            this.f2016u = colorStateList;
            C0257d0 c0257d0 = this.f2014t;
            if (c0257d0 == null || colorStateList == null) {
                return;
            }
            c0257d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1982b;
        zVar.getClass();
        zVar.f645c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f644b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1982b.f644b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1982b.f644b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f272a.f257a == kVar) {
            return;
        }
        this.f1968L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1982b.f646d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1982b.f646d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? d.z(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1982b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f649g) {
            zVar.f649g = i;
            CheckableImageButton checkableImageButton = zVar.f646d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1982b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.f646d;
        checkableImageButton.setOnClickListener(onClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1982b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f646d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.p0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1982b;
        zVar.h = scaleType;
        zVar.f646d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1982b;
        if (zVar.f647e != colorStateList) {
            zVar.f647e = colorStateList;
            l.d(zVar.f643a, zVar.f646d, colorStateList, zVar.f648f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1982b;
        if (zVar.f648f != mode) {
            zVar.f648f = mode;
            l.d(zVar.f643a, zVar.f646d, zVar.f647e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1982b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1984c;
        qVar.getClass();
        qVar.f586p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f587q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1984c.f587q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1984c.f587q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d2) {
        EditText editText = this.f1986d;
        if (editText != null) {
            X.l(editText, d2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1983b0) {
            this.f1983b0 = typeface;
            this.f2019v0.m(typeface);
            u uVar = this.f1995j;
            if (typeface != uVar.f604B) {
                uVar.f604B = typeface;
                C0257d0 c0257d0 = uVar.f620r;
                if (c0257d0 != null) {
                    c0257d0.setTypeface(typeface);
                }
                C0257d0 c0257d02 = uVar.f627y;
                if (c0257d02 != null) {
                    c0257d02.setTypeface(typeface);
                }
            }
            C0257d0 c0257d03 = this.f2004o;
            if (c0257d03 != null) {
                c0257d03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1971O != 1) {
            FrameLayout frameLayout = this.f1980a;
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
        C0257d0 c0257d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1986d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1986d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.i0;
        e eVar = this.f2019v0;
        if (colorStateList2 != null) {
            eVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.i0;
            eVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2013s0) : this.f2013s0));
        } else if (m()) {
            C0257d0 c0257d02 = this.f1995j.f620r;
            eVar.i(c0257d02 != null ? c0257d02.getTextColors() : null);
        } else if (this.f2001m && (c0257d0 = this.f2004o) != null) {
            eVar.i(c0257d0.getTextColors());
        } else if (z5 && (colorStateList = this.f1996j0) != null && eVar.f106k != colorStateList) {
            eVar.f106k = colorStateList;
            eVar.h(false);
        }
        q qVar = this.f1984c;
        z zVar = this.f1982b;
        if (z4 || !this.f2021w0 || (isEnabled() && z5)) {
            if (z3 || this.f2017u0) {
                ValueAnimator valueAnimator = this.f2024y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2024y0.cancel();
                }
                if (z2 && this.x0) {
                    a(1.0f);
                } else {
                    eVar.k(1.0f);
                }
                this.f2017u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f1986d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f650j = false;
                zVar.e();
                qVar.f588r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2017u0) {
            ValueAnimator valueAnimator2 = this.f2024y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2024y0.cancel();
            }
            if (z2 && this.x0) {
                a(0.0f);
            } else {
                eVar.k(0.0f);
            }
            if (e() && !((K0.h) this.F).f549x.f547q.isEmpty() && e()) {
                ((K0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2017u0 = true;
            C0257d0 c0257d03 = this.f2014t;
            if (c0257d03 != null && this.f2012s) {
                c0257d03.setText((CharSequence) null);
                j0.q.a(this.f1980a, this.f2022x);
                this.f2014t.setVisibility(4);
            }
            zVar.f650j = true;
            zVar.e();
            qVar.f588r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0011g) this.f2002n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1980a;
        if (length != 0 || this.f2017u0) {
            C0257d0 c0257d0 = this.f2014t;
            if (c0257d0 == null || !this.f2012s) {
                return;
            }
            c0257d0.setText((CharSequence) null);
            j0.q.a(frameLayout, this.f2022x);
            this.f2014t.setVisibility(4);
            return;
        }
        if (this.f2014t == null || !this.f2012s || TextUtils.isEmpty(this.f2010r)) {
            return;
        }
        this.f2014t.setText(this.f2010r);
        j0.q.a(frameLayout, this.f2020w);
        this.f2014t.setVisibility(0);
        this.f2014t.bringToFront();
        announceForAccessibility(this.f2010r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2003n0.getDefaultColor();
        int colorForState = this.f2003n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2003n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1976T = colorForState2;
        } else if (z3) {
            this.f1976T = colorForState;
        } else {
            this.f1976T = defaultColor;
        }
    }

    public final void x() {
        C0257d0 c0257d0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1971O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f1986d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1986d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1976T = this.f2013s0;
        } else if (m()) {
            if (this.f2003n0 != null) {
                w(z3, z2);
            } else {
                this.f1976T = getErrorCurrentTextColors();
            }
        } else if (!this.f2001m || (c0257d0 = this.f2004o) == null) {
            if (z3) {
                this.f1976T = this.m0;
            } else if (z2) {
                this.f1976T = this.f2000l0;
            } else {
                this.f1976T = this.f1998k0;
            }
        } else if (this.f2003n0 != null) {
            w(z3, z2);
        } else {
            this.f1976T = c0257d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1984c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f575c;
        ColorStateList colorStateList = qVar.f576d;
        TextInputLayout textInputLayout = qVar.f573a;
        l.c0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f581k;
        CheckableImageButton checkableImageButton2 = qVar.f579g;
        l.c0(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof K0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                l.d(textInputLayout, checkableImageButton2, qVar.f581k, qVar.f582l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1982b;
        l.c0(zVar.f643a, zVar.f646d, zVar.f647e);
        if (this.f1971O == 2) {
            int i = this.f1973Q;
            if (z3 && isEnabled()) {
                this.f1973Q = this.f1975S;
            } else {
                this.f1973Q = this.f1974R;
            }
            if (this.f1973Q != i && e() && !this.f2017u0) {
                if (e()) {
                    ((K0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1971O == 1) {
            if (!isEnabled()) {
                this.f1977U = this.f2007p0;
            } else if (z2 && !z3) {
                this.f1977U = this.f2011r0;
            } else if (z3) {
                this.f1977U = this.f2009q0;
            } else {
                this.f1977U = this.f2005o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1982b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1984c.f579g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1984c.f579g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1984c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1984c.f579g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1984c;
        CheckableImageButton checkableImageButton = qVar.f579g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f581k;
            PorterDuff.Mode mode = qVar.f582l;
            TextInputLayout textInputLayout = qVar.f573a;
            l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            l.c0(textInputLayout, checkableImageButton, qVar.f581k);
        }
    }
}
