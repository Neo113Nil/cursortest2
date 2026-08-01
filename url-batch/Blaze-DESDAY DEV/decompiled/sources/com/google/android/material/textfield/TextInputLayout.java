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
import k0.AbstractC0180a;
import l.AbstractC0224m0;
import l.C0204c0;
import l.C0239u;
import l0.h;
import p0.AbstractC0285a;
import q0.AbstractC0292a;
import z1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1912C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1913A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1914A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1915B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1916B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1917C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1918D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1919E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1920G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1921H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1922I;

    /* renamed from: J, reason: collision with root package name */
    public g f1923J;

    /* renamed from: K, reason: collision with root package name */
    public g f1924K;

    /* renamed from: L, reason: collision with root package name */
    public k f1925L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1926M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1927N;

    /* renamed from: O, reason: collision with root package name */
    public int f1928O;

    /* renamed from: P, reason: collision with root package name */
    public int f1929P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1930Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1931R;

    /* renamed from: S, reason: collision with root package name */
    public int f1932S;

    /* renamed from: T, reason: collision with root package name */
    public int f1933T;

    /* renamed from: U, reason: collision with root package name */
    public int f1934U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1935V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1936W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1937a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1938a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1939b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1940b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1941c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1942c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1943d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1944e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1945e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1946f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1947f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1948g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1949g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1950h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f1951i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f1952j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f1953j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1954k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1955k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1956l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1957l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1958m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1959m0;

    /* renamed from: n, reason: collision with root package name */
    public E f1960n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f1961n0;

    /* renamed from: o, reason: collision with root package name */
    public C0204c0 f1962o;
    public int o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1963p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1964p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1965q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1966q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1967r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1968r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1969s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1970s0;

    /* renamed from: t, reason: collision with root package name */
    public C0204c0 f1971t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1972t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f1973u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1974u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1975v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f1976v0;

    /* renamed from: w, reason: collision with root package name */
    public h f1977w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1978w0;

    /* renamed from: x, reason: collision with root package name */
    public h f1979x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1980x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1981y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f1982y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1983z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winworm.neongrid.R.attr.textInputStyle, com.winworm.neongrid.R.style.Widget_Design_TextInputLayout), attributeSet, com.winworm.neongrid.R.attr.textInputStyle);
        this.f1946f = -1;
        this.f1948g = -1;
        this.h = -1;
        this.i = -1;
        this.f1952j = new u(this);
        this.f1960n = new C0009g(2);
        this.f1935V = new Rect();
        this.f1936W = new Rect();
        this.f1938a0 = new RectF();
        this.f1945e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f1976v0 = dVar;
        this.f1916B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1937a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0292a.f3384a;
        dVar.f115Q = linearInterpolator;
        dVar.h(false);
        dVar.f114P = linearInterpolator;
        dVar.h(false);
        if (dVar.f136g != 8388659) {
            dVar.f136g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0285a.f3321A;
        n.a(context2, attributeSet, com.winworm.neongrid.R.attr.textInputStyle, com.winworm.neongrid.R.style.Widget_Design_TextInputLayout);
        n.b(context2, attributeSet, iArr, com.winworm.neongrid.R.attr.textInputStyle, com.winworm.neongrid.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winworm.neongrid.R.attr.textInputStyle, com.winworm.neongrid.R.style.Widget_Design_TextInputLayout);
        C0014l c0014l = new C0014l(context2, obtainStyledAttributes);
        z zVar = new z(this, c0014l);
        this.f1939b = zVar;
        this.f1917C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f1980x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1978w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1925L = k.b(context2, attributeSet, com.winworm.neongrid.R.attr.textInputStyle, com.winworm.neongrid.R.style.Widget_Design_TextInputLayout).a();
        this.f1927N = context2.getResources().getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1929P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1931R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1932S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1930Q = this.f1931R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1925L.e();
        if (dimension >= RecyclerView.f1559A0) {
            e2.f375e = new J0.a(dimension);
        }
        if (dimension2 >= RecyclerView.f1559A0) {
            e2.f376f = new J0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.f1559A0) {
            e2.f377g = new J0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.f1559A0) {
            e2.h = new J0.a(dimension4);
        }
        this.f1925L = e2.a();
        ColorStateList s2 = l.s(context2, c0014l, 7);
        if (s2 != null) {
            int defaultColor = s2.getDefaultColor();
            this.o0 = defaultColor;
            this.f1934U = defaultColor;
            if (s2.isStateful()) {
                this.f1964p0 = s2.getColorForState(new int[]{-16842910}, -1);
                this.f1966q0 = s2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1968r0 = s2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1966q0 = this.o0;
                ColorStateList C2 = z1.d.C(context2, com.winworm.neongrid.R.color.mtrl_filled_background_color);
                this.f1964p0 = C2.getColorForState(new int[]{-16842910}, -1);
                this.f1968r0 = C2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1934U = 0;
            this.o0 = 0;
            this.f1964p0 = 0;
            this.f1966q0 = 0;
            this.f1968r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList b2 = c0014l.b(1);
            this.f1953j0 = b2;
            this.f1951i0 = b2;
        }
        ColorStateList s3 = l.s(context2, c0014l, 14);
        this.f1959m0 = obtainStyledAttributes.getColor(14, 0);
        this.f1955k0 = b.a(context2, com.winworm.neongrid.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1970s0 = b.a(context2, com.winworm.neongrid.R.color.mtrl_textinput_disabled_color);
        this.f1957l0 = b.a(context2, com.winworm.neongrid.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (s3 != null) {
            setBoxStrokeColorStateList(s3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(l.s(context2, c0014l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1913A = c0014l.b(24);
        this.f1915B = c0014l.b(25);
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
        this.f1965q = obtainStyledAttributes.getResourceId(22, 0);
        this.f1963p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1963p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1965q);
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
        this.f1941c = qVar;
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
        if (!(editText instanceof AutoCompleteTextView) || z1.d.S(editText)) {
            return this.F;
        }
        int i = AbstractC0180a.i(this.d, com.winworm.neongrid.R.attr.colorControlHighlight);
        int i2 = this.f1928O;
        int[][] iArr = f1912C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            g gVar = this.F;
            int i3 = this.f1934U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0180a.l(i, i3, 0.1f), i3}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue j02 = z1.d.j0(context, com.winworm.neongrid.R.attr.colorSurface, "TextInputLayout");
        int i4 = j02.resourceId;
        int a2 = i4 != 0 ? b.a(context, i4) : j02.data;
        g gVar3 = new g(gVar2.f352a.f338a);
        int l2 = AbstractC0180a.l(i, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{l2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{l2, a2});
        g gVar4 = new g(gVar2.f352a.f338a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1921H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1921H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1921H.addState(new int[0], f(false));
        }
        return this.f1921H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1920G == null) {
            this.f1920G = f(true);
        }
        return this.f1920G;
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
        int i = this.f1946f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1948g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1922I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f1976v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f121W != letterSpacing) {
            dVar.f121W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f136g != i4) {
            dVar.f136g = i4;
            dVar.h(false);
        }
        if (dVar.f134f != gravity) {
            dVar.f134f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = T.f440a;
        this.f1972t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f1951i0 == null) {
            this.f1951i0 = this.d.getHintTextColors();
        }
        if (this.f1917C) {
            if (TextUtils.isEmpty(this.f1918D)) {
                CharSequence hint = this.d.getHint();
                this.f1944e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1919E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f1962o != null) {
            n(this.d.getText());
        }
        r();
        this.f1952j.b();
        this.f1939b.bringToFront();
        q qVar = this.f1941c;
        qVar.bringToFront();
        Iterator it = this.f1945e0.iterator();
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
        if (TextUtils.equals(charSequence, this.f1918D)) {
            return;
        }
        this.f1918D = charSequence;
        d dVar = this.f1976v0;
        if (charSequence == null || !TextUtils.equals(dVar.f100A, charSequence)) {
            dVar.f100A = charSequence;
            dVar.f101B = null;
            Bitmap bitmap = dVar.f104E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f104E = null;
            }
            dVar.h(false);
        }
        if (this.f1974u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1969s == z2) {
            return;
        }
        if (z2) {
            C0204c0 c0204c0 = this.f1971t;
            if (c0204c0 != null) {
                this.f1937a.addView(c0204c0);
                this.f1971t.setVisibility(0);
            }
        } else {
            C0204c0 c0204c02 = this.f1971t;
            if (c0204c02 != null) {
                c0204c02.setVisibility(8);
            }
            this.f1971t = null;
        }
        this.f1969s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f1976v0;
        if (dVar.f127b == f2) {
            return;
        }
        if (this.f1982y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1982y0 = valueAnimator;
            valueAnimator.setInterpolator(z1.d.i0(getContext(), com.winworm.neongrid.R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.f3385b));
            this.f1982y0.setDuration(z1.d.h0(getContext(), com.winworm.neongrid.R.attr.motionDurationMedium4, 167));
            this.f1982y0.addUpdateListener(new C(i, this));
        }
        this.f1982y0.setFloatValues(dVar.f127b, f2);
        this.f1982y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1937a;
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
        k kVar = gVar.f352a.f338a;
        k kVar2 = this.f1925L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1928O == 2 && (i = this.f1930Q) > -1 && (i2 = this.f1933T) != 0) {
            g gVar2 = this.F;
            gVar2.f352a.f344j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f352a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1934U;
        if (this.f1928O == 1) {
            i3 = C.a.b(this.f1934U, AbstractC0180a.h(getContext(), com.winworm.neongrid.R.attr.colorSurface, 0));
        }
        this.f1934U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1923J;
        if (gVar3 != null && this.f1924K != null) {
            if (this.f1930Q > -1 && this.f1933T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f1955k0) : ColorStateList.valueOf(this.f1933T));
                this.f1924K.j(ColorStateList.valueOf(this.f1933T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1917C) {
            return 0;
        }
        int i = this.f1928O;
        d dVar = this.f1976v0;
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
        hVar.f3114c = z1.d.h0(getContext(), com.winworm.neongrid.R.attr.motionDurationShort2, 87);
        hVar.d = z1.d.i0(getContext(), com.winworm.neongrid.R.attr.motionEasingLinearInterpolator, AbstractC0292a.f3384a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1944e != null) {
            boolean z2 = this.f1919E;
            this.f1919E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1944e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1919E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1937a;
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
        this.f1914A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1914A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1917C;
        d dVar = this.f1976v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f101B != null) {
                RectF rectF = dVar.f132e;
                if (rectF.width() > RecyclerView.f1559A0 && rectF.height() > RecyclerView.f1559A0) {
                    TextPaint textPaint = dVar.f112N;
                    textPaint.setTextSize(dVar.f105G);
                    float f2 = dVar.f143p;
                    float f3 = dVar.f144q;
                    float f4 = dVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f131d0 <= 1 || dVar.f102C) {
                        canvas.translate(f2, f3);
                        dVar.f123Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f143p - dVar.f123Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f128b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f106H;
                            float f7 = dVar.f107I;
                            float f8 = dVar.f108J;
                            int i3 = dVar.f109K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f123Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f126a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f106H;
                            float f10 = dVar.f107I;
                            float f11 = dVar.f108J;
                            int i4 = dVar.f109K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f123Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f130c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.f1559A0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f106H, dVar.f107I, dVar.f108J, dVar.f109K);
                        }
                        String trim = dVar.f130c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f123Y.getLineEnd(i), str.length()), RecyclerView.f1559A0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1924K == null || (gVar = this.f1923J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1924K.getBounds();
            Rect bounds2 = this.f1923J.getBounds();
            float f13 = dVar.f127b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0292a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0292a.c(centerX, bounds2.right, f13);
            this.f1924K.draw(canvas);
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
        d dVar = this.f1976v0;
        if (dVar != null) {
            dVar.f110L = drawableState;
            ColorStateList colorStateList2 = dVar.f138k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f137j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = T.f440a;
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
        return this.f1917C && !TextUtils.isEmpty(this.f1918D) && (this.F instanceof M0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.f1559A0;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.winworm.neongrid.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
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
        kVar.f381a = iVar;
        kVar.f382b = iVar2;
        kVar.f383c = iVar3;
        kVar.d = iVar4;
        kVar.f384e = aVar;
        kVar.f385f = aVar2;
        kVar.f386g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f387j = eVar2;
        kVar.f388k = eVar3;
        kVar.f389l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f351w;
            TypedValue j02 = z1.d.j0(context, com.winworm.neongrid.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = j02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : j02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f352a;
        if (fVar.f343g == null) {
            fVar.f343g = new Rect();
        }
        gVar.f352a.f343g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1941c.c() : this.f1939b.a()) + i;
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
        int i = this.f1928O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1934U;
    }

    public int getBoxBackgroundMode() {
        return this.f1928O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1929P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1938a0;
        return e2 ? this.f1925L.h.a(rectF) : this.f1925L.f386g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1938a0;
        return e2 ? this.f1925L.f386g.a(rectF) : this.f1925L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1938a0;
        return e2 ? this.f1925L.f384e.a(rectF) : this.f1925L.f385f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1938a0;
        return e2 ? this.f1925L.f385f.a(rectF) : this.f1925L.f384e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1959m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1961n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1931R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1932S;
    }

    public int getCounterMaxLength() {
        return this.f1956l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0204c0 c0204c0;
        if (this.f1954k && this.f1958m && (c0204c0 = this.f1962o) != null) {
            return c0204c0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1983z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1981y;
    }

    public ColorStateList getCursorColor() {
        return this.f1913A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1915B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1951i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1941c.f626g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1941c.f626g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1941c.f630m;
    }

    public int getEndIconMode() {
        return this.f1941c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1941c.f631n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1941c.f626g;
    }

    public CharSequence getError() {
        u uVar = this.f1952j;
        if (uVar.f663q) {
            return uVar.f662p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1952j.f666t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1952j.f665s;
    }

    public int getErrorCurrentTextColors() {
        C0204c0 c0204c0 = this.f1952j.f664r;
        if (c0204c0 != null) {
            return c0204c0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1941c.f623c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1952j;
        if (uVar.f670x) {
            return uVar.f669w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0204c0 c0204c0 = this.f1952j.f671y;
        if (c0204c0 != null) {
            return c0204c0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1917C) {
            return this.f1918D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1976v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f1976v0;
        return dVar.e(dVar.f138k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1953j0;
    }

    public E getLengthCounter() {
        return this.f1960n;
    }

    public int getMaxEms() {
        return this.f1948g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1946f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1941c.f626g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1941c.f626g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1969s) {
            return this.f1967r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1975v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1973u;
    }

    public CharSequence getPrefixText() {
        return this.f1939b.f689c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1939b.f688b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1939b.f688b;
    }

    public k getShapeAppearanceModel() {
        return this.f1925L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1939b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1939b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1939b.f692g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1939b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1941c.f633p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1941c.f634q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1941c.f634q;
    }

    public Typeface getTypeface() {
        return this.f1940b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1939b.a() : this.f1941c.c());
    }

    public final void i() {
        int i = this.f1928O;
        if (i == 0) {
            this.F = null;
            this.f1923J = null;
            this.f1924K = null;
        } else if (i == 1) {
            this.F = new g(this.f1925L);
            this.f1923J = new g();
            this.f1924K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1928O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1917C || (this.F instanceof M0.h)) {
                this.F = new g(this.f1925L);
            } else {
                k kVar = this.f1925L;
                int i2 = M0.h.f597y;
                if (kVar == null) {
                    kVar = new k();
                }
                M0.g gVar = new M0.g(kVar, new RectF());
                M0.h hVar = new M0.h(gVar);
                hVar.f598x = gVar;
                this.F = hVar;
            }
            this.f1923J = null;
            this.f1924K = null;
        }
        s();
        x();
        if (this.f1928O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1929P = getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (l.F(getContext())) {
                this.f1929P = getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1928O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = T.f440a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (l.F(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = T.f440a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1928O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1928O;
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
            d dVar = this.f1976v0;
            boolean b2 = dVar.b(dVar.f100A);
            dVar.f102C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f124Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f124Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1938a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f124Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f102C) {
                        f5 = max + dVar.f124Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f102C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f124Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > RecyclerView.f1559A0 || rectF.height() <= RecyclerView.f1559A0) {
                }
                float f6 = rectF.left;
                float f7 = this.f1927N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1930Q);
                M0.h hVar = (M0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f124Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1938a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f124Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > RecyclerView.f1559A0) {
            }
        }
    }

    public final void l(C0204c0 c0204c0, int i) {
        try {
            c0204c0.setTextAppearance(i);
            if (c0204c0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0204c0.setTextAppearance(com.winworm.neongrid.R.style.TextAppearance_AppCompat_Caption);
        c0204c0.setTextColor(b.a(getContext(), com.winworm.neongrid.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f1952j;
        return (uVar.f661o != 1 || uVar.f664r == null || TextUtils.isEmpty(uVar.f662p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0009g) this.f1960n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f1958m;
        int i = this.f1956l;
        String str = null;
        if (i == -1) {
            this.f1962o.setText(String.valueOf(length));
            this.f1962o.setContentDescription(null);
            this.f1958m = false;
        } else {
            this.f1958m = length > i;
            Context context = getContext();
            this.f1962o.setContentDescription(context.getString(this.f1958m ? com.winworm.neongrid.R.string.character_counter_overflowed_content_description : com.winworm.neongrid.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1956l)));
            if (z2 != this.f1958m) {
                o();
            }
            String str2 = I.b.f308b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f310e : I.b.d;
            C0204c0 c0204c0 = this.f1962o;
            String string = getContext().getString(com.winworm.neongrid.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1956l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f318a;
                str = bVar.c(string).toString();
            }
            c0204c0.setText(str);
        }
        if (this.d == null || z2 == this.f1958m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0204c0 c0204c0 = this.f1962o;
        if (c0204c0 != null) {
            l(c0204c0, this.f1958m ? this.f1963p : this.f1965q);
            if (!this.f1958m && (colorStateList2 = this.f1981y) != null) {
                this.f1962o.setTextColor(colorStateList2);
            }
            if (!this.f1958m || (colorStateList = this.f1983z) == null) {
                return;
            }
            this.f1962o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1976v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1941c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1916B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1939b.getMeasuredHeight()))) {
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
            ThreadLocal threadLocal = D0.e.f154a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1935V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = D0.e.f154a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            D0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = D0.e.f155b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1923J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1931R, rect.right, i5);
            }
            g gVar2 = this.f1924K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1932S, rect.right, i6);
            }
            if (this.f1917C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f1976v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f136g != i7) {
                    dVar.f136g = i7;
                    dVar.h(false);
                }
                if (dVar.f134f != gravity) {
                    dVar.f134f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = n.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1936W;
                rect2.bottom = i8;
                int i9 = this.f1928O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1929P;
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
                    dVar.f111M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f113O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f148u);
                textPaint.setLetterSpacing(dVar.f121W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1928O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1928O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f129c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f111M = true;
                }
                dVar.h(false);
                if (!e() || this.f1974u0) {
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
        boolean z2 = this.f1916B0;
        q qVar = this.f1941c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1916B0 = true;
        }
        if (this.f1971t != null && (editText = this.d) != null) {
            this.f1971t.setGravity(editText.getGravity());
            this.f1971t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f762a);
        setError(f2.f579c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1926M) {
            c cVar = this.f1925L.f384e;
            RectF rectF = this.f1938a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1925L.f385f.a(rectF);
            float a4 = this.f1925L.h.a(rectF);
            float a5 = this.f1925L.f386g.a(rectF);
            k kVar = this.f1925L;
            l lVar = kVar.f381a;
            l lVar2 = kVar.f382b;
            l lVar3 = kVar.d;
            l lVar4 = kVar.f383c;
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
            kVar2.f381a = lVar2;
            kVar2.f382b = lVar;
            kVar2.f383c = lVar3;
            kVar2.d = lVar4;
            kVar2.f384e = aVar;
            kVar2.f385f = aVar2;
            kVar2.f386g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f387j = eVar2;
            kVar2.f388k = eVar3;
            kVar2.f389l = eVar4;
            this.f1926M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f579c = getError();
        }
        q qVar = this.f1941c;
        f2.d = qVar.i != 0 && qVar.f626g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1913A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue f02 = z1.d.f0(context, com.winworm.neongrid.R.attr.colorControlActivated);
            if (f02 != null) {
                int i = f02.resourceId;
                if (i != 0) {
                    colorStateList2 = z1.d.C(context, i);
                } else {
                    int i2 = f02.data;
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
            if ((m() || (this.f1962o != null && this.f1958m)) && (colorStateList = this.f1915B) != null) {
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
            z zVar = this.f1939b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1942c0 == null || this.f1943d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1942c0 = colorDrawable3;
                    this.f1943d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1942c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1941c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f633p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f634q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f623c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f626g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1947f0;
                        if (colorDrawable != null || this.f1949g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1947f0 = colorDrawable5;
                                this.f1949g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1947f0;
                            if (drawable == colorDrawable2) {
                                this.f1950h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1949g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1947f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1947f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1947f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1950h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1947f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1941c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f634q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1947f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1947f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1942c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1942c0 = null;
            z2 = true;
            qVar = this.f1941c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f634q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1947f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1947f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1941c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f634q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1947f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1947f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0204c0 c0204c0;
        EditText editText = this.d;
        if (editText == null || this.f1928O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0224m0.f2982a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0239u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1958m && (c0204c0 = this.f1962o) != null) {
            mutate.setColorFilter(C0239u.c(c0204c0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f1922I || editText.getBackground() == null) && this.f1928O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = T.f440a;
            editText2.setBackground(editTextBoxBackground);
            this.f1922I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1934U != i) {
            this.f1934U = i;
            this.o0 = i;
            this.f1966q0 = i;
            this.f1968r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o0 = defaultColor;
        this.f1934U = defaultColor;
        this.f1964p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1966q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1968r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1928O) {
            return;
        }
        this.f1928O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1929P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1925L.e();
        c cVar = this.f1925L.f384e;
        l x2 = z1.d.x(i);
        e2.f372a = x2;
        j.b(x2);
        e2.f375e = cVar;
        c cVar2 = this.f1925L.f385f;
        l x3 = z1.d.x(i);
        e2.f373b = x3;
        j.b(x3);
        e2.f376f = cVar2;
        c cVar3 = this.f1925L.h;
        l x4 = z1.d.x(i);
        e2.d = x4;
        j.b(x4);
        e2.h = cVar3;
        c cVar4 = this.f1925L.f386g;
        l x5 = z1.d.x(i);
        e2.f374c = x5;
        j.b(x5);
        e2.f377g = cVar4;
        this.f1925L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1959m0 != i) {
            this.f1959m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1955k0 = colorStateList.getDefaultColor();
            this.f1970s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1957l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1959m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1959m0 != colorStateList.getDefaultColor()) {
            this.f1959m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1961n0 != colorStateList) {
            this.f1961n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1931R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1932S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1954k != z2) {
            u uVar = this.f1952j;
            if (z2) {
                C0204c0 c0204c0 = new C0204c0(getContext(), null);
                this.f1962o = c0204c0;
                c0204c0.setId(com.winworm.neongrid.R.id.textinput_counter);
                Typeface typeface = this.f1940b0;
                if (typeface != null) {
                    this.f1962o.setTypeface(typeface);
                }
                this.f1962o.setMaxLines(1);
                uVar.a(this.f1962o, 2);
                ((ViewGroup.MarginLayoutParams) this.f1962o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.winworm.neongrid.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1962o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f1962o, 2);
                this.f1962o = null;
            }
            this.f1954k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1956l != i) {
            if (i > 0) {
                this.f1956l = i;
            } else {
                this.f1956l = -1;
            }
            if (!this.f1954k || this.f1962o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1963p != i) {
            this.f1963p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1983z != colorStateList) {
            this.f1983z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1965q != i) {
            this.f1965q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1981y != colorStateList) {
            this.f1981y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1913A != colorStateList) {
            this.f1913A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1915B != colorStateList) {
            this.f1915B = colorStateList;
            if (m() || (this.f1962o != null && this.f1958m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1951i0 = colorStateList;
        this.f1953j0 = colorStateList;
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
        this.f1941c.f626g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1941c.f626g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1941c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f626g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1941c;
        Drawable w2 = i != 0 ? l.w(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f626g;
        checkableImageButton.setImageDrawable(w2);
        if (w2 != null) {
            ColorStateList colorStateList = qVar.f628k;
            PorterDuff.Mode mode = qVar.f629l;
            TextInputLayout textInputLayout = qVar.f621a;
            l.a(textInputLayout, checkableImageButton, colorStateList, mode);
            l.R(textInputLayout, checkableImageButton, qVar.f628k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1941c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f630m) {
            qVar.f630m = i;
            CheckableImageButton checkableImageButton = qVar.f626g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f623c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1941c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1941c;
        View.OnLongClickListener onLongClickListener = qVar.f632o;
        CheckableImageButton checkableImageButton = qVar.f626g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1941c;
        qVar.f632o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f626g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1941c;
        qVar.f631n = scaleType;
        qVar.f626g.setScaleType(scaleType);
        qVar.f623c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1941c;
        if (qVar.f628k != colorStateList) {
            qVar.f628k = colorStateList;
            l.a(qVar.f621a, qVar.f626g, colorStateList, qVar.f629l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1941c;
        if (qVar.f629l != mode) {
            qVar.f629l = mode;
            l.a(qVar.f621a, qVar.f626g, qVar.f628k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1941c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1952j;
        if (!uVar.f663q) {
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
        uVar.f662p = charSequence;
        uVar.f664r.setText(charSequence);
        int i = uVar.f660n;
        if (i != 1) {
            uVar.f661o = 1;
        }
        uVar.i(i, uVar.f661o, uVar.h(uVar.f664r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f1952j;
        uVar.f666t = i;
        C0204c0 c0204c0 = uVar.f664r;
        if (c0204c0 != null) {
            WeakHashMap weakHashMap = T.f440a;
            c0204c0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1952j;
        uVar.f665s = charSequence;
        C0204c0 c0204c0 = uVar.f664r;
        if (c0204c0 != null) {
            c0204c0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1952j;
        if (uVar.f663q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0204c0 c0204c0 = new C0204c0(uVar.f655g, null);
            uVar.f664r = c0204c0;
            c0204c0.setId(com.winworm.neongrid.R.id.textinput_error);
            uVar.f664r.setTextAlignment(5);
            Typeface typeface = uVar.f649B;
            if (typeface != null) {
                uVar.f664r.setTypeface(typeface);
            }
            int i = uVar.f667u;
            uVar.f667u = i;
            C0204c0 c0204c02 = uVar.f664r;
            if (c0204c02 != null) {
                textInputLayout.l(c0204c02, i);
            }
            ColorStateList colorStateList = uVar.f668v;
            uVar.f668v = colorStateList;
            C0204c0 c0204c03 = uVar.f664r;
            if (c0204c03 != null && colorStateList != null) {
                c0204c03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f665s;
            uVar.f665s = charSequence;
            C0204c0 c0204c04 = uVar.f664r;
            if (c0204c04 != null) {
                c0204c04.setContentDescription(charSequence);
            }
            int i2 = uVar.f666t;
            uVar.f666t = i2;
            C0204c0 c0204c05 = uVar.f664r;
            if (c0204c05 != null) {
                WeakHashMap weakHashMap = T.f440a;
                c0204c05.setAccessibilityLiveRegion(i2);
            }
            uVar.f664r.setVisibility(4);
            uVar.a(uVar.f664r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f664r, 0);
            uVar.f664r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f663q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1941c;
        qVar.i(i != 0 ? l.w(qVar.getContext(), i) : null);
        l.R(qVar.f621a, qVar.f623c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1941c;
        CheckableImageButton checkableImageButton = qVar.f623c;
        View.OnLongClickListener onLongClickListener = qVar.f625f;
        checkableImageButton.setOnClickListener(onClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1941c;
        qVar.f625f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f623c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1941c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            l.a(qVar.f621a, qVar.f623c, colorStateList, qVar.f624e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1941c;
        if (qVar.f624e != mode) {
            qVar.f624e = mode;
            l.a(qVar.f621a, qVar.f623c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f1952j;
        uVar.f667u = i;
        C0204c0 c0204c0 = uVar.f664r;
        if (c0204c0 != null) {
            uVar.h.l(c0204c0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1952j;
        uVar.f668v = colorStateList;
        C0204c0 c0204c0 = uVar.f664r;
        if (c0204c0 == null || colorStateList == null) {
            return;
        }
        c0204c0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f1978w0 != z2) {
            this.f1978w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1952j;
        if (isEmpty) {
            if (uVar.f670x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f670x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f669w = charSequence;
        uVar.f671y.setText(charSequence);
        int i = uVar.f660n;
        if (i != 2) {
            uVar.f661o = 2;
        }
        uVar.i(i, uVar.f661o, uVar.h(uVar.f671y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1952j;
        uVar.f648A = colorStateList;
        C0204c0 c0204c0 = uVar.f671y;
        if (c0204c0 == null || colorStateList == null) {
            return;
        }
        c0204c0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1952j;
        if (uVar.f670x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0204c0 c0204c0 = new C0204c0(uVar.f655g, null);
            uVar.f671y = c0204c0;
            c0204c0.setId(com.winworm.neongrid.R.id.textinput_helper_text);
            uVar.f671y.setTextAlignment(5);
            Typeface typeface = uVar.f649B;
            if (typeface != null) {
                uVar.f671y.setTypeface(typeface);
            }
            uVar.f671y.setVisibility(4);
            uVar.f671y.setAccessibilityLiveRegion(1);
            int i = uVar.f672z;
            uVar.f672z = i;
            C0204c0 c0204c02 = uVar.f671y;
            if (c0204c02 != null) {
                c0204c02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f648A;
            uVar.f648A = colorStateList;
            C0204c0 c0204c03 = uVar.f671y;
            if (c0204c03 != null && colorStateList != null) {
                c0204c03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f671y, 1);
            uVar.f671y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f660n;
            if (i2 == 2) {
                uVar.f661o = 0;
            }
            uVar.i(i2, uVar.f661o, uVar.h(uVar.f671y, ""));
            uVar.g(uVar.f671y, 1);
            uVar.f671y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f670x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f1952j;
        uVar.f672z = i;
        C0204c0 c0204c0 = uVar.f671y;
        if (c0204c0 != null) {
            c0204c0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1917C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f1980x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1917C) {
            this.f1917C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1918D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1919E = true;
            } else {
                this.f1919E = false;
                if (!TextUtils.isEmpty(this.f1918D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1918D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f1976v0;
        TextInputLayout textInputLayout = dVar.f125a;
        G0.d dVar2 = new G0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f264j;
        if (colorStateList != null) {
            dVar.f138k = colorStateList;
        }
        float f2 = dVar2.f265k;
        if (f2 != RecyclerView.f1559A0) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f258a;
        if (colorStateList2 != null) {
            dVar.f119U = colorStateList2;
        }
        dVar.f117S = dVar2.f261e;
        dVar.f118T = dVar2.f262f;
        dVar.f116R = dVar2.f263g;
        dVar.f120V = dVar2.i;
        G0.a aVar = dVar.f152y;
        if (aVar != null) {
            aVar.f254c = true;
        }
        C.g gVar = new C.g(1, dVar);
        dVar2.a();
        dVar.f152y = new G0.a(gVar, dVar2.f268n);
        dVar2.c(textInputLayout.getContext(), dVar.f152y);
        dVar.h(false);
        this.f1953j0 = dVar.f138k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1953j0 != colorStateList) {
            if (this.f1951i0 == null) {
                d dVar = this.f1976v0;
                if (dVar.f138k != colorStateList) {
                    dVar.f138k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f1953j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f1960n = e2;
    }

    public void setMaxEms(int i) {
        this.f1948g = i;
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
        this.f1946f = i;
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
        q qVar = this.f1941c;
        qVar.f626g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1941c;
        qVar.f626g.setImageDrawable(i != 0 ? l.w(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1941c;
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
        q qVar = this.f1941c;
        qVar.f628k = colorStateList;
        l.a(qVar.f621a, qVar.f626g, colorStateList, qVar.f629l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1941c;
        qVar.f629l = mode;
        l.a(qVar.f621a, qVar.f626g, qVar.f628k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1971t == null) {
            C0204c0 c0204c0 = new C0204c0(getContext(), null);
            this.f1971t = c0204c0;
            c0204c0.setId(com.winworm.neongrid.R.id.textinput_placeholder);
            this.f1971t.setImportantForAccessibility(2);
            h d = d();
            this.f1977w = d;
            d.f3113b = 67L;
            this.f1979x = d();
            setPlaceholderTextAppearance(this.f1975v);
            setPlaceholderTextColor(this.f1973u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1969s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1967r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1975v = i;
        C0204c0 c0204c0 = this.f1971t;
        if (c0204c0 != null) {
            c0204c0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1973u != colorStateList) {
            this.f1973u = colorStateList;
            C0204c0 c0204c0 = this.f1971t;
            if (c0204c0 == null || colorStateList == null) {
                return;
            }
            c0204c0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1939b;
        zVar.getClass();
        zVar.f689c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f688b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1939b.f688b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1939b.f688b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f352a.f338a == kVar) {
            return;
        }
        this.f1925L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1939b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1939b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? l.w(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1939b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f692g) {
            zVar.f692g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1939b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1939b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1939b;
        zVar.h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1939b;
        if (zVar.f690e != colorStateList) {
            zVar.f690e = colorStateList;
            l.a(zVar.f687a, zVar.d, colorStateList, zVar.f691f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1939b;
        if (zVar.f691f != mode) {
            zVar.f691f = mode;
            l.a(zVar.f687a, zVar.d, zVar.f690e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1939b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1941c;
        qVar.getClass();
        qVar.f633p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f634q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1941c.f634q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1941c.f634q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            T.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1940b0) {
            this.f1940b0 = typeface;
            this.f1976v0.m(typeface);
            u uVar = this.f1952j;
            if (typeface != uVar.f649B) {
                uVar.f649B = typeface;
                C0204c0 c0204c0 = uVar.f664r;
                if (c0204c0 != null) {
                    c0204c0.setTypeface(typeface);
                }
                C0204c0 c0204c02 = uVar.f671y;
                if (c0204c02 != null) {
                    c0204c02.setTypeface(typeface);
                }
            }
            C0204c0 c0204c03 = this.f1962o;
            if (c0204c03 != null) {
                c0204c03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1928O != 1) {
            FrameLayout frameLayout = this.f1937a;
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
        C0204c0 c0204c0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1951i0;
        d dVar = this.f1976v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1951i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1970s0) : this.f1970s0));
        } else if (m()) {
            C0204c0 c0204c02 = this.f1952j.f664r;
            dVar.i(c0204c02 != null ? c0204c02.getTextColors() : null);
        } else if (this.f1958m && (c0204c0 = this.f1962o) != null) {
            dVar.i(c0204c0.getTextColors());
        } else if (z5 && (colorStateList = this.f1953j0) != null && dVar.f138k != colorStateList) {
            dVar.f138k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f1941c;
        z zVar = this.f1939b;
        if (z4 || !this.f1978w0 || (isEnabled() && z5)) {
            if (z3 || this.f1974u0) {
                ValueAnimator valueAnimator = this.f1982y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1982y0.cancel();
                }
                if (z2 && this.f1980x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f1974u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f693j = false;
                zVar.e();
                qVar.f635r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f1974u0) {
            ValueAnimator valueAnimator2 = this.f1982y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1982y0.cancel();
            }
            if (z2 && this.f1980x0) {
                a(RecyclerView.f1559A0);
            } else {
                dVar.k(RecyclerView.f1559A0);
            }
            if (e() && !((M0.h) this.F).f598x.f596q.isEmpty() && e()) {
                ((M0.h) this.F).n(RecyclerView.f1559A0, RecyclerView.f1559A0, RecyclerView.f1559A0, RecyclerView.f1559A0);
            }
            this.f1974u0 = true;
            C0204c0 c0204c03 = this.f1971t;
            if (c0204c03 != null && this.f1969s) {
                c0204c03.setText((CharSequence) null);
                l0.q.a(this.f1937a, this.f1979x);
                this.f1971t.setVisibility(4);
            }
            zVar.f693j = true;
            zVar.e();
            qVar.f635r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0009g) this.f1960n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1937a;
        if (length != 0 || this.f1974u0) {
            C0204c0 c0204c0 = this.f1971t;
            if (c0204c0 == null || !this.f1969s) {
                return;
            }
            c0204c0.setText((CharSequence) null);
            l0.q.a(frameLayout, this.f1979x);
            this.f1971t.setVisibility(4);
            return;
        }
        if (this.f1971t == null || !this.f1969s || TextUtils.isEmpty(this.f1967r)) {
            return;
        }
        this.f1971t.setText(this.f1967r);
        l0.q.a(frameLayout, this.f1977w);
        this.f1971t.setVisibility(0);
        this.f1971t.bringToFront();
        announceForAccessibility(this.f1967r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f1961n0.getDefaultColor();
        int colorForState = this.f1961n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1961n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1933T = colorForState2;
        } else if (z3) {
            this.f1933T = colorForState;
        } else {
            this.f1933T = defaultColor;
        }
    }

    public final void x() {
        C0204c0 c0204c0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1928O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1933T = this.f1970s0;
        } else if (m()) {
            if (this.f1961n0 != null) {
                w(z3, z2);
            } else {
                this.f1933T = getErrorCurrentTextColors();
            }
        } else if (!this.f1958m || (c0204c0 = this.f1962o) == null) {
            if (z3) {
                this.f1933T = this.f1959m0;
            } else if (z2) {
                this.f1933T = this.f1957l0;
            } else {
                this.f1933T = this.f1955k0;
            }
        } else if (this.f1961n0 != null) {
            w(z3, z2);
        } else {
            this.f1933T = c0204c0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1941c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f623c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f621a;
        l.R(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f628k;
        CheckableImageButton checkableImageButton2 = qVar.f626g;
        l.R(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof M0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                l.a(textInputLayout, checkableImageButton2, qVar.f628k, qVar.f629l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1939b;
        l.R(zVar.f687a, zVar.d, zVar.f690e);
        if (this.f1928O == 2) {
            int i = this.f1930Q;
            if (z3 && isEnabled()) {
                this.f1930Q = this.f1932S;
            } else {
                this.f1930Q = this.f1931R;
            }
            if (this.f1930Q != i && e() && !this.f1974u0) {
                if (e()) {
                    ((M0.h) this.F).n(RecyclerView.f1559A0, RecyclerView.f1559A0, RecyclerView.f1559A0, RecyclerView.f1559A0);
                }
                j();
            }
        }
        if (this.f1928O == 1) {
            if (!isEnabled()) {
                this.f1934U = this.f1964p0;
            } else if (z2 && !z3) {
                this.f1934U = this.f1968r0;
            } else if (z3) {
                this.f1934U = this.f1966q0;
            } else {
                this.f1934U = this.o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1939b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1941c.f626g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1941c.f626g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1941c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1941c.f626g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1941c;
        CheckableImageButton checkableImageButton = qVar.f626g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f628k;
            PorterDuff.Mode mode = qVar.f629l;
            TextInputLayout textInputLayout = qVar.f621a;
            l.a(textInputLayout, checkableImageButton, colorStateList, mode);
            l.R(textInputLayout, checkableImageButton, qVar.f628k);
        }
    }
}
