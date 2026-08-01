package defpackage;

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
import com.moontiko.really.admiralcasino.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pk extends LinearLayout {
    public final mk A;
    public final TextInputLayout f;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public View.OnLongClickListener k;
    public final CheckableImageButton l;
    public final ok m;
    public int n;
    public final LinkedHashSet o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public CharSequence u;
    public final b6 v;
    public boolean w;
    public EditText x;
    public final AccessibilityManager y;
    public AccessibilityManager.TouchExplorationStateChangeListener z;

    public pk(TextInputLayout textInputLayout, k6 k6Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new mk(this);
        nk nkVar = new nk(this);
        this.y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.h = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.l = a2;
        this.m = new ok(this, k6Var);
        b6 b6Var = new b6(getContext(), null);
        this.v = b6Var;
        TypedArray typedArray = (TypedArray) k6Var.g;
        if (typedArray.hasValue(38)) {
            this.i = kr.v(getContext(), k6Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.j = la0.S(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(k6Var.o(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.p = kr.v(getContext(), k6Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.q = la0.S(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.p = kr.v(getContext(), k6Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.q = la0.S(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            g9.i("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.r) {
            this.r = dimensionPixelSize;
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
            a.setMinimumWidth(dimensionPixelSize);
            a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o = kr.o(typedArray.getInt(31, -1));
            this.s = o;
            a2.setScaleType(o);
            a.setScaleType(o);
        }
        b6Var.setVisibility(8);
        b6Var.setId(R.id.textinput_suffix_text);
        b6Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        b6Var.setAccessibilityLiveRegion(1);
        b6Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            b6Var.setTextColor(k6Var.n(74));
        }
        CharSequence text = typedArray.getText(72);
        this.u = TextUtils.isEmpty(text) ? null : text;
        b6Var.setText(text);
        o();
        frameLayout.addView(a2);
        addView(b6Var);
        addView(frameLayout);
        addView(a);
        a.setOnFocusableChangedListener(new na(this) { // from class: lk
            public final /* synthetic */ pk g;

            {
                this.g = this;
            }

            @Override // defpackage.na
            public final void b() {
                int i3 = i;
                pk pkVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = pkVar.h;
                        kr.h0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = pkVar.l;
                        kr.h0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a2.setOnFocusableChangedListener(new na(this) { // from class: lk
            public final /* synthetic */ pk g;

            {
                this.g = this;
            }

            @Override // defpackage.na
            public final void b() {
                int i3 = i2;
                pk pkVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = pkVar.h;
                        kr.h0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = pkVar.l;
                        kr.h0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.k0.add(nkVar);
        if (textInputLayout.j != null) {
            nkVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new aa(i2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (kr.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final qk b() {
        qk ofVar;
        int i = this.n;
        ok okVar = this.m;
        SparseArray sparseArray = okVar.a;
        qk qkVar = (qk) sparseArray.get(i);
        if (qkVar != null) {
            return qkVar;
        }
        pk pkVar = okVar.b;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                ofVar = new of(pkVar, i2);
            } else if (i == 1) {
                ofVar = new uz(pkVar, okVar.d);
            } else if (i == 2) {
                ofVar = new ob(pkVar);
            } else {
                if (i != 3) {
                    g9.i(f60.e("Invalid end icon mode: ", i));
                    return null;
                }
                ofVar = new si(pkVar);
            }
        } else {
            ofVar = new of(pkVar, 0);
        }
        sparseArray.append(i, ofVar);
        return ofVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.g.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.h.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        qk b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.l;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.i) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof si) || (isActivated = checkableImageButton.isActivated()) == ((si) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            kr.V(this.f, checkableImageButton, this.p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            kr.h0(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        qk b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.z;
        AccessibilityManager accessibilityManager = this.y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.z = null;
        b.r();
        this.n = i;
        Iterator it = this.o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            g9.b();
            return;
        }
        i(i != 0);
        qk b2 = b();
        int i2 = this.m.c;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable m = i2 != 0 ? mz.m(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.l;
        checkableImageButton.setImageDrawable(m);
        TextInputLayout textInputLayout = this.f;
        if (m != null) {
            kr.a(textInputLayout, checkableImageButton, this.p, this.q);
            kr.V(textInputLayout, checkableImageButton, this.p);
        }
        checkableImageButton.setCheckable(b2.j());
        if (!b2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b2.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
        this.z = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.z);
        }
        View.OnClickListener f = b2.f();
        View.OnLongClickListener onLongClickListener = this.t;
        checkableImageButton.setOnClickListener(f);
        kr.c0(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.x;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        kr.a(textInputLayout, checkableImageButton, this.p, this.q);
        f(true);
    }

    public final void i(boolean z) {
        EditText editText;
        if (d() != z) {
            CheckableImageButton checkableImageButton = this.l;
            if (!z && checkableImageButton.hasFocus() && (editText = this.x) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            l();
            n();
            this.f.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        m();
        kr.a(this.f, checkableImageButton, this.i, this.j);
    }

    public final void k(qk qkVar) {
        if (this.x == null) {
            return;
        }
        if (qkVar.e() != null) {
            this.x.setOnFocusChangeListener(qkVar.e());
        }
        if (qkVar.g() != null) {
            this.l.setOnFocusChangeListener(qkVar.g());
        }
    }

    public final void l() {
        this.g.setVisibility((this.l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.u == null || this.w) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.p.q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.f;
        if (textInputLayout.j == null) {
            return;
        }
        this.v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.j.getPaddingEnd(), textInputLayout.j.getPaddingBottom());
    }

    public final void o() {
        b6 b6Var = this.v;
        int visibility = b6Var.getVisibility();
        int i = (this.u == null || this.w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        b6Var.setVisibility(i);
        this.f.s();
    }
}
