package com.google.android.material.textfield;

import C.b;
import H0.d;
import H0.m;
import H1.l;
import I0.h;
import M.G;
import M.P;
import N0.c;
import N0.e;
import N0.f;
import N0.g;
import N0.i;
import N0.j;
import N0.k;
import Q0.A;
import Q0.B;
import Q0.C;
import Q0.D;
import Q0.E;
import Q0.n;
import Q0.q;
import Q0.t;
import Q0.u;
import Q0.x;
import Q0.z;
import S0.a;
import a.AbstractC0058a;
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
import n.AbstractC0293p0;
import n.C0267c0;
import n.C0302u;
import t0.AbstractC0383a;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f2483C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2484A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f2485A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2486B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f2487B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2488C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2489D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2490E;

    /* renamed from: F, reason: collision with root package name */
    public g f2491F;

    /* renamed from: G, reason: collision with root package name */
    public g f2492G;
    public StateListDrawable H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2493I;

    /* renamed from: J, reason: collision with root package name */
    public g f2494J;

    /* renamed from: K, reason: collision with root package name */
    public g f2495K;

    /* renamed from: L, reason: collision with root package name */
    public k f2496L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2497M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2498N;

    /* renamed from: O, reason: collision with root package name */
    public int f2499O;

    /* renamed from: P, reason: collision with root package name */
    public int f2500P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2501Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2502R;

    /* renamed from: S, reason: collision with root package name */
    public int f2503S;

    /* renamed from: T, reason: collision with root package name */
    public int f2504T;

    /* renamed from: U, reason: collision with root package name */
    public int f2505U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2506V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2507W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2508a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2509a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f2510b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2511b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f2512c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2513c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f2514d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2515d0;
    public CharSequence e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2516e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2517f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2518f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2519g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2520g0;

    /* renamed from: h, reason: collision with root package name */
    public int f2521h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2522h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2523i0;
    public final u j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2524j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2525k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2526k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2527l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2528l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2529m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2530m0;

    /* renamed from: n, reason: collision with root package name */
    public D f2531n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2532n0;

    /* renamed from: o, reason: collision with root package name */
    public C0267c0 f2533o;
    public int o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2534p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2535p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2536q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2537q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2538r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2539r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2540s;
    public int s0;

    /* renamed from: t, reason: collision with root package name */
    public C0267c0 f2541t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2542t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2543u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2544u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2545v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f2546v0;

    /* renamed from: w, reason: collision with root package name */
    public p0.g f2547w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2548w0;

    /* renamed from: x, reason: collision with root package name */
    public p0.g f2549x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2550x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2551y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2552y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2553z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2554z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winpower.neonfit.R.attr.textInputStyle, com.winpower.neonfit.R.style.Widget_Design_TextInputLayout), attributeSet, com.winpower.neonfit.R.attr.textInputStyle);
        this.f2517f = -1;
        this.f2519g = -1;
        this.f2521h = -1;
        this.i = -1;
        this.j = new u(this);
        this.f2531n = new A1.a(3);
        this.f2506V = new Rect();
        this.f2507W = new Rect();
        this.f2509a0 = new RectF();
        this.f2516e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f2546v0 = dVar;
        this.f2487B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2508a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0389a.f4369a;
        dVar.f477Q = linearInterpolator;
        dVar.h(false);
        dVar.f476P = linearInterpolator;
        dVar.h(false);
        if (dVar.f498g != 8388659) {
            dVar.f498g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0383a.f4145B;
        m.a(context2, attributeSet, com.winpower.neonfit.R.attr.textInputStyle, com.winpower.neonfit.R.style.Widget_Design_TextInputLayout);
        m.b(context2, attributeSet, iArr, com.winpower.neonfit.R.attr.textInputStyle, com.winpower.neonfit.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winpower.neonfit.R.attr.textInputStyle, com.winpower.neonfit.R.style.Widget_Design_TextInputLayout);
        h hVar = new h(context2, obtainStyledAttributes);
        z zVar = new z(this, hVar);
        this.f2510b = zVar;
        this.f2488C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2550x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2548w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f2496L = k.b(context2, attributeSet, com.winpower.neonfit.R.attr.textInputStyle, com.winpower.neonfit.R.style.Widget_Design_TextInputLayout).a();
        this.f2498N = context2.getResources().getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2500P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2502R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2503S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2501Q = this.f2502R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e = this.f2496L.e();
        if (dimension >= 0.0f) {
            e.e = new N0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e.f924f = new N0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e.f925g = new N0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e.f926h = new N0.a(dimension4);
        }
        this.f2496L = e.a();
        ColorStateList B2 = H1.d.B(context2, hVar, 7);
        if (B2 != null) {
            int defaultColor = B2.getDefaultColor();
            this.o0 = defaultColor;
            this.f2505U = defaultColor;
            if (B2.isStateful()) {
                this.f2535p0 = B2.getColorForState(new int[]{-16842910}, -1);
                this.f2537q0 = B2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2539r0 = B2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2537q0 = this.o0;
                ColorStateList v2 = l.v(context2, com.winpower.neonfit.R.color.mtrl_filled_background_color);
                this.f2535p0 = v2.getColorForState(new int[]{-16842910}, -1);
                this.f2539r0 = v2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2505U = 0;
            this.o0 = 0;
            this.f2535p0 = 0;
            this.f2537q0 = 0;
            this.f2539r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = hVar.g(1);
            this.f2524j0 = g2;
            this.f2523i0 = g2;
        }
        ColorStateList B3 = H1.d.B(context2, hVar, 14);
        this.f2530m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2526k0 = b.a(context2, com.winpower.neonfit.R.color.mtrl_textinput_default_box_stroke_color);
        this.s0 = b.a(context2, com.winpower.neonfit.R.color.mtrl_textinput_disabled_color);
        this.f2528l0 = b.a(context2, com.winpower.neonfit.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (B3 != null) {
            setBoxStrokeColorStateList(B3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(H1.d.B(context2, hVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2484A = hVar.g(24);
        this.f2486B = hVar.g(25);
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
        this.f2536q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2534p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2534p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2536q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(hVar.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(hVar.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(hVar.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(hVar.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(hVar.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(hVar.g(58));
        }
        q qVar = new q(this, hVar);
        this.f2512c = qVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        hVar.t();
        setImportantForAccessibility(2);
        G.m(this, 1);
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
        EditText editText = this.f2514d;
        if (!(editText instanceof AutoCompleteTextView) || H1.d.O(editText)) {
            return this.f2491F;
        }
        int u2 = l.u(this.f2514d, com.winpower.neonfit.R.attr.colorControlHighlight);
        int i = this.f2499O;
        int[][] iArr = f2483C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f2491F;
            int i2 = this.f2505U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{l.H(u2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f2491F;
        TypedValue X2 = AbstractC0058a.X(context, com.winpower.neonfit.R.attr.colorSurface, "TextInputLayout");
        int i3 = X2.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : X2.data;
        g gVar3 = new g(gVar2.f900a.f886a);
        int H = l.H(u2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{H, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{H, a2});
        g gVar4 = new g(gVar2.f900a.f886a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], f(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2492G == null) {
            this.f2492G = f(true);
        }
        return this.f2492G;
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
        if (this.f2514d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2514d = editText;
        int i = this.f2517f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f2521h);
        }
        int i2 = this.f2519g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f2493I = false;
        i();
        setTextInputAccessibilityDelegate(new C(this));
        Typeface typeface = this.f2514d.getTypeface();
        d dVar = this.f2546v0;
        dVar.m(typeface);
        float textSize = this.f2514d.getTextSize();
        if (dVar.f499h != textSize) {
            dVar.f499h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2514d.getLetterSpacing();
        if (dVar.f483W != letterSpacing) {
            dVar.f483W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.f2514d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f498g != i4) {
            dVar.f498g = i4;
            dVar.h(false);
        }
        if (dVar.f496f != gravity) {
            dVar.f496f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = P.f711a;
        this.f2542t0 = editText.getMinimumHeight();
        this.f2514d.addTextChangedListener(new A(this, editText));
        if (this.f2523i0 == null) {
            this.f2523i0 = this.f2514d.getHintTextColors();
        }
        if (this.f2488C) {
            if (TextUtils.isEmpty(this.f2489D)) {
                CharSequence hint = this.f2514d.getHint();
                this.e = hint;
                setHint(hint);
                this.f2514d.setHint((CharSequence) null);
            }
            this.f2490E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2533o != null) {
            n(this.f2514d.getText());
        }
        r();
        this.j.b();
        this.f2510b.bringToFront();
        q qVar = this.f2512c;
        qVar.bringToFront();
        Iterator it = this.f2516e0.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2489D)) {
            return;
        }
        this.f2489D = charSequence;
        d dVar = this.f2546v0;
        if (charSequence == null || !TextUtils.equals(dVar.f462A, charSequence)) {
            dVar.f462A = charSequence;
            dVar.f463B = null;
            Bitmap bitmap = dVar.f466E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f466E = null;
            }
            dVar.h(false);
        }
        if (this.f2544u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2540s == z2) {
            return;
        }
        if (z2) {
            C0267c0 c0267c0 = this.f2541t;
            if (c0267c0 != null) {
                this.f2508a.addView(c0267c0);
                this.f2541t.setVisibility(0);
            }
        } else {
            C0267c0 c0267c02 = this.f2541t;
            if (c0267c02 != null) {
                c0267c02.setVisibility(8);
            }
            this.f2541t = null;
        }
        this.f2540s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f2546v0;
        if (dVar.f489b == f2) {
            return;
        }
        if (this.f2552y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2552y0 = valueAnimator;
            valueAnimator.setInterpolator(l.U(getContext(), com.winpower.neonfit.R.attr.motionEasingEmphasizedInterpolator, AbstractC0389a.f4370b));
            this.f2552y0.setDuration(l.T(getContext(), com.winpower.neonfit.R.attr.motionDurationMedium4, 167));
            this.f2552y0.addUpdateListener(new B(i, this));
        }
        this.f2552y0.setFloatValues(dVar.f489b, f2);
        this.f2552y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2508a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.f2491F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f900a.f886a;
        k kVar2 = this.f2496L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2499O == 2 && (i = this.f2501Q) > -1 && (i2 = this.f2504T) != 0) {
            g gVar2 = this.f2491F;
            gVar2.f900a.j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f900a;
            if (fVar.f889d != valueOf) {
                fVar.f889d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2505U;
        if (this.f2499O == 1) {
            i3 = E.a.b(this.f2505U, l.t(getContext(), com.winpower.neonfit.R.attr.colorSurface, 0));
        }
        this.f2505U = i3;
        this.f2491F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f2494J;
        if (gVar3 != null && this.f2495K != null) {
            if (this.f2501Q > -1 && this.f2504T != 0) {
                gVar3.j(this.f2514d.isFocused() ? ColorStateList.valueOf(this.f2526k0) : ColorStateList.valueOf(this.f2504T));
                this.f2495K.j(ColorStateList.valueOf(this.f2504T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f2488C) {
            return 0;
        }
        int i = this.f2499O;
        d dVar = this.f2546v0;
        if (i == 0) {
            d2 = dVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d2 = dVar.d() / 2.0f;
        }
        return (int) d2;
    }

    public final p0.g d() {
        p0.g gVar = new p0.g();
        gVar.f3844c = l.T(getContext(), com.winpower.neonfit.R.attr.motionDurationShort2, 87);
        gVar.f3845d = l.U(getContext(), com.winpower.neonfit.R.attr.motionEasingLinearInterpolator, AbstractC0389a.f4369a);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2514d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z2 = this.f2490E;
            this.f2490E = false;
            CharSequence hint = editText.getHint();
            this.f2514d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2514d.setHint(hint);
                this.f2490E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2508a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f2514d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2485A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2485A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f2488C;
        d dVar = this.f2546v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f463B != null) {
                RectF rectF = dVar.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = dVar.f474N;
                    textPaint.setTextSize(dVar.f468G);
                    float f2 = dVar.f505p;
                    float f3 = dVar.f506q;
                    float f4 = dVar.f467F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f494d0 <= 1 || dVar.f464C) {
                        canvas.translate(f2, f3);
                        dVar.f485Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f505p - dVar.f485Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f490b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.H;
                            float f7 = dVar.f469I;
                            float f8 = dVar.f470J;
                            int i3 = dVar.f471K;
                            textPaint.setShadowLayer(f6, f7, f8, E.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f485Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f488a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.H;
                            float f10 = dVar.f469I;
                            float f11 = dVar.f470J;
                            int i4 = dVar.f471K;
                            textPaint.setShadowLayer(f9, f10, f11, E.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f485Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f492c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.H, dVar.f469I, dVar.f470J, dVar.f471K);
                        }
                        String trim = dVar.f492c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f485Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2495K == null || (gVar = this.f2494J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f2514d.isFocused()) {
            Rect bounds = this.f2495K.getBounds();
            Rect bounds2 = this.f2494J.getBounds();
            float f13 = dVar.f489b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0389a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0389a.c(centerX, bounds2.right, f13);
            this.f2495K.draw(canvas);
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
        if (this.f2554z0) {
            return;
        }
        this.f2554z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f2546v0;
        if (dVar != null) {
            dVar.f472L = drawableState;
            ColorStateList colorStateList2 = dVar.f500k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.f2514d != null) {
                    WeakHashMap weakHashMap = P.f711a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2554z0 = false;
            }
        }
        z2 = false;
        if (this.f2514d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2554z0 = false;
    }

    public final boolean e() {
        return this.f2488C && !TextUtils.isEmpty(this.f2489D) && (this.f2491F instanceof Q0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2514d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.winpower.neonfit.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        N0.a aVar = new N0.a(f2);
        N0.a aVar2 = new N0.a(f2);
        N0.a aVar3 = new N0.a(dimensionPixelOffset);
        N0.a aVar4 = new N0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f929a = iVar;
        kVar.f930b = iVar2;
        kVar.f931c = iVar3;
        kVar.f932d = iVar4;
        kVar.e = aVar;
        kVar.f933f = aVar2;
        kVar.f934g = aVar4;
        kVar.f935h = aVar3;
        kVar.i = eVar;
        kVar.j = eVar2;
        kVar.f936k = eVar3;
        kVar.f937l = eVar4;
        EditText editText2 = this.f2514d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f899w;
            TypedValue X2 = AbstractC0058a.X(context, com.winpower.neonfit.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = X2.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : X2.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f900a;
        if (fVar.f891g == null) {
            fVar.f891g = new Rect();
        }
        gVar.f900a.f891g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2514d.getCompoundPaddingLeft() : this.f2512c.c() : this.f2510b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2514d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f2499O;
        if (i == 1 || i == 2) {
            return this.f2491F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2505U;
    }

    public int getBoxBackgroundMode() {
        return this.f2499O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2500P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e = m.e(this);
        RectF rectF = this.f2509a0;
        return e ? this.f2496L.f935h.a(rectF) : this.f2496L.f934g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e = m.e(this);
        RectF rectF = this.f2509a0;
        return e ? this.f2496L.f934g.a(rectF) : this.f2496L.f935h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e = m.e(this);
        RectF rectF = this.f2509a0;
        return e ? this.f2496L.e.a(rectF) : this.f2496L.f933f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e = m.e(this);
        RectF rectF = this.f2509a0;
        return e ? this.f2496L.f933f.a(rectF) : this.f2496L.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2530m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2532n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2502R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2503S;
    }

    public int getCounterMaxLength() {
        return this.f2527l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0267c0 c0267c0;
        if (this.f2525k && this.f2529m && (c0267c0 = this.f2533o) != null) {
            return c0267c0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2553z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2551y;
    }

    public ColorStateList getCursorColor() {
        return this.f2484A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2486B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2523i0;
    }

    public EditText getEditText() {
        return this.f2514d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2512c.f1048g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2512c.f1048g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2512c.f1052m;
    }

    public int getEndIconMode() {
        return this.f2512c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2512c.f1053n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2512c.f1048g;
    }

    public CharSequence getError() {
        u uVar = this.j;
        if (uVar.f1086q) {
            return uVar.f1085p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.f1089t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.f1088s;
    }

    public int getErrorCurrentTextColors() {
        C0267c0 c0267c0 = this.j.f1087r;
        if (c0267c0 != null) {
            return c0267c0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2512c.f1045c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.j;
        if (uVar.f1093x) {
            return uVar.f1092w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0267c0 c0267c0 = this.j.f1094y;
        if (c0267c0 != null) {
            return c0267c0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2488C) {
            return this.f2489D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2546v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f2546v0;
        return dVar.e(dVar.f500k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2524j0;
    }

    public D getLengthCounter() {
        return this.f2531n;
    }

    public int getMaxEms() {
        return this.f2519g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2517f;
    }

    public int getMinWidth() {
        return this.f2521h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2512c.f1048g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2512c.f1048g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2540s) {
            return this.f2538r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2545v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2543u;
    }

    public CharSequence getPrefixText() {
        return this.f2510b.f1110c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2510b.f1109b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2510b.f1109b;
    }

    public k getShapeAppearanceModel() {
        return this.f2496L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2510b.f1111d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2510b.f1111d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2510b.f1113g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2510b.f1114h;
    }

    public CharSequence getSuffixText() {
        return this.f2512c.f1055p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2512c.f1056q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2512c.f1056q;
    }

    public Typeface getTypeface() {
        return this.f2511b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2514d.getCompoundPaddingRight() : this.f2510b.a() : this.f2512c.c());
    }

    public final void i() {
        int i = this.f2499O;
        if (i == 0) {
            this.f2491F = null;
            this.f2494J = null;
            this.f2495K = null;
        } else if (i == 1) {
            this.f2491F = new g(this.f2496L);
            this.f2494J = new g();
            this.f2495K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2499O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2488C || (this.f2491F instanceof Q0.h)) {
                this.f2491F = new g(this.f2496L);
            } else {
                k kVar = this.f2496L;
                int i2 = Q0.h.f1019y;
                if (kVar == null) {
                    kVar = new k();
                }
                Q0.g gVar = new Q0.g(kVar, new RectF());
                Q0.h hVar = new Q0.h(gVar);
                hVar.f1020x = gVar;
                this.f2491F = hVar;
            }
            this.f2494J = null;
            this.f2495K = null;
        }
        s();
        x();
        if (this.f2499O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2500P = getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (H1.d.P(getContext())) {
                this.f2500P = getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2514d != null && this.f2499O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2514d;
                WeakHashMap weakHashMap = P.f711a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2514d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (H1.d.P(getContext())) {
                EditText editText2 = this.f2514d;
                WeakHashMap weakHashMap2 = P.f711a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2514d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2499O != 0) {
            t();
        }
        EditText editText3 = this.f2514d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2499O;
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
            int width = this.f2514d.getWidth();
            int gravity = this.f2514d.getGravity();
            d dVar = this.f2546v0;
            boolean b2 = dVar.b(dVar.f462A);
            dVar.f464C = b2;
            Rect rect = dVar.f493d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f486Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f486Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2509a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f486Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f464C) {
                        f5 = max + dVar.f486Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f464C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f486Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f2498N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2501Q);
                Q0.h hVar = (Q0.h) this.f2491F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f486Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2509a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f486Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0267c0 c0267c0, int i) {
        try {
            c0267c0.setTextAppearance(i);
            if (c0267c0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0267c0.setTextAppearance(com.winpower.neonfit.R.style.TextAppearance_AppCompat_Caption);
        c0267c0.setTextColor(b.a(getContext(), com.winpower.neonfit.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.j;
        return (uVar.f1084o != 1 || uVar.f1087r == null || TextUtils.isEmpty(uVar.f1085p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((A1.a) this.f2531n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2529m;
        int i = this.f2527l;
        String str = null;
        if (i == -1) {
            this.f2533o.setText(String.valueOf(length));
            this.f2533o.setContentDescription(null);
            this.f2529m = false;
        } else {
            this.f2529m = length > i;
            Context context = getContext();
            this.f2533o.setContentDescription(context.getString(this.f2529m ? com.winpower.neonfit.R.string.character_counter_overflowed_content_description : com.winpower.neonfit.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2527l)));
            if (z2 != this.f2529m) {
                o();
            }
            String str2 = K.b.f657b;
            K.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? K.b.e : K.b.f659d;
            C0267c0 c0267c0 = this.f2533o;
            String string = getContext().getString(com.winpower.neonfit.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2527l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                K.h hVar = K.i.f668a;
                str = bVar.c(string).toString();
            }
            c0267c0.setText(str);
        }
        if (this.f2514d == null || z2 == this.f2529m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0267c0 c0267c0 = this.f2533o;
        if (c0267c0 != null) {
            l(c0267c0, this.f2529m ? this.f2534p : this.f2536q);
            if (!this.f2529m && (colorStateList2 = this.f2551y) != null) {
                this.f2533o.setTextColor(colorStateList2);
            }
            if (!this.f2529m || (colorStateList = this.f2553z) == null) {
                return;
            }
            this.f2533o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2546v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f2512c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2487B0 = false;
        if (this.f2514d != null && this.f2514d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f2510b.getMeasuredHeight()))) {
            this.f2514d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.f2514d.post(new A0.b(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.f2514d;
        if (editText != null) {
            ThreadLocal threadLocal = H0.e.f516a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2506V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = H0.e.f516a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            H0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = H0.e.f517b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2494J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2502R, rect.right, i5);
            }
            g gVar2 = this.f2495K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2503S, rect.right, i6);
            }
            if (this.f2488C) {
                float textSize = this.f2514d.getTextSize();
                d dVar = this.f2546v0;
                if (dVar.f499h != textSize) {
                    dVar.f499h = textSize;
                    dVar.h(false);
                }
                int gravity = this.f2514d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f498g != i7) {
                    dVar.f498g = i7;
                    dVar.h(false);
                }
                if (dVar.f496f != gravity) {
                    dVar.f496f = gravity;
                    dVar.h(false);
                }
                if (this.f2514d == null) {
                    throw new IllegalStateException();
                }
                boolean e = m.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2507W;
                rect2.bottom = i8;
                int i9 = this.f2499O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e);
                    rect2.top = rect.top + this.f2500P;
                    rect2.right = h(rect.right, e);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, e);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e);
                } else {
                    rect2.left = this.f2514d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f2514d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = dVar.f493d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    dVar.f473M = true;
                }
                if (this.f2514d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f475O;
                textPaint.setTextSize(dVar.f499h);
                textPaint.setTypeface(dVar.f510u);
                textPaint.setLetterSpacing(dVar.f483W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f2514d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2499O != 1 || this.f2514d.getMinLines() > 1) ? rect.top + this.f2514d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f2514d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2499O != 1 || this.f2514d.getMinLines() > 1) ? rect.bottom - this.f2514d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f491c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f473M = true;
                }
                dVar.h(false);
                if (!e() || this.f2544u0) {
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
        boolean z2 = this.f2487B0;
        q qVar = this.f2512c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2487B0 = true;
        }
        if (this.f2541t != null && (editText = this.f2514d) != null) {
            this.f2541t.setGravity(editText.getGravity());
            this.f2541t.setPadding(this.f2514d.getCompoundPaddingLeft(), this.f2514d.getCompoundPaddingTop(), this.f2514d.getCompoundPaddingRight(), this.f2514d.getCompoundPaddingBottom());
        }
        qVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E e = (E) parcelable;
        super.onRestoreInstanceState(e.f1148a);
        setError(e.f1002c);
        if (e.f1003d) {
            post(new C1.e(1, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2497M) {
            c cVar = this.f2496L.e;
            RectF rectF = this.f2509a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2496L.f933f.a(rectF);
            float a4 = this.f2496L.f935h.a(rectF);
            float a5 = this.f2496L.f934g.a(rectF);
            k kVar = this.f2496L;
            H1.d dVar = kVar.f929a;
            H1.d dVar2 = kVar.f930b;
            H1.d dVar3 = kVar.f932d;
            H1.d dVar4 = kVar.f931c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(dVar2);
            j.b(dVar);
            j.b(dVar4);
            j.b(dVar3);
            N0.a aVar = new N0.a(a3);
            N0.a aVar2 = new N0.a(a2);
            N0.a aVar3 = new N0.a(a5);
            N0.a aVar4 = new N0.a(a4);
            k kVar2 = new k();
            kVar2.f929a = dVar2;
            kVar2.f930b = dVar;
            kVar2.f931c = dVar3;
            kVar2.f932d = dVar4;
            kVar2.e = aVar;
            kVar2.f933f = aVar2;
            kVar2.f934g = aVar4;
            kVar2.f935h = aVar3;
            kVar2.i = eVar;
            kVar2.j = eVar2;
            kVar2.f936k = eVar3;
            kVar2.f937l = eVar4;
            this.f2497M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        E e = new E(super.onSaveInstanceState());
        if (m()) {
            e.f1002c = getError();
        }
        q qVar = this.f2512c;
        e.f1003d = qVar.i != 0 && qVar.f1048g.f2437d;
        return e;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2484A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue V2 = AbstractC0058a.V(context, com.winpower.neonfit.R.attr.colorControlActivated);
            if (V2 != null) {
                int i = V2.resourceId;
                if (i != 0) {
                    colorStateList2 = l.v(context, i);
                } else {
                    int i2 = V2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2514d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f2514d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f2533o != null && this.f2529m)) && (colorStateList = this.f2486B) != null) {
                colorStateList2 = colorStateList;
            }
            F.a.h(mutate, colorStateList2);
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
        if (this.f2514d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            z zVar = this.f2510b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.f2514d.getPaddingLeft();
                if (this.f2513c0 == null || this.f2515d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2513c0 = colorDrawable3;
                    this.f2515d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f2514d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2513c0;
                if (drawable2 != colorDrawable4) {
                    this.f2514d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f2512c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f1055p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f1056q.getMeasuredWidth() - this.f2514d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f1045c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f1048g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f2514d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2518f0;
                        if (colorDrawable != null || this.f2520g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2518f0 = colorDrawable5;
                                this.f2520g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2518f0;
                            if (drawable == colorDrawable2) {
                                this.f2522h0 = drawable;
                                this.f2514d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2520g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f2514d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2518f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2518f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.f2514d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2518f0) {
                            this.f2514d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2522h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2518f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f2512c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f1056q.getMeasuredWidth() - this.f2514d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f2514d.getCompoundDrawablesRelative();
                colorDrawable = this.f2518f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2518f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2513c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f2514d.getCompoundDrawablesRelative();
            this.f2514d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2513c0 = null;
            z2 = true;
            qVar = this.f2512c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f1056q.getMeasuredWidth() - this.f2514d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f2514d.getCompoundDrawablesRelative();
            colorDrawable = this.f2518f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2518f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f2512c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f1056q.getMeasuredWidth() - this.f2514d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f2514d.getCompoundDrawablesRelative();
        colorDrawable = this.f2518f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2518f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0267c0 c0267c0;
        EditText editText = this.f2514d;
        if (editText == null || this.f2499O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0293p0.f3690a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0302u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2529m && (c0267c0 = this.f2533o) != null) {
            mutate.setColorFilter(C0302u.c(c0267c0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f2514d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f2514d;
        if (editText == null || this.f2491F == null) {
            return;
        }
        if ((this.f2493I || editText.getBackground() == null) && this.f2499O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2514d;
            WeakHashMap weakHashMap = P.f711a;
            editText2.setBackground(editTextBoxBackground);
            this.f2493I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2505U != i) {
            this.f2505U = i;
            this.o0 = i;
            this.f2537q0 = i;
            this.f2539r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o0 = defaultColor;
        this.f2505U = defaultColor;
        this.f2535p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2537q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2539r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2499O) {
            return;
        }
        this.f2499O = i;
        if (this.f2514d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2500P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e = this.f2496L.e();
        c cVar = this.f2496L.e;
        H1.d s2 = l.s(i);
        e.f920a = s2;
        j.b(s2);
        e.e = cVar;
        c cVar2 = this.f2496L.f933f;
        H1.d s3 = l.s(i);
        e.f921b = s3;
        j.b(s3);
        e.f924f = cVar2;
        c cVar3 = this.f2496L.f935h;
        H1.d s4 = l.s(i);
        e.f923d = s4;
        j.b(s4);
        e.f926h = cVar3;
        c cVar4 = this.f2496L.f934g;
        H1.d s5 = l.s(i);
        e.f922c = s5;
        j.b(s5);
        e.f925g = cVar4;
        this.f2496L = e.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2530m0 != i) {
            this.f2530m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2526k0 = colorStateList.getDefaultColor();
            this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2528l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2530m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2530m0 != colorStateList.getDefaultColor()) {
            this.f2530m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2532n0 != colorStateList) {
            this.f2532n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2502R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2503S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2525k != z2) {
            u uVar = this.j;
            if (z2) {
                C0267c0 c0267c0 = new C0267c0(getContext(), null);
                this.f2533o = c0267c0;
                c0267c0.setId(com.winpower.neonfit.R.id.textinput_counter);
                Typeface typeface = this.f2511b0;
                if (typeface != null) {
                    this.f2533o.setTypeface(typeface);
                }
                this.f2533o.setMaxLines(1);
                uVar.a(this.f2533o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2533o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.winpower.neonfit.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2533o != null) {
                    EditText editText = this.f2514d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f2533o, 2);
                this.f2533o = null;
            }
            this.f2525k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2527l != i) {
            if (i > 0) {
                this.f2527l = i;
            } else {
                this.f2527l = -1;
            }
            if (!this.f2525k || this.f2533o == null) {
                return;
            }
            EditText editText = this.f2514d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2534p != i) {
            this.f2534p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2553z != colorStateList) {
            this.f2553z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2536q != i) {
            this.f2536q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2551y != colorStateList) {
            this.f2551y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2484A != colorStateList) {
            this.f2484A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2486B != colorStateList) {
            this.f2486B = colorStateList;
            if (m() || (this.f2533o != null && this.f2529m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2523i0 = colorStateList;
        this.f2524j0 = colorStateList;
        if (this.f2514d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2512c.f1048g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2512c.f1048g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f2512c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f1048g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f2512c;
        Drawable F2 = i != 0 ? H1.d.F(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f1048g;
        checkableImageButton.setImageDrawable(F2);
        if (F2 != null) {
            ColorStateList colorStateList = qVar.f1050k;
            PorterDuff.Mode mode = qVar.f1051l;
            TextInputLayout textInputLayout = qVar.f1043a;
            l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            l.R(textInputLayout, checkableImageButton, qVar.f1050k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f2512c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f1052m) {
            qVar.f1052m = i;
            CheckableImageButton checkableImageButton = qVar.f1048g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f1045c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2512c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2512c;
        View.OnLongClickListener onLongClickListener = qVar.f1054o;
        CheckableImageButton checkableImageButton = qVar.f1048g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.Z(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2512c;
        qVar.f1054o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f1048g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.Z(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f2512c;
        qVar.f1053n = scaleType;
        qVar.f1048g.setScaleType(scaleType);
        qVar.f1045c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2512c;
        if (qVar.f1050k != colorStateList) {
            qVar.f1050k = colorStateList;
            l.d(qVar.f1043a, qVar.f1048g, colorStateList, qVar.f1051l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2512c;
        if (qVar.f1051l != mode) {
            qVar.f1051l = mode;
            l.d(qVar.f1043a, qVar.f1048g, qVar.f1050k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2512c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.j;
        if (!uVar.f1086q) {
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
        uVar.f1085p = charSequence;
        uVar.f1087r.setText(charSequence);
        int i = uVar.f1083n;
        if (i != 1) {
            uVar.f1084o = 1;
        }
        uVar.i(i, uVar.f1084o, uVar.h(uVar.f1087r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.j;
        uVar.f1089t = i;
        C0267c0 c0267c0 = uVar.f1087r;
        if (c0267c0 != null) {
            WeakHashMap weakHashMap = P.f711a;
            c0267c0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.j;
        uVar.f1088s = charSequence;
        C0267c0 c0267c0 = uVar.f1087r;
        if (c0267c0 != null) {
            c0267c0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.j;
        if (uVar.f1086q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.f1079h;
        if (z2) {
            C0267c0 c0267c0 = new C0267c0(uVar.f1078g, null);
            uVar.f1087r = c0267c0;
            c0267c0.setId(com.winpower.neonfit.R.id.textinput_error);
            uVar.f1087r.setTextAlignment(5);
            Typeface typeface = uVar.f1072B;
            if (typeface != null) {
                uVar.f1087r.setTypeface(typeface);
            }
            int i = uVar.f1090u;
            uVar.f1090u = i;
            C0267c0 c0267c02 = uVar.f1087r;
            if (c0267c02 != null) {
                textInputLayout.l(c0267c02, i);
            }
            ColorStateList colorStateList = uVar.f1091v;
            uVar.f1091v = colorStateList;
            C0267c0 c0267c03 = uVar.f1087r;
            if (c0267c03 != null && colorStateList != null) {
                c0267c03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f1088s;
            uVar.f1088s = charSequence;
            C0267c0 c0267c04 = uVar.f1087r;
            if (c0267c04 != null) {
                c0267c04.setContentDescription(charSequence);
            }
            int i2 = uVar.f1089t;
            uVar.f1089t = i2;
            C0267c0 c0267c05 = uVar.f1087r;
            if (c0267c05 != null) {
                WeakHashMap weakHashMap = P.f711a;
                c0267c05.setAccessibilityLiveRegion(i2);
            }
            uVar.f1087r.setVisibility(4);
            uVar.a(uVar.f1087r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f1087r, 0);
            uVar.f1087r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f1086q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f2512c;
        qVar.i(i != 0 ? H1.d.F(qVar.getContext(), i) : null);
        l.R(qVar.f1043a, qVar.f1045c, qVar.f1046d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2512c;
        CheckableImageButton checkableImageButton = qVar.f1045c;
        View.OnLongClickListener onLongClickListener = qVar.f1047f;
        checkableImageButton.setOnClickListener(onClickListener);
        l.Z(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2512c;
        qVar.f1047f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f1045c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.Z(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2512c;
        if (qVar.f1046d != colorStateList) {
            qVar.f1046d = colorStateList;
            l.d(qVar.f1043a, qVar.f1045c, colorStateList, qVar.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2512c;
        if (qVar.e != mode) {
            qVar.e = mode;
            l.d(qVar.f1043a, qVar.f1045c, qVar.f1046d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.j;
        uVar.f1090u = i;
        C0267c0 c0267c0 = uVar.f1087r;
        if (c0267c0 != null) {
            uVar.f1079h.l(c0267c0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.j;
        uVar.f1091v = colorStateList;
        C0267c0 c0267c0 = uVar.f1087r;
        if (c0267c0 == null || colorStateList == null) {
            return;
        }
        c0267c0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2548w0 != z2) {
            this.f2548w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.j;
        if (isEmpty) {
            if (uVar.f1093x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f1093x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f1092w = charSequence;
        uVar.f1094y.setText(charSequence);
        int i = uVar.f1083n;
        if (i != 2) {
            uVar.f1084o = 2;
        }
        uVar.i(i, uVar.f1084o, uVar.h(uVar.f1094y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.j;
        uVar.f1071A = colorStateList;
        C0267c0 c0267c0 = uVar.f1094y;
        if (c0267c0 == null || colorStateList == null) {
            return;
        }
        c0267c0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.j;
        if (uVar.f1093x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0267c0 c0267c0 = new C0267c0(uVar.f1078g, null);
            uVar.f1094y = c0267c0;
            c0267c0.setId(com.winpower.neonfit.R.id.textinput_helper_text);
            uVar.f1094y.setTextAlignment(5);
            Typeface typeface = uVar.f1072B;
            if (typeface != null) {
                uVar.f1094y.setTypeface(typeface);
            }
            uVar.f1094y.setVisibility(4);
            uVar.f1094y.setAccessibilityLiveRegion(1);
            int i = uVar.f1095z;
            uVar.f1095z = i;
            C0267c0 c0267c02 = uVar.f1094y;
            if (c0267c02 != null) {
                c0267c02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f1071A;
            uVar.f1071A = colorStateList;
            C0267c0 c0267c03 = uVar.f1094y;
            if (c0267c03 != null && colorStateList != null) {
                c0267c03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f1094y, 1);
            uVar.f1094y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f1083n;
            if (i2 == 2) {
                uVar.f1084o = 0;
            }
            uVar.i(i2, uVar.f1084o, uVar.h(uVar.f1094y, ""));
            uVar.g(uVar.f1094y, 1);
            uVar.f1094y = null;
            TextInputLayout textInputLayout = uVar.f1079h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f1093x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.j;
        uVar.f1095z = i;
        C0267c0 c0267c0 = uVar.f1094y;
        if (c0267c0 != null) {
            c0267c0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2488C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2550x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2488C) {
            this.f2488C = z2;
            if (z2) {
                CharSequence hint = this.f2514d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2489D)) {
                        setHint(hint);
                    }
                    this.f2514d.setHint((CharSequence) null);
                }
                this.f2490E = true;
            } else {
                this.f2490E = false;
                if (!TextUtils.isEmpty(this.f2489D) && TextUtils.isEmpty(this.f2514d.getHint())) {
                    this.f2514d.setHint(this.f2489D);
                }
                setHintInternal(null);
            }
            if (this.f2514d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f2546v0;
        TextInputLayout textInputLayout = dVar.f487a;
        K0.d dVar2 = new K0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.j;
        if (colorStateList != null) {
            dVar.f500k = colorStateList;
        }
        float f2 = dVar2.f686k;
        if (f2 != 0.0f) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f679a;
        if (colorStateList2 != null) {
            dVar.f481U = colorStateList2;
        }
        dVar.f479S = dVar2.e;
        dVar.f480T = dVar2.f683f;
        dVar.f478R = dVar2.f684g;
        dVar.f482V = dVar2.i;
        K0.a aVar = dVar.f514y;
        if (aVar != null) {
            aVar.f674h = true;
        }
        C1.d dVar3 = new C1.d(3, dVar);
        dVar2.a();
        dVar.f514y = new K0.a(dVar3, dVar2.f689n);
        dVar2.c(textInputLayout.getContext(), dVar.f514y);
        dVar.h(false);
        this.f2524j0 = dVar.f500k;
        if (this.f2514d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2524j0 != colorStateList) {
            if (this.f2523i0 == null) {
                d dVar = this.f2546v0;
                if (dVar.f500k != colorStateList) {
                    dVar.f500k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f2524j0 = colorStateList;
            if (this.f2514d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(D d2) {
        this.f2531n = d2;
    }

    public void setMaxEms(int i) {
        this.f2519g = i;
        EditText editText = this.f2514d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.f2514d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2517f = i;
        EditText editText = this.f2514d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f2521h = i;
        EditText editText = this.f2514d;
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
        q qVar = this.f2512c;
        qVar.f1048g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f2512c;
        qVar.f1048g.setImageDrawable(i != 0 ? H1.d.F(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f2512c;
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
        q qVar = this.f2512c;
        qVar.f1050k = colorStateList;
        l.d(qVar.f1043a, qVar.f1048g, colorStateList, qVar.f1051l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2512c;
        qVar.f1051l = mode;
        l.d(qVar.f1043a, qVar.f1048g, qVar.f1050k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2541t == null) {
            C0267c0 c0267c0 = new C0267c0(getContext(), null);
            this.f2541t = c0267c0;
            c0267c0.setId(com.winpower.neonfit.R.id.textinput_placeholder);
            this.f2541t.setImportantForAccessibility(2);
            p0.g d2 = d();
            this.f2547w = d2;
            d2.f3843b = 67L;
            this.f2549x = d();
            setPlaceholderTextAppearance(this.f2545v);
            setPlaceholderTextColor(this.f2543u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2540s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2538r = charSequence;
        }
        EditText editText = this.f2514d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2545v = i;
        C0267c0 c0267c0 = this.f2541t;
        if (c0267c0 != null) {
            c0267c0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2543u != colorStateList) {
            this.f2543u = colorStateList;
            C0267c0 c0267c0 = this.f2541t;
            if (c0267c0 == null || colorStateList == null) {
                return;
            }
            c0267c0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f2510b;
        zVar.getClass();
        zVar.f1110c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f1109b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2510b.f1109b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2510b.f1109b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f2491F;
        if (gVar == null || gVar.f900a.f886a == kVar) {
            return;
        }
        this.f2496L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2510b.f1111d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2510b.f1111d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? H1.d.F(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f2510b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f1113g) {
            zVar.f1113g = i;
            CheckableImageButton checkableImageButton = zVar.f1111d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f2510b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.f1111d;
        checkableImageButton.setOnClickListener(onClickListener);
        l.Z(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f2510b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f1111d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.Z(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f2510b;
        zVar.f1114h = scaleType;
        zVar.f1111d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f2510b;
        if (zVar.e != colorStateList) {
            zVar.e = colorStateList;
            l.d(zVar.f1108a, zVar.f1111d, colorStateList, zVar.f1112f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f2510b;
        if (zVar.f1112f != mode) {
            zVar.f1112f = mode;
            l.d(zVar.f1108a, zVar.f1111d, zVar.e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2510b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f2512c;
        qVar.getClass();
        qVar.f1055p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f1056q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2512c.f1056q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2512c.f1056q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C c2) {
        EditText editText = this.f2514d;
        if (editText != null) {
            P.l(editText, c2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2511b0) {
            this.f2511b0 = typeface;
            this.f2546v0.m(typeface);
            u uVar = this.j;
            if (typeface != uVar.f1072B) {
                uVar.f1072B = typeface;
                C0267c0 c0267c0 = uVar.f1087r;
                if (c0267c0 != null) {
                    c0267c0.setTypeface(typeface);
                }
                C0267c0 c0267c02 = uVar.f1094y;
                if (c0267c02 != null) {
                    c0267c02.setTypeface(typeface);
                }
            }
            C0267c0 c0267c03 = this.f2533o;
            if (c0267c03 != null) {
                c0267c03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2499O != 1) {
            FrameLayout frameLayout = this.f2508a;
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
        C0267c0 c0267c0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2514d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2514d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2523i0;
        d dVar = this.f2546v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2523i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.s0) : this.s0));
        } else if (m()) {
            C0267c0 c0267c02 = this.j.f1087r;
            dVar.i(c0267c02 != null ? c0267c02.getTextColors() : null);
        } else if (this.f2529m && (c0267c0 = this.f2533o) != null) {
            dVar.i(c0267c0.getTextColors());
        } else if (z5 && (colorStateList = this.f2524j0) != null && dVar.f500k != colorStateList) {
            dVar.f500k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f2512c;
        z zVar = this.f2510b;
        if (z4 || !this.f2548w0 || (isEnabled() && z5)) {
            if (z3 || this.f2544u0) {
                ValueAnimator valueAnimator = this.f2552y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2552y0.cancel();
                }
                if (z2 && this.f2550x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f2544u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f2514d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.j = false;
                zVar.e();
                qVar.f1057r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2544u0) {
            ValueAnimator valueAnimator2 = this.f2552y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2552y0.cancel();
            }
            if (z2 && this.f2550x0) {
                a(0.0f);
            } else {
                dVar.k(0.0f);
            }
            if (e() && !((Q0.h) this.f2491F).f1020x.f1018q.isEmpty() && e()) {
                ((Q0.h) this.f2491F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2544u0 = true;
            C0267c0 c0267c03 = this.f2541t;
            if (c0267c03 != null && this.f2540s) {
                c0267c03.setText((CharSequence) null);
                p0.q.a(this.f2508a, this.f2549x);
                this.f2541t.setVisibility(4);
            }
            zVar.j = true;
            zVar.e();
            qVar.f1057r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((A1.a) this.f2531n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2508a;
        if (length != 0 || this.f2544u0) {
            C0267c0 c0267c0 = this.f2541t;
            if (c0267c0 == null || !this.f2540s) {
                return;
            }
            c0267c0.setText((CharSequence) null);
            p0.q.a(frameLayout, this.f2549x);
            this.f2541t.setVisibility(4);
            return;
        }
        if (this.f2541t == null || !this.f2540s || TextUtils.isEmpty(this.f2538r)) {
            return;
        }
        this.f2541t.setText(this.f2538r);
        p0.q.a(frameLayout, this.f2547w);
        this.f2541t.setVisibility(0);
        this.f2541t.bringToFront();
        announceForAccessibility(this.f2538r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2532n0.getDefaultColor();
        int colorForState = this.f2532n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2532n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2504T = colorForState2;
        } else if (z3) {
            this.f2504T = colorForState;
        } else {
            this.f2504T = defaultColor;
        }
    }

    public final void x() {
        C0267c0 c0267c0;
        EditText editText;
        EditText editText2;
        if (this.f2491F == null || this.f2499O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2514d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2514d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2504T = this.s0;
        } else if (m()) {
            if (this.f2532n0 != null) {
                w(z3, z2);
            } else {
                this.f2504T = getErrorCurrentTextColors();
            }
        } else if (!this.f2529m || (c0267c0 = this.f2533o) == null) {
            if (z3) {
                this.f2504T = this.f2530m0;
            } else if (z2) {
                this.f2504T = this.f2528l0;
            } else {
                this.f2504T = this.f2526k0;
            }
        } else if (this.f2532n0 != null) {
            w(z3, z2);
        } else {
            this.f2504T = c0267c0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f2512c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f1045c;
        ColorStateList colorStateList = qVar.f1046d;
        TextInputLayout textInputLayout = qVar.f1043a;
        l.R(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f1050k;
        CheckableImageButton checkableImageButton2 = qVar.f1048g;
        l.R(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof Q0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                l.d(textInputLayout, checkableImageButton2, qVar.f1050k, qVar.f1051l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                F.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f2510b;
        l.R(zVar.f1108a, zVar.f1111d, zVar.e);
        if (this.f2499O == 2) {
            int i = this.f2501Q;
            if (z3 && isEnabled()) {
                this.f2501Q = this.f2503S;
            } else {
                this.f2501Q = this.f2502R;
            }
            if (this.f2501Q != i && e() && !this.f2544u0) {
                if (e()) {
                    ((Q0.h) this.f2491F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f2499O == 1) {
            if (!isEnabled()) {
                this.f2505U = this.f2535p0;
            } else if (z2 && !z3) {
                this.f2505U = this.f2539r0;
            } else if (z3) {
                this.f2505U = this.f2537q0;
            } else {
                this.f2505U = this.o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2510b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2512c.f1048g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2512c.f1048g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2512c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2512c.f1048g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f2512c;
        CheckableImageButton checkableImageButton = qVar.f1048g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f1050k;
            PorterDuff.Mode mode = qVar.f1051l;
            TextInputLayout textInputLayout = qVar.f1043a;
            l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            l.R(textInputLayout, checkableImageButton, qVar.f1050k);
        }
    }
}
