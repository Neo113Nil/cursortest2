package N0;

import L.C0014l;
import L.T;
import Z.V;
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
import com.winfour.winrandom.R;
import h.AbstractC0112a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C0208d0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f678a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f679b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f680c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f681e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f682f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f683g;

    /* renamed from: h, reason: collision with root package name */
    public final p f684h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f685j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f686k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f687l;

    /* renamed from: m, reason: collision with root package name */
    public int f688m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f689n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f690o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f691p;

    /* renamed from: q, reason: collision with root package name */
    public final C0208d0 f692q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f693r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f694s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f695t;

    /* renamed from: u, reason: collision with root package name */
    public k f696u;

    /* renamed from: v, reason: collision with root package name */
    public final m f697v;

    public q(TextInputLayout textInputLayout, C0014l c0014l) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f685j = new LinkedHashSet();
        this.f697v = new m(this);
        n nVar = new n(this);
        this.f695t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f678a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f679b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f680c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f683g = a3;
        this.f684h = new p(this, c0014l);
        C0208d0 c0208d0 = new C0208d0(getContext(), null);
        this.f692q = c0208d0;
        TypedArray typedArray = (TypedArray) c0014l.f543b;
        if (typedArray.hasValue(38)) {
            this.d = A1.d.C(getContext(), c0014l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f681e = E0.n.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0014l.c(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = T.f490a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f686k = A1.d.C(getContext(), c0014l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f687l = E0.n.g(typedArray.getInt(33, -1), null);
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
                this.f686k = A1.d.C(getContext(), c0014l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f687l = E0.n.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f688m) {
            this.f688m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType r2 = A1.d.r(typedArray.getInt(31, -1));
            this.f689n = r2;
            a3.setScaleType(r2);
            a2.setScaleType(r2);
        }
        c0208d0.setVisibility(8);
        c0208d0.setId(R.id.textinput_suffix_text);
        c0208d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0208d0.setAccessibilityLiveRegion(1);
        c0208d0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0208d0.setTextColor(c0014l.b(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f691p = TextUtils.isEmpty(text3) ? null : text3;
        c0208d0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0208d0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2020e0.add(nVar);
        if (textInputLayout.d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (A1.d.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r c0033f;
        int i = this.i;
        p pVar = this.f684h;
        SparseArray sparseArray = pVar.f675a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f676b;
            if (i == -1) {
                c0033f = new C0033f(qVar, 0);
            } else if (i == 0) {
                c0033f = new C0033f(qVar, 1);
            } else if (i == 1) {
                rVar = new y(qVar, pVar.d);
                sparseArray.append(i, rVar);
            } else if (i == 2) {
                c0033f = new C0032e(qVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(V.e("Invalid end icon mode: ", i));
                }
                c0033f = new l(qVar);
            }
            rVar = c0033f;
            sparseArray.append(i, rVar);
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f683g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = T.f490a;
        return this.f692q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f679b.getVisibility() == 0 && this.f683g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f680c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f683g;
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
            A1.d.b0(this.f678a, checkableImageButton, this.f686k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f696u;
        AccessibilityManager accessibilityManager = this.f695t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new M.b(kVar));
        }
        this.f696u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f685j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.f684h.f677c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable l2 = i2 != 0 ? AbstractC0112a.l(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f683g;
        checkableImageButton.setImageDrawable(l2);
        TextInputLayout textInputLayout = this.f678a;
        if (l2 != null) {
            A1.d.f(textInputLayout, checkableImageButton, this.f686k, this.f687l);
            A1.d.b0(textInputLayout, checkableImageButton, this.f686k);
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
        this.f696u = h2;
        if (h2 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = T.f490a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new M.b(this.f696u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f690o;
        checkableImageButton.setOnClickListener(f2);
        A1.d.h0(checkableImageButton, onLongClickListener);
        EditText editText = this.f694s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        A1.d.f(textInputLayout, checkableImageButton, this.f686k, this.f687l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f683g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f678a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f680c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        A1.d.f(this.f678a, checkableImageButton, this.d, this.f681e);
    }

    public final void j(r rVar) {
        if (this.f694s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f694s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f683g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f679b.setVisibility((this.f683g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f691p == null || this.f693r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f680c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f678a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2028j.f722q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f678a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = T.f490a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = T.f490a;
        this.f692q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0208d0 c0208d0 = this.f692q;
        int visibility = c0208d0.getVisibility();
        int i = (this.f691p == null || this.f693r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0208d0.setVisibility(i);
        this.f678a.q();
    }
}
