package com.google.android.material.textfield;

import a2.e;
import a2.f;
import a2.k;
import a2.p;
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
import androidx.emoji2.text.s;
import com.google.android.material.internal.CheckableImageButton;
import f1.h;
import g2.j;
import g2.l;
import g2.n;
import g2.o;
import i0.b;
import j2.a0;
import j2.b0;
import j2.c0;
import j2.d0;
import j2.e0;
import j2.r;
import j2.u;
import j2.x;
import j2.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k.j1;
import k.z0;
import k0.j0;
import k3.d;
import k3.m;
import l0.g;
import l2.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final f B0;
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
    public int a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1393b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1394c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f1395d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Rect f1396e0;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f1397f;
    public final Rect f0;
    public final a0 g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f1398g0;
    public final r h;

    /* renamed from: h0, reason: collision with root package name */
    public Typeface f1399h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f1400i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorDrawable f1401i0;

    /* renamed from: j, reason: collision with root package name */
    public EditText f1402j;

    /* renamed from: j0, reason: collision with root package name */
    public int f1403j0;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1404k;

    /* renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f1405k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1406l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorDrawable f1407l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1408m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1409m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1410n;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f1411n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1412o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f1413o0;

    /* renamed from: p, reason: collision with root package name */
    public final u f1414p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1415p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1416q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1417q0;

    /* renamed from: r, reason: collision with root package name */
    public int f1418r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1419r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1420s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1421s0;

    /* renamed from: t, reason: collision with root package name */
    public d0 f1422t;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f1423t0;

    /* renamed from: u, reason: collision with root package name */
    public z0 f1424u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1425u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1426v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1427v0;

    /* renamed from: w, reason: collision with root package name */
    public int f1428w;

    /* renamed from: w0, reason: collision with root package name */
    public int f1429w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1430x;

    /* renamed from: x0, reason: collision with root package name */
    public int f1431x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1432y;

    /* renamed from: y0, reason: collision with root package name */
    public int f1433y0;

    /* renamed from: z, reason: collision with root package name */
    public z0 f1434z;

    /* renamed from: z0, reason: collision with root package name */
    public int f1435z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.textInputStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_Design_TextInputLayout), attributeSet, com.gglhk.bofio.fortunetiger.R.attr.textInputStyle);
        this.f1406l = -1;
        this.f1408m = -1;
        this.f1410n = -1;
        this.f1412o = -1;
        this.f1414p = new u(this);
        this.f1422t = new d3.a(8);
        this.f1396e0 = new Rect();
        this.f0 = new Rect();
        this.f1398g0 = new RectF();
        this.f1405k0 = new LinkedHashSet();
        f fVar = new f(this);
        this.B0 = fVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1397f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = m1.a.f2905a;
        fVar.R = linearInterpolator;
        fVar.j(false);
        fVar.Q = linearInterpolator;
        fVar.j(false);
        if (fVar.g != 8388659) {
            fVar.g = 8388659;
            fVar.j(false);
        }
        p.a(context2, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.textInputStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_Design_TextInputLayout);
        int[] iArr = l1.a.F;
        p.b(context2, attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.textInputStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.gglhk.bofio.fortunetiger.R.attr.textInputStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_Design_TextInputLayout);
        s sVar = new s(context2, obtainStyledAttributes);
        a0 a0Var = new a0(this, sVar);
        this.g = a0Var;
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
        this.R = o.f(context2, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.textInputStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1400i = getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1393b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        n j4 = this.R.j();
        if (dimension >= 0.0f) {
            j4.f1880e = new g2.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            j4.f1881f = new g2.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            j4.g = new g2.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            j4.h = new g2.a(dimension4);
        }
        this.R = j4.a();
        ColorStateList v3 = m.v(context2, sVar, 7);
        if (v3 != null) {
            int defaultColor = v3.getDefaultColor();
            this.f1425u0 = defaultColor;
            this.f1395d0 = defaultColor;
            if (v3.isStateful()) {
                this.f1427v0 = v3.getColorForState(new int[]{-16842910}, -1);
                this.f1429w0 = v3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1431x0 = v3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1429w0 = this.f1425u0;
                ColorStateList D = d.D(context2, com.gglhk.bofio.fortunetiger.R.color.mtrl_filled_background_color);
                this.f1427v0 = D.getColorForState(new int[]{-16842910}, -1);
                this.f1431x0 = D.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1395d0 = 0;
            this.f1425u0 = 0;
            this.f1427v0 = 0;
            this.f1429w0 = 0;
            this.f1431x0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList h = sVar.h(1);
            this.f1415p0 = h;
            this.f1413o0 = h;
        }
        ColorStateList v4 = m.v(context2, sVar, 14);
        this.f1421s0 = obtainStyledAttributes.getColor(14, 0);
        this.f1417q0 = context2.getColor(com.gglhk.bofio.fortunetiger.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1433y0 = context2.getColor(com.gglhk.bofio.fortunetiger.R.color.mtrl_textinput_disabled_color);
        this.f1419r0 = context2.getColor(com.gglhk.bofio.fortunetiger.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (v4 != null) {
            setBoxStrokeColorStateList(v4);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(m.v(context2, sVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = sVar.h(24);
        this.H = sVar.h(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i4 = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z4 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z5 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1428w = obtainStyledAttributes.getResourceId(22, 0);
        this.f1426v = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.f1426v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1428w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(sVar.h(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(sVar.h(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(sVar.h(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(sVar.h(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(sVar.h(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(sVar.h(59));
        }
        r rVar = new r(this, sVar);
        this.h = rVar;
        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        sVar.t();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(a0Var);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1402j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        EditText editText2 = this.f1402j;
        int t3 = g.t(editText2.getContext(), d.a0(editText2, com.gglhk.bofio.fortunetiger.R.attr.colorControlHighlight));
        int i4 = this.U;
        int[][] iArr = I0;
        if (i4 != 2) {
            if (i4 != 1) {
                return null;
            }
            j jVar = this.L;
            int i5 = this.f1395d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{g.o(t3, i5, 0.1f), i5}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.L;
        int t4 = g.t(context, d.Z(context, com.gglhk.bofio.fortunetiger.R.attr.colorSurface, "TextInputLayout"));
        j jVar3 = new j(jVar2.i());
        int o4 = g.o(t3, t4, 0.1f);
        jVar3.q(new ColorStateList(iArr, new int[]{o4, 0}));
        jVar3.setTint(t4);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{o4, t4});
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

    public static void m(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1402j != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1402j = editText;
        int i4 = this.f1406l;
        if (i4 != -1) {
            setMinEms(i4);
        } else {
            setMinWidth(this.f1410n);
        }
        int i5 = this.f1408m;
        if (i5 != -1) {
            setMaxEms(i5);
        } else {
            setMaxWidth(this.f1412o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new c0(this));
        Typeface typeface = this.f1402j.getTypeface();
        f fVar = this.B0;
        fVar.n(typeface);
        float textSize = this.f1402j.getTextSize();
        if (fVar.h != textSize) {
            fVar.h = textSize;
            fVar.j(false);
        }
        float letterSpacing = this.f1402j.getLetterSpacing();
        if (fVar.X != letterSpacing) {
            fVar.X = letterSpacing;
            fVar.j(false);
        }
        int gravity = this.f1402j.getGravity();
        int i6 = (gravity & (-113)) | 48;
        if (fVar.g != i6) {
            fVar.g = i6;
            fVar.j(false);
        }
        if (fVar.f15f != gravity) {
            fVar.f15f = gravity;
            fVar.j(false);
        }
        this.f1435z0 = editText.getMinimumHeight();
        this.f1402j.addTextChangedListener(new b0(this, editText));
        if (this.f1413o0 == null) {
            this.f1413o0 = this.f1402j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.f1402j.getHint();
                this.f1404k = hint;
                setHint(hint);
                this.f1402j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f1424u != null) {
            p(this.f1402j.getText());
        }
        t();
        this.f1414p.b();
        this.g.bringToFront();
        r rVar = this.h;
        rVar.bringToFront();
        Iterator it = this.f1405k0.iterator();
        while (it.hasNext()) {
            ((j2.p) it.next()).a(this);
        }
        rVar.n();
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
        f fVar = this.B0;
        if (charSequence == null || !TextUtils.equals(fVar.B, charSequence)) {
            fVar.B = charSequence;
            fVar.C = null;
            fVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f1432y == z3) {
            return;
        }
        if (z3) {
            z0 z0Var = this.f1434z;
            if (z0Var != null) {
                this.f1397f.addView(z0Var);
                this.f1434z.setVisibility(0);
            }
        } else {
            z0 z0Var2 = this.f1434z;
            if (z0Var2 != null) {
                z0Var2.setVisibility(8);
            }
            this.f1434z = null;
        }
        this.f1432y = z3;
    }

    public final void a() {
        if (this.f1402j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f1402j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.f1400i), this.f1402j.getPaddingEnd(), getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f1402j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1402j.getPaddingEnd(), getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (m.E(getContext())) {
            EditText editText3 = this.f1402j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1402j.getPaddingEnd(), getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i4, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1397f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f4) {
        f fVar = this.B0;
        if (fVar.f8b == f4) {
            return;
        }
        int i4 = 1;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(m.R(getContext(), com.gglhk.bofio.fortunetiger.R.attr.motionEasingEmphasizedInterpolator, m1.a.f2906b));
            this.E0.setDuration(m.Q(getContext(), com.gglhk.bofio.fortunetiger.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new b1.m(i4, this));
        }
        this.E0.setFloatValues(fVar.f8b, f4);
        this.E0.start();
    }

    public final void c() {
        int i4;
        int i5;
        j jVar = this.L;
        if (jVar == null) {
            return;
        }
        o i6 = jVar.i();
        o oVar = this.R;
        if (i6 != oVar) {
            this.L.setShapeAppearanceModel(oVar);
        }
        if (this.U == 2 && (i4 = this.W) > -1 && (i5 = this.f1394c0) != 0) {
            j jVar2 = this.L;
            jVar2.g.f1849j = i4;
            jVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i5);
            g2.h hVar = jVar2.g;
            if (hVar.f1845d != valueOf) {
                hVar.f1845d = valueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i7 = this.f1395d0;
        if (this.U == 1) {
            i7 = c0.a.b(this.f1395d0, g.h(getContext(), com.gglhk.bofio.fortunetiger.R.attr.colorSurface, 0));
        }
        this.f1395d0 = i7;
        this.L.q(ColorStateList.valueOf(i7));
        j jVar3 = this.P;
        if (jVar3 != null && this.Q != null) {
            if (this.W > -1 && this.f1394c0 != 0) {
                jVar3.q(this.f1402j.isFocused() ? ColorStateList.valueOf(this.f1417q0) : ColorStateList.valueOf(this.f1394c0));
                this.Q.q(ColorStateList.valueOf(this.f1394c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f1402j == null) {
            throw new IllegalStateException();
        }
        boolean z3 = getLayoutDirection() == 1;
        int i4 = rect.bottom;
        Rect rect2 = this.f0;
        rect2.bottom = i4;
        int i5 = this.U;
        if (i5 == 1) {
            rect2.left = i(rect.left, z3);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        if (i5 != 2) {
            rect2.left = i(rect.left, z3);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        rect2.left = this.f1402j.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f1402j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f1402j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f1404k != null) {
            boolean z3 = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.f1402j.setHint(this.f1404k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.f1402j.setHint(hint);
                this.K = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        FrameLayout frameLayout = this.f1397f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
            View childAt = frameLayout.getChildAt(i5);
            ViewStructure newChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(newChild, i4);
            if (childAt == this.f1402j) {
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
        f fVar = this.B0;
        if (z3) {
            TextPaint textPaint = fVar.O;
            RectF rectF = fVar.f13e;
            int save = canvas2.save();
            if (fVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(fVar.G);
                float f4 = fVar.f29q;
                float f5 = fVar.f30r;
                float f6 = fVar.F;
                if (f6 != 1.0f) {
                    canvas2.scale(f6, f6, f4, f5);
                }
                if ((fVar.f14e0 > 1 || fVar.f0 > 1) && !fVar.D && fVar.o()) {
                    float lineStart = fVar.f29q - fVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f5);
                    float f7 = alpha;
                    textPaint.setAlpha((int) (fVar.f10c0 * f7));
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        float f8 = fVar.H;
                        float f9 = fVar.I;
                        float f10 = fVar.J;
                        int i5 = fVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, c0.a.d(i5, (textPaint.getAlpha() * Color.alpha(i5)) / 255));
                    }
                    fVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (fVar.f9b0 * f7));
                    if (i4 >= 31) {
                        float f11 = fVar.H;
                        float f12 = fVar.I;
                        float f13 = fVar.J;
                        int i6 = fVar.K;
                        textPaint.setShadowLayer(f11, f12, f13, c0.a.d(i6, (Color.alpha(i6) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = fVar.Z.getLineBaseline(0);
                    CharSequence charSequence = fVar.f12d0;
                    float f14 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(fVar.H, fVar.I, fVar.J, fVar.K);
                    }
                    String trim = fVar.f12d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(fVar.Z.getLineEnd(0), str.length()), 0.0f, f14, (Paint) textPaint);
                } else {
                    canvas2.translate(f4, f5);
                    fVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (jVar = this.P) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.f1402j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f15 = fVar.f8b;
            int centerX = bounds2.centerX();
            bounds.left = m1.a.c(centerX, bounds2.left, f15);
            bounds.right = m1.a.c(centerX, bounds2.right, f15);
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
        f fVar = this.B0;
        if (fVar != null) {
            fVar.M = drawableState;
            ColorStateList colorStateList2 = fVar.f22k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = fVar.f20j) != null && colorStateList.isStateful())) {
                fVar.j(false);
                z3 = true;
                if (this.f1402j != null) {
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
        if (this.f1402j != null) {
        }
        t();
        z();
        if (z3) {
        }
        this.F0 = false;
    }

    public final int e() {
        if (this.I) {
            int i4 = this.U;
            f fVar = this.B0;
            if (i4 == 0) {
                return (int) fVar.f();
            }
            if (i4 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (fVar.f() / 2.0f);
                }
                float f4 = fVar.f();
                TextPaint textPaint = fVar.P;
                textPaint.setTextSize(fVar.f18i);
                textPaint.setTypeface(fVar.f31s);
                textPaint.setLetterSpacing(fVar.W);
                return Math.max(0, (int) (f4 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.h = m.Q(getContext(), com.gglhk.bofio.fortunetiger.R.attr.motionDurationShort2, 87);
        hVar.f1698i = m.R(getContext(), com.gglhk.bofio.fortunetiger.R.attr.motionEasingLinearInterpolator, m1.a.f2905a);
        return hVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof j2.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1402j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i4 = this.U;
        if (i4 == 1 || i4 == 2) {
            return this.L;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1395d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1398g0;
        return layoutDirection == 1 ? this.R.h.a(rectF) : this.R.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1398g0;
        return layoutDirection == 1 ? this.R.g.a(rectF) : this.R.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1398g0;
        return layoutDirection == 1 ? this.R.f1889e.a(rectF) : this.R.f1890f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f1398g0;
        return layoutDirection == 1 ? this.R.f1890f.a(rectF) : this.R.f1889e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1421s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1423t0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1393b0;
    }

    public int getCounterMaxLength() {
        return this.f1418r;
    }

    public CharSequence getCounterOverflowDescription() {
        z0 z0Var;
        if (this.f1416q && this.f1420s && (z0Var = this.f1424u) != null) {
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
        return this.f1413o0;
    }

    public EditText getEditText() {
        return this.f1402j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.f2340l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h.f2340l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h.f2346r;
    }

    public int getEndIconMode() {
        return this.h.f2342n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.f2347s;
    }

    public CheckableImageButton getEndIconView() {
        return this.h.f2340l;
    }

    public CharSequence getError() {
        u uVar = this.f1414p;
        if (uVar.f2375q) {
            return uVar.f2374p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1414p.f2378t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1414p.f2377s;
    }

    public int getErrorCurrentTextColors() {
        z0 z0Var = this.f1414p.f2376r;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1414p;
        if (uVar.f2382x) {
            return uVar.f2381w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        z0 z0Var = this.f1414p.f2383y;
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
        f fVar = this.B0;
        return fVar.g(fVar.f22k);
    }

    public int getHintMaxLines() {
        return this.B0.f14e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1415p0;
    }

    public d0 getLengthCounter() {
        return this.f1422t;
    }

    public int getMaxEms() {
        return this.f1408m;
    }

    public int getMaxWidth() {
        return this.f1412o;
    }

    public int getMinEms() {
        return this.f1406l;
    }

    public int getMinWidth() {
        return this.f1410n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.f2340l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.f2340l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1432y) {
            return this.f1430x;
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
        return this.g.h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.g.g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.g.g;
    }

    public o getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.g.f2288i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.g.f2288i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.g.f2291l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.g.f2292m;
    }

    public CharSequence getSuffixText() {
        return this.h.f2349u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.f2350v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h.f2350v;
    }

    public Typeface getTypeface() {
        return this.f1399h0;
    }

    public final j h(boolean z3) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_shape_corner_size_small_component);
        float f4 = z3 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1402j;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.gglhk.bofio.fortunetiger.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        l lVar = new l();
        l lVar2 = new l();
        l lVar3 = new l();
        l lVar4 = new l();
        int i4 = 0;
        g2.f fVar = new g2.f(i4);
        g2.f fVar2 = new g2.f(i4);
        g2.f fVar3 = new g2.f(i4);
        g2.f fVar4 = new g2.f(i4);
        g2.a aVar = new g2.a(f4);
        g2.a aVar2 = new g2.a(f4);
        g2.a aVar3 = new g2.a(dimensionPixelOffset);
        g2.a aVar4 = new g2.a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f1886a = lVar;
        oVar.f1887b = lVar2;
        oVar.c = lVar3;
        oVar.f1888d = lVar4;
        oVar.f1889e = aVar;
        oVar.f1890f = aVar2;
        oVar.g = aVar4;
        oVar.h = aVar3;
        oVar.f1891i = fVar;
        oVar.f1892j = fVar2;
        oVar.f1893k = fVar3;
        oVar.f1894l = fVar4;
        EditText editText2 = this.f1402j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.J;
            dropDownBackgroundTintList = ColorStateList.valueOf(g.t(context, d.Z(context, com.gglhk.bofio.fortunetiger.R.attr.colorSurface, j.class.getSimpleName())));
        }
        j jVar = new j();
        jVar.m(context);
        jVar.q(dropDownBackgroundTintList);
        jVar.p(popupElevation);
        jVar.setShapeAppearanceModel(oVar);
        g2.h hVar = jVar.g;
        if (hVar.g == null) {
            hVar.g = new Rect();
        }
        jVar.g.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i4, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f1402j.getCompoundPaddingLeft() : this.h.c() : this.g.a()) + i4;
    }

    public final int j(int i4, boolean z3) {
        return i4 - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f1402j.getCompoundPaddingRight() : this.g.a() : this.h.c());
    }

    public final void k() {
        int i4 = this.U;
        if (i4 == 0) {
            this.L = null;
            this.P = null;
            this.Q = null;
        } else if (i4 == 1) {
            this.L = new j(this.R);
            this.P = new j();
            this.Q = new j();
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof j2.h)) {
                this.L = new j(this.R);
            } else {
                o oVar = this.R;
                int i5 = j2.h.M;
                if (oVar == null) {
                    oVar = new o();
                }
                j2.g gVar = new j2.g(oVar, new RectF());
                j2.h hVar = new j2.h(gVar);
                hVar.L = gVar;
                this.L = hVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (m.E(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.f1402j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.U;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
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
        float f4;
        float f5;
        float f6;
        RectF rectF;
        float f7;
        int i4;
        float f8;
        int i5;
        if (g()) {
            int width = this.f1402j.getWidth();
            int gravity = this.f1402j.getGravity();
            f fVar = this.B0;
            boolean c = fVar.c(fVar.B);
            fVar.D = c;
            Rect rect = fVar.f11d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i5 = rect.left;
                        f6 = i5;
                    } else {
                        f4 = rect.right;
                        f5 = fVar.a0;
                    }
                } else if (c) {
                    f4 = rect.right;
                    f5 = fVar.a0;
                } else {
                    i5 = rect.left;
                    f6 = i5;
                }
                float max = Math.max(f6, rect.left);
                rectF = this.f1398g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f7 = (width / 2.0f) + (fVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (fVar.D) {
                        f8 = fVar.a0;
                        f7 = f8 + max;
                    } else {
                        i4 = rect.right;
                        f7 = i4;
                    }
                } else if (fVar.D) {
                    i4 = rect.right;
                    f7 = i4;
                } else {
                    f8 = fVar.a0;
                    f7 = f8 + max;
                }
                rectF.right = Math.min(f7, rect.right);
                rectF.bottom = fVar.f() + rect.top;
                if (fVar.Z != null && !fVar.o()) {
                    StaticLayout staticLayout = fVar.Z;
                    float lineWidth = (fVar.f18i / fVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (fVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f9 = rectF.left;
                float f10 = this.T;
                rectF.left = f9 - f10;
                rectF.right += f10;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                rectF.top = 0.0f;
                j2.h hVar = (j2.h) this.L;
                hVar.getClass();
                hVar.w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f4 = width / 2.0f;
            f5 = fVar.a0 / 2.0f;
            f6 = f4 - f5;
            float max2 = Math.max(f6, rect.left);
            rectF = this.f1398g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f7 = (width / 2.0f) + (fVar.a0 / 2.0f);
            rectF.right = Math.min(f7, rect.right);
            rectF.bottom = fVar.f() + rect.top;
            if (fVar.Z != null) {
                StaticLayout staticLayout2 = fVar.Z;
                float lineWidth2 = (fVar.f18i / fVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (fVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(z0 z0Var, int i4) {
        try {
            z0Var.setTextAppearance(i4);
            if (z0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z0Var.setTextAppearance(com.gglhk.bofio.fortunetiger.R.style.TextAppearance_AppCompat_Caption);
        z0Var.setTextColor(getContext().getColor(com.gglhk.bofio.fortunetiger.R.color.design_error));
    }

    public final boolean o() {
        u uVar = this.f1414p;
        return (uVar.f2373o != 1 || uVar.f2376r == null || TextUtils.isEmpty(uVar.f2374p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        r rVar = this.h;
        rVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.H0 = false;
        if (this.f1402j != null && this.f1402j.getMeasuredHeight() < (max = Math.max(rVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.f1402j.setMinimumHeight(max);
            z3 = true;
        }
        boolean s2 = s();
        if (z3 || s2) {
            this.f1402j.post(new a2.r(9, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        float descent;
        int i8;
        int compoundPaddingTop;
        super.onLayout(z3, i4, i5, i6, i7);
        EditText editText = this.f1402j;
        if (editText != null) {
            Rect rect = this.f1396e0;
            a2.g.a(this, editText, rect);
            j jVar = this.P;
            if (jVar != null) {
                int i9 = rect.bottom;
                jVar.setBounds(rect.left, i9 - this.a0, rect.right, i9);
            }
            j jVar2 = this.Q;
            if (jVar2 != null) {
                int i10 = rect.bottom;
                jVar2.setBounds(rect.left, i10 - this.f1393b0, rect.right, i10);
            }
            if (this.I) {
                float textSize = this.f1402j.getTextSize();
                f fVar = this.B0;
                float f4 = fVar.h;
                TextPaint textPaint = fVar.P;
                if (f4 != textSize) {
                    fVar.h = textSize;
                    fVar.j(false);
                }
                int gravity = this.f1402j.getGravity();
                int i11 = (gravity & (-113)) | 48;
                if (fVar.g != i11) {
                    fVar.g = i11;
                    fVar.j(false);
                }
                if (fVar.f15f != gravity) {
                    fVar.f15f = gravity;
                    fVar.j(false);
                }
                Rect d4 = d(rect);
                int i12 = d4.left;
                int i13 = d4.top;
                int i14 = d4.right;
                int i15 = d4.bottom;
                Rect rect2 = fVar.f11d;
                if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
                    rect2.set(i12, i13, i14, i15);
                    fVar.N = true;
                }
                if (this.f1402j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(fVar.h);
                    textPaint.setTypeface(fVar.f34v);
                    textPaint.setLetterSpacing(fVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(fVar.h);
                    textPaint.setTypeface(fVar.f34v);
                    textPaint.setLetterSpacing(fVar.X);
                    descent = fVar.f24l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f1402j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.f1402j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i8 = 0;
                    } else {
                        textPaint.setTextSize(fVar.h);
                        textPaint.setTypeface(fVar.f34v);
                        textPaint.setLetterSpacing(fVar.X);
                        i8 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f1402j.getCompoundPaddingTop() + rect.top) - i8;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f1402j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.f1402j.getMinLines() > 1) ? rect.bottom - this.f1402j.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i16 = rect3.left;
                int i17 = rect3.top;
                int i18 = rect3.right;
                Rect rect4 = fVar.c;
                if (rect4.left != i16 || rect4.top != i17 || rect4.right != i18 || rect4.bottom != compoundPaddingBottom || true != fVar.f23k0) {
                    rect4.set(i16, i17, i18, compoundPaddingBottom);
                    fVar.N = true;
                    fVar.f23k0 = true;
                }
                fVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        float f4;
        EditText editText;
        super.onMeasure(i4, i5);
        boolean z3 = this.H0;
        r rVar = this.h;
        if (!z3) {
            rVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.f1434z != null && (editText = this.f1402j) != null) {
            this.f1434z.setGravity(editText.getGravity());
            this.f1434z.setPadding(this.f1402j.getCompoundPaddingLeft(), this.f1402j.getCompoundPaddingTop(), this.f1402j.getCompoundPaddingRight(), this.f1402j.getCompoundPaddingBottom());
        }
        rVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f1402j.getMeasuredWidth() - this.f1402j.getCompoundPaddingLeft()) - this.f1402j.getCompoundPaddingRight();
        f fVar = this.B0;
        TextPaint textPaint = fVar.P;
        textPaint.setTextSize(fVar.f18i);
        textPaint.setTypeface(fVar.f31s);
        textPaint.setLetterSpacing(fVar.W);
        float f5 = measuredWidth;
        fVar.f19i0 = fVar.e(fVar.f0, textPaint, fVar.B, (fVar.f18i / fVar.h) * f5, fVar.D).getHeight();
        textPaint.setTextSize(fVar.h);
        textPaint.setTypeface(fVar.f34v);
        textPaint.setLetterSpacing(fVar.X);
        fVar.f21j0 = fVar.e(fVar.f14e0, textPaint, fVar.B, f5, fVar.D).getHeight();
        EditText editText2 = this.f1402j;
        Rect rect = this.f1396e0;
        a2.g.a(this, editText2, rect);
        Rect d4 = d(rect);
        int i6 = d4.left;
        int i7 = d4.top;
        int i8 = d4.right;
        int i9 = d4.bottom;
        Rect rect2 = fVar.f11d;
        if (rect2.left != i6 || rect2.top != i7 || rect2.right != i8 || rect2.bottom != i9) {
            rect2.set(i6, i7, i8, i9);
            fVar.N = true;
        }
        v();
        a();
        if (this.f1402j == null) {
            return;
        }
        int i10 = fVar.f21j0;
        if (i10 != -1) {
            f4 = i10;
        } else {
            TextPaint textPaint2 = fVar.P;
            textPaint2.setTextSize(fVar.h);
            textPaint2.setTypeface(fVar.f34v);
            textPaint2.setLetterSpacing(fVar.X);
            f4 = -textPaint2.ascent();
        }
        if (this.f1430x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f1434z.getPaint());
            textPaint3.setTextSize(this.f1434z.getTextSize());
            textPaint3.setTypeface(this.f1434z.getTypeface());
            textPaint3.setLetterSpacing(this.f1434z.getLetterSpacing());
            k kVar = new k(this.f1430x, textPaint3, measuredWidth);
            kVar.f54k = getLayoutDirection() == 1;
            kVar.f53j = true;
            float lineSpacingExtra = this.f1434z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f1434z.getLineSpacingMultiplier();
            kVar.g = lineSpacingExtra;
            kVar.h = lineSpacingMultiplier;
            kVar.f56m = new z(this);
            r3 = (this.U == 1 ? fVar.f() + this.V + this.f1400i : 0.0f) + kVar.a().getHeight();
        }
        float max = Math.max(f4, r3);
        if (this.f1402j.getMeasuredHeight() < max) {
            this.f1402j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e0 e0Var = (e0) parcelable;
        super.onRestoreInstanceState(e0Var.f3016f);
        setError(e0Var.h);
        if (e0Var.f2310i) {
            post(new androidx.fragment.app.g(6, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z3 = i4 == 1;
        if (z3 != this.S) {
            g2.d dVar = this.R.f1889e;
            RectF rectF = this.f1398g0;
            float a4 = dVar.a(rectF);
            float a5 = this.R.f1890f.a(rectF);
            float a6 = this.R.h.a(rectF);
            float a7 = this.R.g.a(rectF);
            o oVar = this.R;
            d dVar2 = oVar.f1886a;
            d dVar3 = oVar.f1887b;
            d dVar4 = oVar.f1888d;
            d dVar5 = oVar.c;
            g2.f fVar = new g2.f(0);
            g2.f fVar2 = new g2.f(0);
            g2.f fVar3 = new g2.f(0);
            g2.f fVar4 = new g2.f(0);
            g2.a aVar = new g2.a(a5);
            g2.a aVar2 = new g2.a(a4);
            g2.a aVar3 = new g2.a(a7);
            g2.a aVar4 = new g2.a(a6);
            o oVar2 = new o();
            oVar2.f1886a = dVar3;
            oVar2.f1887b = dVar2;
            oVar2.c = dVar4;
            oVar2.f1888d = dVar5;
            oVar2.f1889e = aVar;
            oVar2.f1890f = aVar2;
            oVar2.g = aVar4;
            oVar2.h = aVar3;
            oVar2.f1891i = fVar;
            oVar2.f1892j = fVar2;
            oVar2.f1893k = fVar3;
            oVar2.f1894l = fVar4;
            this.S = z3;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e0 e0Var = new e0(super.onSaveInstanceState());
        if (o()) {
            e0Var.h = getError();
        }
        r rVar = this.h;
        e0Var.f2310i = rVar.f2342n != 0 && rVar.f2340l.f1364i;
        return e0Var;
    }

    public final void p(Editable editable) {
        ((d3.a) this.f1422t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f1420s;
        int i4 = this.f1418r;
        if (i4 == -1) {
            this.f1424u.setText(String.valueOf(length));
            this.f1424u.setContentDescription(null);
            this.f1420s = false;
        } else {
            this.f1420s = length > i4;
            Context context = getContext();
            this.f1424u.setContentDescription(context.getString(this.f1420s ? com.gglhk.bofio.fortunetiger.R.string.character_counter_overflowed_content_description : com.gglhk.bofio.fortunetiger.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1418r)));
            if (z3 != this.f1420s) {
                q();
            }
            String str = b.f2084b;
            b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? b.f2086e : b.f2085d;
            z0 z0Var = this.f1424u;
            String string = getContext().getString(com.gglhk.bofio.fortunetiger.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1418r));
            bVar.getClass();
            i0.f fVar = i0.g.f2094a;
            z0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f1402j == null || z3 == this.f1420s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        z0 z0Var = this.f1424u;
        if (z0Var != null) {
            n(z0Var, this.f1420s ? this.f1426v : this.f1428w);
            if (!this.f1420s && (colorStateList2 = this.E) != null) {
                this.f1424u.setTextColor(colorStateList2);
            }
            if (!this.f1420s || (colorStateList = this.F) == null) {
                return;
            }
            this.f1424u.setTextColor(colorStateList);
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.G;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue X = d.X(context.getTheme(), com.gglhk.bofio.fortunetiger.R.attr.colorControlActivated);
            if (X != null) {
                int i4 = X.resourceId;
                if (i4 != 0) {
                    colorStateList2 = d.D(context, i4);
                } else {
                    int i5 = X.data;
                    if (i5 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i5);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f1402j;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f1402j.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((o() || (this.f1424u != null && this.f1420s)) && (colorStateList = this.H) != null) {
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
        boolean z3;
        r rVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f1402j == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z4 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            a0 a0Var = this.g;
            if (a0Var.getMeasuredWidth() > 0) {
                int max = Math.max(0, a0Var.getMeasuredWidth() - this.f1402j.getPaddingLeft());
                if (this.f1401i0 == null || this.f1403j0 != max) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1401i0 = colorDrawable3;
                    this.f1403j0 = max;
                    colorDrawable3.setBounds(0, 0, max, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f1402j.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1401i0;
                if (drawable2 != colorDrawable4) {
                    this.f1402j.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z3 = true;
                    rVar = this.h;
                    if ((!rVar.e() || ((rVar.f2342n != 0 && rVar.d()) || rVar.f2349u != null)) && rVar.getMeasuredWidth() > 0) {
                        int measuredWidth = rVar.f2350v.getMeasuredWidth() - this.f1402j.getPaddingRight();
                        if (!rVar.e()) {
                            checkableImageButton = rVar.h;
                        } else if (rVar.f2342n != 0 && rVar.d()) {
                            checkableImageButton = rVar.f2340l;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
                        }
                        int max2 = Math.max(0, measuredWidth);
                        compoundDrawablesRelative = this.f1402j.getCompoundDrawablesRelative();
                        colorDrawable = this.f1407l0;
                        if (colorDrawable == null && this.f1409m0 != max2) {
                            this.f1409m0 = max2;
                            colorDrawable.setBounds(0, 0, max2, 1);
                            this.f1402j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1407l0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f1407l0 = colorDrawable5;
                            this.f1409m0 = max2;
                            colorDrawable5.setBounds(0, 0, max2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f1407l0;
                        if (drawable != colorDrawable2) {
                            this.f1411n0 = drawable;
                            this.f1402j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f1407l0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f1402j.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1407l0) {
                            this.f1402j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1411n0, compoundDrawablesRelative3[3]);
                        } else {
                            z4 = z3;
                        }
                        this.f1407l0 = null;
                        return z4;
                    }
                    return z3;
                }
                z3 = false;
                rVar = this.h;
                if (rVar.e()) {
                }
                int measuredWidth2 = rVar.f2350v.getMeasuredWidth() - this.f1402j.getPaddingRight();
                if (!rVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                int max22 = Math.max(0, measuredWidth2);
                compoundDrawablesRelative = this.f1402j.getCompoundDrawablesRelative();
                colorDrawable = this.f1407l0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1407l0;
                if (drawable != colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1401i0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f1402j.getCompoundDrawablesRelative();
            this.f1402j.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1401i0 = null;
            z3 = true;
            rVar = this.h;
            if (rVar.e()) {
            }
            int measuredWidth22 = rVar.f2350v.getMeasuredWidth() - this.f1402j.getPaddingRight();
            if (!rVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            int max222 = Math.max(0, measuredWidth22);
            compoundDrawablesRelative = this.f1402j.getCompoundDrawablesRelative();
            colorDrawable = this.f1407l0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1407l0;
            if (drawable != colorDrawable2) {
            }
            return z3;
        }
        z3 = false;
        rVar = this.h;
        if (rVar.e()) {
        }
        int measuredWidth222 = rVar.f2350v.getMeasuredWidth() - this.f1402j.getPaddingRight();
        if (!rVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        int max2222 = Math.max(0, measuredWidth222);
        compoundDrawablesRelative = this.f1402j.getCompoundDrawablesRelative();
        colorDrawable = this.f1407l0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1407l0;
        if (drawable != colorDrawable2) {
        }
        return z3;
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.f1395d0 != i4) {
            this.f1395d0 = i4;
            this.f1425u0 = i4;
            this.f1429w0 = i4;
            this.f1431x0 = i4;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(getContext().getColor(i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1425u0 = defaultColor;
        this.f1395d0 = defaultColor;
        this.f1427v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1429w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1431x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 == this.U) {
            return;
        }
        this.U = i4;
        if (this.f1402j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.V = i4;
    }

    public void setBoxCornerFamily(int i4) {
        n j4 = this.R.j();
        g2.d dVar = this.R.f1889e;
        j4.f1877a = m.o(i4);
        j4.f1880e = dVar;
        g2.d dVar2 = this.R.f1890f;
        j4.f1878b = m.o(i4);
        j4.f1881f = dVar2;
        g2.d dVar3 = this.R.h;
        j4.f1879d = m.o(i4);
        j4.h = dVar3;
        g2.d dVar4 = this.R.g;
        j4.c = m.o(i4);
        j4.g = dVar4;
        this.R = j4.a();
        c();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f1421s0 != i4) {
            this.f1421s0 = i4;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1417q0 = colorStateList.getDefaultColor();
            this.f1433y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1419r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1421s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1421s0 != colorStateList.getDefaultColor()) {
            this.f1421s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1423t0 != colorStateList) {
            this.f1423t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.a0 = i4;
        z();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f1393b0 = i4;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f1416q != z3) {
            u uVar = this.f1414p;
            if (z3) {
                z0 z0Var = new z0(getContext(), null);
                this.f1424u = z0Var;
                z0Var.setId(com.gglhk.bofio.fortunetiger.R.id.textinput_counter);
                Typeface typeface = this.f1399h0;
                if (typeface != null) {
                    this.f1424u.setTypeface(typeface);
                }
                this.f1424u.setMaxLines(1);
                uVar.a(this.f1424u, 2);
                ((ViewGroup.MarginLayoutParams) this.f1424u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.gglhk.bofio.fortunetiger.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1424u != null) {
                    EditText editText = this.f1402j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f1424u, 2);
                this.f1424u = null;
            }
            this.f1416q = z3;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f1418r != i4) {
            if (i4 > 0) {
                this.f1418r = i4;
            } else {
                this.f1418r = -1;
            }
            if (!this.f1416q || this.f1424u == null) {
                return;
            }
            EditText editText = this.f1402j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f1426v != i4) {
            this.f1426v = i4;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f1428w != i4) {
            this.f1428w = i4;
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
            if (o() || (this.f1424u != null && this.f1420s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1413o0 = colorStateList;
        this.f1415p0 = colorStateList;
        if (this.f1402j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        m(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.h.f2340l.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.h.f2340l.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i4) {
        r rVar = this.h;
        rVar.g(i4 != 0 ? rVar.getResources().getText(i4) : null);
    }

    public void setEndIconDrawable(int i4) {
        r rVar = this.h;
        Drawable w3 = i4 != 0 ? m.w(rVar.getContext(), i4) : null;
        TextInputLayout textInputLayout = rVar.f2336f;
        CheckableImageButton checkableImageButton = rVar.f2340l;
        checkableImageButton.setImageDrawable(w3);
        if (w3 != null) {
            d.b(textInputLayout, checkableImageButton, rVar.f2344p, rVar.f2345q);
            d.W(textInputLayout, checkableImageButton, rVar.f2344p);
        }
    }

    public void setEndIconMinSize(int i4) {
        r rVar = this.h;
        if (i4 < 0) {
            rVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i4 != rVar.f2346r) {
            rVar.f2346r = i4;
            CheckableImageButton checkableImageButton = rVar.f2340l;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
            CheckableImageButton checkableImageButton2 = rVar.h;
            checkableImageButton2.setMinimumWidth(i4);
            checkableImageButton2.setMinimumHeight(i4);
        }
    }

    public void setEndIconMode(int i4) {
        this.h.h(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.h;
        CheckableImageButton checkableImageButton = rVar.f2340l;
        View.OnLongClickListener onLongClickListener = rVar.f2348t;
        checkableImageButton.setOnClickListener(onClickListener);
        d.e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.h;
        rVar.f2348t = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f2340l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        r rVar = this.h;
        rVar.f2347s = scaleType;
        rVar.f2340l.setScaleType(scaleType);
        rVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        r rVar = this.h;
        if (rVar.f2344p != colorStateList) {
            rVar.f2344p = colorStateList;
            d.b(rVar.f2336f, rVar.f2340l, colorStateList, rVar.f2345q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.h;
        if (rVar.f2345q != mode) {
            rVar.f2345q = mode;
            d.b(rVar.f2336f, rVar.f2340l, rVar.f2344p, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.h.i(z3);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1414p;
        if (!uVar.f2375q) {
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
        uVar.f2374p = charSequence;
        uVar.f2376r.setText(charSequence);
        int i4 = uVar.f2372n;
        if (i4 != 1) {
            uVar.f2373o = 1;
        }
        uVar.i(i4, uVar.f2373o, uVar.h(uVar.f2376r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        u uVar = this.f1414p;
        uVar.f2378t = i4;
        z0 z0Var = uVar.f2376r;
        if (z0Var != null) {
            z0Var.setAccessibilityLiveRegion(i4);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1414p;
        uVar.f2377s = charSequence;
        z0 z0Var = uVar.f2376r;
        if (z0Var != null) {
            z0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        u uVar = this.f1414p;
        TextInputLayout textInputLayout = uVar.h;
        if (uVar.f2375q == z3) {
            return;
        }
        uVar.c();
        if (z3) {
            z0 z0Var = new z0(uVar.g, null);
            uVar.f2376r = z0Var;
            z0Var.setId(com.gglhk.bofio.fortunetiger.R.id.textinput_error);
            uVar.f2376r.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f2376r.setTypeface(typeface);
            }
            int i4 = uVar.f2379u;
            uVar.f2379u = i4;
            z0 z0Var2 = uVar.f2376r;
            if (z0Var2 != null) {
                uVar.h.n(z0Var2, i4);
            }
            ColorStateList colorStateList = uVar.f2380v;
            uVar.f2380v = colorStateList;
            z0 z0Var3 = uVar.f2376r;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f2377s;
            uVar.f2377s = charSequence;
            z0 z0Var4 = uVar.f2376r;
            if (z0Var4 != null) {
                z0Var4.setContentDescription(charSequence);
            }
            int i5 = uVar.f2378t;
            uVar.f2378t = i5;
            z0 z0Var5 = uVar.f2376r;
            if (z0Var5 != null) {
                z0Var5.setAccessibilityLiveRegion(i5);
            }
            uVar.f2376r.setVisibility(4);
            uVar.a(uVar.f2376r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f2376r, 0);
            uVar.f2376r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f2375q = z3;
    }

    public void setErrorIconDrawable(int i4) {
        r rVar = this.h;
        rVar.j(i4 != 0 ? m.w(rVar.getContext(), i4) : null);
        d.W(rVar.f2336f, rVar.h, rVar.f2337i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.h;
        CheckableImageButton checkableImageButton = rVar.h;
        View.OnLongClickListener onLongClickListener = rVar.f2339k;
        checkableImageButton.setOnClickListener(onClickListener);
        d.e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.h;
        rVar.f2339k = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        r rVar = this.h;
        if (rVar.f2337i != colorStateList) {
            rVar.f2337i = colorStateList;
            d.b(rVar.f2336f, rVar.h, colorStateList, rVar.f2338j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.h;
        if (rVar.f2338j != mode) {
            rVar.f2338j = mode;
            d.b(rVar.f2336f, rVar.h, rVar.f2337i, mode);
        }
    }

    public void setErrorTextAppearance(int i4) {
        u uVar = this.f1414p;
        uVar.f2379u = i4;
        z0 z0Var = uVar.f2376r;
        if (z0Var != null) {
            uVar.h.n(z0Var, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1414p;
        uVar.f2380v = colorStateList;
        z0 z0Var = uVar.f2376r;
        if (z0Var == null || colorStateList == null) {
            return;
        }
        z0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.C0 != z3) {
            this.C0 = z3;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1414p;
        if (isEmpty) {
            if (uVar.f2382x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f2382x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f2381w = charSequence;
        uVar.f2383y.setText(charSequence);
        int i4 = uVar.f2372n;
        if (i4 != 2) {
            uVar.f2373o = 2;
        }
        uVar.i(i4, uVar.f2373o, uVar.h(uVar.f2383y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1414p;
        uVar.A = colorStateList;
        z0 z0Var = uVar.f2383y;
        if (z0Var == null || colorStateList == null) {
            return;
        }
        z0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        u uVar = this.f1414p;
        TextInputLayout textInputLayout = uVar.h;
        if (uVar.f2382x == z3) {
            return;
        }
        uVar.c();
        if (z3) {
            z0 z0Var = new z0(uVar.g, null);
            uVar.f2383y = z0Var;
            z0Var.setId(com.gglhk.bofio.fortunetiger.R.id.textinput_helper_text);
            uVar.f2383y.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f2383y.setTypeface(typeface);
            }
            uVar.f2383y.setVisibility(4);
            uVar.f2383y.setImportantForAccessibility(2);
            int i4 = uVar.f2384z;
            uVar.f2384z = i4;
            z0 z0Var2 = uVar.f2383y;
            if (z0Var2 != null) {
                z0Var2.setTextAppearance(i4);
            }
            ColorStateList colorStateList = uVar.A;
            uVar.A = colorStateList;
            z0 z0Var3 = uVar.f2383y;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            uVar.a(uVar.f2383y, 1);
        } else {
            uVar.c();
            int i5 = uVar.f2372n;
            if (i5 == 2) {
                uVar.f2373o = 0;
            }
            uVar.i(i5, uVar.f2373o, uVar.h(uVar.f2383y, ""));
            uVar.g(uVar.f2383y, 1);
            uVar.f2383y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f2382x = z3;
    }

    public void setHelperTextTextAppearance(int i4) {
        u uVar = this.f1414p;
        uVar.f2384z = i4;
        z0 z0Var = uVar.f2383y;
        if (z0Var != null) {
            z0Var.setTextAppearance(i4);
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
                CharSequence hint = this.f1402j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.f1402j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.f1402j.getHint())) {
                    this.f1402j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.f1402j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i4) {
        f fVar = this.B0;
        if (i4 != fVar.f0) {
            fVar.f0 = i4;
            fVar.j(false);
        }
        if (i4 != fVar.f14e0) {
            fVar.f14e0 = i4;
            fVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i4) {
        f fVar = this.B0;
        TextInputLayout textInputLayout = fVar.f7a;
        d2.d dVar = new d2.d(textInputLayout.getContext(), i4);
        ColorStateList colorStateList = dVar.f1481k;
        if (colorStateList != null) {
            fVar.f22k = colorStateList;
        }
        float f4 = dVar.f1482l;
        if (f4 != 0.0f) {
            fVar.f18i = f4;
        }
        ColorStateList colorStateList2 = dVar.f1474a;
        if (colorStateList2 != null) {
            fVar.V = colorStateList2;
        }
        fVar.T = dVar.f1478f;
        fVar.U = dVar.g;
        fVar.S = dVar.h;
        fVar.W = dVar.f1480j;
        d2.a aVar = fVar.f38z;
        if (aVar != null) {
            aVar.h = true;
        }
        e eVar = new e(0, fVar);
        dVar.a();
        fVar.f38z = new d2.a(eVar, dVar.f1486p);
        dVar.b(textInputLayout.getContext(), fVar.f38z);
        fVar.j(false);
        this.f1415p0 = fVar.f22k;
        if (this.f1402j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1415p0 != colorStateList) {
            if (this.f1413o0 == null) {
                f fVar = this.B0;
                if (fVar.f22k != colorStateList) {
                    fVar.f22k = colorStateList;
                    fVar.j(false);
                }
            }
            this.f1415p0 = colorStateList;
            if (this.f1402j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(d0 d0Var) {
        this.f1422t = d0Var;
    }

    public void setMaxEms(int i4) {
        this.f1408m = i4;
        EditText editText = this.f1402j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxEms(i4);
    }

    public void setMaxWidth(int i4) {
        this.f1412o = i4;
        EditText editText = this.f1402j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxWidth(i4);
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.f1406l = i4;
        EditText editText = this.f1402j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinEms(i4);
    }

    public void setMinWidth(int i4) {
        this.f1410n = i4;
        EditText editText = this.f1402j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinWidth(i4);
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        r rVar = this.h;
        rVar.f2340l.setContentDescription(i4 != 0 ? rVar.getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        r rVar = this.h;
        rVar.f2340l.setImageDrawable(i4 != 0 ? m.w(rVar.getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        r rVar = this.h;
        if (z3 && rVar.f2342n != 1) {
            rVar.h(1);
        } else if (z3) {
            rVar.getClass();
        } else {
            rVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        r rVar = this.h;
        rVar.f2344p = colorStateList;
        d.b(rVar.f2336f, rVar.f2340l, colorStateList, rVar.f2345q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        r rVar = this.h;
        rVar.f2345q = mode;
        d.b(rVar.f2336f, rVar.f2340l, rVar.f2344p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1434z == null) {
            z0 z0Var = new z0(getContext(), null);
            this.f1434z = z0Var;
            z0Var.setId(com.gglhk.bofio.fortunetiger.R.id.textinput_placeholder);
            this.f1434z.setImportantForAccessibility(1);
            this.f1434z.setAccessibilityLiveRegion(1);
            h f4 = f();
            this.C = f4;
            f4.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            j0.m(this.f1434z, new com.google.android.material.datepicker.f(3));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1432y) {
                setPlaceholderTextEnabled(true);
            }
            this.f1430x = charSequence;
        }
        EditText editText = this.f1402j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.B = i4;
        z0 z0Var = this.f1434z;
        if (z0Var != null) {
            z0Var.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            z0 z0Var = this.f1434z;
            if (z0Var == null || colorStateList == null) {
                return;
            }
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        a0 a0Var = this.g;
        a0Var.getClass();
        a0Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        a0Var.g.setText(charSequence);
        a0Var.f();
    }

    public void setPrefixTextAppearance(int i4) {
        this.g.g.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        j jVar = this.L;
        if (jVar == null || jVar.i() == oVar) {
            return;
        }
        this.R = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z3) {
        this.g.f2288i.setCheckable(z3);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? m.w(getContext(), i4) : null);
    }

    public void setStartIconMinSize(int i4) {
        a0 a0Var = this.g;
        if (i4 < 0) {
            a0Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i4 != a0Var.f2291l) {
            a0Var.f2291l = i4;
            CheckableImageButton checkableImageButton = a0Var.f2288i;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        a0 a0Var = this.g;
        CheckableImageButton checkableImageButton = a0Var.f2288i;
        View.OnLongClickListener onLongClickListener = a0Var.f2293n;
        checkableImageButton.setOnClickListener(onClickListener);
        d.e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a0 a0Var = this.g;
        a0Var.f2293n = onLongClickListener;
        CheckableImageButton checkableImageButton = a0Var.f2288i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        a0 a0Var = this.g;
        a0Var.f2292m = scaleType;
        a0Var.f2288i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        a0 a0Var = this.g;
        if (a0Var.f2289j != colorStateList) {
            a0Var.f2289j = colorStateList;
            d.b(a0Var.f2287f, a0Var.f2288i, colorStateList, a0Var.f2290k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.g;
        if (a0Var.f2290k != mode) {
            a0Var.f2290k = mode;
            d.b(a0Var.f2287f, a0Var.f2288i, a0Var.f2289j, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.g.d(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        r rVar = this.h;
        rVar.getClass();
        rVar.f2349u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        rVar.f2350v.setText(charSequence);
        rVar.o();
    }

    public void setSuffixTextAppearance(int i4) {
        this.h.f2350v.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.f2350v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(c0 c0Var) {
        EditText editText = this.f1402j;
        if (editText != null) {
            j0.m(editText, c0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1399h0) {
            this.f1399h0 = typeface;
            this.B0.n(typeface);
            u uVar = this.f1414p;
            if (typeface != uVar.B) {
                uVar.B = typeface;
                z0 z0Var = uVar.f2376r;
                if (z0Var != null) {
                    z0Var.setTypeface(typeface);
                }
                z0 z0Var2 = uVar.f2383y;
                if (z0Var2 != null) {
                    z0Var2.setTypeface(typeface);
                }
            }
            z0 z0Var3 = this.f1424u;
            if (z0Var3 != null) {
                z0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        z0 z0Var;
        EditText editText = this.f1402j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = j1.f2560a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(k.s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1420s && (z0Var = this.f1424u) != null) {
            mutate.setColorFilter(k.s.c(z0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f1402j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f1402j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.f1402j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f1397f;
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
        z0 z0Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1402j;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1402j;
        boolean z6 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1413o0;
        f fVar = this.B0;
        if (colorStateList2 != null) {
            fVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1413o0;
            fVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1433y0) : this.f1433y0));
        } else if (o()) {
            z0 z0Var2 = this.f1414p.f2376r;
            fVar.k(z0Var2 != null ? z0Var2.getTextColors() : null);
        } else if (this.f1420s && (z0Var = this.f1424u) != null) {
            fVar.k(z0Var.getTextColors());
        } else if (z6 && (colorStateList = this.f1415p0) != null && fVar.f22k != colorStateList) {
            fVar.f22k = colorStateList;
            fVar.j(false);
        }
        r rVar = this.h;
        a0 a0Var = this.g;
        if (z5 || !this.C0 || (isEnabled() && z6)) {
            if (z4 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z3 && this.D0) {
                    b(1.0f);
                } else {
                    fVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f1402j;
                x(editText3 != null ? editText3.getText() : null);
                a0Var.f2294o = false;
                a0Var.f();
                rVar.f2351w = false;
                rVar.o();
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
                fVar.m(0.0f);
            }
            if (g() && !((j2.h) this.L).L.f2312q.isEmpty() && g()) {
                ((j2.h) this.L).w(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            z0 z0Var3 = this.f1434z;
            if (z0Var3 != null && this.f1432y) {
                z0Var3.setText((CharSequence) null);
                f1.s.a(this.f1397f, this.D);
                this.f1434z.setVisibility(4);
            }
            a0Var.f2294o = true;
            a0Var.f();
            rVar.f2351w = true;
            rVar.o();
        }
    }

    public final void x(Editable editable) {
        ((d3.a) this.f1422t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1397f;
        if (length != 0 || this.A0) {
            z0 z0Var = this.f1434z;
            if (z0Var == null || !this.f1432y) {
                return;
            }
            z0Var.setText((CharSequence) null);
            f1.s.a(frameLayout, this.D);
            this.f1434z.setVisibility(4);
            return;
        }
        if (this.f1434z == null || !this.f1432y || TextUtils.isEmpty(this.f1430x)) {
            return;
        }
        this.f1434z.setText(this.f1430x);
        f1.s.a(frameLayout, this.C);
        this.f1434z.setVisibility(0);
        this.f1434z.bringToFront();
    }

    public final void y(boolean z3, boolean z4) {
        int defaultColor = this.f1423t0.getDefaultColor();
        int colorForState = this.f1423t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1423t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f1394c0 = colorForState2;
        } else if (z4) {
            this.f1394c0 = colorForState;
        } else {
            this.f1394c0 = defaultColor;
        }
    }

    public final void z() {
        z0 z0Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z3 = isFocused() || ((editText2 = this.f1402j) != null && editText2.hasFocus());
        boolean z4 = isHovered() || ((editText = this.f1402j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f1394c0 = this.f1433y0;
        } else if (o()) {
            if (this.f1423t0 != null) {
                y(z3, z4);
            } else {
                this.f1394c0 = getErrorCurrentTextColors();
            }
        } else if (!this.f1420s || (z0Var = this.f1424u) == null) {
            if (z3) {
                this.f1394c0 = this.f1421s0;
            } else if (z4) {
                this.f1394c0 = this.f1419r0;
            } else {
                this.f1394c0 = this.f1417q0;
            }
        } else if (this.f1423t0 != null) {
            y(z3, z4);
        } else {
            this.f1394c0 = z0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        r rVar = this.h;
        TextInputLayout textInputLayout = rVar.f2336f;
        CheckableImageButton checkableImageButton = rVar.f2340l;
        TextInputLayout textInputLayout2 = rVar.f2336f;
        rVar.m();
        d.W(textInputLayout2, rVar.h, rVar.f2337i);
        d.W(textInputLayout2, checkableImageButton, rVar.f2344p);
        if (rVar.b() instanceof j2.m) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                d.b(textInputLayout, checkableImageButton, rVar.f2344p, rVar.f2345q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        a0 a0Var = this.g;
        d.W(a0Var.f2287f, a0Var.f2288i, a0Var.f2289j);
        if (this.U == 2) {
            int i4 = this.W;
            if (z3 && isEnabled()) {
                this.W = this.f1393b0;
            } else {
                this.W = this.a0;
            }
            if (this.W != i4 && g() && !this.A0) {
                if (g()) {
                    ((j2.h) this.L).w(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.f1395d0 = this.f1427v0;
            } else if (z4 && !z3) {
                this.f1395d0 = this.f1431x0;
            } else if (z3) {
                this.f1395d0 = this.f1429w0;
            } else {
                this.f1395d0 = this.f1425u0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f1402j;
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
        this.g.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.g.c(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.h.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h.f2340l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h.f2340l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        r rVar = this.h;
        TextInputLayout textInputLayout = rVar.f2336f;
        CheckableImageButton checkableImageButton = rVar.f2340l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d.b(textInputLayout, checkableImageButton, rVar.f2344p, rVar.f2345q);
            d.W(textInputLayout, checkableImageButton, rVar.f2344p);
        }
    }
}
