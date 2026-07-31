package com.google.android.material.textfield;

import a0.g1;
import a6.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.text.StaticLayout;
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
import b.q;
import c5.h;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import l.j0;
import l.r0;
import l.s;
import q3.k0;
import r5.b;
import r5.c;
import r5.k;
import w5.d;
import w5.f;
import w5.j;
import w5.l;
import w5.m;
import w5.n;
import z5.g;
import z5.o;
import z5.r;
import z5.t;
import z5.u;
import z5.v;
import z5.w;
import z5.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] G0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public h A;
    public boolean A0;
    public h B;
    public boolean B0;
    public ColorStateList C;
    public ValueAnimator C0;
    public ColorStateList D;
    public boolean D0;
    public ColorStateList E;
    public boolean E0;
    public ColorStateList F;
    public boolean F0;
    public boolean G;
    public CharSequence H;
    public boolean I;
    public j J;
    public j K;
    public StateListDrawable L;
    public boolean M;
    public j N;
    public j O;
    public n P;
    public boolean Q;
    public final int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1963a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1964b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f1965c0;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f1966d;

    /* renamed from: d0, reason: collision with root package name */
    public final Rect f1967d0;

    /* renamed from: e, reason: collision with root package name */
    public final t f1968e;

    /* renamed from: e0, reason: collision with root package name */
    public final RectF f1969e0;

    /* renamed from: f, reason: collision with root package name */
    public final o f1970f;

    /* renamed from: f0, reason: collision with root package name */
    public Typeface f1971f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f1972g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorDrawable f1973g0;

    /* renamed from: h, reason: collision with root package name */
    public EditText f1974h;

    /* renamed from: h0, reason: collision with root package name */
    public int f1975h0;
    public CharSequence i;

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f1976i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1977j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorDrawable f1978j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1979k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1980k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1981l;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f1982l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1983m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f1984m0;

    /* renamed from: n, reason: collision with root package name */
    public final r f1985n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f1986n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1987o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1988o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1989p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1990p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1991q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1992q0;

    /* renamed from: r, reason: collision with root package name */
    public w f1993r;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f1994r0;

    /* renamed from: s, reason: collision with root package name */
    public j0 f1995s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1996s0;

    /* renamed from: t, reason: collision with root package name */
    public int f1997t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1998t0;

    /* renamed from: u, reason: collision with root package name */
    public int f1999u;

    /* renamed from: u0, reason: collision with root package name */
    public int f2000u0;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f2001v;

    /* renamed from: v0, reason: collision with root package name */
    public int f2002v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2003w;

    /* renamed from: w0, reason: collision with root package name */
    public int f2004w0;

    /* renamed from: x, reason: collision with root package name */
    public j0 f2005x;

    /* renamed from: x0, reason: collision with root package name */
    public int f2006x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2007y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2008y0;

    /* renamed from: z, reason: collision with root package name */
    public int f2009z;

    /* renamed from: z0, reason: collision with root package name */
    public final b f2010z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.textInputStyle, com.snovikpovik.vuevnxsj.R.style.Widget_Design_TextInputLayout), attributeSet, com.snovikpovik.vuevnxsj.R.attr.textInputStyle);
        this.f1977j = -1;
        this.f1979k = -1;
        this.f1981l = -1;
        this.f1983m = -1;
        this.f1985n = new r(this);
        this.f1993r = new c5.n(18);
        this.f1965c0 = new Rect();
        this.f1967d0 = new Rect();
        this.f1969e0 = new RectF();
        this.f1976i0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f2010z0 = bVar;
        this.F0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1966d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = g5.a.f3031a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f6627g != 8388659) {
            bVar.f6627g = 8388659;
            bVar.j(false);
        }
        k.a(context2, attributeSet, com.snovikpovik.vuevnxsj.R.attr.textInputStyle, com.snovikpovik.vuevnxsj.R.style.Widget_Design_TextInputLayout);
        int[] iArr = f5.a.f2758x;
        k.b(context2, attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.textInputStyle, com.snovikpovik.vuevnxsj.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.snovikpovik.vuevnxsj.R.attr.textInputStyle, com.snovikpovik.vuevnxsj.R.style.Widget_Design_TextInputLayout);
        g1 g1Var = new g1(context2, obtainStyledAttributes);
        t tVar = new t(this, g1Var);
        this.f1968e = tVar;
        this.G = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.B0 = obtainStyledAttributes.getBoolean(47, true);
        this.A0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.P = n.b(context2, attributeSet, com.snovikpovik.vuevnxsj.R.attr.textInputStyle, com.snovikpovik.vuevnxsj.R.style.Widget_Design_TextInputLayout).a();
        this.R = context2.getResources().getDimensionPixelOffset(com.snovikpovik.vuevnxsj.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.T = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1972g = getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.V = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.W = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.U = this.V;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        m f6 = this.P.f();
        if (dimension >= 0.0f) {
            f6.f8131e = new w5.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            f6.f8132f = new w5.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            f6.f8133g = new w5.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            f6.f8134h = new w5.a(dimension4);
        }
        this.P = f6.a();
        ColorStateList B = r2.o.B(context2, g1Var, 7);
        if (B != null) {
            int defaultColor = B.getDefaultColor();
            this.f1996s0 = defaultColor;
            this.f1964b0 = defaultColor;
            if (B.isStateful()) {
                this.f1998t0 = B.getColorForState(new int[]{-16842910}, -1);
                this.f2000u0 = B.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2002v0 = B.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2000u0 = this.f1996s0;
                ColorStateList q4 = s6.a.q(context2, com.snovikpovik.vuevnxsj.R.color.mtrl_filled_background_color);
                this.f1998t0 = q4.getColorForState(new int[]{-16842910}, -1);
                this.f2002v0 = q4.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1964b0 = 0;
            this.f1996s0 = 0;
            this.f1998t0 = 0;
            this.f2000u0 = 0;
            this.f2002v0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList p7 = g1Var.p(1);
            this.f1986n0 = p7;
            this.f1984m0 = p7;
        }
        ColorStateList B2 = r2.o.B(context2, g1Var, 14);
        this.f1992q0 = obtainStyledAttributes.getColor(14, 0);
        this.f1988o0 = context2.getColor(com.snovikpovik.vuevnxsj.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2004w0 = context2.getColor(com.snovikpovik.vuevnxsj.R.color.mtrl_textinput_disabled_color);
        this.f1990p0 = context2.getColor(com.snovikpovik.vuevnxsj.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (B2 != null) {
            setBoxStrokeColorStateList(B2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(r2.o.B(context2, g1Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.E = g1Var.p(24);
        this.F = g1Var.p(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z7 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z8 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1999u = obtainStyledAttributes.getResourceId(22, 0);
        this.f1997t = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1997t);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1999u);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(g1Var.p(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(g1Var.p(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(g1Var.p(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(g1Var.p(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(g1Var.p(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(g1Var.p(59));
        }
        o oVar = new o(this, g1Var);
        this.f1970f = oVar;
        boolean z9 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        g1Var.G();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(tVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(z9);
        setHelperTextEnabled(z7);
        setErrorEnabled(z3);
        setCounterEnabled(z8);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1974h;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.J;
        }
        int B = h0.a.B(this.f1974h, com.snovikpovik.vuevnxsj.R.attr.colorControlHighlight);
        int i = this.S;
        int[][] iArr = G0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            j jVar = this.J;
            int i8 = this.f1964b0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{h0.a.M(0.1f, B, i8), i8}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.J;
        TypedValue S = r2.r.S(context, com.snovikpovik.vuevnxsj.R.attr.colorSurface, "TextInputLayout");
        int i9 = S.resourceId;
        int color = i9 != 0 ? context.getColor(i9) : S.data;
        j jVar3 = new j(jVar2.f8105e.f8087a);
        int M = h0.a.M(0.1f, B, color);
        jVar3.n(new ColorStateList(iArr, new int[]{M, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{M, color});
        j jVar4 = new j(jVar2.f8105e.f8087a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.L == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.L = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.L.addState(new int[0], h(false));
        }
        return this.L;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.K == null) {
            this.K = h(true);
        }
        return this.K;
    }

    public static void m(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1974h != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1974h = editText;
        int i = this.f1977j;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f1981l);
        }
        int i8 = this.f1979k;
        if (i8 != -1) {
            setMaxEms(i8);
        } else {
            setMaxWidth(this.f1983m);
        }
        this.M = false;
        k();
        setTextInputAccessibilityDelegate(new v(this));
        Typeface typeface = this.f1974h.getTypeface();
        b bVar = this.f2010z0;
        bVar.n(typeface);
        float textSize = this.f1974h.getTextSize();
        if (bVar.f6629h != textSize) {
            bVar.f6629h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f1974h.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f1974h.getGravity();
        int i9 = (gravity & (-113)) | 48;
        if (bVar.f6627g != i9) {
            bVar.f6627g = i9;
            bVar.j(false);
        }
        if (bVar.f6625f != gravity) {
            bVar.f6625f = gravity;
            bVar.j(false);
        }
        this.f2006x0 = editText.getMinimumHeight();
        this.f1974h.addTextChangedListener(new u(this, editText));
        if (this.f1984m0 == null) {
            this.f1984m0 = this.f1974h.getHintTextColors();
        }
        if (this.G) {
            if (TextUtils.isEmpty(this.H)) {
                CharSequence hint = this.f1974h.getHint();
                this.i = hint;
                setHint(hint);
                this.f1974h.setHint((CharSequence) null);
            }
            this.I = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f1995s != null) {
            p(this.f1974h.getText());
        }
        t();
        this.f1985n.b();
        this.f1968e.bringToFront();
        o oVar = this.f1970f;
        oVar.bringToFront();
        Iterator it = this.f1976i0.iterator();
        while (it.hasNext()) {
            ((z5.m) it.next()).a(this);
        }
        oVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.H)) {
            return;
        }
        this.H = charSequence;
        b bVar = this.f2010z0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.f2008y0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f2003w == z3) {
            return;
        }
        if (z3) {
            j0 j0Var = this.f2005x;
            if (j0Var != null) {
                this.f1966d.addView(j0Var);
                this.f2005x.setVisibility(0);
            }
        } else {
            j0 j0Var2 = this.f2005x;
            if (j0Var2 != null) {
                j0Var2.setVisibility(8);
            }
            this.f2005x = null;
        }
        this.f2003w = z3;
    }

    public final void a() {
        if (this.f1974h == null || this.S != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f1974h;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f2010z0.f() + this.f1972g), this.f1974h.getPaddingEnd(), getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f1974h;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1974h.getPaddingEnd(), getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (r2.o.U(getContext())) {
            EditText editText3 = this.f1974h;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1974h.getPaddingEnd(), getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1966d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f6) {
        b bVar = this.f2010z0;
        if (bVar.f6617b == f6) {
            return;
        }
        int i = 2;
        if (this.C0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.C0 = valueAnimator;
            valueAnimator.setInterpolator(r2.r.R(getContext(), com.snovikpovik.vuevnxsj.R.attr.motionEasingEmphasizedInterpolator, g5.a.f3032b));
            this.C0.setDuration(r2.r.Q(getContext(), com.snovikpovik.vuevnxsj.R.attr.motionDurationMedium4, 167));
            this.C0.addUpdateListener(new k5.b(i, this));
        }
        this.C0.setFloatValues(bVar.f6617b, f6);
        this.C0.start();
    }

    public final void c() {
        int i;
        int i8;
        j jVar = this.J;
        if (jVar == null) {
            return;
        }
        n nVar = jVar.f8105e.f8087a;
        n nVar2 = this.P;
        if (nVar != nVar2) {
            jVar.setShapeAppearanceModel(nVar2);
        }
        if (this.S == 2 && (i = this.U) > -1 && (i8 = this.f1963a0) != 0) {
            j jVar2 = this.J;
            jVar2.f8105e.f8096k = i;
            jVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i8);
            w5.h hVar = jVar2.f8105e;
            if (hVar.f8091e != valueOf) {
                hVar.f8091e = valueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i9 = this.f1964b0;
        if (this.S == 1) {
            i9 = i3.a.b(this.f1964b0, h0.a.A(getContext(), com.snovikpovik.vuevnxsj.R.attr.colorSurface, 0));
        }
        this.f1964b0 = i9;
        this.J.n(ColorStateList.valueOf(i9));
        j jVar3 = this.N;
        if (jVar3 != null && this.O != null) {
            if (this.U > -1 && this.f1963a0 != 0) {
                jVar3.n(this.f1974h.isFocused() ? ColorStateList.valueOf(this.f1988o0) : ColorStateList.valueOf(this.f1963a0));
                this.O.n(ColorStateList.valueOf(this.f1963a0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f1974h == null) {
            throw new IllegalStateException();
        }
        boolean z3 = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f1967d0;
        rect2.bottom = i;
        int i8 = this.S;
        if (i8 == 1) {
            rect2.left = i(rect.left, z3);
            rect2.top = rect.top + this.T;
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        if (i8 != 2) {
            rect2.left = i(rect.left, z3);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        rect2.left = this.f1974h.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f1974h.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f1974h;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.i != null) {
            boolean z3 = this.I;
            this.I = false;
            CharSequence hint = editText.getHint();
            this.f1974h.setHint(this.i);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f1974h.setHint(hint);
                this.I = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1966d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i8 = 0; i8 < frameLayout.getChildCount(); i8++) {
            View childAt = frameLayout.getChildAt(i8);
            ViewStructure newChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f1974h) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.E0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.E0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z3 = this.G;
        b bVar = this.f2010z0;
        if (z3) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f6623e;
            int save = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f6 = bVar.f6641q;
                float f8 = bVar.f6642r;
                float f9 = bVar.F;
                if (f9 != 1.0f) {
                    canvas2.scale(f9, f9, f6, f8);
                }
                if ((bVar.f6624e0 > 1 || bVar.f6626f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f6641q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f8);
                    float f10 = alpha;
                    textPaint.setAlpha((int) (bVar.f6620c0 * f10));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f11 = bVar.H;
                        float f12 = bVar.I;
                        float f13 = bVar.J;
                        int i8 = bVar.K;
                        textPaint.setShadowLayer(f11, f12, f13, i3.a.d(i8, (textPaint.getAlpha() * Color.alpha(i8)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f6618b0 * f10));
                    if (i >= 31) {
                        float f14 = bVar.H;
                        float f15 = bVar.I;
                        float f16 = bVar.J;
                        int i9 = bVar.K;
                        textPaint.setShadowLayer(f14, f15, f16, i3.a.d(i9, (Color.alpha(i9) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f6622d0;
                    float f17 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f17, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String trim = bVar.f6622d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f17, (Paint) textPaint);
                } else {
                    canvas2.translate(f6, f8);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.O == null || (jVar = this.N) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.f1974h.isFocused()) {
            Rect bounds = this.O.getBounds();
            Rect bounds2 = this.N.getBounds();
            float f18 = bVar.f6617b;
            int centerX = bounds2.centerX();
            bounds.left = g5.a.c(f18, centerX, bounds2.left);
            bounds.right = g5.a.c(f18, centerX, bounds2.right);
            this.O.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z3;
        ColorStateList colorStateList;
        if (this.D0) {
            return;
        }
        this.D0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f2010z0;
        if (bVar != null) {
            bVar.M = drawableState;
            ColorStateList colorStateList2 = bVar.f6634k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f6632j) != null && colorStateList.isStateful())) {
                bVar.j(false);
                z3 = true;
                if (this.f1974h != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z3) {
                    invalidate();
                }
                this.D0 = false;
            }
        }
        z3 = false;
        if (this.f1974h != null) {
        }
        t();
        z();
        if (z3) {
        }
        this.D0 = false;
    }

    public final int e() {
        if (this.G) {
            int i = this.S;
            b bVar = this.f2010z0;
            if (i == 0) {
                return (int) bVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f6 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.i);
                textPaint.setTypeface(bVar.f6643s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f6 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.f1705f = r2.r.Q(getContext(), com.snovikpovik.vuevnxsj.R.attr.motionDurationShort2, 87);
        hVar.f1706g = r2.r.R(getContext(), com.snovikpovik.vuevnxsj.R.attr.motionEasingLinearInterpolator, g5.a.f3031a);
        return hVar;
    }

    public final boolean g() {
        return this.G && !TextUtils.isEmpty(this.H) && (this.J instanceof z5.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1974h;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i = this.S;
        if (i == 1 || i == 2) {
            return this.J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1964b0;
    }

    public int getBoxBackgroundMode() {
        return this.S;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.T;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1969e0;
        return layoutDirection == 1 ? this.P.f8145h.a(rectF) : this.P.f8144g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1969e0;
        return layoutDirection == 1 ? this.P.f8144g.a(rectF) : this.P.f8145h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1969e0;
        return layoutDirection == 1 ? this.P.f8142e.a(rectF) : this.P.f8143f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1969e0;
        return layoutDirection == 1 ? this.P.f8143f.a(rectF) : this.P.f8142e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1992q0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1994r0;
    }

    public int getBoxStrokeWidth() {
        return this.V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.W;
    }

    public int getCounterMaxLength() {
        return this.f1989p;
    }

    public CharSequence getCounterOverflowDescription() {
        j0 j0Var;
        if (this.f1987o && this.f1991q && (j0Var = this.f1995s) != null) {
            return j0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    public ColorStateList getCounterTextColor() {
        return this.C;
    }

    public ColorStateList getCursorColor() {
        return this.E;
    }

    public ColorStateList getCursorErrorColor() {
        return this.F;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1984m0;
    }

    public EditText getEditText() {
        return this.f1974h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1970f.f9222j.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1970f.f9222j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1970f.f9228p;
    }

    public int getEndIconMode() {
        return this.f1970f.f9224l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1970f.f9229q;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1970f.f9222j;
    }

    public CharSequence getError() {
        r rVar = this.f1985n;
        if (rVar.f9258q) {
            return rVar.f9257p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1985n.f9261t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1985n.f9260s;
    }

    public int getErrorCurrentTextColors() {
        j0 j0Var = this.f1985n.f9259r;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1970f.f9219f.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.f1985n;
        if (rVar.f9265x) {
            return rVar.f9264w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        j0 j0Var = this.f1985n.f9266y;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.G) {
            return this.H;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2010z0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2010z0;
        return bVar.g(bVar.f6634k);
    }

    public int getHintMaxLines() {
        return this.f2010z0.f6624e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1986n0;
    }

    public w getLengthCounter() {
        return this.f1993r;
    }

    public int getMaxEms() {
        return this.f1979k;
    }

    public int getMaxWidth() {
        return this.f1983m;
    }

    public int getMinEms() {
        return this.f1977j;
    }

    public int getMinWidth() {
        return this.f1981l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1970f.f9222j.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1970f.f9222j.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2003w) {
            return this.f2001v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2009z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2007y;
    }

    public CharSequence getPrefixText() {
        return this.f1968e.f9273f;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1968e.f9272e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1968e.f9272e;
    }

    public n getShapeAppearanceModel() {
        return this.P;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1968e.f9274g.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1968e.f9274g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1968e.f9276j;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1968e.f9277k;
    }

    public CharSequence getSuffixText() {
        return this.f1970f.f9231s;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1970f.f9232t.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1970f.f9232t;
    }

    public Typeface getTypeface() {
        return this.f1971f0;
    }

    public final j h(boolean z3) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.snovikpovik.vuevnxsj.R.dimen.mtrl_shape_corner_size_small_component);
        float f6 = z3 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.snovikpovik.vuevnxsj.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.snovikpovik.vuevnxsj.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        l lVar = new l();
        l lVar2 = new l();
        l lVar3 = new l();
        l lVar4 = new l();
        int i = 0;
        f fVar = new f(i);
        f fVar2 = new f(i);
        f fVar3 = new f(i);
        f fVar4 = new f(i);
        w5.a aVar = new w5.a(f6);
        w5.a aVar2 = new w5.a(f6);
        w5.a aVar3 = new w5.a(dimensionPixelOffset);
        w5.a aVar4 = new w5.a(dimensionPixelOffset);
        n nVar = new n();
        nVar.f8138a = lVar;
        nVar.f8139b = lVar2;
        nVar.f8140c = lVar3;
        nVar.f8141d = lVar4;
        nVar.f8142e = aVar;
        nVar.f8143f = aVar2;
        nVar.f8144g = aVar4;
        nVar.f8145h = aVar3;
        nVar.i = fVar;
        nVar.f8146j = fVar2;
        nVar.f8147k = fVar3;
        nVar.f8148l = fVar4;
        Context context = getContext();
        Paint paint = j.H;
        TypedValue S = r2.r.S(context, com.snovikpovik.vuevnxsj.R.attr.colorSurface, j.class.getSimpleName());
        int i8 = S.resourceId;
        ColorStateList valueOf = ColorStateList.valueOf(i8 != 0 ? context.getColor(i8) : S.data);
        j jVar = new j();
        jVar.k(context);
        jVar.n(valueOf);
        jVar.m(dimensionPixelOffset2);
        jVar.setShapeAppearanceModel(nVar);
        w5.h hVar = jVar.f8105e;
        if (hVar.f8094h == null) {
            hVar.f8094h = new Rect();
        }
        jVar.f8105e.f8094h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f1974h.getCompoundPaddingLeft() : this.f1970f.c() : this.f1968e.a()) + i;
    }

    public final int j(int i, boolean z3) {
        return i - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f1974h.getCompoundPaddingRight() : this.f1968e.a() : this.f1970f.c());
    }

    public final void k() {
        int i = this.S;
        if (i == 0) {
            this.J = null;
            this.N = null;
            this.O = null;
        } else if (i == 1) {
            this.J = new j(this.P);
            this.N = new j();
            this.O = new j();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.S + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.G || (this.J instanceof z5.h)) {
                this.J = new j(this.P);
            } else {
                n nVar = this.P;
                int i8 = z5.h.K;
                if (nVar == null) {
                    nVar = new n();
                }
                g gVar = new g(nVar, new RectF());
                z5.h hVar = new z5.h(gVar);
                hVar.J = gVar;
                this.J = hVar;
            }
            this.N = null;
            this.O = null;
        }
        u();
        z();
        if (this.S == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.T = getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (r2.o.U(getContext())) {
                this.T = getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.S != 0) {
            v();
        }
        EditText editText = this.f1974h;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i9 = this.S;
                if (i9 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i9 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f6;
        float f8;
        float f9;
        RectF rectF;
        float f10;
        int i;
        float f11;
        int i8;
        if (g()) {
            int width = this.f1974h.getWidth();
            int gravity = this.f1974h.getGravity();
            b bVar = this.f2010z0;
            boolean c8 = bVar.c(bVar.B);
            bVar.D = c8;
            Rect rect = bVar.f6621d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c8) {
                        i8 = rect.left;
                        f9 = i8;
                    } else {
                        f6 = rect.right;
                        f8 = bVar.f6616a0;
                    }
                } else if (c8) {
                    f6 = rect.right;
                    f8 = bVar.f6616a0;
                } else {
                    i8 = rect.left;
                    f9 = i8;
                }
                float max = Math.max(f9, rect.left);
                rectF = this.f1969e0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f10 = (width / 2.0f) + (bVar.f6616a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.D) {
                        f11 = bVar.f6616a0;
                        f10 = f11 + max;
                    } else {
                        i = rect.right;
                        f10 = i;
                    }
                } else if (bVar.D) {
                    i = rect.right;
                    f10 = i;
                } else {
                    f11 = bVar.f6616a0;
                    f10 = f11 + max;
                }
                rectF.right = Math.min(f10, rect.right);
                rectF.bottom = bVar.f() + rect.top;
                if (bVar.Z != null && !bVar.o()) {
                    StaticLayout staticLayout = bVar.Z;
                    float lineWidth = (bVar.i / bVar.f6629h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (bVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f12 = rectF.left;
                float f13 = this.R;
                rectF.left = f12 - f13;
                rectF.right += f13;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.U);
                rectF.top = 0.0f;
                z5.h hVar = (z5.h) this.J;
                hVar.getClass();
                hVar.t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f6 = width / 2.0f;
            f8 = bVar.f6616a0 / 2.0f;
            f9 = f6 - f8;
            float max2 = Math.max(f9, rect.left);
            rectF = this.f1969e0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f10 = (width / 2.0f) + (bVar.f6616a0 / 2.0f);
            rectF.right = Math.min(f10, rect.right);
            rectF.bottom = bVar.f() + rect.top;
            if (bVar.Z != null) {
                StaticLayout staticLayout2 = bVar.Z;
                float lineWidth2 = (bVar.i / bVar.f6629h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (bVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(j0 j0Var, int i) {
        try {
            j0Var.setTextAppearance(i);
            if (j0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j0Var.setTextAppearance(com.snovikpovik.vuevnxsj.R.style.TextAppearance_AppCompat_Caption);
        j0Var.setTextColor(getContext().getColor(com.snovikpovik.vuevnxsj.R.color.design_error));
    }

    public final boolean o() {
        r rVar = this.f1985n;
        return (rVar.f9256o != 1 || rVar.f9259r == null || TextUtils.isEmpty(rVar.f9257p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2010z0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        o oVar = this.f1970f;
        oVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.F0 = false;
        if (this.f1974h != null && this.f1974h.getMeasuredHeight() < (max = Math.max(oVar.getMeasuredHeight(), this.f1968e.getMeasuredHeight()))) {
            this.f1974h.setMinimumHeight(max);
            z3 = true;
        }
        boolean s5 = s();
        if (z3 || s5) {
            this.f1974h.post(new a1.a(16, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        float descent;
        int i11;
        int compoundPaddingTop;
        super.onLayout(z3, i, i8, i9, i10);
        EditText editText = this.f1974h;
        if (editText != null) {
            Rect rect = this.f1965c0;
            c.a(this, editText, rect);
            j jVar = this.N;
            if (jVar != null) {
                int i12 = rect.bottom;
                jVar.setBounds(rect.left, i12 - this.V, rect.right, i12);
            }
            j jVar2 = this.O;
            if (jVar2 != null) {
                int i13 = rect.bottom;
                jVar2.setBounds(rect.left, i13 - this.W, rect.right, i13);
            }
            if (this.G) {
                float textSize = this.f1974h.getTextSize();
                b bVar = this.f2010z0;
                float f6 = bVar.f6629h;
                TextPaint textPaint = bVar.P;
                if (f6 != textSize) {
                    bVar.f6629h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f1974h.getGravity();
                int i14 = (gravity & (-113)) | 48;
                if (bVar.f6627g != i14) {
                    bVar.f6627g = i14;
                    bVar.j(false);
                }
                if (bVar.f6625f != gravity) {
                    bVar.f6625f = gravity;
                    bVar.j(false);
                }
                Rect d8 = d(rect);
                int i15 = d8.left;
                int i16 = d8.top;
                int i17 = d8.right;
                int i18 = d8.bottom;
                Rect rect2 = bVar.f6621d;
                if (rect2.left != i15 || rect2.top != i16 || rect2.right != i17 || rect2.bottom != i18) {
                    rect2.set(i15, i16, i17, i18);
                    bVar.N = true;
                }
                if (this.f1974h == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f6629h);
                    textPaint.setTypeface(bVar.f6646v);
                    textPaint.setLetterSpacing(bVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f6629h);
                    textPaint.setTypeface(bVar.f6646v);
                    textPaint.setLetterSpacing(bVar.X);
                    descent = bVar.f6636l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f1974h.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f1967d0;
                rect3.left = compoundPaddingLeft;
                if (this.S != 1 || this.f1974h.getMinLines() > 1) {
                    if (this.S != 0 || getHintMaxLines() == 1) {
                        i11 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f6629h);
                        textPaint.setTypeface(bVar.f6646v);
                        textPaint.setLetterSpacing(bVar.X);
                        i11 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f1974h.getCompoundPaddingTop() + rect.top) - i11;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f1974h.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.S != 1 || this.f1974h.getMinLines() > 1) ? rect.bottom - this.f1974h.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i19 = rect3.left;
                int i20 = rect3.top;
                int i21 = rect3.right;
                Rect rect4 = bVar.f6619c;
                if (rect4.left != i19 || rect4.top != i20 || rect4.right != i21 || rect4.bottom != compoundPaddingBottom || true != bVar.f6635k0) {
                    rect4.set(i19, i20, i21, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f6635k0 = true;
                }
                bVar.j(false);
                if (!g() || this.f2008y0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        float f6;
        EditText editText;
        super.onMeasure(i, i8);
        boolean z3 = this.F0;
        o oVar = this.f1970f;
        if (!z3) {
            oVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.F0 = true;
        }
        if (this.f2005x != null && (editText = this.f1974h) != null) {
            this.f2005x.setGravity(editText.getGravity());
            this.f2005x.setPadding(this.f1974h.getCompoundPaddingLeft(), this.f1974h.getCompoundPaddingTop(), this.f1974h.getCompoundPaddingRight(), this.f1974h.getCompoundPaddingBottom());
        }
        oVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f1974h.getMeasuredWidth() - this.f1974h.getCompoundPaddingLeft()) - this.f1974h.getCompoundPaddingRight();
        b bVar = this.f2010z0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.i);
        textPaint.setTypeface(bVar.f6643s);
        textPaint.setLetterSpacing(bVar.W);
        float f8 = measuredWidth;
        bVar.f6631i0 = bVar.e(bVar.f6626f0, textPaint, bVar.B, (bVar.i / bVar.f6629h) * f8, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f6629h);
        textPaint.setTypeface(bVar.f6646v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f6633j0 = bVar.e(bVar.f6624e0, textPaint, bVar.B, f8, bVar.D).getHeight();
        EditText editText2 = this.f1974h;
        Rect rect = this.f1965c0;
        c.a(this, editText2, rect);
        Rect d8 = d(rect);
        int i9 = d8.left;
        int i10 = d8.top;
        int i11 = d8.right;
        int i12 = d8.bottom;
        Rect rect2 = bVar.f6621d;
        if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
            rect2.set(i9, i10, i11, i12);
            bVar.N = true;
        }
        v();
        a();
        if (this.f1974h == null) {
            return;
        }
        int i13 = bVar.f6633j0;
        if (i13 != -1) {
            f6 = i13;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f6629h);
            textPaint2.setTypeface(bVar.f6646v);
            textPaint2.setLetterSpacing(bVar.X);
            f6 = -textPaint2.ascent();
        }
        if (this.f2001v != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f2005x.getPaint());
            textPaint3.setTextSize(this.f2005x.getTextSize());
            textPaint3.setTypeface(this.f2005x.getTypeface());
            textPaint3.setLetterSpacing(this.f2005x.getLetterSpacing());
            r5.g gVar = new r5.g(this.f2001v, textPaint3, measuredWidth);
            gVar.f6668k = getLayoutDirection() == 1;
            gVar.f6667j = true;
            float lineSpacingExtra = this.f2005x.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f2005x.getLineSpacingMultiplier();
            gVar.f6665g = lineSpacingExtra;
            gVar.f6666h = lineSpacingMultiplier;
            gVar.f6670m = new q(this);
            r3 = (this.S == 1 ? bVar.f() + this.T + this.f1972g : 0.0f) + gVar.a().getHeight();
        }
        float max = Math.max(f6, r3);
        if (this.f1974h.getMeasuredHeight() < max) {
            this.f1974h.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f7877d);
        setError(xVar.f9284f);
        if (xVar.f9285g) {
            post(new h4.b(12, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z3 = i == 1;
        if (z3 != this.Q) {
            d dVar = this.P.f8142e;
            RectF rectF = this.f1969e0;
            float a8 = dVar.a(rectF);
            float a9 = this.P.f8143f.a(rectF);
            float a10 = this.P.f8145h.a(rectF);
            float a11 = this.P.f8144g.a(rectF);
            n nVar = this.P;
            r2.r rVar = nVar.f8138a;
            r2.r rVar2 = nVar.f8139b;
            r2.r rVar3 = nVar.f8141d;
            r2.r rVar4 = nVar.f8140c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            w5.a aVar = new w5.a(a9);
            w5.a aVar2 = new w5.a(a8);
            w5.a aVar3 = new w5.a(a11);
            w5.a aVar4 = new w5.a(a10);
            n nVar2 = new n();
            nVar2.f8138a = rVar2;
            nVar2.f8139b = rVar;
            nVar2.f8140c = rVar3;
            nVar2.f8141d = rVar4;
            nVar2.f8142e = aVar;
            nVar2.f8143f = aVar2;
            nVar2.f8144g = aVar4;
            nVar2.f8145h = aVar3;
            nVar2.i = fVar;
            nVar2.f8146j = fVar2;
            nVar2.f8147k = fVar3;
            nVar2.f8148l = fVar4;
            this.Q = z3;
            setShapeAppearanceModel(nVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        if (o()) {
            xVar.f9284f = getError();
        }
        o oVar = this.f1970f;
        xVar.f9285g = oVar.f9224l != 0 && oVar.f9222j.f1930g;
        return xVar;
    }

    public final void p(Editable editable) {
        ((c5.n) this.f1993r).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f1991q;
        int i = this.f1989p;
        if (i == -1) {
            this.f1995s.setText(String.valueOf(length));
            this.f1995s.setContentDescription(null);
            this.f1991q = false;
        } else {
            this.f1991q = length > i;
            Context context = getContext();
            this.f1995s.setContentDescription(context.getString(this.f1991q ? com.snovikpovik.vuevnxsj.R.string.character_counter_overflowed_content_description : com.snovikpovik.vuevnxsj.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1989p)));
            if (z3 != this.f1991q) {
                q();
            }
            String str = o3.b.f5604b;
            o3.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? o3.b.f5607e : o3.b.f5606d;
            j0 j0Var = this.f1995s;
            String string = getContext().getString(com.snovikpovik.vuevnxsj.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1989p));
            bVar.getClass();
            k5.c cVar = o3.f.f5614a;
            j0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f1974h == null || z3 == this.f1991q) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        j0 j0Var = this.f1995s;
        if (j0Var != null) {
            n(j0Var, this.f1991q ? this.f1997t : this.f1999u);
            if (!this.f1991q && (colorStateList2 = this.C) != null) {
                this.f1995s.setTextColor(colorStateList2);
            }
            if (!this.f1991q || (colorStateList = this.D) == null) {
                return;
            }
            this.f1995s.setTextColor(colorStateList);
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.E;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue P = r2.r.P(context, com.snovikpovik.vuevnxsj.R.attr.colorControlActivated);
            if (P != null) {
                int i = P.resourceId;
                if (i != 0) {
                    colorStateList2 = s6.a.q(context, i);
                } else {
                    int i8 = P.data;
                    if (i8 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i8);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f1974h;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f1974h.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((o() || (this.f1995s != null && this.f1991q)) && (colorStateList = this.F) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z3;
        o oVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f1974h == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z7 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            t tVar = this.f1968e;
            if (tVar.getMeasuredWidth() > 0) {
                int measuredWidth = tVar.getMeasuredWidth() - this.f1974h.getPaddingLeft();
                if (this.f1973g0 == null || this.f1975h0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1973g0 = colorDrawable3;
                    this.f1975h0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f1974h.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1973g0;
                if (drawable2 != colorDrawable4) {
                    this.f1974h.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z3 = true;
                    oVar = this.f1970f;
                    if ((!oVar.e() || ((oVar.f9224l != 0 && oVar.d()) || oVar.f9231s != null)) && oVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = oVar.f9232t.getMeasuredWidth() - this.f1974h.getPaddingRight();
                        if (!oVar.e()) {
                            checkableImageButton = oVar.f9219f;
                        } else if (oVar.f9224l != 0 && oVar.d()) {
                            checkableImageButton = oVar.f9222j;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f1974h.getCompoundDrawablesRelative();
                        colorDrawable = this.f1978j0;
                        if (colorDrawable == null && this.f1980k0 != measuredWidth2) {
                            this.f1980k0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f1974h.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1978j0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f1978j0 = colorDrawable5;
                            this.f1980k0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f1978j0;
                        if (drawable != colorDrawable2) {
                            this.f1982l0 = drawable;
                            this.f1974h.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f1978j0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f1974h.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1978j0) {
                            this.f1974h.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1982l0, compoundDrawablesRelative3[3]);
                        } else {
                            z7 = z3;
                        }
                        this.f1978j0 = null;
                        return z7;
                    }
                    return z3;
                }
                z3 = false;
                oVar = this.f1970f;
                if (oVar.e()) {
                }
                int measuredWidth22 = oVar.f9232t.getMeasuredWidth() - this.f1974h.getPaddingRight();
                if (!oVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f1974h.getCompoundDrawablesRelative();
                colorDrawable = this.f1978j0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1978j0;
                if (drawable != colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1973g0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f1974h.getCompoundDrawablesRelative();
            this.f1974h.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1973g0 = null;
            z3 = true;
            oVar = this.f1970f;
            if (oVar.e()) {
            }
            int measuredWidth222 = oVar.f9232t.getMeasuredWidth() - this.f1974h.getPaddingRight();
            if (!oVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f1974h.getCompoundDrawablesRelative();
            colorDrawable = this.f1978j0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1978j0;
            if (drawable != colorDrawable2) {
            }
            return z3;
        }
        z3 = false;
        oVar = this.f1970f;
        if (oVar.e()) {
        }
        int measuredWidth2222 = oVar.f9232t.getMeasuredWidth() - this.f1974h.getPaddingRight();
        if (!oVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f1974h.getCompoundDrawablesRelative();
        colorDrawable = this.f1978j0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1978j0;
        if (drawable != colorDrawable2) {
        }
        return z3;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1964b0 != i) {
            this.f1964b0 = i;
            this.f1996s0 = i;
            this.f2000u0 = i;
            this.f2002v0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1996s0 = defaultColor;
        this.f1964b0 = defaultColor;
        this.f1998t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2000u0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2002v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.S) {
            return;
        }
        this.S = i;
        if (this.f1974h != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.T = i;
    }

    public void setBoxCornerFamily(int i) {
        m f6 = this.P.f();
        d dVar = this.P.f8142e;
        f6.f8127a = r2.o.y(i);
        f6.f8131e = dVar;
        d dVar2 = this.P.f8143f;
        f6.f8128b = r2.o.y(i);
        f6.f8132f = dVar2;
        d dVar3 = this.P.f8145h;
        f6.f8130d = r2.o.y(i);
        f6.f8134h = dVar3;
        d dVar4 = this.P.f8144g;
        f6.f8129c = r2.o.y(i);
        f6.f8133g = dVar4;
        this.P = f6.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1992q0 != i) {
            this.f1992q0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1988o0 = colorStateList.getDefaultColor();
            this.f2004w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1990p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1992q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1992q0 != colorStateList.getDefaultColor()) {
            this.f1992q0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1994r0 != colorStateList) {
            this.f1994r0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.V = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.W = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f1987o != z3) {
            r rVar = this.f1985n;
            if (z3) {
                j0 j0Var = new j0(getContext(), null);
                this.f1995s = j0Var;
                j0Var.setId(com.snovikpovik.vuevnxsj.R.id.textinput_counter);
                Typeface typeface = this.f1971f0;
                if (typeface != null) {
                    this.f1995s.setTypeface(typeface);
                }
                this.f1995s.setMaxLines(1);
                rVar.a(this.f1995s, 2);
                ((ViewGroup.MarginLayoutParams) this.f1995s.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.snovikpovik.vuevnxsj.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1995s != null) {
                    EditText editText = this.f1974h;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                rVar.g(this.f1995s, 2);
                this.f1995s = null;
            }
            this.f1987o = z3;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1989p != i) {
            if (i > 0) {
                this.f1989p = i;
            } else {
                this.f1989p = -1;
            }
            if (!this.f1987o || this.f1995s == null) {
                return;
            }
            EditText editText = this.f1974h;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1997t != i) {
            this.f1997t = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1999u != i) {
            this.f1999u = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (o() || (this.f1995s != null && this.f1991q)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1984m0 = colorStateList;
        this.f1986n0 = colorStateList;
        if (this.f1974h != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        m(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f1970f.f9222j.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f1970f.f9222j.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i) {
        o oVar = this.f1970f;
        CharSequence text = i != 0 ? oVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = oVar.f9222j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        o oVar = this.f1970f;
        Drawable D = i != 0 ? h0.a.D(oVar.getContext(), i) : null;
        TextInputLayout textInputLayout = oVar.f9217d;
        CheckableImageButton checkableImageButton = oVar.f9222j;
        checkableImageButton.setImageDrawable(D);
        if (D != null) {
            r2.r.g(textInputLayout, checkableImageButton, oVar.f9226n, oVar.f9227o);
            r2.r.O(textInputLayout, checkableImageButton, oVar.f9226n);
        }
    }

    public void setEndIconMinSize(int i) {
        o oVar = this.f1970f;
        if (i < 0) {
            oVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != oVar.f9228p) {
            oVar.f9228p = i;
            CheckableImageButton checkableImageButton = oVar.f9222j;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = oVar.f9219f;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1970f.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f1970f;
        CheckableImageButton checkableImageButton = oVar.f9222j;
        View.OnLongClickListener onLongClickListener = oVar.f9230r;
        checkableImageButton.setOnClickListener(onClickListener);
        r2.r.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f1970f;
        oVar.f9230r = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f9222j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r2.r.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.f1970f;
        oVar.f9229q = scaleType;
        oVar.f9222j.setScaleType(scaleType);
        oVar.f9219f.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        o oVar = this.f1970f;
        if (oVar.f9226n != colorStateList) {
            oVar.f9226n = colorStateList;
            r2.r.g(oVar.f9217d, oVar.f9222j, colorStateList, oVar.f9227o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1970f;
        if (oVar.f9227o != mode) {
            oVar.f9227o = mode;
            r2.r.g(oVar.f9217d, oVar.f9222j, oVar.f9226n, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f1970f.h(z3);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.f1985n;
        if (!rVar.f9258q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            rVar.f();
            return;
        }
        rVar.c();
        rVar.f9257p = charSequence;
        rVar.f9259r.setText(charSequence);
        int i = rVar.f9255n;
        if (i != 1) {
            rVar.f9256o = 1;
        }
        rVar.i(i, rVar.f9256o, rVar.h(rVar.f9259r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        r rVar = this.f1985n;
        rVar.f9261t = i;
        j0 j0Var = rVar.f9259r;
        if (j0Var != null) {
            j0Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.f1985n;
        rVar.f9260s = charSequence;
        j0 j0Var = rVar.f9259r;
        if (j0Var != null) {
            j0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        r rVar = this.f1985n;
        TextInputLayout textInputLayout = rVar.f9250h;
        if (rVar.f9258q == z3) {
            return;
        }
        rVar.c();
        if (z3) {
            j0 j0Var = new j0(rVar.f9249g, null);
            rVar.f9259r = j0Var;
            j0Var.setId(com.snovikpovik.vuevnxsj.R.id.textinput_error);
            rVar.f9259r.setTextAlignment(5);
            Typeface typeface = rVar.B;
            if (typeface != null) {
                rVar.f9259r.setTypeface(typeface);
            }
            int i = rVar.f9262u;
            rVar.f9262u = i;
            j0 j0Var2 = rVar.f9259r;
            if (j0Var2 != null) {
                rVar.f9250h.n(j0Var2, i);
            }
            ColorStateList colorStateList = rVar.f9263v;
            rVar.f9263v = colorStateList;
            j0 j0Var3 = rVar.f9259r;
            if (j0Var3 != null && colorStateList != null) {
                j0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = rVar.f9260s;
            rVar.f9260s = charSequence;
            j0 j0Var4 = rVar.f9259r;
            if (j0Var4 != null) {
                j0Var4.setContentDescription(charSequence);
            }
            int i8 = rVar.f9261t;
            rVar.f9261t = i8;
            j0 j0Var5 = rVar.f9259r;
            if (j0Var5 != null) {
                j0Var5.setAccessibilityLiveRegion(i8);
            }
            rVar.f9259r.setVisibility(4);
            rVar.a(rVar.f9259r, 0);
        } else {
            rVar.f();
            rVar.g(rVar.f9259r, 0);
            rVar.f9259r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        rVar.f9258q = z3;
    }

    public void setErrorIconDrawable(int i) {
        o oVar = this.f1970f;
        oVar.i(i != 0 ? h0.a.D(oVar.getContext(), i) : null);
        r2.r.O(oVar.f9217d, oVar.f9219f, oVar.f9220g);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f1970f;
        CheckableImageButton checkableImageButton = oVar.f9219f;
        View.OnLongClickListener onLongClickListener = oVar.i;
        checkableImageButton.setOnClickListener(onClickListener);
        r2.r.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f1970f;
        oVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f9219f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r2.r.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        o oVar = this.f1970f;
        if (oVar.f9220g != colorStateList) {
            oVar.f9220g = colorStateList;
            r2.r.g(oVar.f9217d, oVar.f9219f, colorStateList, oVar.f9221h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1970f;
        if (oVar.f9221h != mode) {
            oVar.f9221h = mode;
            r2.r.g(oVar.f9217d, oVar.f9219f, oVar.f9220g, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        r rVar = this.f1985n;
        rVar.f9262u = i;
        j0 j0Var = rVar.f9259r;
        if (j0Var != null) {
            rVar.f9250h.n(j0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f1985n;
        rVar.f9263v = colorStateList;
        j0 j0Var = rVar.f9259r;
        if (j0Var == null || colorStateList == null) {
            return;
        }
        j0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.A0 != z3) {
            this.A0 = z3;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.f1985n;
        if (isEmpty) {
            if (rVar.f9265x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f9265x) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f9264w = charSequence;
        rVar.f9266y.setText(charSequence);
        int i = rVar.f9255n;
        if (i != 2) {
            rVar.f9256o = 2;
        }
        rVar.i(i, rVar.f9256o, rVar.h(rVar.f9266y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f1985n;
        rVar.A = colorStateList;
        j0 j0Var = rVar.f9266y;
        if (j0Var == null || colorStateList == null) {
            return;
        }
        j0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        r rVar = this.f1985n;
        TextInputLayout textInputLayout = rVar.f9250h;
        if (rVar.f9265x == z3) {
            return;
        }
        rVar.c();
        if (z3) {
            j0 j0Var = new j0(rVar.f9249g, null);
            rVar.f9266y = j0Var;
            j0Var.setId(com.snovikpovik.vuevnxsj.R.id.textinput_helper_text);
            rVar.f9266y.setTextAlignment(5);
            Typeface typeface = rVar.B;
            if (typeface != null) {
                rVar.f9266y.setTypeface(typeface);
            }
            rVar.f9266y.setVisibility(4);
            rVar.f9266y.setAccessibilityLiveRegion(1);
            int i = rVar.f9267z;
            rVar.f9267z = i;
            j0 j0Var2 = rVar.f9266y;
            if (j0Var2 != null) {
                j0Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = rVar.A;
            rVar.A = colorStateList;
            j0 j0Var3 = rVar.f9266y;
            if (j0Var3 != null && colorStateList != null) {
                j0Var3.setTextColor(colorStateList);
            }
            rVar.a(rVar.f9266y, 1);
            rVar.f9266y.setAccessibilityDelegate(new z5.q(rVar));
        } else {
            rVar.c();
            int i8 = rVar.f9255n;
            if (i8 == 2) {
                rVar.f9256o = 0;
            }
            rVar.i(i8, rVar.f9256o, rVar.h(rVar.f9266y, ""));
            rVar.g(rVar.f9266y, 1);
            rVar.f9266y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        rVar.f9265x = z3;
    }

    public void setHelperTextTextAppearance(int i) {
        r rVar = this.f1985n;
        rVar.f9267z = i;
        j0 j0Var = rVar.f9266y;
        if (j0Var != null) {
            j0Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.B0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.G) {
            this.G = z3;
            if (z3) {
                CharSequence hint = this.f1974h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.H)) {
                        setHint(hint);
                    }
                    this.f1974h.setHint((CharSequence) null);
                }
                this.I = true;
            } else {
                this.I = false;
                if (!TextUtils.isEmpty(this.H) && TextUtils.isEmpty(this.f1974h.getHint())) {
                    this.f1974h.setHint(this.H);
                }
                setHintInternal(null);
            }
            if (this.f1974h != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        b bVar = this.f2010z0;
        if (i != bVar.f6626f0) {
            bVar.f6626f0 = i;
            bVar.j(false);
        }
        if (i != bVar.f6624e0) {
            bVar.f6624e0 = i;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f2010z0;
        TextInputLayout textInputLayout = bVar.f6615a;
        t5.d dVar = new t5.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f6916k;
        if (colorStateList != null) {
            bVar.f6634k = colorStateList;
        }
        float f6 = dVar.f6917l;
        if (f6 != 0.0f) {
            bVar.i = f6;
        }
        ColorStateList colorStateList2 = dVar.f6907a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f6912f;
        bVar.U = dVar.f6913g;
        bVar.S = dVar.f6914h;
        bVar.W = dVar.f6915j;
        t5.a aVar = bVar.f6650z;
        if (aVar != null) {
            aVar.f6900c = true;
        }
        q3.k kVar = new q3.k(7, bVar);
        dVar.a();
        bVar.f6650z = new t5.a(kVar, dVar.f6921p);
        dVar.b(textInputLayout.getContext(), bVar.f6650z);
        bVar.j(false);
        this.f1986n0 = bVar.f6634k;
        if (this.f1974h != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1986n0 != colorStateList) {
            if (this.f1984m0 == null) {
                b bVar = this.f2010z0;
                if (bVar.f6634k != colorStateList) {
                    bVar.f6634k = colorStateList;
                    bVar.j(false);
                }
            }
            this.f1986n0 = colorStateList;
            if (this.f1974h != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(w wVar) {
        this.f1993r = wVar;
    }

    public void setMaxEms(int i) {
        this.f1979k = i;
        EditText editText = this.f1974h;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f1983m = i;
        EditText editText = this.f1974h;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1977j = i;
        EditText editText = this.f1974h;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f1981l = i;
        EditText editText = this.f1974h;
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
        o oVar = this.f1970f;
        oVar.f9222j.setContentDescription(i != 0 ? oVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        o oVar = this.f1970f;
        oVar.f9222j.setImageDrawable(i != 0 ? h0.a.D(oVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        o oVar = this.f1970f;
        if (z3 && oVar.f9224l != 1) {
            oVar.g(1);
        } else if (z3) {
            oVar.getClass();
        } else {
            oVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        o oVar = this.f1970f;
        oVar.f9226n = colorStateList;
        r2.r.g(oVar.f9217d, oVar.f9222j, colorStateList, oVar.f9227o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1970f;
        oVar.f9227o = mode;
        r2.r.g(oVar.f9217d, oVar.f9222j, oVar.f9226n, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2005x == null) {
            j0 j0Var = new j0(getContext(), null);
            this.f2005x = j0Var;
            j0Var.setId(com.snovikpovik.vuevnxsj.R.id.textinput_placeholder);
            this.f2005x.setImportantForAccessibility(1);
            this.f2005x.setAccessibilityLiveRegion(1);
            h f6 = f();
            this.A = f6;
            f6.f1704e = 67L;
            this.B = f();
            setPlaceholderTextAppearance(this.f2009z);
            setPlaceholderTextColor(this.f2007y);
            k0.k(this.f2005x, new com.google.android.material.datepicker.b(2));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2003w) {
                setPlaceholderTextEnabled(true);
            }
            this.f2001v = charSequence;
        }
        EditText editText = this.f1974h;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2009z = i;
        j0 j0Var = this.f2005x;
        if (j0Var != null) {
            j0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2007y != colorStateList) {
            this.f2007y = colorStateList;
            j0 j0Var = this.f2005x;
            if (j0Var == null || colorStateList == null) {
                return;
            }
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        t tVar = this.f1968e;
        tVar.getClass();
        tVar.f9273f = TextUtils.isEmpty(charSequence) ? null : charSequence;
        tVar.f9272e.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1968e.f9272e.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1968e.f9272e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n nVar) {
        j jVar = this.J;
        if (jVar == null || jVar.f8105e.f8087a == nVar) {
            return;
        }
        this.P = nVar;
        c();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f1968e.f9274g.setCheckable(z3);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? h0.a.D(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        t tVar = this.f1968e;
        if (i < 0) {
            tVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != tVar.f9276j) {
            tVar.f9276j = i;
            CheckableImageButton checkableImageButton = tVar.f9274g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f1968e;
        CheckableImageButton checkableImageButton = tVar.f9274g;
        View.OnLongClickListener onLongClickListener = tVar.f9278l;
        checkableImageButton.setOnClickListener(onClickListener);
        r2.r.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f1968e;
        tVar.f9278l = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f9274g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r2.r.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.f1968e;
        tVar.f9277k = scaleType;
        tVar.f9274g.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f1968e;
        if (tVar.f9275h != colorStateList) {
            tVar.f9275h = colorStateList;
            r2.r.g(tVar.f9271d, tVar.f9274g, colorStateList, tVar.i);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f1968e;
        if (tVar.i != mode) {
            tVar.i = mode;
            r2.r.g(tVar.f9271d, tVar.f9274g, tVar.f9275h, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f1968e.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        o oVar = this.f1970f;
        oVar.getClass();
        oVar.f9231s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.f9232t.setText(charSequence);
        oVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1970f.f9232t.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1970f.f9232t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.f1974h;
        if (editText != null) {
            k0.k(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1971f0) {
            this.f1971f0 = typeface;
            this.f2010z0.n(typeface);
            r rVar = this.f1985n;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                j0 j0Var = rVar.f9259r;
                if (j0Var != null) {
                    j0Var.setTypeface(typeface);
                }
                j0 j0Var2 = rVar.f9266y;
                if (j0Var2 != null) {
                    j0Var2.setTypeface(typeface);
                }
            }
            j0 j0Var3 = this.f1995s;
            if (j0Var3 != null) {
                j0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        j0 j0Var;
        EditText editText = this.f1974h;
        if (editText == null || this.S != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = r0.f4399a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(s.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1991q && (j0Var = this.f1995s) != null) {
            mutate.setColorFilter(s.b(j0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f1974h.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f1974h;
        if (editText == null || this.J == null) {
            return;
        }
        if ((this.M || editText.getBackground() == null) && this.S != 0) {
            this.f1974h.setBackground(getEditTextBoxBackground());
            this.M = true;
        }
    }

    public final void v() {
        if (this.S != 1) {
            FrameLayout frameLayout = this.f1966d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e8 = e();
            if (e8 != layoutParams.topMargin) {
                layoutParams.topMargin = e8;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z3, boolean z7) {
        ColorStateList colorStateList;
        j0 j0Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1974h;
        boolean z8 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1974h;
        boolean z9 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1984m0;
        b bVar = this.f2010z0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1984m0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2004w0) : this.f2004w0));
        } else if (o()) {
            j0 j0Var2 = this.f1985n.f9259r;
            bVar.k(j0Var2 != null ? j0Var2.getTextColors() : null);
        } else if (this.f1991q && (j0Var = this.f1995s) != null) {
            bVar.k(j0Var.getTextColors());
        } else if (z9 && (colorStateList = this.f1986n0) != null && bVar.f6634k != colorStateList) {
            bVar.f6634k = colorStateList;
            bVar.j(false);
        }
        o oVar = this.f1970f;
        t tVar = this.f1968e;
        if (z8 || !this.A0 || (isEnabled() && z9)) {
            if (z7 || this.f2008y0) {
                ValueAnimator valueAnimator = this.C0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.C0.cancel();
                }
                if (z3 && this.B0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.f2008y0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f1974h;
                x(editText3 != null ? editText3.getText() : null);
                tVar.f9279m = false;
                tVar.e();
                oVar.f9233u = false;
                oVar.n();
                return;
            }
            return;
        }
        if (z7 || !this.f2008y0) {
            ValueAnimator valueAnimator2 = this.C0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C0.cancel();
            }
            if (z3 && this.B0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((z5.h) this.J).J.f9195r.isEmpty() && g()) {
                ((z5.h) this.J).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2008y0 = true;
            j0 j0Var3 = this.f2005x;
            if (j0Var3 != null && this.f2003w) {
                j0Var3.setText((CharSequence) null);
                c5.s.a(this.f1966d, this.B);
                this.f2005x.setVisibility(4);
            }
            tVar.f9279m = true;
            tVar.e();
            oVar.f9233u = true;
            oVar.n();
        }
    }

    public final void x(Editable editable) {
        ((c5.n) this.f1993r).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1966d;
        if (length != 0 || this.f2008y0) {
            j0 j0Var = this.f2005x;
            if (j0Var == null || !this.f2003w) {
                return;
            }
            j0Var.setText((CharSequence) null);
            c5.s.a(frameLayout, this.B);
            this.f2005x.setVisibility(4);
            return;
        }
        if (this.f2005x == null || !this.f2003w || TextUtils.isEmpty(this.f2001v)) {
            return;
        }
        this.f2005x.setText(this.f2001v);
        c5.s.a(frameLayout, this.A);
        this.f2005x.setVisibility(0);
        this.f2005x.bringToFront();
    }

    public final void y(boolean z3, boolean z7) {
        int defaultColor = this.f1994r0.getDefaultColor();
        int colorForState = this.f1994r0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1994r0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f1963a0 = colorForState2;
        } else if (z7) {
            this.f1963a0 = colorForState;
        } else {
            this.f1963a0 = defaultColor;
        }
    }

    public final void z() {
        j0 j0Var;
        EditText editText;
        EditText editText2;
        if (this.J == null || this.S == 0) {
            return;
        }
        boolean z3 = false;
        boolean z7 = isFocused() || ((editText2 = this.f1974h) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1974h) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.f1963a0 = this.f2004w0;
        } else if (o()) {
            if (this.f1994r0 != null) {
                y(z7, z3);
            } else {
                this.f1963a0 = getErrorCurrentTextColors();
            }
        } else if (!this.f1991q || (j0Var = this.f1995s) == null) {
            if (z7) {
                this.f1963a0 = this.f1992q0;
            } else if (z3) {
                this.f1963a0 = this.f1990p0;
            } else {
                this.f1963a0 = this.f1988o0;
            }
        } else if (this.f1994r0 != null) {
            y(z7, z3);
        } else {
            this.f1963a0 = j0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        o oVar = this.f1970f;
        TextInputLayout textInputLayout = oVar.f9217d;
        CheckableImageButton checkableImageButton = oVar.f9222j;
        TextInputLayout textInputLayout2 = oVar.f9217d;
        oVar.l();
        r2.r.O(textInputLayout2, oVar.f9219f, oVar.f9220g);
        r2.r.O(textInputLayout2, checkableImageButton, oVar.f9226n);
        if (oVar.b() instanceof z5.k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                r2.r.g(textInputLayout, checkableImageButton, oVar.f9226n, oVar.f9227o);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        t tVar = this.f1968e;
        r2.r.O(tVar.f9271d, tVar.f9274g, tVar.f9275h);
        if (this.S == 2) {
            int i = this.U;
            if (z7 && isEnabled()) {
                this.U = this.W;
            } else {
                this.U = this.V;
            }
            if (this.U != i && g() && !this.f2008y0) {
                if (g()) {
                    ((z5.h) this.J).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.S == 1) {
            if (!isEnabled()) {
                this.f1964b0 = this.f1998t0;
            } else if (z3 && !z7) {
                this.f1964b0 = this.f2002v0;
            } else if (z7) {
                this.f1964b0 = this.f2000u0;
            } else {
                this.f1964b0 = this.f1996s0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1968e.f9274g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1968e.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1970f.f9222j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1970f.f9222j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1970f.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1970f.f9222j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        o oVar = this.f1970f;
        TextInputLayout textInputLayout = oVar.f9217d;
        CheckableImageButton checkableImageButton = oVar.f9222j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            r2.r.g(textInputLayout, checkableImageButton, oVar.f9226n, oVar.f9227o);
            r2.r.O(textInputLayout, checkableImageButton, oVar.f9226n);
        }
    }
}
