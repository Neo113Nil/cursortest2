package com.google.android.material.textfield;

import C0.c;
import H1.d;
import H1.l;
import K.H;
import K.Q;
import L0.b;
import R0.e;
import R0.f;
import R0.g;
import R0.i;
import R0.j;
import R0.k;
import U0.A;
import U0.B;
import U0.C;
import U0.m;
import U0.p;
import U0.s;
import U0.t;
import U0.w;
import U0.y;
import U0.z;
import W0.a;
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
import c1.AbstractC0091d;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0245l0;
import l.C0223a0;
import l.C0260t;
import p0.h;
import p0.q;
import u0.C0372k;
import x0.AbstractC0393a;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f2361C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2362A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f2363A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2364B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f2365B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2366C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2367D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2368E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f2369G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f2370H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2371I;

    /* renamed from: J, reason: collision with root package name */
    public g f2372J;

    /* renamed from: K, reason: collision with root package name */
    public g f2373K;

    /* renamed from: L, reason: collision with root package name */
    public k f2374L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2375M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2376N;

    /* renamed from: O, reason: collision with root package name */
    public int f2377O;

    /* renamed from: P, reason: collision with root package name */
    public int f2378P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2379Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2380R;

    /* renamed from: S, reason: collision with root package name */
    public int f2381S;

    /* renamed from: T, reason: collision with root package name */
    public int f2382T;

    /* renamed from: U, reason: collision with root package name */
    public int f2383U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2384V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2385W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2386a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2387a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f2388b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2389b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f2390c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2391c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2392d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2393e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2394e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2395f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2396f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2397g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2398g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2399h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2400i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f2401j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2402j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2403k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2404k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2405l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2406l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2407m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2408m0;

    /* renamed from: n, reason: collision with root package name */
    public B f2409n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2410n0;

    /* renamed from: o, reason: collision with root package name */
    public C0223a0 f2411o;
    public int o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2412p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2413p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2414q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2415q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2416r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2417r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2418s;
    public int s0;

    /* renamed from: t, reason: collision with root package name */
    public C0223a0 f2419t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2420t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2421u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2422u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2423v;

    /* renamed from: v0, reason: collision with root package name */
    public final b f2424v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2425w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2426w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2427x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2428x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2429y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2430y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2431z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2432z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.fortunequest.neontrack.R.attr.textInputStyle, com.fortunequest.neontrack.R.style.Widget_Design_TextInputLayout), attributeSet, com.fortunequest.neontrack.R.attr.textInputStyle);
        this.f2395f = -1;
        this.f2397g = -1;
        this.h = -1;
        this.i = -1;
        this.f2401j = new t(this);
        this.f2409n = new A1.a(3);
        this.f2384V = new Rect();
        this.f2385W = new Rect();
        this.f2387a0 = new RectF();
        this.f2394e0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f2424v0 = bVar;
        this.f2365B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2386a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0395a.f4570a;
        bVar.f715Q = linearInterpolator;
        bVar.h(false);
        bVar.f714P = linearInterpolator;
        bVar.h(false);
        if (bVar.f736g != 8388659) {
            bVar.f736g = 8388659;
            bVar.h(false);
        }
        int[] iArr = AbstractC0393a.f4541A;
        L0.k.a(context2, attributeSet, com.fortunequest.neontrack.R.attr.textInputStyle, com.fortunequest.neontrack.R.style.Widget_Design_TextInputLayout);
        L0.k.b(context2, attributeSet, iArr, com.fortunequest.neontrack.R.attr.textInputStyle, com.fortunequest.neontrack.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.fortunequest.neontrack.R.attr.textInputStyle, com.fortunequest.neontrack.R.style.Widget_Design_TextInputLayout);
        C0372k c0372k = new C0372k(context2, obtainStyledAttributes);
        y yVar = new y(this, c0372k);
        this.f2388b = yVar;
        this.f2366C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2428x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2426w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f2374L = k.b(context2, attributeSet, com.fortunequest.neontrack.R.attr.textInputStyle, com.fortunequest.neontrack.R.style.Widget_Design_TextInputLayout).a();
        this.f2376N = context2.getResources().getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2378P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2380R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2381S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2379Q = this.f2380R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f2374L.e();
        if (dimension >= RecyclerView.f1937A0) {
            e2.f940e = new R0.a(dimension);
        }
        if (dimension2 >= RecyclerView.f1937A0) {
            e2.f941f = new R0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.f1937A0) {
            e2.f942g = new R0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.f1937A0) {
            e2.h = new R0.a(dimension4);
        }
        this.f2374L = e2.a();
        ColorStateList C2 = l.C(context2, c0372k, 7);
        if (C2 != null) {
            int defaultColor = C2.getDefaultColor();
            this.o0 = defaultColor;
            this.f2383U = defaultColor;
            if (C2.isStateful()) {
                this.f2413p0 = C2.getColorForState(new int[]{-16842910}, -1);
                this.f2415q0 = C2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2417r0 = C2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2415q0 = this.o0;
                ColorStateList z2 = d.z(context2, com.fortunequest.neontrack.R.color.mtrl_filled_background_color);
                this.f2413p0 = z2.getColorForState(new int[]{-16842910}, -1);
                this.f2417r0 = z2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2383U = 0;
            this.o0 = 0;
            this.f2413p0 = 0;
            this.f2415q0 = 0;
            this.f2417r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList c2 = c0372k.c(1);
            this.f2402j0 = c2;
            this.f2400i0 = c2;
        }
        ColorStateList C3 = l.C(context2, c0372k, 14);
        this.f2408m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2404k0 = A.b.a(context2, com.fortunequest.neontrack.R.color.mtrl_textinput_default_box_stroke_color);
        this.s0 = A.b.a(context2, com.fortunequest.neontrack.R.color.mtrl_textinput_disabled_color);
        this.f2406l0 = A.b.a(context2, com.fortunequest.neontrack.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (C3 != null) {
            setBoxStrokeColorStateList(C3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(l.C(context2, c0372k, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2362A = c0372k.c(24);
        this.f2364B = c0372k.c(25);
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
        this.f2414q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2412p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2412p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2414q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0372k.c(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0372k.c(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0372k.c(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0372k.c(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0372k.c(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0372k.c(58));
        }
        p pVar = new p(this, c0372k);
        this.f2390c = pVar;
        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
        c0372k.l();
        setImportantForAccessibility(2);
        H.m(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || l.N(editText)) {
            return this.F;
        }
        int A2 = l.A(this.d, com.fortunequest.neontrack.R.attr.colorControlHighlight);
        int i = this.f2377O;
        int[][] iArr = f2361C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f2383U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{l.Q(0.1f, A2, i2), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue f02 = d.f0(context, com.fortunequest.neontrack.R.attr.colorSurface, "TextInputLayout");
        int i3 = f02.resourceId;
        int a2 = i3 != 0 ? A.b.a(context, i3) : f02.data;
        g gVar3 = new g(gVar2.f917a.f903a);
        int Q2 = l.Q(0.1f, A2, a2);
        gVar3.j(new ColorStateList(iArr, new int[]{Q2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{Q2, a2});
        g gVar4 = new g(gVar2.f917a.f903a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2370H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2370H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2370H.addState(new int[0], f(false));
        }
        return this.f2370H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2369G == null) {
            this.f2369G = f(true);
        }
        return this.f2369G;
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
        int i = this.f2395f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2397g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f2371I = false;
        i();
        setTextInputAccessibilityDelegate(new A(this));
        Typeface typeface = this.d.getTypeface();
        b bVar = this.f2424v0;
        bVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (bVar.f721W != letterSpacing) {
            bVar.f721W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f736g != i4) {
            bVar.f736g = i4;
            bVar.h(false);
        }
        if (bVar.f734f != gravity) {
            bVar.f734f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = Q.f578a;
        this.f2420t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new z(this, editText));
        if (this.f2400i0 == null) {
            this.f2400i0 = this.d.getHintTextColors();
        }
        if (this.f2366C) {
            if (TextUtils.isEmpty(this.f2367D)) {
                CharSequence hint = this.d.getHint();
                this.f2393e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f2368E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2411o != null) {
            n(this.d.getText());
        }
        r();
        this.f2401j.b();
        this.f2388b.bringToFront();
        p pVar = this.f2390c;
        pVar.bringToFront();
        Iterator it = this.f2394e0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2367D)) {
            return;
        }
        this.f2367D = charSequence;
        b bVar = this.f2424v0;
        if (charSequence == null || !TextUtils.equals(bVar.f700A, charSequence)) {
            bVar.f700A = charSequence;
            bVar.f701B = null;
            Bitmap bitmap = bVar.f704E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f704E = null;
            }
            bVar.h(false);
        }
        if (this.f2422u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2418s == z2) {
            return;
        }
        if (z2) {
            C0223a0 c0223a0 = this.f2419t;
            if (c0223a0 != null) {
                this.f2386a.addView(c0223a0);
                this.f2419t.setVisibility(0);
            }
        } else {
            C0223a0 c0223a02 = this.f2419t;
            if (c0223a02 != null) {
                c0223a02.setVisibility(8);
            }
            this.f2419t = null;
        }
        this.f2418s = z2;
    }

    public final void a(float f2) {
        int i = 1;
        b bVar = this.f2424v0;
        if (bVar.f727b == f2) {
            return;
        }
        if (this.f2430y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2430y0 = valueAnimator;
            valueAnimator.setInterpolator(l.c0(getContext(), com.fortunequest.neontrack.R.attr.motionEasingEmphasizedInterpolator, AbstractC0395a.f4571b));
            this.f2430y0.setDuration(l.b0(getContext(), com.fortunequest.neontrack.R.attr.motionDurationMedium4, 167));
            this.f2430y0.addUpdateListener(new c(i, this));
        }
        this.f2430y0.setFloatValues(bVar.f727b, f2);
        this.f2430y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2386a;
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
        k kVar = gVar.f917a.f903a;
        k kVar2 = this.f2374L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2377O == 2 && (i = this.f2379Q) > -1 && (i2 = this.f2382T) != 0) {
            g gVar2 = this.F;
            gVar2.f917a.f909j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f917a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2383U;
        if (this.f2377O == 1) {
            i3 = C.a.b(this.f2383U, l.z(getContext(), com.fortunequest.neontrack.R.attr.colorSurface, 0));
        }
        this.f2383U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f2372J;
        if (gVar3 != null && this.f2373K != null) {
            if (this.f2379Q > -1 && this.f2382T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f2404k0) : ColorStateList.valueOf(this.f2382T));
                this.f2373K.j(ColorStateList.valueOf(this.f2382T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f2366C) {
            return 0;
        }
        int i = this.f2377O;
        b bVar = this.f2424v0;
        if (i == 0) {
            d = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = bVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final h d() {
        h hVar = new h();
        hVar.f3679c = l.b0(getContext(), com.fortunequest.neontrack.R.attr.motionDurationShort2, 87);
        hVar.d = l.c0(getContext(), com.fortunequest.neontrack.R.attr.motionEasingLinearInterpolator, AbstractC0395a.f4570a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2393e != null) {
            boolean z2 = this.f2368E;
            this.f2368E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f2393e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f2368E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2386a;
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
        this.f2363A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2363A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f2366C;
        b bVar = this.f2424v0;
        if (z2) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f701B != null) {
                RectF rectF = bVar.f732e;
                if (rectF.width() > RecyclerView.f1937A0 && rectF.height() > RecyclerView.f1937A0) {
                    TextPaint textPaint = bVar.f712N;
                    textPaint.setTextSize(bVar.f705G);
                    float f2 = bVar.f743p;
                    float f3 = bVar.f744q;
                    float f4 = bVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f731d0 <= 1 || bVar.f702C) {
                        canvas.translate(f2, f3);
                        bVar.f723Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f743p - bVar.f723Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (bVar.f728b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = bVar.f706H;
                            float f7 = bVar.f707I;
                            float f8 = bVar.f708J;
                            int i3 = bVar.f709K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        bVar.f723Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f726a0 * f5));
                        if (i2 >= 31) {
                            float f9 = bVar.f706H;
                            float f10 = bVar.f707I;
                            float f11 = bVar.f708J;
                            int i4 = bVar.f709K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f723Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f730c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.f1937A0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(bVar.f706H, bVar.f707I, bVar.f708J, bVar.f709K);
                        }
                        String trim = bVar.f730c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f723Y.getLineEnd(i), str.length()), RecyclerView.f1937A0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2373K == null || (gVar = this.f2372J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f2373K.getBounds();
            Rect bounds2 = this.f2372J.getBounds();
            float f13 = bVar.f727b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0395a.c(f13, centerX, bounds2.left);
            bounds.right = AbstractC0395a.c(f13, centerX, bounds2.right);
            this.f2373K.draw(canvas);
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
        if (this.f2432z0) {
            return;
        }
        this.f2432z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f2424v0;
        if (bVar != null) {
            bVar.f710L = drawableState;
            ColorStateList colorStateList2 = bVar.f738k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f737j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = Q.f578a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2432z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2432z0 = false;
    }

    public final boolean e() {
        return this.f2366C && !TextUtils.isEmpty(this.f2367D) && (this.F instanceof U0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.f1937A0;
        EditText editText = this.d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        R0.a aVar = new R0.a(f2);
        R0.a aVar2 = new R0.a(f2);
        R0.a aVar3 = new R0.a(dimensionPixelOffset);
        R0.a aVar4 = new R0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f946a = iVar;
        kVar.f947b = iVar2;
        kVar.f948c = iVar3;
        kVar.d = iVar4;
        kVar.f949e = aVar;
        kVar.f950f = aVar2;
        kVar.f951g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f952j = eVar2;
        kVar.f953k = eVar3;
        kVar.f954l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f916w;
            TypedValue f02 = d.f0(context, com.fortunequest.neontrack.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = f02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? A.b.a(context, i2) : f02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f917a;
        if (fVar.f908g == null) {
            fVar.f908g = new Rect();
        }
        gVar.f917a.f908g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f2390c.c() : this.f2388b.a()) + i;
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
        int i = this.f2377O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2383U;
    }

    public int getBoxBackgroundMode() {
        return this.f2377O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2378P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = L0.k.e(this);
        RectF rectF = this.f2387a0;
        return e2 ? this.f2374L.h.a(rectF) : this.f2374L.f951g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = L0.k.e(this);
        RectF rectF = this.f2387a0;
        return e2 ? this.f2374L.f951g.a(rectF) : this.f2374L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = L0.k.e(this);
        RectF rectF = this.f2387a0;
        return e2 ? this.f2374L.f949e.a(rectF) : this.f2374L.f950f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = L0.k.e(this);
        RectF rectF = this.f2387a0;
        return e2 ? this.f2374L.f950f.a(rectF) : this.f2374L.f949e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2408m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2410n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2380R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2381S;
    }

    public int getCounterMaxLength() {
        return this.f2405l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0223a0 c0223a0;
        if (this.f2403k && this.f2407m && (c0223a0 = this.f2411o) != null) {
            return c0223a0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2431z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2429y;
    }

    public ColorStateList getCursorColor() {
        return this.f2362A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2364B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2400i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2390c.f1175g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2390c.f1175g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2390c.f1179m;
    }

    public int getEndIconMode() {
        return this.f2390c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2390c.f1180n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2390c.f1175g;
    }

    public CharSequence getError() {
        t tVar = this.f2401j;
        if (tVar.f1212q) {
            return tVar.f1211p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2401j.f1215t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2401j.f1214s;
    }

    public int getErrorCurrentTextColors() {
        C0223a0 c0223a0 = this.f2401j.f1213r;
        if (c0223a0 != null) {
            return c0223a0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2390c.f1172c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2401j;
        if (tVar.f1219x) {
            return tVar.f1218w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0223a0 c0223a0 = this.f2401j.f1220y;
        if (c0223a0 != null) {
            return c0223a0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2366C) {
            return this.f2367D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2424v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2424v0;
        return bVar.e(bVar.f738k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2402j0;
    }

    public B getLengthCounter() {
        return this.f2409n;
    }

    public int getMaxEms() {
        return this.f2397g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2395f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2390c.f1175g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2390c.f1175g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2418s) {
            return this.f2416r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2423v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2421u;
    }

    public CharSequence getPrefixText() {
        return this.f2388b.f1238c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2388b.f1237b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2388b.f1237b;
    }

    public k getShapeAppearanceModel() {
        return this.f2374L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2388b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2388b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2388b.f1241g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2388b.h;
    }

    public CharSequence getSuffixText() {
        return this.f2390c.f1182p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2390c.f1183q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2390c.f1183q;
    }

    public Typeface getTypeface() {
        return this.f2389b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f2388b.a() : this.f2390c.c());
    }

    public final void i() {
        int i = this.f2377O;
        if (i == 0) {
            this.F = null;
            this.f2372J = null;
            this.f2373K = null;
        } else if (i == 1) {
            this.F = new g(this.f2374L);
            this.f2372J = new g();
            this.f2373K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2377O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2366C || (this.F instanceof U0.h)) {
                this.F = new g(this.f2374L);
            } else {
                k kVar = this.f2374L;
                int i2 = U0.h.f1147y;
                if (kVar == null) {
                    kVar = new k();
                }
                U0.g gVar = new U0.g(kVar, new RectF());
                U0.h hVar = new U0.h(gVar);
                hVar.f1148x = gVar;
                this.F = hVar;
            }
            this.f2372J = null;
            this.f2373K = null;
        }
        s();
        x();
        if (this.f2377O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2378P = getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (l.O(getContext())) {
                this.f2378P = getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f2377O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = Q.f578a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (l.O(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = Q.f578a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2377O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2377O;
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
            b bVar = this.f2424v0;
            boolean b2 = bVar.b(bVar.f700A);
            bVar.f702C = b2;
            Rect rect = bVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.f724Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = bVar.f724Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2387a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.f724Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f702C) {
                        f5 = max + bVar.f724Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (bVar.f702C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = bVar.f724Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > RecyclerView.f1937A0 || rectF.height() <= RecyclerView.f1937A0) {
                }
                float f6 = rectF.left;
                float f7 = this.f2376N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2379Q);
                U0.h hVar = (U0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = bVar.f724Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2387a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.f724Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > RecyclerView.f1937A0) {
            }
        }
    }

    public final void l(C0223a0 c0223a0, int i) {
        try {
            c0223a0.setTextAppearance(i);
            if (c0223a0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0223a0.setTextAppearance(com.fortunequest.neontrack.R.style.TextAppearance_AppCompat_Caption);
        c0223a0.setTextColor(A.b.a(getContext(), com.fortunequest.neontrack.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2401j;
        return (tVar.f1210o != 1 || tVar.f1213r == null || TextUtils.isEmpty(tVar.f1211p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((A1.a) this.f2409n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2407m;
        int i = this.f2405l;
        String str = null;
        if (i == -1) {
            this.f2411o.setText(String.valueOf(length));
            this.f2411o.setContentDescription(null);
            this.f2407m = false;
        } else {
            this.f2407m = length > i;
            Context context = getContext();
            this.f2411o.setContentDescription(context.getString(this.f2407m ? com.fortunequest.neontrack.R.string.character_counter_overflowed_content_description : com.fortunequest.neontrack.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2405l)));
            if (z2 != this.f2407m) {
                o();
            }
            String str2 = I.b.f531b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f533e : I.b.d;
            C0223a0 c0223a0 = this.f2411o;
            String string = getContext().getString(com.fortunequest.neontrack.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2405l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                C0.d dVar = I.h.f539a;
                str = bVar.c(string).toString();
            }
            c0223a0.setText(str);
        }
        if (this.d == null || z2 == this.f2407m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0223a0 c0223a0 = this.f2411o;
        if (c0223a0 != null) {
            l(c0223a0, this.f2407m ? this.f2412p : this.f2414q);
            if (!this.f2407m && (colorStateList2 = this.f2429y) != null) {
                this.f2411o.setTextColor(colorStateList2);
            }
            if (!this.f2407m || (colorStateList = this.f2431z) == null) {
                return;
            }
            this.f2411o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2424v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f2390c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2365B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f2388b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new E0.b(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = L0.c.f754a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2384V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = L0.c.f754a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            L0.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = L0.c.f755b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2372J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2380R, rect.right, i5);
            }
            g gVar2 = this.f2373K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2381S, rect.right, i6);
            }
            if (this.f2366C) {
                float textSize = this.d.getTextSize();
                b bVar = this.f2424v0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.f736g != i7) {
                    bVar.f736g = i7;
                    bVar.h(false);
                }
                if (bVar.f734f != gravity) {
                    bVar.f734f = gravity;
                    bVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = L0.k.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2385W;
                rect2.bottom = i8;
                int i9 = this.f2377O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f2378P;
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
                Rect rect3 = bVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.f711M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f713O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f748u);
                textPaint.setLetterSpacing(bVar.f721W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2377O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2377O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.f729c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.f711M = true;
                }
                bVar.h(false);
                if (!e() || this.f2422u0) {
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
        boolean z2 = this.f2365B0;
        p pVar = this.f2390c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2365B0 = true;
        }
        if (this.f2419t != null && (editText = this.d) != null) {
            this.f2419t.setGravity(editText.getGravity());
            this.f2419t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C c2 = (C) parcelable;
        super.onRestoreInstanceState(c2.f986a);
        setError(c2.f1129c);
        if (c2.d) {
            post(new C0.i(4, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2375M) {
            R0.c cVar = this.f2374L.f949e;
            RectF rectF = this.f2387a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2374L.f950f.a(rectF);
            float a4 = this.f2374L.h.a(rectF);
            float a5 = this.f2374L.f951g.a(rectF);
            k kVar = this.f2374L;
            d dVar = kVar.f946a;
            d dVar2 = kVar.f947b;
            d dVar3 = kVar.d;
            d dVar4 = kVar.f948c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(dVar2);
            j.b(dVar);
            j.b(dVar4);
            j.b(dVar3);
            R0.a aVar = new R0.a(a3);
            R0.a aVar2 = new R0.a(a2);
            R0.a aVar3 = new R0.a(a5);
            R0.a aVar4 = new R0.a(a4);
            k kVar2 = new k();
            kVar2.f946a = dVar2;
            kVar2.f947b = dVar;
            kVar2.f948c = dVar3;
            kVar2.d = dVar4;
            kVar2.f949e = aVar;
            kVar2.f950f = aVar2;
            kVar2.f951g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f952j = eVar2;
            kVar2.f953k = eVar3;
            kVar2.f954l = eVar4;
            this.f2375M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C c2 = new C(super.onSaveInstanceState());
        if (m()) {
            c2.f1129c = getError();
        }
        p pVar = this.f2390c;
        c2.d = pVar.i != 0 && pVar.f1175g.d;
        return c2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2362A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue d02 = d.d0(context, com.fortunequest.neontrack.R.attr.colorControlActivated);
            if (d02 != null) {
                int i = d02.resourceId;
                if (i != 0) {
                    colorStateList2 = d.z(context, i);
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
            if ((m() || (this.f2411o != null && this.f2407m)) && (colorStateList = this.f2364B) != null) {
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
            y yVar = this.f2388b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f2391c0 == null || this.f2392d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2391c0 = colorDrawable3;
                    this.f2392d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2391c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    pVar = this.f2390c;
                    if ((!pVar.e() || ((pVar.i != 0 && pVar.d()) || pVar.f1182p != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f1183q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f1172c;
                        } else if (pVar.i != 0 && pVar.d()) {
                            checkableImageButton = pVar.f1175g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2396f0;
                        if (colorDrawable != null || this.f2398g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2396f0 = colorDrawable5;
                                this.f2398g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2396f0;
                            if (drawable == colorDrawable2) {
                                this.f2399h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2398g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2396f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2396f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2396f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2399h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2396f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                pVar = this.f2390c;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f1183q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f2396f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2396f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2391c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2391c0 = null;
            z2 = true;
            pVar = this.f2390c;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f1183q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f2396f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2396f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        pVar = this.f2390c;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f1183q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f2396f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2396f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0223a0 c0223a0;
        EditText editText = this.d;
        if (editText == null || this.f2377O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0245l0.f3428a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0260t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2407m && (c0223a0 = this.f2411o) != null) {
            mutate.setColorFilter(C0260t.c(c0223a0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f2371I || editText.getBackground() == null) && this.f2377O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = Q.f578a;
            editText2.setBackground(editTextBoxBackground);
            this.f2371I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2383U != i) {
            this.f2383U = i;
            this.o0 = i;
            this.f2415q0 = i;
            this.f2417r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(A.b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o0 = defaultColor;
        this.f2383U = defaultColor;
        this.f2413p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2415q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2417r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2377O) {
            return;
        }
        this.f2377O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2378P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f2374L.e();
        R0.c cVar = this.f2374L.f949e;
        d v2 = l.v(i);
        e2.f937a = v2;
        j.b(v2);
        e2.f940e = cVar;
        R0.c cVar2 = this.f2374L.f950f;
        d v3 = l.v(i);
        e2.f938b = v3;
        j.b(v3);
        e2.f941f = cVar2;
        R0.c cVar3 = this.f2374L.h;
        d v4 = l.v(i);
        e2.d = v4;
        j.b(v4);
        e2.h = cVar3;
        R0.c cVar4 = this.f2374L.f951g;
        d v5 = l.v(i);
        e2.f939c = v5;
        j.b(v5);
        e2.f942g = cVar4;
        this.f2374L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2408m0 != i) {
            this.f2408m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2404k0 = colorStateList.getDefaultColor();
            this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2406l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2408m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2408m0 != colorStateList.getDefaultColor()) {
            this.f2408m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2410n0 != colorStateList) {
            this.f2410n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2380R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2381S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2403k != z2) {
            t tVar = this.f2401j;
            if (z2) {
                C0223a0 c0223a0 = new C0223a0(getContext(), null);
                this.f2411o = c0223a0;
                c0223a0.setId(com.fortunequest.neontrack.R.id.textinput_counter);
                Typeface typeface = this.f2389b0;
                if (typeface != null) {
                    this.f2411o.setTypeface(typeface);
                }
                this.f2411o.setMaxLines(1);
                tVar.a(this.f2411o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2411o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2411o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2411o, 2);
                this.f2411o = null;
            }
            this.f2403k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2405l != i) {
            if (i > 0) {
                this.f2405l = i;
            } else {
                this.f2405l = -1;
            }
            if (!this.f2403k || this.f2411o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2412p != i) {
            this.f2412p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2431z != colorStateList) {
            this.f2431z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2414q != i) {
            this.f2414q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2429y != colorStateList) {
            this.f2429y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2362A != colorStateList) {
            this.f2362A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2364B != colorStateList) {
            this.f2364B = colorStateList;
            if (m() || (this.f2411o != null && this.f2407m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2400i0 = colorStateList;
        this.f2402j0 = colorStateList;
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
        this.f2390c.f1175g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2390c.f1175g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f2390c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f1175g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f2390c;
        Drawable j2 = i != 0 ? AbstractC0091d.j(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f1175g;
        checkableImageButton.setImageDrawable(j2);
        if (j2 != null) {
            ColorStateList colorStateList = pVar.f1177k;
            PorterDuff.Mode mode = pVar.f1178l;
            TextInputLayout textInputLayout = pVar.f1170a;
            d.c(textInputLayout, checkableImageButton, colorStateList, mode);
            d.c0(textInputLayout, checkableImageButton, pVar.f1177k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f2390c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f1179m) {
            pVar.f1179m = i;
            CheckableImageButton checkableImageButton = pVar.f1175g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f1172c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2390c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2390c;
        View.OnLongClickListener onLongClickListener = pVar.f1181o;
        CheckableImageButton checkableImageButton = pVar.f1175g;
        checkableImageButton.setOnClickListener(onClickListener);
        d.l0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2390c;
        pVar.f1181o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f1175g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.l0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2390c;
        pVar.f1180n = scaleType;
        pVar.f1175g.setScaleType(scaleType);
        pVar.f1172c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2390c;
        if (pVar.f1177k != colorStateList) {
            pVar.f1177k = colorStateList;
            d.c(pVar.f1170a, pVar.f1175g, colorStateList, pVar.f1178l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2390c;
        if (pVar.f1178l != mode) {
            pVar.f1178l = mode;
            d.c(pVar.f1170a, pVar.f1175g, pVar.f1177k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2390c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2401j;
        if (!tVar.f1212q) {
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
        tVar.f1211p = charSequence;
        tVar.f1213r.setText(charSequence);
        int i = tVar.f1209n;
        if (i != 1) {
            tVar.f1210o = 1;
        }
        tVar.i(i, tVar.f1210o, tVar.h(tVar.f1213r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f2401j;
        tVar.f1215t = i;
        C0223a0 c0223a0 = tVar.f1213r;
        if (c0223a0 != null) {
            WeakHashMap weakHashMap = Q.f578a;
            c0223a0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2401j;
        tVar.f1214s = charSequence;
        C0223a0 c0223a0 = tVar.f1213r;
        if (c0223a0 != null) {
            c0223a0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.f2401j;
        if (tVar.f1212q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z2) {
            C0223a0 c0223a0 = new C0223a0(tVar.f1204g, null);
            tVar.f1213r = c0223a0;
            c0223a0.setId(com.fortunequest.neontrack.R.id.textinput_error);
            tVar.f1213r.setTextAlignment(5);
            Typeface typeface = tVar.f1198B;
            if (typeface != null) {
                tVar.f1213r.setTypeface(typeface);
            }
            int i = tVar.f1216u;
            tVar.f1216u = i;
            C0223a0 c0223a02 = tVar.f1213r;
            if (c0223a02 != null) {
                textInputLayout.l(c0223a02, i);
            }
            ColorStateList colorStateList = tVar.f1217v;
            tVar.f1217v = colorStateList;
            C0223a0 c0223a03 = tVar.f1213r;
            if (c0223a03 != null && colorStateList != null) {
                c0223a03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f1214s;
            tVar.f1214s = charSequence;
            C0223a0 c0223a04 = tVar.f1213r;
            if (c0223a04 != null) {
                c0223a04.setContentDescription(charSequence);
            }
            int i2 = tVar.f1215t;
            tVar.f1215t = i2;
            C0223a0 c0223a05 = tVar.f1213r;
            if (c0223a05 != null) {
                WeakHashMap weakHashMap = Q.f578a;
                c0223a05.setAccessibilityLiveRegion(i2);
            }
            tVar.f1213r.setVisibility(4);
            tVar.a(tVar.f1213r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f1213r, 0);
            tVar.f1213r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1212q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f2390c;
        pVar.i(i != 0 ? AbstractC0091d.j(pVar.getContext(), i) : null);
        d.c0(pVar.f1170a, pVar.f1172c, pVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2390c;
        CheckableImageButton checkableImageButton = pVar.f1172c;
        View.OnLongClickListener onLongClickListener = pVar.f1174f;
        checkableImageButton.setOnClickListener(onClickListener);
        d.l0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2390c;
        pVar.f1174f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f1172c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.l0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2390c;
        if (pVar.d != colorStateList) {
            pVar.d = colorStateList;
            d.c(pVar.f1170a, pVar.f1172c, colorStateList, pVar.f1173e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2390c;
        if (pVar.f1173e != mode) {
            pVar.f1173e = mode;
            d.c(pVar.f1170a, pVar.f1172c, pVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f2401j;
        tVar.f1216u = i;
        C0223a0 c0223a0 = tVar.f1213r;
        if (c0223a0 != null) {
            tVar.h.l(c0223a0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2401j;
        tVar.f1217v = colorStateList;
        C0223a0 c0223a0 = tVar.f1213r;
        if (c0223a0 == null || colorStateList == null) {
            return;
        }
        c0223a0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2426w0 != z2) {
            this.f2426w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2401j;
        if (isEmpty) {
            if (tVar.f1219x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f1219x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f1218w = charSequence;
        tVar.f1220y.setText(charSequence);
        int i = tVar.f1209n;
        if (i != 2) {
            tVar.f1210o = 2;
        }
        tVar.i(i, tVar.f1210o, tVar.h(tVar.f1220y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2401j;
        tVar.f1197A = colorStateList;
        C0223a0 c0223a0 = tVar.f1220y;
        if (c0223a0 == null || colorStateList == null) {
            return;
        }
        c0223a0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.f2401j;
        if (tVar.f1219x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0223a0 c0223a0 = new C0223a0(tVar.f1204g, null);
            tVar.f1220y = c0223a0;
            c0223a0.setId(com.fortunequest.neontrack.R.id.textinput_helper_text);
            tVar.f1220y.setTextAlignment(5);
            Typeface typeface = tVar.f1198B;
            if (typeface != null) {
                tVar.f1220y.setTypeface(typeface);
            }
            tVar.f1220y.setVisibility(4);
            tVar.f1220y.setAccessibilityLiveRegion(1);
            int i = tVar.f1221z;
            tVar.f1221z = i;
            C0223a0 c0223a02 = tVar.f1220y;
            if (c0223a02 != null) {
                c0223a02.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f1197A;
            tVar.f1197A = colorStateList;
            C0223a0 c0223a03 = tVar.f1220y;
            if (c0223a03 != null && colorStateList != null) {
                c0223a03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f1220y, 1);
            tVar.f1220y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f1209n;
            if (i2 == 2) {
                tVar.f1210o = 0;
            }
            tVar.i(i2, tVar.f1210o, tVar.h(tVar.f1220y, ""));
            tVar.g(tVar.f1220y, 1);
            tVar.f1220y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1219x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f2401j;
        tVar.f1221z = i;
        C0223a0 c0223a0 = tVar.f1220y;
        if (c0223a0 != null) {
            c0223a0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2366C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2428x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2366C) {
            this.f2366C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2367D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f2368E = true;
            } else {
                this.f2368E = false;
                if (!TextUtils.isEmpty(this.f2367D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f2367D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f2424v0;
        TextInputLayout textInputLayout = bVar.f725a;
        O0.d dVar = new O0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f852j;
        if (colorStateList != null) {
            bVar.f738k = colorStateList;
        }
        float f2 = dVar.f853k;
        if (f2 != RecyclerView.f1937A0) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f846a;
        if (colorStateList2 != null) {
            bVar.f719U = colorStateList2;
        }
        bVar.f717S = dVar.f849e;
        bVar.f718T = dVar.f850f;
        bVar.f716R = dVar.f851g;
        bVar.f720V = dVar.i;
        O0.a aVar = bVar.f752y;
        if (aVar != null) {
            aVar.f842g = true;
        }
        A0.c cVar = new A0.c(10, bVar);
        dVar.a();
        bVar.f752y = new O0.a(cVar, dVar.f856n);
        dVar.c(textInputLayout.getContext(), bVar.f752y);
        bVar.h(false);
        this.f2402j0 = bVar.f738k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2402j0 != colorStateList) {
            if (this.f2400i0 == null) {
                b bVar = this.f2424v0;
                if (bVar.f738k != colorStateList) {
                    bVar.f738k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2402j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(B b2) {
        this.f2409n = b2;
    }

    public void setMaxEms(int i) {
        this.f2397g = i;
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
        this.f2395f = i;
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
        p pVar = this.f2390c;
        pVar.f1175g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f2390c;
        pVar.f1175g.setImageDrawable(i != 0 ? AbstractC0091d.j(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f2390c;
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
        p pVar = this.f2390c;
        pVar.f1177k = colorStateList;
        d.c(pVar.f1170a, pVar.f1175g, colorStateList, pVar.f1178l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2390c;
        pVar.f1178l = mode;
        d.c(pVar.f1170a, pVar.f1175g, pVar.f1177k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2419t == null) {
            C0223a0 c0223a0 = new C0223a0(getContext(), null);
            this.f2419t = c0223a0;
            c0223a0.setId(com.fortunequest.neontrack.R.id.textinput_placeholder);
            this.f2419t.setImportantForAccessibility(2);
            h d = d();
            this.f2425w = d;
            d.f3678b = 67L;
            this.f2427x = d();
            setPlaceholderTextAppearance(this.f2423v);
            setPlaceholderTextColor(this.f2421u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2418s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2416r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2423v = i;
        C0223a0 c0223a0 = this.f2419t;
        if (c0223a0 != null) {
            c0223a0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2421u != colorStateList) {
            this.f2421u = colorStateList;
            C0223a0 c0223a0 = this.f2419t;
            if (c0223a0 == null || colorStateList == null) {
                return;
            }
            c0223a0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f2388b;
        yVar.getClass();
        yVar.f1238c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f1237b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2388b.f1237b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2388b.f1237b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f917a.f903a == kVar) {
            return;
        }
        this.f2374L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2388b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2388b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0091d.j(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f2388b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f1241g) {
            yVar.f1241g = i;
            CheckableImageButton checkableImageButton = yVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f2388b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        d.l0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f2388b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.l0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f2388b;
        yVar.h = scaleType;
        yVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f2388b;
        if (yVar.f1239e != colorStateList) {
            yVar.f1239e = colorStateList;
            d.c(yVar.f1236a, yVar.d, colorStateList, yVar.f1240f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f2388b;
        if (yVar.f1240f != mode) {
            yVar.f1240f = mode;
            d.c(yVar.f1236a, yVar.d, yVar.f1239e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2388b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2390c;
        pVar.getClass();
        pVar.f1182p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f1183q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2390c.f1183q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2390c.f1183q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(A a2) {
        EditText editText = this.d;
        if (editText != null) {
            Q.l(editText, a2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2389b0) {
            this.f2389b0 = typeface;
            this.f2424v0.m(typeface);
            t tVar = this.f2401j;
            if (typeface != tVar.f1198B) {
                tVar.f1198B = typeface;
                C0223a0 c0223a0 = tVar.f1213r;
                if (c0223a0 != null) {
                    c0223a0.setTypeface(typeface);
                }
                C0223a0 c0223a02 = tVar.f1220y;
                if (c0223a02 != null) {
                    c0223a02.setTypeface(typeface);
                }
            }
            C0223a0 c0223a03 = this.f2411o;
            if (c0223a03 != null) {
                c0223a03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2377O != 1) {
            FrameLayout frameLayout = this.f2386a;
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
        C0223a0 c0223a0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2400i0;
        b bVar = this.f2424v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2400i0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.s0) : this.s0));
        } else if (m()) {
            C0223a0 c0223a02 = this.f2401j.f1213r;
            bVar.i(c0223a02 != null ? c0223a02.getTextColors() : null);
        } else if (this.f2407m && (c0223a0 = this.f2411o) != null) {
            bVar.i(c0223a0.getTextColors());
        } else if (z5 && (colorStateList = this.f2402j0) != null && bVar.f738k != colorStateList) {
            bVar.f738k = colorStateList;
            bVar.h(false);
        }
        p pVar = this.f2390c;
        y yVar = this.f2388b;
        if (z4 || !this.f2426w0 || (isEnabled() && z5)) {
            if (z3 || this.f2422u0) {
                ValueAnimator valueAnimator = this.f2430y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2430y0.cancel();
                }
                if (z2 && this.f2428x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f2422u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f1242j = false;
                yVar.e();
                pVar.f1184r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2422u0) {
            ValueAnimator valueAnimator2 = this.f2430y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2430y0.cancel();
            }
            if (z2 && this.f2428x0) {
                a(RecyclerView.f1937A0);
            } else {
                bVar.k(RecyclerView.f1937A0);
            }
            if (e() && !((U0.h) this.F).f1148x.f1146q.isEmpty() && e()) {
                ((U0.h) this.F).n(RecyclerView.f1937A0, RecyclerView.f1937A0, RecyclerView.f1937A0, RecyclerView.f1937A0);
            }
            this.f2422u0 = true;
            C0223a0 c0223a03 = this.f2419t;
            if (c0223a03 != null && this.f2418s) {
                c0223a03.setText((CharSequence) null);
                q.a(this.f2386a, this.f2427x);
                this.f2419t.setVisibility(4);
            }
            yVar.f1242j = true;
            yVar.e();
            pVar.f1184r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((A1.a) this.f2409n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2386a;
        if (length != 0 || this.f2422u0) {
            C0223a0 c0223a0 = this.f2419t;
            if (c0223a0 == null || !this.f2418s) {
                return;
            }
            c0223a0.setText((CharSequence) null);
            q.a(frameLayout, this.f2427x);
            this.f2419t.setVisibility(4);
            return;
        }
        if (this.f2419t == null || !this.f2418s || TextUtils.isEmpty(this.f2416r)) {
            return;
        }
        this.f2419t.setText(this.f2416r);
        q.a(frameLayout, this.f2425w);
        this.f2419t.setVisibility(0);
        this.f2419t.bringToFront();
        announceForAccessibility(this.f2416r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2410n0.getDefaultColor();
        int colorForState = this.f2410n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2410n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2382T = colorForState2;
        } else if (z3) {
            this.f2382T = colorForState;
        } else {
            this.f2382T = defaultColor;
        }
    }

    public final void x() {
        C0223a0 c0223a0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f2377O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2382T = this.s0;
        } else if (m()) {
            if (this.f2410n0 != null) {
                w(z3, z2);
            } else {
                this.f2382T = getErrorCurrentTextColors();
            }
        } else if (!this.f2407m || (c0223a0 = this.f2411o) == null) {
            if (z3) {
                this.f2382T = this.f2408m0;
            } else if (z2) {
                this.f2382T = this.f2406l0;
            } else {
                this.f2382T = this.f2404k0;
            }
        } else if (this.f2410n0 != null) {
            w(z3, z2);
        } else {
            this.f2382T = c0223a0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f2390c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f1172c;
        ColorStateList colorStateList = pVar.d;
        TextInputLayout textInputLayout = pVar.f1170a;
        d.c0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f1177k;
        CheckableImageButton checkableImageButton2 = pVar.f1175g;
        d.c0(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof U0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                d.c(textInputLayout, checkableImageButton2, pVar.f1177k, pVar.f1178l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f2388b;
        d.c0(yVar.f1236a, yVar.d, yVar.f1239e);
        if (this.f2377O == 2) {
            int i = this.f2379Q;
            if (z3 && isEnabled()) {
                this.f2379Q = this.f2381S;
            } else {
                this.f2379Q = this.f2380R;
            }
            if (this.f2379Q != i && e() && !this.f2422u0) {
                if (e()) {
                    ((U0.h) this.F).n(RecyclerView.f1937A0, RecyclerView.f1937A0, RecyclerView.f1937A0, RecyclerView.f1937A0);
                }
                j();
            }
        }
        if (this.f2377O == 1) {
            if (!isEnabled()) {
                this.f2383U = this.f2413p0;
            } else if (z2 && !z3) {
                this.f2383U = this.f2417r0;
            } else if (z3) {
                this.f2383U = this.f2415q0;
            } else {
                this.f2383U = this.o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2388b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2390c.f1175g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2390c.f1175g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2390c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2390c.f1175g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2390c;
        CheckableImageButton checkableImageButton = pVar.f1175g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f1177k;
            PorterDuff.Mode mode = pVar.f1178l;
            TextInputLayout textInputLayout = pVar.f1170a;
            d.c(textInputLayout, checkableImageButton, colorStateList, mode);
            d.c0(textInputLayout, checkableImageButton, pVar.f1177k);
        }
    }
}
