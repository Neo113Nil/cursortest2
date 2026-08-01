package com.google.android.material.textfield;

import A.b;
import G0.d;
import G0.m;
import G0.o;
import K.C0006g;
import K.C0011l;
import K.I;
import K.S;
import M0.c;
import M0.e;
import M0.f;
import M0.g;
import M0.i;
import M0.j;
import M0.k;
import P0.A;
import P0.B;
import P0.C;
import P0.D;
import P0.E;
import P0.h;
import P0.p;
import P0.s;
import P0.t;
import P0.w;
import P0.y;
import P0.z;
import R0.a;
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
import k0.C0179h;
import k0.q;
import l.AbstractC0222l0;
import l.C0202b0;
import l.C0237t;
import s0.AbstractC0283a;
import t0.AbstractC0299a;
import u1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1885A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1886A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1887B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1888B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1889C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1890D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1891E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1892G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1893H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1894I;

    /* renamed from: J, reason: collision with root package name */
    public g f1895J;

    /* renamed from: K, reason: collision with root package name */
    public g f1896K;

    /* renamed from: L, reason: collision with root package name */
    public k f1897L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1898M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1899N;

    /* renamed from: O, reason: collision with root package name */
    public int f1900O;

    /* renamed from: P, reason: collision with root package name */
    public int f1901P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1902Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1903R;

    /* renamed from: S, reason: collision with root package name */
    public int f1904S;

    /* renamed from: T, reason: collision with root package name */
    public int f1905T;

    /* renamed from: U, reason: collision with root package name */
    public int f1906U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1907V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1908W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1909a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1910a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f1911b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1912b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f1913c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1914c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1915d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1916e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1917e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1918f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1919f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1920g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1921g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1922h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f1923i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f1924j;
    public ColorStateList j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1925k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1926k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1927l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1928l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1929m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1930m0;

    /* renamed from: n, reason: collision with root package name */
    public D f1931n;
    public ColorStateList n0;

    /* renamed from: o, reason: collision with root package name */
    public C0202b0 f1932o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1933o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1934p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1935p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1936q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1937q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1938r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1939r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1940s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1941s0;

    /* renamed from: t, reason: collision with root package name */
    public C0202b0 f1942t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1943t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f1944u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1945u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1946v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f1947v0;

    /* renamed from: w, reason: collision with root package name */
    public C0179h f1948w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1949w0;

    /* renamed from: x, reason: collision with root package name */
    public C0179h f1950x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1951x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1952y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f1953y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1954z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1955z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.glasspulse.glasspulse.R.attr.textInputStyle, com.glasspulse.glasspulse.R.style.Widget_Design_TextInputLayout), attributeSet, com.glasspulse.glasspulse.R.attr.textInputStyle);
        this.f1918f = -1;
        this.f1920g = -1;
        this.h = -1;
        this.i = -1;
        this.f1924j = new t(this);
        this.f1931n = new C0006g(2);
        this.f1907V = new Rect();
        this.f1908W = new Rect();
        this.f1910a0 = new RectF();
        this.f1917e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f1947v0 = dVar;
        this.f1888B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1909a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0299a.f3822a;
        dVar.f197Q = linearInterpolator;
        dVar.h(false);
        dVar.f196P = linearInterpolator;
        dVar.h(false);
        if (dVar.f218g != 8388659) {
            dVar.f218g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0283a.f3741A;
        m.a(context2, attributeSet, com.glasspulse.glasspulse.R.attr.textInputStyle, com.glasspulse.glasspulse.R.style.Widget_Design_TextInputLayout);
        m.b(context2, attributeSet, iArr, com.glasspulse.glasspulse.R.attr.textInputStyle, com.glasspulse.glasspulse.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.glasspulse.glasspulse.R.attr.textInputStyle, com.glasspulse.glasspulse.R.style.Widget_Design_TextInputLayout);
        C0011l c0011l = new C0011l(context2, obtainStyledAttributes);
        y yVar = new y(this, c0011l);
        this.f1911b = yVar;
        this.f1889C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f1951x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1949w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1897L = k.b(context2, attributeSet, com.glasspulse.glasspulse.R.attr.textInputStyle, com.glasspulse.glasspulse.R.style.Widget_Design_TextInputLayout).a();
        this.f1899N = context2.getResources().getDimensionPixelOffset(com.glasspulse.glasspulse.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1901P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1903R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1904S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1902Q = this.f1903R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1897L.e();
        if (dimension >= 0.0f) {
            e2.f518e = new M0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f519f = new M0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f520g = new M0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new M0.a(dimension4);
        }
        this.f1897L = e2.a();
        ColorStateList B2 = u1.d.B(context2, c0011l, 7);
        if (B2 != null) {
            int defaultColor = B2.getDefaultColor();
            this.f1933o0 = defaultColor;
            this.f1906U = defaultColor;
            if (B2.isStateful()) {
                this.f1935p0 = B2.getColorForState(new int[]{-16842910}, -1);
                this.f1937q0 = B2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1939r0 = B2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1937q0 = this.f1933o0;
                ColorStateList A2 = u1.d.A(context2, com.glasspulse.glasspulse.R.color.mtrl_filled_background_color);
                this.f1935p0 = A2.getColorForState(new int[]{-16842910}, -1);
                this.f1939r0 = A2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1906U = 0;
            this.f1933o0 = 0;
            this.f1935p0 = 0;
            this.f1937q0 = 0;
            this.f1939r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = c0011l.g(1);
            this.j0 = g2;
            this.f1923i0 = g2;
        }
        ColorStateList B3 = u1.d.B(context2, c0011l, 14);
        this.f1930m0 = obtainStyledAttributes.getColor(14, 0);
        this.f1926k0 = b.a(context2, com.glasspulse.glasspulse.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1941s0 = b.a(context2, com.glasspulse.glasspulse.R.color.mtrl_textinput_disabled_color);
        this.f1928l0 = b.a(context2, com.glasspulse.glasspulse.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (B3 != null) {
            setBoxStrokeColorStateList(B3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(u1.d.B(context2, c0011l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1885A = c0011l.g(24);
        this.f1887B = c0011l.g(25);
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
        this.f1936q = obtainStyledAttributes.getResourceId(22, 0);
        this.f1934p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1934p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1936q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0011l.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0011l.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0011l.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0011l.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0011l.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0011l.g(58));
        }
        p pVar = new p(this, c0011l);
        this.f1913c = pVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0011l.t();
        setImportantForAccessibility(2);
        I.m(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || l.M(editText)) {
            return this.F;
        }
        int u2 = l.u(this.d, com.glasspulse.glasspulse.R.attr.colorControlHighlight);
        int i = this.f1900O;
        int[][] iArr = C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1906U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{l.R(u2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue h02 = l.h0(context, com.glasspulse.glasspulse.R.attr.colorSurface, "TextInputLayout");
        int i3 = h02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : h02.data;
        g gVar3 = new g(gVar2.f495a.f481a);
        int R2 = l.R(u2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{R2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{R2, a2});
        g gVar4 = new g(gVar2.f495a.f481a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1893H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1893H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1893H.addState(new int[0], f(false));
        }
        return this.f1893H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1892G == null) {
            this.f1892G = f(true);
        }
        return this.f1892G;
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
        int i = this.f1918f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1920g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1894I = false;
        i();
        setTextInputAccessibilityDelegate(new C(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f1947v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f203W != letterSpacing) {
            dVar.f203W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f218g != i4) {
            dVar.f218g = i4;
            dVar.h(false);
        }
        if (dVar.f216f != gravity) {
            dVar.f216f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = S.f351a;
        this.f1943t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new z(this, editText));
        if (this.f1923i0 == null) {
            this.f1923i0 = this.d.getHintTextColors();
        }
        if (this.f1889C) {
            if (TextUtils.isEmpty(this.f1890D)) {
                CharSequence hint = this.d.getHint();
                this.f1916e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1891E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f1932o != null) {
            n(this.d.getText());
        }
        r();
        this.f1924j.b();
        this.f1911b.bringToFront();
        p pVar = this.f1913c;
        pVar.bringToFront();
        Iterator it = this.f1917e0.iterator();
        while (it.hasNext()) {
            ((P0.m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1890D)) {
            return;
        }
        this.f1890D = charSequence;
        d dVar = this.f1947v0;
        if (charSequence == null || !TextUtils.equals(dVar.f182A, charSequence)) {
            dVar.f182A = charSequence;
            dVar.f183B = null;
            Bitmap bitmap = dVar.f186E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f186E = null;
            }
            dVar.h(false);
        }
        if (this.f1945u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1940s == z2) {
            return;
        }
        if (z2) {
            C0202b0 c0202b0 = this.f1942t;
            if (c0202b0 != null) {
                this.f1909a.addView(c0202b0);
                this.f1942t.setVisibility(0);
            }
        } else {
            C0202b0 c0202b02 = this.f1942t;
            if (c0202b02 != null) {
                c0202b02.setVisibility(8);
            }
            this.f1942t = null;
        }
        this.f1940s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f1947v0;
        if (dVar.f209b == f2) {
            return;
        }
        if (this.f1953y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1953y0 = valueAnimator;
            valueAnimator.setInterpolator(l.g0(getContext(), com.glasspulse.glasspulse.R.attr.motionEasingEmphasizedInterpolator, AbstractC0299a.f3823b));
            this.f1953y0.setDuration(l.f0(getContext(), com.glasspulse.glasspulse.R.attr.motionDurationMedium4, 167));
            this.f1953y0.addUpdateListener(new B(i, this));
        }
        this.f1953y0.setFloatValues(dVar.f209b, f2);
        this.f1953y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1909a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f495a.f481a;
        k kVar2 = this.f1897L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1900O == 2 && (i = this.f1902Q) > -1 && (i2 = this.f1905T) != 0) {
            g gVar2 = this.F;
            gVar2.f495a.f487j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f495a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1906U;
        if (this.f1900O == 1) {
            i3 = C.a.b(this.f1906U, l.t(getContext(), com.glasspulse.glasspulse.R.attr.colorSurface, 0));
        }
        this.f1906U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1895J;
        if (gVar3 != null && this.f1896K != null) {
            if (this.f1902Q > -1 && this.f1905T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f1926k0) : ColorStateList.valueOf(this.f1905T));
                this.f1896K.j(ColorStateList.valueOf(this.f1905T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1889C) {
            return 0;
        }
        int i = this.f1900O;
        d dVar = this.f1947v0;
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

    public final C0179h d() {
        C0179h c0179h = new C0179h();
        c0179h.f2772c = l.f0(getContext(), com.glasspulse.glasspulse.R.attr.motionDurationShort2, 87);
        c0179h.d = l.g0(getContext(), com.glasspulse.glasspulse.R.attr.motionEasingLinearInterpolator, AbstractC0299a.f3822a);
        return c0179h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1916e != null) {
            boolean z2 = this.f1891E;
            this.f1891E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1916e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1891E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1909a;
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
        this.f1886A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1886A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1889C;
        d dVar = this.f1947v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f183B != null) {
                RectF rectF = dVar.f214e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = dVar.f194N;
                    textPaint.setTextSize(dVar.f187G);
                    float f2 = dVar.f225p;
                    float f3 = dVar.f226q;
                    float f4 = dVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f213d0 <= 1 || dVar.f184C) {
                        canvas.translate(f2, f3);
                        dVar.f205Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f225p - dVar.f205Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f210b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f188H;
                            float f7 = dVar.f189I;
                            float f8 = dVar.f190J;
                            int i3 = dVar.f191K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f205Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f208a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f188H;
                            float f10 = dVar.f189I;
                            float f11 = dVar.f190J;
                            int i4 = dVar.f191K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f205Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f212c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f188H, dVar.f189I, dVar.f190J, dVar.f191K);
                        }
                        String trim = dVar.f212c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f205Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1896K == null || (gVar = this.f1895J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1896K.getBounds();
            Rect bounds2 = this.f1895J.getBounds();
            float f13 = dVar.f209b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0299a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0299a.c(centerX, bounds2.right, f13);
            this.f1896K.draw(canvas);
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
        if (this.f1955z0) {
            return;
        }
        this.f1955z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f1947v0;
        if (dVar != null) {
            dVar.f192L = drawableState;
            ColorStateList colorStateList2 = dVar.f220k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f219j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = S.f351a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f1955z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f1955z0 = false;
    }

    public final boolean e() {
        return this.f1889C && !TextUtils.isEmpty(this.f1890D) && (this.F instanceof h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.glasspulse.glasspulse.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.glasspulse.glasspulse.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.glasspulse.glasspulse.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        M0.a aVar = new M0.a(f2);
        M0.a aVar2 = new M0.a(f2);
        M0.a aVar3 = new M0.a(dimensionPixelOffset);
        M0.a aVar4 = new M0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f524a = iVar;
        kVar.f525b = iVar2;
        kVar.f526c = iVar3;
        kVar.d = iVar4;
        kVar.f527e = aVar;
        kVar.f528f = aVar2;
        kVar.f529g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f530j = eVar2;
        kVar.f531k = eVar3;
        kVar.f532l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f494w;
            TypedValue h02 = l.h0(context, com.glasspulse.glasspulse.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = h02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : h02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f495a;
        if (fVar.f486g == null) {
            fVar.f486g = new Rect();
        }
        gVar.f495a.f486g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1913c.c() : this.f1911b.a()) + i;
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
        int i = this.f1900O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1906U;
    }

    public int getBoxBackgroundMode() {
        return this.f1900O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1901P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1910a0;
        return e2 ? this.f1897L.h.a(rectF) : this.f1897L.f529g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1910a0;
        return e2 ? this.f1897L.f529g.a(rectF) : this.f1897L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1910a0;
        return e2 ? this.f1897L.f527e.a(rectF) : this.f1897L.f528f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = m.e(this);
        RectF rectF = this.f1910a0;
        return e2 ? this.f1897L.f528f.a(rectF) : this.f1897L.f527e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1930m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1903R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1904S;
    }

    public int getCounterMaxLength() {
        return this.f1927l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0202b0 c0202b0;
        if (this.f1925k && this.f1929m && (c0202b0 = this.f1932o) != null) {
            return c0202b0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1954z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1952y;
    }

    public ColorStateList getCursorColor() {
        return this.f1885A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1887B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1923i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1913c.f633g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1913c.f633g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1913c.f637m;
    }

    public int getEndIconMode() {
        return this.f1913c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1913c.f638n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1913c.f633g;
    }

    public CharSequence getError() {
        t tVar = this.f1924j;
        if (tVar.f670q) {
            return tVar.f669p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1924j.f673t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1924j.f672s;
    }

    public int getErrorCurrentTextColors() {
        C0202b0 c0202b0 = this.f1924j.f671r;
        if (c0202b0 != null) {
            return c0202b0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1913c.f630c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f1924j;
        if (tVar.f677x) {
            return tVar.f676w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0202b0 c0202b0 = this.f1924j.f678y;
        if (c0202b0 != null) {
            return c0202b0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1889C) {
            return this.f1890D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1947v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f1947v0;
        return dVar.e(dVar.f220k);
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    public D getLengthCounter() {
        return this.f1931n;
    }

    public int getMaxEms() {
        return this.f1920g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1918f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1913c.f633g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1913c.f633g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1940s) {
            return this.f1938r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1946v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1944u;
    }

    public CharSequence getPrefixText() {
        return this.f1911b.f696c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1911b.f695b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1911b.f695b;
    }

    public k getShapeAppearanceModel() {
        return this.f1897L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1911b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1911b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1911b.f699g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1911b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1913c.f640p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1913c.f641q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1913c.f641q;
    }

    public Typeface getTypeface() {
        return this.f1912b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1911b.a() : this.f1913c.c());
    }

    public final void i() {
        int i = this.f1900O;
        if (i == 0) {
            this.F = null;
            this.f1895J = null;
            this.f1896K = null;
        } else if (i == 1) {
            this.F = new g(this.f1897L);
            this.f1895J = new g();
            this.f1896K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1900O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1889C || (this.F instanceof h)) {
                this.F = new g(this.f1897L);
            } else {
                k kVar = this.f1897L;
                int i2 = h.f605y;
                if (kVar == null) {
                    kVar = new k();
                }
                P0.g gVar = new P0.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f606x = gVar;
                this.F = hVar;
            }
            this.f1895J = null;
            this.f1896K = null;
        }
        s();
        x();
        if (this.f1900O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1901P = getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (u1.d.N(getContext())) {
                this.f1901P = getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1900O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = S.f351a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (u1.d.N(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = S.f351a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1900O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1900O;
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
            d dVar = this.f1947v0;
            boolean b2 = dVar.b(dVar.f182A);
            dVar.f184C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f206Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f206Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1910a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f206Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f184C) {
                        f5 = max + dVar.f206Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f184C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f206Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1899N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1902Q);
                h hVar = (h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f206Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1910a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f206Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0202b0 c0202b0, int i) {
        try {
            c0202b0.setTextAppearance(i);
            if (c0202b0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0202b0.setTextAppearance(com.glasspulse.glasspulse.R.style.TextAppearance_AppCompat_Caption);
        c0202b0.setTextColor(b.a(getContext(), com.glasspulse.glasspulse.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f1924j;
        return (tVar.f668o != 1 || tVar.f671r == null || TextUtils.isEmpty(tVar.f669p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0006g) this.f1931n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f1929m;
        int i = this.f1927l;
        String str = null;
        if (i == -1) {
            this.f1932o.setText(String.valueOf(length));
            this.f1932o.setContentDescription(null);
            this.f1929m = false;
        } else {
            this.f1929m = length > i;
            Context context = getContext();
            this.f1932o.setContentDescription(context.getString(this.f1929m ? com.glasspulse.glasspulse.R.string.character_counter_overflowed_content_description : com.glasspulse.glasspulse.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1927l)));
            if (z2 != this.f1929m) {
                o();
            }
            String str2 = I.b.f303b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f305e : I.b.d;
            C0202b0 c0202b0 = this.f1932o;
            String string = getContext().getString(com.glasspulse.glasspulse.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1927l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.h hVar = I.i.f313a;
                str = bVar.c(string).toString();
            }
            c0202b0.setText(str);
        }
        if (this.d == null || z2 == this.f1929m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0202b0 c0202b0 = this.f1932o;
        if (c0202b0 != null) {
            l(c0202b0, this.f1929m ? this.f1934p : this.f1936q);
            if (!this.f1929m && (colorStateList2 = this.f1952y) != null) {
                this.f1932o.setTextColor(colorStateList2);
            }
            if (!this.f1929m || (colorStateList = this.f1954z) == null) {
                return;
            }
            this.f1932o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1947v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f1913c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1888B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f1911b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new o(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = G0.e.f236a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1907V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = G0.e.f236a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            G0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = G0.e.f237b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1895J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1903R, rect.right, i5);
            }
            g gVar2 = this.f1896K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1904S, rect.right, i6);
            }
            if (this.f1889C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f1947v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f218g != i7) {
                    dVar.f218g = i7;
                    dVar.h(false);
                }
                if (dVar.f216f != gravity) {
                    dVar.f216f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = m.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1908W;
                rect2.bottom = i8;
                int i9 = this.f1900O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1901P;
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
                    dVar.f193M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f195O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f230u);
                textPaint.setLetterSpacing(dVar.f203W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1900O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1900O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f211c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f193M = true;
                }
                dVar.h(false);
                if (!e() || this.f1945u0) {
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
        boolean z2 = this.f1888B0;
        p pVar = this.f1913c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1888B0 = true;
        }
        if (this.f1942t != null && (editText = this.d) != null) {
            this.f1942t.setGravity(editText.getGravity());
            this.f1942t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E e2 = (E) parcelable;
        super.onRestoreInstanceState(e2.f732a);
        setError(e2.f587c);
        if (e2.d) {
            post(new A(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1898M) {
            c cVar = this.f1897L.f527e;
            RectF rectF = this.f1910a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1897L.f528f.a(rectF);
            float a4 = this.f1897L.h.a(rectF);
            float a5 = this.f1897L.f529g.a(rectF);
            k kVar = this.f1897L;
            l lVar = kVar.f524a;
            l lVar2 = kVar.f525b;
            l lVar3 = kVar.d;
            l lVar4 = kVar.f526c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(lVar2);
            j.b(lVar);
            j.b(lVar4);
            j.b(lVar3);
            M0.a aVar = new M0.a(a3);
            M0.a aVar2 = new M0.a(a2);
            M0.a aVar3 = new M0.a(a5);
            M0.a aVar4 = new M0.a(a4);
            k kVar2 = new k();
            kVar2.f524a = lVar2;
            kVar2.f525b = lVar;
            kVar2.f526c = lVar3;
            kVar2.d = lVar4;
            kVar2.f527e = aVar;
            kVar2.f528f = aVar2;
            kVar2.f529g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f530j = eVar2;
            kVar2.f531k = eVar3;
            kVar2.f532l = eVar4;
            this.f1898M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        E e2 = new E(super.onSaveInstanceState());
        if (m()) {
            e2.f587c = getError();
        }
        p pVar = this.f1913c;
        e2.d = pVar.i != 0 && pVar.f633g.d;
        return e2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1885A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue d02 = l.d0(context, com.glasspulse.glasspulse.R.attr.colorControlActivated);
            if (d02 != null) {
                int i = d02.resourceId;
                if (i != 0) {
                    colorStateList2 = u1.d.A(context, i);
                } else {
                    int i2 = d02.data;
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
            if ((m() || (this.f1932o != null && this.f1929m)) && (colorStateList = this.f1887B) != null) {
                colorStateList2 = colorStateList;
            }
            D.a.h(mutate, colorStateList2);
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
        p pVar;
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
            y yVar = this.f1911b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1914c0 == null || this.f1915d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1914c0 = colorDrawable3;
                    this.f1915d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1914c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    pVar = this.f1913c;
                    if ((!pVar.e() || ((pVar.i != 0 && pVar.d()) || pVar.f640p != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f641q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f630c;
                        } else if (pVar.i != 0 && pVar.d()) {
                            checkableImageButton = pVar.f633g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1919f0;
                        if (colorDrawable != null || this.f1921g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1919f0 = colorDrawable5;
                                this.f1921g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1919f0;
                            if (drawable == colorDrawable2) {
                                this.f1922h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1921g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1919f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1919f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1919f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1922h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1919f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                pVar = this.f1913c;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f641q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1919f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1919f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1914c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1914c0 = null;
            z2 = true;
            pVar = this.f1913c;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f641q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1919f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1919f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        pVar = this.f1913c;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f641q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1919f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1919f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0202b0 c0202b0;
        EditText editText = this.d;
        if (editText == null || this.f1900O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0222l0.f2992a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0237t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1929m && (c0202b0 = this.f1932o) != null) {
            mutate.setColorFilter(C0237t.c(c0202b0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.f1894I || editText.getBackground() == null) && this.f1900O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = S.f351a;
            editText2.setBackground(editTextBoxBackground);
            this.f1894I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1906U != i) {
            this.f1906U = i;
            this.f1933o0 = i;
            this.f1937q0 = i;
            this.f1939r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1933o0 = defaultColor;
        this.f1906U = defaultColor;
        this.f1935p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1937q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1939r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1900O) {
            return;
        }
        this.f1900O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1901P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1897L.e();
        c cVar = this.f1897L.f527e;
        l w2 = u1.d.w(i);
        e2.f515a = w2;
        j.b(w2);
        e2.f518e = cVar;
        c cVar2 = this.f1897L.f528f;
        l w3 = u1.d.w(i);
        e2.f516b = w3;
        j.b(w3);
        e2.f519f = cVar2;
        c cVar3 = this.f1897L.h;
        l w4 = u1.d.w(i);
        e2.d = w4;
        j.b(w4);
        e2.h = cVar3;
        c cVar4 = this.f1897L.f529g;
        l w5 = u1.d.w(i);
        e2.f517c = w5;
        j.b(w5);
        e2.f520g = cVar4;
        this.f1897L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1930m0 != i) {
            this.f1930m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1926k0 = colorStateList.getDefaultColor();
            this.f1941s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1928l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1930m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1930m0 != colorStateList.getDefaultColor()) {
            this.f1930m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1903R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1904S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1925k != z2) {
            t tVar = this.f1924j;
            if (z2) {
                C0202b0 c0202b0 = new C0202b0(getContext(), null);
                this.f1932o = c0202b0;
                c0202b0.setId(com.glasspulse.glasspulse.R.id.textinput_counter);
                Typeface typeface = this.f1912b0;
                if (typeface != null) {
                    this.f1932o.setTypeface(typeface);
                }
                this.f1932o.setMaxLines(1);
                tVar.a(this.f1932o, 2);
                ((ViewGroup.MarginLayoutParams) this.f1932o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.glasspulse.glasspulse.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1932o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f1932o, 2);
                this.f1932o = null;
            }
            this.f1925k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1927l != i) {
            if (i > 0) {
                this.f1927l = i;
            } else {
                this.f1927l = -1;
            }
            if (!this.f1925k || this.f1932o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1934p != i) {
            this.f1934p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1954z != colorStateList) {
            this.f1954z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1936q != i) {
            this.f1936q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1952y != colorStateList) {
            this.f1952y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1885A != colorStateList) {
            this.f1885A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1887B != colorStateList) {
            this.f1887B = colorStateList;
            if (m() || (this.f1932o != null && this.f1929m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1923i0 = colorStateList;
        this.j0 = colorStateList;
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
        this.f1913c.f633g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1913c.f633g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f1913c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f633g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f1913c;
        Drawable D2 = i != 0 ? u1.d.D(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f633g;
        checkableImageButton.setImageDrawable(D2);
        if (D2 != null) {
            ColorStateList colorStateList = pVar.f635k;
            PorterDuff.Mode mode = pVar.f636l;
            TextInputLayout textInputLayout = pVar.f628a;
            u1.d.d(textInputLayout, checkableImageButton, colorStateList, mode);
            u1.d.W(textInputLayout, checkableImageButton, pVar.f635k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f1913c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f637m) {
            pVar.f637m = i;
            CheckableImageButton checkableImageButton = pVar.f633g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f630c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1913c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f1913c;
        View.OnLongClickListener onLongClickListener = pVar.f639o;
        CheckableImageButton checkableImageButton = pVar.f633g;
        checkableImageButton.setOnClickListener(onClickListener);
        u1.d.b0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f1913c;
        pVar.f639o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f633g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u1.d.b0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f1913c;
        pVar.f638n = scaleType;
        pVar.f633g.setScaleType(scaleType);
        pVar.f630c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f1913c;
        if (pVar.f635k != colorStateList) {
            pVar.f635k = colorStateList;
            u1.d.d(pVar.f628a, pVar.f633g, colorStateList, pVar.f636l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1913c;
        if (pVar.f636l != mode) {
            pVar.f636l = mode;
            u1.d.d(pVar.f628a, pVar.f633g, pVar.f635k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1913c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f1924j;
        if (!tVar.f670q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f669p = charSequence;
        tVar.f671r.setText(charSequence);
        int i = tVar.f667n;
        if (i != 1) {
            tVar.f668o = 1;
        }
        tVar.i(i, tVar.f668o, tVar.h(tVar.f671r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f1924j;
        tVar.f673t = i;
        C0202b0 c0202b0 = tVar.f671r;
        if (c0202b0 != null) {
            WeakHashMap weakHashMap = S.f351a;
            c0202b0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f1924j;
        tVar.f672s = charSequence;
        C0202b0 c0202b0 = tVar.f671r;
        if (c0202b0 != null) {
            c0202b0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.f1924j;
        if (tVar.f670q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z2) {
            C0202b0 c0202b0 = new C0202b0(tVar.f662g, null);
            tVar.f671r = c0202b0;
            c0202b0.setId(com.glasspulse.glasspulse.R.id.textinput_error);
            tVar.f671r.setTextAlignment(5);
            Typeface typeface = tVar.f656B;
            if (typeface != null) {
                tVar.f671r.setTypeface(typeface);
            }
            int i = tVar.f674u;
            tVar.f674u = i;
            C0202b0 c0202b02 = tVar.f671r;
            if (c0202b02 != null) {
                textInputLayout.l(c0202b02, i);
            }
            ColorStateList colorStateList = tVar.f675v;
            tVar.f675v = colorStateList;
            C0202b0 c0202b03 = tVar.f671r;
            if (c0202b03 != null && colorStateList != null) {
                c0202b03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f672s;
            tVar.f672s = charSequence;
            C0202b0 c0202b04 = tVar.f671r;
            if (c0202b04 != null) {
                c0202b04.setContentDescription(charSequence);
            }
            int i2 = tVar.f673t;
            tVar.f673t = i2;
            C0202b0 c0202b05 = tVar.f671r;
            if (c0202b05 != null) {
                WeakHashMap weakHashMap = S.f351a;
                c0202b05.setAccessibilityLiveRegion(i2);
            }
            tVar.f671r.setVisibility(4);
            tVar.a(tVar.f671r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f671r, 0);
            tVar.f671r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f670q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f1913c;
        pVar.i(i != 0 ? u1.d.D(pVar.getContext(), i) : null);
        u1.d.W(pVar.f628a, pVar.f630c, pVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f1913c;
        CheckableImageButton checkableImageButton = pVar.f630c;
        View.OnLongClickListener onLongClickListener = pVar.f632f;
        checkableImageButton.setOnClickListener(onClickListener);
        u1.d.b0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f1913c;
        pVar.f632f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f630c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u1.d.b0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f1913c;
        if (pVar.d != colorStateList) {
            pVar.d = colorStateList;
            u1.d.d(pVar.f628a, pVar.f630c, colorStateList, pVar.f631e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1913c;
        if (pVar.f631e != mode) {
            pVar.f631e = mode;
            u1.d.d(pVar.f628a, pVar.f630c, pVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f1924j;
        tVar.f674u = i;
        C0202b0 c0202b0 = tVar.f671r;
        if (c0202b0 != null) {
            tVar.h.l(c0202b0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f1924j;
        tVar.f675v = colorStateList;
        C0202b0 c0202b0 = tVar.f671r;
        if (c0202b0 == null || colorStateList == null) {
            return;
        }
        c0202b0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f1949w0 != z2) {
            this.f1949w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f1924j;
        if (isEmpty) {
            if (tVar.f677x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f677x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f676w = charSequence;
        tVar.f678y.setText(charSequence);
        int i = tVar.f667n;
        if (i != 2) {
            tVar.f668o = 2;
        }
        tVar.i(i, tVar.f668o, tVar.h(tVar.f678y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f1924j;
        tVar.f655A = colorStateList;
        C0202b0 c0202b0 = tVar.f678y;
        if (c0202b0 == null || colorStateList == null) {
            return;
        }
        c0202b0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.f1924j;
        if (tVar.f677x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0202b0 c0202b0 = new C0202b0(tVar.f662g, null);
            tVar.f678y = c0202b0;
            c0202b0.setId(com.glasspulse.glasspulse.R.id.textinput_helper_text);
            tVar.f678y.setTextAlignment(5);
            Typeface typeface = tVar.f656B;
            if (typeface != null) {
                tVar.f678y.setTypeface(typeface);
            }
            tVar.f678y.setVisibility(4);
            tVar.f678y.setAccessibilityLiveRegion(1);
            int i = tVar.f679z;
            tVar.f679z = i;
            C0202b0 c0202b02 = tVar.f678y;
            if (c0202b02 != null) {
                c0202b02.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f655A;
            tVar.f655A = colorStateList;
            C0202b0 c0202b03 = tVar.f678y;
            if (c0202b03 != null && colorStateList != null) {
                c0202b03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f678y, 1);
            tVar.f678y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f667n;
            if (i2 == 2) {
                tVar.f668o = 0;
            }
            tVar.i(i2, tVar.f668o, tVar.h(tVar.f678y, ""));
            tVar.g(tVar.f678y, 1);
            tVar.f678y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f677x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f1924j;
        tVar.f679z = i;
        C0202b0 c0202b0 = tVar.f678y;
        if (c0202b0 != null) {
            c0202b0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1889C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f1951x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1889C) {
            this.f1889C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1890D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1891E = true;
            } else {
                this.f1891E = false;
                if (!TextUtils.isEmpty(this.f1890D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1890D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f1947v0;
        TextInputLayout textInputLayout = dVar.f207a;
        J0.d dVar2 = new J0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f334j;
        if (colorStateList != null) {
            dVar.f220k = colorStateList;
        }
        float f2 = dVar2.f335k;
        if (f2 != 0.0f) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f328a;
        if (colorStateList2 != null) {
            dVar.f201U = colorStateList2;
        }
        dVar.f199S = dVar2.f331e;
        dVar.f200T = dVar2.f332f;
        dVar.f198R = dVar2.f333g;
        dVar.f202V = dVar2.i;
        J0.a aVar = dVar.f234y;
        if (aVar != null) {
            aVar.f324g = true;
        }
        C.h hVar = new C.h(1, dVar);
        dVar2.a();
        dVar.f234y = new J0.a(hVar, dVar2.f338n);
        dVar2.c(textInputLayout.getContext(), dVar.f234y);
        dVar.h(false);
        this.j0 = dVar.f220k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            if (this.f1923i0 == null) {
                d dVar = this.f1947v0;
                if (dVar.f220k != colorStateList) {
                    dVar.f220k = colorStateList;
                    dVar.h(false);
                }
            }
            this.j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(D d) {
        this.f1931n = d;
    }

    public void setMaxEms(int i) {
        this.f1920g = i;
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
        this.f1918f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
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
        p pVar = this.f1913c;
        pVar.f633g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f1913c;
        pVar.f633g.setImageDrawable(i != 0 ? u1.d.D(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f1913c;
        if (z2 && pVar.i != 1) {
            pVar.g(1);
        } else if (z2) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f1913c;
        pVar.f635k = colorStateList;
        u1.d.d(pVar.f628a, pVar.f633g, colorStateList, pVar.f636l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1913c;
        pVar.f636l = mode;
        u1.d.d(pVar.f628a, pVar.f633g, pVar.f635k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1942t == null) {
            C0202b0 c0202b0 = new C0202b0(getContext(), null);
            this.f1942t = c0202b0;
            c0202b0.setId(com.glasspulse.glasspulse.R.id.textinput_placeholder);
            this.f1942t.setImportantForAccessibility(2);
            C0179h d = d();
            this.f1948w = d;
            d.f2771b = 67L;
            this.f1950x = d();
            setPlaceholderTextAppearance(this.f1946v);
            setPlaceholderTextColor(this.f1944u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1940s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1938r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1946v = i;
        C0202b0 c0202b0 = this.f1942t;
        if (c0202b0 != null) {
            c0202b0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1944u != colorStateList) {
            this.f1944u = colorStateList;
            C0202b0 c0202b0 = this.f1942t;
            if (c0202b0 == null || colorStateList == null) {
                return;
            }
            c0202b0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f1911b;
        yVar.getClass();
        yVar.f696c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f695b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1911b.f695b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1911b.f695b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f495a.f481a == kVar) {
            return;
        }
        this.f1897L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1911b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1911b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? u1.d.D(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f1911b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f699g) {
            yVar.f699g = i;
            CheckableImageButton checkableImageButton = yVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f1911b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        u1.d.b0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f1911b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u1.d.b0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f1911b;
        yVar.h = scaleType;
        yVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f1911b;
        if (yVar.f697e != colorStateList) {
            yVar.f697e = colorStateList;
            u1.d.d(yVar.f694a, yVar.d, colorStateList, yVar.f698f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f1911b;
        if (yVar.f698f != mode) {
            yVar.f698f = mode;
            u1.d.d(yVar.f694a, yVar.d, yVar.f697e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1911b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f1913c;
        pVar.getClass();
        pVar.f640p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f641q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1913c.f641q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1913c.f641q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C c2) {
        EditText editText = this.d;
        if (editText != null) {
            S.l(editText, c2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1912b0) {
            this.f1912b0 = typeface;
            this.f1947v0.m(typeface);
            t tVar = this.f1924j;
            if (typeface != tVar.f656B) {
                tVar.f656B = typeface;
                C0202b0 c0202b0 = tVar.f671r;
                if (c0202b0 != null) {
                    c0202b0.setTypeface(typeface);
                }
                C0202b0 c0202b02 = tVar.f678y;
                if (c0202b02 != null) {
                    c0202b02.setTypeface(typeface);
                }
            }
            C0202b0 c0202b03 = this.f1932o;
            if (c0202b03 != null) {
                c0202b03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1900O != 1) {
            FrameLayout frameLayout = this.f1909a;
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
        C0202b0 c0202b0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1923i0;
        d dVar = this.f1947v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1923i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1941s0) : this.f1941s0));
        } else if (m()) {
            C0202b0 c0202b02 = this.f1924j.f671r;
            dVar.i(c0202b02 != null ? c0202b02.getTextColors() : null);
        } else if (this.f1929m && (c0202b0 = this.f1932o) != null) {
            dVar.i(c0202b0.getTextColors());
        } else if (z5 && (colorStateList = this.j0) != null && dVar.f220k != colorStateList) {
            dVar.f220k = colorStateList;
            dVar.h(false);
        }
        p pVar = this.f1913c;
        y yVar = this.f1911b;
        if (z4 || !this.f1949w0 || (isEnabled() && z5)) {
            if (z3 || this.f1945u0) {
                ValueAnimator valueAnimator = this.f1953y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1953y0.cancel();
                }
                if (z2 && this.f1951x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f1945u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f700j = false;
                yVar.e();
                pVar.f642r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f1945u0) {
            ValueAnimator valueAnimator2 = this.f1953y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1953y0.cancel();
            }
            if (z2 && this.f1951x0) {
                a(0.0f);
            } else {
                dVar.k(0.0f);
            }
            if (e() && !((h) this.F).f606x.f604q.isEmpty() && e()) {
                ((h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1945u0 = true;
            C0202b0 c0202b03 = this.f1942t;
            if (c0202b03 != null && this.f1940s) {
                c0202b03.setText((CharSequence) null);
                q.a(this.f1909a, this.f1950x);
                this.f1942t.setVisibility(4);
            }
            yVar.f700j = true;
            yVar.e();
            pVar.f642r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0006g) this.f1931n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1909a;
        if (length != 0 || this.f1945u0) {
            C0202b0 c0202b0 = this.f1942t;
            if (c0202b0 == null || !this.f1940s) {
                return;
            }
            c0202b0.setText((CharSequence) null);
            q.a(frameLayout, this.f1950x);
            this.f1942t.setVisibility(4);
            return;
        }
        if (this.f1942t == null || !this.f1940s || TextUtils.isEmpty(this.f1938r)) {
            return;
        }
        this.f1942t.setText(this.f1938r);
        q.a(frameLayout, this.f1948w);
        this.f1942t.setVisibility(0);
        this.f1942t.bringToFront();
        announceForAccessibility(this.f1938r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1905T = colorForState2;
        } else if (z3) {
            this.f1905T = colorForState;
        } else {
            this.f1905T = defaultColor;
        }
    }

    public final void x() {
        C0202b0 c0202b0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1900O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1905T = this.f1941s0;
        } else if (m()) {
            if (this.n0 != null) {
                w(z3, z2);
            } else {
                this.f1905T = getErrorCurrentTextColors();
            }
        } else if (!this.f1929m || (c0202b0 = this.f1932o) == null) {
            if (z3) {
                this.f1905T = this.f1930m0;
            } else if (z2) {
                this.f1905T = this.f1928l0;
            } else {
                this.f1905T = this.f1926k0;
            }
        } else if (this.n0 != null) {
            w(z3, z2);
        } else {
            this.f1905T = c0202b0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f1913c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f630c;
        ColorStateList colorStateList = pVar.d;
        TextInputLayout textInputLayout = pVar.f628a;
        u1.d.W(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f635k;
        CheckableImageButton checkableImageButton2 = pVar.f633g;
        u1.d.W(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof P0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                u1.d.d(textInputLayout, checkableImageButton2, pVar.f635k, pVar.f636l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f1911b;
        u1.d.W(yVar.f694a, yVar.d, yVar.f697e);
        if (this.f1900O == 2) {
            int i = this.f1902Q;
            if (z3 && isEnabled()) {
                this.f1902Q = this.f1904S;
            } else {
                this.f1902Q = this.f1903R;
            }
            if (this.f1902Q != i && e() && !this.f1945u0) {
                if (e()) {
                    ((h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1900O == 1) {
            if (!isEnabled()) {
                this.f1906U = this.f1935p0;
            } else if (z2 && !z3) {
                this.f1906U = this.f1939r0;
            } else if (z3) {
                this.f1906U = this.f1937q0;
            } else {
                this.f1906U = this.f1933o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1911b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1913c.f633g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1913c.f633g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1913c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1913c.f633g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f1913c;
        CheckableImageButton checkableImageButton = pVar.f633g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f635k;
            PorterDuff.Mode mode = pVar.f636l;
            TextInputLayout textInputLayout = pVar.f628a;
            u1.d.d(textInputLayout, checkableImageButton, colorStateList, mode);
            u1.d.W(textInputLayout, checkableImageButton, pVar.f635k);
        }
    }
}
