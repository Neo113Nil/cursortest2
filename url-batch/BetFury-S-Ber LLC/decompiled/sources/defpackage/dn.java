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
import com.trembin.nirefon.betfury.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dn extends LinearLayout {
    public final an A;
    public final TextInputLayout f;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public View.OnLongClickListener k;
    public final CheckableImageButton l;
    public final cn m;
    public int n;
    public final LinkedHashSet o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public CharSequence u;
    public final j6 v;
    public boolean w;
    public EditText x;
    public final AccessibilityManager y;
    public AccessibilityManager.TouchExplorationStateChangeListener z;

    public dn(TextInputLayout textInputLayout, s6 s6Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new an(this);
        bn bnVar = new bn(this);
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
        this.m = new cn(this, s6Var);
        j6 j6Var = new j6(getContext(), null);
        this.v = j6Var;
        TypedArray typedArray = (TypedArray) s6Var.b;
        if (typedArray.hasValue(38)) {
            this.i = mv.q(getContext(), s6Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.j = xc0.b(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(s6Var.j(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.p = mv.q(getContext(), s6Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.q = xc0.b(typedArray.getInt(33, -1), null);
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
                this.p = mv.q(getContext(), s6Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.q = xc0.b(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            s9.k("endIconSize cannot be less than 0");
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
            ImageView.ScaleType j = gk0.j(typedArray.getInt(31, -1));
            this.s = j;
            a2.setScaleType(j);
            a.setScaleType(j);
        }
        j6Var.setVisibility(8);
        j6Var.setId(R.id.textinput_suffix_text);
        j6Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        j6Var.setAccessibilityLiveRegion(1);
        j6Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            j6Var.setTextColor(s6Var.i(74));
        }
        CharSequence text = typedArray.getText(72);
        this.u = TextUtils.isEmpty(text) ? null : text;
        j6Var.setText(text);
        o();
        frameLayout.addView(a2);
        addView(j6Var);
        addView(frameLayout);
        addView(a);
        a.setOnFocusableChangedListener(new hb(this) { // from class: zm
            public final /* synthetic */ dn g;

            {
                this.g = this;
            }

            @Override // defpackage.hb
            public final void a() {
                int i3 = i;
                dn dnVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = dnVar.h;
                        gk0.T(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = dnVar.l;
                        gk0.T(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a2.setOnFocusableChangedListener(new hb(this) { // from class: zm
            public final /* synthetic */ dn g;

            {
                this.g = this;
            }

            @Override // defpackage.hb
            public final void a() {
                int i3 = i2;
                dn dnVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = dnVar.h;
                        gk0.T(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = dnVar.l;
                        gk0.T(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.k0.add(bnVar);
        if (textInputLayout.j != null) {
            bnVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ta(i2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (mv.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final en b() {
        en mhVar;
        int i = this.n;
        cn cnVar = this.m;
        SparseArray sparseArray = cnVar.a;
        en enVar = (en) sparseArray.get(i);
        if (enVar != null) {
            return enVar;
        }
        dn dnVar = cnVar.b;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                mhVar = new mh(dnVar, i2);
            } else if (i == 1) {
                mhVar = new l50(dnVar, cnVar.d);
            } else if (i == 2) {
                mhVar = new lc(dnVar);
            } else {
                if (i != 3) {
                    s9.k(r7.b("Invalid end icon mode: ", i));
                    return null;
                }
                mhVar = new dl(dnVar);
            }
        } else {
            mhVar = new mh(dnVar, 0);
        }
        sparseArray.append(i, mhVar);
        return mhVar;
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
        en b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.l;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.i) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof dl) || (isActivated = checkableImageButton.isActivated()) == ((dl) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            gk0.I(this.f, checkableImageButton, this.p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            gk0.T(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        en b = b();
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
            s9.c();
            return;
        }
        i(i != 0);
        en b2 = b();
        int i2 = this.m.c;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable v = i2 != 0 ? d50.v(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.l;
        checkableImageButton.setImageDrawable(v);
        TextInputLayout textInputLayout = this.f;
        if (v != null) {
            gk0.a(textInputLayout, checkableImageButton, this.p, this.q);
            gk0.I(textInputLayout, checkableImageButton, this.p);
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
        gk0.O(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.x;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        gk0.a(textInputLayout, checkableImageButton, this.p, this.q);
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
        gk0.a(this.f, checkableImageButton, this.i, this.j);
    }

    public final void k(en enVar) {
        if (this.x == null) {
            return;
        }
        if (enVar.e() != null) {
            this.x.setOnFocusChangeListener(enVar.e());
        }
        if (enVar.g() != null) {
            this.l.setOnFocusChangeListener(enVar.g());
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
        j6 j6Var = this.v;
        int visibility = j6Var.getVisibility();
        int i = (this.u == null || this.w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        j6Var.setVisibility(i);
        this.f.s();
    }
}
