package com.google.android.material.textfield;

import A1.m;
import B.b;
import E0.d;
import E0.n;
import K0.c;
import K0.e;
import K0.f;
import K0.g;
import K0.i;
import K0.j;
import K0.k;
import L.C0009g;
import L.C0014l;
import L.J;
import L.T;
import N0.A;
import N0.B;
import N0.C;
import N0.D;
import N0.E;
import N0.F;
import N0.h;
import N0.l;
import N0.q;
import N0.t;
import N0.u;
import N0.x;
import N0.z;
import P0.a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import h.AbstractC0112a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.AbstractC0234q0;
import m.C0208d0;
import m.C0241u;
import m0.p;
import q0.AbstractC0285a;
import r0.AbstractC0292a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1988C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1989A;
    public boolean A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1990B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1991B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1992C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1993D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1994E;

    /* renamed from: F, reason: collision with root package name */
    public g f1995F;
    public g G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1996H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1997I;

    /* renamed from: J, reason: collision with root package name */
    public g f1998J;

    /* renamed from: K, reason: collision with root package name */
    public g f1999K;

    /* renamed from: L, reason: collision with root package name */
    public k f2000L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2001M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2002N;

    /* renamed from: O, reason: collision with root package name */
    public int f2003O;

    /* renamed from: P, reason: collision with root package name */
    public int f2004P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2005Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2006R;

    /* renamed from: S, reason: collision with root package name */
    public int f2007S;

    /* renamed from: T, reason: collision with root package name */
    public int f2008T;

    /* renamed from: U, reason: collision with root package name */
    public int f2009U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2010V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2011W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2012a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2013a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f2014b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2015b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f2016c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2017c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2018d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2019e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2020e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2021f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2022f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2023g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2024g0;

    /* renamed from: h, reason: collision with root package name */
    public int f2025h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2026h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2027i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f2028j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2029j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2030k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2031k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2032l;
    public int l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2033m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2034m0;

    /* renamed from: n, reason: collision with root package name */
    public E f2035n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2036n0;

    /* renamed from: o, reason: collision with root package name */
    public C0208d0 f2037o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2038o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2039p;
    public int p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2040q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2041q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2042r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2043r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2044s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2045s0;

    /* renamed from: t, reason: collision with root package name */
    public C0208d0 f2046t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2047t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2048u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2049u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2050v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f2051v0;

    /* renamed from: w, reason: collision with root package name */
    public m0.g f2052w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2053w0;

    /* renamed from: x, reason: collision with root package name */
    public m0.g f2054x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2055x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2056y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2057y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2058z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2059z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winfour.winrandom.R.attr.textInputStyle, com.winfour.winrandom.R.style.Widget_Design_TextInputLayout), attributeSet, com.winfour.winrandom.R.attr.textInputStyle);
        this.f2021f = -1;
        this.f2023g = -1;
        this.f2025h = -1;
        this.i = -1;
        this.f2028j = new u(this);
        this.f2035n = new C0009g(2);
        this.f2010V = new Rect();
        this.f2011W = new Rect();
        this.f2013a0 = new RectF();
        this.f2020e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f2051v0 = dVar;
        this.f1991B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2012a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0292a.f3566a;
        dVar.f158Q = linearInterpolator;
        dVar.h(false);
        dVar.f157P = linearInterpolator;
        dVar.h(false);
        if (dVar.f179g != 8388659) {
            dVar.f179g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0285a.f3498B;
        n.a(context2, attributeSet, com.winfour.winrandom.R.attr.textInputStyle, com.winfour.winrandom.R.style.Widget_Design_TextInputLayout);
        n.b(context2, attributeSet, iArr, com.winfour.winrandom.R.attr.textInputStyle, com.winfour.winrandom.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winfour.winrandom.R.attr.textInputStyle, com.winfour.winrandom.R.style.Widget_Design_TextInputLayout);
        C0014l c0014l = new C0014l(context2, obtainStyledAttributes);
        z zVar = new z(this, c0014l);
        this.f2014b = zVar;
        this.f1992C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2055x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2053w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f2000L = k.b(context2, attributeSet, com.winfour.winrandom.R.attr.textInputStyle, com.winfour.winrandom.R.style.Widget_Design_TextInputLayout).a();
        this.f2002N = context2.getResources().getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2004P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2006R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2007S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2005Q = this.f2006R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f2000L.e();
        if (dimension >= RecyclerView.A0) {
            e2.f421e = new K0.a(dimension);
        }
        if (dimension2 >= RecyclerView.A0) {
            e2.f422f = new K0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.A0) {
            e2.f423g = new K0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.A0) {
            e2.f424h = new K0.a(dimension4);
        }
        this.f2000L = e2.a();
        ColorStateList C2 = A1.d.C(context2, c0014l, 7);
        if (C2 != null) {
            int defaultColor = C2.getDefaultColor();
            this.f2038o0 = defaultColor;
            this.f2009U = defaultColor;
            if (C2.isStateful()) {
                this.p0 = C2.getColorForState(new int[]{-16842910}, -1);
                this.f2041q0 = C2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2043r0 = C2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2041q0 = this.f2038o0;
                ColorStateList s2 = m.s(context2, com.winfour.winrandom.R.color.mtrl_filled_background_color);
                this.p0 = s2.getColorForState(new int[]{-16842910}, -1);
                this.f2043r0 = s2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2009U = 0;
            this.f2038o0 = 0;
            this.p0 = 0;
            this.f2041q0 = 0;
            this.f2043r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList b2 = c0014l.b(1);
            this.f2029j0 = b2;
            this.f2027i0 = b2;
        }
        ColorStateList C3 = A1.d.C(context2, c0014l, 14);
        this.f2034m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2031k0 = b.a(context2, com.winfour.winrandom.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2045s0 = b.a(context2, com.winfour.winrandom.R.color.mtrl_textinput_disabled_color);
        this.l0 = b.a(context2, com.winfour.winrandom.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (C3 != null) {
            setBoxStrokeColorStateList(C3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(A1.d.C(context2, c0014l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1989A = c0014l.b(24);
        this.f1990B = c0014l.b(25);
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
        this.f2040q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2039p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2039p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2040q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0014l.b(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0014l.b(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0014l.b(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0014l.b(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0014l.b(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0014l.b(58));
        }
        q qVar = new q(this, c0014l);
        this.f2016c = qVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0014l.k();
        setImportantForAccessibility(2);
        J.m(this, 1);
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
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || m.I(editText)) {
            return this.f1995F;
        }
        int B2 = A1.d.B(this.d, com.winfour.winrandom.R.attr.colorControlHighlight);
        int i = this.f2003O;
        int[][] iArr = f1988C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f1995F;
            int i2 = this.f2009U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{A1.d.S(B2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f1995F;
        TypedValue b02 = m.b0(context, com.winfour.winrandom.R.attr.colorSurface, "TextInputLayout");
        int i3 = b02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : b02.data;
        g gVar3 = new g(gVar2.f397a.f382a);
        int S2 = A1.d.S(B2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{S2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{S2, a2});
        g gVar4 = new g(gVar2.f397a.f382a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1996H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1996H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1996H.addState(new int[0], f(false));
        }
        return this.f1996H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = f(true);
        }
        return this.G;
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
        int i = this.f2021f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f2025h);
        }
        int i2 = this.f2023g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1997I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f2051v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.f180h != textSize) {
            dVar.f180h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f164W != letterSpacing) {
            dVar.f164W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f179g != i4) {
            dVar.f179g = i4;
            dVar.h(false);
        }
        if (dVar.f177f != gravity) {
            dVar.f177f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = T.f490a;
        this.f2047t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f2027i0 == null) {
            this.f2027i0 = this.d.getHintTextColors();
        }
        if (this.f1992C) {
            if (TextUtils.isEmpty(this.f1993D)) {
                CharSequence hint = this.d.getHint();
                this.f2019e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1994E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2037o != null) {
            n(this.d.getText());
        }
        r();
        this.f2028j.b();
        this.f2014b.bringToFront();
        q qVar = this.f2016c;
        qVar.bringToFront();
        Iterator it = this.f2020e0.iterator();
        while (it.hasNext()) {
            ((N0.n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1993D)) {
            return;
        }
        this.f1993D = charSequence;
        d dVar = this.f2051v0;
        if (charSequence == null || !TextUtils.equals(dVar.f143A, charSequence)) {
            dVar.f143A = charSequence;
            dVar.f144B = null;
            Bitmap bitmap = dVar.f147E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f147E = null;
            }
            dVar.h(false);
        }
        if (this.f2049u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2044s == z2) {
            return;
        }
        if (z2) {
            C0208d0 c0208d0 = this.f2046t;
            if (c0208d0 != null) {
                this.f2012a.addView(c0208d0);
                this.f2046t.setVisibility(0);
            }
        } else {
            C0208d0 c0208d02 = this.f2046t;
            if (c0208d02 != null) {
                c0208d02.setVisibility(8);
            }
            this.f2046t = null;
        }
        this.f2044s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f2051v0;
        if (dVar.f170b == f2) {
            return;
        }
        if (this.f2057y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2057y0 = valueAnimator;
            valueAnimator.setInterpolator(m.a0(getContext(), com.winfour.winrandom.R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.f3567b));
            this.f2057y0.setDuration(m.Z(getContext(), com.winfour.winrandom.R.attr.motionDurationMedium4, 167));
            this.f2057y0.addUpdateListener(new C(i, this));
        }
        this.f2057y0.setFloatValues(dVar.f170b, f2);
        this.f2057y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2012a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.f1995F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f397a.f382a;
        k kVar2 = this.f2000L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2003O == 2 && (i = this.f2005Q) > -1 && (i2 = this.f2008T) != 0) {
            g gVar2 = this.f1995F;
            gVar2.f397a.f389j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f397a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2009U;
        if (this.f2003O == 1) {
            i3 = D.a.b(this.f2009U, A1.d.A(getContext(), com.winfour.winrandom.R.attr.colorSurface, 0));
        }
        this.f2009U = i3;
        this.f1995F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1998J;
        if (gVar3 != null && this.f1999K != null) {
            if (this.f2005Q > -1 && this.f2008T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f2031k0) : ColorStateList.valueOf(this.f2008T));
                this.f1999K.j(ColorStateList.valueOf(this.f2008T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1992C) {
            return 0;
        }
        int i = this.f2003O;
        d dVar = this.f2051v0;
        if (i == 0) {
            d = dVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = dVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final m0.g d() {
        m0.g gVar = new m0.g();
        gVar.f3280c = m.Z(getContext(), com.winfour.winrandom.R.attr.motionDurationShort2, 87);
        gVar.d = m.a0(getContext(), com.winfour.winrandom.R.attr.motionEasingLinearInterpolator, AbstractC0292a.f3566a);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2019e != null) {
            boolean z2 = this.f1994E;
            this.f1994E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f2019e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1994E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2012a;
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
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1992C;
        d dVar = this.f2051v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f144B != null) {
                RectF rectF = dVar.f175e;
                if (rectF.width() > RecyclerView.A0 && rectF.height() > RecyclerView.A0) {
                    TextPaint textPaint = dVar.f155N;
                    textPaint.setTextSize(dVar.G);
                    float f2 = dVar.f187p;
                    float f3 = dVar.f188q;
                    float f4 = dVar.f148F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f174d0 <= 1 || dVar.f145C) {
                        canvas.translate(f2, f3);
                        dVar.f166Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f187p - dVar.f166Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f171b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f149H;
                            float f7 = dVar.f150I;
                            float f8 = dVar.f151J;
                            int i3 = dVar.f152K;
                            textPaint.setShadowLayer(f6, f7, f8, D.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f166Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f169a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f149H;
                            float f10 = dVar.f150I;
                            float f11 = dVar.f151J;
                            int i4 = dVar.f152K;
                            textPaint.setShadowLayer(f9, f10, f11, D.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f166Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f173c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.A0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f149H, dVar.f150I, dVar.f151J, dVar.f152K);
                        }
                        String trim = dVar.f173c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f166Y.getLineEnd(i), str.length()), RecyclerView.A0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1999K == null || (gVar = this.f1998J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1999K.getBounds();
            Rect bounds2 = this.f1998J.getBounds();
            float f13 = dVar.f170b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0292a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0292a.c(centerX, bounds2.right, f13);
            this.f1999K.draw(canvas);
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
        if (this.f2059z0) {
            return;
        }
        this.f2059z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f2051v0;
        if (dVar != null) {
            dVar.f153L = drawableState;
            ColorStateList colorStateList2 = dVar.f182k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f181j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = T.f490a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2059z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2059z0 = false;
    }

    public final boolean e() {
        return this.f1992C && !TextUtils.isEmpty(this.f1993D) && (this.f1995F instanceof h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.A0;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.winfour.winrandom.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        K0.a aVar = new K0.a(f2);
        K0.a aVar2 = new K0.a(f2);
        K0.a aVar3 = new K0.a(dimensionPixelOffset);
        K0.a aVar4 = new K0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f428a = iVar;
        kVar.f429b = iVar2;
        kVar.f430c = iVar3;
        kVar.d = iVar4;
        kVar.f431e = aVar;
        kVar.f432f = aVar2;
        kVar.f433g = aVar4;
        kVar.f434h = aVar3;
        kVar.i = eVar;
        kVar.f435j = eVar2;
        kVar.f436k = eVar3;
        kVar.f437l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f396w;
            TypedValue b02 = m.b0(context, com.winfour.winrandom.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = b02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : b02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f397a;
        if (fVar.f387g == null) {
            fVar.f387g = new Rect();
        }
        gVar.f397a.f387g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f2016c.c() : this.f2014b.a()) + i;
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
        int i = this.f2003O;
        if (i == 1 || i == 2) {
            return this.f1995F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2009U;
    }

    public int getBoxBackgroundMode() {
        return this.f2003O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2004P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f2013a0;
        return e2 ? this.f2000L.f434h.a(rectF) : this.f2000L.f433g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f2013a0;
        return e2 ? this.f2000L.f433g.a(rectF) : this.f2000L.f434h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f2013a0;
        return e2 ? this.f2000L.f431e.a(rectF) : this.f2000L.f432f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f2013a0;
        return e2 ? this.f2000L.f432f.a(rectF) : this.f2000L.f431e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2034m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2036n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2006R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2007S;
    }

    public int getCounterMaxLength() {
        return this.f2032l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0208d0 c0208d0;
        if (this.f2030k && this.f2033m && (c0208d0 = this.f2037o) != null) {
            return c0208d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2058z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2056y;
    }

    public ColorStateList getCursorColor() {
        return this.f1989A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1990B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2027i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2016c.f683g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2016c.f683g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2016c.f688m;
    }

    public int getEndIconMode() {
        return this.f2016c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2016c.f689n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2016c.f683g;
    }

    public CharSequence getError() {
        u uVar = this.f2028j;
        if (uVar.f722q) {
            return uVar.f721p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2028j.f725t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2028j.f724s;
    }

    public int getErrorCurrentTextColors() {
        C0208d0 c0208d0 = this.f2028j.f723r;
        if (c0208d0 != null) {
            return c0208d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2016c.f680c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f2028j;
        if (uVar.f729x) {
            return uVar.f728w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0208d0 c0208d0 = this.f2028j.f730y;
        if (c0208d0 != null) {
            return c0208d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1992C) {
            return this.f1993D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2051v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f2051v0;
        return dVar.e(dVar.f182k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2029j0;
    }

    public E getLengthCounter() {
        return this.f2035n;
    }

    public int getMaxEms() {
        return this.f2023g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2021f;
    }

    public int getMinWidth() {
        return this.f2025h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2016c.f683g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2016c.f683g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2044s) {
            return this.f2042r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2050v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2048u;
    }

    public CharSequence getPrefixText() {
        return this.f2014b.f749c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2014b.f748b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2014b.f748b;
    }

    public k getShapeAppearanceModel() {
        return this.f2000L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2014b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2014b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2014b.f752g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2014b.f753h;
    }

    public CharSequence getSuffixText() {
        return this.f2016c.f691p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2016c.f692q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2016c.f692q;
    }

    public Typeface getTypeface() {
        return this.f2015b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f2014b.a() : this.f2016c.c());
    }

    public final void i() {
        int i = this.f2003O;
        if (i == 0) {
            this.f1995F = null;
            this.f1998J = null;
            this.f1999K = null;
        } else if (i == 1) {
            this.f1995F = new g(this.f2000L);
            this.f1998J = new g();
            this.f1999K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2003O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1992C || (this.f1995F instanceof h)) {
                this.f1995F = new g(this.f2000L);
            } else {
                k kVar = this.f2000L;
                int i2 = h.f653y;
                if (kVar == null) {
                    kVar = new k();
                }
                N0.g gVar = new N0.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f654x = gVar;
                this.f1995F = hVar;
            }
            this.f1998J = null;
            this.f1999K = null;
        }
        s();
        x();
        if (this.f2003O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2004P = getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (A1.d.Q(getContext())) {
                this.f2004P = getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f2003O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = T.f490a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (A1.d.Q(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = T.f490a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2003O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2003O;
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
            d dVar = this.f2051v0;
            boolean b2 = dVar.b(dVar.f143A);
            dVar.f145C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f167Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f167Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2013a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f167Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f145C) {
                        f5 = max + dVar.f167Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f145C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f167Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > RecyclerView.A0 || rectF.height() <= RecyclerView.A0) {
                }
                float f6 = rectF.left;
                float f7 = this.f2002N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2005Q);
                h hVar = (h) this.f1995F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f167Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2013a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f167Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > RecyclerView.A0) {
            }
        }
    }

    public final void l(C0208d0 c0208d0, int i) {
        try {
            c0208d0.setTextAppearance(i);
            if (c0208d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0208d0.setTextAppearance(com.winfour.winrandom.R.style.TextAppearance_AppCompat_Caption);
        c0208d0.setTextColor(b.a(getContext(), com.winfour.winrandom.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f2028j;
        return (uVar.f720o != 1 || uVar.f723r == null || TextUtils.isEmpty(uVar.f721p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0009g) this.f2035n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2033m;
        int i = this.f2032l;
        String str = null;
        if (i == -1) {
            this.f2037o.setText(String.valueOf(length));
            this.f2037o.setContentDescription(null);
            this.f2033m = false;
        } else {
            this.f2033m = length > i;
            Context context = getContext();
            this.f2037o.setContentDescription(context.getString(this.f2033m ? com.winfour.winrandom.R.string.character_counter_overflowed_content_description : com.winfour.winrandom.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2032l)));
            if (z2 != this.f2033m) {
                o();
            }
            String str2 = J.b.f351b;
            J.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? J.b.f353e : J.b.d;
            C0208d0 c0208d0 = this.f2037o;
            String string = getContext().getString(com.winfour.winrandom.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2032l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                J.g gVar = J.h.f361a;
                str = bVar.c(string).toString();
            }
            c0208d0.setText(str);
        }
        if (this.d == null || z2 == this.f2033m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0208d0 c0208d0 = this.f2037o;
        if (c0208d0 != null) {
            l(c0208d0, this.f2033m ? this.f2039p : this.f2040q);
            if (!this.f2033m && (colorStateList2 = this.f2056y) != null) {
                this.f2037o.setTextColor(colorStateList2);
            }
            if (!this.f2033m || (colorStateList = this.f2058z) == null) {
                return;
            }
            this.f2037o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2051v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f2016c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1991B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f2014b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new A.a(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = E0.e.f198a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2010V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = E0.e.f198a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            E0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = E0.e.f199b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1998J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2006R, rect.right, i5);
            }
            g gVar2 = this.f1999K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2007S, rect.right, i6);
            }
            if (this.f1992C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f2051v0;
                if (dVar.f180h != textSize) {
                    dVar.f180h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f179g != i7) {
                    dVar.f179g = i7;
                    dVar.h(false);
                }
                if (dVar.f177f != gravity) {
                    dVar.f177f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = n.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2011W;
                rect2.bottom = i8;
                int i9 = this.f2003O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f2004P;
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
                Rect rect3 = dVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    dVar.f154M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f156O;
                textPaint.setTextSize(dVar.f180h);
                textPaint.setTypeface(dVar.f192u);
                textPaint.setLetterSpacing(dVar.f164W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2003O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2003O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f172c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f154M = true;
                }
                dVar.h(false);
                if (!e() || this.f2049u0) {
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
        boolean z2 = this.f1991B0;
        q qVar = this.f2016c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1991B0 = true;
        }
        if (this.f2046t != null && (editText = this.d) != null) {
            this.f2046t.setGravity(editText.getGravity());
            this.f2046t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f826a);
        setError(f2.f634c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2001M) {
            c cVar = this.f2000L.f431e;
            RectF rectF = this.f2013a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2000L.f432f.a(rectF);
            float a4 = this.f2000L.f434h.a(rectF);
            float a5 = this.f2000L.f433g.a(rectF);
            k kVar = this.f2000L;
            A1.d dVar = kVar.f428a;
            A1.d dVar2 = kVar.f429b;
            A1.d dVar3 = kVar.d;
            A1.d dVar4 = kVar.f430c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(dVar2);
            j.b(dVar);
            j.b(dVar4);
            j.b(dVar3);
            K0.a aVar = new K0.a(a3);
            K0.a aVar2 = new K0.a(a2);
            K0.a aVar3 = new K0.a(a5);
            K0.a aVar4 = new K0.a(a4);
            k kVar2 = new k();
            kVar2.f428a = dVar2;
            kVar2.f429b = dVar;
            kVar2.f430c = dVar3;
            kVar2.d = dVar4;
            kVar2.f431e = aVar;
            kVar2.f432f = aVar2;
            kVar2.f433g = aVar4;
            kVar2.f434h = aVar3;
            kVar2.i = eVar;
            kVar2.f435j = eVar2;
            kVar2.f436k = eVar3;
            kVar2.f437l = eVar4;
            this.f2001M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f634c = getError();
        }
        q qVar = this.f2016c;
        f2.d = qVar.i != 0 && qVar.f683g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1989A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue X2 = m.X(context, com.winfour.winrandom.R.attr.colorControlActivated);
            if (X2 != null) {
                int i = X2.resourceId;
                if (i != 0) {
                    colorStateList2 = m.s(context, i);
                } else {
                    int i2 = X2.data;
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
            if ((m() || (this.f2037o != null && this.f2033m)) && (colorStateList = this.f1990B) != null) {
                colorStateList2 = colorStateList;
            }
            E.a.h(mutate, colorStateList2);
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
        if (this.d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            z zVar = this.f2014b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f2017c0 == null || this.f2018d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2017c0 = colorDrawable3;
                    this.f2018d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2017c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f2016c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f691p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f692q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f680c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f683g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2022f0;
                        if (colorDrawable != null || this.f2024g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2022f0 = colorDrawable5;
                                this.f2024g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2022f0;
                            if (drawable == colorDrawable2) {
                                this.f2026h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2024g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2022f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2022f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2022f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2026h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2022f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f2016c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f692q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f2022f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2022f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2017c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2017c0 = null;
            z2 = true;
            qVar = this.f2016c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f692q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f2022f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2022f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f2016c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f692q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f2022f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2022f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0208d0 c0208d0;
        EditText editText = this.d;
        if (editText == null || this.f2003O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0234q0.f3169a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0241u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2033m && (c0208d0 = this.f2037o) != null) {
            mutate.setColorFilter(C0241u.c(c0208d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.f1995F == null) {
            return;
        }
        if ((this.f1997I || editText.getBackground() == null) && this.f2003O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = T.f490a;
            editText2.setBackground(editTextBoxBackground);
            this.f1997I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2009U != i) {
            this.f2009U = i;
            this.f2038o0 = i;
            this.f2041q0 = i;
            this.f2043r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2038o0 = defaultColor;
        this.f2009U = defaultColor;
        this.p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2041q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2043r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2003O) {
            return;
        }
        this.f2003O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2004P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f2000L.e();
        c cVar = this.f2000L.f431e;
        A1.d m2 = m.m(i);
        e2.f418a = m2;
        j.b(m2);
        e2.f421e = cVar;
        c cVar2 = this.f2000L.f432f;
        A1.d m3 = m.m(i);
        e2.f419b = m3;
        j.b(m3);
        e2.f422f = cVar2;
        c cVar3 = this.f2000L.f434h;
        A1.d m4 = m.m(i);
        e2.d = m4;
        j.b(m4);
        e2.f424h = cVar3;
        c cVar4 = this.f2000L.f433g;
        A1.d m5 = m.m(i);
        e2.f420c = m5;
        j.b(m5);
        e2.f423g = cVar4;
        this.f2000L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2034m0 != i) {
            this.f2034m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2031k0 = colorStateList.getDefaultColor();
            this.f2045s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2034m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2034m0 != colorStateList.getDefaultColor()) {
            this.f2034m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2036n0 != colorStateList) {
            this.f2036n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2006R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2007S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2030k != z2) {
            u uVar = this.f2028j;
            if (z2) {
                C0208d0 c0208d0 = new C0208d0(getContext(), null);
                this.f2037o = c0208d0;
                c0208d0.setId(com.winfour.winrandom.R.id.textinput_counter);
                Typeface typeface = this.f2015b0;
                if (typeface != null) {
                    this.f2037o.setTypeface(typeface);
                }
                this.f2037o.setMaxLines(1);
                uVar.a(this.f2037o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2037o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.winfour.winrandom.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2037o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f2037o, 2);
                this.f2037o = null;
            }
            this.f2030k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2032l != i) {
            if (i > 0) {
                this.f2032l = i;
            } else {
                this.f2032l = -1;
            }
            if (!this.f2030k || this.f2037o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2039p != i) {
            this.f2039p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2058z != colorStateList) {
            this.f2058z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2040q != i) {
            this.f2040q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2056y != colorStateList) {
            this.f2056y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1989A != colorStateList) {
            this.f1989A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1990B != colorStateList) {
            this.f1990B = colorStateList;
            if (m() || (this.f2037o != null && this.f2033m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2027i0 = colorStateList;
        this.f2029j0 = colorStateList;
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
        this.f2016c.f683g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2016c.f683g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f2016c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f683g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f2016c;
        Drawable l2 = i != 0 ? AbstractC0112a.l(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f683g;
        checkableImageButton.setImageDrawable(l2);
        if (l2 != null) {
            ColorStateList colorStateList = qVar.f686k;
            PorterDuff.Mode mode = qVar.f687l;
            TextInputLayout textInputLayout = qVar.f678a;
            A1.d.f(textInputLayout, checkableImageButton, colorStateList, mode);
            A1.d.b0(textInputLayout, checkableImageButton, qVar.f686k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f2016c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f688m) {
            qVar.f688m = i;
            CheckableImageButton checkableImageButton = qVar.f683g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f680c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2016c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2016c;
        View.OnLongClickListener onLongClickListener = qVar.f690o;
        CheckableImageButton checkableImageButton = qVar.f683g;
        checkableImageButton.setOnClickListener(onClickListener);
        A1.d.h0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2016c;
        qVar.f690o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f683g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        A1.d.h0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f2016c;
        qVar.f689n = scaleType;
        qVar.f683g.setScaleType(scaleType);
        qVar.f680c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2016c;
        if (qVar.f686k != colorStateList) {
            qVar.f686k = colorStateList;
            A1.d.f(qVar.f678a, qVar.f683g, colorStateList, qVar.f687l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2016c;
        if (qVar.f687l != mode) {
            qVar.f687l = mode;
            A1.d.f(qVar.f678a, qVar.f683g, qVar.f686k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2016c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f2028j;
        if (!uVar.f722q) {
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
        uVar.f721p = charSequence;
        uVar.f723r.setText(charSequence);
        int i = uVar.f719n;
        if (i != 1) {
            uVar.f720o = 1;
        }
        uVar.i(i, uVar.f720o, uVar.h(uVar.f723r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f2028j;
        uVar.f725t = i;
        C0208d0 c0208d0 = uVar.f723r;
        if (c0208d0 != null) {
            WeakHashMap weakHashMap = T.f490a;
            c0208d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f2028j;
        uVar.f724s = charSequence;
        C0208d0 c0208d0 = uVar.f723r;
        if (c0208d0 != null) {
            c0208d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f2028j;
        if (uVar.f722q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.f714h;
        if (z2) {
            C0208d0 c0208d0 = new C0208d0(uVar.f713g, null);
            uVar.f723r = c0208d0;
            c0208d0.setId(com.winfour.winrandom.R.id.textinput_error);
            uVar.f723r.setTextAlignment(5);
            Typeface typeface = uVar.f707B;
            if (typeface != null) {
                uVar.f723r.setTypeface(typeface);
            }
            int i = uVar.f726u;
            uVar.f726u = i;
            C0208d0 c0208d02 = uVar.f723r;
            if (c0208d02 != null) {
                textInputLayout.l(c0208d02, i);
            }
            ColorStateList colorStateList = uVar.f727v;
            uVar.f727v = colorStateList;
            C0208d0 c0208d03 = uVar.f723r;
            if (c0208d03 != null && colorStateList != null) {
                c0208d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f724s;
            uVar.f724s = charSequence;
            C0208d0 c0208d04 = uVar.f723r;
            if (c0208d04 != null) {
                c0208d04.setContentDescription(charSequence);
            }
            int i2 = uVar.f725t;
            uVar.f725t = i2;
            C0208d0 c0208d05 = uVar.f723r;
            if (c0208d05 != null) {
                WeakHashMap weakHashMap = T.f490a;
                c0208d05.setAccessibilityLiveRegion(i2);
            }
            uVar.f723r.setVisibility(4);
            uVar.a(uVar.f723r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f723r, 0);
            uVar.f723r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f722q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f2016c;
        qVar.i(i != 0 ? AbstractC0112a.l(qVar.getContext(), i) : null);
        A1.d.b0(qVar.f678a, qVar.f680c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2016c;
        CheckableImageButton checkableImageButton = qVar.f680c;
        View.OnLongClickListener onLongClickListener = qVar.f682f;
        checkableImageButton.setOnClickListener(onClickListener);
        A1.d.h0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2016c;
        qVar.f682f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f680c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        A1.d.h0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2016c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            A1.d.f(qVar.f678a, qVar.f680c, colorStateList, qVar.f681e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2016c;
        if (qVar.f681e != mode) {
            qVar.f681e = mode;
            A1.d.f(qVar.f678a, qVar.f680c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f2028j;
        uVar.f726u = i;
        C0208d0 c0208d0 = uVar.f723r;
        if (c0208d0 != null) {
            uVar.f714h.l(c0208d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f2028j;
        uVar.f727v = colorStateList;
        C0208d0 c0208d0 = uVar.f723r;
        if (c0208d0 == null || colorStateList == null) {
            return;
        }
        c0208d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2053w0 != z2) {
            this.f2053w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f2028j;
        if (isEmpty) {
            if (uVar.f729x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f729x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f728w = charSequence;
        uVar.f730y.setText(charSequence);
        int i = uVar.f719n;
        if (i != 2) {
            uVar.f720o = 2;
        }
        uVar.i(i, uVar.f720o, uVar.h(uVar.f730y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f2028j;
        uVar.f706A = colorStateList;
        C0208d0 c0208d0 = uVar.f730y;
        if (c0208d0 == null || colorStateList == null) {
            return;
        }
        c0208d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f2028j;
        if (uVar.f729x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0208d0 c0208d0 = new C0208d0(uVar.f713g, null);
            uVar.f730y = c0208d0;
            c0208d0.setId(com.winfour.winrandom.R.id.textinput_helper_text);
            uVar.f730y.setTextAlignment(5);
            Typeface typeface = uVar.f707B;
            if (typeface != null) {
                uVar.f730y.setTypeface(typeface);
            }
            uVar.f730y.setVisibility(4);
            uVar.f730y.setAccessibilityLiveRegion(1);
            int i = uVar.f731z;
            uVar.f731z = i;
            C0208d0 c0208d02 = uVar.f730y;
            if (c0208d02 != null) {
                c0208d02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f706A;
            uVar.f706A = colorStateList;
            C0208d0 c0208d03 = uVar.f730y;
            if (c0208d03 != null && colorStateList != null) {
                c0208d03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f730y, 1);
            uVar.f730y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f719n;
            if (i2 == 2) {
                uVar.f720o = 0;
            }
            uVar.i(i2, uVar.f720o, uVar.h(uVar.f730y, ""));
            uVar.g(uVar.f730y, 1);
            uVar.f730y = null;
            TextInputLayout textInputLayout = uVar.f714h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f729x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f2028j;
        uVar.f731z = i;
        C0208d0 c0208d0 = uVar.f730y;
        if (c0208d0 != null) {
            c0208d0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1992C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2055x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1992C) {
            this.f1992C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1993D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1994E = true;
            } else {
                this.f1994E = false;
                if (!TextUtils.isEmpty(this.f1993D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1993D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f2051v0;
        TextInputLayout textInputLayout = dVar.f168a;
        H0.d dVar2 = new H0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f310j;
        if (colorStateList != null) {
            dVar.f182k = colorStateList;
        }
        float f2 = dVar2.f311k;
        if (f2 != RecyclerView.A0) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f303a;
        if (colorStateList2 != null) {
            dVar.f162U = colorStateList2;
        }
        dVar.f160S = dVar2.f306e;
        dVar.f161T = dVar2.f307f;
        dVar.f159R = dVar2.f308g;
        dVar.f163V = dVar2.i;
        H0.a aVar = dVar.f196y;
        if (aVar != null) {
            aVar.f298c = true;
        }
        D.g gVar = new D.g(1, dVar);
        dVar2.a();
        dVar.f196y = new H0.a(gVar, dVar2.f314n);
        dVar2.c(textInputLayout.getContext(), dVar.f196y);
        dVar.h(false);
        this.f2029j0 = dVar.f182k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2029j0 != colorStateList) {
            if (this.f2027i0 == null) {
                d dVar = this.f2051v0;
                if (dVar.f182k != colorStateList) {
                    dVar.f182k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f2029j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f2035n = e2;
    }

    public void setMaxEms(int i) {
        this.f2023g = i;
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
        this.f2021f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f2025h = i;
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
        q qVar = this.f2016c;
        qVar.f683g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f2016c;
        qVar.f683g.setImageDrawable(i != 0 ? AbstractC0112a.l(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f2016c;
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
        q qVar = this.f2016c;
        qVar.f686k = colorStateList;
        A1.d.f(qVar.f678a, qVar.f683g, colorStateList, qVar.f687l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2016c;
        qVar.f687l = mode;
        A1.d.f(qVar.f678a, qVar.f683g, qVar.f686k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2046t == null) {
            C0208d0 c0208d0 = new C0208d0(getContext(), null);
            this.f2046t = c0208d0;
            c0208d0.setId(com.winfour.winrandom.R.id.textinput_placeholder);
            this.f2046t.setImportantForAccessibility(2);
            m0.g d = d();
            this.f2052w = d;
            d.f3279b = 67L;
            this.f2054x = d();
            setPlaceholderTextAppearance(this.f2050v);
            setPlaceholderTextColor(this.f2048u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2044s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2042r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2050v = i;
        C0208d0 c0208d0 = this.f2046t;
        if (c0208d0 != null) {
            c0208d0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2048u != colorStateList) {
            this.f2048u = colorStateList;
            C0208d0 c0208d0 = this.f2046t;
            if (c0208d0 == null || colorStateList == null) {
                return;
            }
            c0208d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f2014b;
        zVar.getClass();
        zVar.f749c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f748b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2014b.f748b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2014b.f748b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f1995F;
        if (gVar == null || gVar.f397a.f382a == kVar) {
            return;
        }
        this.f2000L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2014b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2014b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0112a.l(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f2014b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f752g) {
            zVar.f752g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f2014b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        A1.d.h0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f2014b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        A1.d.h0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f2014b;
        zVar.f753h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f2014b;
        if (zVar.f750e != colorStateList) {
            zVar.f750e = colorStateList;
            A1.d.f(zVar.f747a, zVar.d, colorStateList, zVar.f751f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f2014b;
        if (zVar.f751f != mode) {
            zVar.f751f = mode;
            A1.d.f(zVar.f747a, zVar.d, zVar.f750e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2014b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f2016c;
        qVar.getClass();
        qVar.f691p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f692q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2016c.f692q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2016c.f692q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            T.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2015b0) {
            this.f2015b0 = typeface;
            this.f2051v0.m(typeface);
            u uVar = this.f2028j;
            if (typeface != uVar.f707B) {
                uVar.f707B = typeface;
                C0208d0 c0208d0 = uVar.f723r;
                if (c0208d0 != null) {
                    c0208d0.setTypeface(typeface);
                }
                C0208d0 c0208d02 = uVar.f730y;
                if (c0208d02 != null) {
                    c0208d02.setTypeface(typeface);
                }
            }
            C0208d0 c0208d03 = this.f2037o;
            if (c0208d03 != null) {
                c0208d03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2003O != 1) {
            FrameLayout frameLayout = this.f2012a;
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
        C0208d0 c0208d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2027i0;
        d dVar = this.f2051v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2027i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2045s0) : this.f2045s0));
        } else if (m()) {
            C0208d0 c0208d02 = this.f2028j.f723r;
            dVar.i(c0208d02 != null ? c0208d02.getTextColors() : null);
        } else if (this.f2033m && (c0208d0 = this.f2037o) != null) {
            dVar.i(c0208d0.getTextColors());
        } else if (z5 && (colorStateList = this.f2029j0) != null && dVar.f182k != colorStateList) {
            dVar.f182k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f2016c;
        z zVar = this.f2014b;
        if (z4 || !this.f2053w0 || (isEnabled() && z5)) {
            if (z3 || this.f2049u0) {
                ValueAnimator valueAnimator = this.f2057y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2057y0.cancel();
                }
                if (z2 && this.f2055x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f2049u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f754j = false;
                zVar.e();
                qVar.f693r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2049u0) {
            ValueAnimator valueAnimator2 = this.f2057y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2057y0.cancel();
            }
            if (z2 && this.f2055x0) {
                a(RecyclerView.A0);
            } else {
                dVar.k(RecyclerView.A0);
            }
            if (e() && !((h) this.f1995F).f654x.f652q.isEmpty() && e()) {
                ((h) this.f1995F).n(RecyclerView.A0, RecyclerView.A0, RecyclerView.A0, RecyclerView.A0);
            }
            this.f2049u0 = true;
            C0208d0 c0208d03 = this.f2046t;
            if (c0208d03 != null && this.f2044s) {
                c0208d03.setText((CharSequence) null);
                p.a(this.f2012a, this.f2054x);
                this.f2046t.setVisibility(4);
            }
            zVar.f754j = true;
            zVar.e();
            qVar.f693r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0009g) this.f2035n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2012a;
        if (length != 0 || this.f2049u0) {
            C0208d0 c0208d0 = this.f2046t;
            if (c0208d0 == null || !this.f2044s) {
                return;
            }
            c0208d0.setText((CharSequence) null);
            p.a(frameLayout, this.f2054x);
            this.f2046t.setVisibility(4);
            return;
        }
        if (this.f2046t == null || !this.f2044s || TextUtils.isEmpty(this.f2042r)) {
            return;
        }
        this.f2046t.setText(this.f2042r);
        p.a(frameLayout, this.f2052w);
        this.f2046t.setVisibility(0);
        this.f2046t.bringToFront();
        announceForAccessibility(this.f2042r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2036n0.getDefaultColor();
        int colorForState = this.f2036n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2036n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2008T = colorForState2;
        } else if (z3) {
            this.f2008T = colorForState;
        } else {
            this.f2008T = defaultColor;
        }
    }

    public final void x() {
        C0208d0 c0208d0;
        EditText editText;
        EditText editText2;
        if (this.f1995F == null || this.f2003O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2008T = this.f2045s0;
        } else if (m()) {
            if (this.f2036n0 != null) {
                w(z3, z2);
            } else {
                this.f2008T = getErrorCurrentTextColors();
            }
        } else if (!this.f2033m || (c0208d0 = this.f2037o) == null) {
            if (z3) {
                this.f2008T = this.f2034m0;
            } else if (z2) {
                this.f2008T = this.l0;
            } else {
                this.f2008T = this.f2031k0;
            }
        } else if (this.f2036n0 != null) {
            w(z3, z2);
        } else {
            this.f2008T = c0208d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f2016c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f680c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f678a;
        A1.d.b0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f686k;
        CheckableImageButton checkableImageButton2 = qVar.f683g;
        A1.d.b0(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                A1.d.f(textInputLayout, checkableImageButton2, qVar.f686k, qVar.f687l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                E.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f2014b;
        A1.d.b0(zVar.f747a, zVar.d, zVar.f750e);
        if (this.f2003O == 2) {
            int i = this.f2005Q;
            if (z3 && isEnabled()) {
                this.f2005Q = this.f2007S;
            } else {
                this.f2005Q = this.f2006R;
            }
            if (this.f2005Q != i && e() && !this.f2049u0) {
                if (e()) {
                    ((h) this.f1995F).n(RecyclerView.A0, RecyclerView.A0, RecyclerView.A0, RecyclerView.A0);
                }
                j();
            }
        }
        if (this.f2003O == 1) {
            if (!isEnabled()) {
                this.f2009U = this.p0;
            } else if (z2 && !z3) {
                this.f2009U = this.f2043r0;
            } else if (z3) {
                this.f2009U = this.f2041q0;
            } else {
                this.f2009U = this.f2038o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2014b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2016c.f683g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2016c.f683g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2016c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2016c.f683g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f2016c;
        CheckableImageButton checkableImageButton = qVar.f683g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f686k;
            PorterDuff.Mode mode = qVar.f687l;
            TextInputLayout textInputLayout = qVar.f678a;
            A1.d.f(textInputLayout, checkableImageButton, colorStateList, mode);
            A1.d.b0(textInputLayout, checkableImageButton, qVar.f686k);
        }
    }
}
