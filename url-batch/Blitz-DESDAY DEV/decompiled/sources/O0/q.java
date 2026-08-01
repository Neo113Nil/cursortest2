package O0;

import M.Q;
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
import com.winfour.neondrop.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0182d0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f691a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f692b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f693c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f694e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f695f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f696g;
    public final p h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f697j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f698k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f699l;

    /* renamed from: m, reason: collision with root package name */
    public int f700m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f701n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f702o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f703p;

    /* renamed from: q, reason: collision with root package name */
    public final C0182d0 f704q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f705r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f706s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f707t;

    /* renamed from: u, reason: collision with root package name */
    public k f708u;

    /* renamed from: v, reason: collision with root package name */
    public final m f709v;

    public q(TextInputLayout textInputLayout, A1.j jVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f697j = new LinkedHashSet();
        this.f709v = new m(this);
        n nVar = new n(this);
        this.f707t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f691a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f692b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f693c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f696g = a3;
        this.h = new p(this, jVar);
        C0182d0 c0182d0 = new C0182d0(getContext(), null);
        this.f704q = c0182d0;
        TypedArray typedArray = (TypedArray) jVar.f81c;
        if (typedArray.hasValue(38)) {
            this.d = z1.d.u(getContext(), jVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f694e = F0.m.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(jVar.j(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = Q.f513a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f698k = z1.d.u(getContext(), jVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f699l = F0.m.g(typedArray.getInt(33, -1), null);
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
                this.f698k = z1.d.u(getContext(), jVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f699l = F0.m.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f700m) {
            this.f700m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType i2 = z1.d.i(typedArray.getInt(31, -1));
            this.f701n = i2;
            a3.setScaleType(i2);
            a2.setScaleType(i2);
        }
        c0182d0.setVisibility(8);
        c0182d0.setId(R.id.textinput_suffix_text);
        c0182d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0182d0.setAccessibilityLiveRegion(1);
        c0182d0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0182d0.setTextColor(jVar.i(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f703p = TextUtils.isEmpty(text3) ? null : text3;
        c0182d0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0182d0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2000e0.add(nVar);
        if (textInputLayout.d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (z1.d.G(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r c0030f;
        int i = this.i;
        p pVar = this.h;
        SparseArray sparseArray = pVar.f688a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f689b;
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
                    throw new IllegalArgumentException(X0.a.e("Invalid end icon mode: ", i));
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
            CheckableImageButton checkableImageButton = this.f696g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = Q.f513a;
        return this.f704q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f692b.getVisibility() == 0 && this.f696g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f693c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f696g;
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
            z1.d.R(this.f691a, checkableImageButton, this.f698k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f708u;
        AccessibilityManager accessibilityManager = this.f707t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new N.b(kVar));
        }
        this.f708u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f697j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.h.f690c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable F2 = i2 != 0 ? z1.l.F(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f696g;
        checkableImageButton.setImageDrawable(F2);
        TextInputLayout textInputLayout = this.f691a;
        if (F2 != null) {
            z1.d.a(textInputLayout, checkableImageButton, this.f698k, this.f699l);
            z1.d.R(textInputLayout, checkableImageButton, this.f698k);
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
        this.f708u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = Q.f513a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new N.b(this.f708u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f702o;
        checkableImageButton.setOnClickListener(f2);
        z1.d.a0(checkableImageButton, onLongClickListener);
        EditText editText = this.f706s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        z1.d.a(textInputLayout, checkableImageButton, this.f698k, this.f699l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f696g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f691a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f693c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        z1.d.a(this.f691a, checkableImageButton, this.d, this.f694e);
    }

    public final void j(r rVar) {
        if (this.f706s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f706s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f696g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f692b.setVisibility((this.f696g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f703p == null || this.f705r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f693c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f691a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2007j.f733q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f691a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = Q.f513a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = Q.f513a;
        this.f704q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0182d0 c0182d0 = this.f704q;
        int visibility = c0182d0.getVisibility();
        int i = (this.f703p == null || this.f705r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0182d0.setVisibility(i);
        this.f691a.q();
    }
}
