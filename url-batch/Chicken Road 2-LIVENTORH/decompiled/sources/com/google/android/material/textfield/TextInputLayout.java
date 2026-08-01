package com.google.android.material.textfield;

import a.e0;
import a.h0;
import a.y;
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
import androidx.emoji2.text.t;
import com.google.android.material.internal.CheckableImageButton;
import e2.b;
import e2.c;
import e2.l;
import j1.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import l.c1;
import l.m1;
import l2.d;
import l2.f;
import l2.j;
import l2.m;
import l2.n;
import n0.l0;
import o2.a0;
import o2.g;
import o2.k;
import o2.o;
import o2.r;
import o2.s;
import o2.u;
import o2.w;
import o2.x;
import o2.z;
import q2.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final b B0;
    public h C;
    public boolean C0;
    public h D;
    public boolean D0;
    public ColorStateList E;
    public ValueAnimator E0;
    public ColorStateList F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public boolean I;
    public CharSequence J;
    public boolean K;
    public j L;
    public j M;
    public StateListDrawable N;
    public boolean O;
    public j P;
    public j Q;
    public n R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1010a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1011b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1012c0;
    public int d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Rect f1013e0;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f1014f;

    /* renamed from: f0, reason: collision with root package name */
    public final Rect f1015f0;

    /* renamed from: g, reason: collision with root package name */
    public final w f1016g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f1017g0;

    /* renamed from: h, reason: collision with root package name */
    public final o f1018h;

    /* renamed from: h0, reason: collision with root package name */
    public Typeface f1019h0;
    public final int i;
    public ColorDrawable i0;

    /* renamed from: j, reason: collision with root package name */
    public EditText f1020j;

    /* renamed from: j0, reason: collision with root package name */
    public int f1021j0;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1022k;

    /* renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f1023k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1024l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorDrawable f1025l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1026m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1027m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1028n;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f1029n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1030o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f1031o0;

    /* renamed from: p, reason: collision with root package name */
    public final s f1032p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1033p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1034q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1035q0;

    /* renamed from: r, reason: collision with root package name */
    public int f1036r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1037r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1038s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1039s0;

    /* renamed from: t, reason: collision with root package name */
    public z f1040t;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f1041t0;

    /* renamed from: u, reason: collision with root package name */
    public c1 f1042u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1043u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1044v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1045v0;

    /* renamed from: w, reason: collision with root package name */
    public int f1046w;

    /* renamed from: w0, reason: collision with root package name */
    public int f1047w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1048x;

    /* renamed from: x0, reason: collision with root package name */
    public int f1049x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1050y;

    /* renamed from: y0, reason: collision with root package name */
    public int f1051y0;

    /* renamed from: z, reason: collision with root package name */
    public c1 f1052z;

    /* renamed from: z0, reason: collision with root package name */
    public int f1053z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.textInputStyle, com.oriondriftchasers.arordrft.R.style.Widget_Design_TextInputLayout), attributeSet, com.oriondriftchasers.arordrft.R.attr.textInputStyle);
        this.f1024l = -1;
        this.f1026m = -1;
        this.f1028n = -1;
        this.f1030o = -1;
        this.f1032p = new s(this);
        this.f1040t = new h0(8);
        this.f1013e0 = new Rect();
        this.f1015f0 = new Rect();
        this.f1017g0 = new RectF();
        this.f1023k0 = new LinkedHashSet();
        b bVar = new b(this);
        this.B0 = bVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1014f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o1.a.f2864a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f1182g != 8388659) {
            bVar.f1182g = 8388659;
            bVar.j(false);
        }
        t g4 = e2.o.g(context2, attributeSet, n1.a.I, com.oriondriftchasers.arordrft.R.attr.textInputStyle, com.oriondriftchasers.arordrft.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        w wVar = new w(this, g4);
        this.f1016g = wVar;
        TypedArray typedArray = (TypedArray) g4.f356c;
        this.I = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.D0 = typedArray.getBoolean(47, true);
        this.C0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.R = n.c(context2, attributeSet, com.oriondriftchasers.arordrft.R.attr.textInputStyle, com.oriondriftchasers.arordrft.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = typedArray.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f1010a0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1011b0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.f1010a0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        m g5 = this.R.g();
        if (dimension >= 0.0f) {
            g5.f2621e = new l2.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            g5.f2622f = new l2.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            g5.f2623g = new l2.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            g5.f2624h = new l2.a(dimension4);
        }
        this.R = g5.a();
        ColorStateList u3 = h.a.u(context2, g4, 7);
        if (u3 != null) {
            int defaultColor = u3.getDefaultColor();
            this.f1043u0 = defaultColor;
            this.d0 = defaultColor;
            if (u3.isStateful()) {
                this.f1045v0 = u3.getColorForState(new int[]{-16842910}, -1);
                this.f1047w0 = u3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1049x0 = u3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1047w0 = this.f1043u0;
                ColorStateList B = y.B(context2, com.oriondriftchasers.arordrft.R.color.mtrl_filled_background_color);
                this.f1045v0 = B.getColorForState(new int[]{-16842910}, -1);
                this.f1049x0 = B.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.f1043u0 = 0;
            this.f1045v0 = 0;
            this.f1047w0 = 0;
            this.f1049x0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList m4 = g4.m(1);
            this.f1033p0 = m4;
            this.f1031o0 = m4;
        }
        ColorStateList u4 = h.a.u(context2, g4, 14);
        this.f1039s0 = typedArray.getColor(14, 0);
        this.f1035q0 = context2.getColor(com.oriondriftchasers.arordrft.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1051y0 = context2.getColor(com.oriondriftchasers.arordrft.R.color.mtrl_textinput_disabled_color);
        this.f1037r0 = context2.getColor(com.oriondriftchasers.arordrft.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (u4 != null) {
            setBoxStrokeColorStateList(u4);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(h.a.u(context2, g4, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.G = g4.m(24);
        this.H = g4.m(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z3 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z4 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z5 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f1046w = typedArray.getResourceId(22, 0);
        this.f1044v = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1044v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1046w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(g4.m(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(g4.m(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(g4.m(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(g4.m(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(g4.m(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(g4.m(59));
        }
        o oVar = new o(this, g4);
        this.f1018h = oVar;
        boolean z6 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        g4.y();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(wVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1020j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        int A = y.A(this.f1020j, com.oriondriftchasers.arordrft.R.attr.colorControlHighlight);
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            j jVar = this.L;
            int i4 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{y.J(A, i4, 0.1f), i4}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.L;
        TypedValue c02 = h.a.c0(context, com.oriondriftchasers.arordrft.R.attr.colorSurface, "TextInputLayout");
        int i5 = c02.resourceId;
        int color = i5 != 0 ? context.getColor(i5) : c02.data;
        j jVar3 = new j(jVar2.f2598g.f2581a);
        int J = y.J(A, color, 0.1f);
        jVar3.q(new ColorStateList(iArr, new int[]{J, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{J, color});
        j jVar4 = new j(jVar2.f2598g.f2581a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.N.addState(new int[0], h(false));
        }
        return this.N;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.M == null) {
            this.M = h(true);
        }
        return this.M;
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
        if (this.f1020j != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1020j = editText;
        int i = this.f1024l;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f1028n);
        }
        int i4 = this.f1026m;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f1030o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new o2.y(this));
        Typeface typeface = this.f1020j.getTypeface();
        b bVar = this.B0;
        bVar.n(typeface);
        float textSize = this.f1020j.getTextSize();
        if (bVar.f1184h != textSize) {
            bVar.f1184h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f1020j.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f1020j.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (bVar.f1182g != i5) {
            bVar.f1182g = i5;
            bVar.j(false);
        }
        if (bVar.f1180f != gravity) {
            bVar.f1180f = gravity;
            bVar.j(false);
        }
        this.f1053z0 = editText.getMinimumHeight();
        this.f1020j.addTextChangedListener(new x(this, editText));
        if (this.f1031o0 == null) {
            this.f1031o0 = this.f1020j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.f1020j.getHint();
                this.f1022k = hint;
                setHint(hint);
                this.f1020j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f1042u != null) {
            p(this.f1020j.getText());
        }
        t();
        this.f1032p.b();
        this.f1016g.bringToFront();
        o oVar = this.f1018h;
        oVar.bringToFront();
        Iterator it = this.f1023k0.iterator();
        while (it.hasNext()) {
            ((o2.m) it.next()).a(this);
        }
        oVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.J)) {
            return;
        }
        this.J = charSequence;
        b bVar = this.B0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f1050y == z3) {
            return;
        }
        if (z3) {
            c1 c1Var = this.f1052z;
            if (c1Var != null) {
                this.f1014f.addView(c1Var);
                this.f1052z.setVisibility(0);
            }
        } else {
            c1 c1Var2 = this.f1052z;
            if (c1Var2 != null) {
                c1Var2.setVisibility(8);
            }
            this.f1052z = null;
        }
        this.f1050y = z3;
    }

    public final void a() {
        if (this.f1020j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f1020j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.f1020j.getPaddingEnd(), getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f1020j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1020j.getPaddingEnd(), getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (h.a.P(getContext())) {
            EditText editText3 = this.f1020j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1020j.getPaddingEnd(), getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        FrameLayout frameLayout = this.f1014f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f2) {
        b bVar = this.B0;
        if (bVar.f1174b == f2) {
            return;
        }
        int i = 2;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(y.S(getContext(), com.oriondriftchasers.arordrft.R.attr.motionEasingEmphasizedInterpolator, o1.a.f2865b));
            this.E0.setDuration(y.R(getContext(), com.oriondriftchasers.arordrft.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new l(i, this));
        }
        this.E0.setFloatValues(bVar.f1174b, f2);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i4;
        j jVar = this.L;
        if (jVar == null) {
            return;
        }
        n nVar = jVar.f2598g.f2581a;
        n nVar2 = this.R;
        if (nVar != nVar2) {
            jVar.setShapeAppearanceModel(nVar2);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i4 = this.f1012c0) != 0) {
            j jVar2 = this.L;
            jVar2.f2598g.f2589k = i;
            jVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            l2.h hVar = jVar2.f2598g;
            if (hVar.f2584e != valueOf) {
                hVar.f2584e = valueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i5 = this.d0;
        if (this.U == 1) {
            i5 = f0.a.b(this.d0, y.z(getContext(), com.oriondriftchasers.arordrft.R.attr.colorSurface, 0));
        }
        this.d0 = i5;
        this.L.q(ColorStateList.valueOf(i5));
        j jVar3 = this.P;
        if (jVar3 != null && this.Q != null) {
            if (this.W > -1 && this.f1012c0 != 0) {
                jVar3.q(this.f1020j.isFocused() ? ColorStateList.valueOf(this.f1035q0) : ColorStateList.valueOf(this.f1012c0));
                this.Q.q(ColorStateList.valueOf(this.f1012c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f1020j == null) {
            throw new IllegalStateException();
        }
        boolean z3 = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f1015f0;
        rect2.bottom = i;
        int i4 = this.U;
        if (i4 == 1) {
            rect2.left = i(rect.left, z3);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        if (i4 != 2) {
            rect2.left = i(rect.left, z3);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        rect2.left = this.f1020j.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f1020j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f1020j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1022k != null) {
            boolean z3 = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.f1020j.setHint(this.f1022k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f1020j.setHint(hint);
                this.K = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1014f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f1020j) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.G0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.G0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z3 = this.I;
        b bVar = this.B0;
        if (z3) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f1178e;
            int save = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f2 = bVar.f1195q;
                float f4 = bVar.f1196r;
                float f5 = bVar.F;
                if (f5 != 1.0f) {
                    canvas2.scale(f5, f5, f2, f4);
                }
                if ((bVar.f1179e0 > 1 || bVar.f1181f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f1195q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f4);
                    float f6 = alpha;
                    textPaint.setAlpha((int) (bVar.f1177c0 * f6));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f7 = bVar.H;
                        float f8 = bVar.I;
                        float f9 = bVar.J;
                        int i4 = bVar.K;
                        textPaint.setShadowLayer(f7, f8, f9, f0.a.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f1175b0 * f6));
                    if (i >= 31) {
                        float f10 = bVar.H;
                        float f11 = bVar.I;
                        float f12 = bVar.J;
                        int i5 = bVar.K;
                        textPaint.setShadowLayer(f10, f11, f12, f0.a.d(i5, (Color.alpha(i5) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.d0;
                    float f13 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String trim = bVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f13, (Paint) textPaint);
                } else {
                    canvas2.translate(f2, f4);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (jVar = this.P) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.f1020j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f14 = bVar.f1174b;
            int centerX = bounds2.centerX();
            bounds.left = o1.a.c(centerX, bounds2.left, f14);
            bounds.right = o1.a.c(centerX, bounds2.right, f14);
            this.Q.draw(canvas2);
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
        if (this.F0) {
            return;
        }
        this.F0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.B0;
        if (bVar != null) {
            bVar.M = drawableState;
            ColorStateList colorStateList2 = bVar.f1188k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f1186j) != null && colorStateList.isStateful())) {
                bVar.j(false);
                z3 = true;
                if (this.f1020j != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z3) {
                    invalidate();
                }
                this.F0 = false;
            }
        }
        z3 = false;
        if (this.f1020j != null) {
        }
        t();
        z();
        if (z3) {
        }
        this.F0 = false;
    }

    public final int e() {
        if (this.I) {
            int i = this.U;
            b bVar = this.B0;
            if (i == 0) {
                return (int) bVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f2 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.i);
                textPaint.setTypeface(bVar.f1197s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f2 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.f1939h = y.R(getContext(), com.oriondriftchasers.arordrft.R.attr.motionDurationShort2, 87);
        hVar.i = y.S(getContext(), com.oriondriftchasers.arordrft.R.attr.motionEasingLinearInterpolator, o1.a.f2864a);
        return hVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1020j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i = this.U;
        if (i == 1 || i == 2) {
            return this.L;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1017g0;
        return layoutDirection == 1 ? this.R.f2634h.a(rectF) : this.R.f2633g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1017g0;
        return layoutDirection == 1 ? this.R.f2633g.a(rectF) : this.R.f2634h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1017g0;
        return layoutDirection == 1 ? this.R.f2631e.a(rectF) : this.R.f2632f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1017g0;
        return layoutDirection == 1 ? this.R.f2632f.a(rectF) : this.R.f2631e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1039s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1041t0;
    }

    public int getBoxStrokeWidth() {
        return this.f1010a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1011b0;
    }

    public int getCounterMaxLength() {
        return this.f1036r;
    }

    public CharSequence getCounterOverflowDescription() {
        c1 c1Var;
        if (this.f1034q && this.f1038s && (c1Var = this.f1042u) != null) {
            return c1Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.F;
    }

    public ColorStateList getCounterTextColor() {
        return this.E;
    }

    public ColorStateList getCursorColor() {
        return this.G;
    }

    public ColorStateList getCursorErrorColor() {
        return this.H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1031o0;
    }

    public EditText getEditText() {
        return this.f1020j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1018h.f2916l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1018h.f2916l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1018h.f2922r;
    }

    public int getEndIconMode() {
        return this.f1018h.f2918n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1018h.f2923s;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1018h.f2916l;
    }

    public CharSequence getError() {
        s sVar = this.f1032p;
        if (sVar.f2953q) {
            return sVar.f2952p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1032p.f2956t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1032p.f2955s;
    }

    public int getErrorCurrentTextColors() {
        c1 c1Var = this.f1032p.f2954r;
        if (c1Var != null) {
            return c1Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1018h.f2913h.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f1032p;
        if (sVar.f2960x) {
            return sVar.f2959w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        c1 c1Var = this.f1032p.f2961y;
        if (c1Var != null) {
            return c1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.J;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.B0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.B0;
        return bVar.g(bVar.f1188k);
    }

    public int getHintMaxLines() {
        return this.B0.f1179e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1033p0;
    }

    public z getLengthCounter() {
        return this.f1040t;
    }

    public int getMaxEms() {
        return this.f1026m;
    }

    public int getMaxWidth() {
        return this.f1030o;
    }

    public int getMinEms() {
        return this.f1024l;
    }

    public int getMinWidth() {
        return this.f1028n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1018h.f2916l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1018h.f2916l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1050y) {
            return this.f1048x;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A;
    }

    public CharSequence getPrefixText() {
        return this.f1016g.f2979h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1016g.f2978g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1016g.f2978g;
    }

    public n getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1016g.i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1016g.i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1016g.f2982l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1016g.f2983m;
    }

    public CharSequence getSuffixText() {
        return this.f1018h.f2925u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1018h.f2926v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1018h.f2926v;
    }

    public Typeface getTypeface() {
        return this.f1019h0;
    }

    public final j h(boolean z3) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z3 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1020j;
        float popupElevation = editText instanceof u ? ((u) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        l2.l lVar = new l2.l();
        l2.l lVar2 = new l2.l();
        l2.l lVar3 = new l2.l();
        l2.l lVar4 = new l2.l();
        int i = 0;
        f fVar = new f(i);
        f fVar2 = new f(i);
        f fVar3 = new f(i);
        f fVar4 = new f(i);
        l2.a aVar = new l2.a(f2);
        l2.a aVar2 = new l2.a(f2);
        l2.a aVar3 = new l2.a(dimensionPixelOffset);
        l2.a aVar4 = new l2.a(dimensionPixelOffset);
        n nVar = new n();
        nVar.f2628a = lVar;
        nVar.f2629b = lVar2;
        nVar.f2630c = lVar3;
        nVar.d = lVar4;
        nVar.f2631e = aVar;
        nVar.f2632f = aVar2;
        nVar.f2633g = aVar4;
        nVar.f2634h = aVar3;
        nVar.i = fVar;
        nVar.f2635j = fVar2;
        nVar.f2636k = fVar3;
        nVar.f2637l = fVar4;
        EditText editText2 = this.f1020j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof u ? ((u) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.J;
            TypedValue c02 = h.a.c0(context, com.oriondriftchasers.arordrft.R.attr.colorSurface, j.class.getSimpleName());
            int i4 = c02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i4 != 0 ? context.getColor(i4) : c02.data);
        }
        j jVar = new j();
        jVar.m(context);
        jVar.q(dropDownBackgroundTintList);
        jVar.p(popupElevation);
        jVar.setShapeAppearanceModel(nVar);
        l2.h hVar = jVar.f2598g;
        if (hVar.f2587h == null) {
            hVar.f2587h = new Rect();
        }
        jVar.f2598g.f2587h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f1020j.getCompoundPaddingLeft() : this.f1018h.c() : this.f1016g.a()) + i;
    }

    public final int j(int i, boolean z3) {
        return i - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f1020j.getCompoundPaddingRight() : this.f1016g.a() : this.f1018h.c());
    }

    public final void k() {
        int i = this.U;
        if (i == 0) {
            this.L = null;
            this.P = null;
            this.Q = null;
        } else if (i == 1) {
            this.L = new j(this.R);
            this.P = new j();
            this.Q = new j();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof g)) {
                this.L = new j(this.R);
            } else {
                n nVar = this.R;
                int i4 = g.M;
                if (nVar == null) {
                    nVar = new n();
                }
                o2.f fVar = new o2.f(nVar, new RectF());
                g gVar = new g(fVar);
                gVar.L = fVar;
                this.L = gVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (h.a.P(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.f1020j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i5 = this.U;
                if (i5 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i5 == 1) {
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
        float f2;
        float f4;
        float f5;
        RectF rectF;
        float f6;
        int i;
        float f7;
        int i4;
        if (g()) {
            int width = this.f1020j.getWidth();
            int gravity = this.f1020j.getGravity();
            b bVar = this.B0;
            boolean c4 = bVar.c(bVar.B);
            bVar.D = c4;
            Rect rect = bVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c4) {
                        i4 = rect.left;
                        f5 = i4;
                    } else {
                        f2 = rect.right;
                        f4 = bVar.f1173a0;
                    }
                } else if (c4) {
                    f2 = rect.right;
                    f4 = bVar.f1173a0;
                } else {
                    i4 = rect.left;
                    f5 = i4;
                }
                float max = Math.max(f5, rect.left);
                rectF = this.f1017g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f6 = (width / 2.0f) + (bVar.f1173a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.D) {
                        f7 = bVar.f1173a0;
                        f6 = f7 + max;
                    } else {
                        i = rect.right;
                        f6 = i;
                    }
                } else if (bVar.D) {
                    i = rect.right;
                    f6 = i;
                } else {
                    f7 = bVar.f1173a0;
                    f6 = f7 + max;
                }
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = bVar.f() + rect.top;
                if (bVar.Z != null && !bVar.o()) {
                    StaticLayout staticLayout = bVar.Z;
                    float lineWidth = (bVar.i / bVar.f1184h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (bVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f8 = rectF.left;
                float f9 = this.T;
                rectF.left = f8 - f9;
                rectF.right += f9;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                rectF.top = 0.0f;
                g gVar = (g) this.L;
                gVar.getClass();
                gVar.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f4 = bVar.f1173a0 / 2.0f;
            f5 = f2 - f4;
            float max2 = Math.max(f5, rect.left);
            rectF = this.f1017g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f6 = (width / 2.0f) + (bVar.f1173a0 / 2.0f);
            rectF.right = Math.min(f6, rect.right);
            rectF.bottom = bVar.f() + rect.top;
            if (bVar.Z != null) {
                StaticLayout staticLayout2 = bVar.Z;
                float lineWidth2 = (bVar.i / bVar.f1184h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (bVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(c1 c1Var, int i) {
        try {
            c1Var.setTextAppearance(i);
            if (c1Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1Var.setTextAppearance(com.oriondriftchasers.arordrft.R.style.TextAppearance_AppCompat_Caption);
        c1Var.setTextColor(getContext().getColor(com.oriondriftchasers.arordrft.R.color.design_error));
    }

    public final boolean o() {
        s sVar = this.f1032p;
        return (sVar.f2951o != 1 || sVar.f2954r == null || TextUtils.isEmpty(sVar.f2952p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        o oVar = this.f1018h;
        oVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.H0 = false;
        if (this.f1020j != null && this.f1020j.getMeasuredHeight() < (max = Math.max(oVar.getMeasuredHeight(), this.f1016g.getMeasuredHeight()))) {
            this.f1020j.setMinimumHeight(max);
            z3 = true;
        }
        boolean s3 = s();
        if (z3 || s3) {
            this.f1020j.post(new a.j(9, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        float descent;
        int i7;
        int compoundPaddingTop;
        super.onLayout(z3, i, i4, i5, i6);
        EditText editText = this.f1020j;
        if (editText != null) {
            Rect rect = this.f1013e0;
            c.a(this, editText, rect);
            j jVar = this.P;
            if (jVar != null) {
                int i8 = rect.bottom;
                jVar.setBounds(rect.left, i8 - this.f1010a0, rect.right, i8);
            }
            j jVar2 = this.Q;
            if (jVar2 != null) {
                int i9 = rect.bottom;
                jVar2.setBounds(rect.left, i9 - this.f1011b0, rect.right, i9);
            }
            if (this.I) {
                float textSize = this.f1020j.getTextSize();
                b bVar = this.B0;
                float f2 = bVar.f1184h;
                TextPaint textPaint = bVar.P;
                if (f2 != textSize) {
                    bVar.f1184h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f1020j.getGravity();
                int i10 = (gravity & (-113)) | 48;
                if (bVar.f1182g != i10) {
                    bVar.f1182g = i10;
                    bVar.j(false);
                }
                if (bVar.f1180f != gravity) {
                    bVar.f1180f = gravity;
                    bVar.j(false);
                }
                Rect d = d(rect);
                int i11 = d.left;
                int i12 = d.top;
                int i13 = d.right;
                int i14 = d.bottom;
                Rect rect2 = bVar.d;
                if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
                    rect2.set(i11, i12, i13, i14);
                    bVar.N = true;
                }
                if (this.f1020j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f1184h);
                    textPaint.setTypeface(bVar.f1200v);
                    textPaint.setLetterSpacing(bVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f1184h);
                    textPaint.setTypeface(bVar.f1200v);
                    textPaint.setLetterSpacing(bVar.X);
                    descent = bVar.f1190l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f1020j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f1015f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.f1020j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i7 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f1184h);
                        textPaint.setTypeface(bVar.f1200v);
                        textPaint.setLetterSpacing(bVar.X);
                        i7 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f1020j.getCompoundPaddingTop() + rect.top) - i7;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f1020j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.f1020j.getMinLines() > 1) ? rect.bottom - this.f1020j.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i15 = rect3.left;
                int i16 = rect3.top;
                int i17 = rect3.right;
                Rect rect4 = bVar.f1176c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom || true != bVar.f1189k0) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f1189k0 = true;
                }
                bVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        float f2;
        EditText editText;
        super.onMeasure(i, i4);
        boolean z3 = this.H0;
        o oVar = this.f1018h;
        if (!z3) {
            oVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.f1052z != null && (editText = this.f1020j) != null) {
            this.f1052z.setGravity(editText.getGravity());
            this.f1052z.setPadding(this.f1020j.getCompoundPaddingLeft(), this.f1020j.getCompoundPaddingTop(), this.f1020j.getCompoundPaddingRight(), this.f1020j.getCompoundPaddingBottom());
        }
        oVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f1020j.getMeasuredWidth() - this.f1020j.getCompoundPaddingLeft()) - this.f1020j.getCompoundPaddingRight();
        b bVar = this.B0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.i);
        textPaint.setTypeface(bVar.f1197s);
        textPaint.setLetterSpacing(bVar.W);
        float f4 = measuredWidth;
        bVar.i0 = bVar.e(bVar.f1181f0, textPaint, bVar.B, (bVar.i / bVar.f1184h) * f4, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f1184h);
        textPaint.setTypeface(bVar.f1200v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f1187j0 = bVar.e(bVar.f1179e0, textPaint, bVar.B, f4, bVar.D).getHeight();
        EditText editText2 = this.f1020j;
        Rect rect = this.f1013e0;
        c.a(this, editText2, rect);
        Rect d = d(rect);
        int i5 = d.left;
        int i6 = d.top;
        int i7 = d.right;
        int i8 = d.bottom;
        Rect rect2 = bVar.d;
        if (rect2.left != i5 || rect2.top != i6 || rect2.right != i7 || rect2.bottom != i8) {
            rect2.set(i5, i6, i7, i8);
            bVar.N = true;
        }
        v();
        a();
        if (this.f1020j == null) {
            return;
        }
        int i9 = bVar.f1187j0;
        if (i9 != -1) {
            f2 = i9;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f1184h);
            textPaint2.setTypeface(bVar.f1200v);
            textPaint2.setLetterSpacing(bVar.X);
            f2 = -textPaint2.ascent();
        }
        if (this.f1048x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f1052z.getPaint());
            textPaint3.setTextSize(this.f1052z.getTextSize());
            textPaint3.setTypeface(this.f1052z.getTypeface());
            textPaint3.setLetterSpacing(this.f1052z.getLetterSpacing());
            e2.h hVar = new e2.h(this.f1048x, textPaint3, measuredWidth);
            hVar.f1221k = getLayoutDirection() == 1;
            hVar.f1220j = true;
            float lineSpacingExtra = this.f1052z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f1052z.getLineSpacingMultiplier();
            hVar.f1218g = lineSpacingExtra;
            hVar.f1219h = lineSpacingMultiplier;
            hVar.f1223m = new e0(2, this);
            r3 = (this.U == 1 ? bVar.f() + this.V + this.i : 0.0f) + hVar.a().getHeight();
        }
        float max = Math.max(f2, r3);
        if (this.f1020j.getMeasuredHeight() < max) {
            this.f1020j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.f3175f);
        setError(a0Var.f2875h);
        if (a0Var.i) {
            post(new androidx.fragment.app.g(8, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z3 = i == 1;
        if (z3 != this.S) {
            d dVar = this.R.f2631e;
            RectF rectF = this.f1017g0;
            float a2 = dVar.a(rectF);
            float a4 = this.R.f2632f.a(rectF);
            float a5 = this.R.f2634h.a(rectF);
            float a6 = this.R.f2633g.a(rectF);
            n nVar = this.R;
            h.a aVar = nVar.f2628a;
            h.a aVar2 = nVar.f2629b;
            h.a aVar3 = nVar.d;
            h.a aVar4 = nVar.f2630c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            l2.a aVar5 = new l2.a(a4);
            l2.a aVar6 = new l2.a(a2);
            l2.a aVar7 = new l2.a(a6);
            l2.a aVar8 = new l2.a(a5);
            n nVar2 = new n();
            nVar2.f2628a = aVar2;
            nVar2.f2629b = aVar;
            nVar2.f2630c = aVar3;
            nVar2.d = aVar4;
            nVar2.f2631e = aVar5;
            nVar2.f2632f = aVar6;
            nVar2.f2633g = aVar8;
            nVar2.f2634h = aVar7;
            nVar2.i = fVar;
            nVar2.f2635j = fVar2;
            nVar2.f2636k = fVar3;
            nVar2.f2637l = fVar4;
            this.S = z3;
            setShapeAppearanceModel(nVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        if (o()) {
            a0Var.f2875h = getError();
        }
        o oVar = this.f1018h;
        a0Var.i = oVar.f2918n != 0 && oVar.f2916l.i;
        return a0Var;
    }

    public final void p(Editable editable) {
        ((h0) this.f1040t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f1038s;
        int i = this.f1036r;
        if (i == -1) {
            this.f1042u.setText(String.valueOf(length));
            this.f1042u.setContentDescription(null);
            this.f1038s = false;
        } else {
            this.f1038s = length > i;
            Context context = getContext();
            this.f1042u.setContentDescription(context.getString(this.f1038s ? com.oriondriftchasers.arordrft.R.string.character_counter_overflowed_content_description : com.oriondriftchasers.arordrft.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1036r)));
            if (z3 != this.f1038s) {
                q();
            }
            String str = l0.b.f2533b;
            l0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? l0.b.f2535e : l0.b.d;
            c1 c1Var = this.f1042u;
            String string = getContext().getString(com.oriondriftchasers.arordrft.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1036r));
            bVar.getClass();
            l0.f fVar = l0.g.f2543a;
            c1Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f1020j == null || z3 == this.f1038s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        c1 c1Var = this.f1042u;
        if (c1Var != null) {
            n(c1Var, this.f1038s ? this.f1044v : this.f1046w);
            if (!this.f1038s && (colorStateList2 = this.E) != null) {
                this.f1042u.setTextColor(colorStateList2);
            }
            if (!this.f1038s || (colorStateList = this.F) == null) {
                return;
            }
            this.f1042u.setTextColor(colorStateList);
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.G;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue a02 = h.a.a0(context, com.oriondriftchasers.arordrft.R.attr.colorControlActivated);
            if (a02 != null) {
                int i = a02.resourceId;
                if (i != 0) {
                    colorStateList2 = y.B(context, i);
                } else {
                    int i4 = a02.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f1020j;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f1020j.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((o() || (this.f1042u != null && this.f1038s)) && (colorStateList = this.H) != null) {
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
        if (this.f1020j == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z4 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            w wVar = this.f1016g;
            if (wVar.getMeasuredWidth() > 0) {
                int measuredWidth = wVar.getMeasuredWidth() - this.f1020j.getPaddingLeft();
                if (this.i0 == null || this.f1021j0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.i0 = colorDrawable3;
                    this.f1021j0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f1020j.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.i0;
                if (drawable2 != colorDrawable4) {
                    this.f1020j.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z3 = true;
                    oVar = this.f1018h;
                    if ((!oVar.e() || ((oVar.f2918n != 0 && oVar.d()) || oVar.f2925u != null)) && oVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = oVar.f2926v.getMeasuredWidth() - this.f1020j.getPaddingRight();
                        if (!oVar.e()) {
                            checkableImageButton = oVar.f2913h;
                        } else if (oVar.f2918n != 0 && oVar.d()) {
                            checkableImageButton = oVar.f2916l;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f1020j.getCompoundDrawablesRelative();
                        colorDrawable = this.f1025l0;
                        if (colorDrawable == null && this.f1027m0 != measuredWidth2) {
                            this.f1027m0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f1020j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1025l0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f1025l0 = colorDrawable5;
                            this.f1027m0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f1025l0;
                        if (drawable != colorDrawable2) {
                            this.f1029n0 = drawable;
                            this.f1020j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f1025l0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f1020j.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1025l0) {
                            this.f1020j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1029n0, compoundDrawablesRelative3[3]);
                        } else {
                            z4 = z3;
                        }
                        this.f1025l0 = null;
                        return z4;
                    }
                    return z3;
                }
                z3 = false;
                oVar = this.f1018h;
                if (oVar.e()) {
                }
                int measuredWidth22 = oVar.f2926v.getMeasuredWidth() - this.f1020j.getPaddingRight();
                if (!oVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f1020j.getCompoundDrawablesRelative();
                colorDrawable = this.f1025l0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1025l0;
                if (drawable != colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.i0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f1020j.getCompoundDrawablesRelative();
            this.f1020j.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.i0 = null;
            z3 = true;
            oVar = this.f1018h;
            if (oVar.e()) {
            }
            int measuredWidth222 = oVar.f2926v.getMeasuredWidth() - this.f1020j.getPaddingRight();
            if (!oVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f1020j.getCompoundDrawablesRelative();
            colorDrawable = this.f1025l0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1025l0;
            if (drawable != colorDrawable2) {
            }
            return z3;
        }
        z3 = false;
        oVar = this.f1018h;
        if (oVar.e()) {
        }
        int measuredWidth2222 = oVar.f2926v.getMeasuredWidth() - this.f1020j.getPaddingRight();
        if (!oVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f1020j.getCompoundDrawablesRelative();
        colorDrawable = this.f1025l0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1025l0;
        if (drawable != colorDrawable2) {
        }
        return z3;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.f1043u0 = i;
            this.f1047w0 = i;
            this.f1049x0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1043u0 = defaultColor;
        this.d0 = defaultColor;
        this.f1045v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1047w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1049x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.f1020j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.V = i;
    }

    public void setBoxCornerFamily(int i) {
        m g4 = this.R.g();
        d dVar = this.R.f2631e;
        g4.f2618a = h.a.p(i);
        g4.f2621e = dVar;
        d dVar2 = this.R.f2632f;
        g4.f2619b = h.a.p(i);
        g4.f2622f = dVar2;
        d dVar3 = this.R.f2634h;
        g4.d = h.a.p(i);
        g4.f2624h = dVar3;
        d dVar4 = this.R.f2633g;
        g4.f2620c = h.a.p(i);
        g4.f2623g = dVar4;
        this.R = g4.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1039s0 != i) {
            this.f1039s0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1035q0 = colorStateList.getDefaultColor();
            this.f1051y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1037r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1039s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1039s0 != colorStateList.getDefaultColor()) {
            this.f1039s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1041t0 != colorStateList) {
            this.f1041t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1010a0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1011b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f1034q != z3) {
            s sVar = this.f1032p;
            if (z3) {
                c1 c1Var = new c1(getContext(), null);
                this.f1042u = c1Var;
                c1Var.setId(com.oriondriftchasers.arordrft.R.id.textinput_counter);
                Typeface typeface = this.f1019h0;
                if (typeface != null) {
                    this.f1042u.setTypeface(typeface);
                }
                this.f1042u.setMaxLines(1);
                sVar.a(this.f1042u, 2);
                ((ViewGroup.MarginLayoutParams) this.f1042u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1042u != null) {
                    EditText editText = this.f1020j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f1042u, 2);
                this.f1042u = null;
            }
            this.f1034q = z3;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1036r != i) {
            if (i > 0) {
                this.f1036r = i;
            } else {
                this.f1036r = -1;
            }
            if (!this.f1034q || this.f1042u == null) {
                return;
            }
            EditText editText = this.f1020j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1044v != i) {
            this.f1044v = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1046w != i) {
            this.f1046w = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (o() || (this.f1042u != null && this.f1038s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1031o0 = colorStateList;
        this.f1033p0 = colorStateList;
        if (this.f1020j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        m(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f1018h.f2916l.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f1018h.f2916l.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i) {
        o oVar = this.f1018h;
        CharSequence text = i != 0 ? oVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = oVar.f2916l;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        o oVar = this.f1018h;
        Drawable x3 = i != 0 ? h.a.x(oVar.getContext(), i) : null;
        TextInputLayout textInputLayout = oVar.f2911f;
        CheckableImageButton checkableImageButton = oVar.f2916l;
        checkableImageButton.setImageDrawable(x3);
        if (x3 != null) {
            h.a.d(textInputLayout, checkableImageButton, oVar.f2920p, oVar.f2921q);
            h.a.Z(textInputLayout, checkableImageButton, oVar.f2920p);
        }
    }

    public void setEndIconMinSize(int i) {
        o oVar = this.f1018h;
        if (i < 0) {
            oVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != oVar.f2922r) {
            oVar.f2922r = i;
            CheckableImageButton checkableImageButton = oVar.f2916l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = oVar.f2913h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1018h.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f1018h;
        CheckableImageButton checkableImageButton = oVar.f2916l;
        View.OnLongClickListener onLongClickListener = oVar.f2924t;
        checkableImageButton.setOnClickListener(onClickListener);
        h.a.h0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f1018h;
        oVar.f2924t = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f2916l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        h.a.h0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.f1018h;
        oVar.f2923s = scaleType;
        oVar.f2916l.setScaleType(scaleType);
        oVar.f2913h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        o oVar = this.f1018h;
        if (oVar.f2920p != colorStateList) {
            oVar.f2920p = colorStateList;
            h.a.d(oVar.f2911f, oVar.f2916l, colorStateList, oVar.f2921q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1018h;
        if (oVar.f2921q != mode) {
            oVar.f2921q = mode;
            h.a.d(oVar.f2911f, oVar.f2916l, oVar.f2920p, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f1018h.h(z3);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.f1032p;
        if (!sVar.f2953q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f2952p = charSequence;
        sVar.f2954r.setText(charSequence);
        int i = sVar.f2950n;
        if (i != 1) {
            sVar.f2951o = 1;
        }
        sVar.i(i, sVar.f2951o, sVar.h(sVar.f2954r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        s sVar = this.f1032p;
        sVar.f2956t = i;
        c1 c1Var = sVar.f2954r;
        if (c1Var != null) {
            c1Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f1032p;
        sVar.f2955s = charSequence;
        c1 c1Var = sVar.f2954r;
        if (c1Var != null) {
            c1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        s sVar = this.f1032p;
        TextInputLayout textInputLayout = sVar.f2945h;
        if (sVar.f2953q == z3) {
            return;
        }
        sVar.c();
        if (z3) {
            c1 c1Var = new c1(sVar.f2944g, null);
            sVar.f2954r = c1Var;
            c1Var.setId(com.oriondriftchasers.arordrft.R.id.textinput_error);
            sVar.f2954r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f2954r.setTypeface(typeface);
            }
            int i = sVar.f2957u;
            sVar.f2957u = i;
            c1 c1Var2 = sVar.f2954r;
            if (c1Var2 != null) {
                sVar.f2945h.n(c1Var2, i);
            }
            ColorStateList colorStateList = sVar.f2958v;
            sVar.f2958v = colorStateList;
            c1 c1Var3 = sVar.f2954r;
            if (c1Var3 != null && colorStateList != null) {
                c1Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f2955s;
            sVar.f2955s = charSequence;
            c1 c1Var4 = sVar.f2954r;
            if (c1Var4 != null) {
                c1Var4.setContentDescription(charSequence);
            }
            int i4 = sVar.f2956t;
            sVar.f2956t = i4;
            c1 c1Var5 = sVar.f2954r;
            if (c1Var5 != null) {
                c1Var5.setAccessibilityLiveRegion(i4);
            }
            sVar.f2954r.setVisibility(4);
            sVar.a(sVar.f2954r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f2954r, 0);
            sVar.f2954r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f2953q = z3;
    }

    public void setErrorIconDrawable(int i) {
        o oVar = this.f1018h;
        oVar.i(i != 0 ? h.a.x(oVar.getContext(), i) : null);
        h.a.Z(oVar.f2911f, oVar.f2913h, oVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f1018h;
        CheckableImageButton checkableImageButton = oVar.f2913h;
        View.OnLongClickListener onLongClickListener = oVar.f2915k;
        checkableImageButton.setOnClickListener(onClickListener);
        h.a.h0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f1018h;
        oVar.f2915k = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f2913h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        h.a.h0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        o oVar = this.f1018h;
        if (oVar.i != colorStateList) {
            oVar.i = colorStateList;
            h.a.d(oVar.f2911f, oVar.f2913h, colorStateList, oVar.f2914j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1018h;
        if (oVar.f2914j != mode) {
            oVar.f2914j = mode;
            h.a.d(oVar.f2911f, oVar.f2913h, oVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        s sVar = this.f1032p;
        sVar.f2957u = i;
        c1 c1Var = sVar.f2954r;
        if (c1Var != null) {
            sVar.f2945h.n(c1Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f1032p;
        sVar.f2958v = colorStateList;
        c1 c1Var = sVar.f2954r;
        if (c1Var == null || colorStateList == null) {
            return;
        }
        c1Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.C0 != z3) {
            this.C0 = z3;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f1032p;
        if (isEmpty) {
            if (sVar.f2960x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f2960x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f2959w = charSequence;
        sVar.f2961y.setText(charSequence);
        int i = sVar.f2950n;
        if (i != 2) {
            sVar.f2951o = 2;
        }
        sVar.i(i, sVar.f2951o, sVar.h(sVar.f2961y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f1032p;
        sVar.A = colorStateList;
        c1 c1Var = sVar.f2961y;
        if (c1Var == null || colorStateList == null) {
            return;
        }
        c1Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        s sVar = this.f1032p;
        TextInputLayout textInputLayout = sVar.f2945h;
        if (sVar.f2960x == z3) {
            return;
        }
        sVar.c();
        if (z3) {
            c1 c1Var = new c1(sVar.f2944g, null);
            sVar.f2961y = c1Var;
            c1Var.setId(com.oriondriftchasers.arordrft.R.id.textinput_helper_text);
            sVar.f2961y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f2961y.setTypeface(typeface);
            }
            sVar.f2961y.setVisibility(4);
            sVar.f2961y.setAccessibilityLiveRegion(1);
            int i = sVar.f2962z;
            sVar.f2962z = i;
            c1 c1Var2 = sVar.f2961y;
            if (c1Var2 != null) {
                c1Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            c1 c1Var3 = sVar.f2961y;
            if (c1Var3 != null && colorStateList != null) {
                c1Var3.setTextColor(colorStateList);
            }
            sVar.a(sVar.f2961y, 1);
            sVar.f2961y.setAccessibilityDelegate(new r(sVar));
        } else {
            sVar.c();
            int i4 = sVar.f2950n;
            if (i4 == 2) {
                sVar.f2951o = 0;
            }
            sVar.i(i4, sVar.f2951o, sVar.h(sVar.f2961y, ""));
            sVar.g(sVar.f2961y, 1);
            sVar.f2961y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f2960x = z3;
    }

    public void setHelperTextTextAppearance(int i) {
        s sVar = this.f1032p;
        sVar.f2962z = i;
        c1 c1Var = sVar.f2961y;
        if (c1Var != null) {
            c1Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.D0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.I) {
            this.I = z3;
            if (z3) {
                CharSequence hint = this.f1020j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.f1020j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.f1020j.getHint())) {
                    this.f1020j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.f1020j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        b bVar = this.B0;
        if (i != bVar.f1181f0) {
            bVar.f1181f0 = i;
            bVar.j(false);
        }
        if (i != bVar.f1179e0) {
            bVar.f1179e0 = i;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.B0;
        TextInputLayout textInputLayout = bVar.f1172a;
        i2.d dVar = new i2.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f1825k;
        if (colorStateList != null) {
            bVar.f1188k = colorStateList;
        }
        float f2 = dVar.f1826l;
        if (f2 != 0.0f) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f1817a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f1821f;
        bVar.U = dVar.f1822g;
        bVar.S = dVar.f1823h;
        bVar.W = dVar.f1824j;
        i2.a aVar = bVar.f1204z;
        if (aVar != null) {
            aVar.f1811m = true;
        }
        a0.a aVar2 = new a0.a(10, bVar);
        dVar.a();
        bVar.f1204z = new i2.a(aVar2, dVar.f1830p);
        dVar.b(textInputLayout.getContext(), bVar.f1204z);
        bVar.j(false);
        this.f1033p0 = bVar.f1188k;
        if (this.f1020j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1033p0 != colorStateList) {
            if (this.f1031o0 == null) {
                b bVar = this.B0;
                if (bVar.f1188k != colorStateList) {
                    bVar.f1188k = colorStateList;
                    bVar.j(false);
                }
            }
            this.f1033p0 = colorStateList;
            if (this.f1020j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.f1040t = zVar;
    }

    public void setMaxEms(int i) {
        this.f1026m = i;
        EditText editText = this.f1020j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f1030o = i;
        EditText editText = this.f1020j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1024l = i;
        EditText editText = this.f1020j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f1028n = i;
        EditText editText = this.f1020j;
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
        o oVar = this.f1018h;
        oVar.f2916l.setContentDescription(i != 0 ? oVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        o oVar = this.f1018h;
        oVar.f2916l.setImageDrawable(i != 0 ? h.a.x(oVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        o oVar = this.f1018h;
        if (z3 && oVar.f2918n != 1) {
            oVar.g(1);
        } else if (z3) {
            oVar.getClass();
        } else {
            oVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        o oVar = this.f1018h;
        oVar.f2920p = colorStateList;
        h.a.d(oVar.f2911f, oVar.f2916l, colorStateList, oVar.f2921q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1018h;
        oVar.f2921q = mode;
        h.a.d(oVar.f2911f, oVar.f2916l, oVar.f2920p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1052z == null) {
            c1 c1Var = new c1(getContext(), null);
            this.f1052z = c1Var;
            c1Var.setId(com.oriondriftchasers.arordrft.R.id.textinput_placeholder);
            this.f1052z.setImportantForAccessibility(1);
            this.f1052z.setAccessibilityLiveRegion(1);
            h f2 = f();
            this.C = f2;
            f2.f1938g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            l0.m(this.f1052z, new com.google.android.material.datepicker.g(3));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1050y) {
                setPlaceholderTextEnabled(true);
            }
            this.f1048x = charSequence;
        }
        EditText editText = this.f1020j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B = i;
        c1 c1Var = this.f1052z;
        if (c1Var != null) {
            c1Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            c1 c1Var = this.f1052z;
            if (c1Var == null || colorStateList == null) {
                return;
            }
            c1Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        w wVar = this.f1016g;
        wVar.getClass();
        wVar.f2979h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        wVar.f2978g.setText(charSequence);
        wVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1016g.f2978g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1016g.f2978g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n nVar) {
        j jVar = this.L;
        if (jVar == null || jVar.f2598g.f2581a == nVar) {
            return;
        }
        this.R = nVar;
        c();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f1016g.i.setCheckable(z3);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? h.a.x(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        w wVar = this.f1016g;
        if (i < 0) {
            wVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != wVar.f2982l) {
            wVar.f2982l = i;
            CheckableImageButton checkableImageButton = wVar.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        w wVar = this.f1016g;
        CheckableImageButton checkableImageButton = wVar.i;
        View.OnLongClickListener onLongClickListener = wVar.f2984n;
        checkableImageButton.setOnClickListener(onClickListener);
        h.a.h0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        w wVar = this.f1016g;
        wVar.f2984n = onLongClickListener;
        CheckableImageButton checkableImageButton = wVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        h.a.h0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        w wVar = this.f1016g;
        wVar.f2983m = scaleType;
        wVar.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        w wVar = this.f1016g;
        if (wVar.f2980j != colorStateList) {
            wVar.f2980j = colorStateList;
            h.a.d(wVar.f2977f, wVar.i, colorStateList, wVar.f2981k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        w wVar = this.f1016g;
        if (wVar.f2981k != mode) {
            wVar.f2981k = mode;
            h.a.d(wVar.f2977f, wVar.i, wVar.f2980j, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f1016g.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        o oVar = this.f1018h;
        oVar.getClass();
        oVar.f2925u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.f2926v.setText(charSequence);
        oVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1018h.f2926v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1018h.f2926v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(o2.y yVar) {
        EditText editText = this.f1020j;
        if (editText != null) {
            l0.m(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1019h0) {
            this.f1019h0 = typeface;
            this.B0.n(typeface);
            s sVar = this.f1032p;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                c1 c1Var = sVar.f2954r;
                if (c1Var != null) {
                    c1Var.setTypeface(typeface);
                }
                c1 c1Var2 = sVar.f2961y;
                if (c1Var2 != null) {
                    c1Var2.setTypeface(typeface);
                }
            }
            c1 c1Var3 = this.f1042u;
            if (c1Var3 != null) {
                c1Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        c1 c1Var;
        EditText editText = this.f1020j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = m1.f2386a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(l.u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1038s && (c1Var = this.f1042u) != null) {
            mutate.setColorFilter(l.u.c(c1Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f1020j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f1020j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.f1020j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f1014f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e4 = e();
            if (e4 != layoutParams.topMargin) {
                layoutParams.topMargin = e4;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z3, boolean z4) {
        ColorStateList colorStateList;
        c1 c1Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1020j;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1020j;
        boolean z6 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1031o0;
        b bVar = this.B0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1031o0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1051y0) : this.f1051y0));
        } else if (o()) {
            c1 c1Var2 = this.f1032p.f2954r;
            bVar.k(c1Var2 != null ? c1Var2.getTextColors() : null);
        } else if (this.f1038s && (c1Var = this.f1042u) != null) {
            bVar.k(c1Var.getTextColors());
        } else if (z6 && (colorStateList = this.f1033p0) != null && bVar.f1188k != colorStateList) {
            bVar.f1188k = colorStateList;
            bVar.j(false);
        }
        o oVar = this.f1018h;
        w wVar = this.f1016g;
        if (z5 || !this.C0 || (isEnabled() && z6)) {
            if (z4 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z3 && this.D0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f1020j;
                x(editText3 != null ? editText3.getText() : null);
                wVar.f2985o = false;
                wVar.e();
                oVar.f2927w = false;
                oVar.n();
                return;
            }
            return;
        }
        if (z4 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (z3 && this.D0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((g) this.L).L.f2889r.isEmpty() && g()) {
                ((g) this.L).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            c1 c1Var3 = this.f1052z;
            if (c1Var3 != null && this.f1050y) {
                c1Var3.setText((CharSequence) null);
                j1.s.a(this.f1014f, this.D);
                this.f1052z.setVisibility(4);
            }
            wVar.f2985o = true;
            wVar.e();
            oVar.f2927w = true;
            oVar.n();
        }
    }

    public final void x(Editable editable) {
        ((h0) this.f1040t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1014f;
        if (length != 0 || this.A0) {
            c1 c1Var = this.f1052z;
            if (c1Var == null || !this.f1050y) {
                return;
            }
            c1Var.setText((CharSequence) null);
            j1.s.a(frameLayout, this.D);
            this.f1052z.setVisibility(4);
            return;
        }
        if (this.f1052z == null || !this.f1050y || TextUtils.isEmpty(this.f1048x)) {
            return;
        }
        this.f1052z.setText(this.f1048x);
        j1.s.a(frameLayout, this.C);
        this.f1052z.setVisibility(0);
        this.f1052z.bringToFront();
    }

    public final void y(boolean z3, boolean z4) {
        int defaultColor = this.f1041t0.getDefaultColor();
        int colorForState = this.f1041t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1041t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f1012c0 = colorForState2;
        } else if (z4) {
            this.f1012c0 = colorForState;
        } else {
            this.f1012c0 = defaultColor;
        }
    }

    public final void z() {
        c1 c1Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z3 = false;
        boolean z4 = isFocused() || ((editText2 = this.f1020j) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1020j) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.f1012c0 = this.f1051y0;
        } else if (o()) {
            if (this.f1041t0 != null) {
                y(z4, z3);
            } else {
                this.f1012c0 = getErrorCurrentTextColors();
            }
        } else if (!this.f1038s || (c1Var = this.f1042u) == null) {
            if (z4) {
                this.f1012c0 = this.f1039s0;
            } else if (z3) {
                this.f1012c0 = this.f1037r0;
            } else {
                this.f1012c0 = this.f1035q0;
            }
        } else if (this.f1041t0 != null) {
            y(z4, z3);
        } else {
            this.f1012c0 = c1Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        o oVar = this.f1018h;
        TextInputLayout textInputLayout = oVar.f2911f;
        CheckableImageButton checkableImageButton = oVar.f2916l;
        TextInputLayout textInputLayout2 = oVar.f2911f;
        oVar.l();
        h.a.Z(textInputLayout2, oVar.f2913h, oVar.i);
        h.a.Z(textInputLayout2, checkableImageButton, oVar.f2920p);
        if (oVar.b() instanceof k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                h.a.d(textInputLayout, checkableImageButton, oVar.f2920p, oVar.f2921q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        w wVar = this.f1016g;
        h.a.Z(wVar.f2977f, wVar.i, wVar.f2980j);
        if (this.U == 2) {
            int i = this.W;
            if (z4 && isEnabled()) {
                this.W = this.f1011b0;
            } else {
                this.W = this.f1010a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((g) this.L).y(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.f1045v0;
            } else if (z3 && !z4) {
                this.d0 = this.f1049x0;
            } else if (z4) {
                this.d0 = this.f1047w0;
            } else {
                this.d0 = this.f1043u0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1016g.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1016g.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1018h.f2916l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1018h.f2916l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1018h.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1018h.f2916l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        o oVar = this.f1018h;
        TextInputLayout textInputLayout = oVar.f2911f;
        CheckableImageButton checkableImageButton = oVar.f2916l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            h.a.d(textInputLayout, checkableImageButton, oVar.f2920p, oVar.f2921q);
            h.a.Z(textInputLayout, checkableImageButton, oVar.f2920p);
        }
    }
}
