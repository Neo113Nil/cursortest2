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
import com.awerser.monnit.betplay.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ci extends LinearLayout {
    public final zh A;
    public final TextInputLayout f;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public View.OnLongClickListener k;
    public final CheckableImageButton l;
    public final bi m;
    public int n;
    public final LinkedHashSet o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public CharSequence u;
    public final i6 v;
    public boolean w;
    public EditText x;
    public final AccessibilityManager y;
    public AccessibilityManager.TouchExplorationStateChangeListener z;

    public ci(TextInputLayout textInputLayout, r6 r6Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new zh(this);
        ai aiVar = new ai(this);
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
        this.m = new bi(this, r6Var);
        i6 i6Var = new i6(getContext(), null);
        this.v = i6Var;
        TypedArray typedArray = (TypedArray) r6Var.b;
        if (typedArray.hasValue(38)) {
            this.i = op.w(getContext(), r6Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.j = l70.H(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(r6Var.k(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.p = op.w(getContext(), r6Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.q = l70.H(typedArray.getInt(33, -1), null);
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
                this.p = op.w(getContext(), r6Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.q = l70.H(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            o8.j("endIconSize cannot be less than 0");
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
            ImageView.ScaleType f = j8.f(typedArray.getInt(31, -1));
            this.s = f;
            a2.setScaleType(f);
            a.setScaleType(f);
        }
        i6Var.setVisibility(8);
        i6Var.setId(R.id.textinput_suffix_text);
        i6Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        i6Var.setAccessibilityLiveRegion(1);
        i6Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            i6Var.setTextColor(r6Var.j(74));
        }
        CharSequence text = typedArray.getText(72);
        this.u = TextUtils.isEmpty(text) ? null : text;
        i6Var.setText(text);
        o();
        frameLayout.addView(a2);
        addView(i6Var);
        addView(frameLayout);
        addView(a);
        a.setOnFocusableChangedListener(new y9(this) { // from class: yh
            public final /* synthetic */ ci g;

            {
                this.g = this;
            }

            @Override // defpackage.y9
            public final void b() {
                int i3 = i;
                ci ciVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = ciVar.h;
                        j8.W(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = ciVar.l;
                        j8.W(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a2.setOnFocusableChangedListener(new y9(this) { // from class: yh
            public final /* synthetic */ ci g;

            {
                this.g = this;
            }

            @Override // defpackage.y9
            public final void b() {
                int i3 = i2;
                ci ciVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = ciVar.h;
                        j8.W(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = ciVar.l;
                        j8.W(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.k0.add(aiVar);
        if (textInputLayout.j != null) {
            aiVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new i9(i2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (op.D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final di b() {
        di aeVar;
        int i = this.n;
        bi biVar = this.m;
        SparseArray sparseArray = biVar.a;
        di diVar = (di) sparseArray.get(i);
        if (diVar != null) {
            return diVar;
        }
        ci ciVar = biVar.b;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                aeVar = new ae(ciVar, i2);
            } else if (i == 1) {
                aeVar = new dx(ciVar, biVar.d);
            } else if (i == 2) {
                aeVar = new xa(ciVar);
            } else {
                if (i != 3) {
                    o8.j(o30.e("Invalid end icon mode: ", i));
                    return null;
                }
                aeVar = new jg(ciVar);
            }
        } else {
            aeVar = new ae(ciVar, 0);
        }
        sparseArray.append(i, aeVar);
        return aeVar;
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
        di b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.l;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.i) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof jg) || (isActivated = checkableImageButton.isActivated()) == ((jg) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            j8.K(this.f, checkableImageButton, this.p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            j8.W(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        di b = b();
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
            o8.c();
            return;
        }
        i(i != 0);
        di b2 = b();
        int i2 = this.m.c;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable p = i2 != 0 ? l70.p(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.l;
        checkableImageButton.setImageDrawable(p);
        TextInputLayout textInputLayout = this.f;
        if (p != null) {
            j8.d(textInputLayout, checkableImageButton, this.p, this.q);
            j8.K(textInputLayout, checkableImageButton, this.p);
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
        j8.O(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.x;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        j8.d(textInputLayout, checkableImageButton, this.p, this.q);
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
        j8.d(this.f, checkableImageButton, this.i, this.j);
    }

    public final void k(di diVar) {
        if (this.x == null) {
            return;
        }
        if (diVar.e() != null) {
            this.x.setOnFocusChangeListener(diVar.e());
        }
        if (diVar.g() != null) {
            this.l.setOnFocusChangeListener(diVar.g());
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
        i6 i6Var = this.v;
        int visibility = i6Var.getVisibility();
        int i = (this.u == null || this.w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        i6Var.setVisibility(i);
        this.f.s();
    }
}
