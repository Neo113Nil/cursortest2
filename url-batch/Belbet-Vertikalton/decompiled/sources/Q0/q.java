package Q0;

import G1.AbstractC0001b;
import M.P;
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
import com.winpower.neonfit.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n.C0267c0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1043a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f1044b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f1045c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1046d;
    public PorterDuff.Mode e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f1047f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f1048g;

    /* renamed from: h, reason: collision with root package name */
    public final p f1049h;
    public int i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1050k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1051l;

    /* renamed from: m, reason: collision with root package name */
    public int f1052m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f1053n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f1054o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1055p;

    /* renamed from: q, reason: collision with root package name */
    public final C0267c0 f1056q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1057r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f1058s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f1059t;

    /* renamed from: u, reason: collision with root package name */
    public k f1060u;

    /* renamed from: v, reason: collision with root package name */
    public final m f1061v;

    public q(TextInputLayout textInputLayout, I0.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.f1061v = new m(this);
        n nVar = new n(this);
        this.f1059t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1043a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1044b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f1045c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f1048g = a3;
        this.f1049h = new p(this, hVar);
        C0267c0 c0267c0 = new C0267c0(getContext(), null);
        this.f1056q = c0267c0;
        TypedArray typedArray = (TypedArray) hVar.f592c;
        if (typedArray.hasValue(38)) {
            this.f1046d = H1.d.B(getContext(), hVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = H0.m.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(hVar.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = P.f711a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1050k = H1.d.B(getContext(), hVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1051l = H0.m.g(typedArray.getInt(33, -1), null);
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
                this.f1050k = H1.d.B(getContext(), hVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1051l = H0.m.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f1052m) {
            this.f1052m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o2 = H1.l.o(typedArray.getInt(31, -1));
            this.f1053n = o2;
            a3.setScaleType(o2);
            a2.setScaleType(o2);
        }
        c0267c0.setVisibility(8);
        c0267c0.setId(R.id.textinput_suffix_text);
        c0267c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0267c0.setAccessibilityLiveRegion(1);
        c0267c0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0267c0.setTextColor(hVar.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1055p = TextUtils.isEmpty(text3) ? null : text3;
        c0267c0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0267c0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2516e0.add(nVar);
        if (textInputLayout.f2514d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (H1.d.P(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r fVar;
        int i = this.i;
        p pVar = this.f1049h;
        SparseArray sparseArray = pVar.f1039a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f1040b;
            if (i == -1) {
                fVar = new f(qVar, 0);
            } else if (i == 0) {
                fVar = new f(qVar, 1);
            } else if (i == 1) {
                rVar = new y(qVar, pVar.f1042d);
                sparseArray.append(i, rVar);
            } else if (i == 2) {
                fVar = new C0034e(qVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0001b.e("Invalid end icon mode: ", i));
                }
                fVar = new l(qVar);
            }
            rVar = fVar;
            sparseArray.append(i, rVar);
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f1048g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = P.f711a;
        return this.f1056q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1044b.getVisibility() == 0 && this.f1048g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1045c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f1048g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.f2437d) == b2.l()) {
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
            H1.l.R(this.f1043a, checkableImageButton, this.f1050k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f1060u;
        AccessibilityManager accessibilityManager = this.f1059t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new N.b(kVar));
        }
        this.f1060u = null;
        b2.s();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.f1049h.f1041c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable F2 = i2 != 0 ? H1.d.F(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f1048g;
        checkableImageButton.setImageDrawable(F2);
        TextInputLayout textInputLayout = this.f1043a;
        if (F2 != null) {
            H1.l.d(textInputLayout, checkableImageButton, this.f1050k, this.f1051l);
            H1.l.R(textInputLayout, checkableImageButton, this.f1050k);
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
        k h2 = b3.h();
        this.f1060u = h2;
        if (h2 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = P.f711a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new N.b(this.f1060u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f1054o;
        checkableImageButton.setOnClickListener(f2);
        H1.l.Z(checkableImageButton, onLongClickListener);
        EditText editText = this.f1058s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        H1.l.d(textInputLayout, checkableImageButton, this.f1050k, this.f1051l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f1048g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f1043a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1045c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        H1.l.d(this.f1043a, checkableImageButton, this.f1046d, this.e);
    }

    public final void j(r rVar) {
        if (this.f1058s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f1058s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f1048g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f1044b.setVisibility((this.f1048g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1055p == null || this.f1057r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1045c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1043a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.j.f1086q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f1043a;
        if (textInputLayout.f2514d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f2514d;
            WeakHashMap weakHashMap = P.f711a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2514d.getPaddingTop();
        int paddingBottom = textInputLayout.f2514d.getPaddingBottom();
        WeakHashMap weakHashMap2 = P.f711a;
        this.f1056q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0267c0 c0267c0 = this.f1056q;
        int visibility = c0267c0.getVisibility();
        int i = (this.f1055p == null || this.f1057r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0267c0.setVisibility(i);
        this.f1043a.q();
    }
}
