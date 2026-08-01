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
import defpackage.a5;
import defpackage.bi;
import defpackage.bn;
import defpackage.c70;
import defpackage.cv;
import defpackage.d50;
import defpackage.d9;
import defpackage.df0;
import defpackage.dl;
import defpackage.dn;
import defpackage.e10;
import defpackage.e9;
import defpackage.fd;
import defpackage.fd0;
import defpackage.fo;
import defpackage.g;
import defpackage.g10;
import defpackage.gd0;
import defpackage.gk0;
import defpackage.ha;
import defpackage.hm0;
import defpackage.j6;
import defpackage.kf0;
import defpackage.mv;
import defpackage.n00;
import defpackage.n9;
import defpackage.ng;
import defpackage.nj;
import defpackage.o0;
import defpackage.o3;
import defpackage.oh;
import defpackage.oh0;
import defpackage.oj0;
import defpackage.ph;
import defpackage.ph0;
import defpackage.r1;
import defpackage.rh0;
import defpackage.rk;
import defpackage.s6;
import defpackage.s9;
import defpackage.sh0;
import defpackage.sl;
import defpackage.tc;
import defpackage.th0;
import defpackage.uh0;
import defpackage.v7;
import defpackage.x8;
import defpackage.xa0;
import defpackage.xz;
import defpackage.zu;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final tc B0;
    public fo C;
    public boolean C0;
    public fo D;
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
    public g10 L;
    public g10 M;
    public StateListDrawable N;
    public boolean O;
    public g10 P;
    public g10 Q;
    public gd0 R;
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
    public final df0 g;
    public final RectF g0;
    public final dn h;
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
    public final zu p;
    public ColorStateList p0;
    public boolean q;
    public int q0;
    public int r;
    public int r0;
    public boolean s;
    public int s0;
    public th0 t;
    public ColorStateList t0;
    public j6 u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public CharSequence x;
    public int x0;
    public boolean y;
    public int y0;
    public j6 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, com.trembin.nirefon.betfury.R.attr.textInputStyle, com.trembin.nirefon.betfury.R.style.Widget_Design_TextInputLayout), attributeSet, com.trembin.nirefon.betfury.R.attr.textInputStyle);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new zu(this);
        this.t = new s9(27);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.k0 = new LinkedHashSet();
        tc tcVar = new tc(this);
        this.B0 = tcVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o3.a;
        tcVar.R = linearInterpolator;
        tcVar.j(false);
        tcVar.Q = linearInterpolator;
        tcVar.j(false);
        if (tcVar.g != 8388659) {
            tcVar.g = 8388659;
            tcVar.j(false);
        }
        d50.e(context2, attributeSet, com.trembin.nirefon.betfury.R.attr.textInputStyle, com.trembin.nirefon.betfury.R.style.Widget_Design_TextInputLayout);
        int[] iArr = c70.L;
        d50.g(context2, attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.textInputStyle, com.trembin.nirefon.betfury.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.trembin.nirefon.betfury.R.attr.textInputStyle, com.trembin.nirefon.betfury.R.style.Widget_Design_TextInputLayout);
        s6 s6Var = new s6(context2, obtainStyledAttributes);
        df0 df0Var = new df0(this, s6Var);
        this.g = df0Var;
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
        this.R = gd0.g(context2, attributeSet, com.trembin.nirefon.betfury.R.attr.textInputStyle, com.trembin.nirefon.betfury.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.trembin.nirefon.betfury.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        fd0 k = this.R.k();
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
        ColorStateList q = mv.q(context2, s6Var, 7);
        if (q != null) {
            int defaultColor = q.getDefaultColor();
            this.u0 = defaultColor;
            this.d0 = defaultColor;
            if (q.isStateful()) {
                this.v0 = q.getColorForState(new int[]{-16842910}, -1);
                this.w0 = q.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.x0 = q.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.w0 = this.u0;
                ColorStateList A = bi.A(context2, com.trembin.nirefon.betfury.R.color.mtrl_filled_background_color);
                this.v0 = A.getColorForState(new int[]{-16842910}, -1);
                this.x0 = A.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.u0 = 0;
            this.v0 = 0;
            this.w0 = 0;
            this.x0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList i = s6Var.i(1);
            this.p0 = i;
            this.o0 = i;
        }
        ColorStateList q2 = mv.q(context2, s6Var, 14);
        this.s0 = obtainStyledAttributes.getColor(14, 0);
        this.q0 = context2.getColor(com.trembin.nirefon.betfury.R.color.mtrl_textinput_default_box_stroke_color);
        this.y0 = context2.getColor(com.trembin.nirefon.betfury.R.color.mtrl_textinput_disabled_color);
        this.r0 = context2.getColor(com.trembin.nirefon.betfury.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (q2 != null) {
            setBoxStrokeColorStateList(q2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(mv.q(context2, s6Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = s6Var.i(24);
        this.H = s6Var.i(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i2 = obtainStyledAttributes.getInt(34, 1);
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
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(s6Var.i(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(s6Var.i(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(s6Var.i(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(s6Var.i(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(s6Var.i(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(s6Var.i(59));
        }
        dn dnVar = new dn(this, s6Var);
        this.h = dnVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        s6Var.v();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(df0Var);
        frameLayout.addView(dnVar);
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
        int W = bi.W(editText2.getContext(), n9.M(editText2, com.trembin.nirefon.betfury.R.attr.colorControlHighlight));
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g10 g10Var = this.L;
            int i2 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{bi.J(W, i2, 0.1f), i2}), g10Var, g10Var);
        }
        Context context = getContext();
        g10 g10Var2 = this.L;
        int W2 = bi.W(context, n9.L(context, com.trembin.nirefon.betfury.R.attr.colorSurface, "TextInputLayout"));
        g10 g10Var3 = new g10(g10Var2.i());
        int J = bi.J(W, W2, 0.1f);
        g10Var3.r(new ColorStateList(iArr, new int[]{J, 0}));
        g10Var3.setTint(W2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{J, W2});
        g10 g10Var4 = new g10(g10Var2.i());
        g10Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, g10Var3, g10Var4), g10Var2});
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
            s9.k("We already have an EditText, can only have one");
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
        setTextInputAccessibilityDelegate(new sh0(this));
        Typeface typeface = this.j.getTypeface();
        tc tcVar = this.B0;
        tcVar.n(typeface);
        float textSize = this.j.getTextSize();
        if (tcVar.h != textSize) {
            tcVar.h = textSize;
            tcVar.j(false);
        }
        float letterSpacing = this.j.getLetterSpacing();
        if (tcVar.X != letterSpacing) {
            tcVar.X = letterSpacing;
            tcVar.j(false);
        }
        int gravity = this.j.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (tcVar.g != i3) {
            tcVar.g = i3;
            tcVar.j(false);
        }
        if (tcVar.f != gravity) {
            tcVar.f = gravity;
            tcVar.j(false);
        }
        this.z0 = editText.getMinimumHeight();
        this.j.addTextChangedListener(new rh0(this, editText));
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
        dn dnVar = this.h;
        dnVar.bringToFront();
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((bn) it.next()).a(this);
        }
        dnVar.n();
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
        tc tcVar = this.B0;
        if (charSequence == null || !TextUtils.equals(tcVar.B, charSequence)) {
            tcVar.B = charSequence;
            tcVar.C = null;
            tcVar.j(false);
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
        j6 j6Var = this.z;
        if (!z) {
            if (j6Var != null) {
                j6Var.setVisibility(8);
            }
            this.z = null;
        } else if (j6Var != null) {
            this.f.addView(j6Var);
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
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_filled_edittext_font_2_0_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (mv.A(getContext())) {
            EditText editText3 = this.j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_filled_edittext_font_1_3_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        tc tcVar = this.B0;
        if (tcVar.b == f) {
            return;
        }
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(d50.S(getContext(), com.trembin.nirefon.betfury.R.attr.motionEasingEmphasizedInterpolator, o3.b));
            this.E0.setDuration(d50.R(getContext(), com.trembin.nirefon.betfury.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new d9(3, this));
        }
        this.E0.setFloatValues(tcVar.b, f);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i2;
        g10 g10Var = this.L;
        if (g10Var == null) {
            return;
        }
        gd0 i3 = g10Var.i();
        gd0 gd0Var = this.R;
        if (i3 != gd0Var) {
            this.L.setShapeAppearanceModel(gd0Var);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i2 = this.c0) != 0) {
            g10 g10Var2 = this.L;
            g10Var2.g.j = i;
            g10Var2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            e10 e10Var = g10Var2.g;
            if (e10Var.d != valueOf) {
                e10Var.d = valueOf;
                g10Var2.onStateChange(g10Var2.getState());
            }
        }
        int i4 = this.d0;
        if (this.U == 1) {
            Integer z = bi.z(getContext(), com.trembin.nirefon.betfury.R.attr.colorSurface);
            i4 = fd.b(this.d0, z != null ? z.intValue() : 0);
        }
        this.d0 = i4;
        this.L.r(ColorStateList.valueOf(i4));
        g10 g10Var3 = this.P;
        if (g10Var3 != null && this.Q != null) {
            if (this.W > -1 && this.c0 != 0) {
                g10Var3.r(this.j.isFocused() ? ColorStateList.valueOf(this.q0) : ColorStateList.valueOf(this.c0));
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
        g10 g10Var;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.I;
        tc tcVar = this.B0;
        if (z) {
            TextPaint textPaint = tcVar.O;
            RectF rectF = tcVar.e;
            int save = canvas2.save();
            if (tcVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(tcVar.G);
                float f = tcVar.q;
                float f2 = tcVar.r;
                float f3 = tcVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((tcVar.e0 > 1 || tcVar.f0 > 1) && !tcVar.D && tcVar.o()) {
                    float lineStart = tcVar.q - tcVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (tcVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = tcVar.H;
                        float f6 = tcVar.I;
                        float f7 = tcVar.J;
                        int i2 = tcVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, fd.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    tcVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (tcVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = tcVar.H;
                        float f9 = tcVar.I;
                        float f10 = tcVar.J;
                        int i3 = tcVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, fd.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = tcVar.Z.getLineBaseline(0);
                    CharSequence charSequence = tcVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(tcVar.H, tcVar.I, tcVar.J, tcVar.K);
                    }
                    String trim = tcVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(tcVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    tcVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (g10Var = this.P) == null) {
            return;
        }
        g10Var.draw(canvas2);
        if (this.j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f12 = tcVar.b;
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
        tc tcVar = this.B0;
        if (tcVar != null) {
            tcVar.M = drawableState;
            ColorStateList colorStateList2 = tcVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = tcVar.j) != null && colorStateList.isStateful())) {
                tcVar.j(false);
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
            tc tcVar = this.B0;
            if (i == 0) {
                return (int) tcVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (tcVar.f() / 2.0f);
                }
                float f = tcVar.f();
                TextPaint textPaint = tcVar.P;
                textPaint.setTextSize(tcVar.i);
                textPaint.setTypeface(tcVar.s);
                textPaint.setLetterSpacing(tcVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final fo f() {
        fo foVar = new fo();
        foVar.h = d50.R(getContext(), com.trembin.nirefon.betfury.R.attr.motionDurationShort2, 87);
        foVar.i = d50.S(getContext(), com.trembin.nirefon.betfury.R.attr.motionEasingLinearInterpolator, o3.a);
        return foVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof ph);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public g10 getBoxBackground() {
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
        gd0 gd0Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? gd0Var.h.a(rectF) : gd0Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        gd0 gd0Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? gd0Var.g.a(rectF) : gd0Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        gd0 gd0Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? gd0Var.e.a(rectF) : gd0Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        gd0 gd0Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? gd0Var.f.a(rectF) : gd0Var.e.a(rectF);
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
        j6 j6Var;
        if (this.q && this.s && (j6Var = this.u) != null) {
            return j6Var.getContentDescription();
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
        zu zuVar = this.p;
        if (zuVar.q) {
            return zuVar.p;
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
        j6 j6Var = this.p.r;
        if (j6Var != null) {
            return j6Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        zu zuVar = this.p;
        if (zuVar.x) {
            return zuVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        j6 j6Var = this.p.y;
        if (j6Var != null) {
            return j6Var.getCurrentTextColor();
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
        tc tcVar = this.B0;
        return tcVar.g(tcVar.k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.p0;
    }

    public th0 getLengthCounter() {
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

    public gd0 getShapeAppearanceModel() {
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

    public final g10 h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.trembin.nirefon.betfury.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j;
        float popupElevation = editText instanceof xz ? ((xz) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.trembin.nirefon.betfury.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.trembin.nirefon.betfury.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        xa0 xa0Var = new xa0();
        xa0 xa0Var2 = new xa0();
        xa0 xa0Var3 = new xa0();
        xa0 xa0Var4 = new xa0();
        sl slVar = new sl();
        sl slVar2 = new sl();
        sl slVar3 = new sl();
        sl slVar4 = new sl();
        g gVar = new g(f);
        g gVar2 = new g(f);
        g gVar3 = new g(dimensionPixelOffset);
        g gVar4 = new g(dimensionPixelOffset);
        gd0 gd0Var = new gd0();
        gd0Var.a = xa0Var;
        gd0Var.b = xa0Var2;
        gd0Var.c = xa0Var3;
        gd0Var.d = xa0Var4;
        gd0Var.e = gVar;
        gd0Var.f = gVar2;
        gd0Var.g = gVar4;
        gd0Var.h = gVar3;
        gd0Var.i = slVar;
        gd0Var.j = slVar2;
        gd0Var.k = slVar3;
        gd0Var.l = slVar4;
        EditText editText2 = this.j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof xz ? ((xz) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g10.K;
            dropDownBackgroundTintList = ColorStateList.valueOf(bi.W(context, n9.L(context, com.trembin.nirefon.betfury.R.attr.colorSurface, g10.class.getSimpleName())));
        }
        g10 g10Var = new g10();
        g10Var.n(context);
        g10Var.r(dropDownBackgroundTintList);
        g10Var.q(popupElevation);
        g10Var.setShapeAppearanceModel(gd0Var);
        e10 e10Var = g10Var.g;
        if (e10Var.g == null) {
            e10Var.g = new Rect();
        }
        g10Var.g.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        g10Var.invalidateSelf();
        return g10Var;
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
            this.L = new g10(this.R);
            this.P = new g10();
            this.Q = new g10();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof ph)) {
                this.L = new g10(this.R);
            } else {
                gd0 gd0Var = this.R;
                int i2 = ph.N;
                if (gd0Var == null) {
                    gd0Var = new gd0();
                }
                oh ohVar = new oh(gd0Var, new RectF());
                ph phVar = new ph(ohVar);
                phVar.M = ohVar;
                this.L = phVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (mv.A(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.material_font_1_3_box_collapsed_padding_top);
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
            tc tcVar = this.B0;
            boolean c = tcVar.c(tcVar.B);
            tcVar.D = c;
            Rect rect = tcVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = tcVar.a0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = tcVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (tcVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (tcVar.D) {
                        f5 = tcVar.a0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (tcVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = tcVar.a0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = tcVar.f() + rect.top;
                if (tcVar.Z != null && !tcVar.o()) {
                    StaticLayout staticLayout = tcVar.Z;
                    float lineWidth = (tcVar.i / tcVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (tcVar.D) {
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
                ph phVar = (ph) this.L;
                phVar.getClass();
                phVar.z(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = tcVar.a0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (tcVar.a0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = tcVar.f() + rect.top;
            if (tcVar.Z != null) {
                StaticLayout staticLayout2 = tcVar.Z;
                float lineWidth2 = (tcVar.i / tcVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (tcVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(j6 j6Var, int i) {
        try {
            j6Var.setTextAppearance(i);
            if (j6Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j6Var.setTextAppearance(com.trembin.nirefon.betfury.R.style.TextAppearance_AppCompat_Caption);
        j6Var.setTextColor(getContext().getColor(com.trembin.nirefon.betfury.R.color.design_error));
    }

    public final boolean o() {
        zu zuVar = this.p;
        return (zuVar.o != 1 || zuVar.r == null || TextUtils.isEmpty(zuVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        dn dnVar = this.h;
        dnVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.H0 = false;
        if (this.j != null && this.j.getMeasuredHeight() < (max = Math.max(dnVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.j.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.j.post(new r1(15, this));
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
            nj.a(this, editText, rect);
            g10 g10Var = this.P;
            if (g10Var != null) {
                int i6 = rect.bottom;
                g10Var.setBounds(rect.left, i6 - this.a0, rect.right, i6);
            }
            g10 g10Var2 = this.Q;
            if (g10Var2 != null) {
                int i7 = rect.bottom;
                g10Var2.setBounds(rect.left, i7 - this.b0, rect.right, i7);
            }
            if (this.I) {
                float textSize = this.j.getTextSize();
                tc tcVar = this.B0;
                float f = tcVar.h;
                TextPaint textPaint = tcVar.P;
                if (f != textSize) {
                    tcVar.h = textSize;
                    tcVar.j(false);
                }
                int gravity = this.j.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (tcVar.g != i8) {
                    tcVar.g = i8;
                    tcVar.j(false);
                }
                if (tcVar.f != gravity) {
                    tcVar.f = gravity;
                    tcVar.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = tcVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    tcVar.N = true;
                }
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(tcVar.h);
                    textPaint.setTypeface(tcVar.v);
                    textPaint.setLetterSpacing(tcVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(tcVar.h);
                    textPaint.setTypeface(tcVar.v);
                    textPaint.setLetterSpacing(tcVar.X);
                    descent = tcVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(tcVar.h);
                        textPaint.setTypeface(tcVar.v);
                        textPaint.setLetterSpacing(tcVar.X);
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
                Rect rect4 = tcVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != tcVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    tcVar.N = true;
                    tcVar.k0 = true;
                }
                tcVar.j(false);
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
        dn dnVar = this.h;
        if (!z) {
            dnVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.z != null && (editText = this.j) != null) {
            this.z.setGravity(editText.getGravity());
            this.z.setPadding(this.j.getCompoundPaddingLeft(), this.j.getCompoundPaddingTop(), this.j.getCompoundPaddingRight(), this.j.getCompoundPaddingBottom());
        }
        dnVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j.getMeasuredWidth() - this.j.getCompoundPaddingLeft()) - this.j.getCompoundPaddingRight();
        tc tcVar = this.B0;
        TextPaint textPaint = tcVar.P;
        textPaint.setTextSize(tcVar.i);
        textPaint.setTypeface(tcVar.s);
        textPaint.setLetterSpacing(tcVar.W);
        float f2 = measuredWidth;
        tcVar.i0 = tcVar.e(tcVar.f0, textPaint, tcVar.B, (tcVar.i / tcVar.h) * f2, tcVar.D).getHeight();
        textPaint.setTextSize(tcVar.h);
        textPaint.setTypeface(tcVar.v);
        textPaint.setLetterSpacing(tcVar.X);
        tcVar.j0 = tcVar.e(tcVar.e0, textPaint, tcVar.B, f2, tcVar.D).getHeight();
        EditText editText2 = this.j;
        Rect rect = this.e0;
        nj.a(this, editText2, rect);
        Rect d = d(rect);
        int i3 = d.left;
        int i4 = d.top;
        int i5 = d.right;
        int i6 = d.bottom;
        Rect rect2 = tcVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            tcVar.N = true;
        }
        v();
        a();
        if (this.j == null) {
            return;
        }
        int i7 = tcVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = tcVar.P;
            textPaint2.setTextSize(tcVar.h);
            textPaint2.setTypeface(tcVar.v);
            textPaint2.setLetterSpacing(tcVar.X);
            f = -textPaint2.ascent();
        }
        if (this.x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z.getPaint());
            textPaint3.setTextSize(this.z.getTextSize());
            textPaint3.setTypeface(this.z.getTypeface());
            textPaint3.setLetterSpacing(this.z.getLetterSpacing());
            kf0 kf0Var = new kf0(this.x, textPaint3, measuredWidth);
            kf0Var.k = getLayoutDirection() == 1;
            kf0Var.j = true;
            float lineSpacingExtra = this.z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z.getLineSpacingMultiplier();
            kf0Var.g = lineSpacingExtra;
            kf0Var.h = lineSpacingMultiplier;
            kf0Var.m = new cv(this);
            r3 = (this.U == 1 ? tcVar.f() + this.V + this.i : 0.0f) + kf0Var.a().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.j.getMeasuredHeight() < max) {
            this.j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof uh0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        uh0 uh0Var = (uh0) parcelable;
        super.onRestoreInstanceState(uh0Var.f);
        setError(uh0Var.h);
        if (uh0Var.i) {
            post(new v7(11, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S) {
            ng ngVar = this.R.e;
            RectF rectF = this.g0;
            float a = ngVar.a(rectF);
            float a2 = this.R.f.a(rectF);
            float a3 = this.R.h.a(rectF);
            float a4 = this.R.g.a(rectF);
            gd0 gd0Var = this.R;
            n9 n9Var = gd0Var.a;
            n9 n9Var2 = gd0Var.b;
            n9 n9Var3 = gd0Var.d;
            n9 n9Var4 = gd0Var.c;
            sl slVar = new sl();
            sl slVar2 = new sl();
            sl slVar3 = new sl();
            sl slVar4 = new sl();
            g gVar = new g(a2);
            g gVar2 = new g(a);
            g gVar3 = new g(a4);
            g gVar4 = new g(a3);
            gd0 gd0Var2 = new gd0();
            gd0Var2.a = n9Var2;
            gd0Var2.b = n9Var;
            gd0Var2.c = n9Var3;
            gd0Var2.d = n9Var4;
            gd0Var2.e = gVar;
            gd0Var2.f = gVar2;
            gd0Var2.g = gVar4;
            gd0Var2.h = gVar3;
            gd0Var2.i = slVar;
            gd0Var2.j = slVar2;
            gd0Var2.k = slVar3;
            gd0Var2.l = slVar4;
            this.S = z;
            setShapeAppearanceModel(gd0Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        uh0 uh0Var = new uh0(super.onSaveInstanceState());
        if (o()) {
            uh0Var.h = getError();
        }
        dn dnVar = this.h;
        uh0Var.i = dnVar.n != 0 && dnVar.l.i;
        return uh0Var;
    }

    public final void p(Editable editable) {
        ((s9) this.t).getClass();
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
            this.u.setContentDescription(context.getString(this.s ? com.trembin.nirefon.betfury.R.string.character_counter_overflowed_content_description : com.trembin.nirefon.betfury.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r)));
            if (z != this.s) {
                q();
            }
            String str = x8.b;
            x8 x8Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? x8.e : x8.d;
            j6 j6Var = this.u;
            String string = getContext().getString(com.trembin.nirefon.betfury.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r));
            x8Var.getClass();
            e9 e9Var = ph0.a;
            j6Var.setText(string != null ? x8Var.c(string).toString() : null);
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
        j6 j6Var = this.u;
        if (j6Var != null) {
            n(j6Var, this.s ? this.v : this.w);
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
            TypedValue J = n9.J(context.getTheme(), com.trembin.nirefon.betfury.R.attr.colorControlActivated);
            if (J != null) {
                int i = J.resourceId;
                if (i != 0) {
                    colorStateList2 = bi.A(context, i);
                } else {
                    int i2 = J.data;
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
        dn dnVar;
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
            df0 df0Var = this.g;
            if (df0Var.getMeasuredWidth() > 0) {
                int max = Math.max(0, df0Var.getMeasuredWidth() - this.j.getPaddingLeft());
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
                    dnVar = this.h;
                    if ((!dnVar.e() || ((dnVar.n != 0 && dnVar.d()) || dnVar.u != null)) && dnVar.getMeasuredWidth() > 0) {
                        int measuredWidth = dnVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                        if (!dnVar.e()) {
                            checkableImageButton = dnVar.h;
                        } else if (dnVar.n != 0 && dnVar.d()) {
                            checkableImageButton = dnVar.l;
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
                dnVar = this.h;
                if (dnVar.e()) {
                }
                int measuredWidth2 = dnVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                if (!dnVar.e()) {
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
            dnVar = this.h;
            if (dnVar.e()) {
            }
            int measuredWidth22 = dnVar.v.getMeasuredWidth() - this.j.getPaddingRight();
            if (!dnVar.e()) {
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
        dnVar = this.h;
        if (dnVar.e()) {
        }
        int measuredWidth222 = dnVar.v.getMeasuredWidth() - this.j.getPaddingRight();
        if (!dnVar.e()) {
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
        fd0 k = this.R.k();
        ng ngVar = this.R.e;
        k.a = d50.k(i);
        k.e = ngVar;
        ng ngVar2 = this.R.f;
        k.b = d50.k(i);
        k.f = ngVar2;
        ng ngVar3 = this.R.h;
        k.d = d50.k(i);
        k.h = ngVar3;
        ng ngVar4 = this.R.g;
        k.c = d50.k(i);
        k.g = ngVar4;
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
            zu zuVar = this.p;
            if (z) {
                j6 j6Var = new j6(getContext(), null);
                this.u = j6Var;
                j6Var.setId(com.trembin.nirefon.betfury.R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.u.setTypeface(typeface);
                }
                this.u.setMaxLines(1);
                zuVar.a(this.u, 2);
                ((ViewGroup.MarginLayoutParams) this.u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.trembin.nirefon.betfury.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.u != null) {
                    EditText editText = this.j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                zuVar.g(this.u, 2);
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
        dn dnVar = this.h;
        dnVar.g(i != 0 ? dnVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        dn dnVar = this.h;
        Drawable v = i != 0 ? d50.v(dnVar.getContext(), i) : null;
        TextInputLayout textInputLayout = dnVar.f;
        CheckableImageButton checkableImageButton = dnVar.l;
        checkableImageButton.setImageDrawable(v);
        if (v != null) {
            gk0.a(textInputLayout, checkableImageButton, dnVar.p, dnVar.q);
            gk0.I(textInputLayout, checkableImageButton, dnVar.p);
        }
    }

    public void setEndIconMinSize(int i) {
        dn dnVar = this.h;
        if (i < 0) {
            dnVar.getClass();
            s9.k("endIconSize cannot be less than 0");
        } else if (i != dnVar.r) {
            dnVar.r = i;
            CheckableImageButton checkableImageButton = dnVar.l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = dnVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        dn dnVar = this.h;
        CheckableImageButton checkableImageButton = dnVar.l;
        View.OnLongClickListener onLongClickListener = dnVar.t;
        checkableImageButton.setOnClickListener(onClickListener);
        gk0.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        dn dnVar = this.h;
        dnVar.t = onLongClickListener;
        CheckableImageButton checkableImageButton = dnVar.l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gk0.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        dn dnVar = this.h;
        dnVar.s = scaleType;
        dnVar.l.setScaleType(scaleType);
        dnVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        dn dnVar = this.h;
        if (dnVar.p != colorStateList) {
            dnVar.p = colorStateList;
            gk0.a(dnVar.f, dnVar.l, colorStateList, dnVar.q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        dn dnVar = this.h;
        if (dnVar.q != mode) {
            dnVar.q = mode;
            gk0.a(dnVar.f, dnVar.l, dnVar.p, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h.i(z);
    }

    public void setError(CharSequence charSequence) {
        zu zuVar = this.p;
        if (!zuVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            zuVar.f();
            return;
        }
        zuVar.c();
        zuVar.p = charSequence;
        zuVar.r.setText(charSequence);
        int i = zuVar.n;
        if (i != 1) {
            zuVar.o = 1;
        }
        zuVar.i(i, zuVar.o, zuVar.h(zuVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        zu zuVar = this.p;
        zuVar.t = i;
        j6 j6Var = zuVar.r;
        if (j6Var != null) {
            j6Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        zu zuVar = this.p;
        zuVar.s = charSequence;
        j6 j6Var = zuVar.r;
        if (j6Var != null) {
            j6Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        zu zuVar = this.p;
        TextInputLayout textInputLayout = zuVar.h;
        if (zuVar.q == z) {
            return;
        }
        zuVar.c();
        if (z) {
            j6 j6Var = new j6(zuVar.g, null);
            zuVar.r = j6Var;
            j6Var.setId(com.trembin.nirefon.betfury.R.id.textinput_error);
            zuVar.r.setTextAlignment(5);
            Typeface typeface = zuVar.B;
            if (typeface != null) {
                zuVar.r.setTypeface(typeface);
            }
            int i = zuVar.u;
            zuVar.u = i;
            j6 j6Var2 = zuVar.r;
            if (j6Var2 != null) {
                zuVar.h.n(j6Var2, i);
            }
            ColorStateList colorStateList = zuVar.v;
            zuVar.v = colorStateList;
            j6 j6Var3 = zuVar.r;
            if (j6Var3 != null && colorStateList != null) {
                j6Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = zuVar.s;
            zuVar.s = charSequence;
            j6 j6Var4 = zuVar.r;
            if (j6Var4 != null) {
                j6Var4.setContentDescription(charSequence);
            }
            int i2 = zuVar.t;
            zuVar.t = i2;
            j6 j6Var5 = zuVar.r;
            if (j6Var5 != null) {
                j6Var5.setAccessibilityLiveRegion(i2);
            }
            zuVar.r.setVisibility(4);
            zuVar.a(zuVar.r, 0);
        } else {
            zuVar.f();
            zuVar.g(zuVar.r, 0);
            zuVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        zuVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        dn dnVar = this.h;
        dnVar.j(i != 0 ? d50.v(dnVar.getContext(), i) : null);
        gk0.I(dnVar.f, dnVar.h, dnVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        dn dnVar = this.h;
        CheckableImageButton checkableImageButton = dnVar.h;
        View.OnLongClickListener onLongClickListener = dnVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        gk0.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        dn dnVar = this.h;
        dnVar.k = onLongClickListener;
        CheckableImageButton checkableImageButton = dnVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gk0.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        dn dnVar = this.h;
        if (dnVar.i != colorStateList) {
            dnVar.i = colorStateList;
            gk0.a(dnVar.f, dnVar.h, colorStateList, dnVar.j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        dn dnVar = this.h;
        if (dnVar.j != mode) {
            dnVar.j = mode;
            gk0.a(dnVar.f, dnVar.h, dnVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        zu zuVar = this.p;
        zuVar.u = i;
        j6 j6Var = zuVar.r;
        if (j6Var != null) {
            zuVar.h.n(j6Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        zu zuVar = this.p;
        zuVar.v = colorStateList;
        j6 j6Var = zuVar.r;
        if (j6Var == null || colorStateList == null) {
            return;
        }
        j6Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        zu zuVar = this.p;
        if (isEmpty) {
            if (zuVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!zuVar.x) {
            setHelperTextEnabled(true);
        }
        zuVar.c();
        zuVar.w = charSequence;
        zuVar.y.setText(charSequence);
        int i = zuVar.n;
        if (i != 2) {
            zuVar.o = 2;
        }
        zuVar.i(i, zuVar.o, zuVar.h(zuVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        zu zuVar = this.p;
        zuVar.A = colorStateList;
        j6 j6Var = zuVar.y;
        if (j6Var == null || colorStateList == null) {
            return;
        }
        j6Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        zu zuVar = this.p;
        TextInputLayout textInputLayout = zuVar.h;
        if (zuVar.x == z) {
            return;
        }
        zuVar.c();
        if (z) {
            j6 j6Var = new j6(zuVar.g, null);
            zuVar.y = j6Var;
            j6Var.setId(com.trembin.nirefon.betfury.R.id.textinput_helper_text);
            zuVar.y.setTextAlignment(5);
            Typeface typeface = zuVar.B;
            if (typeface != null) {
                zuVar.y.setTypeface(typeface);
            }
            zuVar.y.setVisibility(4);
            zuVar.y.setImportantForAccessibility(2);
            int i = zuVar.z;
            zuVar.z = i;
            j6 j6Var2 = zuVar.y;
            if (j6Var2 != null) {
                j6Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = zuVar.A;
            zuVar.A = colorStateList;
            j6 j6Var3 = zuVar.y;
            if (j6Var3 != null && colorStateList != null) {
                j6Var3.setTextColor(colorStateList);
            }
            zuVar.a(zuVar.y, 1);
        } else {
            zuVar.c();
            int i2 = zuVar.n;
            if (i2 == 2) {
                zuVar.o = 0;
            }
            zuVar.i(i2, zuVar.o, zuVar.h(zuVar.y, ""));
            zuVar.g(zuVar.y, 1);
            zuVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        zuVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        zu zuVar = this.p;
        zuVar.z = i;
        j6 j6Var = zuVar.y;
        if (j6Var != null) {
            j6Var.setTextAppearance(i);
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
        tc tcVar = this.B0;
        if (i != tcVar.f0) {
            tcVar.f0 = i;
            tcVar.j(false);
        }
        if (i != tcVar.e0) {
            tcVar.e0 = i;
            tcVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        tc tcVar = this.B0;
        TextInputLayout textInputLayout = tcVar.a;
        oh0 oh0Var = new oh0(textInputLayout.getContext(), i);
        ColorStateList colorStateList = oh0Var.k;
        if (colorStateList != null) {
            tcVar.k = colorStateList;
        }
        float f = oh0Var.l;
        if (f != 0.0f) {
            tcVar.i = f;
        }
        ColorStateList colorStateList2 = oh0Var.a;
        if (colorStateList2 != null) {
            tcVar.V = colorStateList2;
        }
        tcVar.T = oh0Var.f;
        tcVar.U = oh0Var.g;
        tcVar.S = oh0Var.h;
        tcVar.W = oh0Var.j;
        ha haVar = tcVar.z;
        if (haVar != null) {
            haVar.c = true;
        }
        o0 o0Var = new o0(15, tcVar);
        oh0Var.a();
        tcVar.z = new ha(o0Var, oh0Var.p);
        oh0Var.b(textInputLayout.getContext(), tcVar.z);
        tcVar.j(false);
        this.p0 = tcVar.k;
        if (this.j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            if (this.o0 == null) {
                tc tcVar = this.B0;
                if (tcVar.k != colorStateList) {
                    tcVar.k = colorStateList;
                    tcVar.j(false);
                }
            }
            this.p0 = colorStateList;
            if (this.j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(th0 th0Var) {
        this.t = th0Var;
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
        dn dnVar = this.h;
        dnVar.l.setContentDescription(i != 0 ? dnVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        dn dnVar = this.h;
        dnVar.l.setImageDrawable(i != 0 ? d50.v(dnVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        dn dnVar = this.h;
        if (z && dnVar.n != 1) {
            dnVar.h(1);
        } else if (z) {
            dnVar.getClass();
        } else {
            dnVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        dn dnVar = this.h;
        dnVar.p = colorStateList;
        gk0.a(dnVar.f, dnVar.l, colorStateList, dnVar.q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        dn dnVar = this.h;
        dnVar.q = mode;
        gk0.a(dnVar.f, dnVar.l, dnVar.p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z == null) {
            j6 j6Var = new j6(getContext(), null);
            this.z = j6Var;
            j6Var.setId(com.trembin.nirefon.betfury.R.id.textinput_placeholder);
            this.z.setImportantForAccessibility(1);
            this.z.setAccessibilityLiveRegion(1);
            fo f = f();
            this.C = f;
            f.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            hm0.m(this.z, new n00(4));
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
        j6 j6Var = this.z;
        if (j6Var != null) {
            j6Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            j6 j6Var = this.z;
            if (j6Var == null || colorStateList == null) {
                return;
            }
            j6Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        df0 df0Var = this.g;
        df0Var.getClass();
        df0Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        df0Var.g.setText(charSequence);
        df0Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.g.g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(gd0 gd0Var) {
        g10 g10Var = this.L;
        if (g10Var == null || g10Var.i() == gd0Var) {
            return;
        }
        this.R = gd0Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g.i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? d50.v(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        df0 df0Var = this.g;
        if (i < 0) {
            df0Var.getClass();
            s9.k("startIconSize cannot be less than 0");
        } else if (i != df0Var.l) {
            df0Var.l = i;
            CheckableImageButton checkableImageButton = df0Var.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        df0 df0Var = this.g;
        CheckableImageButton checkableImageButton = df0Var.i;
        View.OnLongClickListener onLongClickListener = df0Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        gk0.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        df0 df0Var = this.g;
        df0Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = df0Var.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gk0.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        df0 df0Var = this.g;
        df0Var.m = scaleType;
        df0Var.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        df0 df0Var = this.g;
        if (df0Var.j != colorStateList) {
            df0Var.j = colorStateList;
            gk0.a(df0Var.f, df0Var.i, colorStateList, df0Var.k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        df0 df0Var = this.g;
        if (df0Var.k != mode) {
            df0Var.k = mode;
            gk0.a(df0Var.f, df0Var.i, df0Var.j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        dn dnVar = this.h;
        dnVar.getClass();
        dnVar.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        dnVar.v.setText(charSequence);
        dnVar.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(sh0 sh0Var) {
        EditText editText = this.j;
        if (editText != null) {
            hm0.m(editText, sh0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.B0.n(typeface);
            zu zuVar = this.p;
            if (typeface != zuVar.B) {
                zuVar.B = typeface;
                j6 j6Var = zuVar.r;
                if (j6Var != null) {
                    j6Var.setTypeface(typeface);
                }
                j6 j6Var2 = zuVar.y;
                if (j6Var2 != null) {
                    j6Var2.setTypeface(typeface);
                }
            }
            j6 j6Var3 = this.u;
            if (j6Var3 != null) {
                j6Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        j6 j6Var;
        EditText editText = this.j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = rk.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(a5.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (j6Var = this.u) != null) {
            mutate.setColorFilter(a5.c(j6Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        j6 j6Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.o0;
        tc tcVar = this.B0;
        if (colorStateList2 != null) {
            tcVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.o0;
            int i = this.y0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            tcVar.k(ColorStateList.valueOf(i));
        } else if (o()) {
            j6 j6Var2 = this.p.r;
            tcVar.k(j6Var2 != null ? j6Var2.getTextColors() : null);
        } else if (this.s && (j6Var = this.u) != null) {
            tcVar.k(j6Var.getTextColors());
        } else if (z4 && (colorStateList = this.p0) != null && tcVar.k != colorStateList) {
            tcVar.k = colorStateList;
            tcVar.j(false);
        }
        dn dnVar = this.h;
        df0 df0Var = this.g;
        if (z3 || !this.C0 || (isEnabled() && z4)) {
            if (z2 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z && this.D0) {
                    b(1.0f);
                } else {
                    tcVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j;
                x(editText3 != null ? editText3.getText() : null);
                df0Var.o = false;
                df0Var.f();
                dnVar.w = false;
                dnVar.o();
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
                tcVar.m(0.0f);
            }
            if (g() && !((ph) this.L).M.q.isEmpty() && g()) {
                ((ph) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            j6 j6Var3 = this.z;
            if (j6Var3 != null && this.y) {
                j6Var3.setText((CharSequence) null);
                oj0.a(this.f, this.D);
                this.z.setVisibility(4);
            }
            df0Var.o = true;
            df0Var.f();
            dnVar.w = true;
            dnVar.o();
        }
    }

    public final void x(Editable editable) {
        ((s9) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            j6 j6Var = this.z;
            if (j6Var == null || !this.y) {
                return;
            }
            j6Var.setText((CharSequence) null);
            oj0.a(frameLayout, this.D);
            this.z.setVisibility(4);
            return;
        }
        if (this.z == null || !this.y || TextUtils.isEmpty(this.x)) {
            return;
        }
        this.z.setText(this.x);
        oj0.a(frameLayout, this.C);
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
        j6 j6Var;
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
        } else if (!this.s || (j6Var = this.u) == null) {
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
            this.c0 = j6Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        dn dnVar = this.h;
        TextInputLayout textInputLayout = dnVar.f;
        CheckableImageButton checkableImageButton = dnVar.l;
        TextInputLayout textInputLayout2 = dnVar.f;
        dnVar.m();
        gk0.I(textInputLayout2, dnVar.h, dnVar.i);
        gk0.I(textInputLayout2, checkableImageButton, dnVar.p);
        if (dnVar.b() instanceof dl) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                gk0.a(textInputLayout, checkableImageButton, dnVar.p, dnVar.q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        df0 df0Var = this.g;
        gk0.I(df0Var.f, df0Var.i, df0Var.j);
        if (this.U == 2) {
            int i = this.W;
            if (z && isEnabled()) {
                this.W = this.b0;
            } else {
                this.W = this.a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((ph) this.L).z(0.0f, 0.0f, 0.0f, 0.0f);
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
        dn dnVar = this.h;
        TextInputLayout textInputLayout = dnVar.f;
        CheckableImageButton checkableImageButton = dnVar.l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            gk0.a(textInputLayout, checkableImageButton, dnVar.p, dnVar.q);
            gk0.I(textInputLayout, checkableImageButton, dnVar.p);
        }
    }
}
