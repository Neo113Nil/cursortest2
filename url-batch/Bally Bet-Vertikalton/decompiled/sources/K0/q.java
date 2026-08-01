package K0;

import K.C0012l;
import K.T;
import X.V;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.skydrop.fallring.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0230d0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f521a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f522b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f523c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f524e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f525f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f526g;
    public final p h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f527j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f528k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f529l;

    /* renamed from: m, reason: collision with root package name */
    public int f530m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f531n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f532o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f533p;

    /* renamed from: q, reason: collision with root package name */
    public final C0230d0 f534q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f535r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f536s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f537t;

    /* renamed from: u, reason: collision with root package name */
    public k f538u;

    /* renamed from: v, reason: collision with root package name */
    public final m f539v;

    public q(TextInputLayout textInputLayout, C0012l c0012l) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f527j = new LinkedHashSet();
        this.f539v = new m(this);
        n nVar = new n(this);
        this.f537t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f521a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f522b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f523c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f526g = a3;
        this.h = new p(this, c0012l);
        C0230d0 c0230d0 = new C0230d0(getContext(), null);
        this.f534q = c0230d0;
        TypedArray typedArray = (TypedArray) c0012l.f432c;
        if (typedArray.hasValue(38)) {
            this.d = q1.d.A(getContext(), c0012l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f524e = B0.o.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0012l.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = T.f381a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f528k = q1.d.A(getContext(), c0012l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f529l = B0.o.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a3.getContentDescription() != (text = typedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f528k = q1.d.A(getContext(), c0012l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f529l = B0.o.g(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f530m) {
            this.f530m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType p2 = q1.d.p(typedArray.getInt(31, -1));
            this.f531n = p2;
            a3.setScaleType(p2);
            a2.setScaleType(p2);
        }
        c0230d0.setVisibility(8);
        c0230d0.setId(R.id.textinput_suffix_text);
        c0230d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0230d0.setAccessibilityLiveRegion(1);
        c0230d0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0230d0.setTextColor(c0012l.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f533p = TextUtils.isEmpty(text3) ? null : text3;
        c0230d0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0230d0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f1791e0.add(nVar);
        if (textInputLayout.d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (q1.d.T(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r c0031f;
        int i = this.i;
        p pVar = this.h;
        SparseArray sparseArray = pVar.f518a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f519b;
            if (i == -1) {
                c0031f = new C0031f(qVar, 0);
            } else if (i == 0) {
                c0031f = new C0031f(qVar, 1);
            } else if (i == 1) {
                rVar = new y(qVar, pVar.d);
                sparseArray.append(i, rVar);
            } else if (i == 2) {
                c0031f = new C0030e(qVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(V.d("Invalid end icon mode: ", i));
                }
                c0031f = new l(qVar);
            }
            rVar = c0031f;
            sparseArray.append(i, rVar);
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f526g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = T.f381a;
        return this.f534q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f522b.getVisibility() == 0 && this.f526g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f523c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f526g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof l) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            q1.d.j0(this.f521a, checkableImageButton, this.f528k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f538u;
        AccessibilityManager accessibilityManager = this.f537t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
        }
        this.f538u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f527j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.h.f520c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable v2 = i2 != 0 ? q1.l.v(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f526g;
        checkableImageButton.setImageDrawable(v2);
        TextInputLayout textInputLayout = this.f521a;
        if (v2 != null) {
            q1.d.e(textInputLayout, checkableImageButton, this.f528k, this.f529l);
            q1.d.j0(textInputLayout, checkableImageButton, this.f528k);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b3.k());
        if (!b3.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b3.r();
        k h = b3.h();
        this.f538u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = T.f381a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f538u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f532o;
        checkableImageButton.setOnClickListener(f2);
        q1.d.o0(checkableImageButton, onLongClickListener);
        EditText editText = this.f536s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        q1.d.e(textInputLayout, checkableImageButton, this.f528k, this.f529l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f526g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f521a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f523c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        q1.d.e(this.f521a, checkableImageButton, this.d, this.f524e);
    }

    public final void j(r rVar) {
        if (this.f536s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f536s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f526g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f522b.setVisibility((this.f526g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f533p == null || this.f535r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f523c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f521a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1798j.f563q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f521a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = T.f381a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = T.f381a;
        this.f534q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0230d0 c0230d0 = this.f534q;
        int visibility = c0230d0.getVisibility();
        int i = (this.f533p == null || this.f535r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0230d0.setVisibility(i);
        this.f521a.q();
    }
}
