package com.google.android.material.textfield;

import a.g0;
import a.k0;
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
import b4.l;
import c0.c;
import com.google.android.material.internal.CheckableImageButton;
import i2.d;
import i2.e;
import i2.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k1.h;
import l.j1;
import l.r;
import l.z0;
import l0.b;
import n0.p0;
import o2.f;
import o2.j;
import o2.n;
import o2.o;
import s2.a0;
import s2.g;
import s2.p;
import s2.s;
import s2.u;
import s2.w;
import s2.x;
import s2.y;
import s2.z;
import u2.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final d B0;
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
    public o R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1200a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1201b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1202c0;
    public int d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Rect f1203e0;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f1204f;

    /* renamed from: f0, reason: collision with root package name */
    public final Rect f1205f0;

    /* renamed from: g, reason: collision with root package name */
    public final w f1206g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f1207g0;
    public final p h;

    /* renamed from: h0, reason: collision with root package name */
    public Typeface f1208h0;
    public final int i;
    public ColorDrawable i0;

    /* renamed from: j, reason: collision with root package name */
    public EditText f1209j;

    /* renamed from: j0, reason: collision with root package name */
    public int f1210j0;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1211k;

    /* renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f1212k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1213l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorDrawable f1214l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1215m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1216m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1217n;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f1218n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1219o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f1220o0;

    /* renamed from: p, reason: collision with root package name */
    public final s f1221p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1222p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1223q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1224q0;

    /* renamed from: r, reason: collision with root package name */
    public int f1225r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1226r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1227s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1228s0;

    /* renamed from: t, reason: collision with root package name */
    public z f1229t;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f1230t0;

    /* renamed from: u, reason: collision with root package name */
    public z0 f1231u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1232u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1233v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1234v0;

    /* renamed from: w, reason: collision with root package name */
    public int f1235w;

    /* renamed from: w0, reason: collision with root package name */
    public int f1236w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1237x;

    /* renamed from: x0, reason: collision with root package name */
    public int f1238x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1239y;

    /* renamed from: y0, reason: collision with root package name */
    public int f1240y0;

    /* renamed from: z, reason: collision with root package name */
    public z0 f1241z;

    /* renamed from: z0, reason: collision with root package name */
    public int f1242z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.gdmhkmf.belbet.R.attr.textInputStyle, com.gdmhkmf.belbet.R.style.Widget_Design_TextInputLayout), attributeSet, com.gdmhkmf.belbet.R.attr.textInputStyle);
        this.f1213l = -1;
        this.f1215m = -1;
        this.f1217n = -1;
        this.f1219o = -1;
        this.f1221p = new s(this);
        this.f1229t = new k0(10);
        this.f1203e0 = new Rect();
        this.f1205f0 = new Rect();
        this.f1207g0 = new RectF();
        this.f1212k0 = new LinkedHashSet();
        d dVar = new d(this);
        this.B0 = dVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1204f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = r1.a.f3205a;
        dVar.R = linearInterpolator;
        dVar.j(false);
        dVar.Q = linearInterpolator;
        dVar.j(false);
        if (dVar.f2015g != 8388659) {
            dVar.f2015g = 8388659;
            dVar.j(false);
        }
        i2.o.a(context2, attributeSet, com.gdmhkmf.belbet.R.attr.textInputStyle, com.gdmhkmf.belbet.R.style.Widget_Design_TextInputLayout);
        int[] iArr = q1.a.K;
        i2.o.b(context2, attributeSet, iArr, com.gdmhkmf.belbet.R.attr.textInputStyle, com.gdmhkmf.belbet.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.gdmhkmf.belbet.R.attr.textInputStyle, com.gdmhkmf.belbet.R.style.Widget_Design_TextInputLayout);
        t tVar = new t(context2, obtainStyledAttributes);
        w wVar = new w(this, tVar);
        this.f1206g = wVar;
        this.I = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.D0 = obtainStyledAttributes.getBoolean(47, true);
        this.C0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.R = o.g(context2, attributeSet, com.gdmhkmf.belbet.R.attr.textInputStyle, com.gdmhkmf.belbet.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.gdmhkmf.belbet.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f1200a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1201b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.f1200a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        n k4 = this.R.k();
        if (dimension >= 0.0f) {
            k4.f2977e = new o2.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            k4.f2978f = new o2.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            k4.f2979g = new o2.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            k4.h = new o2.a(dimension4);
        }
        this.R = k4.a();
        ColorStateList s3 = l.s(context2, tVar, 7);
        if (s3 != null) {
            int defaultColor = s3.getDefaultColor();
            this.f1232u0 = defaultColor;
            this.d0 = defaultColor;
            if (s3.isStateful()) {
                this.f1234v0 = s3.getColorForState(new int[]{-16842910}, -1);
                this.f1236w0 = s3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1238x0 = s3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1236w0 = this.f1232u0;
                ColorStateList a5 = c.a(context2, com.gdmhkmf.belbet.R.color.mtrl_filled_background_color);
                this.f1234v0 = a5.getColorForState(new int[]{-16842910}, -1);
                this.f1238x0 = a5.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.f1232u0 = 0;
            this.f1234v0 = 0;
            this.f1236w0 = 0;
            this.f1238x0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList c5 = tVar.c(1);
            this.f1222p0 = c5;
            this.f1220o0 = c5;
        }
        ColorStateList s4 = l.s(context2, tVar, 14);
        this.f1228s0 = obtainStyledAttributes.getColor(14, 0);
        this.f1224q0 = context2.getColor(com.gdmhkmf.belbet.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1240y0 = context2.getColor(com.gdmhkmf.belbet.R.color.mtrl_textinput_disabled_color);
        this.f1226r0 = context2.getColor(com.gdmhkmf.belbet.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (s4 != null) {
            setBoxStrokeColorStateList(s4);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(l.s(context2, tVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = tVar.c(24);
        this.H = tVar.c(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z4 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z5 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z6 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1235w = obtainStyledAttributes.getResourceId(22, 0);
        this.f1233v = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1233v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1235w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(tVar.c(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(tVar.c(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(tVar.c(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(tVar.c(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(tVar.c(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(tVar.c(59));
        }
        p pVar = new p(this, tVar);
        this.h = pVar;
        boolean z7 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        tVar.k();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(wVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z7);
        setHelperTextEnabled(z5);
        setErrorEnabled(z4);
        setCounterEnabled(z6);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1209j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        EditText editText2 = this.f1209j;
        int U = l.U(editText2.getContext(), b4.d.R(editText2, com.gdmhkmf.belbet.R.attr.colorControlHighlight));
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            j jVar = this.L;
            int i4 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{l.P(U, i4, 0.1f), i4}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.L;
        int U2 = l.U(context, b4.d.Q(context, com.gdmhkmf.belbet.R.attr.colorSurface, "TextInputLayout"));
        j jVar3 = new j(jVar2.i());
        int P = l.P(U, U2, 0.1f);
        jVar3.r(new ColorStateList(iArr, new int[]{P, 0}));
        jVar3.setTint(U2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{P, U2});
        j jVar4 = new j(jVar2.i());
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

    public static void m(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z4);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1209j != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1209j = editText;
        int i = this.f1213l;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f1217n);
        }
        int i4 = this.f1215m;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f1219o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new y(this));
        Typeface typeface = this.f1209j.getTypeface();
        d dVar = this.B0;
        dVar.n(typeface);
        float textSize = this.f1209j.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.j(false);
        }
        float letterSpacing = this.f1209j.getLetterSpacing();
        if (dVar.X != letterSpacing) {
            dVar.X = letterSpacing;
            dVar.j(false);
        }
        int gravity = this.f1209j.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (dVar.f2015g != i5) {
            dVar.f2015g = i5;
            dVar.j(false);
        }
        if (dVar.f2013f != gravity) {
            dVar.f2013f = gravity;
            dVar.j(false);
        }
        this.f1242z0 = editText.getMinimumHeight();
        this.f1209j.addTextChangedListener(new x(this, editText));
        if (this.f1220o0 == null) {
            this.f1220o0 = this.f1209j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.f1209j.getHint();
                this.f1211k = hint;
                setHint(hint);
                this.f1209j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f1231u != null) {
            p(this.f1209j.getText());
        }
        t();
        this.f1221p.b();
        this.f1206g.bringToFront();
        p pVar = this.h;
        pVar.bringToFront();
        Iterator it = this.f1212k0.iterator();
        while (it.hasNext()) {
            ((s2.n) it.next()).a(this);
        }
        pVar.n();
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
        d dVar = this.B0;
        if (charSequence == null || !TextUtils.equals(dVar.B, charSequence)) {
            dVar.B = charSequence;
            dVar.C = null;
            dVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f1239y == z4) {
            return;
        }
        if (z4) {
            z0 z0Var = this.f1241z;
            if (z0Var != null) {
                this.f1204f.addView(z0Var);
                this.f1241z.setVisibility(0);
            }
        } else {
            z0 z0Var2 = this.f1241z;
            if (z0Var2 != null) {
                z0Var2.setVisibility(8);
            }
            this.f1241z = null;
        }
        this.f1239y = z4;
    }

    public final void a() {
        if (this.f1209j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f1209j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.f1209j.getPaddingEnd(), getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f1209j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1209j.getPaddingEnd(), getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (l.K(getContext())) {
            EditText editText3 = this.f1209j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1209j.getPaddingEnd(), getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        FrameLayout frameLayout = this.f1204f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f5) {
        d dVar = this.B0;
        if (dVar.f2007b == f5) {
            return;
        }
        int i = 1;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(l.W(getContext(), com.gdmhkmf.belbet.R.attr.motionEasingEmphasizedInterpolator, r1.a.f3206b));
            this.E0.setDuration(l.V(getContext(), com.gdmhkmf.belbet.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new g1.w(i, this));
        }
        this.E0.setFloatValues(dVar.f2007b, f5);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i4;
        j jVar = this.L;
        if (jVar == null) {
            return;
        }
        o i5 = jVar.i();
        o oVar = this.R;
        if (i5 != oVar) {
            this.L.setShapeAppearanceModel(oVar);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i4 = this.f1202c0) != 0) {
            j jVar2 = this.L;
            jVar2.f2955g.f2946j = i;
            jVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            o2.h hVar = jVar2.f2955g;
            if (hVar.d != valueOf) {
                hVar.d = valueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i6 = this.d0;
        if (this.U == 1) {
            Integer q4 = l.q(getContext(), com.gdmhkmf.belbet.R.attr.colorSurface);
            i6 = f0.a.b(this.d0, q4 != null ? q4.intValue() : 0);
        }
        this.d0 = i6;
        this.L.r(ColorStateList.valueOf(i6));
        j jVar3 = this.P;
        if (jVar3 != null && this.Q != null) {
            if (this.W > -1 && this.f1202c0 != 0) {
                jVar3.r(this.f1209j.isFocused() ? ColorStateList.valueOf(this.f1224q0) : ColorStateList.valueOf(this.f1202c0));
                this.Q.r(ColorStateList.valueOf(this.f1202c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f1209j == null) {
            throw new IllegalStateException();
        }
        boolean z4 = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f1205f0;
        rect2.bottom = i;
        int i4 = this.U;
        if (i4 == 1) {
            rect2.left = i(rect.left, z4);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z4);
            return rect2;
        }
        if (i4 != 2) {
            rect2.left = i(rect.left, z4);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z4);
            return rect2;
        }
        rect2.left = this.f1209j.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f1209j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f1209j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1211k != null) {
            boolean z4 = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.f1209j.setHint(this.f1211k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f1209j.setHint(hint);
                this.K = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1204f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f1209j) {
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
        boolean z4 = this.I;
        d dVar = this.B0;
        if (z4) {
            TextPaint textPaint = dVar.O;
            RectF rectF = dVar.f2011e;
            int save = canvas2.save();
            if (dVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(dVar.G);
                float f5 = dVar.f2027q;
                float f6 = dVar.f2028r;
                float f7 = dVar.F;
                if (f7 != 1.0f) {
                    canvas2.scale(f7, f7, f5, f6);
                }
                if ((dVar.f2012e0 > 1 || dVar.f2014f0 > 1) && !dVar.D && dVar.o()) {
                    float lineStart = dVar.f2027q - dVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f6);
                    float f8 = alpha;
                    textPaint.setAlpha((int) (dVar.f2010c0 * f8));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f9 = dVar.H;
                        float f10 = dVar.I;
                        float f11 = dVar.J;
                        int i4 = dVar.K;
                        textPaint.setShadowLayer(f9, f10, f11, f0.a.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / 255));
                    }
                    dVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (dVar.f2008b0 * f8));
                    if (i >= 31) {
                        float f12 = dVar.H;
                        float f13 = dVar.I;
                        float f14 = dVar.J;
                        int i5 = dVar.K;
                        textPaint.setShadowLayer(f12, f13, f14, f0.a.d(i5, (Color.alpha(i5) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = dVar.Z.getLineBaseline(0);
                    CharSequence charSequence = dVar.d0;
                    float f15 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f15, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(dVar.H, dVar.I, dVar.J, dVar.K);
                    }
                    String trim = dVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(dVar.Z.getLineEnd(0), str.length()), 0.0f, f15, (Paint) textPaint);
                } else {
                    canvas2.translate(f5, f6);
                    dVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (jVar = this.P) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.f1209j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f16 = dVar.f2007b;
            int centerX = bounds2.centerX();
            bounds.left = r1.a.c(centerX, bounds2.left, f16);
            bounds.right = r1.a.c(centerX, bounds2.right, f16);
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
        boolean z4;
        ColorStateList colorStateList;
        if (this.F0) {
            return;
        }
        this.F0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.B0;
        if (dVar != null) {
            dVar.M = drawableState;
            ColorStateList colorStateList2 = dVar.f2020k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f2018j) != null && colorStateList.isStateful())) {
                dVar.j(false);
                z4 = true;
                if (this.f1209j != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z4) {
                    invalidate();
                }
                this.F0 = false;
            }
        }
        z4 = false;
        if (this.f1209j != null) {
        }
        t();
        z();
        if (z4) {
        }
        this.F0 = false;
    }

    public final int e() {
        if (this.I) {
            int i = this.U;
            d dVar = this.B0;
            if (i == 0) {
                return (int) dVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (dVar.f() / 2.0f);
                }
                float f5 = dVar.f();
                TextPaint textPaint = dVar.P;
                textPaint.setTextSize(dVar.i);
                textPaint.setTypeface(dVar.f2029s);
                textPaint.setLetterSpacing(dVar.W);
                return Math.max(0, (int) (f5 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.h = l.V(getContext(), com.gdmhkmf.belbet.R.attr.motionDurationShort2, 87);
        hVar.i = l.W(getContext(), com.gdmhkmf.belbet.R.attr.motionEasingLinearInterpolator, r1.a.f3205a);
        return hVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1209j;
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
        RectF rectF = this.f1207g0;
        return layoutDirection == 1 ? this.R.h.a(rectF) : this.R.f2989g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1207g0;
        return layoutDirection == 1 ? this.R.f2989g.a(rectF) : this.R.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1207g0;
        return layoutDirection == 1 ? this.R.f2987e.a(rectF) : this.R.f2988f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1207g0;
        return layoutDirection == 1 ? this.R.f2988f.a(rectF) : this.R.f2987e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1228s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1230t0;
    }

    public int getBoxStrokeWidth() {
        return this.f1200a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1201b0;
    }

    public int getCounterMaxLength() {
        return this.f1225r;
    }

    public CharSequence getCounterOverflowDescription() {
        z0 z0Var;
        if (this.f1223q && this.f1227s && (z0Var = this.f1231u) != null) {
            return z0Var.getContentDescription();
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
        return this.f1220o0;
    }

    public EditText getEditText() {
        return this.f1209j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.f3277l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h.f3277l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h.f3283r;
    }

    public int getEndIconMode() {
        return this.h.f3279n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.f3284s;
    }

    public CheckableImageButton getEndIconView() {
        return this.h.f3277l;
    }

    public CharSequence getError() {
        s sVar = this.f1221p;
        if (sVar.f3312q) {
            return sVar.f3311p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1221p.f3315t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1221p.f3314s;
    }

    public int getErrorCurrentTextColors() {
        z0 z0Var = this.f1221p.f3313r;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f1221p;
        if (sVar.f3319x) {
            return sVar.f3318w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        z0 z0Var = this.f1221p.f3320y;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
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
        d dVar = this.B0;
        return dVar.g(dVar.f2020k);
    }

    public int getHintMaxLines() {
        return this.B0.f2012e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1222p0;
    }

    public z getLengthCounter() {
        return this.f1229t;
    }

    public int getMaxEms() {
        return this.f1215m;
    }

    public int getMaxWidth() {
        return this.f1219o;
    }

    public int getMinEms() {
        return this.f1213l;
    }

    public int getMinWidth() {
        return this.f1217n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.f3277l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.f3277l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1239y) {
            return this.f1237x;
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
        return this.f1206g.h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1206g.f3338g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1206g.f3338g;
    }

    public o getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1206g.i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1206g.i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1206g.f3341l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1206g.f3342m;
    }

    public CharSequence getSuffixText() {
        return this.h.f3286u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.f3287v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h.f3287v;
    }

    public Typeface getTypeface() {
        return this.f1208h0;
    }

    public final j h(boolean z4) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.gdmhkmf.belbet.R.dimen.mtrl_shape_corner_size_small_component);
        float f5 = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1209j;
        float popupElevation = editText instanceof u ? ((u) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.gdmhkmf.belbet.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.gdmhkmf.belbet.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        o2.l lVar = new o2.l();
        o2.l lVar2 = new o2.l();
        o2.l lVar3 = new o2.l();
        o2.l lVar4 = new o2.l();
        int i = 0;
        f fVar = new f(i);
        f fVar2 = new f(i);
        f fVar3 = new f(i);
        f fVar4 = new f(i);
        o2.a aVar = new o2.a(f5);
        o2.a aVar2 = new o2.a(f5);
        o2.a aVar3 = new o2.a(dimensionPixelOffset);
        o2.a aVar4 = new o2.a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f2984a = lVar;
        oVar.f2985b = lVar2;
        oVar.f2986c = lVar3;
        oVar.d = lVar4;
        oVar.f2987e = aVar;
        oVar.f2988f = aVar2;
        oVar.f2989g = aVar4;
        oVar.h = aVar3;
        oVar.i = fVar;
        oVar.f2990j = fVar2;
        oVar.f2991k = fVar3;
        oVar.f2992l = fVar4;
        EditText editText2 = this.f1209j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof u ? ((u) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.J;
            dropDownBackgroundTintList = ColorStateList.valueOf(l.U(context, b4.d.Q(context, com.gdmhkmf.belbet.R.attr.colorSurface, j.class.getSimpleName())));
        }
        j jVar = new j();
        jVar.n(context);
        jVar.r(dropDownBackgroundTintList);
        jVar.q(popupElevation);
        jVar.setShapeAppearanceModel(oVar);
        o2.h hVar = jVar.f2955g;
        if (hVar.f2945g == null) {
            hVar.f2945g = new Rect();
        }
        jVar.f2955g.f2945g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z4) {
        return ((z4 || getPrefixText() == null) ? (!z4 || getSuffixText() == null) ? this.f1209j.getCompoundPaddingLeft() : this.h.c() : this.f1206g.a()) + i;
    }

    public final int j(int i, boolean z4) {
        return i - ((z4 || getSuffixText() == null) ? (!z4 || getPrefixText() == null) ? this.f1209j.getCompoundPaddingRight() : this.f1206g.a() : this.h.c());
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
                o oVar = this.R;
                int i4 = g.M;
                if (oVar == null) {
                    oVar = new o();
                }
                s2.f fVar = new s2.f(oVar, new RectF());
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
                this.V = getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (l.K(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.f1209j;
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
        float f5;
        float f6;
        float f7;
        RectF rectF;
        float f8;
        int i;
        float f9;
        int i4;
        if (g()) {
            int width = this.f1209j.getWidth();
            int gravity = this.f1209j.getGravity();
            d dVar = this.B0;
            boolean c5 = dVar.c(dVar.B);
            dVar.D = c5;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c5) {
                        i4 = rect.left;
                        f7 = i4;
                    } else {
                        f5 = rect.right;
                        f6 = dVar.f2006a0;
                    }
                } else if (c5) {
                    f5 = rect.right;
                    f6 = dVar.f2006a0;
                } else {
                    i4 = rect.left;
                    f7 = i4;
                }
                float max = Math.max(f7, rect.left);
                rectF = this.f1207g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f8 = (width / 2.0f) + (dVar.f2006a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.D) {
                        f9 = dVar.f2006a0;
                        f8 = f9 + max;
                    } else {
                        i = rect.right;
                        f8 = i;
                    }
                } else if (dVar.D) {
                    i = rect.right;
                    f8 = i;
                } else {
                    f9 = dVar.f2006a0;
                    f8 = f9 + max;
                }
                rectF.right = Math.min(f8, rect.right);
                rectF.bottom = dVar.f() + rect.top;
                if (dVar.Z != null && !dVar.o()) {
                    StaticLayout staticLayout = dVar.Z;
                    float lineWidth = (dVar.i / dVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (dVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f10 = rectF.left;
                float f11 = this.T;
                rectF.left = f10 - f11;
                rectF.right += f11;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                rectF.top = 0.0f;
                g gVar = (g) this.L;
                gVar.getClass();
                gVar.z(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f5 = width / 2.0f;
            f6 = dVar.f2006a0 / 2.0f;
            f7 = f5 - f6;
            float max2 = Math.max(f7, rect.left);
            rectF = this.f1207g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f8 = (width / 2.0f) + (dVar.f2006a0 / 2.0f);
            rectF.right = Math.min(f8, rect.right);
            rectF.bottom = dVar.f() + rect.top;
            if (dVar.Z != null) {
                StaticLayout staticLayout2 = dVar.Z;
                float lineWidth2 = (dVar.i / dVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (dVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(z0 z0Var, int i) {
        try {
            z0Var.setTextAppearance(i);
            if (z0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z0Var.setTextAppearance(com.gdmhkmf.belbet.R.style.TextAppearance_AppCompat_Caption);
        z0Var.setTextColor(getContext().getColor(com.gdmhkmf.belbet.R.color.design_error));
    }

    public final boolean o() {
        s sVar = this.f1221p;
        return (sVar.f3310o != 1 || sVar.f3313r == null || TextUtils.isEmpty(sVar.f3311p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.h;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.H0 = false;
        if (this.f1209j != null && this.f1209j.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f1206g.getMeasuredHeight()))) {
            this.f1209j.setMinimumHeight(max);
            z4 = true;
        }
        boolean s3 = s();
        if (z4 || s3) {
            this.f1209j.post(new a.j(11, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        float descent;
        int i7;
        int compoundPaddingTop;
        super.onLayout(z4, i, i4, i5, i6);
        EditText editText = this.f1209j;
        if (editText != null) {
            Rect rect = this.f1203e0;
            e.a(this, editText, rect);
            j jVar = this.P;
            if (jVar != null) {
                int i8 = rect.bottom;
                jVar.setBounds(rect.left, i8 - this.f1200a0, rect.right, i8);
            }
            j jVar2 = this.Q;
            if (jVar2 != null) {
                int i9 = rect.bottom;
                jVar2.setBounds(rect.left, i9 - this.f1201b0, rect.right, i9);
            }
            if (this.I) {
                float textSize = this.f1209j.getTextSize();
                d dVar = this.B0;
                float f5 = dVar.h;
                TextPaint textPaint = dVar.P;
                if (f5 != textSize) {
                    dVar.h = textSize;
                    dVar.j(false);
                }
                int gravity = this.f1209j.getGravity();
                int i10 = (gravity & (-113)) | 48;
                if (dVar.f2015g != i10) {
                    dVar.f2015g = i10;
                    dVar.j(false);
                }
                if (dVar.f2013f != gravity) {
                    dVar.f2013f = gravity;
                    dVar.j(false);
                }
                Rect d = d(rect);
                int i11 = d.left;
                int i12 = d.top;
                int i13 = d.right;
                int i14 = d.bottom;
                Rect rect2 = dVar.d;
                if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
                    rect2.set(i11, i12, i13, i14);
                    dVar.N = true;
                }
                if (this.f1209j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(dVar.h);
                    textPaint.setTypeface(dVar.f2032v);
                    textPaint.setLetterSpacing(dVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(dVar.h);
                    textPaint.setTypeface(dVar.f2032v);
                    textPaint.setLetterSpacing(dVar.X);
                    descent = dVar.f2022l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f1209j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f1205f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.f1209j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i7 = 0;
                    } else {
                        textPaint.setTextSize(dVar.h);
                        textPaint.setTypeface(dVar.f2032v);
                        textPaint.setLetterSpacing(dVar.X);
                        i7 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f1209j.getCompoundPaddingTop() + rect.top) - i7;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f1209j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.f1209j.getMinLines() > 1) ? rect.bottom - this.f1209j.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i15 = rect3.left;
                int i16 = rect3.top;
                int i17 = rect3.right;
                Rect rect4 = dVar.f2009c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom || true != dVar.f2021k0) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    dVar.N = true;
                    dVar.f2021k0 = true;
                }
                dVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        float f5;
        EditText editText;
        super.onMeasure(i, i4);
        boolean z4 = this.H0;
        p pVar = this.h;
        if (!z4) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.f1241z != null && (editText = this.f1209j) != null) {
            this.f1241z.setGravity(editText.getGravity());
            this.f1241z.setPadding(this.f1209j.getCompoundPaddingLeft(), this.f1209j.getCompoundPaddingTop(), this.f1209j.getCompoundPaddingRight(), this.f1209j.getCompoundPaddingBottom());
        }
        pVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f1209j.getMeasuredWidth() - this.f1209j.getCompoundPaddingLeft()) - this.f1209j.getCompoundPaddingRight();
        d dVar = this.B0;
        TextPaint textPaint = dVar.P;
        textPaint.setTextSize(dVar.i);
        textPaint.setTypeface(dVar.f2029s);
        textPaint.setLetterSpacing(dVar.W);
        float f6 = measuredWidth;
        dVar.i0 = dVar.e(dVar.f2014f0, textPaint, dVar.B, (dVar.i / dVar.h) * f6, dVar.D).getHeight();
        textPaint.setTextSize(dVar.h);
        textPaint.setTypeface(dVar.f2032v);
        textPaint.setLetterSpacing(dVar.X);
        dVar.f2019j0 = dVar.e(dVar.f2012e0, textPaint, dVar.B, f6, dVar.D).getHeight();
        EditText editText2 = this.f1209j;
        Rect rect = this.f1203e0;
        e.a(this, editText2, rect);
        Rect d = d(rect);
        int i5 = d.left;
        int i6 = d.top;
        int i7 = d.right;
        int i8 = d.bottom;
        Rect rect2 = dVar.d;
        if (rect2.left != i5 || rect2.top != i6 || rect2.right != i7 || rect2.bottom != i8) {
            rect2.set(i5, i6, i7, i8);
            dVar.N = true;
        }
        v();
        a();
        if (this.f1209j == null) {
            return;
        }
        int i9 = dVar.f2019j0;
        if (i9 != -1) {
            f5 = i9;
        } else {
            TextPaint textPaint2 = dVar.P;
            textPaint2.setTextSize(dVar.h);
            textPaint2.setTypeface(dVar.f2032v);
            textPaint2.setLetterSpacing(dVar.X);
            f5 = -textPaint2.ascent();
        }
        if (this.f1237x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f1241z.getPaint());
            textPaint3.setTextSize(this.f1241z.getTextSize());
            textPaint3.setTypeface(this.f1241z.getTypeface());
            textPaint3.setLetterSpacing(this.f1241z.getLetterSpacing());
            k kVar = new k(this.f1237x, textPaint3, measuredWidth);
            kVar.f2054k = getLayoutDirection() == 1;
            kVar.f2053j = true;
            float lineSpacingExtra = this.f1241z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f1241z.getLineSpacingMultiplier();
            kVar.f2052g = lineSpacingExtra;
            kVar.h = lineSpacingMultiplier;
            kVar.f2056m = new g0(7, this);
            r3 = (this.U == 1 ? dVar.f() + this.V + this.i : 0.0f) + kVar.a().getHeight();
        }
        float max = Math.max(f5, r3);
        if (this.f1209j.getMeasuredHeight() < max) {
            this.f1209j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.f3386f);
        setError(a0Var.h);
        if (a0Var.i) {
            post(new androidx.fragment.app.g(9, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z4 = i == 1;
        if (z4 != this.S) {
            o2.d dVar = this.R.f2987e;
            RectF rectF = this.f1207g0;
            float a5 = dVar.a(rectF);
            float a6 = this.R.f2988f.a(rectF);
            float a7 = this.R.h.a(rectF);
            float a8 = this.R.f2989g.a(rectF);
            o oVar = this.R;
            b4.d dVar2 = oVar.f2984a;
            b4.d dVar3 = oVar.f2985b;
            b4.d dVar4 = oVar.d;
            b4.d dVar5 = oVar.f2986c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            o2.a aVar = new o2.a(a6);
            o2.a aVar2 = new o2.a(a5);
            o2.a aVar3 = new o2.a(a8);
            o2.a aVar4 = new o2.a(a7);
            o oVar2 = new o();
            oVar2.f2984a = dVar3;
            oVar2.f2985b = dVar2;
            oVar2.f2986c = dVar4;
            oVar2.d = dVar5;
            oVar2.f2987e = aVar;
            oVar2.f2988f = aVar2;
            oVar2.f2989g = aVar4;
            oVar2.h = aVar3;
            oVar2.i = fVar;
            oVar2.f2990j = fVar2;
            oVar2.f2991k = fVar3;
            oVar2.f2992l = fVar4;
            this.S = z4;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        if (o()) {
            a0Var.h = getError();
        }
        p pVar = this.h;
        a0Var.i = pVar.f3279n != 0 && pVar.f3277l.i;
        return a0Var;
    }

    public final void p(Editable editable) {
        ((k0) this.f1229t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f1227s;
        int i = this.f1225r;
        if (i == -1) {
            this.f1231u.setText(String.valueOf(length));
            this.f1231u.setContentDescription(null);
            this.f1227s = false;
        } else {
            this.f1227s = length > i;
            Context context = getContext();
            this.f1231u.setContentDescription(context.getString(this.f1227s ? com.gdmhkmf.belbet.R.string.character_counter_overflowed_content_description : com.gdmhkmf.belbet.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1225r)));
            if (z4 != this.f1227s) {
                q();
            }
            String str = b.f2623b;
            b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? b.f2625e : b.d;
            z0 z0Var = this.f1231u;
            String string = getContext().getString(com.gdmhkmf.belbet.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1225r));
            bVar.getClass();
            l0.f fVar = l0.g.f2633a;
            z0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f1209j == null || z4 == this.f1227s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        z0 z0Var = this.f1231u;
        if (z0Var != null) {
            n(z0Var, this.f1227s ? this.f1233v : this.f1235w);
            if (!this.f1227s && (colorStateList2 = this.E) != null) {
                this.f1231u.setTextColor(colorStateList2);
            }
            if (!this.f1227s || (colorStateList = this.F) == null) {
                return;
            }
            this.f1231u.setTextColor(colorStateList);
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.G;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue N = b4.d.N(context, com.gdmhkmf.belbet.R.attr.colorControlActivated);
            if (N != null) {
                int i = N.resourceId;
                if (i != 0) {
                    colorStateList2 = c.a(context, i);
                } else {
                    int i4 = N.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f1209j;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f1209j.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((o() || (this.f1231u != null && this.f1227s)) && (colorStateList = this.H) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z4;
        p pVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f1209j == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z5 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            w wVar = this.f1206g;
            if (wVar.getMeasuredWidth() > 0) {
                int max = Math.max(0, wVar.getMeasuredWidth() - this.f1209j.getPaddingLeft());
                if (this.i0 == null || this.f1210j0 != max) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.i0 = colorDrawable3;
                    this.f1210j0 = max;
                    colorDrawable3.setBounds(0, 0, max, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f1209j.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.i0;
                if (drawable2 != colorDrawable4) {
                    this.f1209j.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z4 = true;
                    pVar = this.h;
                    if ((!pVar.e() || ((pVar.f3279n != 0 && pVar.d()) || pVar.f3286u != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth = pVar.f3287v.getMeasuredWidth() - this.f1209j.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.h;
                        } else if (pVar.f3279n != 0 && pVar.d()) {
                            checkableImageButton = pVar.f3277l;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
                        }
                        int max2 = Math.max(0, measuredWidth);
                        compoundDrawablesRelative = this.f1209j.getCompoundDrawablesRelative();
                        colorDrawable = this.f1214l0;
                        if (colorDrawable == null && this.f1216m0 != max2) {
                            this.f1216m0 = max2;
                            colorDrawable.setBounds(0, 0, max2, 1);
                            this.f1209j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1214l0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f1214l0 = colorDrawable5;
                            this.f1216m0 = max2;
                            colorDrawable5.setBounds(0, 0, max2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f1214l0;
                        if (drawable != colorDrawable2) {
                            this.f1218n0 = drawable;
                            this.f1209j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f1214l0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f1209j.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1214l0) {
                            this.f1209j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1218n0, compoundDrawablesRelative3[3]);
                        } else {
                            z5 = z4;
                        }
                        this.f1214l0 = null;
                        return z5;
                    }
                    return z4;
                }
                z4 = false;
                pVar = this.h;
                if (pVar.e()) {
                }
                int measuredWidth2 = pVar.f3287v.getMeasuredWidth() - this.f1209j.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                int max22 = Math.max(0, measuredWidth2);
                compoundDrawablesRelative = this.f1209j.getCompoundDrawablesRelative();
                colorDrawable = this.f1214l0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1214l0;
                if (drawable != colorDrawable2) {
                }
                return z4;
            }
        }
        if (this.i0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f1209j.getCompoundDrawablesRelative();
            this.f1209j.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.i0 = null;
            z4 = true;
            pVar = this.h;
            if (pVar.e()) {
            }
            int measuredWidth22 = pVar.f3287v.getMeasuredWidth() - this.f1209j.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            int max222 = Math.max(0, measuredWidth22);
            compoundDrawablesRelative = this.f1209j.getCompoundDrawablesRelative();
            colorDrawable = this.f1214l0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1214l0;
            if (drawable != colorDrawable2) {
            }
            return z4;
        }
        z4 = false;
        pVar = this.h;
        if (pVar.e()) {
        }
        int measuredWidth222 = pVar.f3287v.getMeasuredWidth() - this.f1209j.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        int max2222 = Math.max(0, measuredWidth222);
        compoundDrawablesRelative = this.f1209j.getCompoundDrawablesRelative();
        colorDrawable = this.f1214l0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1214l0;
        if (drawable != colorDrawable2) {
        }
        return z4;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.f1232u0 = i;
            this.f1236w0 = i;
            this.f1238x0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1232u0 = defaultColor;
        this.d0 = defaultColor;
        this.f1234v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1236w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1238x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.f1209j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.V = i;
    }

    public void setBoxCornerFamily(int i) {
        n k4 = this.R.k();
        o2.d dVar = this.R.f2987e;
        k4.f2974a = l.n(i);
        k4.f2977e = dVar;
        o2.d dVar2 = this.R.f2988f;
        k4.f2975b = l.n(i);
        k4.f2978f = dVar2;
        o2.d dVar3 = this.R.h;
        k4.d = l.n(i);
        k4.h = dVar3;
        o2.d dVar4 = this.R.f2989g;
        k4.f2976c = l.n(i);
        k4.f2979g = dVar4;
        this.R = k4.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1228s0 != i) {
            this.f1228s0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1224q0 = colorStateList.getDefaultColor();
            this.f1240y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1226r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1228s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1228s0 != colorStateList.getDefaultColor()) {
            this.f1228s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1230t0 != colorStateList) {
            this.f1230t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1200a0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1201b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f1223q != z4) {
            s sVar = this.f1221p;
            if (z4) {
                z0 z0Var = new z0(getContext(), null);
                this.f1231u = z0Var;
                z0Var.setId(com.gdmhkmf.belbet.R.id.textinput_counter);
                Typeface typeface = this.f1208h0;
                if (typeface != null) {
                    this.f1231u.setTypeface(typeface);
                }
                this.f1231u.setMaxLines(1);
                sVar.a(this.f1231u, 2);
                ((ViewGroup.MarginLayoutParams) this.f1231u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.gdmhkmf.belbet.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1231u != null) {
                    EditText editText = this.f1209j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f1231u, 2);
                this.f1231u = null;
            }
            this.f1223q = z4;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1225r != i) {
            if (i > 0) {
                this.f1225r = i;
            } else {
                this.f1225r = -1;
            }
            if (!this.f1223q || this.f1231u == null) {
                return;
            }
            EditText editText = this.f1209j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1233v != i) {
            this.f1233v = i;
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
        if (this.f1235w != i) {
            this.f1235w = i;
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
            if (o() || (this.f1231u != null && this.f1227s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1220o0 = colorStateList;
        this.f1222p0 = colorStateList;
        if (this.f1209j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        m(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.h.f3277l.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.h.f3277l.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.h;
        pVar.g(i != 0 ? pVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.h;
        Drawable y4 = i != 0 ? b4.d.y(pVar.getContext(), i) : null;
        TextInputLayout textInputLayout = pVar.f3273f;
        CheckableImageButton checkableImageButton = pVar.f3277l;
        checkableImageButton.setImageDrawable(y4);
        if (y4 != null) {
            r1.b.a(textInputLayout, checkableImageButton, pVar.f3281p, pVar.f3282q);
            r1.b.x(textInputLayout, checkableImageButton, pVar.f3281p);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.h;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f3283r) {
            pVar.f3283r = i;
            CheckableImageButton checkableImageButton = pVar.f3277l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.h;
        CheckableImageButton checkableImageButton = pVar.f3277l;
        View.OnLongClickListener onLongClickListener = pVar.f3285t;
        checkableImageButton.setOnClickListener(onClickListener);
        r1.b.A(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.h;
        pVar.f3285t = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f3277l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r1.b.A(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.h;
        pVar.f3284s = scaleType;
        pVar.f3277l.setScaleType(scaleType);
        pVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.h;
        if (pVar.f3281p != colorStateList) {
            pVar.f3281p = colorStateList;
            r1.b.a(pVar.f3273f, pVar.f3277l, colorStateList, pVar.f3282q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.h;
        if (pVar.f3282q != mode) {
            pVar.f3282q = mode;
            r1.b.a(pVar.f3273f, pVar.f3277l, pVar.f3281p, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.h.i(z4);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.f1221p;
        if (!sVar.f3312q) {
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
        sVar.f3311p = charSequence;
        sVar.f3313r.setText(charSequence);
        int i = sVar.f3309n;
        if (i != 1) {
            sVar.f3310o = 1;
        }
        sVar.i(i, sVar.f3310o, sVar.h(sVar.f3313r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        s sVar = this.f1221p;
        sVar.f3315t = i;
        z0 z0Var = sVar.f3313r;
        if (z0Var != null) {
            z0Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f1221p;
        sVar.f3314s = charSequence;
        z0 z0Var = sVar.f3313r;
        if (z0Var != null) {
            z0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        s sVar = this.f1221p;
        TextInputLayout textInputLayout = sVar.h;
        if (sVar.f3312q == z4) {
            return;
        }
        sVar.c();
        if (z4) {
            z0 z0Var = new z0(sVar.f3304g, null);
            sVar.f3313r = z0Var;
            z0Var.setId(com.gdmhkmf.belbet.R.id.textinput_error);
            sVar.f3313r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f3313r.setTypeface(typeface);
            }
            int i = sVar.f3316u;
            sVar.f3316u = i;
            z0 z0Var2 = sVar.f3313r;
            if (z0Var2 != null) {
                sVar.h.n(z0Var2, i);
            }
            ColorStateList colorStateList = sVar.f3317v;
            sVar.f3317v = colorStateList;
            z0 z0Var3 = sVar.f3313r;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f3314s;
            sVar.f3314s = charSequence;
            z0 z0Var4 = sVar.f3313r;
            if (z0Var4 != null) {
                z0Var4.setContentDescription(charSequence);
            }
            int i4 = sVar.f3315t;
            sVar.f3315t = i4;
            z0 z0Var5 = sVar.f3313r;
            if (z0Var5 != null) {
                z0Var5.setAccessibilityLiveRegion(i4);
            }
            sVar.f3313r.setVisibility(4);
            sVar.a(sVar.f3313r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f3313r, 0);
            sVar.f3313r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f3312q = z4;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.h;
        pVar.j(i != 0 ? b4.d.y(pVar.getContext(), i) : null);
        r1.b.x(pVar.f3273f, pVar.h, pVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.h;
        CheckableImageButton checkableImageButton = pVar.h;
        View.OnLongClickListener onLongClickListener = pVar.f3276k;
        checkableImageButton.setOnClickListener(onClickListener);
        r1.b.A(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.h;
        pVar.f3276k = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r1.b.A(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.h;
        if (pVar.i != colorStateList) {
            pVar.i = colorStateList;
            r1.b.a(pVar.f3273f, pVar.h, colorStateList, pVar.f3275j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.h;
        if (pVar.f3275j != mode) {
            pVar.f3275j = mode;
            r1.b.a(pVar.f3273f, pVar.h, pVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        s sVar = this.f1221p;
        sVar.f3316u = i;
        z0 z0Var = sVar.f3313r;
        if (z0Var != null) {
            sVar.h.n(z0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f1221p;
        sVar.f3317v = colorStateList;
        z0 z0Var = sVar.f3313r;
        if (z0Var == null || colorStateList == null) {
            return;
        }
        z0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.C0 != z4) {
            this.C0 = z4;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f1221p;
        if (isEmpty) {
            if (sVar.f3319x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f3319x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f3318w = charSequence;
        sVar.f3320y.setText(charSequence);
        int i = sVar.f3309n;
        if (i != 2) {
            sVar.f3310o = 2;
        }
        sVar.i(i, sVar.f3310o, sVar.h(sVar.f3320y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f1221p;
        sVar.A = colorStateList;
        z0 z0Var = sVar.f3320y;
        if (z0Var == null || colorStateList == null) {
            return;
        }
        z0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        s sVar = this.f1221p;
        TextInputLayout textInputLayout = sVar.h;
        if (sVar.f3319x == z4) {
            return;
        }
        sVar.c();
        if (z4) {
            z0 z0Var = new z0(sVar.f3304g, null);
            sVar.f3320y = z0Var;
            z0Var.setId(com.gdmhkmf.belbet.R.id.textinput_helper_text);
            sVar.f3320y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f3320y.setTypeface(typeface);
            }
            sVar.f3320y.setVisibility(4);
            sVar.f3320y.setImportantForAccessibility(2);
            int i = sVar.f3321z;
            sVar.f3321z = i;
            z0 z0Var2 = sVar.f3320y;
            if (z0Var2 != null) {
                z0Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            z0 z0Var3 = sVar.f3320y;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            sVar.a(sVar.f3320y, 1);
        } else {
            sVar.c();
            int i4 = sVar.f3309n;
            if (i4 == 2) {
                sVar.f3310o = 0;
            }
            sVar.i(i4, sVar.f3310o, sVar.h(sVar.f3320y, ""));
            sVar.g(sVar.f3320y, 1);
            sVar.f3320y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f3319x = z4;
    }

    public void setHelperTextTextAppearance(int i) {
        s sVar = this.f1221p;
        sVar.f3321z = i;
        z0 z0Var = sVar.f3320y;
        if (z0Var != null) {
            z0Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.D0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.I) {
            this.I = z4;
            if (z4) {
                CharSequence hint = this.f1209j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.f1209j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.f1209j.getHint())) {
                    this.f1209j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.f1209j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        d dVar = this.B0;
        if (i != dVar.f2014f0) {
            dVar.f2014f0 = i;
            dVar.j(false);
        }
        if (i != dVar.f2012e0) {
            dVar.f2012e0 = i;
            dVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.B0;
        TextInputLayout textInputLayout = dVar.f2005a;
        l2.d dVar2 = new l2.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f2713k;
        if (colorStateList != null) {
            dVar.f2020k = colorStateList;
        }
        float f5 = dVar2.f2714l;
        if (f5 != 0.0f) {
            dVar.i = f5;
        }
        ColorStateList colorStateList2 = dVar2.f2706a;
        if (colorStateList2 != null) {
            dVar.V = colorStateList2;
        }
        dVar.T = dVar2.f2710f;
        dVar.U = dVar2.f2711g;
        dVar.S = dVar2.h;
        dVar.W = dVar2.f2712j;
        l2.a aVar = dVar.f2036z;
        if (aVar != null) {
            aVar.f2701q = true;
        }
        a0.a aVar2 = new a0.a(17, dVar);
        dVar2.a();
        dVar.f2036z = new l2.a(aVar2, dVar2.f2718p);
        dVar2.b(textInputLayout.getContext(), dVar.f2036z);
        dVar.j(false);
        this.f1222p0 = dVar.f2020k;
        if (this.f1209j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1222p0 != colorStateList) {
            if (this.f1220o0 == null) {
                d dVar = this.B0;
                if (dVar.f2020k != colorStateList) {
                    dVar.f2020k = colorStateList;
                    dVar.j(false);
                }
            }
            this.f1222p0 = colorStateList;
            if (this.f1209j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.f1229t = zVar;
    }

    public void setMaxEms(int i) {
        this.f1215m = i;
        EditText editText = this.f1209j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f1219o = i;
        EditText editText = this.f1209j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1213l = i;
        EditText editText = this.f1209j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f1217n = i;
        EditText editText = this.f1209j;
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
        p pVar = this.h;
        pVar.f3277l.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.h;
        pVar.f3277l.setImageDrawable(i != 0 ? b4.d.y(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        p pVar = this.h;
        if (z4 && pVar.f3279n != 1) {
            pVar.h(1);
        } else if (z4) {
            pVar.getClass();
        } else {
            pVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.h;
        pVar.f3281p = colorStateList;
        r1.b.a(pVar.f3273f, pVar.f3277l, colorStateList, pVar.f3282q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.h;
        pVar.f3282q = mode;
        r1.b.a(pVar.f3273f, pVar.f3277l, pVar.f3281p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1241z == null) {
            z0 z0Var = new z0(getContext(), null);
            this.f1241z = z0Var;
            z0Var.setId(com.gdmhkmf.belbet.R.id.textinput_placeholder);
            this.f1241z.setImportantForAccessibility(1);
            this.f1241z.setAccessibilityLiveRegion(1);
            h f5 = f();
            this.C = f5;
            f5.f2348g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            p0.m(this.f1241z, new com.google.android.material.datepicker.j(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1239y) {
                setPlaceholderTextEnabled(true);
            }
            this.f1237x = charSequence;
        }
        EditText editText = this.f1209j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B = i;
        z0 z0Var = this.f1241z;
        if (z0Var != null) {
            z0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            z0 z0Var = this.f1241z;
            if (z0Var == null || colorStateList == null) {
                return;
            }
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        w wVar = this.f1206g;
        wVar.getClass();
        wVar.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        wVar.f3338g.setText(charSequence);
        wVar.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1206g.f3338g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1206g.f3338g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        j jVar = this.L;
        if (jVar == null || jVar.i() == oVar) {
            return;
        }
        this.R = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f1206g.i.setCheckable(z4);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? b4.d.y(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        w wVar = this.f1206g;
        if (i < 0) {
            wVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != wVar.f3341l) {
            wVar.f3341l = i;
            CheckableImageButton checkableImageButton = wVar.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        w wVar = this.f1206g;
        CheckableImageButton checkableImageButton = wVar.i;
        View.OnLongClickListener onLongClickListener = wVar.f3343n;
        checkableImageButton.setOnClickListener(onClickListener);
        r1.b.A(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        w wVar = this.f1206g;
        wVar.f3343n = onLongClickListener;
        CheckableImageButton checkableImageButton = wVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r1.b.A(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        w wVar = this.f1206g;
        wVar.f3342m = scaleType;
        wVar.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        w wVar = this.f1206g;
        if (wVar.f3339j != colorStateList) {
            wVar.f3339j = colorStateList;
            r1.b.a(wVar.f3337f, wVar.i, colorStateList, wVar.f3340k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        w wVar = this.f1206g;
        if (wVar.f3340k != mode) {
            wVar.f3340k = mode;
            r1.b.a(wVar.f3337f, wVar.i, wVar.f3339j, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f1206g.d(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.h;
        pVar.getClass();
        pVar.f3286u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f3287v.setText(charSequence);
        pVar.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.f3287v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.f3287v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(y yVar) {
        EditText editText = this.f1209j;
        if (editText != null) {
            p0.m(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1208h0) {
            this.f1208h0 = typeface;
            this.B0.n(typeface);
            s sVar = this.f1221p;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                z0 z0Var = sVar.f3313r;
                if (z0Var != null) {
                    z0Var.setTypeface(typeface);
                }
                z0 z0Var2 = sVar.f3320y;
                if (z0Var2 != null) {
                    z0Var2.setTypeface(typeface);
                }
            }
            z0 z0Var3 = this.f1231u;
            if (z0Var3 != null) {
                z0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        z0 z0Var;
        EditText editText = this.f1209j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = j1.f2483a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1227s && (z0Var = this.f1231u) != null) {
            mutate.setColorFilter(r.c(z0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f1209j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f1209j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.f1209j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f1204f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e4 = e();
            if (e4 != layoutParams.topMargin) {
                layoutParams.topMargin = e4;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        z0 z0Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1209j;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1209j;
        boolean z7 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1220o0;
        d dVar = this.B0;
        if (colorStateList2 != null) {
            dVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1220o0;
            dVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1240y0) : this.f1240y0));
        } else if (o()) {
            z0 z0Var2 = this.f1221p.f3313r;
            dVar.k(z0Var2 != null ? z0Var2.getTextColors() : null);
        } else if (this.f1227s && (z0Var = this.f1231u) != null) {
            dVar.k(z0Var.getTextColors());
        } else if (z7 && (colorStateList = this.f1222p0) != null && dVar.f2020k != colorStateList) {
            dVar.f2020k = colorStateList;
            dVar.j(false);
        }
        p pVar = this.h;
        w wVar = this.f1206g;
        if (z6 || !this.C0 || (isEnabled() && z7)) {
            if (z5 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z4 && this.D0) {
                    b(1.0f);
                } else {
                    dVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f1209j;
                x(editText3 != null ? editText3.getText() : null);
                wVar.f3344o = false;
                wVar.f();
                pVar.f3288w = false;
                pVar.o();
                return;
            }
            return;
        }
        if (z5 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (z4 && this.D0) {
                b(0.0f);
            } else {
                dVar.m(0.0f);
            }
            if (g() && !((g) this.L).L.f3250q.isEmpty() && g()) {
                ((g) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            z0 z0Var3 = this.f1241z;
            if (z0Var3 != null && this.f1239y) {
                z0Var3.setText((CharSequence) null);
                k1.r.a(this.f1204f, this.D);
                this.f1241z.setVisibility(4);
            }
            wVar.f3344o = true;
            wVar.f();
            pVar.f3288w = true;
            pVar.o();
        }
    }

    public final void x(Editable editable) {
        ((k0) this.f1229t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1204f;
        if (length != 0 || this.A0) {
            z0 z0Var = this.f1241z;
            if (z0Var == null || !this.f1239y) {
                return;
            }
            z0Var.setText((CharSequence) null);
            k1.r.a(frameLayout, this.D);
            this.f1241z.setVisibility(4);
            return;
        }
        if (this.f1241z == null || !this.f1239y || TextUtils.isEmpty(this.f1237x)) {
            return;
        }
        this.f1241z.setText(this.f1237x);
        k1.r.a(frameLayout, this.C);
        this.f1241z.setVisibility(0);
        this.f1241z.bringToFront();
    }

    public final void y(boolean z4, boolean z5) {
        int defaultColor = this.f1230t0.getDefaultColor();
        int colorForState = this.f1230t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1230t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f1202c0 = colorForState2;
        } else if (z5) {
            this.f1202c0 = colorForState;
        } else {
            this.f1202c0 = defaultColor;
        }
    }

    public final void z() {
        z0 z0Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z4 = isFocused() || ((editText2 = this.f1209j) != null && editText2.hasFocus());
        boolean z5 = isHovered() || ((editText = this.f1209j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f1202c0 = this.f1240y0;
        } else if (o()) {
            if (this.f1230t0 != null) {
                y(z4, z5);
            } else {
                this.f1202c0 = getErrorCurrentTextColors();
            }
        } else if (!this.f1227s || (z0Var = this.f1231u) == null) {
            if (z4) {
                this.f1202c0 = this.f1228s0;
            } else if (z5) {
                this.f1202c0 = this.f1226r0;
            } else {
                this.f1202c0 = this.f1224q0;
            }
        } else if (this.f1230t0 != null) {
            y(z4, z5);
        } else {
            this.f1202c0 = z0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        p pVar = this.h;
        TextInputLayout textInputLayout = pVar.f3273f;
        CheckableImageButton checkableImageButton = pVar.f3277l;
        TextInputLayout textInputLayout2 = pVar.f3273f;
        pVar.m();
        r1.b.x(textInputLayout2, pVar.h, pVar.i);
        r1.b.x(textInputLayout2, checkableImageButton, pVar.f3281p);
        if (pVar.b() instanceof s2.k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                r1.b.a(textInputLayout, checkableImageButton, pVar.f3281p, pVar.f3282q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        w wVar = this.f1206g;
        r1.b.x(wVar.f3337f, wVar.i, wVar.f3339j);
        if (this.U == 2) {
            int i = this.W;
            if (z4 && isEnabled()) {
                this.W = this.f1201b0;
            } else {
                this.W = this.f1200a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((g) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.f1234v0;
            } else if (z5 && !z4) {
                this.d0 = this.f1238x0;
            } else if (z4) {
                this.d0 = this.f1236w0;
            } else {
                this.d0 = this.f1232u0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f1209j;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f1206g.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1206g.c(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.h.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h.f3277l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h.f3277l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.h;
        TextInputLayout textInputLayout = pVar.f3273f;
        CheckableImageButton checkableImageButton = pVar.f3277l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            r1.b.a(textInputLayout, checkableImageButton, pVar.f3281p, pVar.f3282q);
            r1.b.x(textInputLayout, checkableImageButton, pVar.f3281p);
        }
    }
}
