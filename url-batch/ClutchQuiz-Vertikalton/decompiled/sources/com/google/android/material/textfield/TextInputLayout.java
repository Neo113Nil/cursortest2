package com.google.android.material.textfield;

import A.c;
import I0.b;
import K.C0007h;
import K.C0012m;
import K.I;
import K.S;
import O0.e;
import O0.f;
import O0.g;
import O0.i;
import O0.j;
import O0.k;
import R0.A;
import R0.B;
import R0.C;
import R0.D;
import R0.m;
import R0.p;
import R0.s;
import R0.t;
import R0.w;
import R0.y;
import R0.z;
import T.d;
import T0.a;
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
import l.AbstractC0224l0;
import l.C0204b0;
import l.C0239t;
import n0.h;
import n0.q;
import u0.AbstractC0361a;
import v0.AbstractC0372a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1964C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1965A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1966A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1967B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1968B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1969C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1970D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1971E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1972G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1973H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1974I;

    /* renamed from: J, reason: collision with root package name */
    public g f1975J;

    /* renamed from: K, reason: collision with root package name */
    public g f1976K;

    /* renamed from: L, reason: collision with root package name */
    public k f1977L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1978M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1979N;

    /* renamed from: O, reason: collision with root package name */
    public int f1980O;

    /* renamed from: P, reason: collision with root package name */
    public int f1981P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1982Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1983R;

    /* renamed from: S, reason: collision with root package name */
    public int f1984S;

    /* renamed from: T, reason: collision with root package name */
    public int f1985T;

    /* renamed from: U, reason: collision with root package name */
    public int f1986U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1987V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1988W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1989a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1990a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f1991b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1992b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f1993c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1994c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1995d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1996e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1997e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1998f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1999f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2000g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2001g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2002h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2003i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f2004j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2005j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2006k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2007k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2008l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2009l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2010m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public C f2011n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2012n0;

    /* renamed from: o, reason: collision with root package name */
    public C0204b0 f2013o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2014o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2015p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2016p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2017q;
    public int q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2018r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2019r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2020s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2021s0;

    /* renamed from: t, reason: collision with root package name */
    public C0204b0 f2022t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2023t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2024u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2025u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2026v;

    /* renamed from: v0, reason: collision with root package name */
    public final b f2027v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2028w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2029w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2030x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2031x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2032y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2033y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2034z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2035z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.clutchquizarena.app.R.attr.textInputStyle, com.clutchquizarena.app.R.style.Widget_Design_TextInputLayout), attributeSet, com.clutchquizarena.app.R.attr.textInputStyle);
        this.f1998f = -1;
        this.f2000g = -1;
        this.h = -1;
        this.i = -1;
        this.f2004j = new t(this);
        this.f2011n = new C0007h(2);
        this.f1987V = new Rect();
        this.f1988W = new Rect();
        this.f1990a0 = new RectF();
        this.f1997e0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f2027v0 = bVar;
        this.f1968B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1989a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0372a.f3981a;
        bVar.f283Q = linearInterpolator;
        bVar.h(false);
        bVar.f282P = linearInterpolator;
        bVar.h(false);
        if (bVar.f304g != 8388659) {
            bVar.f304g = 8388659;
            bVar.h(false);
        }
        int[] iArr = AbstractC0361a.f3726A;
        I0.k.a(context2, attributeSet, com.clutchquizarena.app.R.attr.textInputStyle, com.clutchquizarena.app.R.style.Widget_Design_TextInputLayout);
        I0.k.b(context2, attributeSet, iArr, com.clutchquizarena.app.R.attr.textInputStyle, com.clutchquizarena.app.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.clutchquizarena.app.R.attr.textInputStyle, com.clutchquizarena.app.R.style.Widget_Design_TextInputLayout);
        C0012m c0012m = new C0012m(context2, obtainStyledAttributes);
        y yVar = new y(this, c0012m);
        this.f1991b = yVar;
        this.f1969C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2031x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2029w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1977L = k.b(context2, attributeSet, com.clutchquizarena.app.R.attr.textInputStyle, com.clutchquizarena.app.R.style.Widget_Design_TextInputLayout).a();
        this.f1979N = context2.getResources().getDimensionPixelOffset(com.clutchquizarena.app.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1981P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1983R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1984S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1982Q = this.f1983R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1977L.e();
        if (dimension >= 0.0f) {
            e2.f550e = new O0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f551f = new O0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f552g = new O0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new O0.a(dimension4);
        }
        this.f1977L = e2.a();
        ColorStateList G2 = c.G(context2, c0012m, 7);
        if (G2 != null) {
            int defaultColor = G2.getDefaultColor();
            this.f2014o0 = defaultColor;
            this.f1986U = defaultColor;
            if (G2.isStateful()) {
                this.f2016p0 = G2.getColorForState(new int[]{-16842910}, -1);
                this.q0 = G2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2019r0 = G2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.q0 = this.f2014o0;
                ColorStateList F = c.F(context2, com.clutchquizarena.app.R.color.mtrl_filled_background_color);
                this.f2016p0 = F.getColorForState(new int[]{-16842910}, -1);
                this.f2019r0 = F.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1986U = 0;
            this.f2014o0 = 0;
            this.f2016p0 = 0;
            this.q0 = 0;
            this.f2019r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = c0012m.g(1);
            this.f2005j0 = g2;
            this.f2003i0 = g2;
        }
        ColorStateList G3 = c.G(context2, c0012m, 14);
        this.m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2007k0 = A.b.a(context2, com.clutchquizarena.app.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2021s0 = A.b.a(context2, com.clutchquizarena.app.R.color.mtrl_textinput_disabled_color);
        this.f2009l0 = A.b.a(context2, com.clutchquizarena.app.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (G3 != null) {
            setBoxStrokeColorStateList(G3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(c.G(context2, c0012m, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1965A = c0012m.g(24);
        this.f1967B = c0012m.g(25);
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
        this.f2017q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2015p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2015p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2017q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0012m.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0012m.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0012m.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0012m.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0012m.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0012m.g(58));
        }
        p pVar = new p(this, c0012m);
        this.f1993c = pVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0012m.t();
        setImportantForAccessibility(2);
        I.m(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || c.b0(editText)) {
            return this.F;
        }
        int E2 = c.E(this.d, com.clutchquizarena.app.R.attr.colorControlHighlight);
        int i = this.f1980O;
        int[][] iArr = f1964C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1986U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{c.h0(E2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue y02 = c.y0(context, com.clutchquizarena.app.R.attr.colorSurface, "TextInputLayout");
        int i3 = y02.resourceId;
        int a2 = i3 != 0 ? A.b.a(context, i3) : y02.data;
        g gVar3 = new g(gVar2.f527a.f513a);
        int h02 = c.h0(E2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{h02, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h02, a2});
        g gVar4 = new g(gVar2.f527a.f513a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1973H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1973H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1973H.addState(new int[0], f(false));
        }
        return this.f1973H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1972G == null) {
            this.f1972G = f(true);
        }
        return this.f1972G;
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
        int i = this.f1998f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2000g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1974I = false;
        i();
        setTextInputAccessibilityDelegate(new B(this));
        Typeface typeface = this.d.getTypeface();
        b bVar = this.f2027v0;
        bVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (bVar.f289W != letterSpacing) {
            bVar.f289W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f304g != i4) {
            bVar.f304g = i4;
            bVar.h(false);
        }
        if (bVar.f302f != gravity) {
            bVar.f302f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = S.f365a;
        this.f2023t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new z(this, editText));
        if (this.f2003i0 == null) {
            this.f2003i0 = this.d.getHintTextColors();
        }
        if (this.f1969C) {
            if (TextUtils.isEmpty(this.f1970D)) {
                CharSequence hint = this.d.getHint();
                this.f1996e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1971E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2013o != null) {
            n(this.d.getText());
        }
        r();
        this.f2004j.b();
        this.f1991b.bringToFront();
        p pVar = this.f1993c;
        pVar.bringToFront();
        Iterator it = this.f1997e0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1970D)) {
            return;
        }
        this.f1970D = charSequence;
        b bVar = this.f2027v0;
        if (charSequence == null || !TextUtils.equals(bVar.f268A, charSequence)) {
            bVar.f268A = charSequence;
            bVar.f269B = null;
            Bitmap bitmap = bVar.f272E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f272E = null;
            }
            bVar.h(false);
        }
        if (this.f2025u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2020s == z2) {
            return;
        }
        if (z2) {
            C0204b0 c0204b0 = this.f2022t;
            if (c0204b0 != null) {
                this.f1989a.addView(c0204b0);
                this.f2022t.setVisibility(0);
            }
        } else {
            C0204b0 c0204b02 = this.f2022t;
            if (c0204b02 != null) {
                c0204b02.setVisibility(8);
            }
            this.f2022t = null;
        }
        this.f2020s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        b bVar = this.f2027v0;
        if (bVar.f295b == f2) {
            return;
        }
        if (this.f2033y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2033y0 = valueAnimator;
            valueAnimator.setInterpolator(c.x0(getContext(), com.clutchquizarena.app.R.attr.motionEasingEmphasizedInterpolator, AbstractC0372a.f3982b));
            this.f2033y0.setDuration(c.w0(getContext(), com.clutchquizarena.app.R.attr.motionDurationMedium4, 167));
            this.f2033y0.addUpdateListener(new A(i, this));
        }
        this.f2033y0.setFloatValues(bVar.f295b, f2);
        this.f2033y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1989a;
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
        k kVar = gVar.f527a.f513a;
        k kVar2 = this.f1977L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1980O == 2 && (i = this.f1982Q) > -1 && (i2 = this.f1985T) != 0) {
            g gVar2 = this.F;
            gVar2.f527a.f519j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f527a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1986U;
        if (this.f1980O == 1) {
            i3 = C.a.b(this.f1986U, c.D(getContext(), com.clutchquizarena.app.R.attr.colorSurface, 0));
        }
        this.f1986U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1975J;
        if (gVar3 != null && this.f1976K != null) {
            if (this.f1982Q > -1 && this.f1985T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f2007k0) : ColorStateList.valueOf(this.f1985T));
                this.f1976K.j(ColorStateList.valueOf(this.f1985T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1969C) {
            return 0;
        }
        int i = this.f1980O;
        b bVar = this.f2027v0;
        if (i == 0) {
            d = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = bVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final h d() {
        h hVar = new h();
        hVar.f3169c = c.w0(getContext(), com.clutchquizarena.app.R.attr.motionDurationShort2, 87);
        hVar.d = c.x0(getContext(), com.clutchquizarena.app.R.attr.motionEasingLinearInterpolator, AbstractC0372a.f3981a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1996e != null) {
            boolean z2 = this.f1971E;
            this.f1971E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1996e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1971E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1989a;
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
        this.f1966A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1966A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1969C;
        b bVar = this.f2027v0;
        if (z2) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f269B != null) {
                RectF rectF = bVar.f300e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f280N;
                    textPaint.setTextSize(bVar.f273G);
                    float f2 = bVar.f311p;
                    float f3 = bVar.f312q;
                    float f4 = bVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f299d0 <= 1 || bVar.f270C) {
                        canvas.translate(f2, f3);
                        bVar.f291Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f311p - bVar.f291Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (bVar.f296b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = bVar.f274H;
                            float f7 = bVar.f275I;
                            float f8 = bVar.f276J;
                            int i3 = bVar.f277K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        bVar.f291Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f294a0 * f5));
                        if (i2 >= 31) {
                            float f9 = bVar.f274H;
                            float f10 = bVar.f275I;
                            float f11 = bVar.f276J;
                            int i4 = bVar.f277K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f291Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f298c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(bVar.f274H, bVar.f275I, bVar.f276J, bVar.f277K);
                        }
                        String trim = bVar.f298c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f291Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1976K == null || (gVar = this.f1975J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1976K.getBounds();
            Rect bounds2 = this.f1975J.getBounds();
            float f13 = bVar.f295b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0372a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0372a.c(centerX, bounds2.right, f13);
            this.f1976K.draw(canvas);
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
        if (this.f2035z0) {
            return;
        }
        this.f2035z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f2027v0;
        if (bVar != null) {
            bVar.f278L = drawableState;
            ColorStateList colorStateList2 = bVar.f306k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f305j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = S.f365a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2035z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2035z0 = false;
    }

    public final boolean e() {
        return this.f1969C && !TextUtils.isEmpty(this.f1970D) && (this.F instanceof R0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.clutchquizarena.app.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.clutchquizarena.app.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.clutchquizarena.app.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        O0.a aVar = new O0.a(f2);
        O0.a aVar2 = new O0.a(f2);
        O0.a aVar3 = new O0.a(dimensionPixelOffset);
        O0.a aVar4 = new O0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f556a = iVar;
        kVar.f557b = iVar2;
        kVar.f558c = iVar3;
        kVar.d = iVar4;
        kVar.f559e = aVar;
        kVar.f560f = aVar2;
        kVar.f561g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f562j = eVar2;
        kVar.f563k = eVar3;
        kVar.f564l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f526w;
            TypedValue y02 = c.y0(context, com.clutchquizarena.app.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = y02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? A.b.a(context, i2) : y02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f527a;
        if (fVar.f518g == null) {
            fVar.f518g = new Rect();
        }
        gVar.f527a.f518g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1993c.c() : this.f1991b.a()) + i;
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
        int i = this.f1980O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1986U;
    }

    public int getBoxBackgroundMode() {
        return this.f1980O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1981P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f1990a0;
        return e2 ? this.f1977L.h.a(rectF) : this.f1977L.f561g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f1990a0;
        return e2 ? this.f1977L.f561g.a(rectF) : this.f1977L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f1990a0;
        return e2 ? this.f1977L.f559e.a(rectF) : this.f1977L.f560f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f1990a0;
        return e2 ? this.f1977L.f560f.a(rectF) : this.f1977L.f559e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2012n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1983R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1984S;
    }

    public int getCounterMaxLength() {
        return this.f2008l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0204b0 c0204b0;
        if (this.f2006k && this.f2010m && (c0204b0 = this.f2013o) != null) {
            return c0204b0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2034z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2032y;
    }

    public ColorStateList getCursorColor() {
        return this.f1965A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1967B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2003i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1993c.f695g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1993c.f695g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1993c.f699m;
    }

    public int getEndIconMode() {
        return this.f1993c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1993c.f700n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1993c.f695g;
    }

    public CharSequence getError() {
        t tVar = this.f2004j;
        if (tVar.f732q) {
            return tVar.f731p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2004j.f735t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2004j.f734s;
    }

    public int getErrorCurrentTextColors() {
        C0204b0 c0204b0 = this.f2004j.f733r;
        if (c0204b0 != null) {
            return c0204b0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1993c.f692c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2004j;
        if (tVar.f739x) {
            return tVar.f738w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0204b0 c0204b0 = this.f2004j.f740y;
        if (c0204b0 != null) {
            return c0204b0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1969C) {
            return this.f1970D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2027v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2027v0;
        return bVar.e(bVar.f306k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2005j0;
    }

    public C getLengthCounter() {
        return this.f2011n;
    }

    public int getMaxEms() {
        return this.f2000g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1998f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1993c.f695g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1993c.f695g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2020s) {
            return this.f2018r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2026v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2024u;
    }

    public CharSequence getPrefixText() {
        return this.f1991b.f758c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1991b.f757b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1991b.f757b;
    }

    public k getShapeAppearanceModel() {
        return this.f1977L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1991b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1991b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1991b.f761g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1991b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1993c.f702p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1993c.f703q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1993c.f703q;
    }

    public Typeface getTypeface() {
        return this.f1992b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1991b.a() : this.f1993c.c());
    }

    public final void i() {
        int i = this.f1980O;
        if (i == 0) {
            this.F = null;
            this.f1975J = null;
            this.f1976K = null;
        } else if (i == 1) {
            this.F = new g(this.f1977L);
            this.f1975J = new g();
            this.f1976K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1980O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1969C || (this.F instanceof R0.h)) {
                this.F = new g(this.f1977L);
            } else {
                k kVar = this.f1977L;
                int i2 = R0.h.f667y;
                if (kVar == null) {
                    kVar = new k();
                }
                R0.g gVar = new R0.g(kVar, new RectF());
                R0.h hVar = new R0.h(gVar);
                hVar.f668x = gVar;
                this.F = hVar;
            }
            this.f1975J = null;
            this.f1976K = null;
        }
        s();
        x();
        if (this.f1980O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1981P = getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (c.d0(getContext())) {
                this.f1981P = getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1980O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = S.f365a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (c.d0(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = S.f365a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1980O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1980O;
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
            b bVar = this.f2027v0;
            boolean b2 = bVar.b(bVar.f268A);
            bVar.f270C = b2;
            Rect rect = bVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.f292Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = bVar.f292Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1990a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.f292Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f270C) {
                        f5 = max + bVar.f292Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (bVar.f270C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = bVar.f292Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1979N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1982Q);
                R0.h hVar = (R0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = bVar.f292Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1990a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.f292Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0204b0 c0204b0, int i) {
        try {
            c0204b0.setTextAppearance(i);
            if (c0204b0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0204b0.setTextAppearance(com.clutchquizarena.app.R.style.TextAppearance_AppCompat_Caption);
        c0204b0.setTextColor(A.b.a(getContext(), com.clutchquizarena.app.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2004j;
        return (tVar.f730o != 1 || tVar.f733r == null || TextUtils.isEmpty(tVar.f731p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0007h) this.f2011n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2010m;
        int i = this.f2008l;
        String str = null;
        if (i == -1) {
            this.f2013o.setText(String.valueOf(length));
            this.f2013o.setContentDescription(null);
            this.f2010m = false;
        } else {
            this.f2010m = length > i;
            Context context = getContext();
            this.f2013o.setContentDescription(context.getString(this.f2010m ? com.clutchquizarena.app.R.string.character_counter_overflowed_content_description : com.clutchquizarena.app.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2008l)));
            if (z2 != this.f2010m) {
                o();
            }
            String str2 = I.b.f254b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f256e : I.b.d;
            C0204b0 c0204b0 = this.f2013o;
            String string = getContext().getString(com.clutchquizarena.app.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2008l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.h hVar = I.i.f264a;
                str = bVar.c(string).toString();
            }
            c0204b0.setText(str);
        }
        if (this.d == null || z2 == this.f2010m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0204b0 c0204b0 = this.f2013o;
        if (c0204b0 != null) {
            l(c0204b0, this.f2010m ? this.f2015p : this.f2017q);
            if (!this.f2010m && (colorStateList2 = this.f2032y) != null) {
                this.f2013o.setTextColor(colorStateList2);
            }
            if (!this.f2010m || (colorStateList = this.f2034z) == null) {
                return;
            }
            this.f2013o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2027v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f1993c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1968B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f1991b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new B0.b(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = I0.c.f322a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1987V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = I0.c.f322a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            I0.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = I0.c.f323b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1975J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1983R, rect.right, i5);
            }
            g gVar2 = this.f1976K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1984S, rect.right, i6);
            }
            if (this.f1969C) {
                float textSize = this.d.getTextSize();
                b bVar = this.f2027v0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.f304g != i7) {
                    bVar.f304g = i7;
                    bVar.h(false);
                }
                if (bVar.f302f != gravity) {
                    bVar.f302f = gravity;
                    bVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = I0.k.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1988W;
                rect2.bottom = i8;
                int i9 = this.f1980O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1981P;
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
                Rect rect3 = bVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.f279M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f281O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f316u);
                textPaint.setLetterSpacing(bVar.f289W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1980O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1980O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.f297c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.f279M = true;
                }
                bVar.h(false);
                if (!e() || this.f2025u0) {
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
        boolean z2 = this.f1968B0;
        p pVar = this.f1993c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1968B0 = true;
        }
        if (this.f2022t != null && (editText = this.d) != null) {
            this.f2022t.setGravity(editText.getGravity());
            this.f2022t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D d = (D) parcelable;
        super.onRestoreInstanceState(d.f646a);
        setError(d.f649c);
        if (d.d) {
            post(new Q.b(1, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1978M) {
            O0.c cVar = this.f1977L.f559e;
            RectF rectF = this.f1990a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1977L.f560f.a(rectF);
            float a4 = this.f1977L.h.a(rectF);
            float a5 = this.f1977L.f561g.a(rectF);
            k kVar = this.f1977L;
            c cVar2 = kVar.f556a;
            c cVar3 = kVar.f557b;
            c cVar4 = kVar.d;
            c cVar5 = kVar.f558c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(cVar3);
            j.b(cVar2);
            j.b(cVar5);
            j.b(cVar4);
            O0.a aVar = new O0.a(a3);
            O0.a aVar2 = new O0.a(a2);
            O0.a aVar3 = new O0.a(a5);
            O0.a aVar4 = new O0.a(a4);
            k kVar2 = new k();
            kVar2.f556a = cVar3;
            kVar2.f557b = cVar2;
            kVar2.f558c = cVar4;
            kVar2.d = cVar5;
            kVar2.f559e = aVar;
            kVar2.f560f = aVar2;
            kVar2.f561g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f562j = eVar2;
            kVar2.f563k = eVar3;
            kVar2.f564l = eVar4;
            this.f1978M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        D d = new D(super.onSaveInstanceState());
        if (m()) {
            d.f649c = getError();
        }
        p pVar = this.f1993c;
        d.d = pVar.i != 0 && pVar.f695g.d;
        return d;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1965A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue u02 = c.u0(context, com.clutchquizarena.app.R.attr.colorControlActivated);
            if (u02 != null) {
                int i = u02.resourceId;
                if (i != 0) {
                    colorStateList2 = c.F(context, i);
                } else {
                    int i2 = u02.data;
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
            if ((m() || (this.f2013o != null && this.f2010m)) && (colorStateList = this.f1967B) != null) {
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
        p pVar;
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
            y yVar = this.f1991b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1994c0 == null || this.f1995d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1994c0 = colorDrawable3;
                    this.f1995d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1994c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    pVar = this.f1993c;
                    if ((!pVar.e() || ((pVar.i != 0 && pVar.d()) || pVar.f702p != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f703q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f692c;
                        } else if (pVar.i != 0 && pVar.d()) {
                            checkableImageButton = pVar.f695g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1999f0;
                        if (colorDrawable != null || this.f2001g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1999f0 = colorDrawable5;
                                this.f2001g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1999f0;
                            if (drawable == colorDrawable2) {
                                this.f2002h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2001g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1999f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1999f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1999f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2002h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1999f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                pVar = this.f1993c;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f703q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1999f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1999f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1994c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1994c0 = null;
            z2 = true;
            pVar = this.f1993c;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f703q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1999f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1999f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        pVar = this.f1993c;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f703q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1999f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1999f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0204b0 c0204b0;
        EditText editText = this.d;
        if (editText == null || this.f1980O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0224l0.f3007a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0239t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2010m && (c0204b0 = this.f2013o) != null) {
            mutate.setColorFilter(C0239t.c(c0204b0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f1974I || editText.getBackground() == null) && this.f1980O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = S.f365a;
            editText2.setBackground(editTextBoxBackground);
            this.f1974I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1986U != i) {
            this.f1986U = i;
            this.f2014o0 = i;
            this.q0 = i;
            this.f2019r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(A.b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2014o0 = defaultColor;
        this.f1986U = defaultColor;
        this.f2016p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2019r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1980O) {
            return;
        }
        this.f1980O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1981P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1977L.e();
        O0.c cVar = this.f1977L.f559e;
        c u2 = c.u(i);
        e2.f547a = u2;
        j.b(u2);
        e2.f550e = cVar;
        O0.c cVar2 = this.f1977L.f560f;
        c u3 = c.u(i);
        e2.f548b = u3;
        j.b(u3);
        e2.f551f = cVar2;
        O0.c cVar3 = this.f1977L.h;
        c u4 = c.u(i);
        e2.d = u4;
        j.b(u4);
        e2.h = cVar3;
        O0.c cVar4 = this.f1977L.f561g;
        c u5 = c.u(i);
        e2.f549c = u5;
        j.b(u5);
        e2.f552g = cVar4;
        this.f1977L = e2.a();
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
            this.f2007k0 = colorStateList.getDefaultColor();
            this.f2021s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2009l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.m0 != colorStateList.getDefaultColor()) {
            this.m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2012n0 != colorStateList) {
            this.f2012n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1983R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1984S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2006k != z2) {
            t tVar = this.f2004j;
            if (z2) {
                C0204b0 c0204b0 = new C0204b0(getContext(), null);
                this.f2013o = c0204b0;
                c0204b0.setId(com.clutchquizarena.app.R.id.textinput_counter);
                Typeface typeface = this.f1992b0;
                if (typeface != null) {
                    this.f2013o.setTypeface(typeface);
                }
                this.f2013o.setMaxLines(1);
                tVar.a(this.f2013o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2013o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.clutchquizarena.app.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2013o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2013o, 2);
                this.f2013o = null;
            }
            this.f2006k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2008l != i) {
            if (i > 0) {
                this.f2008l = i;
            } else {
                this.f2008l = -1;
            }
            if (!this.f2006k || this.f2013o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2015p != i) {
            this.f2015p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2034z != colorStateList) {
            this.f2034z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2017q != i) {
            this.f2017q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2032y != colorStateList) {
            this.f2032y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1965A != colorStateList) {
            this.f1965A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1967B != colorStateList) {
            this.f1967B = colorStateList;
            if (m() || (this.f2013o != null && this.f2010m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2003i0 = colorStateList;
        this.f2005j0 = colorStateList;
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
        this.f1993c.f695g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1993c.f695g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f1993c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f695g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f1993c;
        Drawable t2 = i != 0 ? d.t(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f695g;
        checkableImageButton.setImageDrawable(t2);
        if (t2 != null) {
            ColorStateList colorStateList = pVar.f697k;
            PorterDuff.Mode mode = pVar.f698l;
            TextInputLayout textInputLayout = pVar.f690a;
            c.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c.t0(textInputLayout, checkableImageButton, pVar.f697k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f1993c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f699m) {
            pVar.f699m = i;
            CheckableImageButton checkableImageButton = pVar.f695g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f692c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1993c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f1993c;
        View.OnLongClickListener onLongClickListener = pVar.f701o;
        CheckableImageButton checkableImageButton = pVar.f695g;
        checkableImageButton.setOnClickListener(onClickListener);
        c.C0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f1993c;
        pVar.f701o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f695g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c.C0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f1993c;
        pVar.f700n = scaleType;
        pVar.f695g.setScaleType(scaleType);
        pVar.f692c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f1993c;
        if (pVar.f697k != colorStateList) {
            pVar.f697k = colorStateList;
            c.d(pVar.f690a, pVar.f695g, colorStateList, pVar.f698l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1993c;
        if (pVar.f698l != mode) {
            pVar.f698l = mode;
            c.d(pVar.f690a, pVar.f695g, pVar.f697k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1993c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2004j;
        if (!tVar.f732q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f731p = charSequence;
        tVar.f733r.setText(charSequence);
        int i = tVar.f729n;
        if (i != 1) {
            tVar.f730o = 1;
        }
        tVar.i(i, tVar.f730o, tVar.h(tVar.f733r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f2004j;
        tVar.f735t = i;
        C0204b0 c0204b0 = tVar.f733r;
        if (c0204b0 != null) {
            WeakHashMap weakHashMap = S.f365a;
            c0204b0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2004j;
        tVar.f734s = charSequence;
        C0204b0 c0204b0 = tVar.f733r;
        if (c0204b0 != null) {
            c0204b0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.f2004j;
        if (tVar.f732q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z2) {
            C0204b0 c0204b0 = new C0204b0(tVar.f724g, null);
            tVar.f733r = c0204b0;
            c0204b0.setId(com.clutchquizarena.app.R.id.textinput_error);
            tVar.f733r.setTextAlignment(5);
            Typeface typeface = tVar.f718B;
            if (typeface != null) {
                tVar.f733r.setTypeface(typeface);
            }
            int i = tVar.f736u;
            tVar.f736u = i;
            C0204b0 c0204b02 = tVar.f733r;
            if (c0204b02 != null) {
                textInputLayout.l(c0204b02, i);
            }
            ColorStateList colorStateList = tVar.f737v;
            tVar.f737v = colorStateList;
            C0204b0 c0204b03 = tVar.f733r;
            if (c0204b03 != null && colorStateList != null) {
                c0204b03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f734s;
            tVar.f734s = charSequence;
            C0204b0 c0204b04 = tVar.f733r;
            if (c0204b04 != null) {
                c0204b04.setContentDescription(charSequence);
            }
            int i2 = tVar.f735t;
            tVar.f735t = i2;
            C0204b0 c0204b05 = tVar.f733r;
            if (c0204b05 != null) {
                WeakHashMap weakHashMap = S.f365a;
                c0204b05.setAccessibilityLiveRegion(i2);
            }
            tVar.f733r.setVisibility(4);
            tVar.a(tVar.f733r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f733r, 0);
            tVar.f733r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f732q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f1993c;
        pVar.i(i != 0 ? d.t(pVar.getContext(), i) : null);
        c.t0(pVar.f690a, pVar.f692c, pVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f1993c;
        CheckableImageButton checkableImageButton = pVar.f692c;
        View.OnLongClickListener onLongClickListener = pVar.f694f;
        checkableImageButton.setOnClickListener(onClickListener);
        c.C0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f1993c;
        pVar.f694f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f692c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c.C0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f1993c;
        if (pVar.d != colorStateList) {
            pVar.d = colorStateList;
            c.d(pVar.f690a, pVar.f692c, colorStateList, pVar.f693e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1993c;
        if (pVar.f693e != mode) {
            pVar.f693e = mode;
            c.d(pVar.f690a, pVar.f692c, pVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f2004j;
        tVar.f736u = i;
        C0204b0 c0204b0 = tVar.f733r;
        if (c0204b0 != null) {
            tVar.h.l(c0204b0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2004j;
        tVar.f737v = colorStateList;
        C0204b0 c0204b0 = tVar.f733r;
        if (c0204b0 == null || colorStateList == null) {
            return;
        }
        c0204b0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2029w0 != z2) {
            this.f2029w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2004j;
        if (isEmpty) {
            if (tVar.f739x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f739x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f738w = charSequence;
        tVar.f740y.setText(charSequence);
        int i = tVar.f729n;
        if (i != 2) {
            tVar.f730o = 2;
        }
        tVar.i(i, tVar.f730o, tVar.h(tVar.f740y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2004j;
        tVar.f717A = colorStateList;
        C0204b0 c0204b0 = tVar.f740y;
        if (c0204b0 == null || colorStateList == null) {
            return;
        }
        c0204b0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.f2004j;
        if (tVar.f739x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0204b0 c0204b0 = new C0204b0(tVar.f724g, null);
            tVar.f740y = c0204b0;
            c0204b0.setId(com.clutchquizarena.app.R.id.textinput_helper_text);
            tVar.f740y.setTextAlignment(5);
            Typeface typeface = tVar.f718B;
            if (typeface != null) {
                tVar.f740y.setTypeface(typeface);
            }
            tVar.f740y.setVisibility(4);
            tVar.f740y.setAccessibilityLiveRegion(1);
            int i = tVar.f741z;
            tVar.f741z = i;
            C0204b0 c0204b02 = tVar.f740y;
            if (c0204b02 != null) {
                c0204b02.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f717A;
            tVar.f717A = colorStateList;
            C0204b0 c0204b03 = tVar.f740y;
            if (c0204b03 != null && colorStateList != null) {
                c0204b03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f740y, 1);
            tVar.f740y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f729n;
            if (i2 == 2) {
                tVar.f730o = 0;
            }
            tVar.i(i2, tVar.f730o, tVar.h(tVar.f740y, ""));
            tVar.g(tVar.f740y, 1);
            tVar.f740y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f739x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f2004j;
        tVar.f741z = i;
        C0204b0 c0204b0 = tVar.f740y;
        if (c0204b0 != null) {
            c0204b0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1969C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2031x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1969C) {
            this.f1969C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1970D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1971E = true;
            } else {
                this.f1971E = false;
                if (!TextUtils.isEmpty(this.f1970D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1970D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f2027v0;
        TextInputLayout textInputLayout = bVar.f293a;
        L0.d dVar = new L0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f492j;
        if (colorStateList != null) {
            bVar.f306k = colorStateList;
        }
        float f2 = dVar.f493k;
        if (f2 != 0.0f) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f486a;
        if (colorStateList2 != null) {
            bVar.f287U = colorStateList2;
        }
        bVar.f285S = dVar.f489e;
        bVar.f286T = dVar.f490f;
        bVar.f284R = dVar.f491g;
        bVar.f288V = dVar.i;
        L0.a aVar = bVar.f320y;
        if (aVar != null) {
            aVar.f482g = true;
        }
        A0.h hVar = new A0.h(2, bVar);
        dVar.a();
        bVar.f320y = new L0.a(hVar, dVar.f496n);
        dVar.c(textInputLayout.getContext(), bVar.f320y);
        bVar.h(false);
        this.f2005j0 = bVar.f306k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2005j0 != colorStateList) {
            if (this.f2003i0 == null) {
                b bVar = this.f2027v0;
                if (bVar.f306k != colorStateList) {
                    bVar.f306k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2005j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(C c2) {
        this.f2011n = c2;
    }

    public void setMaxEms(int i) {
        this.f2000g = i;
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
        this.f1998f = i;
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
        p pVar = this.f1993c;
        pVar.f695g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f1993c;
        pVar.f695g.setImageDrawable(i != 0 ? d.t(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f1993c;
        if (z2 && pVar.i != 1) {
            pVar.g(1);
        } else if (z2) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f1993c;
        pVar.f697k = colorStateList;
        c.d(pVar.f690a, pVar.f695g, colorStateList, pVar.f698l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1993c;
        pVar.f698l = mode;
        c.d(pVar.f690a, pVar.f695g, pVar.f697k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2022t == null) {
            C0204b0 c0204b0 = new C0204b0(getContext(), null);
            this.f2022t = c0204b0;
            c0204b0.setId(com.clutchquizarena.app.R.id.textinput_placeholder);
            this.f2022t.setImportantForAccessibility(2);
            h d = d();
            this.f2028w = d;
            d.f3168b = 67L;
            this.f2030x = d();
            setPlaceholderTextAppearance(this.f2026v);
            setPlaceholderTextColor(this.f2024u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2020s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2018r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2026v = i;
        C0204b0 c0204b0 = this.f2022t;
        if (c0204b0 != null) {
            c0204b0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2024u != colorStateList) {
            this.f2024u = colorStateList;
            C0204b0 c0204b0 = this.f2022t;
            if (c0204b0 == null || colorStateList == null) {
                return;
            }
            c0204b0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f1991b;
        yVar.getClass();
        yVar.f758c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f757b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1991b.f757b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1991b.f757b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f527a.f513a == kVar) {
            return;
        }
        this.f1977L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1991b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1991b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? d.t(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f1991b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f761g) {
            yVar.f761g = i;
            CheckableImageButton checkableImageButton = yVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f1991b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        c.C0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f1991b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c.C0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f1991b;
        yVar.h = scaleType;
        yVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f1991b;
        if (yVar.f759e != colorStateList) {
            yVar.f759e = colorStateList;
            c.d(yVar.f756a, yVar.d, colorStateList, yVar.f760f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f1991b;
        if (yVar.f760f != mode) {
            yVar.f760f = mode;
            c.d(yVar.f756a, yVar.d, yVar.f759e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1991b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f1993c;
        pVar.getClass();
        pVar.f702p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f703q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1993c.f703q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1993c.f703q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(B b2) {
        EditText editText = this.d;
        if (editText != null) {
            S.l(editText, b2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1992b0) {
            this.f1992b0 = typeface;
            this.f2027v0.m(typeface);
            t tVar = this.f2004j;
            if (typeface != tVar.f718B) {
                tVar.f718B = typeface;
                C0204b0 c0204b0 = tVar.f733r;
                if (c0204b0 != null) {
                    c0204b0.setTypeface(typeface);
                }
                C0204b0 c0204b02 = tVar.f740y;
                if (c0204b02 != null) {
                    c0204b02.setTypeface(typeface);
                }
            }
            C0204b0 c0204b03 = this.f2013o;
            if (c0204b03 != null) {
                c0204b03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1980O != 1) {
            FrameLayout frameLayout = this.f1989a;
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
        C0204b0 c0204b0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2003i0;
        b bVar = this.f2027v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2003i0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2021s0) : this.f2021s0));
        } else if (m()) {
            C0204b0 c0204b02 = this.f2004j.f733r;
            bVar.i(c0204b02 != null ? c0204b02.getTextColors() : null);
        } else if (this.f2010m && (c0204b0 = this.f2013o) != null) {
            bVar.i(c0204b0.getTextColors());
        } else if (z5 && (colorStateList = this.f2005j0) != null && bVar.f306k != colorStateList) {
            bVar.f306k = colorStateList;
            bVar.h(false);
        }
        p pVar = this.f1993c;
        y yVar = this.f1991b;
        if (z4 || !this.f2029w0 || (isEnabled() && z5)) {
            if (z3 || this.f2025u0) {
                ValueAnimator valueAnimator = this.f2033y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2033y0.cancel();
                }
                if (z2 && this.f2031x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f2025u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f762j = false;
                yVar.e();
                pVar.f704r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2025u0) {
            ValueAnimator valueAnimator2 = this.f2033y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2033y0.cancel();
            }
            if (z2 && this.f2031x0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((R0.h) this.F).f668x.f666q.isEmpty() && e()) {
                ((R0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2025u0 = true;
            C0204b0 c0204b03 = this.f2022t;
            if (c0204b03 != null && this.f2020s) {
                c0204b03.setText((CharSequence) null);
                q.a(this.f1989a, this.f2030x);
                this.f2022t.setVisibility(4);
            }
            yVar.f762j = true;
            yVar.e();
            pVar.f704r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0007h) this.f2011n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1989a;
        if (length != 0 || this.f2025u0) {
            C0204b0 c0204b0 = this.f2022t;
            if (c0204b0 == null || !this.f2020s) {
                return;
            }
            c0204b0.setText((CharSequence) null);
            q.a(frameLayout, this.f2030x);
            this.f2022t.setVisibility(4);
            return;
        }
        if (this.f2022t == null || !this.f2020s || TextUtils.isEmpty(this.f2018r)) {
            return;
        }
        this.f2022t.setText(this.f2018r);
        q.a(frameLayout, this.f2028w);
        this.f2022t.setVisibility(0);
        this.f2022t.bringToFront();
        announceForAccessibility(this.f2018r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2012n0.getDefaultColor();
        int colorForState = this.f2012n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2012n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1985T = colorForState2;
        } else if (z3) {
            this.f1985T = colorForState;
        } else {
            this.f1985T = defaultColor;
        }
    }

    public final void x() {
        C0204b0 c0204b0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1980O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1985T = this.f2021s0;
        } else if (m()) {
            if (this.f2012n0 != null) {
                w(z3, z2);
            } else {
                this.f1985T = getErrorCurrentTextColors();
            }
        } else if (!this.f2010m || (c0204b0 = this.f2013o) == null) {
            if (z3) {
                this.f1985T = this.m0;
            } else if (z2) {
                this.f1985T = this.f2009l0;
            } else {
                this.f1985T = this.f2007k0;
            }
        } else if (this.f2012n0 != null) {
            w(z3, z2);
        } else {
            this.f1985T = c0204b0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f1993c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f692c;
        ColorStateList colorStateList = pVar.d;
        TextInputLayout textInputLayout = pVar.f690a;
        c.t0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f697k;
        CheckableImageButton checkableImageButton2 = pVar.f695g;
        c.t0(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof R0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                c.d(textInputLayout, checkableImageButton2, pVar.f697k, pVar.f698l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f1991b;
        c.t0(yVar.f756a, yVar.d, yVar.f759e);
        if (this.f1980O == 2) {
            int i = this.f1982Q;
            if (z3 && isEnabled()) {
                this.f1982Q = this.f1984S;
            } else {
                this.f1982Q = this.f1983R;
            }
            if (this.f1982Q != i && e() && !this.f2025u0) {
                if (e()) {
                    ((R0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1980O == 1) {
            if (!isEnabled()) {
                this.f1986U = this.f2016p0;
            } else if (z2 && !z3) {
                this.f1986U = this.f2019r0;
            } else if (z3) {
                this.f1986U = this.q0;
            } else {
                this.f1986U = this.f2014o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1991b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1993c.f695g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1993c.f695g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1993c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1993c.f695g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f1993c;
        CheckableImageButton checkableImageButton = pVar.f695g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f697k;
            PorterDuff.Mode mode = pVar.f698l;
            TextInputLayout textInputLayout = pVar.f690a;
            c.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c.t0(textInputLayout, checkableImageButton, pVar.f697k);
        }
    }
}
