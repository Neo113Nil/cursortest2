package com.google.android.material.textfield;

import A.b;
import D0.d;
import D0.n;
import D0.p;
import J0.c;
import J0.e;
import J0.f;
import J0.g;
import J0.i;
import J0.j;
import J0.k;
import K.C0009g;
import K.C0014l;
import K.J;
import K.T;
import M0.A;
import M0.B;
import M0.C;
import M0.D;
import M0.E;
import M0.F;
import M0.q;
import M0.t;
import M0.u;
import M0.x;
import M0.z;
import O0.a;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0221m0;
import l.C0201c0;
import l.C0234t;
import l0.h;
import m.C0260a;
import p0.AbstractC0282a;
import q0.AbstractC0289a;
import w1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1880C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1881A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1882A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1883B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1884B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1885C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1886D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1887E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1888G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1889H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1890I;

    /* renamed from: J, reason: collision with root package name */
    public g f1891J;

    /* renamed from: K, reason: collision with root package name */
    public g f1892K;

    /* renamed from: L, reason: collision with root package name */
    public k f1893L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1894M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1895N;

    /* renamed from: O, reason: collision with root package name */
    public int f1896O;

    /* renamed from: P, reason: collision with root package name */
    public int f1897P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1898Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1899R;

    /* renamed from: S, reason: collision with root package name */
    public int f1900S;

    /* renamed from: T, reason: collision with root package name */
    public int f1901T;

    /* renamed from: U, reason: collision with root package name */
    public int f1902U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1903V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1904W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1905a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1906a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1907b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1908b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1909c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1910c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1911d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1912e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1913e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1914f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1915f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1916g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1917g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1918h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f1919i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f1920j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f1921j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1922k;
    public int k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1923l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1924l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1925m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1926m0;

    /* renamed from: n, reason: collision with root package name */
    public E f1927n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f1928n0;

    /* renamed from: o, reason: collision with root package name */
    public C0201c0 f1929o;
    public int o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1930p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1931p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1932q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1933q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1934r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1935r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1936s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1937s0;

    /* renamed from: t, reason: collision with root package name */
    public C0201c0 f1938t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1939t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f1940u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1941u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1942v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f1943v0;

    /* renamed from: w, reason: collision with root package name */
    public h f1944w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1945w0;

    /* renamed from: x, reason: collision with root package name */
    public h f1946x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1947x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1948y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f1949y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1950z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.playbag.tripgear.R.attr.textInputStyle, com.playbag.tripgear.R.style.Widget_Design_TextInputLayout), attributeSet, com.playbag.tripgear.R.attr.textInputStyle);
        this.f1914f = -1;
        this.f1916g = -1;
        this.h = -1;
        this.i = -1;
        this.f1920j = new u(this);
        this.f1927n = new C0009g(2);
        this.f1903V = new Rect();
        this.f1904W = new Rect();
        this.f1906a0 = new RectF();
        this.f1913e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f1943v0 = dVar;
        this.f1884B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1905a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0289a.f3498a;
        dVar.f153Q = linearInterpolator;
        dVar.h(false);
        dVar.f152P = linearInterpolator;
        dVar.h(false);
        if (dVar.f174g != 8388659) {
            dVar.f174g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0282a.f3428A;
        n.a(context2, attributeSet, com.playbag.tripgear.R.attr.textInputStyle, com.playbag.tripgear.R.style.Widget_Design_TextInputLayout);
        n.b(context2, attributeSet, iArr, com.playbag.tripgear.R.attr.textInputStyle, com.playbag.tripgear.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.playbag.tripgear.R.attr.textInputStyle, com.playbag.tripgear.R.style.Widget_Design_TextInputLayout);
        C0014l c0014l = new C0014l(context2, obtainStyledAttributes);
        z zVar = new z(this, c0014l);
        this.f1907b = zVar;
        this.f1885C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f1947x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1945w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1893L = k.b(context2, attributeSet, com.playbag.tripgear.R.attr.textInputStyle, com.playbag.tripgear.R.style.Widget_Design_TextInputLayout).a();
        this.f1895N = context2.getResources().getDimensionPixelOffset(com.playbag.tripgear.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1897P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1899R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1900S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1898Q = this.f1899R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1893L.e();
        if (dimension >= RecyclerView.f1530C0) {
            e2.f358e = new J0.a(dimension);
        }
        if (dimension2 >= RecyclerView.f1530C0) {
            e2.f359f = new J0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.f1530C0) {
            e2.f360g = new J0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.f1530C0) {
            e2.h = new J0.a(dimension4);
        }
        this.f1893L = e2.a();
        ColorStateList u2 = l.u(context2, c0014l, 7);
        if (u2 != null) {
            int defaultColor = u2.getDefaultColor();
            this.o0 = defaultColor;
            this.f1902U = defaultColor;
            if (u2.isStateful()) {
                this.f1931p0 = u2.getColorForState(new int[]{-16842910}, -1);
                this.f1933q0 = u2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1935r0 = u2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1933q0 = this.o0;
                ColorStateList A2 = w1.d.A(context2, com.playbag.tripgear.R.color.mtrl_filled_background_color);
                this.f1931p0 = A2.getColorForState(new int[]{-16842910}, -1);
                this.f1935r0 = A2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1902U = 0;
            this.o0 = 0;
            this.f1931p0 = 0;
            this.f1933q0 = 0;
            this.f1935r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList b2 = c0014l.b(1);
            this.f1921j0 = b2;
            this.f1919i0 = b2;
        }
        ColorStateList u3 = l.u(context2, c0014l, 14);
        this.f1926m0 = obtainStyledAttributes.getColor(14, 0);
        this.k0 = b.a(context2, com.playbag.tripgear.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1937s0 = b.a(context2, com.playbag.tripgear.R.color.mtrl_textinput_disabled_color);
        this.f1924l0 = b.a(context2, com.playbag.tripgear.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (u3 != null) {
            setBoxStrokeColorStateList(u3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(l.u(context2, c0014l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1881A = c0014l.b(24);
        this.f1883B = c0014l.b(25);
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
        this.f1932q = obtainStyledAttributes.getResourceId(22, 0);
        this.f1930p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1930p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1932q);
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
        this.f1909c = qVar;
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
        if (!(editText instanceof AutoCompleteTextView) || w1.d.S(editText)) {
            return this.F;
        }
        int j2 = C0260a.j(this.d, com.playbag.tripgear.R.attr.colorControlHighlight);
        int i = this.f1896O;
        int[][] iArr = f1880C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1902U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{C0260a.m(j2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue i02 = w1.d.i0(context, com.playbag.tripgear.R.attr.colorSurface, "TextInputLayout");
        int i3 = i02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : i02.data;
        g gVar3 = new g(gVar2.f335a.f321a);
        int m2 = C0260a.m(j2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{m2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m2, a2});
        g gVar4 = new g(gVar2.f335a.f321a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1889H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1889H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1889H.addState(new int[0], f(false));
        }
        return this.f1889H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1888G == null) {
            this.f1888G = f(true);
        }
        return this.f1888G;
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
        int i = this.f1914f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1916g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1890I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f1943v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f159W != letterSpacing) {
            dVar.f159W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f174g != i4) {
            dVar.f174g = i4;
            dVar.h(false);
        }
        if (dVar.f172f != gravity) {
            dVar.f172f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = T.f423a;
        this.f1939t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f1919i0 == null) {
            this.f1919i0 = this.d.getHintTextColors();
        }
        if (this.f1885C) {
            if (TextUtils.isEmpty(this.f1886D)) {
                CharSequence hint = this.d.getHint();
                this.f1912e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1887E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f1929o != null) {
            n(this.d.getText());
        }
        r();
        this.f1920j.b();
        this.f1907b.bringToFront();
        q qVar = this.f1909c;
        qVar.bringToFront();
        Iterator it = this.f1913e0.iterator();
        while (it.hasNext()) {
            ((M0.n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1886D)) {
            return;
        }
        this.f1886D = charSequence;
        d dVar = this.f1943v0;
        if (charSequence == null || !TextUtils.equals(dVar.f138A, charSequence)) {
            dVar.f138A = charSequence;
            dVar.f139B = null;
            Bitmap bitmap = dVar.f142E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f142E = null;
            }
            dVar.h(false);
        }
        if (this.f1941u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1936s == z2) {
            return;
        }
        if (z2) {
            C0201c0 c0201c0 = this.f1938t;
            if (c0201c0 != null) {
                this.f1905a.addView(c0201c0);
                this.f1938t.setVisibility(0);
            }
        } else {
            C0201c0 c0201c02 = this.f1938t;
            if (c0201c02 != null) {
                c0201c02.setVisibility(8);
            }
            this.f1938t = null;
        }
        this.f1936s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f1943v0;
        if (dVar.f165b == f2) {
            return;
        }
        if (this.f1949y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1949y0 = valueAnimator;
            valueAnimator.setInterpolator(w1.d.h0(getContext(), com.playbag.tripgear.R.attr.motionEasingEmphasizedInterpolator, AbstractC0289a.f3499b));
            this.f1949y0.setDuration(w1.d.g0(getContext(), com.playbag.tripgear.R.attr.motionDurationMedium4, 167));
            this.f1949y0.addUpdateListener(new C(i, this));
        }
        this.f1949y0.setFloatValues(dVar.f165b, f2);
        this.f1949y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1905a;
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
        k kVar = gVar.f335a.f321a;
        k kVar2 = this.f1893L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1896O == 2 && (i = this.f1898Q) > -1 && (i2 = this.f1901T) != 0) {
            g gVar2 = this.F;
            gVar2.f335a.f327j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f335a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1902U;
        if (this.f1896O == 1) {
            i3 = C.a.b(this.f1902U, C0260a.i(getContext(), com.playbag.tripgear.R.attr.colorSurface, 0));
        }
        this.f1902U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1891J;
        if (gVar3 != null && this.f1892K != null) {
            if (this.f1898Q > -1 && this.f1901T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.k0) : ColorStateList.valueOf(this.f1901T));
                this.f1892K.j(ColorStateList.valueOf(this.f1901T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1885C) {
            return 0;
        }
        int i = this.f1896O;
        d dVar = this.f1943v0;
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

    public final h d() {
        h hVar = new h();
        hVar.f3086c = w1.d.g0(getContext(), com.playbag.tripgear.R.attr.motionDurationShort2, 87);
        hVar.d = w1.d.h0(getContext(), com.playbag.tripgear.R.attr.motionEasingLinearInterpolator, AbstractC0289a.f3498a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1912e != null) {
            boolean z2 = this.f1887E;
            this.f1887E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1912e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1887E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1905a;
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
        this.f1882A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1882A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1885C;
        d dVar = this.f1943v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f139B != null) {
                RectF rectF = dVar.f170e;
                if (rectF.width() > RecyclerView.f1530C0 && rectF.height() > RecyclerView.f1530C0) {
                    TextPaint textPaint = dVar.f150N;
                    textPaint.setTextSize(dVar.f143G);
                    float f2 = dVar.f181p;
                    float f3 = dVar.f182q;
                    float f4 = dVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f169d0 <= 1 || dVar.f140C) {
                        canvas.translate(f2, f3);
                        dVar.f161Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f181p - dVar.f161Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f166b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f144H;
                            float f7 = dVar.f145I;
                            float f8 = dVar.f146J;
                            int i3 = dVar.f147K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f161Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f164a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f144H;
                            float f10 = dVar.f145I;
                            float f11 = dVar.f146J;
                            int i4 = dVar.f147K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f161Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f168c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.f1530C0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f144H, dVar.f145I, dVar.f146J, dVar.f147K);
                        }
                        String trim = dVar.f168c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f161Y.getLineEnd(i), str.length()), RecyclerView.f1530C0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1892K == null || (gVar = this.f1891J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1892K.getBounds();
            Rect bounds2 = this.f1891J.getBounds();
            float f13 = dVar.f165b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0289a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0289a.c(centerX, bounds2.right, f13);
            this.f1892K.draw(canvas);
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
        if (this.z0) {
            return;
        }
        this.z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f1943v0;
        if (dVar != null) {
            dVar.f148L = drawableState;
            ColorStateList colorStateList2 = dVar.f176k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f175j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = T.f423a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.z0 = false;
    }

    public final boolean e() {
        return this.f1885C && !TextUtils.isEmpty(this.f1886D) && (this.F instanceof M0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.playbag.tripgear.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.f1530C0;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.playbag.tripgear.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.playbag.tripgear.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        J0.a aVar = new J0.a(f2);
        J0.a aVar2 = new J0.a(f2);
        J0.a aVar3 = new J0.a(dimensionPixelOffset);
        J0.a aVar4 = new J0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f364a = iVar;
        kVar.f365b = iVar2;
        kVar.f366c = iVar3;
        kVar.d = iVar4;
        kVar.f367e = aVar;
        kVar.f368f = aVar2;
        kVar.f369g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f370j = eVar2;
        kVar.f371k = eVar3;
        kVar.f372l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f334w;
            TypedValue i02 = w1.d.i0(context, com.playbag.tripgear.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = i02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : i02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f335a;
        if (fVar.f326g == null) {
            fVar.f326g = new Rect();
        }
        gVar.f335a.f326g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1909c.c() : this.f1907b.a()) + i;
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
        int i = this.f1896O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1902U;
    }

    public int getBoxBackgroundMode() {
        return this.f1896O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1897P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1906a0;
        return e2 ? this.f1893L.h.a(rectF) : this.f1893L.f369g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1906a0;
        return e2 ? this.f1893L.f369g.a(rectF) : this.f1893L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1906a0;
        return e2 ? this.f1893L.f367e.a(rectF) : this.f1893L.f368f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1906a0;
        return e2 ? this.f1893L.f368f.a(rectF) : this.f1893L.f367e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1926m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1928n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1899R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1900S;
    }

    public int getCounterMaxLength() {
        return this.f1923l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0201c0 c0201c0;
        if (this.f1922k && this.f1925m && (c0201c0 = this.f1929o) != null) {
            return c0201c0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1950z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1948y;
    }

    public ColorStateList getCursorColor() {
        return this.f1881A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1883B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1919i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1909c.f609g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1909c.f609g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1909c.f613m;
    }

    public int getEndIconMode() {
        return this.f1909c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1909c.f614n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1909c.f609g;
    }

    public CharSequence getError() {
        u uVar = this.f1920j;
        if (uVar.f646q) {
            return uVar.f645p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1920j.f649t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1920j.f648s;
    }

    public int getErrorCurrentTextColors() {
        C0201c0 c0201c0 = this.f1920j.f647r;
        if (c0201c0 != null) {
            return c0201c0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1909c.f606c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1920j;
        if (uVar.f653x) {
            return uVar.f652w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0201c0 c0201c0 = this.f1920j.f654y;
        if (c0201c0 != null) {
            return c0201c0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1885C) {
            return this.f1886D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1943v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f1943v0;
        return dVar.e(dVar.f176k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1921j0;
    }

    public E getLengthCounter() {
        return this.f1927n;
    }

    public int getMaxEms() {
        return this.f1916g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1914f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1909c.f609g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1909c.f609g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1936s) {
            return this.f1934r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1942v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1940u;
    }

    public CharSequence getPrefixText() {
        return this.f1907b.f672c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1907b.f671b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1907b.f671b;
    }

    public k getShapeAppearanceModel() {
        return this.f1893L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1907b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1907b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1907b.f675g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1907b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1909c.f616p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1909c.f617q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1909c.f617q;
    }

    public Typeface getTypeface() {
        return this.f1908b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1907b.a() : this.f1909c.c());
    }

    public final void i() {
        int i = this.f1896O;
        if (i == 0) {
            this.F = null;
            this.f1891J = null;
            this.f1892K = null;
        } else if (i == 1) {
            this.F = new g(this.f1893L);
            this.f1891J = new g();
            this.f1892K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1896O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1885C || (this.F instanceof M0.h)) {
                this.F = new g(this.f1893L);
            } else {
                k kVar = this.f1893L;
                int i2 = M0.h.f580y;
                if (kVar == null) {
                    kVar = new k();
                }
                M0.g gVar = new M0.g(kVar, new RectF());
                M0.h hVar = new M0.h(gVar);
                hVar.f581x = gVar;
                this.F = hVar;
            }
            this.f1891J = null;
            this.f1892K = null;
        }
        s();
        x();
        if (this.f1896O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1897P = getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (l.F(getContext())) {
                this.f1897P = getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1896O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = T.f423a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (l.F(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = T.f423a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1896O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1896O;
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
            d dVar = this.f1943v0;
            boolean b2 = dVar.b(dVar.f138A);
            dVar.f140C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f162Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f162Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1906a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f162Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f140C) {
                        f5 = max + dVar.f162Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f140C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f162Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > RecyclerView.f1530C0 || rectF.height() <= RecyclerView.f1530C0) {
                }
                float f6 = rectF.left;
                float f7 = this.f1895N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1898Q);
                M0.h hVar = (M0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f162Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1906a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f162Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > RecyclerView.f1530C0) {
            }
        }
    }

    public final void l(C0201c0 c0201c0, int i) {
        try {
            c0201c0.setTextAppearance(i);
            if (c0201c0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0201c0.setTextAppearance(com.playbag.tripgear.R.style.TextAppearance_AppCompat_Caption);
        c0201c0.setTextColor(b.a(getContext(), com.playbag.tripgear.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f1920j;
        return (uVar.f644o != 1 || uVar.f647r == null || TextUtils.isEmpty(uVar.f645p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0009g) this.f1927n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f1925m;
        int i = this.f1923l;
        String str = null;
        if (i == -1) {
            this.f1929o.setText(String.valueOf(length));
            this.f1929o.setContentDescription(null);
            this.f1925m = false;
        } else {
            this.f1925m = length > i;
            Context context = getContext();
            this.f1929o.setContentDescription(context.getString(this.f1925m ? com.playbag.tripgear.R.string.character_counter_overflowed_content_description : com.playbag.tripgear.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1923l)));
            if (z2 != this.f1925m) {
                o();
            }
            String str2 = I.b.f291b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f293e : I.b.d;
            C0201c0 c0201c0 = this.f1929o;
            String string = getContext().getString(com.playbag.tripgear.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1923l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f301a;
                str = bVar.c(string).toString();
            }
            c0201c0.setText(str);
        }
        if (this.d == null || z2 == this.f1925m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0201c0 c0201c0 = this.f1929o;
        if (c0201c0 != null) {
            l(c0201c0, this.f1925m ? this.f1930p : this.f1932q);
            if (!this.f1925m && (colorStateList2 = this.f1948y) != null) {
                this.f1929o.setTextColor(colorStateList2);
            }
            if (!this.f1925m || (colorStateList = this.f1950z) == null) {
                return;
            }
            this.f1929o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1943v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1909c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1884B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1907b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new p(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = D0.e.f192a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1903V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = D0.e.f192a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            D0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = D0.e.f193b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1891J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1899R, rect.right, i5);
            }
            g gVar2 = this.f1892K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1900S, rect.right, i6);
            }
            if (this.f1885C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f1943v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f174g != i7) {
                    dVar.f174g = i7;
                    dVar.h(false);
                }
                if (dVar.f172f != gravity) {
                    dVar.f172f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = n.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1904W;
                rect2.bottom = i8;
                int i9 = this.f1896O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1897P;
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
                    dVar.f149M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f151O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f186u);
                textPaint.setLetterSpacing(dVar.f159W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1896O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1896O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f167c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f149M = true;
                }
                dVar.h(false);
                if (!e() || this.f1941u0) {
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
        boolean z2 = this.f1884B0;
        q qVar = this.f1909c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1884B0 = true;
        }
        if (this.f1938t != null && (editText = this.d) != null) {
            this.f1938t.setGravity(editText.getGravity());
            this.f1938t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f783a);
        setError(f2.f562c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1894M) {
            c cVar = this.f1893L.f367e;
            RectF rectF = this.f1906a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1893L.f368f.a(rectF);
            float a4 = this.f1893L.h.a(rectF);
            float a5 = this.f1893L.f369g.a(rectF);
            k kVar = this.f1893L;
            l lVar = kVar.f364a;
            l lVar2 = kVar.f365b;
            l lVar3 = kVar.d;
            l lVar4 = kVar.f366c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(lVar2);
            j.b(lVar);
            j.b(lVar4);
            j.b(lVar3);
            J0.a aVar = new J0.a(a3);
            J0.a aVar2 = new J0.a(a2);
            J0.a aVar3 = new J0.a(a5);
            J0.a aVar4 = new J0.a(a4);
            k kVar2 = new k();
            kVar2.f364a = lVar2;
            kVar2.f365b = lVar;
            kVar2.f366c = lVar3;
            kVar2.d = lVar4;
            kVar2.f367e = aVar;
            kVar2.f368f = aVar2;
            kVar2.f369g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f370j = eVar2;
            kVar2.f371k = eVar3;
            kVar2.f372l = eVar4;
            this.f1894M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f562c = getError();
        }
        q qVar = this.f1909c;
        f2.d = qVar.i != 0 && qVar.f609g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1881A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue e02 = w1.d.e0(context, com.playbag.tripgear.R.attr.colorControlActivated);
            if (e02 != null) {
                int i = e02.resourceId;
                if (i != 0) {
                    colorStateList2 = w1.d.A(context, i);
                } else {
                    int i2 = e02.data;
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
            if ((m() || (this.f1929o != null && this.f1925m)) && (colorStateList = this.f1883B) != null) {
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
            z zVar = this.f1907b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1910c0 == null || this.f1911d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1910c0 = colorDrawable3;
                    this.f1911d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1910c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1909c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f616p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f617q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f606c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f609g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1915f0;
                        if (colorDrawable != null || this.f1917g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1915f0 = colorDrawable5;
                                this.f1917g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1915f0;
                            if (drawable == colorDrawable2) {
                                this.f1918h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1917g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1915f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1915f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1915f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1918h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1915f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1909c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f617q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1915f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1915f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1910c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1910c0 = null;
            z2 = true;
            qVar = this.f1909c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f617q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1915f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1915f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1909c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f617q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1915f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1915f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0201c0 c0201c0;
        EditText editText = this.d;
        if (editText == null || this.f1896O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0221m0.f2957a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0234t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1925m && (c0201c0 = this.f1929o) != null) {
            mutate.setColorFilter(C0234t.c(c0201c0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f1890I || editText.getBackground() == null) && this.f1896O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = T.f423a;
            editText2.setBackground(editTextBoxBackground);
            this.f1890I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1902U != i) {
            this.f1902U = i;
            this.o0 = i;
            this.f1933q0 = i;
            this.f1935r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o0 = defaultColor;
        this.f1902U = defaultColor;
        this.f1931p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1933q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1935r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1896O) {
            return;
        }
        this.f1896O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1897P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1893L.e();
        c cVar = this.f1893L.f367e;
        l x2 = w1.d.x(i);
        e2.f355a = x2;
        j.b(x2);
        e2.f358e = cVar;
        c cVar2 = this.f1893L.f368f;
        l x3 = w1.d.x(i);
        e2.f356b = x3;
        j.b(x3);
        e2.f359f = cVar2;
        c cVar3 = this.f1893L.h;
        l x4 = w1.d.x(i);
        e2.d = x4;
        j.b(x4);
        e2.h = cVar3;
        c cVar4 = this.f1893L.f369g;
        l x5 = w1.d.x(i);
        e2.f357c = x5;
        j.b(x5);
        e2.f360g = cVar4;
        this.f1893L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1926m0 != i) {
            this.f1926m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.k0 = colorStateList.getDefaultColor();
            this.f1937s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1924l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1926m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1926m0 != colorStateList.getDefaultColor()) {
            this.f1926m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1928n0 != colorStateList) {
            this.f1928n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1899R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1900S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1922k != z2) {
            u uVar = this.f1920j;
            if (z2) {
                C0201c0 c0201c0 = new C0201c0(getContext(), null);
                this.f1929o = c0201c0;
                c0201c0.setId(com.playbag.tripgear.R.id.textinput_counter);
                Typeface typeface = this.f1908b0;
                if (typeface != null) {
                    this.f1929o.setTypeface(typeface);
                }
                this.f1929o.setMaxLines(1);
                uVar.a(this.f1929o, 2);
                ((ViewGroup.MarginLayoutParams) this.f1929o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.playbag.tripgear.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1929o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f1929o, 2);
                this.f1929o = null;
            }
            this.f1922k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1923l != i) {
            if (i > 0) {
                this.f1923l = i;
            } else {
                this.f1923l = -1;
            }
            if (!this.f1922k || this.f1929o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1930p != i) {
            this.f1930p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1950z != colorStateList) {
            this.f1950z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1932q != i) {
            this.f1932q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1948y != colorStateList) {
            this.f1948y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1881A != colorStateList) {
            this.f1881A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1883B != colorStateList) {
            this.f1883B = colorStateList;
            if (m() || (this.f1929o != null && this.f1925m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1919i0 = colorStateList;
        this.f1921j0 = colorStateList;
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
        this.f1909c.f609g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1909c.f609g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1909c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f609g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1909c;
        Drawable z2 = i != 0 ? l.z(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f609g;
        checkableImageButton.setImageDrawable(z2);
        if (z2 != null) {
            ColorStateList colorStateList = qVar.f611k;
            PorterDuff.Mode mode = qVar.f612l;
            TextInputLayout textInputLayout = qVar.f604a;
            l.e(textInputLayout, checkableImageButton, colorStateList, mode);
            l.S(textInputLayout, checkableImageButton, qVar.f611k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1909c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f613m) {
            qVar.f613m = i;
            CheckableImageButton checkableImageButton = qVar.f609g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f606c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1909c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1909c;
        View.OnLongClickListener onLongClickListener = qVar.f615o;
        CheckableImageButton checkableImageButton = qVar.f609g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1909c;
        qVar.f615o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f609g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1909c;
        qVar.f614n = scaleType;
        qVar.f609g.setScaleType(scaleType);
        qVar.f606c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1909c;
        if (qVar.f611k != colorStateList) {
            qVar.f611k = colorStateList;
            l.e(qVar.f604a, qVar.f609g, colorStateList, qVar.f612l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1909c;
        if (qVar.f612l != mode) {
            qVar.f612l = mode;
            l.e(qVar.f604a, qVar.f609g, qVar.f611k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1909c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1920j;
        if (!uVar.f646q) {
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
        uVar.f645p = charSequence;
        uVar.f647r.setText(charSequence);
        int i = uVar.f643n;
        if (i != 1) {
            uVar.f644o = 1;
        }
        uVar.i(i, uVar.f644o, uVar.h(uVar.f647r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f1920j;
        uVar.f649t = i;
        C0201c0 c0201c0 = uVar.f647r;
        if (c0201c0 != null) {
            WeakHashMap weakHashMap = T.f423a;
            c0201c0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1920j;
        uVar.f648s = charSequence;
        C0201c0 c0201c0 = uVar.f647r;
        if (c0201c0 != null) {
            c0201c0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1920j;
        if (uVar.f646q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0201c0 c0201c0 = new C0201c0(uVar.f638g, null);
            uVar.f647r = c0201c0;
            c0201c0.setId(com.playbag.tripgear.R.id.textinput_error);
            uVar.f647r.setTextAlignment(5);
            Typeface typeface = uVar.f632B;
            if (typeface != null) {
                uVar.f647r.setTypeface(typeface);
            }
            int i = uVar.f650u;
            uVar.f650u = i;
            C0201c0 c0201c02 = uVar.f647r;
            if (c0201c02 != null) {
                textInputLayout.l(c0201c02, i);
            }
            ColorStateList colorStateList = uVar.f651v;
            uVar.f651v = colorStateList;
            C0201c0 c0201c03 = uVar.f647r;
            if (c0201c03 != null && colorStateList != null) {
                c0201c03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f648s;
            uVar.f648s = charSequence;
            C0201c0 c0201c04 = uVar.f647r;
            if (c0201c04 != null) {
                c0201c04.setContentDescription(charSequence);
            }
            int i2 = uVar.f649t;
            uVar.f649t = i2;
            C0201c0 c0201c05 = uVar.f647r;
            if (c0201c05 != null) {
                WeakHashMap weakHashMap = T.f423a;
                c0201c05.setAccessibilityLiveRegion(i2);
            }
            uVar.f647r.setVisibility(4);
            uVar.a(uVar.f647r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f647r, 0);
            uVar.f647r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f646q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1909c;
        qVar.i(i != 0 ? l.z(qVar.getContext(), i) : null);
        l.S(qVar.f604a, qVar.f606c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1909c;
        CheckableImageButton checkableImageButton = qVar.f606c;
        View.OnLongClickListener onLongClickListener = qVar.f608f;
        checkableImageButton.setOnClickListener(onClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1909c;
        qVar.f608f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f606c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1909c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            l.e(qVar.f604a, qVar.f606c, colorStateList, qVar.f607e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1909c;
        if (qVar.f607e != mode) {
            qVar.f607e = mode;
            l.e(qVar.f604a, qVar.f606c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f1920j;
        uVar.f650u = i;
        C0201c0 c0201c0 = uVar.f647r;
        if (c0201c0 != null) {
            uVar.h.l(c0201c0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1920j;
        uVar.f651v = colorStateList;
        C0201c0 c0201c0 = uVar.f647r;
        if (c0201c0 == null || colorStateList == null) {
            return;
        }
        c0201c0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f1945w0 != z2) {
            this.f1945w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1920j;
        if (isEmpty) {
            if (uVar.f653x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f653x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f652w = charSequence;
        uVar.f654y.setText(charSequence);
        int i = uVar.f643n;
        if (i != 2) {
            uVar.f644o = 2;
        }
        uVar.i(i, uVar.f644o, uVar.h(uVar.f654y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1920j;
        uVar.f631A = colorStateList;
        C0201c0 c0201c0 = uVar.f654y;
        if (c0201c0 == null || colorStateList == null) {
            return;
        }
        c0201c0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1920j;
        if (uVar.f653x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0201c0 c0201c0 = new C0201c0(uVar.f638g, null);
            uVar.f654y = c0201c0;
            c0201c0.setId(com.playbag.tripgear.R.id.textinput_helper_text);
            uVar.f654y.setTextAlignment(5);
            Typeface typeface = uVar.f632B;
            if (typeface != null) {
                uVar.f654y.setTypeface(typeface);
            }
            uVar.f654y.setVisibility(4);
            uVar.f654y.setAccessibilityLiveRegion(1);
            int i = uVar.f655z;
            uVar.f655z = i;
            C0201c0 c0201c02 = uVar.f654y;
            if (c0201c02 != null) {
                c0201c02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f631A;
            uVar.f631A = colorStateList;
            C0201c0 c0201c03 = uVar.f654y;
            if (c0201c03 != null && colorStateList != null) {
                c0201c03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f654y, 1);
            uVar.f654y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f643n;
            if (i2 == 2) {
                uVar.f644o = 0;
            }
            uVar.i(i2, uVar.f644o, uVar.h(uVar.f654y, ""));
            uVar.g(uVar.f654y, 1);
            uVar.f654y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f653x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f1920j;
        uVar.f655z = i;
        C0201c0 c0201c0 = uVar.f654y;
        if (c0201c0 != null) {
            c0201c0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1885C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f1947x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1885C) {
            this.f1885C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1886D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1887E = true;
            } else {
                this.f1887E = false;
                if (!TextUtils.isEmpty(this.f1886D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1886D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f1943v0;
        TextInputLayout textInputLayout = dVar.f163a;
        G0.d dVar2 = new G0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f247j;
        if (colorStateList != null) {
            dVar.f176k = colorStateList;
        }
        float f2 = dVar2.f248k;
        if (f2 != RecyclerView.f1530C0) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f241a;
        if (colorStateList2 != null) {
            dVar.f157U = colorStateList2;
        }
        dVar.f155S = dVar2.f244e;
        dVar.f156T = dVar2.f245f;
        dVar.f154R = dVar2.f246g;
        dVar.f158V = dVar2.i;
        G0.a aVar = dVar.f190y;
        if (aVar != null) {
            aVar.f237c = true;
        }
        C.g gVar = new C.g(1, dVar);
        dVar2.a();
        dVar.f190y = new G0.a(gVar, dVar2.f251n);
        dVar2.c(textInputLayout.getContext(), dVar.f190y);
        dVar.h(false);
        this.f1921j0 = dVar.f176k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1921j0 != colorStateList) {
            if (this.f1919i0 == null) {
                d dVar = this.f1943v0;
                if (dVar.f176k != colorStateList) {
                    dVar.f176k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f1921j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f1927n = e2;
    }

    public void setMaxEms(int i) {
        this.f1916g = i;
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
        this.f1914f = i;
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
        q qVar = this.f1909c;
        qVar.f609g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1909c;
        qVar.f609g.setImageDrawable(i != 0 ? l.z(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1909c;
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
        q qVar = this.f1909c;
        qVar.f611k = colorStateList;
        l.e(qVar.f604a, qVar.f609g, colorStateList, qVar.f612l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1909c;
        qVar.f612l = mode;
        l.e(qVar.f604a, qVar.f609g, qVar.f611k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1938t == null) {
            C0201c0 c0201c0 = new C0201c0(getContext(), null);
            this.f1938t = c0201c0;
            c0201c0.setId(com.playbag.tripgear.R.id.textinput_placeholder);
            this.f1938t.setImportantForAccessibility(2);
            h d = d();
            this.f1944w = d;
            d.f3085b = 67L;
            this.f1946x = d();
            setPlaceholderTextAppearance(this.f1942v);
            setPlaceholderTextColor(this.f1940u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1936s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1934r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1942v = i;
        C0201c0 c0201c0 = this.f1938t;
        if (c0201c0 != null) {
            c0201c0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1940u != colorStateList) {
            this.f1940u = colorStateList;
            C0201c0 c0201c0 = this.f1938t;
            if (c0201c0 == null || colorStateList == null) {
                return;
            }
            c0201c0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1907b;
        zVar.getClass();
        zVar.f672c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f671b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1907b.f671b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1907b.f671b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f335a.f321a == kVar) {
            return;
        }
        this.f1893L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1907b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1907b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? l.z(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1907b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f675g) {
            zVar.f675g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1907b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1907b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1907b;
        zVar.h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1907b;
        if (zVar.f673e != colorStateList) {
            zVar.f673e = colorStateList;
            l.e(zVar.f670a, zVar.d, colorStateList, zVar.f674f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1907b;
        if (zVar.f674f != mode) {
            zVar.f674f = mode;
            l.e(zVar.f670a, zVar.d, zVar.f673e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1907b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1909c;
        qVar.getClass();
        qVar.f616p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f617q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1909c.f617q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1909c.f617q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            T.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1908b0) {
            this.f1908b0 = typeface;
            this.f1943v0.m(typeface);
            u uVar = this.f1920j;
            if (typeface != uVar.f632B) {
                uVar.f632B = typeface;
                C0201c0 c0201c0 = uVar.f647r;
                if (c0201c0 != null) {
                    c0201c0.setTypeface(typeface);
                }
                C0201c0 c0201c02 = uVar.f654y;
                if (c0201c02 != null) {
                    c0201c02.setTypeface(typeface);
                }
            }
            C0201c0 c0201c03 = this.f1929o;
            if (c0201c03 != null) {
                c0201c03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1896O != 1) {
            FrameLayout frameLayout = this.f1905a;
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
        C0201c0 c0201c0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1919i0;
        d dVar = this.f1943v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1919i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1937s0) : this.f1937s0));
        } else if (m()) {
            C0201c0 c0201c02 = this.f1920j.f647r;
            dVar.i(c0201c02 != null ? c0201c02.getTextColors() : null);
        } else if (this.f1925m && (c0201c0 = this.f1929o) != null) {
            dVar.i(c0201c0.getTextColors());
        } else if (z5 && (colorStateList = this.f1921j0) != null && dVar.f176k != colorStateList) {
            dVar.f176k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f1909c;
        z zVar = this.f1907b;
        if (z4 || !this.f1945w0 || (isEnabled() && z5)) {
            if (z3 || this.f1941u0) {
                ValueAnimator valueAnimator = this.f1949y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1949y0.cancel();
                }
                if (z2 && this.f1947x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f1941u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f676j = false;
                zVar.e();
                qVar.f618r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f1941u0) {
            ValueAnimator valueAnimator2 = this.f1949y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1949y0.cancel();
            }
            if (z2 && this.f1947x0) {
                a(RecyclerView.f1530C0);
            } else {
                dVar.k(RecyclerView.f1530C0);
            }
            if (e() && !((M0.h) this.F).f581x.f579q.isEmpty() && e()) {
                ((M0.h) this.F).n(RecyclerView.f1530C0, RecyclerView.f1530C0, RecyclerView.f1530C0, RecyclerView.f1530C0);
            }
            this.f1941u0 = true;
            C0201c0 c0201c03 = this.f1938t;
            if (c0201c03 != null && this.f1936s) {
                c0201c03.setText((CharSequence) null);
                l0.q.a(this.f1905a, this.f1946x);
                this.f1938t.setVisibility(4);
            }
            zVar.f676j = true;
            zVar.e();
            qVar.f618r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0009g) this.f1927n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1905a;
        if (length != 0 || this.f1941u0) {
            C0201c0 c0201c0 = this.f1938t;
            if (c0201c0 == null || !this.f1936s) {
                return;
            }
            c0201c0.setText((CharSequence) null);
            l0.q.a(frameLayout, this.f1946x);
            this.f1938t.setVisibility(4);
            return;
        }
        if (this.f1938t == null || !this.f1936s || TextUtils.isEmpty(this.f1934r)) {
            return;
        }
        this.f1938t.setText(this.f1934r);
        l0.q.a(frameLayout, this.f1944w);
        this.f1938t.setVisibility(0);
        this.f1938t.bringToFront();
        announceForAccessibility(this.f1934r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f1928n0.getDefaultColor();
        int colorForState = this.f1928n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1928n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1901T = colorForState2;
        } else if (z3) {
            this.f1901T = colorForState;
        } else {
            this.f1901T = defaultColor;
        }
    }

    public final void x() {
        C0201c0 c0201c0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1896O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1901T = this.f1937s0;
        } else if (m()) {
            if (this.f1928n0 != null) {
                w(z3, z2);
            } else {
                this.f1901T = getErrorCurrentTextColors();
            }
        } else if (!this.f1925m || (c0201c0 = this.f1929o) == null) {
            if (z3) {
                this.f1901T = this.f1926m0;
            } else if (z2) {
                this.f1901T = this.f1924l0;
            } else {
                this.f1901T = this.k0;
            }
        } else if (this.f1928n0 != null) {
            w(z3, z2);
        } else {
            this.f1901T = c0201c0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1909c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f606c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f604a;
        l.S(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f611k;
        CheckableImageButton checkableImageButton2 = qVar.f609g;
        l.S(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof M0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                l.e(textInputLayout, checkableImageButton2, qVar.f611k, qVar.f612l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1907b;
        l.S(zVar.f670a, zVar.d, zVar.f673e);
        if (this.f1896O == 2) {
            int i = this.f1898Q;
            if (z3 && isEnabled()) {
                this.f1898Q = this.f1900S;
            } else {
                this.f1898Q = this.f1899R;
            }
            if (this.f1898Q != i && e() && !this.f1941u0) {
                if (e()) {
                    ((M0.h) this.F).n(RecyclerView.f1530C0, RecyclerView.f1530C0, RecyclerView.f1530C0, RecyclerView.f1530C0);
                }
                j();
            }
        }
        if (this.f1896O == 1) {
            if (!isEnabled()) {
                this.f1902U = this.f1931p0;
            } else if (z2 && !z3) {
                this.f1902U = this.f1935r0;
            } else if (z3) {
                this.f1902U = this.f1933q0;
            } else {
                this.f1902U = this.o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1907b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1909c.f609g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1909c.f609g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1909c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1909c.f609g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1909c;
        CheckableImageButton checkableImageButton = qVar.f609g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f611k;
            PorterDuff.Mode mode = qVar.f612l;
            TextInputLayout textInputLayout = qVar.f604a;
            l.e(textInputLayout, checkableImageButton, colorStateList, mode);
            l.S(textInputLayout, checkableImageButton, qVar.f611k);
        }
    }
}
