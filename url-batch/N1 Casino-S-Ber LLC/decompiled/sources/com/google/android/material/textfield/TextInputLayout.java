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
import defpackage.a40;
import defpackage.a6;
import defpackage.ab;
import defpackage.at;
import defpackage.c20;
import defpackage.ce;
import defpackage.ct;
import defpackage.d20;
import defpackage.d8;
import defpackage.de;
import defpackage.dh;
import defpackage.e70;
import defpackage.e8;
import defpackage.f9;
import defpackage.fg;
import defpackage.g;
import defpackage.h4;
import defpackage.i50;
import defpackage.ii;
import defpackage.j50;
import defpackage.jf;
import defpackage.js;
import defpackage.jw;
import defpackage.k0;
import defpackage.ki;
import defpackage.l40;
import defpackage.l50;
import defpackage.lb;
import defpackage.m1;
import defpackage.m50;
import defpackage.n50;
import defpackage.o50;
import defpackage.o8;
import defpackage.oo;
import defpackage.q00;
import defpackage.r5;
import defpackage.rg;
import defpackage.rr;
import defpackage.t8;
import defpackage.td;
import defpackage.u30;
import defpackage.vx;
import defpackage.w2;
import defpackage.w60;
import defpackage.x80;
import defpackage.xi;
import defpackage.z6;
import defpackage.z7;
import defpackage.zo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final ab B0;
    public xi C;
    public boolean C0;
    public xi D;
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
    public ct L;
    public ct M;
    public StateListDrawable N;
    public boolean O;
    public ct P;
    public ct Q;
    public d20 R;
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
    public final u30 g;
    public final RectF g0;
    public final ki h;
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
    public final oo p;
    public ColorStateList p0;
    public boolean q;
    public int q0;
    public int r;
    public int r0;
    public boolean s;
    public int s0;
    public n50 t;
    public ColorStateList t0;
    public r5 u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public CharSequence x;
    public int x0;
    public boolean y;
    public int y0;
    public r5 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, com.derinko.gbini.n1casino.R.attr.textInputStyle, com.derinko.gbini.n1casino.R.style.Widget_Design_TextInputLayout), attributeSet, com.derinko.gbini.n1casino.R.attr.textInputStyle);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new oo(this);
        this.t = new t8(26);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.k0 = new LinkedHashSet();
        ab abVar = new ab(this);
        this.B0 = abVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = w2.a;
        abVar.R = linearInterpolator;
        abVar.j(false);
        abVar.Q = linearInterpolator;
        abVar.j(false);
        if (abVar.g != 8388659) {
            abVar.g = 8388659;
            abVar.j(false);
        }
        o8.h(context2, attributeSet, com.derinko.gbini.n1casino.R.attr.textInputStyle, com.derinko.gbini.n1casino.R.style.Widget_Design_TextInputLayout);
        int[] iArr = vx.J;
        o8.k(context2, attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.textInputStyle, com.derinko.gbini.n1casino.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.derinko.gbini.n1casino.R.attr.textInputStyle, com.derinko.gbini.n1casino.R.style.Widget_Design_TextInputLayout);
        a6 a6Var = new a6(context2, obtainStyledAttributes);
        u30 u30Var = new u30(this, a6Var);
        this.g = u30Var;
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
        this.R = d20.g(context2, attributeSet, com.derinko.gbini.n1casino.R.attr.textInputStyle, com.derinko.gbini.n1casino.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.derinko.gbini.n1casino.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        c20 k = this.R.k();
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
        ColorStateList x = e70.x(context2, a6Var, 7);
        if (x != null) {
            int defaultColor = x.getDefaultColor();
            this.u0 = defaultColor;
            this.d0 = defaultColor;
            if (x.isStateful()) {
                this.v0 = x.getColorForState(new int[]{-16842910}, -1);
                this.w0 = x.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.x0 = x.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.w0 = this.u0;
                ColorStateList q = zo.q(context2, com.derinko.gbini.n1casino.R.color.mtrl_filled_background_color);
                this.v0 = q.getColorForState(new int[]{-16842910}, -1);
                this.x0 = q.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.u0 = 0;
            this.v0 = 0;
            this.w0 = 0;
            this.x0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList j = a6Var.j(1);
            this.p0 = j;
            this.o0 = j;
        }
        ColorStateList x2 = e70.x(context2, a6Var, 14);
        this.s0 = obtainStyledAttributes.getColor(14, 0);
        this.q0 = context2.getColor(com.derinko.gbini.n1casino.R.color.mtrl_textinput_default_box_stroke_color);
        this.y0 = context2.getColor(com.derinko.gbini.n1casino.R.color.mtrl_textinput_disabled_color);
        this.r0 = context2.getColor(com.derinko.gbini.n1casino.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (x2 != null) {
            setBoxStrokeColorStateList(x2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(e70.x(context2, a6Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = a6Var.j(24);
        this.H = a6Var.j(25);
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
            setErrorTextColor(a6Var.j(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(a6Var.j(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(a6Var.j(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(a6Var.j(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(a6Var.j(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(a6Var.j(59));
        }
        ki kiVar = new ki(this, a6Var);
        this.h = kiVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        a6Var.w();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(u30Var);
        frameLayout.addView(kiVar);
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
        int X = jw.X(editText2.getContext(), zo.L(editText2, com.derinko.gbini.n1casino.R.attr.colorControlHighlight));
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            ct ctVar = this.L;
            int i2 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{jw.I(X, i2, 0.1f), i2}), ctVar, ctVar);
        }
        Context context = getContext();
        ct ctVar2 = this.L;
        int X2 = jw.X(context, zo.K(context, com.derinko.gbini.n1casino.R.attr.colorSurface, "TextInputLayout"));
        ct ctVar3 = new ct(ctVar2.i());
        int I = jw.I(X, X2, 0.1f);
        ctVar3.r(new ColorStateList(iArr, new int[]{I, 0}));
        ctVar3.setTint(X2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I, X2});
        ct ctVar4 = new ct(ctVar2.i());
        ctVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ctVar3, ctVar4), ctVar2});
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
            t8.k("We already have an EditText, can only have one");
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
        setTextInputAccessibilityDelegate(new m50(this));
        Typeface typeface = this.j.getTypeface();
        ab abVar = this.B0;
        abVar.n(typeface);
        float textSize = this.j.getTextSize();
        if (abVar.h != textSize) {
            abVar.h = textSize;
            abVar.j(false);
        }
        float letterSpacing = this.j.getLetterSpacing();
        if (abVar.X != letterSpacing) {
            abVar.X = letterSpacing;
            abVar.j(false);
        }
        int gravity = this.j.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (abVar.g != i3) {
            abVar.g = i3;
            abVar.j(false);
        }
        if (abVar.f != gravity) {
            abVar.f = gravity;
            abVar.j(false);
        }
        this.z0 = editText.getMinimumHeight();
        this.j.addTextChangedListener(new l50(this, editText));
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
        ki kiVar = this.h;
        kiVar.bringToFront();
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((ii) it.next()).a(this);
        }
        kiVar.n();
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
        ab abVar = this.B0;
        if (charSequence == null || !TextUtils.equals(abVar.B, charSequence)) {
            abVar.B = charSequence;
            abVar.C = null;
            abVar.j(false);
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
        r5 r5Var = this.z;
        if (!z) {
            if (r5Var != null) {
                r5Var.setVisibility(8);
            }
            this.z = null;
        } else if (r5Var != null) {
            this.f.addView(r5Var);
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
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_filled_edittext_font_2_0_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (e70.D(getContext())) {
            EditText editText3 = this.j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_filled_edittext_font_1_3_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        ab abVar = this.B0;
        if (abVar.b == f) {
            return;
        }
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(o8.j0(getContext(), com.derinko.gbini.n1casino.R.attr.motionEasingEmphasizedInterpolator, w2.b));
            this.E0.setDuration(o8.i0(getContext(), com.derinko.gbini.n1casino.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new d8(3, this));
        }
        this.E0.setFloatValues(abVar.b, f);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i2;
        ct ctVar = this.L;
        if (ctVar == null) {
            return;
        }
        d20 i3 = ctVar.i();
        d20 d20Var = this.R;
        if (i3 != d20Var) {
            this.L.setShapeAppearanceModel(d20Var);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i2 = this.c0) != 0) {
            ct ctVar2 = this.L;
            ctVar2.g.j = i;
            ctVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            at atVar = ctVar2.g;
            if (atVar.d != valueOf) {
                atVar.d = valueOf;
                ctVar2.onStateChange(ctVar2.getState());
            }
        }
        int i4 = this.d0;
        if (this.U == 1) {
            Integer t = jw.t(getContext(), com.derinko.gbini.n1casino.R.attr.colorSurface);
            i4 = lb.b(this.d0, t != null ? t.intValue() : 0);
        }
        this.d0 = i4;
        this.L.r(ColorStateList.valueOf(i4));
        ct ctVar3 = this.P;
        if (ctVar3 != null && this.Q != null) {
            if (this.W > -1 && this.c0 != 0) {
                ctVar3.r(this.j.isFocused() ? ColorStateList.valueOf(this.q0) : ColorStateList.valueOf(this.c0));
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
        ct ctVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.I;
        ab abVar = this.B0;
        if (z) {
            TextPaint textPaint = abVar.O;
            RectF rectF = abVar.e;
            int save = canvas2.save();
            if (abVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(abVar.G);
                float f = abVar.q;
                float f2 = abVar.r;
                float f3 = abVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((abVar.e0 > 1 || abVar.f0 > 1) && !abVar.D && abVar.o()) {
                    float lineStart = abVar.q - abVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (abVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = abVar.H;
                        float f6 = abVar.I;
                        float f7 = abVar.J;
                        int i2 = abVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, lb.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    abVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (abVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = abVar.H;
                        float f9 = abVar.I;
                        float f10 = abVar.J;
                        int i3 = abVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, lb.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = abVar.Z.getLineBaseline(0);
                    CharSequence charSequence = abVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(abVar.H, abVar.I, abVar.J, abVar.K);
                    }
                    String trim = abVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(abVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    abVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (ctVar = this.P) == null) {
            return;
        }
        ctVar.draw(canvas2);
        if (this.j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f12 = abVar.b;
            int centerX = bounds2.centerX();
            bounds.left = w2.c(centerX, bounds2.left, f12);
            bounds.right = w2.c(centerX, bounds2.right, f12);
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
        ab abVar = this.B0;
        if (abVar != null) {
            abVar.M = drawableState;
            ColorStateList colorStateList2 = abVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = abVar.j) != null && colorStateList.isStateful())) {
                abVar.j(false);
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
            ab abVar = this.B0;
            if (i == 0) {
                return (int) abVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (abVar.f() / 2.0f);
                }
                float f = abVar.f();
                TextPaint textPaint = abVar.P;
                textPaint.setTextSize(abVar.i);
                textPaint.setTypeface(abVar.s);
                textPaint.setLetterSpacing(abVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final xi f() {
        xi xiVar = new xi();
        xiVar.h = o8.i0(getContext(), com.derinko.gbini.n1casino.R.attr.motionDurationShort2, 87);
        xiVar.i = o8.j0(getContext(), com.derinko.gbini.n1casino.R.attr.motionEasingLinearInterpolator, w2.a);
        return xiVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof de);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public ct getBoxBackground() {
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
        d20 d20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? d20Var.h.a(rectF) : d20Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        d20 d20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? d20Var.g.a(rectF) : d20Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        d20 d20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? d20Var.e.a(rectF) : d20Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        d20 d20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? d20Var.f.a(rectF) : d20Var.e.a(rectF);
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
        r5 r5Var;
        if (this.q && this.s && (r5Var = this.u) != null) {
            return r5Var.getContentDescription();
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
        oo ooVar = this.p;
        if (ooVar.q) {
            return ooVar.p;
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
        r5 r5Var = this.p.r;
        if (r5Var != null) {
            return r5Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        oo ooVar = this.p;
        if (ooVar.x) {
            return ooVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        r5 r5Var = this.p.y;
        if (r5Var != null) {
            return r5Var.getCurrentTextColor();
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
        ab abVar = this.B0;
        return abVar.g(abVar.k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.p0;
    }

    public n50 getLengthCounter() {
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

    public d20 getShapeAppearanceModel() {
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

    public final ct h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.derinko.gbini.n1casino.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j;
        float popupElevation = editText instanceof rr ? ((rr) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.derinko.gbini.n1casino.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.derinko.gbini.n1casino.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        q00 q00Var = new q00();
        q00 q00Var2 = new q00();
        q00 q00Var3 = new q00();
        q00 q00Var4 = new q00();
        int i = 0;
        dh dhVar = new dh(i);
        dh dhVar2 = new dh(i);
        dh dhVar3 = new dh(i);
        dh dhVar4 = new dh(i);
        g gVar = new g(f);
        g gVar2 = new g(f);
        g gVar3 = new g(dimensionPixelOffset);
        g gVar4 = new g(dimensionPixelOffset);
        d20 d20Var = new d20();
        d20Var.a = q00Var;
        d20Var.b = q00Var2;
        d20Var.c = q00Var3;
        d20Var.d = q00Var4;
        d20Var.e = gVar;
        d20Var.f = gVar2;
        d20Var.g = gVar4;
        d20Var.h = gVar3;
        d20Var.i = dhVar;
        d20Var.j = dhVar2;
        d20Var.k = dhVar3;
        d20Var.l = dhVar4;
        EditText editText2 = this.j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof rr ? ((rr) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = ct.K;
            dropDownBackgroundTintList = ColorStateList.valueOf(jw.X(context, zo.K(context, com.derinko.gbini.n1casino.R.attr.colorSurface, ct.class.getSimpleName())));
        }
        ct ctVar = new ct();
        ctVar.n(context);
        ctVar.r(dropDownBackgroundTintList);
        ctVar.q(popupElevation);
        ctVar.setShapeAppearanceModel(d20Var);
        at atVar = ctVar.g;
        if (atVar.g == null) {
            atVar.g = new Rect();
        }
        ctVar.g.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        ctVar.invalidateSelf();
        return ctVar;
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
            this.L = new ct(this.R);
            this.P = new ct();
            this.Q = new ct();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof de)) {
                this.L = new ct(this.R);
            } else {
                d20 d20Var = this.R;
                int i2 = de.N;
                if (d20Var == null) {
                    d20Var = new d20();
                }
                ce ceVar = new ce(d20Var, new RectF());
                de deVar = new de(ceVar);
                deVar.M = ceVar;
                this.L = deVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (e70.D(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.material_font_1_3_box_collapsed_padding_top);
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
            ab abVar = this.B0;
            boolean c = abVar.c(abVar.B);
            abVar.D = c;
            Rect rect = abVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = abVar.a0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = abVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (abVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (abVar.D) {
                        f5 = abVar.a0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (abVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = abVar.a0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = abVar.f() + rect.top;
                if (abVar.Z != null && !abVar.o()) {
                    StaticLayout staticLayout = abVar.Z;
                    float lineWidth = (abVar.i / abVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (abVar.D) {
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
                de deVar = (de) this.L;
                deVar.getClass();
                deVar.z(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = abVar.a0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (abVar.a0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = abVar.f() + rect.top;
            if (abVar.Z != null) {
                StaticLayout staticLayout2 = abVar.Z;
                float lineWidth2 = (abVar.i / abVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (abVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(r5 r5Var, int i) {
        try {
            r5Var.setTextAppearance(i);
            if (r5Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        r5Var.setTextAppearance(com.derinko.gbini.n1casino.R.style.TextAppearance_AppCompat_Caption);
        r5Var.setTextColor(getContext().getColor(com.derinko.gbini.n1casino.R.color.design_error));
    }

    public final boolean o() {
        oo ooVar = this.p;
        return (ooVar.o != 1 || ooVar.r == null || TextUtils.isEmpty(ooVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        ki kiVar = this.h;
        kiVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.H0 = false;
        if (this.j != null && this.j.getMeasuredHeight() < (max = Math.max(kiVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.j.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.j.post(new m1(14, this));
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
            jf.a(this, editText, rect);
            ct ctVar = this.P;
            if (ctVar != null) {
                int i6 = rect.bottom;
                ctVar.setBounds(rect.left, i6 - this.a0, rect.right, i6);
            }
            ct ctVar2 = this.Q;
            if (ctVar2 != null) {
                int i7 = rect.bottom;
                ctVar2.setBounds(rect.left, i7 - this.b0, rect.right, i7);
            }
            if (this.I) {
                float textSize = this.j.getTextSize();
                ab abVar = this.B0;
                float f = abVar.h;
                TextPaint textPaint = abVar.P;
                if (f != textSize) {
                    abVar.h = textSize;
                    abVar.j(false);
                }
                int gravity = this.j.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (abVar.g != i8) {
                    abVar.g = i8;
                    abVar.j(false);
                }
                if (abVar.f != gravity) {
                    abVar.f = gravity;
                    abVar.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = abVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    abVar.N = true;
                }
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(abVar.h);
                    textPaint.setTypeface(abVar.v);
                    textPaint.setLetterSpacing(abVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(abVar.h);
                    textPaint.setTypeface(abVar.v);
                    textPaint.setLetterSpacing(abVar.X);
                    descent = abVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(abVar.h);
                        textPaint.setTypeface(abVar.v);
                        textPaint.setLetterSpacing(abVar.X);
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
                Rect rect4 = abVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != abVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    abVar.N = true;
                    abVar.k0 = true;
                }
                abVar.j(false);
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
        ki kiVar = this.h;
        if (!z) {
            kiVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.z != null && (editText = this.j) != null) {
            this.z.setGravity(editText.getGravity());
            this.z.setPadding(this.j.getCompoundPaddingLeft(), this.j.getCompoundPaddingTop(), this.j.getCompoundPaddingRight(), this.j.getCompoundPaddingBottom());
        }
        kiVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j.getMeasuredWidth() - this.j.getCompoundPaddingLeft()) - this.j.getCompoundPaddingRight();
        ab abVar = this.B0;
        TextPaint textPaint = abVar.P;
        textPaint.setTextSize(abVar.i);
        textPaint.setTypeface(abVar.s);
        textPaint.setLetterSpacing(abVar.W);
        float f2 = measuredWidth;
        abVar.i0 = abVar.e(abVar.f0, textPaint, abVar.B, (abVar.i / abVar.h) * f2, abVar.D).getHeight();
        textPaint.setTextSize(abVar.h);
        textPaint.setTypeface(abVar.v);
        textPaint.setLetterSpacing(abVar.X);
        abVar.j0 = abVar.e(abVar.e0, textPaint, abVar.B, f2, abVar.D).getHeight();
        EditText editText2 = this.j;
        Rect rect = this.e0;
        jf.a(this, editText2, rect);
        Rect d = d(rect);
        int i3 = d.left;
        int i4 = d.top;
        int i5 = d.right;
        int i6 = d.bottom;
        Rect rect2 = abVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            abVar.N = true;
        }
        v();
        a();
        if (this.j == null) {
            return;
        }
        int i7 = abVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = abVar.P;
            textPaint2.setTextSize(abVar.h);
            textPaint2.setTypeface(abVar.v);
            textPaint2.setLetterSpacing(abVar.X);
            f = -textPaint2.ascent();
        }
        if (this.x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z.getPaint());
            textPaint3.setTextSize(this.z.getTextSize());
            textPaint3.setTypeface(this.z.getTypeface());
            textPaint3.setLetterSpacing(this.z.getLetterSpacing());
            a40 a40Var = new a40(this.x, textPaint3, measuredWidth);
            a40Var.k = getLayoutDirection() == 1;
            a40Var.j = true;
            float lineSpacingExtra = this.z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z.getLineSpacingMultiplier();
            a40Var.g = lineSpacingExtra;
            a40Var.h = lineSpacingMultiplier;
            a40Var.m = new l40(8, this);
            r3 = (this.U == 1 ? abVar.f() + this.V + this.i : 0.0f) + a40Var.a().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.j.getMeasuredHeight() < max) {
            this.j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o50)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o50 o50Var = (o50) parcelable;
        super.onRestoreInstanceState(o50Var.f);
        setError(o50Var.h);
        if (o50Var.i) {
            post(new z6(10, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S) {
            td tdVar = this.R.e;
            RectF rectF = this.g0;
            float a = tdVar.a(rectF);
            float a2 = this.R.f.a(rectF);
            float a3 = this.R.h.a(rectF);
            float a4 = this.R.g.a(rectF);
            d20 d20Var = this.R;
            jw jwVar = d20Var.a;
            jw jwVar2 = d20Var.b;
            jw jwVar3 = d20Var.d;
            jw jwVar4 = d20Var.c;
            dh dhVar = new dh(0);
            dh dhVar2 = new dh(0);
            dh dhVar3 = new dh(0);
            dh dhVar4 = new dh(0);
            g gVar = new g(a2);
            g gVar2 = new g(a);
            g gVar3 = new g(a4);
            g gVar4 = new g(a3);
            d20 d20Var2 = new d20();
            d20Var2.a = jwVar2;
            d20Var2.b = jwVar;
            d20Var2.c = jwVar3;
            d20Var2.d = jwVar4;
            d20Var2.e = gVar;
            d20Var2.f = gVar2;
            d20Var2.g = gVar4;
            d20Var2.h = gVar3;
            d20Var2.i = dhVar;
            d20Var2.j = dhVar2;
            d20Var2.k = dhVar3;
            d20Var2.l = dhVar4;
            this.S = z;
            setShapeAppearanceModel(d20Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o50 o50Var = new o50(super.onSaveInstanceState());
        if (o()) {
            o50Var.h = getError();
        }
        ki kiVar = this.h;
        o50Var.i = kiVar.n != 0 && kiVar.l.i;
        return o50Var;
    }

    public final void p(Editable editable) {
        ((t8) this.t).getClass();
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
            this.u.setContentDescription(context.getString(this.s ? com.derinko.gbini.n1casino.R.string.character_counter_overflowed_content_description : com.derinko.gbini.n1casino.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r)));
            if (z != this.s) {
                q();
            }
            String str = z7.b;
            z7 z7Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? z7.e : z7.d;
            r5 r5Var = this.u;
            String string = getContext().getString(com.derinko.gbini.n1casino.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r));
            z7Var.getClass();
            e8 e8Var = j50.a;
            r5Var.setText(string != null ? z7Var.c(string).toString() : null);
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
        r5 r5Var = this.u;
        if (r5Var != null) {
            n(r5Var, this.s ? this.v : this.w);
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
            TypedValue I = zo.I(context.getTheme(), com.derinko.gbini.n1casino.R.attr.colorControlActivated);
            if (I != null) {
                int i = I.resourceId;
                if (i != 0) {
                    colorStateList2 = zo.q(context, i);
                } else {
                    int i2 = I.data;
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
        ki kiVar;
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
            u30 u30Var = this.g;
            if (u30Var.getMeasuredWidth() > 0) {
                int max = Math.max(0, u30Var.getMeasuredWidth() - this.j.getPaddingLeft());
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
                    kiVar = this.h;
                    if ((!kiVar.e() || ((kiVar.n != 0 && kiVar.d()) || kiVar.u != null)) && kiVar.getMeasuredWidth() > 0) {
                        int measuredWidth = kiVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                        if (!kiVar.e()) {
                            checkableImageButton = kiVar.h;
                        } else if (kiVar.n != 0 && kiVar.d()) {
                            checkableImageButton = kiVar.l;
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
                kiVar = this.h;
                if (kiVar.e()) {
                }
                int measuredWidth2 = kiVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                if (!kiVar.e()) {
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
            kiVar = this.h;
            if (kiVar.e()) {
            }
            int measuredWidth22 = kiVar.v.getMeasuredWidth() - this.j.getPaddingRight();
            if (!kiVar.e()) {
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
        kiVar = this.h;
        if (kiVar.e()) {
        }
        int measuredWidth222 = kiVar.v.getMeasuredWidth() - this.j.getPaddingRight();
        if (!kiVar.e()) {
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
        c20 k = this.R.k();
        td tdVar = this.R.e;
        k.a = o8.r(i);
        k.e = tdVar;
        td tdVar2 = this.R.f;
        k.b = o8.r(i);
        k.f = tdVar2;
        td tdVar3 = this.R.h;
        k.d = o8.r(i);
        k.h = tdVar3;
        td tdVar4 = this.R.g;
        k.c = o8.r(i);
        k.g = tdVar4;
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
            oo ooVar = this.p;
            if (z) {
                r5 r5Var = new r5(getContext(), null);
                this.u = r5Var;
                r5Var.setId(com.derinko.gbini.n1casino.R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.u.setTypeface(typeface);
                }
                this.u.setMaxLines(1);
                ooVar.a(this.u, 2);
                ((ViewGroup.MarginLayoutParams) this.u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.derinko.gbini.n1casino.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.u != null) {
                    EditText editText = this.j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                ooVar.g(this.u, 2);
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
        ki kiVar = this.h;
        kiVar.g(i != 0 ? kiVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        ki kiVar = this.h;
        Drawable s = i != 0 ? zo.s(kiVar.getContext(), i) : null;
        TextInputLayout textInputLayout = kiVar.f;
        CheckableImageButton checkableImageButton = kiVar.l;
        checkableImageButton.setImageDrawable(s);
        if (s != null) {
            jw.g(textInputLayout, checkableImageButton, kiVar.p, kiVar.q);
            jw.W(textInputLayout, checkableImageButton, kiVar.p);
        }
    }

    public void setEndIconMinSize(int i) {
        ki kiVar = this.h;
        if (i < 0) {
            kiVar.getClass();
            t8.k("endIconSize cannot be less than 0");
        } else if (i != kiVar.r) {
            kiVar.r = i;
            CheckableImageButton checkableImageButton = kiVar.l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = kiVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        ki kiVar = this.h;
        CheckableImageButton checkableImageButton = kiVar.l;
        View.OnLongClickListener onLongClickListener = kiVar.t;
        checkableImageButton.setOnClickListener(onClickListener);
        jw.a0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ki kiVar = this.h;
        kiVar.t = onLongClickListener;
        CheckableImageButton checkableImageButton = kiVar.l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        jw.a0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        ki kiVar = this.h;
        kiVar.s = scaleType;
        kiVar.l.setScaleType(scaleType);
        kiVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        ki kiVar = this.h;
        if (kiVar.p != colorStateList) {
            kiVar.p = colorStateList;
            jw.g(kiVar.f, kiVar.l, colorStateList, kiVar.q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        ki kiVar = this.h;
        if (kiVar.q != mode) {
            kiVar.q = mode;
            jw.g(kiVar.f, kiVar.l, kiVar.p, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h.i(z);
    }

    public void setError(CharSequence charSequence) {
        oo ooVar = this.p;
        if (!ooVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            ooVar.f();
            return;
        }
        ooVar.c();
        ooVar.p = charSequence;
        ooVar.r.setText(charSequence);
        int i = ooVar.n;
        if (i != 1) {
            ooVar.o = 1;
        }
        ooVar.i(i, ooVar.o, ooVar.h(ooVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        oo ooVar = this.p;
        ooVar.t = i;
        r5 r5Var = ooVar.r;
        if (r5Var != null) {
            r5Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        oo ooVar = this.p;
        ooVar.s = charSequence;
        r5 r5Var = ooVar.r;
        if (r5Var != null) {
            r5Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        oo ooVar = this.p;
        TextInputLayout textInputLayout = ooVar.h;
        if (ooVar.q == z) {
            return;
        }
        ooVar.c();
        if (z) {
            r5 r5Var = new r5(ooVar.g, null);
            ooVar.r = r5Var;
            r5Var.setId(com.derinko.gbini.n1casino.R.id.textinput_error);
            ooVar.r.setTextAlignment(5);
            Typeface typeface = ooVar.B;
            if (typeface != null) {
                ooVar.r.setTypeface(typeface);
            }
            int i = ooVar.u;
            ooVar.u = i;
            r5 r5Var2 = ooVar.r;
            if (r5Var2 != null) {
                ooVar.h.n(r5Var2, i);
            }
            ColorStateList colorStateList = ooVar.v;
            ooVar.v = colorStateList;
            r5 r5Var3 = ooVar.r;
            if (r5Var3 != null && colorStateList != null) {
                r5Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = ooVar.s;
            ooVar.s = charSequence;
            r5 r5Var4 = ooVar.r;
            if (r5Var4 != null) {
                r5Var4.setContentDescription(charSequence);
            }
            int i2 = ooVar.t;
            ooVar.t = i2;
            r5 r5Var5 = ooVar.r;
            if (r5Var5 != null) {
                r5Var5.setAccessibilityLiveRegion(i2);
            }
            ooVar.r.setVisibility(4);
            ooVar.a(ooVar.r, 0);
        } else {
            ooVar.f();
            ooVar.g(ooVar.r, 0);
            ooVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        ooVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        ki kiVar = this.h;
        kiVar.j(i != 0 ? zo.s(kiVar.getContext(), i) : null);
        jw.W(kiVar.f, kiVar.h, kiVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        ki kiVar = this.h;
        CheckableImageButton checkableImageButton = kiVar.h;
        View.OnLongClickListener onLongClickListener = kiVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        jw.a0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ki kiVar = this.h;
        kiVar.k = onLongClickListener;
        CheckableImageButton checkableImageButton = kiVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        jw.a0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        ki kiVar = this.h;
        if (kiVar.i != colorStateList) {
            kiVar.i = colorStateList;
            jw.g(kiVar.f, kiVar.h, colorStateList, kiVar.j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        ki kiVar = this.h;
        if (kiVar.j != mode) {
            kiVar.j = mode;
            jw.g(kiVar.f, kiVar.h, kiVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        oo ooVar = this.p;
        ooVar.u = i;
        r5 r5Var = ooVar.r;
        if (r5Var != null) {
            ooVar.h.n(r5Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        oo ooVar = this.p;
        ooVar.v = colorStateList;
        r5 r5Var = ooVar.r;
        if (r5Var == null || colorStateList == null) {
            return;
        }
        r5Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        oo ooVar = this.p;
        if (isEmpty) {
            if (ooVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!ooVar.x) {
            setHelperTextEnabled(true);
        }
        ooVar.c();
        ooVar.w = charSequence;
        ooVar.y.setText(charSequence);
        int i = ooVar.n;
        if (i != 2) {
            ooVar.o = 2;
        }
        ooVar.i(i, ooVar.o, ooVar.h(ooVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        oo ooVar = this.p;
        ooVar.A = colorStateList;
        r5 r5Var = ooVar.y;
        if (r5Var == null || colorStateList == null) {
            return;
        }
        r5Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        oo ooVar = this.p;
        TextInputLayout textInputLayout = ooVar.h;
        if (ooVar.x == z) {
            return;
        }
        ooVar.c();
        if (z) {
            r5 r5Var = new r5(ooVar.g, null);
            ooVar.y = r5Var;
            r5Var.setId(com.derinko.gbini.n1casino.R.id.textinput_helper_text);
            ooVar.y.setTextAlignment(5);
            Typeface typeface = ooVar.B;
            if (typeface != null) {
                ooVar.y.setTypeface(typeface);
            }
            ooVar.y.setVisibility(4);
            ooVar.y.setImportantForAccessibility(2);
            int i = ooVar.z;
            ooVar.z = i;
            r5 r5Var2 = ooVar.y;
            if (r5Var2 != null) {
                r5Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = ooVar.A;
            ooVar.A = colorStateList;
            r5 r5Var3 = ooVar.y;
            if (r5Var3 != null && colorStateList != null) {
                r5Var3.setTextColor(colorStateList);
            }
            ooVar.a(ooVar.y, 1);
        } else {
            ooVar.c();
            int i2 = ooVar.n;
            if (i2 == 2) {
                ooVar.o = 0;
            }
            ooVar.i(i2, ooVar.o, ooVar.h(ooVar.y, ""));
            ooVar.g(ooVar.y, 1);
            ooVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        ooVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        oo ooVar = this.p;
        ooVar.z = i;
        r5 r5Var = ooVar.y;
        if (r5Var != null) {
            r5Var.setTextAppearance(i);
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
        ab abVar = this.B0;
        if (i != abVar.f0) {
            abVar.f0 = i;
            abVar.j(false);
        }
        if (i != abVar.e0) {
            abVar.e0 = i;
            abVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        ab abVar = this.B0;
        TextInputLayout textInputLayout = abVar.a;
        i50 i50Var = new i50(textInputLayout.getContext(), i);
        ColorStateList colorStateList = i50Var.k;
        if (colorStateList != null) {
            abVar.k = colorStateList;
        }
        float f = i50Var.l;
        if (f != 0.0f) {
            abVar.i = f;
        }
        ColorStateList colorStateList2 = i50Var.a;
        if (colorStateList2 != null) {
            abVar.V = colorStateList2;
        }
        abVar.T = i50Var.f;
        abVar.U = i50Var.g;
        abVar.S = i50Var.h;
        abVar.W = i50Var.j;
        f9 f9Var = abVar.z;
        if (f9Var != null) {
            f9Var.t = true;
        }
        k0 k0Var = new k0(12, abVar);
        i50Var.a();
        abVar.z = new f9(k0Var, i50Var.p);
        i50Var.b(textInputLayout.getContext(), abVar.z);
        abVar.j(false);
        this.p0 = abVar.k;
        if (this.j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            if (this.o0 == null) {
                ab abVar = this.B0;
                if (abVar.k != colorStateList) {
                    abVar.k = colorStateList;
                    abVar.j(false);
                }
            }
            this.p0 = colorStateList;
            if (this.j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(n50 n50Var) {
        this.t = n50Var;
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
        ki kiVar = this.h;
        kiVar.l.setContentDescription(i != 0 ? kiVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        ki kiVar = this.h;
        kiVar.l.setImageDrawable(i != 0 ? zo.s(kiVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        ki kiVar = this.h;
        if (z && kiVar.n != 1) {
            kiVar.h(1);
        } else if (z) {
            kiVar.getClass();
        } else {
            kiVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        ki kiVar = this.h;
        kiVar.p = colorStateList;
        jw.g(kiVar.f, kiVar.l, colorStateList, kiVar.q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        ki kiVar = this.h;
        kiVar.q = mode;
        jw.g(kiVar.f, kiVar.l, kiVar.p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z == null) {
            r5 r5Var = new r5(getContext(), null);
            this.z = r5Var;
            r5Var.setId(com.derinko.gbini.n1casino.R.id.textinput_placeholder);
            this.z.setImportantForAccessibility(1);
            this.z.setAccessibilityLiveRegion(1);
            xi f = f();
            this.C = f;
            f.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            x80.m(this.z, new js(4));
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
        r5 r5Var = this.z;
        if (r5Var != null) {
            r5Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            r5 r5Var = this.z;
            if (r5Var == null || colorStateList == null) {
                return;
            }
            r5Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u30 u30Var = this.g;
        u30Var.getClass();
        u30Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        u30Var.g.setText(charSequence);
        u30Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.g.g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(d20 d20Var) {
        ct ctVar = this.L;
        if (ctVar == null || ctVar.i() == d20Var) {
            return;
        }
        this.R = d20Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g.i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? zo.s(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        u30 u30Var = this.g;
        if (i < 0) {
            u30Var.getClass();
            t8.k("startIconSize cannot be less than 0");
        } else if (i != u30Var.l) {
            u30Var.l = i;
            CheckableImageButton checkableImageButton = u30Var.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u30 u30Var = this.g;
        CheckableImageButton checkableImageButton = u30Var.i;
        View.OnLongClickListener onLongClickListener = u30Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        jw.a0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u30 u30Var = this.g;
        u30Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = u30Var.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        jw.a0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u30 u30Var = this.g;
        u30Var.m = scaleType;
        u30Var.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u30 u30Var = this.g;
        if (u30Var.j != colorStateList) {
            u30Var.j = colorStateList;
            jw.g(u30Var.f, u30Var.i, colorStateList, u30Var.k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u30 u30Var = this.g;
        if (u30Var.k != mode) {
            u30Var.k = mode;
            jw.g(u30Var.f, u30Var.i, u30Var.j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        ki kiVar = this.h;
        kiVar.getClass();
        kiVar.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        kiVar.v.setText(charSequence);
        kiVar.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(m50 m50Var) {
        EditText editText = this.j;
        if (editText != null) {
            x80.m(editText, m50Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.B0.n(typeface);
            oo ooVar = this.p;
            if (typeface != ooVar.B) {
                ooVar.B = typeface;
                r5 r5Var = ooVar.r;
                if (r5Var != null) {
                    r5Var.setTypeface(typeface);
                }
                r5 r5Var2 = ooVar.y;
                if (r5Var2 != null) {
                    r5Var2.setTypeface(typeface);
                }
            }
            r5 r5Var3 = this.u;
            if (r5Var3 != null) {
                r5Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        r5 r5Var;
        EditText editText = this.j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = fg.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(h4.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (r5Var = this.u) != null) {
            mutate.setColorFilter(h4.c(r5Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        r5 r5Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.o0;
        ab abVar = this.B0;
        if (colorStateList2 != null) {
            abVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.o0;
            int i = this.y0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            abVar.k(ColorStateList.valueOf(i));
        } else if (o()) {
            r5 r5Var2 = this.p.r;
            abVar.k(r5Var2 != null ? r5Var2.getTextColors() : null);
        } else if (this.s && (r5Var = this.u) != null) {
            abVar.k(r5Var.getTextColors());
        } else if (z4 && (colorStateList = this.p0) != null && abVar.k != colorStateList) {
            abVar.k = colorStateList;
            abVar.j(false);
        }
        ki kiVar = this.h;
        u30 u30Var = this.g;
        if (z3 || !this.C0 || (isEnabled() && z4)) {
            if (z2 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z && this.D0) {
                    b(1.0f);
                } else {
                    abVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j;
                x(editText3 != null ? editText3.getText() : null);
                u30Var.o = false;
                u30Var.f();
                kiVar.w = false;
                kiVar.o();
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
                abVar.m(0.0f);
            }
            if (g() && !((de) this.L).M.q.isEmpty() && g()) {
                ((de) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            r5 r5Var3 = this.z;
            if (r5Var3 != null && this.y) {
                r5Var3.setText((CharSequence) null);
                w60.a(this.f, this.D);
                this.z.setVisibility(4);
            }
            u30Var.o = true;
            u30Var.f();
            kiVar.w = true;
            kiVar.o();
        }
    }

    public final void x(Editable editable) {
        ((t8) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            r5 r5Var = this.z;
            if (r5Var == null || !this.y) {
                return;
            }
            r5Var.setText((CharSequence) null);
            w60.a(frameLayout, this.D);
            this.z.setVisibility(4);
            return;
        }
        if (this.z == null || !this.y || TextUtils.isEmpty(this.x)) {
            return;
        }
        this.z.setText(this.x);
        w60.a(frameLayout, this.C);
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
        r5 r5Var;
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
        } else if (!this.s || (r5Var = this.u) == null) {
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
            this.c0 = r5Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        ki kiVar = this.h;
        TextInputLayout textInputLayout = kiVar.f;
        CheckableImageButton checkableImageButton = kiVar.l;
        TextInputLayout textInputLayout2 = kiVar.f;
        kiVar.m();
        jw.W(textInputLayout2, kiVar.h, kiVar.i);
        jw.W(textInputLayout2, checkableImageButton, kiVar.p);
        if (kiVar.b() instanceof rg) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                jw.g(textInputLayout, checkableImageButton, kiVar.p, kiVar.q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        u30 u30Var = this.g;
        jw.W(u30Var.f, u30Var.i, u30Var.j);
        if (this.U == 2) {
            int i = this.W;
            if (z && isEnabled()) {
                this.W = this.b0;
            } else {
                this.W = this.a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((de) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
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
        ki kiVar = this.h;
        TextInputLayout textInputLayout = kiVar.f;
        CheckableImageButton checkableImageButton = kiVar.l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            jw.g(textInputLayout, checkableImageButton, kiVar.p, kiVar.q);
            jw.W(textInputLayout, checkableImageButton, kiVar.p);
        }
    }
}
