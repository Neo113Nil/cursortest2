package o2;

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
import androidx.fragment.app.p0;
import androidx.fragment.app.w0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.oriondriftchasers.arordrft.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o extends LinearLayout {
    public final l A;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f2911f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f2912g;

    /* renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f2913h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f2914j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f2915k;

    /* renamed from: l, reason: collision with root package name */
    public final CheckableImageButton f2916l;

    /* renamed from: m, reason: collision with root package name */
    public final n f2917m;

    /* renamed from: n, reason: collision with root package name */
    public int f2918n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f2919o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f2920p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f2921q;

    /* renamed from: r, reason: collision with root package name */
    public int f2922r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f2923s;

    /* renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f2924t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f2925u;

    /* renamed from: v, reason: collision with root package name */
    public final c1 f2926v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2927w;

    /* renamed from: x, reason: collision with root package name */
    public EditText f2928x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f2929y;

    /* renamed from: z, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f2930z;

    public o(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f2918n = 0;
        this.f2919o = new LinkedHashSet();
        this.A = new l(this);
        m mVar = new m(this);
        this.f2929y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2911f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2912g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f2913h = a2;
        CheckableImageButton a4 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f2916l = a4;
        this.f2917m = new n(this, tVar);
        c1 c1Var = new c1(getContext(), null);
        this.f2926v = c1Var;
        TypedArray typedArray = (TypedArray) tVar.f356c;
        if (typedArray.hasValue(38)) {
            this.i = h.a.u(getContext(), tVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2914j = e2.o.h(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(tVar.n(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setCheckable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f2920p = h.a.u(getContext(), tVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2921q = e2.o.h(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a4.getContentDescription() != (text = typedArray.getText(27))) {
                a4.setContentDescription(text);
            }
            a4.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f2920p = h.a.u(getContext(), tVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f2921q = e2.o.h(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a4.getContentDescription() != text2) {
                a4.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2922r) {
            this.f2922r = dimensionPixelSize;
            a4.setMinimumWidth(dimensionPixelSize);
            a4.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o4 = h.a.o(typedArray.getInt(31, -1));
            this.f2923s = o4;
            a4.setScaleType(o4);
            a2.setScaleType(o4);
        }
        c1Var.setVisibility(8);
        c1Var.setId(R.id.textinput_suffix_text);
        c1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1Var.setAccessibilityLiveRegion(1);
        c1Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c1Var.setTextColor(tVar.m(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f2925u = TextUtils.isEmpty(text3) ? null : text3;
        c1Var.setText(text3);
        n();
        frameLayout.addView(a4);
        addView(c1Var);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f1023k0.add(mVar);
        if (textInputLayout.f1020j != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new p0(3, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (h.a.P(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final p b() {
        p eVar;
        int i = this.f2918n;
        n nVar = this.f2917m;
        SparseArray sparseArray = nVar.f2908a;
        p pVar = (p) sparseArray.get(i);
        if (pVar != null) {
            return pVar;
        }
        o oVar = nVar.f2909b;
        if (i == -1) {
            eVar = new e(oVar, 0);
        } else if (i == 0) {
            eVar = new e(oVar, 1);
        } else if (i == 1) {
            eVar = new v(oVar, nVar.d);
        } else if (i == 2) {
            eVar = new d(oVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(w0.d("Invalid end icon mode: ", i));
            }
            eVar = new k(oVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f2916l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f2926v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f2912g.getVisibility() == 0 && this.f2916l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f2913h.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean z5;
        p b4 = b();
        boolean j4 = b4.j();
        CheckableImageButton checkableImageButton = this.f2916l;
        boolean z6 = true;
        if (!j4 || (z5 = checkableImageButton.i) == b4.k()) {
            z4 = false;
        } else {
            checkableImageButton.setChecked(!z5);
            z4 = true;
        }
        if (!(b4 instanceof k) || (isActivated = checkableImageButton.isActivated()) == ((k) b4).f2899l) {
            z6 = z4;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z6) {
            h.a.Z(this.f2911f, checkableImageButton, this.f2920p);
        }
    }

    public final void g(int i) {
        if (this.f2918n == i) {
            return;
        }
        p b4 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f2930z;
        AccessibilityManager accessibilityManager = this.f2929y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f2930z = null;
        b4.r();
        this.f2918n = i;
        Iterator it = this.f2919o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        p b5 = b();
        int i4 = this.f2917m.f2910c;
        if (i4 == 0) {
            i4 = b5.d();
        }
        Drawable x3 = i4 != 0 ? h.a.x(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.f2916l;
        checkableImageButton.setImageDrawable(x3);
        TextInputLayout textInputLayout = this.f2911f;
        if (x3 != null) {
            h.a.d(textInputLayout, checkableImageButton, this.f2920p, this.f2921q);
            h.a.Z(textInputLayout, checkableImageButton, this.f2920p);
        }
        int c4 = b5.c();
        CharSequence text = c4 != 0 ? getResources().getText(c4) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b5.j());
        if (!b5.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b5.q();
        AccessibilityManager.TouchExplorationStateChangeListener h4 = b5.h();
        this.f2930z = h4;
        if (h4 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f2930z);
        }
        View.OnClickListener f2 = b5.f();
        View.OnLongClickListener onLongClickListener = this.f2924t;
        checkableImageButton.setOnClickListener(f2);
        h.a.h0(checkableImageButton, onLongClickListener);
        EditText editText = this.f2928x;
        if (editText != null) {
            b5.l(editText);
            j(b5);
        }
        h.a.d(textInputLayout, checkableImageButton, this.f2920p, this.f2921q);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.f2916l.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f2911f.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2913h;
        checkableImageButton.setImageDrawable(drawable);
        l();
        h.a.d(this.f2911f, checkableImageButton, this.i, this.f2914j);
    }

    public final void j(p pVar) {
        if (this.f2928x == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f2928x.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f2916l.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void k() {
        this.f2912g.setVisibility((this.f2916l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f2925u == null || this.f2927w) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f2913h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2911f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1032p.f2953q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.f2918n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f2911f;
        if (textInputLayout.f1020j == null) {
            return;
        }
        this.f2926v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1020j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f1020j.getPaddingEnd(), textInputLayout.f1020j.getPaddingBottom());
    }

    public final void n() {
        c1 c1Var = this.f2926v;
        int visibility = c1Var.getVisibility();
        int i = (this.f2925u == null || this.f2927w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        c1Var.setVisibility(i);
        this.f2911f.s();
    }
}
