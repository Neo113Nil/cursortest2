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
import defpackage.a9;
import defpackage.ai;
import defpackage.c70;
import defpackage.cb;
import defpackage.ce;
import defpackage.ci;
import defpackage.d40;
import defpackage.de;
import defpackage.dp;
import defpackage.e8;
import defpackage.e90;
import defpackage.es;
import defpackage.g;
import defpackage.g10;
import defpackage.hf;
import defpackage.i6;
import defpackage.j1;
import defpackage.j40;
import defpackage.j8;
import defpackage.jg;
import defpackage.l70;
import defpackage.ly;
import defpackage.m20;
import defpackage.n20;
import defpackage.n7;
import defpackage.nb;
import defpackage.o3;
import defpackage.o8;
import defpackage.op;
import defpackage.p50;
import defpackage.pt;
import defpackage.q1;
import defpackage.q50;
import defpackage.qi;
import defpackage.r50;
import defpackage.r6;
import defpackage.rt;
import defpackage.t50;
import defpackage.u40;
import defpackage.u50;
import defpackage.v50;
import defpackage.vg;
import defpackage.vi;
import defpackage.vw;
import defpackage.w50;
import defpackage.xd;
import defpackage.xf;
import defpackage.xs;
import defpackage.y4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final cb B0;
    public qi C;
    public boolean C0;
    public qi D;
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
    public rt L;
    public rt M;
    public StateListDrawable N;
    public boolean O;
    public rt P;
    public rt Q;
    public n20 R;
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
    public final d40 g;
    public final RectF g0;
    public final ci h;
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
    public final dp p;
    public ColorStateList p0;
    public boolean q;
    public int q0;
    public int r;
    public int r0;
    public boolean s;
    public int s0;
    public v50 t;
    public ColorStateList t0;
    public i6 u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public CharSequence x;
    public int x0;
    public boolean y;
    public int y0;
    public i6 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, com.awerser.monnit.betplay.R.attr.textInputStyle, com.awerser.monnit.betplay.R.style.Widget_Design_TextInputLayout), attributeSet, com.awerser.monnit.betplay.R.attr.textInputStyle);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new dp(this);
        this.t = new o8(26);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.k0 = new LinkedHashSet();
        cb cbVar = new cb(this);
        this.B0 = cbVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o3.a;
        cbVar.R = linearInterpolator;
        cbVar.j(false);
        cbVar.Q = linearInterpolator;
        cbVar.j(false);
        if (cbVar.g != 8388659) {
            cbVar.g = 8388659;
            cbVar.j(false);
        }
        vw.n(context2, attributeSet, com.awerser.monnit.betplay.R.attr.textInputStyle, com.awerser.monnit.betplay.R.style.Widget_Design_TextInputLayout);
        int[] iArr = ly.K;
        vw.r(context2, attributeSet, iArr, com.awerser.monnit.betplay.R.attr.textInputStyle, com.awerser.monnit.betplay.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.awerser.monnit.betplay.R.attr.textInputStyle, com.awerser.monnit.betplay.R.style.Widget_Design_TextInputLayout);
        r6 r6Var = new r6(context2, obtainStyledAttributes);
        d40 d40Var = new d40(this, r6Var);
        this.g = d40Var;
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
        this.R = n20.g(context2, attributeSet, com.awerser.monnit.betplay.R.attr.textInputStyle, com.awerser.monnit.betplay.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.awerser.monnit.betplay.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        m20 k = this.R.k();
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
        ColorStateList w = op.w(context2, r6Var, 7);
        if (w != null) {
            int defaultColor = w.getDefaultColor();
            this.u0 = defaultColor;
            this.d0 = defaultColor;
            if (w.isStateful()) {
                this.v0 = w.getColorForState(new int[]{-16842910}, -1);
                this.w0 = w.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.x0 = w.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.w0 = this.u0;
                ColorStateList q = j8.q(context2, com.awerser.monnit.betplay.R.color.mtrl_filled_background_color);
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
            ColorStateList j = r6Var.j(1);
            this.p0 = j;
            this.o0 = j;
        }
        ColorStateList w2 = op.w(context2, r6Var, 14);
        this.s0 = obtainStyledAttributes.getColor(14, 0);
        this.q0 = context2.getColor(com.awerser.monnit.betplay.R.color.mtrl_textinput_default_box_stroke_color);
        this.y0 = context2.getColor(com.awerser.monnit.betplay.R.color.mtrl_textinput_disabled_color);
        this.r0 = context2.getColor(com.awerser.monnit.betplay.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (w2 != null) {
            setBoxStrokeColorStateList(w2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(op.w(context2, r6Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = r6Var.j(24);
        this.H = r6Var.j(25);
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
            setErrorTextColor(r6Var.j(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(r6Var.j(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(r6Var.j(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(r6Var.j(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(r6Var.j(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(r6Var.j(59));
        }
        ci ciVar = new ci(this, r6Var);
        this.h = ciVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        r6Var.w();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(d40Var);
        frameLayout.addView(ciVar);
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
        int L = j8.L(editText2.getContext(), l70.S(editText2, com.awerser.monnit.betplay.R.attr.colorControlHighlight));
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            rt rtVar = this.L;
            int i2 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{j8.D(L, i2, 0.1f), i2}), rtVar, rtVar);
        }
        Context context = getContext();
        rt rtVar2 = this.L;
        int L2 = j8.L(context, l70.R(context, com.awerser.monnit.betplay.R.attr.colorSurface, "TextInputLayout"));
        rt rtVar3 = new rt(rtVar2.i());
        int D = j8.D(L, L2, 0.1f);
        rtVar3.r(new ColorStateList(iArr, new int[]{D, 0}));
        rtVar3.setTint(L2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{D, L2});
        rt rtVar4 = new rt(rtVar2.i());
        rtVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, rtVar3, rtVar4), rtVar2});
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
            o8.j("We already have an EditText, can only have one");
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
        setTextInputAccessibilityDelegate(new u50(this));
        Typeface typeface = this.j.getTypeface();
        cb cbVar = this.B0;
        cbVar.n(typeface);
        float textSize = this.j.getTextSize();
        if (cbVar.h != textSize) {
            cbVar.h = textSize;
            cbVar.j(false);
        }
        float letterSpacing = this.j.getLetterSpacing();
        if (cbVar.X != letterSpacing) {
            cbVar.X = letterSpacing;
            cbVar.j(false);
        }
        int gravity = this.j.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (cbVar.g != i3) {
            cbVar.g = i3;
            cbVar.j(false);
        }
        if (cbVar.f != gravity) {
            cbVar.f = gravity;
            cbVar.j(false);
        }
        this.z0 = editText.getMinimumHeight();
        this.j.addTextChangedListener(new t50(this, editText));
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
        ci ciVar = this.h;
        ciVar.bringToFront();
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((ai) it.next()).a(this);
        }
        ciVar.n();
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
        cb cbVar = this.B0;
        if (charSequence == null || !TextUtils.equals(cbVar.B, charSequence)) {
            cbVar.B = charSequence;
            cbVar.C = null;
            cbVar.j(false);
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
        i6 i6Var = this.z;
        if (!z) {
            if (i6Var != null) {
                i6Var.setVisibility(8);
            }
            this.z = null;
        } else if (i6Var != null) {
            this.f.addView(i6Var);
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
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_filled_edittext_font_2_0_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (op.D(getContext())) {
            EditText editText3 = this.j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_filled_edittext_font_1_3_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        cb cbVar = this.B0;
        if (cbVar.b == f) {
            return;
        }
        int i = 1;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(vw.e0(getContext(), com.awerser.monnit.betplay.R.attr.motionEasingEmphasizedInterpolator, o3.b));
            this.E0.setDuration(vw.d0(getContext(), com.awerser.monnit.betplay.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new vi(i, this));
        }
        this.E0.setFloatValues(cbVar.b, f);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i2;
        rt rtVar = this.L;
        if (rtVar == null) {
            return;
        }
        n20 i3 = rtVar.i();
        n20 n20Var = this.R;
        if (i3 != n20Var) {
            this.L.setShapeAppearanceModel(n20Var);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i2 = this.c0) != 0) {
            rt rtVar2 = this.L;
            rtVar2.g.j = i;
            rtVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            pt ptVar = rtVar2.g;
            if (ptVar.d != valueOf) {
                ptVar.d = valueOf;
                rtVar2.onStateChange(rtVar2.getState());
            }
        }
        int i4 = this.d0;
        if (this.U == 1) {
            Integer p = j8.p(getContext(), com.awerser.monnit.betplay.R.attr.colorSurface);
            i4 = nb.b(this.d0, p != null ? p.intValue() : 0);
        }
        this.d0 = i4;
        this.L.r(ColorStateList.valueOf(i4));
        rt rtVar3 = this.P;
        if (rtVar3 != null && this.Q != null) {
            if (this.W > -1 && this.c0 != 0) {
                rtVar3.r(this.j.isFocused() ? ColorStateList.valueOf(this.q0) : ColorStateList.valueOf(this.c0));
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
        rt rtVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.I;
        cb cbVar = this.B0;
        if (z) {
            TextPaint textPaint = cbVar.O;
            RectF rectF = cbVar.e;
            int save = canvas2.save();
            if (cbVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cbVar.G);
                float f = cbVar.q;
                float f2 = cbVar.r;
                float f3 = cbVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((cbVar.e0 > 1 || cbVar.f0 > 1) && !cbVar.D && cbVar.o()) {
                    float lineStart = cbVar.q - cbVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (cbVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = cbVar.H;
                        float f6 = cbVar.I;
                        float f7 = cbVar.J;
                        int i2 = cbVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, nb.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    cbVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (cbVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = cbVar.H;
                        float f9 = cbVar.I;
                        float f10 = cbVar.J;
                        int i3 = cbVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, nb.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = cbVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cbVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(cbVar.H, cbVar.I, cbVar.J, cbVar.K);
                    }
                    String trim = cbVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(cbVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    cbVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (rtVar = this.P) == null) {
            return;
        }
        rtVar.draw(canvas2);
        if (this.j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f12 = cbVar.b;
            int centerX = bounds2.centerX();
            bounds.left = o3.c(centerX, bounds2.left, f12);
            bounds.right = o3.c(centerX, bounds2.right, f12);
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
        cb cbVar = this.B0;
        if (cbVar != null) {
            cbVar.M = drawableState;
            ColorStateList colorStateList2 = cbVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cbVar.j) != null && colorStateList.isStateful())) {
                cbVar.j(false);
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
            cb cbVar = this.B0;
            if (i == 0) {
                return (int) cbVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (cbVar.f() / 2.0f);
                }
                float f = cbVar.f();
                TextPaint textPaint = cbVar.P;
                textPaint.setTextSize(cbVar.i);
                textPaint.setTypeface(cbVar.s);
                textPaint.setLetterSpacing(cbVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final qi f() {
        qi qiVar = new qi();
        qiVar.h = vw.d0(getContext(), com.awerser.monnit.betplay.R.attr.motionDurationShort2, 87);
        qiVar.i = vw.e0(getContext(), com.awerser.monnit.betplay.R.attr.motionEasingLinearInterpolator, o3.a);
        return qiVar;
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

    public rt getBoxBackground() {
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
        n20 n20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? n20Var.h.a(rectF) : n20Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        n20 n20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? n20Var.g.a(rectF) : n20Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        n20 n20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? n20Var.e.a(rectF) : n20Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        n20 n20Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? n20Var.f.a(rectF) : n20Var.e.a(rectF);
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
        i6 i6Var;
        if (this.q && this.s && (i6Var = this.u) != null) {
            return i6Var.getContentDescription();
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
        dp dpVar = this.p;
        if (dpVar.q) {
            return dpVar.p;
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
        i6 i6Var = this.p.r;
        if (i6Var != null) {
            return i6Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        dp dpVar = this.p;
        if (dpVar.x) {
            return dpVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        i6 i6Var = this.p.y;
        if (i6Var != null) {
            return i6Var.getCurrentTextColor();
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
        cb cbVar = this.B0;
        return cbVar.g(cbVar.k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.p0;
    }

    public v50 getLengthCounter() {
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

    public n20 getShapeAppearanceModel() {
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

    public final rt h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.awerser.monnit.betplay.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j;
        float popupElevation = editText instanceof es ? ((es) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.awerser.monnit.betplay.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.awerser.monnit.betplay.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        g10 g10Var = new g10();
        g10 g10Var2 = new g10();
        g10 g10Var3 = new g10();
        g10 g10Var4 = new g10();
        int i = 0;
        vg vgVar = new vg(i);
        vg vgVar2 = new vg(i);
        vg vgVar3 = new vg(i);
        vg vgVar4 = new vg(i);
        g gVar = new g(f);
        g gVar2 = new g(f);
        g gVar3 = new g(dimensionPixelOffset);
        g gVar4 = new g(dimensionPixelOffset);
        n20 n20Var = new n20();
        n20Var.a = g10Var;
        n20Var.b = g10Var2;
        n20Var.c = g10Var3;
        n20Var.d = g10Var4;
        n20Var.e = gVar;
        n20Var.f = gVar2;
        n20Var.g = gVar4;
        n20Var.h = gVar3;
        n20Var.i = vgVar;
        n20Var.j = vgVar2;
        n20Var.k = vgVar3;
        n20Var.l = vgVar4;
        EditText editText2 = this.j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof es ? ((es) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = rt.J;
            dropDownBackgroundTintList = ColorStateList.valueOf(j8.L(context, l70.R(context, com.awerser.monnit.betplay.R.attr.colorSurface, rt.class.getSimpleName())));
        }
        rt rtVar = new rt();
        rtVar.n(context);
        rtVar.r(dropDownBackgroundTintList);
        rtVar.q(popupElevation);
        rtVar.setShapeAppearanceModel(n20Var);
        pt ptVar = rtVar.g;
        if (ptVar.g == null) {
            ptVar.g = new Rect();
        }
        rtVar.g.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        rtVar.invalidateSelf();
        return rtVar;
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
            this.L = new rt(this.R);
            this.P = new rt();
            this.Q = new rt();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof de)) {
                this.L = new rt(this.R);
            } else {
                n20 n20Var = this.R;
                int i2 = de.M;
                if (n20Var == null) {
                    n20Var = new n20();
                }
                ce ceVar = new ce(n20Var, new RectF());
                de deVar = new de(ceVar);
                deVar.L = ceVar;
                this.L = deVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (op.D(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.material_font_1_3_box_collapsed_padding_top);
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
            cb cbVar = this.B0;
            boolean c = cbVar.c(cbVar.B);
            cbVar.D = c;
            Rect rect = cbVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = cbVar.a0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = cbVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (cbVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (cbVar.D) {
                        f5 = cbVar.a0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (cbVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = cbVar.a0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = cbVar.f() + rect.top;
                if (cbVar.Z != null && !cbVar.o()) {
                    StaticLayout staticLayout = cbVar.Z;
                    float lineWidth = (cbVar.i / cbVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (cbVar.D) {
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
            f2 = cbVar.a0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (cbVar.a0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = cbVar.f() + rect.top;
            if (cbVar.Z != null) {
                StaticLayout staticLayout2 = cbVar.Z;
                float lineWidth2 = (cbVar.i / cbVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (cbVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(i6 i6Var, int i) {
        try {
            i6Var.setTextAppearance(i);
            if (i6Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        i6Var.setTextAppearance(com.awerser.monnit.betplay.R.style.TextAppearance_AppCompat_Caption);
        i6Var.setTextColor(getContext().getColor(com.awerser.monnit.betplay.R.color.design_error));
    }

    public final boolean o() {
        dp dpVar = this.p;
        return (dpVar.o != 1 || dpVar.r == null || TextUtils.isEmpty(dpVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        ci ciVar = this.h;
        ciVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.H0 = false;
        if (this.j != null && this.j.getMeasuredHeight() < (max = Math.max(ciVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.j.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.j.post(new q1(14, this));
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
            hf.a(this, editText, rect);
            rt rtVar = this.P;
            if (rtVar != null) {
                int i6 = rect.bottom;
                rtVar.setBounds(rect.left, i6 - this.a0, rect.right, i6);
            }
            rt rtVar2 = this.Q;
            if (rtVar2 != null) {
                int i7 = rect.bottom;
                rtVar2.setBounds(rect.left, i7 - this.b0, rect.right, i7);
            }
            if (this.I) {
                float textSize = this.j.getTextSize();
                cb cbVar = this.B0;
                float f = cbVar.h;
                TextPaint textPaint = cbVar.P;
                if (f != textSize) {
                    cbVar.h = textSize;
                    cbVar.j(false);
                }
                int gravity = this.j.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (cbVar.g != i8) {
                    cbVar.g = i8;
                    cbVar.j(false);
                }
                if (cbVar.f != gravity) {
                    cbVar.f = gravity;
                    cbVar.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = cbVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    cbVar.N = true;
                }
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(cbVar.h);
                    textPaint.setTypeface(cbVar.v);
                    textPaint.setLetterSpacing(cbVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(cbVar.h);
                    textPaint.setTypeface(cbVar.v);
                    textPaint.setLetterSpacing(cbVar.X);
                    descent = cbVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(cbVar.h);
                        textPaint.setTypeface(cbVar.v);
                        textPaint.setLetterSpacing(cbVar.X);
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
                Rect rect4 = cbVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != cbVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    cbVar.N = true;
                    cbVar.k0 = true;
                }
                cbVar.j(false);
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
        ci ciVar = this.h;
        if (!z) {
            ciVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.z != null && (editText = this.j) != null) {
            this.z.setGravity(editText.getGravity());
            this.z.setPadding(this.j.getCompoundPaddingLeft(), this.j.getCompoundPaddingTop(), this.j.getCompoundPaddingRight(), this.j.getCompoundPaddingBottom());
        }
        ciVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j.getMeasuredWidth() - this.j.getCompoundPaddingLeft()) - this.j.getCompoundPaddingRight();
        cb cbVar = this.B0;
        TextPaint textPaint = cbVar.P;
        textPaint.setTextSize(cbVar.i);
        textPaint.setTypeface(cbVar.s);
        textPaint.setLetterSpacing(cbVar.W);
        float f2 = measuredWidth;
        cbVar.i0 = cbVar.e(cbVar.f0, textPaint, cbVar.B, (cbVar.i / cbVar.h) * f2, cbVar.D).getHeight();
        textPaint.setTextSize(cbVar.h);
        textPaint.setTypeface(cbVar.v);
        textPaint.setLetterSpacing(cbVar.X);
        cbVar.j0 = cbVar.e(cbVar.e0, textPaint, cbVar.B, f2, cbVar.D).getHeight();
        EditText editText2 = this.j;
        Rect rect = this.e0;
        hf.a(this, editText2, rect);
        Rect d = d(rect);
        int i3 = d.left;
        int i4 = d.top;
        int i5 = d.right;
        int i6 = d.bottom;
        Rect rect2 = cbVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            cbVar.N = true;
        }
        v();
        a();
        if (this.j == null) {
            return;
        }
        int i7 = cbVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = cbVar.P;
            textPaint2.setTextSize(cbVar.h);
            textPaint2.setTypeface(cbVar.v);
            textPaint2.setLetterSpacing(cbVar.X);
            f = -textPaint2.ascent();
        }
        if (this.x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z.getPaint());
            textPaint3.setTextSize(this.z.getTextSize());
            textPaint3.setTypeface(this.z.getTypeface());
            textPaint3.setLetterSpacing(this.z.getLetterSpacing());
            j40 j40Var = new j40(this.x, textPaint3, measuredWidth);
            j40Var.k = getLayoutDirection() == 1;
            j40Var.j = true;
            float lineSpacingExtra = this.z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z.getLineSpacingMultiplier();
            j40Var.g = lineSpacingExtra;
            j40Var.h = lineSpacingMultiplier;
            j40Var.m = new u40(10, this);
            r3 = (this.U == 1 ? cbVar.f() + this.V + this.i : 0.0f) + j40Var.a().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.j.getMeasuredHeight() < max) {
            this.j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w50)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w50 w50Var = (w50) parcelable;
        super.onRestoreInstanceState(w50Var.getSuperState());
        setError(w50Var.f);
        if (w50Var.g) {
            post(new n7(11, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S) {
            xd xdVar = this.R.e;
            RectF rectF = this.g0;
            float a = xdVar.a(rectF);
            float a2 = this.R.f.a(rectF);
            float a3 = this.R.h.a(rectF);
            float a4 = this.R.g.a(rectF);
            n20 n20Var = this.R;
            op opVar = n20Var.a;
            op opVar2 = n20Var.b;
            op opVar3 = n20Var.d;
            op opVar4 = n20Var.c;
            vg vgVar = new vg(0);
            vg vgVar2 = new vg(0);
            vg vgVar3 = new vg(0);
            vg vgVar4 = new vg(0);
            g gVar = new g(a2);
            g gVar2 = new g(a);
            g gVar3 = new g(a4);
            g gVar4 = new g(a3);
            n20 n20Var2 = new n20();
            n20Var2.a = opVar2;
            n20Var2.b = opVar;
            n20Var2.c = opVar3;
            n20Var2.d = opVar4;
            n20Var2.e = gVar;
            n20Var2.f = gVar2;
            n20Var2.g = gVar4;
            n20Var2.h = gVar3;
            n20Var2.i = vgVar;
            n20Var2.j = vgVar2;
            n20Var2.k = vgVar3;
            n20Var2.l = vgVar4;
            this.S = z;
            setShapeAppearanceModel(n20Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w50 w50Var = new w50(super.onSaveInstanceState());
        if (o()) {
            w50Var.f = getError();
        }
        ci ciVar = this.h;
        w50Var.g = ciVar.n != 0 && ciVar.l.i;
        return w50Var;
    }

    public final void p(Editable editable) {
        ((o8) this.t).getClass();
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
            this.u.setContentDescription(context.getString(this.s ? com.awerser.monnit.betplay.R.string.character_counter_overflowed_content_description : com.awerser.monnit.betplay.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r)));
            if (z != this.s) {
                q();
            }
            String str = e8.b;
            e8 e8Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e8.e : e8.d;
            i6 i6Var = this.u;
            String string = getContext().getString(com.awerser.monnit.betplay.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r));
            e8Var.getClass();
            q50 q50Var = r50.a;
            i6Var.setText(string != null ? e8Var.c(string).toString() : null);
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
        i6 i6Var = this.u;
        if (i6Var != null) {
            n(i6Var, this.s ? this.v : this.w);
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
            TypedValue P = l70.P(context.getTheme(), com.awerser.monnit.betplay.R.attr.colorControlActivated);
            if (P != null) {
                int i = P.resourceId;
                if (i != 0) {
                    colorStateList2 = j8.q(context, i);
                } else {
                    int i2 = P.data;
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
        ci ciVar;
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
            d40 d40Var = this.g;
            if (d40Var.getMeasuredWidth() > 0) {
                int max = Math.max(0, d40Var.getMeasuredWidth() - this.j.getPaddingLeft());
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
                    ciVar = this.h;
                    if ((!ciVar.e() || ((ciVar.n != 0 && ciVar.d()) || ciVar.u != null)) && ciVar.getMeasuredWidth() > 0) {
                        int measuredWidth = ciVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                        if (!ciVar.e()) {
                            checkableImageButton = ciVar.h;
                        } else if (ciVar.n != 0 && ciVar.d()) {
                            checkableImageButton = ciVar.l;
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
                ciVar = this.h;
                if (ciVar.e()) {
                }
                int measuredWidth2 = ciVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                if (!ciVar.e()) {
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
            ciVar = this.h;
            if (ciVar.e()) {
            }
            int measuredWidth22 = ciVar.v.getMeasuredWidth() - this.j.getPaddingRight();
            if (!ciVar.e()) {
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
        ciVar = this.h;
        if (ciVar.e()) {
        }
        int measuredWidth222 = ciVar.v.getMeasuredWidth() - this.j.getPaddingRight();
        if (!ciVar.e()) {
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
        m20 k = this.R.k();
        xd xdVar = this.R.e;
        k.a = vw.v(i);
        k.e = xdVar;
        xd xdVar2 = this.R.f;
        k.b = vw.v(i);
        k.f = xdVar2;
        xd xdVar3 = this.R.h;
        k.d = vw.v(i);
        k.h = xdVar3;
        xd xdVar4 = this.R.g;
        k.c = vw.v(i);
        k.g = xdVar4;
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
            dp dpVar = this.p;
            if (z) {
                i6 i6Var = new i6(getContext(), null);
                this.u = i6Var;
                i6Var.setId(com.awerser.monnit.betplay.R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.u.setTypeface(typeface);
                }
                this.u.setMaxLines(1);
                dpVar.a(this.u, 2);
                ((ViewGroup.MarginLayoutParams) this.u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.awerser.monnit.betplay.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.u != null) {
                    EditText editText = this.j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                dpVar.g(this.u, 2);
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
        ci ciVar = this.h;
        ciVar.g(i != 0 ? ciVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        ci ciVar = this.h;
        Drawable p = i != 0 ? l70.p(ciVar.getContext(), i) : null;
        TextInputLayout textInputLayout = ciVar.f;
        CheckableImageButton checkableImageButton = ciVar.l;
        checkableImageButton.setImageDrawable(p);
        if (p != null) {
            j8.d(textInputLayout, checkableImageButton, ciVar.p, ciVar.q);
            j8.K(textInputLayout, checkableImageButton, ciVar.p);
        }
    }

    public void setEndIconMinSize(int i) {
        ci ciVar = this.h;
        if (i < 0) {
            ciVar.getClass();
            o8.j("endIconSize cannot be less than 0");
        } else if (i != ciVar.r) {
            ciVar.r = i;
            CheckableImageButton checkableImageButton = ciVar.l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = ciVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        ci ciVar = this.h;
        CheckableImageButton checkableImageButton = ciVar.l;
        View.OnLongClickListener onLongClickListener = ciVar.t;
        checkableImageButton.setOnClickListener(onClickListener);
        j8.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ci ciVar = this.h;
        ciVar.t = onLongClickListener;
        CheckableImageButton checkableImageButton = ciVar.l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j8.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        ci ciVar = this.h;
        ciVar.s = scaleType;
        ciVar.l.setScaleType(scaleType);
        ciVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        ci ciVar = this.h;
        if (ciVar.p != colorStateList) {
            ciVar.p = colorStateList;
            j8.d(ciVar.f, ciVar.l, colorStateList, ciVar.q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        ci ciVar = this.h;
        if (ciVar.q != mode) {
            ciVar.q = mode;
            j8.d(ciVar.f, ciVar.l, ciVar.p, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h.i(z);
    }

    public void setError(CharSequence charSequence) {
        dp dpVar = this.p;
        if (!dpVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            dpVar.f();
            return;
        }
        dpVar.c();
        dpVar.p = charSequence;
        dpVar.r.setText(charSequence);
        int i = dpVar.n;
        if (i != 1) {
            dpVar.o = 1;
        }
        dpVar.i(i, dpVar.h(dpVar.r, charSequence), dpVar.o);
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        dp dpVar = this.p;
        dpVar.t = i;
        i6 i6Var = dpVar.r;
        if (i6Var != null) {
            i6Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        dp dpVar = this.p;
        dpVar.s = charSequence;
        i6 i6Var = dpVar.r;
        if (i6Var != null) {
            i6Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        dp dpVar = this.p;
        TextInputLayout textInputLayout = dpVar.h;
        if (dpVar.q == z) {
            return;
        }
        dpVar.c();
        if (z) {
            i6 i6Var = new i6(dpVar.g, null);
            dpVar.r = i6Var;
            i6Var.setId(com.awerser.monnit.betplay.R.id.textinput_error);
            dpVar.r.setTextAlignment(5);
            Typeface typeface = dpVar.B;
            if (typeface != null) {
                dpVar.r.setTypeface(typeface);
            }
            int i = dpVar.u;
            dpVar.u = i;
            i6 i6Var2 = dpVar.r;
            if (i6Var2 != null) {
                dpVar.h.n(i6Var2, i);
            }
            ColorStateList colorStateList = dpVar.v;
            dpVar.v = colorStateList;
            i6 i6Var3 = dpVar.r;
            if (i6Var3 != null && colorStateList != null) {
                i6Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = dpVar.s;
            dpVar.s = charSequence;
            i6 i6Var4 = dpVar.r;
            if (i6Var4 != null) {
                i6Var4.setContentDescription(charSequence);
            }
            int i2 = dpVar.t;
            dpVar.t = i2;
            i6 i6Var5 = dpVar.r;
            if (i6Var5 != null) {
                i6Var5.setAccessibilityLiveRegion(i2);
            }
            dpVar.r.setVisibility(4);
            dpVar.a(dpVar.r, 0);
        } else {
            dpVar.f();
            dpVar.g(dpVar.r, 0);
            dpVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        dpVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        ci ciVar = this.h;
        ciVar.j(i != 0 ? l70.p(ciVar.getContext(), i) : null);
        j8.K(ciVar.f, ciVar.h, ciVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        ci ciVar = this.h;
        CheckableImageButton checkableImageButton = ciVar.h;
        View.OnLongClickListener onLongClickListener = ciVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        j8.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ci ciVar = this.h;
        ciVar.k = onLongClickListener;
        CheckableImageButton checkableImageButton = ciVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j8.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        ci ciVar = this.h;
        if (ciVar.i != colorStateList) {
            ciVar.i = colorStateList;
            j8.d(ciVar.f, ciVar.h, colorStateList, ciVar.j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        ci ciVar = this.h;
        if (ciVar.j != mode) {
            ciVar.j = mode;
            j8.d(ciVar.f, ciVar.h, ciVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        dp dpVar = this.p;
        dpVar.u = i;
        i6 i6Var = dpVar.r;
        if (i6Var != null) {
            dpVar.h.n(i6Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        dp dpVar = this.p;
        dpVar.v = colorStateList;
        i6 i6Var = dpVar.r;
        if (i6Var == null || colorStateList == null) {
            return;
        }
        i6Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        dp dpVar = this.p;
        if (isEmpty) {
            if (dpVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!dpVar.x) {
            setHelperTextEnabled(true);
        }
        dpVar.c();
        dpVar.w = charSequence;
        dpVar.y.setText(charSequence);
        int i = dpVar.n;
        if (i != 2) {
            dpVar.o = 2;
        }
        dpVar.i(i, dpVar.h(dpVar.y, charSequence), dpVar.o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        dp dpVar = this.p;
        dpVar.A = colorStateList;
        i6 i6Var = dpVar.y;
        if (i6Var == null || colorStateList == null) {
            return;
        }
        i6Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        dp dpVar = this.p;
        TextInputLayout textInputLayout = dpVar.h;
        if (dpVar.x == z) {
            return;
        }
        dpVar.c();
        if (z) {
            i6 i6Var = new i6(dpVar.g, null);
            dpVar.y = i6Var;
            i6Var.setId(com.awerser.monnit.betplay.R.id.textinput_helper_text);
            dpVar.y.setTextAlignment(5);
            Typeface typeface = dpVar.B;
            if (typeface != null) {
                dpVar.y.setTypeface(typeface);
            }
            dpVar.y.setVisibility(4);
            dpVar.y.setImportantForAccessibility(2);
            int i = dpVar.z;
            dpVar.z = i;
            i6 i6Var2 = dpVar.y;
            if (i6Var2 != null) {
                i6Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = dpVar.A;
            dpVar.A = colorStateList;
            i6 i6Var3 = dpVar.y;
            if (i6Var3 != null && colorStateList != null) {
                i6Var3.setTextColor(colorStateList);
            }
            dpVar.a(dpVar.y, 1);
        } else {
            dpVar.c();
            int i2 = dpVar.n;
            if (i2 == 2) {
                dpVar.o = 0;
            }
            dpVar.i(i2, dpVar.h(dpVar.y, ""), dpVar.o);
            dpVar.g(dpVar.y, 1);
            dpVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        dpVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        dp dpVar = this.p;
        dpVar.z = i;
        i6 i6Var = dpVar.y;
        if (i6Var != null) {
            i6Var.setTextAppearance(i);
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
        cb cbVar = this.B0;
        if (i != cbVar.f0) {
            cbVar.f0 = i;
            cbVar.j(false);
        }
        if (i != cbVar.e0) {
            cbVar.e0 = i;
            cbVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        cb cbVar = this.B0;
        TextInputLayout textInputLayout = cbVar.a;
        p50 p50Var = new p50(textInputLayout.getContext(), i);
        ColorStateList colorStateList = p50Var.k;
        if (colorStateList != null) {
            cbVar.k = colorStateList;
        }
        float f = p50Var.l;
        if (f != 0.0f) {
            cbVar.i = f;
        }
        ColorStateList colorStateList2 = p50Var.a;
        if (colorStateList2 != null) {
            cbVar.V = colorStateList2;
        }
        cbVar.T = p50Var.f;
        cbVar.U = p50Var.g;
        cbVar.S = p50Var.h;
        cbVar.W = p50Var.j;
        a9 a9Var = cbVar.z;
        if (a9Var != null) {
            a9Var.q = true;
        }
        j1 j1Var = new j1(7, cbVar);
        p50Var.a();
        cbVar.z = new a9(j1Var, p50Var.p);
        p50Var.b(textInputLayout.getContext(), cbVar.z);
        cbVar.j(false);
        this.p0 = cbVar.k;
        if (this.j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            if (this.o0 == null) {
                cb cbVar = this.B0;
                if (cbVar.k != colorStateList) {
                    cbVar.k = colorStateList;
                    cbVar.j(false);
                }
            }
            this.p0 = colorStateList;
            if (this.j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(v50 v50Var) {
        this.t = v50Var;
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
        ci ciVar = this.h;
        ciVar.l.setContentDescription(i != 0 ? ciVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        ci ciVar = this.h;
        ciVar.l.setImageDrawable(i != 0 ? l70.p(ciVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        ci ciVar = this.h;
        if (z && ciVar.n != 1) {
            ciVar.h(1);
        } else if (z) {
            ciVar.getClass();
        } else {
            ciVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        ci ciVar = this.h;
        ciVar.p = colorStateList;
        j8.d(ciVar.f, ciVar.l, colorStateList, ciVar.q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        ci ciVar = this.h;
        ciVar.q = mode;
        j8.d(ciVar.f, ciVar.l, ciVar.p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z == null) {
            i6 i6Var = new i6(getContext(), null);
            this.z = i6Var;
            i6Var.setId(com.awerser.monnit.betplay.R.id.textinput_placeholder);
            this.z.setImportantForAccessibility(1);
            this.z.setAccessibilityLiveRegion(1);
            qi f = f();
            this.C = f;
            f.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            e90.m(this.z, new xs(4));
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
        i6 i6Var = this.z;
        if (i6Var != null) {
            i6Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            i6 i6Var = this.z;
            if (i6Var == null || colorStateList == null) {
                return;
            }
            i6Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        d40 d40Var = this.g;
        d40Var.getClass();
        d40Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        d40Var.g.setText(charSequence);
        d40Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.g.g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n20 n20Var) {
        rt rtVar = this.L;
        if (rtVar == null || rtVar.i() == n20Var) {
            return;
        }
        this.R = n20Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g.i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? l70.p(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        d40 d40Var = this.g;
        if (i < 0) {
            d40Var.getClass();
            o8.j("startIconSize cannot be less than 0");
        } else if (i != d40Var.l) {
            d40Var.l = i;
            CheckableImageButton checkableImageButton = d40Var.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        d40 d40Var = this.g;
        CheckableImageButton checkableImageButton = d40Var.i;
        View.OnLongClickListener onLongClickListener = d40Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        j8.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        d40 d40Var = this.g;
        d40Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = d40Var.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j8.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        d40 d40Var = this.g;
        d40Var.m = scaleType;
        d40Var.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        d40 d40Var = this.g;
        if (d40Var.j != colorStateList) {
            d40Var.j = colorStateList;
            j8.d(d40Var.f, d40Var.i, colorStateList, d40Var.k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        d40 d40Var = this.g;
        if (d40Var.k != mode) {
            d40Var.k = mode;
            j8.d(d40Var.f, d40Var.i, d40Var.j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        ci ciVar = this.h;
        ciVar.getClass();
        ciVar.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        ciVar.v.setText(charSequence);
        ciVar.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(u50 u50Var) {
        EditText editText = this.j;
        if (editText != null) {
            e90.m(editText, u50Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.B0.n(typeface);
            dp dpVar = this.p;
            if (typeface != dpVar.B) {
                dpVar.B = typeface;
                i6 i6Var = dpVar.r;
                if (i6Var != null) {
                    i6Var.setTypeface(typeface);
                }
                i6 i6Var2 = dpVar.y;
                if (i6Var2 != null) {
                    i6Var2.setTypeface(typeface);
                }
            }
            i6 i6Var3 = this.u;
            if (i6Var3 != null) {
                i6Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        i6 i6Var;
        EditText editText = this.j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = xf.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(y4.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (i6Var = this.u) != null) {
            mutate.setColorFilter(y4.c(i6Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        i6 i6Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.o0;
        cb cbVar = this.B0;
        if (colorStateList2 != null) {
            cbVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.o0;
            int i = this.y0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            cbVar.k(ColorStateList.valueOf(i));
        } else if (o()) {
            i6 i6Var2 = this.p.r;
            cbVar.k(i6Var2 != null ? i6Var2.getTextColors() : null);
        } else if (this.s && (i6Var = this.u) != null) {
            cbVar.k(i6Var.getTextColors());
        } else if (z4 && (colorStateList = this.p0) != null && cbVar.k != colorStateList) {
            cbVar.k = colorStateList;
            cbVar.j(false);
        }
        ci ciVar = this.h;
        d40 d40Var = this.g;
        if (z3 || !this.C0 || (isEnabled() && z4)) {
            if (z2 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z && this.D0) {
                    b(1.0f);
                } else {
                    cbVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j;
                x(editText3 != null ? editText3.getText() : null);
                d40Var.o = false;
                d40Var.f();
                ciVar.w = false;
                ciVar.o();
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
                cbVar.m(0.0f);
            }
            if (g() && !((de) this.L).L.q.isEmpty() && g()) {
                ((de) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            i6 i6Var3 = this.z;
            if (i6Var3 != null && this.y) {
                i6Var3.setText((CharSequence) null);
                c70.a(this.f, this.D);
                this.z.setVisibility(4);
            }
            d40Var.o = true;
            d40Var.f();
            ciVar.w = true;
            ciVar.o();
        }
    }

    public final void x(Editable editable) {
        ((o8) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            i6 i6Var = this.z;
            if (i6Var == null || !this.y) {
                return;
            }
            i6Var.setText((CharSequence) null);
            c70.a(frameLayout, this.D);
            this.z.setVisibility(4);
            return;
        }
        if (this.z == null || !this.y || TextUtils.isEmpty(this.x)) {
            return;
        }
        this.z.setText(this.x);
        c70.a(frameLayout, this.C);
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
        i6 i6Var;
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
        } else if (!this.s || (i6Var = this.u) == null) {
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
            this.c0 = i6Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        ci ciVar = this.h;
        TextInputLayout textInputLayout = ciVar.f;
        CheckableImageButton checkableImageButton = ciVar.l;
        TextInputLayout textInputLayout2 = ciVar.f;
        ciVar.m();
        j8.K(textInputLayout2, ciVar.h, ciVar.i);
        j8.K(textInputLayout2, checkableImageButton, ciVar.p);
        if (ciVar.b() instanceof jg) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                j8.d(textInputLayout, checkableImageButton, ciVar.p, ciVar.q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        d40 d40Var = this.g;
        j8.K(d40Var.f, d40Var.i, d40Var.j);
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
        ci ciVar = this.h;
        TextInputLayout textInputLayout = ciVar.f;
        CheckableImageButton checkableImageButton = ciVar.l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            j8.d(textInputLayout, checkableImageButton, ciVar.p, ciVar.q);
            j8.K(textInputLayout, checkableImageButton, ciVar.p);
        }
    }
}
