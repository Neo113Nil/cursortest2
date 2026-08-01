package com.google.android.material.textfield;

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
import com.google.android.material.internal.CheckableImageButton;
import defpackage.b6;
import defpackage.b9;
import defpackage.bw;
import defpackage.c2;
import defpackage.d70;
import defpackage.da0;
import defpackage.dw;
import defpackage.e50;
import defpackage.ej;
import defpackage.f50;
import defpackage.fl;
import defpackage.g;
import defpackage.g3;
import defpackage.g9;
import defpackage.gc;
import defpackage.gh;
import defpackage.gi;
import defpackage.ic0;
import defpackage.j7;
import defpackage.k6;
import defpackage.kr;
import defpackage.kv;
import defpackage.la0;
import defpackage.m8;
import defpackage.mz;
import defpackage.n1;
import defpackage.nk;
import defpackage.p80;
import defpackage.pk;
import defpackage.q80;
import defpackage.qf;
import defpackage.r4;
import defpackage.r8;
import defpackage.rc0;
import defpackage.rf;
import defpackage.s8;
import defpackage.s80;
import defpackage.s9;
import defpackage.si;
import defpackage.su;
import defpackage.t80;
import defpackage.u80;
import defpackage.v30;
import defpackage.v80;
import defpackage.vb;
import defpackage.ve;
import defpackage.x60;
import defpackage.xf;
import defpackage.y00;
import defpackage.zq;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final vb B0;
    public fl C;
    public boolean C0;
    public fl D;
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
    public dw L;
    public dw M;
    public StateListDrawable N;
    public boolean O;
    public dw P;
    public dw Q;
    public f50 R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public final Rect e0;
    public final FrameLayout f;
    public final Rect f0;
    public final x60 g;
    public final RectF g0;
    public final pk h;
    public Typeface h0;
    public final int i;
    public ColorDrawable i0;
    public EditText j;
    public int j0;
    public CharSequence k;
    public final LinkedHashSet k0;
    public int l;
    public ColorDrawable l0;
    public int m;
    public int m0;
    public int n;
    public Drawable n0;
    public int o;
    public ColorStateList o0;
    public final zq p;
    public ColorStateList p0;
    public boolean q;
    public int q0;
    public int r;
    public int r0;
    public boolean s;
    public int s0;
    public u80 t;
    public ColorStateList t0;
    public b6 u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public CharSequence x;
    public int x0;
    public boolean y;
    public int y0;
    public b6 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.textInputStyle, com.moontiko.really.admiralcasino.R.style.Widget_Design_TextInputLayout), attributeSet, com.moontiko.really.admiralcasino.R.attr.textInputStyle);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new zq(this);
        this.t = new g9(24);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.k0 = new LinkedHashSet();
        vb vbVar = new vb(this);
        this.B0 = vbVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = g3.a;
        vbVar.R = linearInterpolator;
        vbVar.j(false);
        vbVar.Q = linearInterpolator;
        vbVar.j(false);
        if (vbVar.g != 8388659) {
            vbVar.g = 8388659;
            vbVar.j(false);
        }
        la0.j(context2, attributeSet, com.moontiko.really.admiralcasino.R.attr.textInputStyle, com.moontiko.really.admiralcasino.R.style.Widget_Design_TextInputLayout);
        int[] iArr = y00.M;
        la0.m(context2, attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.textInputStyle, com.moontiko.really.admiralcasino.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.moontiko.really.admiralcasino.R.attr.textInputStyle, com.moontiko.really.admiralcasino.R.style.Widget_Design_TextInputLayout);
        k6 k6Var = new k6(context2, obtainStyledAttributes);
        x60 x60Var = new x60(this, k6Var);
        this.g = x60Var;
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
        this.R = f50.g(context2, attributeSet, com.moontiko.really.admiralcasino.R.attr.textInputStyle, com.moontiko.really.admiralcasino.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.moontiko.really.admiralcasino.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        e50 k = this.R.k();
        if (dimension >= 0.0f) {
            k.e = new g(dimension);
        }
        if (dimension2 >= 0.0f) {
            k.f = new g(dimension2);
        }
        if (dimension3 >= 0.0f) {
            k.g = new g(dimension3);
        }
        if (dimension4 >= 0.0f) {
            k.h = new g(dimension4);
        }
        this.R = k.a();
        ColorStateList v = kr.v(context2, k6Var, 7);
        if (v != null) {
            int defaultColor = v.getDefaultColor();
            this.u0 = defaultColor;
            this.d0 = defaultColor;
            if (v.isStateful()) {
                this.v0 = v.getColorForState(new int[]{-16842910}, -1);
                this.w0 = v.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.x0 = v.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.w0 = this.u0;
                ColorStateList w = la0.w(context2, com.moontiko.really.admiralcasino.R.color.mtrl_filled_background_color);
                this.v0 = w.getColorForState(new int[]{-16842910}, -1);
                this.x0 = w.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.u0 = 0;
            this.v0 = 0;
            this.w0 = 0;
            this.x0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList n = k6Var.n(1);
            this.p0 = n;
            this.o0 = n;
        }
        ColorStateList v2 = kr.v(context2, k6Var, 14);
        this.s0 = obtainStyledAttributes.getColor(14, 0);
        this.q0 = context2.getColor(com.moontiko.really.admiralcasino.R.color.mtrl_textinput_default_box_stroke_color);
        this.y0 = context2.getColor(com.moontiko.really.admiralcasino.R.color.mtrl_textinput_disabled_color);
        this.r0 = context2.getColor(com.moontiko.really.admiralcasino.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (v2 != null) {
            setBoxStrokeColorStateList(v2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(kr.v(context2, k6Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = k6Var.n(24);
        this.H = k6Var.n(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.w = obtainStyledAttributes.getResourceId(22, 0);
        this.v = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(k6Var.n(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(k6Var.n(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(k6Var.n(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(k6Var.n(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(k6Var.n(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(k6Var.n(59));
        }
        pk pkVar = new pk(this, k6Var);
        this.h = pkVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        k6Var.B();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(x60Var);
        frameLayout.addView(pkVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        EditText editText2 = this.j;
        int G = xf.G(editText2.getContext(), b9.N(editText2, com.moontiko.really.admiralcasino.R.attr.colorControlHighlight));
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            dw dwVar = this.L;
            int i2 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{xf.z(G, i2, 0.1f), i2}), dwVar, dwVar);
        }
        Context context = getContext();
        dw dwVar2 = this.L;
        int G2 = xf.G(context, b9.M(context, com.moontiko.really.admiralcasino.R.attr.colorSurface, "TextInputLayout"));
        dw dwVar3 = new dw(dwVar2.i());
        int z = xf.z(G, G2, 0.1f);
        dwVar3.r(new ColorStateList(iArr, new int[]{z, 0}));
        dwVar3.setTint(G2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{z, G2});
        dw dwVar4 = new dw(dwVar2.i());
        dwVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, dwVar3, dwVar4), dwVar2});
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

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.j != null) {
            g9.i("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.j = editText;
        int i = this.l;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.n);
        }
        int i2 = this.m;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new t80(this));
        Typeface typeface = this.j.getTypeface();
        vb vbVar = this.B0;
        vbVar.n(typeface);
        float textSize = this.j.getTextSize();
        if (vbVar.h != textSize) {
            vbVar.h = textSize;
            vbVar.j(false);
        }
        float letterSpacing = this.j.getLetterSpacing();
        if (vbVar.X != letterSpacing) {
            vbVar.X = letterSpacing;
            vbVar.j(false);
        }
        int gravity = this.j.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (vbVar.g != i3) {
            vbVar.g = i3;
            vbVar.j(false);
        }
        if (vbVar.f != gravity) {
            vbVar.f = gravity;
            vbVar.j(false);
        }
        this.z0 = editText.getMinimumHeight();
        this.j.addTextChangedListener(new s80(this, editText));
        if (this.o0 == null) {
            this.o0 = this.j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.j.getHint();
                this.k = hint;
                setHint(hint);
                this.j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.u != null) {
            p(this.j.getText());
        }
        t();
        this.p.b();
        this.g.bringToFront();
        pk pkVar = this.h;
        pkVar.bringToFront();
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((nk) it.next()).a(this);
        }
        pkVar.n();
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
        vb vbVar = this.B0;
        if (charSequence == null || !TextUtils.equals(vbVar.B, charSequence)) {
            vbVar.B = charSequence;
            vbVar.C = null;
            vbVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.y == z) {
            return;
        }
        b6 b6Var = this.z;
        if (!z) {
            if (b6Var != null) {
                b6Var.setVisibility(8);
            }
            this.z = null;
        } else if (b6Var != null) {
            this.f.addView(b6Var);
            this.z.setVisibility(0);
        }
        this.y = z;
    }

    public final void a() {
        if (this.j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_filled_edittext_font_2_0_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (kr.H(getContext())) {
            EditText editText3 = this.j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_filled_edittext_font_1_3_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        FrameLayout frameLayout = this.f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        vb vbVar = this.B0;
        if (vbVar.b == f) {
            return;
        }
        int i = 2;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(kr.X(getContext(), com.moontiko.really.admiralcasino.R.attr.motionEasingEmphasizedInterpolator, g3.b));
            this.E0.setDuration(kr.W(getContext(), com.moontiko.really.admiralcasino.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new r8(i, this));
        }
        this.E0.setFloatValues(vbVar.b, f);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i2;
        dw dwVar = this.L;
        if (dwVar == null) {
            return;
        }
        f50 i3 = dwVar.i();
        f50 f50Var = this.R;
        if (i3 != f50Var) {
            this.L.setShapeAppearanceModel(f50Var);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i2 = this.c0) != 0) {
            dw dwVar2 = this.L;
            dwVar2.g.j = i;
            dwVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            bw bwVar = dwVar2.g;
            if (bwVar.d != valueOf) {
                bwVar.d = valueOf;
                dwVar2.onStateChange(dwVar2.getState());
            }
        }
        int i4 = this.d0;
        if (this.U == 1) {
            Integer p = xf.p(getContext(), com.moontiko.really.admiralcasino.R.attr.colorSurface);
            i4 = gc.b(this.d0, p != null ? p.intValue() : 0);
        }
        this.d0 = i4;
        this.L.r(ColorStateList.valueOf(i4));
        dw dwVar3 = this.P;
        if (dwVar3 != null && this.Q != null) {
            if (this.W > -1 && this.c0 != 0) {
                dwVar3.r(this.j.isFocused() ? ColorStateList.valueOf(this.q0) : ColorStateList.valueOf(this.c0));
                this.Q.r(ColorStateList.valueOf(this.c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.j == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f0;
        rect2.bottom = i;
        int i2 = this.U;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.j.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.k != null) {
            boolean z = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.j.setHint(this.k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.j.setHint(hint);
                this.K = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.j) {
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
        dw dwVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.I;
        vb vbVar = this.B0;
        if (z) {
            TextPaint textPaint = vbVar.O;
            RectF rectF = vbVar.e;
            int save = canvas2.save();
            if (vbVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(vbVar.G);
                float f = vbVar.q;
                float f2 = vbVar.r;
                float f3 = vbVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((vbVar.e0 > 1 || vbVar.f0 > 1) && !vbVar.D && vbVar.o()) {
                    float lineStart = vbVar.q - vbVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (vbVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = vbVar.H;
                        float f6 = vbVar.I;
                        float f7 = vbVar.J;
                        int i2 = vbVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, gc.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    vbVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (vbVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = vbVar.H;
                        float f9 = vbVar.I;
                        float f10 = vbVar.J;
                        int i3 = vbVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, gc.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = vbVar.Z.getLineBaseline(0);
                    CharSequence charSequence = vbVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(vbVar.H, vbVar.I, vbVar.J, vbVar.K);
                    }
                    String trim = vbVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(vbVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    vbVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (dwVar = this.P) == null) {
            return;
        }
        dwVar.draw(canvas2);
        if (this.j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f12 = vbVar.b;
            int centerX = bounds2.centerX();
            bounds.left = g3.c(centerX, bounds2.left, f12);
            bounds.right = g3.c(centerX, bounds2.right, f12);
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
        boolean z;
        ColorStateList colorStateList;
        if (this.F0) {
            return;
        }
        this.F0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        vb vbVar = this.B0;
        if (vbVar != null) {
            vbVar.M = drawableState;
            ColorStateList colorStateList2 = vbVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = vbVar.j) != null && colorStateList.isStateful())) {
                vbVar.j(false);
                z = true;
                if (this.j != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z) {
                    invalidate();
                }
                this.F0 = false;
            }
        }
        z = false;
        if (this.j != null) {
        }
        t();
        z();
        if (z) {
        }
        this.F0 = false;
    }

    public final int e() {
        if (this.I) {
            int i = this.U;
            vb vbVar = this.B0;
            if (i == 0) {
                return (int) vbVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (vbVar.f() / 2.0f);
                }
                float f = vbVar.f();
                TextPaint textPaint = vbVar.P;
                textPaint.setTextSize(vbVar.i);
                textPaint.setTypeface(vbVar.s);
                textPaint.setLetterSpacing(vbVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final fl f() {
        fl flVar = new fl();
        flVar.h = kr.W(getContext(), com.moontiko.really.admiralcasino.R.attr.motionDurationShort2, 87);
        flVar.i = kr.X(getContext(), com.moontiko.really.admiralcasino.R.attr.motionEasingLinearInterpolator, g3.a);
        return flVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof rf);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public dw getBoxBackground() {
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
        f50 f50Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? f50Var.h.a(rectF) : f50Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        f50 f50Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? f50Var.g.a(rectF) : f50Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        f50 f50Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? f50Var.e.a(rectF) : f50Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        f50 f50Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? f50Var.f.a(rectF) : f50Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.t0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.b0;
    }

    public int getCounterMaxLength() {
        return this.r;
    }

    public CharSequence getCounterOverflowDescription() {
        b6 b6Var;
        if (this.q && this.s && (b6Var = this.u) != null) {
            return b6Var.getContentDescription();
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
        return this.o0;
    }

    public EditText getEditText() {
        return this.j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h.l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h.r;
    }

    public int getEndIconMode() {
        return this.h.n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.s;
    }

    public CheckableImageButton getEndIconView() {
        return this.h.l;
    }

    public CharSequence getError() {
        zq zqVar = this.p;
        if (zqVar.q) {
            return zqVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.p.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.p.s;
    }

    public int getErrorCurrentTextColors() {
        b6 b6Var = this.p.r;
        if (b6Var != null) {
            return b6Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        zq zqVar = this.p;
        if (zqVar.x) {
            return zqVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        b6 b6Var = this.p.y;
        if (b6Var != null) {
            return b6Var.getCurrentTextColor();
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
        vb vbVar = this.B0;
        return vbVar.g(vbVar.k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.p0;
    }

    public u80 getLengthCounter() {
        return this.t;
    }

    public int getMaxEms() {
        return this.m;
    }

    public int getMaxWidth() {
        return this.o;
    }

    public int getMinEms() {
        return this.l;
    }

    public int getMinWidth() {
        return this.n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.y) {
            return this.x;
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

    public f50 getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.g.i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.g.i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.g.l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.g.m;
    }

    public CharSequence getSuffixText() {
        return this.h.u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h.v;
    }

    public Typeface getTypeface() {
        return this.h0;
    }

    public final dw h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.moontiko.really.admiralcasino.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j;
        float popupElevation = editText instanceof su ? ((su) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.moontiko.really.admiralcasino.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.moontiko.really.admiralcasino.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        v30 v30Var = new v30();
        v30 v30Var2 = new v30();
        v30 v30Var3 = new v30();
        v30 v30Var4 = new v30();
        int i = 0;
        ej ejVar = new ej(i);
        ej ejVar2 = new ej(i);
        ej ejVar3 = new ej(i);
        ej ejVar4 = new ej(i);
        g gVar = new g(f);
        g gVar2 = new g(f);
        g gVar3 = new g(dimensionPixelOffset);
        g gVar4 = new g(dimensionPixelOffset);
        f50 f50Var = new f50();
        f50Var.a = v30Var;
        f50Var.b = v30Var2;
        f50Var.c = v30Var3;
        f50Var.d = v30Var4;
        f50Var.e = gVar;
        f50Var.f = gVar2;
        f50Var.g = gVar4;
        f50Var.h = gVar3;
        f50Var.i = ejVar;
        f50Var.j = ejVar2;
        f50Var.k = ejVar3;
        f50Var.l = ejVar4;
        EditText editText2 = this.j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof su ? ((su) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = dw.K;
            dropDownBackgroundTintList = ColorStateList.valueOf(xf.G(context, b9.M(context, com.moontiko.really.admiralcasino.R.attr.colorSurface, dw.class.getSimpleName())));
        }
        dw dwVar = new dw();
        dwVar.n(context);
        dwVar.r(dropDownBackgroundTintList);
        dwVar.q(popupElevation);
        dwVar.setShapeAppearanceModel(f50Var);
        bw bwVar = dwVar.g;
        if (bwVar.g == null) {
            bwVar.g = new Rect();
        }
        dwVar.g.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        dwVar.invalidateSelf();
        return dwVar;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.j.getCompoundPaddingLeft() : this.h.c() : this.g.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.j.getCompoundPaddingRight() : this.g.a() : this.h.c());
    }

    public final void k() {
        int i = this.U;
        if (i == 0) {
            this.L = null;
            this.P = null;
            this.Q = null;
        } else if (i == 1) {
            this.L = new dw(this.R);
            this.P = new dw();
            this.Q = new dw();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof rf)) {
                this.L = new dw(this.R);
            } else {
                f50 f50Var = this.R;
                int i2 = rf.N;
                if (f50Var == null) {
                    f50Var = new f50();
                }
                qf qfVar = new qf(f50Var, new RectF());
                rf rfVar = new rf(qfVar);
                rfVar.M = qfVar;
                this.L = rfVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (kr.H(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.U;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
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
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.j.getWidth();
            int gravity = this.j.getGravity();
            vb vbVar = this.B0;
            boolean c = vbVar.c(vbVar.B);
            vbVar.D = c;
            Rect rect = vbVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = vbVar.a0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = vbVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (vbVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (vbVar.D) {
                        f5 = vbVar.a0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (vbVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = vbVar.a0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = vbVar.f() + rect.top;
                if (vbVar.Z != null && !vbVar.o()) {
                    StaticLayout staticLayout = vbVar.Z;
                    float lineWidth = (vbVar.i / vbVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (vbVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.T;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                rectF.top = 0.0f;
                rf rfVar = (rf) this.L;
                rfVar.getClass();
                rfVar.z(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = vbVar.a0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (vbVar.a0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = vbVar.f() + rect.top;
            if (vbVar.Z != null) {
                StaticLayout staticLayout2 = vbVar.Z;
                float lineWidth2 = (vbVar.i / vbVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (vbVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(b6 b6Var, int i) {
        try {
            b6Var.setTextAppearance(i);
            if (b6Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        b6Var.setTextAppearance(com.moontiko.really.admiralcasino.R.style.TextAppearance_AppCompat_Caption);
        b6Var.setTextColor(getContext().getColor(com.moontiko.really.admiralcasino.R.color.design_error));
    }

    public final boolean o() {
        zq zqVar = this.p;
        return (zqVar.o != 1 || zqVar.r == null || TextUtils.isEmpty(zqVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        pk pkVar = this.h;
        pkVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.H0 = false;
        if (this.j != null && this.j.getMeasuredHeight() < (max = Math.max(pkVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.j.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.j.post(new n1(14, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.j;
        if (editText != null) {
            Rect rect = this.e0;
            gh.a(this, editText, rect);
            dw dwVar = this.P;
            if (dwVar != null) {
                int i6 = rect.bottom;
                dwVar.setBounds(rect.left, i6 - this.a0, rect.right, i6);
            }
            dw dwVar2 = this.Q;
            if (dwVar2 != null) {
                int i7 = rect.bottom;
                dwVar2.setBounds(rect.left, i7 - this.b0, rect.right, i7);
            }
            if (this.I) {
                float textSize = this.j.getTextSize();
                vb vbVar = this.B0;
                float f = vbVar.h;
                TextPaint textPaint = vbVar.P;
                if (f != textSize) {
                    vbVar.h = textSize;
                    vbVar.j(false);
                }
                int gravity = this.j.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (vbVar.g != i8) {
                    vbVar.g = i8;
                    vbVar.j(false);
                }
                if (vbVar.f != gravity) {
                    vbVar.f = gravity;
                    vbVar.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = vbVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    vbVar.N = true;
                }
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(vbVar.h);
                    textPaint.setTypeface(vbVar.v);
                    textPaint.setLetterSpacing(vbVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(vbVar.h);
                    textPaint.setTypeface(vbVar.v);
                    textPaint.setLetterSpacing(vbVar.X);
                    descent = vbVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(vbVar.h);
                        textPaint.setTypeface(vbVar.v);
                        textPaint.setLetterSpacing(vbVar.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.j.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.j.getMinLines() > 1) ? rect.bottom - this.j.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = vbVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != vbVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    vbVar.N = true;
                    vbVar.k0 = true;
                }
                vbVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.H0;
        pk pkVar = this.h;
        if (!z) {
            pkVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.z != null && (editText = this.j) != null) {
            this.z.setGravity(editText.getGravity());
            this.z.setPadding(this.j.getCompoundPaddingLeft(), this.j.getCompoundPaddingTop(), this.j.getCompoundPaddingRight(), this.j.getCompoundPaddingBottom());
        }
        pkVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j.getMeasuredWidth() - this.j.getCompoundPaddingLeft()) - this.j.getCompoundPaddingRight();
        vb vbVar = this.B0;
        TextPaint textPaint = vbVar.P;
        textPaint.setTextSize(vbVar.i);
        textPaint.setTypeface(vbVar.s);
        textPaint.setLetterSpacing(vbVar.W);
        float f2 = measuredWidth;
        vbVar.i0 = vbVar.e(vbVar.f0, textPaint, vbVar.B, (vbVar.i / vbVar.h) * f2, vbVar.D).getHeight();
        textPaint.setTextSize(vbVar.h);
        textPaint.setTypeface(vbVar.v);
        textPaint.setLetterSpacing(vbVar.X);
        vbVar.j0 = vbVar.e(vbVar.e0, textPaint, vbVar.B, f2, vbVar.D).getHeight();
        EditText editText2 = this.j;
        Rect rect = this.e0;
        gh.a(this, editText2, rect);
        Rect d = d(rect);
        int i3 = d.left;
        int i4 = d.top;
        int i5 = d.right;
        int i6 = d.bottom;
        Rect rect2 = vbVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            vbVar.N = true;
        }
        v();
        a();
        if (this.j == null) {
            return;
        }
        int i7 = vbVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = vbVar.P;
            textPaint2.setTextSize(vbVar.h);
            textPaint2.setTypeface(vbVar.v);
            textPaint2.setLetterSpacing(vbVar.X);
            f = -textPaint2.ascent();
        }
        if (this.x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z.getPaint());
            textPaint3.setTextSize(this.z.getTextSize());
            textPaint3.setTypeface(this.z.getTypeface());
            textPaint3.setLetterSpacing(this.z.getLetterSpacing());
            d70 d70Var = new d70(this.x, textPaint3, measuredWidth);
            d70Var.k = getLayoutDirection() == 1;
            d70Var.j = true;
            float lineSpacingExtra = this.z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z.getLineSpacingMultiplier();
            d70Var.g = lineSpacingExtra;
            d70Var.h = lineSpacingMultiplier;
            d70Var.m = new c2(7, this);
            r3 = (this.U == 1 ? vbVar.f() + this.V + this.i : 0.0f) + d70Var.a().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.j.getMeasuredHeight() < max) {
            this.j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v80)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v80 v80Var = (v80) parcelable;
        super.onRestoreInstanceState(v80Var.f);
        setError(v80Var.h);
        if (v80Var.i) {
            post(new j7(11, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S) {
            ve veVar = this.R.e;
            RectF rectF = this.g0;
            float a = veVar.a(rectF);
            float a2 = this.R.f.a(rectF);
            float a3 = this.R.h.a(rectF);
            float a4 = this.R.g.a(rectF);
            f50 f50Var = this.R;
            la0 la0Var = f50Var.a;
            la0 la0Var2 = f50Var.b;
            la0 la0Var3 = f50Var.d;
            la0 la0Var4 = f50Var.c;
            ej ejVar = new ej(0);
            ej ejVar2 = new ej(0);
            ej ejVar3 = new ej(0);
            ej ejVar4 = new ej(0);
            g gVar = new g(a2);
            g gVar2 = new g(a);
            g gVar3 = new g(a4);
            g gVar4 = new g(a3);
            f50 f50Var2 = new f50();
            f50Var2.a = la0Var2;
            f50Var2.b = la0Var;
            f50Var2.c = la0Var3;
            f50Var2.d = la0Var4;
            f50Var2.e = gVar;
            f50Var2.f = gVar2;
            f50Var2.g = gVar4;
            f50Var2.h = gVar3;
            f50Var2.i = ejVar;
            f50Var2.j = ejVar2;
            f50Var2.k = ejVar3;
            f50Var2.l = ejVar4;
            this.S = z;
            setShapeAppearanceModel(f50Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v80 v80Var = new v80(super.onSaveInstanceState());
        if (o()) {
            v80Var.h = getError();
        }
        pk pkVar = this.h;
        v80Var.i = pkVar.n != 0 && pkVar.l.i;
        return v80Var;
    }

    public final void p(Editable editable) {
        ((g9) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.s;
        int i = this.r;
        if (i == -1) {
            this.u.setText(String.valueOf(length));
            this.u.setContentDescription(null);
            this.s = false;
        } else {
            this.s = length > i;
            Context context = getContext();
            this.u.setContentDescription(context.getString(this.s ? com.moontiko.really.admiralcasino.R.string.character_counter_overflowed_content_description : com.moontiko.really.admiralcasino.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r)));
            if (z != this.s) {
                q();
            }
            String str = m8.b;
            m8 m8Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? m8.e : m8.d;
            b6 b6Var = this.u;
            String string = getContext().getString(com.moontiko.really.admiralcasino.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r));
            m8Var.getClass();
            s8 s8Var = q80.a;
            b6Var.setText(string != null ? m8Var.c(string).toString() : null);
        }
        if (this.j == null || z == this.s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        b6 b6Var = this.u;
        if (b6Var != null) {
            n(b6Var, this.s ? this.v : this.w);
            if (!this.s && (colorStateList2 = this.E) != null) {
                this.u.setTextColor(colorStateList2);
            }
            if (!this.s || (colorStateList = this.F) == null) {
                return;
            }
            this.u.setTextColor(colorStateList);
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.G;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue K = b9.K(context.getTheme(), com.moontiko.really.admiralcasino.R.attr.colorControlActivated);
            if (K != null) {
                int i = K.resourceId;
                if (i != 0) {
                    colorStateList2 = la0.w(context, i);
                } else {
                    int i2 = K.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.j;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.j.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((o() || (this.u != null && this.s)) && (colorStateList = this.H) != null) {
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
        boolean z;
        pk pkVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.j == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            x60 x60Var = this.g;
            if (x60Var.getMeasuredWidth() > 0) {
                int max = Math.max(0, x60Var.getMeasuredWidth() - this.j.getPaddingLeft());
                if (this.i0 == null || this.j0 != max) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.i0 = colorDrawable3;
                    this.j0 = max;
                    colorDrawable3.setBounds(0, 0, max, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.j.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.i0;
                if (drawable2 != colorDrawable4) {
                    this.j.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    pkVar = this.h;
                    if ((!pkVar.e() || ((pkVar.n != 0 && pkVar.d()) || pkVar.u != null)) && pkVar.getMeasuredWidth() > 0) {
                        int measuredWidth = pkVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                        if (!pkVar.e()) {
                            checkableImageButton = pkVar.h;
                        } else if (pkVar.n != 0 && pkVar.d()) {
                            checkableImageButton = pkVar.l;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
                        }
                        int max2 = Math.max(0, measuredWidth);
                        compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
                        colorDrawable = this.l0;
                        if (colorDrawable == null && this.m0 != max2) {
                            this.m0 = max2;
                            colorDrawable.setBounds(0, 0, max2, 1);
                            this.j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.l0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.l0 = colorDrawable5;
                            this.m0 = max2;
                            colorDrawable5.setBounds(0, 0, max2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.l0;
                        if (drawable != colorDrawable2) {
                            this.n0 = drawable;
                            this.j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.l0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.j.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.l0) {
                            this.j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.n0, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.l0 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                pkVar = this.h;
                if (pkVar.e()) {
                }
                int measuredWidth2 = pkVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                if (!pkVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                int max22 = Math.max(0, measuredWidth2);
                compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
                colorDrawable = this.l0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.l0;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.i0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.j.getCompoundDrawablesRelative();
            this.j.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.i0 = null;
            z = true;
            pkVar = this.h;
            if (pkVar.e()) {
            }
            int measuredWidth22 = pkVar.v.getMeasuredWidth() - this.j.getPaddingRight();
            if (!pkVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            int max222 = Math.max(0, measuredWidth22);
            compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
            colorDrawable = this.l0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.l0;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        pkVar = this.h;
        if (pkVar.e()) {
        }
        int measuredWidth222 = pkVar.v.getMeasuredWidth() - this.j.getPaddingRight();
        if (!pkVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        int max2222 = Math.max(0, measuredWidth222);
        compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
        colorDrawable = this.l0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.l0;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.u0 = i;
            this.w0 = i;
            this.x0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.u0 = defaultColor;
        this.d0 = defaultColor;
        this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.V = i;
    }

    public void setBoxCornerFamily(int i) {
        e50 k = this.R.k();
        ve veVar = this.R.e;
        k.a = mz.j(i);
        k.e = veVar;
        ve veVar2 = this.R.f;
        k.b = mz.j(i);
        k.f = veVar2;
        ve veVar3 = this.R.h;
        k.d = mz.j(i);
        k.h = veVar3;
        ve veVar4 = this.R.g;
        k.c = mz.j(i);
        k.g = veVar4;
        this.R = k.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.q0 = colorStateList.getDefaultColor();
            this.y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.s0 != colorStateList.getDefaultColor()) {
            this.s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.a0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.q != z) {
            zq zqVar = this.p;
            if (z) {
                b6 b6Var = new b6(getContext(), null);
                this.u = b6Var;
                b6Var.setId(com.moontiko.really.admiralcasino.R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.u.setTypeface(typeface);
                }
                this.u.setMaxLines(1);
                zqVar.a(this.u, 2);
                ((ViewGroup.MarginLayoutParams) this.u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.moontiko.really.admiralcasino.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.u != null) {
                    EditText editText = this.j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                zqVar.g(this.u, 2);
                this.u = null;
            }
            this.q = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.r != i) {
            if (i > 0) {
                this.r = i;
            } else {
                this.r = -1;
            }
            if (!this.q || this.u == null) {
                return;
            }
            EditText editText = this.j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.v != i) {
            this.v = i;
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
        if (this.w != i) {
            this.w = i;
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
            if (o() || (this.u != null && this.s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        this.p0 = colorStateList;
        if (this.j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.h.l.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.h.l.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        pk pkVar = this.h;
        pkVar.g(i != 0 ? pkVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        pk pkVar = this.h;
        Drawable m = i != 0 ? mz.m(pkVar.getContext(), i) : null;
        TextInputLayout textInputLayout = pkVar.f;
        CheckableImageButton checkableImageButton = pkVar.l;
        checkableImageButton.setImageDrawable(m);
        if (m != null) {
            kr.a(textInputLayout, checkableImageButton, pkVar.p, pkVar.q);
            kr.V(textInputLayout, checkableImageButton, pkVar.p);
        }
    }

    public void setEndIconMinSize(int i) {
        pk pkVar = this.h;
        if (i < 0) {
            pkVar.getClass();
            g9.i("endIconSize cannot be less than 0");
        } else if (i != pkVar.r) {
            pkVar.r = i;
            CheckableImageButton checkableImageButton = pkVar.l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pkVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        pk pkVar = this.h;
        CheckableImageButton checkableImageButton = pkVar.l;
        View.OnLongClickListener onLongClickListener = pkVar.t;
        checkableImageButton.setOnClickListener(onClickListener);
        kr.c0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        pk pkVar = this.h;
        pkVar.t = onLongClickListener;
        CheckableImageButton checkableImageButton = pkVar.l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kr.c0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        pk pkVar = this.h;
        pkVar.s = scaleType;
        pkVar.l.setScaleType(scaleType);
        pkVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        pk pkVar = this.h;
        if (pkVar.p != colorStateList) {
            pkVar.p = colorStateList;
            kr.a(pkVar.f, pkVar.l, colorStateList, pkVar.q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        pk pkVar = this.h;
        if (pkVar.q != mode) {
            pkVar.q = mode;
            kr.a(pkVar.f, pkVar.l, pkVar.p, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h.i(z);
    }

    public void setError(CharSequence charSequence) {
        zq zqVar = this.p;
        if (!zqVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            zqVar.f();
            return;
        }
        zqVar.c();
        zqVar.p = charSequence;
        zqVar.r.setText(charSequence);
        int i = zqVar.n;
        if (i != 1) {
            zqVar.o = 1;
        }
        zqVar.i(i, zqVar.o, zqVar.h(zqVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        zq zqVar = this.p;
        zqVar.t = i;
        b6 b6Var = zqVar.r;
        if (b6Var != null) {
            b6Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        zq zqVar = this.p;
        zqVar.s = charSequence;
        b6 b6Var = zqVar.r;
        if (b6Var != null) {
            b6Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        zq zqVar = this.p;
        TextInputLayout textInputLayout = zqVar.h;
        if (zqVar.q == z) {
            return;
        }
        zqVar.c();
        if (z) {
            b6 b6Var = new b6(zqVar.g, null);
            zqVar.r = b6Var;
            b6Var.setId(com.moontiko.really.admiralcasino.R.id.textinput_error);
            zqVar.r.setTextAlignment(5);
            Typeface typeface = zqVar.B;
            if (typeface != null) {
                zqVar.r.setTypeface(typeface);
            }
            int i = zqVar.u;
            zqVar.u = i;
            b6 b6Var2 = zqVar.r;
            if (b6Var2 != null) {
                zqVar.h.n(b6Var2, i);
            }
            ColorStateList colorStateList = zqVar.v;
            zqVar.v = colorStateList;
            b6 b6Var3 = zqVar.r;
            if (b6Var3 != null && colorStateList != null) {
                b6Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = zqVar.s;
            zqVar.s = charSequence;
            b6 b6Var4 = zqVar.r;
            if (b6Var4 != null) {
                b6Var4.setContentDescription(charSequence);
            }
            int i2 = zqVar.t;
            zqVar.t = i2;
            b6 b6Var5 = zqVar.r;
            if (b6Var5 != null) {
                b6Var5.setAccessibilityLiveRegion(i2);
            }
            zqVar.r.setVisibility(4);
            zqVar.a(zqVar.r, 0);
        } else {
            zqVar.f();
            zqVar.g(zqVar.r, 0);
            zqVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        zqVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        pk pkVar = this.h;
        pkVar.j(i != 0 ? mz.m(pkVar.getContext(), i) : null);
        kr.V(pkVar.f, pkVar.h, pkVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        pk pkVar = this.h;
        CheckableImageButton checkableImageButton = pkVar.h;
        View.OnLongClickListener onLongClickListener = pkVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        kr.c0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        pk pkVar = this.h;
        pkVar.k = onLongClickListener;
        CheckableImageButton checkableImageButton = pkVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kr.c0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        pk pkVar = this.h;
        if (pkVar.i != colorStateList) {
            pkVar.i = colorStateList;
            kr.a(pkVar.f, pkVar.h, colorStateList, pkVar.j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        pk pkVar = this.h;
        if (pkVar.j != mode) {
            pkVar.j = mode;
            kr.a(pkVar.f, pkVar.h, pkVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        zq zqVar = this.p;
        zqVar.u = i;
        b6 b6Var = zqVar.r;
        if (b6Var != null) {
            zqVar.h.n(b6Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        zq zqVar = this.p;
        zqVar.v = colorStateList;
        b6 b6Var = zqVar.r;
        if (b6Var == null || colorStateList == null) {
            return;
        }
        b6Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        zq zqVar = this.p;
        if (isEmpty) {
            if (zqVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!zqVar.x) {
            setHelperTextEnabled(true);
        }
        zqVar.c();
        zqVar.w = charSequence;
        zqVar.y.setText(charSequence);
        int i = zqVar.n;
        if (i != 2) {
            zqVar.o = 2;
        }
        zqVar.i(i, zqVar.o, zqVar.h(zqVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        zq zqVar = this.p;
        zqVar.A = colorStateList;
        b6 b6Var = zqVar.y;
        if (b6Var == null || colorStateList == null) {
            return;
        }
        b6Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        zq zqVar = this.p;
        TextInputLayout textInputLayout = zqVar.h;
        if (zqVar.x == z) {
            return;
        }
        zqVar.c();
        if (z) {
            b6 b6Var = new b6(zqVar.g, null);
            zqVar.y = b6Var;
            b6Var.setId(com.moontiko.really.admiralcasino.R.id.textinput_helper_text);
            zqVar.y.setTextAlignment(5);
            Typeface typeface = zqVar.B;
            if (typeface != null) {
                zqVar.y.setTypeface(typeface);
            }
            zqVar.y.setVisibility(4);
            zqVar.y.setImportantForAccessibility(2);
            int i = zqVar.z;
            zqVar.z = i;
            b6 b6Var2 = zqVar.y;
            if (b6Var2 != null) {
                b6Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = zqVar.A;
            zqVar.A = colorStateList;
            b6 b6Var3 = zqVar.y;
            if (b6Var3 != null && colorStateList != null) {
                b6Var3.setTextColor(colorStateList);
            }
            zqVar.a(zqVar.y, 1);
        } else {
            zqVar.c();
            int i2 = zqVar.n;
            if (i2 == 2) {
                zqVar.o = 0;
            }
            zqVar.i(i2, zqVar.o, zqVar.h(zqVar.y, ""));
            zqVar.g(zqVar.y, 1);
            zqVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        zqVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        zq zqVar = this.p;
        zqVar.z = i;
        b6 b6Var = zqVar.y;
        if (b6Var != null) {
            b6Var.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.D0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.I) {
            this.I = z;
            if (z) {
                CharSequence hint = this.j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.j.getHint())) {
                    this.j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        vb vbVar = this.B0;
        if (i != vbVar.f0) {
            vbVar.f0 = i;
            vbVar.j(false);
        }
        if (i != vbVar.e0) {
            vbVar.e0 = i;
            vbVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        vb vbVar = this.B0;
        TextInputLayout textInputLayout = vbVar.a;
        p80 p80Var = new p80(textInputLayout.getContext(), i);
        ColorStateList colorStateList = p80Var.k;
        if (colorStateList != null) {
            vbVar.k = colorStateList;
        }
        float f = p80Var.l;
        if (f != 0.0f) {
            vbVar.i = f;
        }
        ColorStateList colorStateList2 = p80Var.a;
        if (colorStateList2 != null) {
            vbVar.V = colorStateList2;
        }
        vbVar.T = p80Var.f;
        vbVar.U = p80Var.g;
        vbVar.S = p80Var.h;
        vbVar.W = p80Var.j;
        s9 s9Var = vbVar.z;
        if (s9Var != null) {
            s9Var.z = true;
        }
        rc0 rc0Var = new rc0(16, vbVar);
        p80Var.a();
        vbVar.z = new s9(rc0Var, p80Var.p);
        p80Var.b(textInputLayout.getContext(), vbVar.z);
        vbVar.j(false);
        this.p0 = vbVar.k;
        if (this.j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            if (this.o0 == null) {
                vb vbVar = this.B0;
                if (vbVar.k != colorStateList) {
                    vbVar.k = colorStateList;
                    vbVar.j(false);
                }
            }
            this.p0 = colorStateList;
            if (this.j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(u80 u80Var) {
        this.t = u80Var;
    }

    public void setMaxEms(int i) {
        this.m = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.o = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.l = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.n = i;
        EditText editText = this.j;
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
        pk pkVar = this.h;
        pkVar.l.setContentDescription(i != 0 ? pkVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        pk pkVar = this.h;
        pkVar.l.setImageDrawable(i != 0 ? mz.m(pkVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        pk pkVar = this.h;
        if (z && pkVar.n != 1) {
            pkVar.h(1);
        } else if (z) {
            pkVar.getClass();
        } else {
            pkVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        pk pkVar = this.h;
        pkVar.p = colorStateList;
        kr.a(pkVar.f, pkVar.l, colorStateList, pkVar.q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        pk pkVar = this.h;
        pkVar.q = mode;
        kr.a(pkVar.f, pkVar.l, pkVar.p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z == null) {
            b6 b6Var = new b6(getContext(), null);
            this.z = b6Var;
            b6Var.setId(com.moontiko.really.admiralcasino.R.id.textinput_placeholder);
            this.z.setImportantForAccessibility(1);
            this.z.setAccessibilityLiveRegion(1);
            fl f = f();
            this.C = f;
            f.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            ic0.m(this.z, new kv(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.y) {
                setPlaceholderTextEnabled(true);
            }
            this.x = charSequence;
        }
        EditText editText = this.j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B = i;
        b6 b6Var = this.z;
        if (b6Var != null) {
            b6Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            b6 b6Var = this.z;
            if (b6Var == null || colorStateList == null) {
                return;
            }
            b6Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        x60 x60Var = this.g;
        x60Var.getClass();
        x60Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        x60Var.g.setText(charSequence);
        x60Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.g.g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(f50 f50Var) {
        dw dwVar = this.L;
        if (dwVar == null || dwVar.i() == f50Var) {
            return;
        }
        this.R = f50Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g.i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? mz.m(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        x60 x60Var = this.g;
        if (i < 0) {
            x60Var.getClass();
            g9.i("startIconSize cannot be less than 0");
        } else if (i != x60Var.l) {
            x60Var.l = i;
            CheckableImageButton checkableImageButton = x60Var.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        x60 x60Var = this.g;
        CheckableImageButton checkableImageButton = x60Var.i;
        View.OnLongClickListener onLongClickListener = x60Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        kr.c0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        x60 x60Var = this.g;
        x60Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = x60Var.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kr.c0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        x60 x60Var = this.g;
        x60Var.m = scaleType;
        x60Var.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        x60 x60Var = this.g;
        if (x60Var.j != colorStateList) {
            x60Var.j = colorStateList;
            kr.a(x60Var.f, x60Var.i, colorStateList, x60Var.k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        x60 x60Var = this.g;
        if (x60Var.k != mode) {
            x60Var.k = mode;
            kr.a(x60Var.f, x60Var.i, x60Var.j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        pk pkVar = this.h;
        pkVar.getClass();
        pkVar.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pkVar.v.setText(charSequence);
        pkVar.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(t80 t80Var) {
        EditText editText = this.j;
        if (editText != null) {
            ic0.m(editText, t80Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.B0.n(typeface);
            zq zqVar = this.p;
            if (typeface != zqVar.B) {
                zqVar.B = typeface;
                b6 b6Var = zqVar.r;
                if (b6Var != null) {
                    b6Var.setTypeface(typeface);
                }
                b6 b6Var2 = zqVar.y;
                if (b6Var2 != null) {
                    b6Var2.setTypeface(typeface);
                }
            }
            b6 b6Var3 = this.u;
            if (b6Var3 != null) {
                b6Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        b6 b6Var;
        EditText editText = this.j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = gi.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(r4.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (b6Var = this.u) != null) {
            mutate.setColorFilter(r4.c(b6Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        b6 b6Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.o0;
        vb vbVar = this.B0;
        if (colorStateList2 != null) {
            vbVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.o0;
            int i = this.y0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            vbVar.k(ColorStateList.valueOf(i));
        } else if (o()) {
            b6 b6Var2 = this.p.r;
            vbVar.k(b6Var2 != null ? b6Var2.getTextColors() : null);
        } else if (this.s && (b6Var = this.u) != null) {
            vbVar.k(b6Var.getTextColors());
        } else if (z4 && (colorStateList = this.p0) != null && vbVar.k != colorStateList) {
            vbVar.k = colorStateList;
            vbVar.j(false);
        }
        pk pkVar = this.h;
        x60 x60Var = this.g;
        if (z3 || !this.C0 || (isEnabled() && z4)) {
            if (z2 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z && this.D0) {
                    b(1.0f);
                } else {
                    vbVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j;
                x(editText3 != null ? editText3.getText() : null);
                x60Var.o = false;
                x60Var.f();
                pkVar.w = false;
                pkVar.o();
                return;
            }
            return;
        }
        if (z2 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (z && this.D0) {
                b(0.0f);
            } else {
                vbVar.m(0.0f);
            }
            if (g() && !((rf) this.L).M.q.isEmpty() && g()) {
                ((rf) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            b6 b6Var3 = this.z;
            if (b6Var3 != null && this.y) {
                b6Var3.setText((CharSequence) null);
                da0.a(this.f, this.D);
                this.z.setVisibility(4);
            }
            x60Var.o = true;
            x60Var.f();
            pkVar.w = true;
            pkVar.o();
        }
    }

    public final void x(Editable editable) {
        ((g9) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            b6 b6Var = this.z;
            if (b6Var == null || !this.y) {
                return;
            }
            b6Var.setText((CharSequence) null);
            da0.a(frameLayout, this.D);
            this.z.setVisibility(4);
            return;
        }
        if (this.z == null || !this.y || TextUtils.isEmpty(this.x)) {
            return;
        }
        this.z.setText(this.x);
        da0.a(frameLayout, this.C);
        this.z.setVisibility(0);
        this.z.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.t0.getDefaultColor();
        int colorForState = this.t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.c0 = colorForState2;
        } else if (z2) {
            this.c0 = colorForState;
        } else {
            this.c0 = defaultColor;
        }
    }

    public final void z() {
        b6 b6Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.j) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.c0 = this.y0;
        } else if (o()) {
            if (this.t0 != null) {
                y(z, z2);
            } else {
                this.c0 = getErrorCurrentTextColors();
            }
        } else if (!this.s || (b6Var = this.u) == null) {
            if (z) {
                this.c0 = this.s0;
            } else if (z2) {
                this.c0 = this.r0;
            } else {
                this.c0 = this.q0;
            }
        } else if (this.t0 != null) {
            y(z, z2);
        } else {
            this.c0 = b6Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        pk pkVar = this.h;
        TextInputLayout textInputLayout = pkVar.f;
        CheckableImageButton checkableImageButton = pkVar.l;
        TextInputLayout textInputLayout2 = pkVar.f;
        pkVar.m();
        kr.V(textInputLayout2, pkVar.h, pkVar.i);
        kr.V(textInputLayout2, checkableImageButton, pkVar.p);
        if (pkVar.b() instanceof si) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                kr.a(textInputLayout, checkableImageButton, pkVar.p, pkVar.q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        x60 x60Var = this.g;
        kr.V(x60Var.f, x60Var.i, x60Var.j);
        if (this.U == 2) {
            int i = this.W;
            if (z && isEnabled()) {
                this.W = this.b0;
            } else {
                this.W = this.a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((rf) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.v0;
            } else if (z2 && !z) {
                this.d0 = this.x0;
            } else if (z) {
                this.d0 = this.w0;
            } else {
                this.d0 = this.u0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.j;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.g.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.g.c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.h.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h.l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h.l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        pk pkVar = this.h;
        TextInputLayout textInputLayout = pkVar.f;
        CheckableImageButton checkableImageButton = pkVar.l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            kr.a(textInputLayout, checkableImageButton, pkVar.p, pkVar.q);
            kr.V(textInputLayout, checkableImageButton, pkVar.p);
        }
    }
}
