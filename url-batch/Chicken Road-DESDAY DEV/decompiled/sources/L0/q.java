package L0;

import K.C0011l;
import K.S;
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
import com.playgen.securelock.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0213d0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f541a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f542b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f543c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f544e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f545f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f546g;
    public final p h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f547j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f548k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f549l;

    /* renamed from: m, reason: collision with root package name */
    public int f550m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f551n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f552o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f553p;

    /* renamed from: q, reason: collision with root package name */
    public final C0213d0 f554q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f555r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f556s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f557t;

    /* renamed from: u, reason: collision with root package name */
    public k f558u;

    /* renamed from: v, reason: collision with root package name */
    public final m f559v;

    public q(TextInputLayout textInputLayout, C0011l c0011l) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f547j = new LinkedHashSet();
        this.f559v = new m(this);
        n nVar = new n(this);
        this.f557t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f541a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f542b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f543c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f546g = a3;
        this.h = new p(this, c0011l);
        C0213d0 c0213d0 = new C0213d0(getContext(), null);
        this.f554q = c0213d0;
        TypedArray typedArray = (TypedArray) c0011l.f423c;
        if (typedArray.hasValue(38)) {
            this.d = u1.d.C(getContext(), c0011l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f544e = C0.n.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0011l.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = S.f369a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f548k = u1.d.C(getContext(), c0011l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f549l = C0.n.g(typedArray.getInt(33, -1), null);
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
                this.f548k = u1.d.C(getContext(), c0011l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f549l = C0.n.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f550m) {
            this.f550m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType t2 = u1.d.t(typedArray.getInt(31, -1));
            this.f551n = t2;
            a3.setScaleType(t2);
            a2.setScaleType(t2);
        }
        c0213d0.setVisibility(8);
        c0213d0.setId(R.id.textinput_suffix_text);
        c0213d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0213d0.setAccessibilityLiveRegion(1);
        c0213d0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0213d0.setTextColor(c0011l.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f553p = TextUtils.isEmpty(text3) ? null : text3;
        c0213d0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0213d0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f1852e0.add(nVar);
        if (textInputLayout.d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (u1.d.V(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r c0030f;
        int i = this.i;
        p pVar = this.h;
        SparseArray sparseArray = pVar.f538a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f539b;
            if (i == -1) {
                c0030f = new C0030f(qVar, 0);
            } else if (i == 0) {
                c0030f = new C0030f(qVar, 1);
            } else if (i == 1) {
                rVar = new y(qVar, pVar.d);
                sparseArray.append(i, rVar);
            } else if (i == 2) {
                c0030f = new C0029e(qVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(V.d("Invalid end icon mode: ", i));
                }
                c0030f = new l(qVar);
            }
            rVar = c0030f;
            sparseArray.append(i, rVar);
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f546g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = S.f369a;
        return this.f554q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f542b.getVisibility() == 0 && this.f546g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f543c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f546g;
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
            u1.d.h0(this.f541a, checkableImageButton, this.f548k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f558u;
        AccessibilityManager accessibilityManager = this.f557t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
        }
        this.f558u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f547j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.h.f540c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable G2 = i2 != 0 ? u1.d.G(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f546g;
        checkableImageButton.setImageDrawable(G2);
        TextInputLayout textInputLayout = this.f541a;
        if (G2 != null) {
            u1.d.h(textInputLayout, checkableImageButton, this.f548k, this.f549l);
            u1.d.h0(textInputLayout, checkableImageButton, this.f548k);
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
        this.f558u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f369a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f558u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f552o;
        checkableImageButton.setOnClickListener(f2);
        u1.d.n0(checkableImageButton, onLongClickListener);
        EditText editText = this.f556s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        u1.d.h(textInputLayout, checkableImageButton, this.f548k, this.f549l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f546g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f541a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f543c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        u1.d.h(this.f541a, checkableImageButton, this.d, this.f544e);
    }

    public final void j(r rVar) {
        if (this.f556s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f556s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f546g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f542b.setVisibility((this.f546g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f553p == null || this.f555r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f543c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f541a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1859j.f583q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f541a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = S.f369a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f369a;
        this.f554q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0213d0 c0213d0 = this.f554q;
        int visibility = c0213d0.getVisibility();
        int i = (this.f553p == null || this.f555r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0213d0.setVisibility(i);
        this.f541a.q();
    }
}
