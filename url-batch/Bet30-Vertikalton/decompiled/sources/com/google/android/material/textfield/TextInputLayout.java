package com.google.android.material.textfield;

import A.b;
import B0.e;
import B0.o;
import H0.c;
import H0.f;
import H0.g;
import H0.i;
import H0.j;
import H0.k;
import K.C0007g;
import K.C0012l;
import K.J;
import K.T;
import K0.A;
import K0.B;
import K0.C;
import K0.D;
import K0.E;
import K0.F;
import K0.h;
import K0.n;
import K0.q;
import K0.t;
import K0.u;
import K0.x;
import K0.z;
import M0.a;
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
import i1.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.AbstractC0194q;
import k0.C0185h;
import l.AbstractC0249n0;
import l.C0229d0;
import l.C0264v;
import n0.AbstractC0278a;
import o0.AbstractC0280a;
import q1.d;
import q1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1757A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1758A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1759B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1760B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1761C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1762D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1763E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1764G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1765H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1766I;

    /* renamed from: J, reason: collision with root package name */
    public g f1767J;

    /* renamed from: K, reason: collision with root package name */
    public g f1768K;

    /* renamed from: L, reason: collision with root package name */
    public k f1769L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1770M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1771N;

    /* renamed from: O, reason: collision with root package name */
    public int f1772O;

    /* renamed from: P, reason: collision with root package name */
    public int f1773P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1774Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1775R;

    /* renamed from: S, reason: collision with root package name */
    public int f1776S;

    /* renamed from: T, reason: collision with root package name */
    public int f1777T;

    /* renamed from: U, reason: collision with root package name */
    public int f1778U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1779V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1780W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1781a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1782a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1783b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1784b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1785c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1786c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1787d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1788e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1789e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1790f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1791f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1792g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1793g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1794h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f1795i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f1796j;
    public ColorStateList j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1797k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1798k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1799l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1800l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1801m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1802m0;

    /* renamed from: n, reason: collision with root package name */
    public E f1803n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f1804n0;

    /* renamed from: o, reason: collision with root package name */
    public C0229d0 f1805o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1806o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1807p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1808p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1809q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1810q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1811r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1812r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1813s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1814s0;

    /* renamed from: t, reason: collision with root package name */
    public C0229d0 f1815t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1816t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f1817u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1818u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1819v;

    /* renamed from: v0, reason: collision with root package name */
    public final e f1820v0;

    /* renamed from: w, reason: collision with root package name */
    public C0185h f1821w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1822w0;

    /* renamed from: x, reason: collision with root package name */
    public C0185h f1823x;
    public boolean x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1824y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f1825y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1826z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1827z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.lasercut.dash.R.attr.textInputStyle, com.lasercut.dash.R.style.Widget_Design_TextInputLayout), attributeSet, com.lasercut.dash.R.attr.textInputStyle);
        this.f1790f = -1;
        this.f1792g = -1;
        this.h = -1;
        this.i = -1;
        this.f1796j = new u(this);
        this.f1803n = new C0007g(2);
        this.f1779V = new Rect();
        this.f1780W = new Rect();
        this.f1782a0 = new RectF();
        this.f1789e0 = new LinkedHashSet();
        e eVar = new e(this);
        this.f1820v0 = eVar;
        this.f1760B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1781a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0280a.f3354a;
        eVar.f75Q = linearInterpolator;
        eVar.h(false);
        eVar.f74P = linearInterpolator;
        eVar.h(false);
        if (eVar.f96g != 8388659) {
            eVar.f96g = 8388659;
            eVar.h(false);
        }
        int[] iArr = AbstractC0278a.f3280A;
        o.a(context2, attributeSet, com.lasercut.dash.R.attr.textInputStyle, com.lasercut.dash.R.style.Widget_Design_TextInputLayout);
        o.b(context2, attributeSet, iArr, com.lasercut.dash.R.attr.textInputStyle, com.lasercut.dash.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.lasercut.dash.R.attr.textInputStyle, com.lasercut.dash.R.style.Widget_Design_TextInputLayout);
        C0012l c0012l = new C0012l(context2, obtainStyledAttributes);
        z zVar = new z(this, c0012l);
        this.f1783b = zVar;
        this.f1761C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1822w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1769L = k.b(context2, attributeSet, com.lasercut.dash.R.attr.textInputStyle, com.lasercut.dash.R.style.Widget_Design_TextInputLayout).a();
        this.f1771N = context2.getResources().getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1773P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1775R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1776S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1774Q = this.f1775R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1769L.e();
        if (dimension >= 0.0f) {
            e2.f279e = new H0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f280f = new H0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f281g = new H0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new H0.a(dimension4);
        }
        this.f1769L = e2.a();
        ColorStateList A2 = d.A(context2, c0012l, 7);
        if (A2 != null) {
            int defaultColor = A2.getDefaultColor();
            this.f1806o0 = defaultColor;
            this.f1778U = defaultColor;
            if (A2.isStateful()) {
                this.f1808p0 = A2.getColorForState(new int[]{-16842910}, -1);
                this.f1810q0 = A2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1812r0 = A2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1810q0 = this.f1806o0;
                ColorStateList z2 = d.z(context2, com.lasercut.dash.R.color.mtrl_filled_background_color);
                this.f1808p0 = z2.getColorForState(new int[]{-16842910}, -1);
                this.f1812r0 = z2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1778U = 0;
            this.f1806o0 = 0;
            this.f1808p0 = 0;
            this.f1810q0 = 0;
            this.f1812r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = c0012l.g(1);
            this.j0 = g2;
            this.f1795i0 = g2;
        }
        ColorStateList A3 = d.A(context2, c0012l, 14);
        this.f1802m0 = obtainStyledAttributes.getColor(14, 0);
        this.f1798k0 = b.a(context2, com.lasercut.dash.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1814s0 = b.a(context2, com.lasercut.dash.R.color.mtrl_textinput_disabled_color);
        this.f1800l0 = b.a(context2, com.lasercut.dash.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (A3 != null) {
            setBoxStrokeColorStateList(A3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(d.A(context2, c0012l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1757A = c0012l.g(24);
        this.f1759B = c0012l.g(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z4 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z5 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1809q = obtainStyledAttributes.getResourceId(22, 0);
        this.f1807p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1807p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1809q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0012l.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0012l.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0012l.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0012l.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0012l.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0012l.g(58));
        }
        q qVar = new q(this, c0012l);
        this.f1785c = qVar;
        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
        c0012l.t();
        setImportantForAccessibility(2);
        J.m(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || l.D(editText)) {
            return this.F;
        }
        int i = s.i(this.d, com.lasercut.dash.R.attr.colorControlHighlight);
        int i2 = this.f1772O;
        int[][] iArr = C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            g gVar = this.F;
            int i3 = this.f1778U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{s.n(i, i3, 0.1f), i3}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue S2 = l.S(context, com.lasercut.dash.R.attr.colorSurface, "TextInputLayout");
        int i4 = S2.resourceId;
        int a2 = i4 != 0 ? b.a(context, i4) : S2.data;
        g gVar3 = new g(gVar2.f256a.f242a);
        int n2 = s.n(i, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{n2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{n2, a2});
        g gVar4 = new g(gVar2.f256a.f242a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1765H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1765H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1765H.addState(new int[0], f(false));
        }
        return this.f1765H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1764G == null) {
            this.f1764G = f(true);
        }
        return this.f1764G;
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
        int i = this.f1790f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1792g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1766I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        e eVar = this.f1820v0;
        eVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (eVar.h != textSize) {
            eVar.h = textSize;
            eVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (eVar.f81W != letterSpacing) {
            eVar.f81W = letterSpacing;
            eVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (eVar.f96g != i4) {
            eVar.f96g = i4;
            eVar.h(false);
        }
        if (eVar.f94f != gravity) {
            eVar.f94f = gravity;
            eVar.h(false);
        }
        WeakHashMap weakHashMap = T.f381a;
        this.f1816t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f1795i0 == null) {
            this.f1795i0 = this.d.getHintTextColors();
        }
        if (this.f1761C) {
            if (TextUtils.isEmpty(this.f1762D)) {
                CharSequence hint = this.d.getHint();
                this.f1788e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1763E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f1805o != null) {
            n(this.d.getText());
        }
        r();
        this.f1796j.b();
        this.f1783b.bringToFront();
        q qVar = this.f1785c;
        qVar.bringToFront();
        Iterator it = this.f1789e0.iterator();
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
        if (TextUtils.equals(charSequence, this.f1762D)) {
            return;
        }
        this.f1762D = charSequence;
        e eVar = this.f1820v0;
        if (charSequence == null || !TextUtils.equals(eVar.f60A, charSequence)) {
            eVar.f60A = charSequence;
            eVar.f61B = null;
            Bitmap bitmap = eVar.f64E;
            if (bitmap != null) {
                bitmap.recycle();
                eVar.f64E = null;
            }
            eVar.h(false);
        }
        if (this.f1818u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1813s == z2) {
            return;
        }
        if (z2) {
            C0229d0 c0229d0 = this.f1815t;
            if (c0229d0 != null) {
                this.f1781a.addView(c0229d0);
                this.f1815t.setVisibility(0);
            }
        } else {
            C0229d0 c0229d02 = this.f1815t;
            if (c0229d02 != null) {
                c0229d02.setVisibility(8);
            }
            this.f1815t = null;
        }
        this.f1813s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        e eVar = this.f1820v0;
        if (eVar.f87b == f2) {
            return;
        }
        if (this.f1825y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1825y0 = valueAnimator;
            valueAnimator.setInterpolator(l.R(getContext(), com.lasercut.dash.R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.f3355b));
            this.f1825y0.setDuration(l.Q(getContext(), com.lasercut.dash.R.attr.motionDurationMedium4, 167));
            this.f1825y0.addUpdateListener(new C(i, this));
        }
        this.f1825y0.setFloatValues(eVar.f87b, f2);
        this.f1825y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1781a;
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
        k kVar = gVar.f256a.f242a;
        k kVar2 = this.f1769L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1772O == 2 && (i = this.f1774Q) > -1 && (i2 = this.f1777T) != 0) {
            g gVar2 = this.F;
            gVar2.f256a.f248j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f256a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1778U;
        if (this.f1772O == 1) {
            i3 = C.a.b(this.f1778U, s.h(getContext(), com.lasercut.dash.R.attr.colorSurface, 0));
        }
        this.f1778U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1767J;
        if (gVar3 != null && this.f1768K != null) {
            if (this.f1774Q > -1 && this.f1777T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f1798k0) : ColorStateList.valueOf(this.f1777T));
                this.f1768K.j(ColorStateList.valueOf(this.f1777T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1761C) {
            return 0;
        }
        int i = this.f1772O;
        e eVar = this.f1820v0;
        if (i == 0) {
            d = eVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = eVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final C0185h d() {
        C0185h c0185h = new C0185h();
        c0185h.f2808c = l.Q(getContext(), com.lasercut.dash.R.attr.motionDurationShort2, 87);
        c0185h.d = l.R(getContext(), com.lasercut.dash.R.attr.motionEasingLinearInterpolator, AbstractC0280a.f3354a);
        return c0185h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1788e != null) {
            boolean z2 = this.f1763E;
            this.f1763E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1788e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1763E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1781a;
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
        this.f1758A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1758A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1761C;
        e eVar = this.f1820v0;
        if (z2) {
            eVar.getClass();
            int save = canvas.save();
            if (eVar.f61B != null) {
                RectF rectF = eVar.f92e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = eVar.f72N;
                    textPaint.setTextSize(eVar.f65G);
                    float f2 = eVar.f103p;
                    float f3 = eVar.f104q;
                    float f4 = eVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (eVar.f91d0 <= 1 || eVar.f62C) {
                        canvas.translate(f2, f3);
                        eVar.f83Y.draw(canvas);
                    } else {
                        float lineStart = eVar.f103p - eVar.f83Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (eVar.f88b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = eVar.f66H;
                            float f7 = eVar.f67I;
                            float f8 = eVar.f68J;
                            int i3 = eVar.f69K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        eVar.f83Y.draw(canvas);
                        textPaint.setAlpha((int) (eVar.f86a0 * f5));
                        if (i2 >= 31) {
                            float f9 = eVar.f66H;
                            float f10 = eVar.f67I;
                            float f11 = eVar.f68J;
                            int i4 = eVar.f69K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = eVar.f83Y.getLineBaseline(0);
                        CharSequence charSequence = eVar.f90c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(eVar.f66H, eVar.f67I, eVar.f68J, eVar.f69K);
                        }
                        String trim = eVar.f90c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(eVar.f83Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1768K == null || (gVar = this.f1767J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1768K.getBounds();
            Rect bounds2 = this.f1767J.getBounds();
            float f13 = eVar.f87b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0280a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0280a.c(centerX, bounds2.right, f13);
            this.f1768K.draw(canvas);
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
        if (this.f1827z0) {
            return;
        }
        this.f1827z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        e eVar = this.f1820v0;
        if (eVar != null) {
            eVar.f70L = drawableState;
            ColorStateList colorStateList2 = eVar.f98k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = eVar.f97j) != null && colorStateList.isStateful())) {
                eVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = T.f381a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f1827z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f1827z0 = false;
    }

    public final boolean e() {
        return this.f1761C && !TextUtils.isEmpty(this.f1762D) && (this.F instanceof h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.lasercut.dash.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        H0.e eVar = new H0.e(i);
        H0.e eVar2 = new H0.e(i);
        H0.e eVar3 = new H0.e(i);
        H0.e eVar4 = new H0.e(i);
        H0.a aVar = new H0.a(f2);
        H0.a aVar2 = new H0.a(f2);
        H0.a aVar3 = new H0.a(dimensionPixelOffset);
        H0.a aVar4 = new H0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f285a = iVar;
        kVar.f286b = iVar2;
        kVar.f287c = iVar3;
        kVar.d = iVar4;
        kVar.f288e = aVar;
        kVar.f289f = aVar2;
        kVar.f290g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f291j = eVar2;
        kVar.f292k = eVar3;
        kVar.f293l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f255w;
            TypedValue S2 = l.S(context, com.lasercut.dash.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = S2.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : S2.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f256a;
        if (fVar.f247g == null) {
            fVar.f247g = new Rect();
        }
        gVar.f256a.f247g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1785c.c() : this.f1783b.a()) + i;
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
        int i = this.f1772O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1778U;
    }

    public int getBoxBackgroundMode() {
        return this.f1772O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1773P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1782a0;
        return e2 ? this.f1769L.h.a(rectF) : this.f1769L.f290g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1782a0;
        return e2 ? this.f1769L.f290g.a(rectF) : this.f1769L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1782a0;
        return e2 ? this.f1769L.f288e.a(rectF) : this.f1769L.f289f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = o.e(this);
        RectF rectF = this.f1782a0;
        return e2 ? this.f1769L.f289f.a(rectF) : this.f1769L.f288e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1802m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1804n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1775R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1776S;
    }

    public int getCounterMaxLength() {
        return this.f1799l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0229d0 c0229d0;
        if (this.f1797k && this.f1801m && (c0229d0 = this.f1805o) != null) {
            return c0229d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1826z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1824y;
    }

    public ColorStateList getCursorColor() {
        return this.f1757A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1759B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1795i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1785c.f526g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1785c.f526g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1785c.f530m;
    }

    public int getEndIconMode() {
        return this.f1785c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1785c.f531n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1785c.f526g;
    }

    public CharSequence getError() {
        u uVar = this.f1796j;
        if (uVar.f563q) {
            return uVar.f562p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1796j.f566t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1796j.f565s;
    }

    public int getErrorCurrentTextColors() {
        C0229d0 c0229d0 = this.f1796j.f564r;
        if (c0229d0 != null) {
            return c0229d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1785c.f523c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1796j;
        if (uVar.f570x) {
            return uVar.f569w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0229d0 c0229d0 = this.f1796j.f571y;
        if (c0229d0 != null) {
            return c0229d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1761C) {
            return this.f1762D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1820v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        e eVar = this.f1820v0;
        return eVar.e(eVar.f98k);
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    public E getLengthCounter() {
        return this.f1803n;
    }

    public int getMaxEms() {
        return this.f1792g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1790f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1785c.f526g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1785c.f526g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1813s) {
            return this.f1811r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1819v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1817u;
    }

    public CharSequence getPrefixText() {
        return this.f1783b.f589c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1783b.f588b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1783b.f588b;
    }

    public k getShapeAppearanceModel() {
        return this.f1769L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1783b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1783b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1783b.f592g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1783b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1785c.f533p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1785c.f534q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1785c.f534q;
    }

    public Typeface getTypeface() {
        return this.f1784b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1783b.a() : this.f1785c.c());
    }

    public final void i() {
        int i = this.f1772O;
        if (i == 0) {
            this.F = null;
            this.f1767J = null;
            this.f1768K = null;
        } else if (i == 1) {
            this.F = new g(this.f1769L);
            this.f1767J = new g();
            this.f1768K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1772O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1761C || (this.F instanceof h)) {
                this.F = new g(this.f1769L);
            } else {
                k kVar = this.f1769L;
                int i2 = h.f497y;
                if (kVar == null) {
                    kVar = new k();
                }
                K0.g gVar = new K0.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f498x = gVar;
                this.F = hVar;
            }
            this.f1767J = null;
            this.f1768K = null;
        }
        s();
        x();
        if (this.f1772O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1773P = getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (d.T(getContext())) {
                this.f1773P = getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1772O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = T.f381a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (d.T(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = T.f381a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.lasercut.dash.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1772O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1772O;
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
            e eVar = this.f1820v0;
            boolean b2 = eVar.b(eVar.f60A);
            eVar.f62C = b2;
            Rect rect = eVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = eVar.f84Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = eVar.f84Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1782a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (eVar.f84Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (eVar.f62C) {
                        f5 = max + eVar.f84Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (eVar.f62C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = eVar.f84Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = eVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1771N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1774Q);
                h hVar = (h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = eVar.f84Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1782a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (eVar.f84Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = eVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0229d0 c0229d0, int i) {
        try {
            c0229d0.setTextAppearance(i);
            if (c0229d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0229d0.setTextAppearance(com.lasercut.dash.R.style.TextAppearance_AppCompat_Caption);
        c0229d0.setTextColor(b.a(getContext(), com.lasercut.dash.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f1796j;
        return (uVar.f561o != 1 || uVar.f564r == null || TextUtils.isEmpty(uVar.f562p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0007g) this.f1803n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f1801m;
        int i = this.f1799l;
        String str = null;
        if (i == -1) {
            this.f1805o.setText(String.valueOf(length));
            this.f1805o.setContentDescription(null);
            this.f1801m = false;
        } else {
            this.f1801m = length > i;
            Context context = getContext();
            this.f1805o.setContentDescription(context.getString(this.f1801m ? com.lasercut.dash.R.string.character_counter_overflowed_content_description : com.lasercut.dash.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1799l)));
            if (z2 != this.f1801m) {
                o();
            }
            String str2 = I.b.f328b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f330e : I.b.d;
            C0229d0 c0229d0 = this.f1805o;
            String string = getContext().getString(com.lasercut.dash.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1799l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f338a;
                str = bVar.c(string).toString();
            }
            c0229d0.setText(str);
        }
        if (this.d == null || z2 == this.f1801m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0229d0 c0229d0 = this.f1805o;
        if (c0229d0 != null) {
            l(c0229d0, this.f1801m ? this.f1807p : this.f1809q);
            if (!this.f1801m && (colorStateList2 = this.f1824y) != null) {
                this.f1805o.setTextColor(colorStateList2);
            }
            if (!this.f1801m || (colorStateList = this.f1826z) == null) {
                return;
            }
            this.f1805o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1820v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1785c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1760B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1783b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new B0.q(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = B0.f.f114a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1779V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = B0.f.f114a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            B0.f.a(this, editText, matrix);
            ThreadLocal threadLocal3 = B0.f.f115b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1767J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1775R, rect.right, i5);
            }
            g gVar2 = this.f1768K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1776S, rect.right, i6);
            }
            if (this.f1761C) {
                float textSize = this.d.getTextSize();
                e eVar = this.f1820v0;
                if (eVar.h != textSize) {
                    eVar.h = textSize;
                    eVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (eVar.f96g != i7) {
                    eVar.f96g = i7;
                    eVar.h(false);
                }
                if (eVar.f94f != gravity) {
                    eVar.f94f = gravity;
                    eVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = o.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1780W;
                rect2.bottom = i8;
                int i9 = this.f1772O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1773P;
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
                Rect rect3 = eVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    eVar.f71M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = eVar.f73O;
                textPaint.setTextSize(eVar.h);
                textPaint.setTypeface(eVar.f108u);
                textPaint.setLetterSpacing(eVar.f81W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1772O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1772O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = eVar.f89c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    eVar.f71M = true;
                }
                eVar.h(false);
                if (!e() || this.f1818u0) {
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
        boolean z2 = this.f1760B0;
        q qVar = this.f1785c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1760B0 = true;
        }
        if (this.f1815t != null && (editText = this.d) != null) {
            this.f1815t.setGravity(editText.getGravity());
            this.f1815t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(f2.f675a);
        setError(f2.f479c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1770M) {
            c cVar = this.f1769L.f288e;
            RectF rectF = this.f1782a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1769L.f289f.a(rectF);
            float a4 = this.f1769L.h.a(rectF);
            float a5 = this.f1769L.f290g.a(rectF);
            k kVar = this.f1769L;
            d dVar = kVar.f285a;
            d dVar2 = kVar.f286b;
            d dVar3 = kVar.d;
            d dVar4 = kVar.f287c;
            H0.e eVar = new H0.e(0);
            H0.e eVar2 = new H0.e(0);
            H0.e eVar3 = new H0.e(0);
            H0.e eVar4 = new H0.e(0);
            j.b(dVar2);
            j.b(dVar);
            j.b(dVar4);
            j.b(dVar3);
            H0.a aVar = new H0.a(a3);
            H0.a aVar2 = new H0.a(a2);
            H0.a aVar3 = new H0.a(a5);
            H0.a aVar4 = new H0.a(a4);
            k kVar2 = new k();
            kVar2.f285a = dVar2;
            kVar2.f286b = dVar;
            kVar2.f287c = dVar3;
            kVar2.d = dVar4;
            kVar2.f288e = aVar;
            kVar2.f289f = aVar2;
            kVar2.f290g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f291j = eVar2;
            kVar2.f292k = eVar3;
            kVar2.f293l = eVar4;
            this.f1770M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f479c = getError();
        }
        q qVar = this.f1785c;
        f2.d = qVar.i != 0 && qVar.f526g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1757A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue O2 = l.O(context, com.lasercut.dash.R.attr.colorControlActivated);
            if (O2 != null) {
                int i = O2.resourceId;
                if (i != 0) {
                    colorStateList2 = d.z(context, i);
                } else {
                    int i2 = O2.data;
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
            if ((m() || (this.f1805o != null && this.f1801m)) && (colorStateList = this.f1759B) != null) {
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
            z zVar = this.f1783b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1786c0 == null || this.f1787d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1786c0 = colorDrawable3;
                    this.f1787d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1786c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1785c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f533p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f534q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f523c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f526g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1791f0;
                        if (colorDrawable != null || this.f1793g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1791f0 = colorDrawable5;
                                this.f1793g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1791f0;
                            if (drawable == colorDrawable2) {
                                this.f1794h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1793g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1791f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1791f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1791f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1794h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1791f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1785c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f534q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1791f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1791f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1786c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1786c0 = null;
            z2 = true;
            qVar = this.f1785c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f534q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1791f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1791f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1785c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f534q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1791f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1791f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0229d0 c0229d0;
        EditText editText = this.d;
        if (editText == null || this.f1772O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0249n0.f3033a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0264v.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1801m && (c0229d0 = this.f1805o) != null) {
            mutate.setColorFilter(C0264v.c(c0229d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f1766I || editText.getBackground() == null) && this.f1772O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = T.f381a;
            editText2.setBackground(editTextBoxBackground);
            this.f1766I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1778U != i) {
            this.f1778U = i;
            this.f1806o0 = i;
            this.f1810q0 = i;
            this.f1812r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1806o0 = defaultColor;
        this.f1778U = defaultColor;
        this.f1808p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1810q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1812r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1772O) {
            return;
        }
        this.f1772O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1773P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1769L.e();
        c cVar = this.f1769L.f288e;
        d p2 = l.p(i);
        e2.f276a = p2;
        j.b(p2);
        e2.f279e = cVar;
        c cVar2 = this.f1769L.f289f;
        d p3 = l.p(i);
        e2.f277b = p3;
        j.b(p3);
        e2.f280f = cVar2;
        c cVar3 = this.f1769L.h;
        d p4 = l.p(i);
        e2.d = p4;
        j.b(p4);
        e2.h = cVar3;
        c cVar4 = this.f1769L.f290g;
        d p5 = l.p(i);
        e2.f278c = p5;
        j.b(p5);
        e2.f281g = cVar4;
        this.f1769L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1802m0 != i) {
            this.f1802m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1798k0 = colorStateList.getDefaultColor();
            this.f1814s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1800l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1802m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1802m0 != colorStateList.getDefaultColor()) {
            this.f1802m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1804n0 != colorStateList) {
            this.f1804n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1775R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1776S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1797k != z2) {
            u uVar = this.f1796j;
            if (z2) {
                C0229d0 c0229d0 = new C0229d0(getContext(), null);
                this.f1805o = c0229d0;
                c0229d0.setId(com.lasercut.dash.R.id.textinput_counter);
                Typeface typeface = this.f1784b0;
                if (typeface != null) {
                    this.f1805o.setTypeface(typeface);
                }
                this.f1805o.setMaxLines(1);
                uVar.a(this.f1805o, 2);
                ((ViewGroup.MarginLayoutParams) this.f1805o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.lasercut.dash.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1805o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f1805o, 2);
                this.f1805o = null;
            }
            this.f1797k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1799l != i) {
            if (i > 0) {
                this.f1799l = i;
            } else {
                this.f1799l = -1;
            }
            if (!this.f1797k || this.f1805o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1807p != i) {
            this.f1807p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1826z != colorStateList) {
            this.f1826z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1809q != i) {
            this.f1809q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1824y != colorStateList) {
            this.f1824y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1757A != colorStateList) {
            this.f1757A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1759B != colorStateList) {
            this.f1759B = colorStateList;
            if (m() || (this.f1805o != null && this.f1801m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1795i0 = colorStateList;
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
        this.f1785c.f526g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1785c.f526g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1785c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f526g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1785c;
        Drawable v2 = i != 0 ? l.v(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f526g;
        checkableImageButton.setImageDrawable(v2);
        if (v2 != null) {
            ColorStateList colorStateList = qVar.f528k;
            PorterDuff.Mode mode = qVar.f529l;
            TextInputLayout textInputLayout = qVar.f521a;
            d.e(textInputLayout, checkableImageButton, colorStateList, mode);
            d.j0(textInputLayout, checkableImageButton, qVar.f528k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1785c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f530m) {
            qVar.f530m = i;
            CheckableImageButton checkableImageButton = qVar.f526g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f523c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1785c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1785c;
        View.OnLongClickListener onLongClickListener = qVar.f532o;
        CheckableImageButton checkableImageButton = qVar.f526g;
        checkableImageButton.setOnClickListener(onClickListener);
        d.o0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1785c;
        qVar.f532o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f526g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.o0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1785c;
        qVar.f531n = scaleType;
        qVar.f526g.setScaleType(scaleType);
        qVar.f523c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1785c;
        if (qVar.f528k != colorStateList) {
            qVar.f528k = colorStateList;
            d.e(qVar.f521a, qVar.f526g, colorStateList, qVar.f529l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1785c;
        if (qVar.f529l != mode) {
            qVar.f529l = mode;
            d.e(qVar.f521a, qVar.f526g, qVar.f528k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1785c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1796j;
        if (!uVar.f563q) {
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
        uVar.f562p = charSequence;
        uVar.f564r.setText(charSequence);
        int i = uVar.f560n;
        if (i != 1) {
            uVar.f561o = 1;
        }
        uVar.i(i, uVar.f561o, uVar.h(uVar.f564r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f1796j;
        uVar.f566t = i;
        C0229d0 c0229d0 = uVar.f564r;
        if (c0229d0 != null) {
            WeakHashMap weakHashMap = T.f381a;
            c0229d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1796j;
        uVar.f565s = charSequence;
        C0229d0 c0229d0 = uVar.f564r;
        if (c0229d0 != null) {
            c0229d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1796j;
        if (uVar.f563q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0229d0 c0229d0 = new C0229d0(uVar.f555g, null);
            uVar.f564r = c0229d0;
            c0229d0.setId(com.lasercut.dash.R.id.textinput_error);
            uVar.f564r.setTextAlignment(5);
            Typeface typeface = uVar.f549B;
            if (typeface != null) {
                uVar.f564r.setTypeface(typeface);
            }
            int i = uVar.f567u;
            uVar.f567u = i;
            C0229d0 c0229d02 = uVar.f564r;
            if (c0229d02 != null) {
                textInputLayout.l(c0229d02, i);
            }
            ColorStateList colorStateList = uVar.f568v;
            uVar.f568v = colorStateList;
            C0229d0 c0229d03 = uVar.f564r;
            if (c0229d03 != null && colorStateList != null) {
                c0229d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f565s;
            uVar.f565s = charSequence;
            C0229d0 c0229d04 = uVar.f564r;
            if (c0229d04 != null) {
                c0229d04.setContentDescription(charSequence);
            }
            int i2 = uVar.f566t;
            uVar.f566t = i2;
            C0229d0 c0229d05 = uVar.f564r;
            if (c0229d05 != null) {
                WeakHashMap weakHashMap = T.f381a;
                c0229d05.setAccessibilityLiveRegion(i2);
            }
            uVar.f564r.setVisibility(4);
            uVar.a(uVar.f564r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f564r, 0);
            uVar.f564r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f563q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1785c;
        qVar.i(i != 0 ? l.v(qVar.getContext(), i) : null);
        d.j0(qVar.f521a, qVar.f523c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1785c;
        CheckableImageButton checkableImageButton = qVar.f523c;
        View.OnLongClickListener onLongClickListener = qVar.f525f;
        checkableImageButton.setOnClickListener(onClickListener);
        d.o0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1785c;
        qVar.f525f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f523c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.o0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1785c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            d.e(qVar.f521a, qVar.f523c, colorStateList, qVar.f524e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1785c;
        if (qVar.f524e != mode) {
            qVar.f524e = mode;
            d.e(qVar.f521a, qVar.f523c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f1796j;
        uVar.f567u = i;
        C0229d0 c0229d0 = uVar.f564r;
        if (c0229d0 != null) {
            uVar.h.l(c0229d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1796j;
        uVar.f568v = colorStateList;
        C0229d0 c0229d0 = uVar.f564r;
        if (c0229d0 == null || colorStateList == null) {
            return;
        }
        c0229d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f1822w0 != z2) {
            this.f1822w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1796j;
        if (isEmpty) {
            if (uVar.f570x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f570x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f569w = charSequence;
        uVar.f571y.setText(charSequence);
        int i = uVar.f560n;
        if (i != 2) {
            uVar.f561o = 2;
        }
        uVar.i(i, uVar.f561o, uVar.h(uVar.f571y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1796j;
        uVar.f548A = colorStateList;
        C0229d0 c0229d0 = uVar.f571y;
        if (c0229d0 == null || colorStateList == null) {
            return;
        }
        c0229d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1796j;
        if (uVar.f570x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0229d0 c0229d0 = new C0229d0(uVar.f555g, null);
            uVar.f571y = c0229d0;
            c0229d0.setId(com.lasercut.dash.R.id.textinput_helper_text);
            uVar.f571y.setTextAlignment(5);
            Typeface typeface = uVar.f549B;
            if (typeface != null) {
                uVar.f571y.setTypeface(typeface);
            }
            uVar.f571y.setVisibility(4);
            uVar.f571y.setAccessibilityLiveRegion(1);
            int i = uVar.f572z;
            uVar.f572z = i;
            C0229d0 c0229d02 = uVar.f571y;
            if (c0229d02 != null) {
                c0229d02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f548A;
            uVar.f548A = colorStateList;
            C0229d0 c0229d03 = uVar.f571y;
            if (c0229d03 != null && colorStateList != null) {
                c0229d03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f571y, 1);
            uVar.f571y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f560n;
            if (i2 == 2) {
                uVar.f561o = 0;
            }
            uVar.i(i2, uVar.f561o, uVar.h(uVar.f571y, ""));
            uVar.g(uVar.f571y, 1);
            uVar.f571y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f570x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f1796j;
        uVar.f572z = i;
        C0229d0 c0229d0 = uVar.f571y;
        if (c0229d0 != null) {
            c0229d0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1761C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1761C) {
            this.f1761C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1762D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1763E = true;
            } else {
                this.f1763E = false;
                if (!TextUtils.isEmpty(this.f1762D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1762D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        e eVar = this.f1820v0;
        TextInputLayout textInputLayout = eVar.f85a;
        E0.d dVar = new E0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f180j;
        if (colorStateList != null) {
            eVar.f98k = colorStateList;
        }
        float f2 = dVar.f181k;
        if (f2 != 0.0f) {
            eVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f174a;
        if (colorStateList2 != null) {
            eVar.f79U = colorStateList2;
        }
        eVar.f77S = dVar.f177e;
        eVar.f78T = dVar.f178f;
        eVar.f76R = dVar.f179g;
        eVar.f80V = dVar.i;
        E0.a aVar = eVar.f112y;
        if (aVar != null) {
            aVar.f170c = true;
        }
        B0.d dVar2 = new B0.d(0, eVar);
        dVar.a();
        eVar.f112y = new E0.a(dVar2, dVar.f184n);
        dVar.c(textInputLayout.getContext(), eVar.f112y);
        eVar.h(false);
        this.j0 = eVar.f98k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            if (this.f1795i0 == null) {
                e eVar = this.f1820v0;
                if (eVar.f98k != colorStateList) {
                    eVar.f98k = colorStateList;
                    eVar.h(false);
                }
            }
            this.j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f1803n = e2;
    }

    public void setMaxEms(int i) {
        this.f1792g = i;
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
        this.f1790f = i;
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
        q qVar = this.f1785c;
        qVar.f526g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1785c;
        qVar.f526g.setImageDrawable(i != 0 ? l.v(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1785c;
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
        q qVar = this.f1785c;
        qVar.f528k = colorStateList;
        d.e(qVar.f521a, qVar.f526g, colorStateList, qVar.f529l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1785c;
        qVar.f529l = mode;
        d.e(qVar.f521a, qVar.f526g, qVar.f528k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1815t == null) {
            C0229d0 c0229d0 = new C0229d0(getContext(), null);
            this.f1815t = c0229d0;
            c0229d0.setId(com.lasercut.dash.R.id.textinput_placeholder);
            this.f1815t.setImportantForAccessibility(2);
            C0185h d = d();
            this.f1821w = d;
            d.f2807b = 67L;
            this.f1823x = d();
            setPlaceholderTextAppearance(this.f1819v);
            setPlaceholderTextColor(this.f1817u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1813s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1811r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1819v = i;
        C0229d0 c0229d0 = this.f1815t;
        if (c0229d0 != null) {
            c0229d0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1817u != colorStateList) {
            this.f1817u = colorStateList;
            C0229d0 c0229d0 = this.f1815t;
            if (c0229d0 == null || colorStateList == null) {
                return;
            }
            c0229d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1783b;
        zVar.getClass();
        zVar.f589c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f588b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1783b.f588b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1783b.f588b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f256a.f242a == kVar) {
            return;
        }
        this.f1769L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1783b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1783b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? l.v(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1783b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f592g) {
            zVar.f592g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1783b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        d.o0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1783b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.o0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1783b;
        zVar.h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1783b;
        if (zVar.f590e != colorStateList) {
            zVar.f590e = colorStateList;
            d.e(zVar.f587a, zVar.d, colorStateList, zVar.f591f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1783b;
        if (zVar.f591f != mode) {
            zVar.f591f = mode;
            d.e(zVar.f587a, zVar.d, zVar.f590e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1783b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1785c;
        qVar.getClass();
        qVar.f533p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f534q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1785c.f534q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1785c.f534q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            T.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1784b0) {
            this.f1784b0 = typeface;
            this.f1820v0.m(typeface);
            u uVar = this.f1796j;
            if (typeface != uVar.f549B) {
                uVar.f549B = typeface;
                C0229d0 c0229d0 = uVar.f564r;
                if (c0229d0 != null) {
                    c0229d0.setTypeface(typeface);
                }
                C0229d0 c0229d02 = uVar.f571y;
                if (c0229d02 != null) {
                    c0229d02.setTypeface(typeface);
                }
            }
            C0229d0 c0229d03 = this.f1805o;
            if (c0229d03 != null) {
                c0229d03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1772O != 1) {
            FrameLayout frameLayout = this.f1781a;
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
        C0229d0 c0229d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1795i0;
        e eVar = this.f1820v0;
        if (colorStateList2 != null) {
            eVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1795i0;
            eVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1814s0) : this.f1814s0));
        } else if (m()) {
            C0229d0 c0229d02 = this.f1796j.f564r;
            eVar.i(c0229d02 != null ? c0229d02.getTextColors() : null);
        } else if (this.f1801m && (c0229d0 = this.f1805o) != null) {
            eVar.i(c0229d0.getTextColors());
        } else if (z5 && (colorStateList = this.j0) != null && eVar.f98k != colorStateList) {
            eVar.f98k = colorStateList;
            eVar.h(false);
        }
        q qVar = this.f1785c;
        z zVar = this.f1783b;
        if (z4 || !this.f1822w0 || (isEnabled() && z5)) {
            if (z3 || this.f1818u0) {
                ValueAnimator valueAnimator = this.f1825y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1825y0.cancel();
                }
                if (z2 && this.x0) {
                    a(1.0f);
                } else {
                    eVar.k(1.0f);
                }
                this.f1818u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f593j = false;
                zVar.e();
                qVar.f535r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f1818u0) {
            ValueAnimator valueAnimator2 = this.f1825y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1825y0.cancel();
            }
            if (z2 && this.x0) {
                a(0.0f);
            } else {
                eVar.k(0.0f);
            }
            if (e() && !((h) this.F).f498x.f496q.isEmpty() && e()) {
                ((h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1818u0 = true;
            C0229d0 c0229d03 = this.f1815t;
            if (c0229d03 != null && this.f1813s) {
                c0229d03.setText((CharSequence) null);
                AbstractC0194q.a(this.f1781a, this.f1823x);
                this.f1815t.setVisibility(4);
            }
            zVar.f593j = true;
            zVar.e();
            qVar.f535r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0007g) this.f1803n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1781a;
        if (length != 0 || this.f1818u0) {
            C0229d0 c0229d0 = this.f1815t;
            if (c0229d0 == null || !this.f1813s) {
                return;
            }
            c0229d0.setText((CharSequence) null);
            AbstractC0194q.a(frameLayout, this.f1823x);
            this.f1815t.setVisibility(4);
            return;
        }
        if (this.f1815t == null || !this.f1813s || TextUtils.isEmpty(this.f1811r)) {
            return;
        }
        this.f1815t.setText(this.f1811r);
        AbstractC0194q.a(frameLayout, this.f1821w);
        this.f1815t.setVisibility(0);
        this.f1815t.bringToFront();
        announceForAccessibility(this.f1811r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f1804n0.getDefaultColor();
        int colorForState = this.f1804n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1804n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1777T = colorForState2;
        } else if (z3) {
            this.f1777T = colorForState;
        } else {
            this.f1777T = defaultColor;
        }
    }

    public final void x() {
        C0229d0 c0229d0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1772O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1777T = this.f1814s0;
        } else if (m()) {
            if (this.f1804n0 != null) {
                w(z3, z2);
            } else {
                this.f1777T = getErrorCurrentTextColors();
            }
        } else if (!this.f1801m || (c0229d0 = this.f1805o) == null) {
            if (z3) {
                this.f1777T = this.f1802m0;
            } else if (z2) {
                this.f1777T = this.f1800l0;
            } else {
                this.f1777T = this.f1798k0;
            }
        } else if (this.f1804n0 != null) {
            w(z3, z2);
        } else {
            this.f1777T = c0229d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1785c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f523c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f521a;
        d.j0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f528k;
        CheckableImageButton checkableImageButton2 = qVar.f526g;
        d.j0(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof K0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                d.e(textInputLayout, checkableImageButton2, qVar.f528k, qVar.f529l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1783b;
        d.j0(zVar.f587a, zVar.d, zVar.f590e);
        if (this.f1772O == 2) {
            int i = this.f1774Q;
            if (z3 && isEnabled()) {
                this.f1774Q = this.f1776S;
            } else {
                this.f1774Q = this.f1775R;
            }
            if (this.f1774Q != i && e() && !this.f1818u0) {
                if (e()) {
                    ((h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1772O == 1) {
            if (!isEnabled()) {
                this.f1778U = this.f1808p0;
            } else if (z2 && !z3) {
                this.f1778U = this.f1812r0;
            } else if (z3) {
                this.f1778U = this.f1810q0;
            } else {
                this.f1778U = this.f1806o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1783b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1785c.f526g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1785c.f526g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1785c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1785c.f526g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1785c;
        CheckableImageButton checkableImageButton = qVar.f526g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f528k;
            PorterDuff.Mode mode = qVar.f529l;
            TextInputLayout textInputLayout = qVar.f521a;
            d.e(textInputLayout, checkableImageButton, colorStateList, mode);
            d.j0(textInputLayout, checkableImageButton, qVar.f528k);
        }
    }
}
