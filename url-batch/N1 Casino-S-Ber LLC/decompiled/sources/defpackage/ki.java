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
import com.derinko.gbini.n1casino.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ki extends LinearLayout {
    public final hi A;
    public final TextInputLayout f;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public View.OnLongClickListener k;
    public final CheckableImageButton l;
    public final ji m;
    public int n;
    public final LinkedHashSet o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public CharSequence u;
    public final r5 v;
    public boolean w;
    public EditText x;
    public final AccessibilityManager y;
    public AccessibilityManager.TouchExplorationStateChangeListener z;

    public ki(TextInputLayout textInputLayout, a6 a6Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new hi(this);
        ii iiVar = new ii(this);
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
        this.m = new ji(this, a6Var);
        r5 r5Var = new r5(getContext(), null);
        this.v = r5Var;
        TypedArray typedArray = (TypedArray) a6Var.b;
        if (typedArray.hasValue(38)) {
            this.i = e70.x(getContext(), a6Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.j = u90.b(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(a6Var.k(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.p = e70.x(getContext(), a6Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.q = u90.b(typedArray.getInt(33, -1), null);
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
                this.p = e70.x(getContext(), a6Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.q = u90.b(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            t8.k("endIconSize cannot be less than 0");
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
            ImageView.ScaleType p = jw.p(typedArray.getInt(31, -1));
            this.s = p;
            a2.setScaleType(p);
            a.setScaleType(p);
        }
        r5Var.setVisibility(8);
        r5Var.setId(R.id.textinput_suffix_text);
        r5Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        r5Var.setAccessibilityLiveRegion(1);
        r5Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            r5Var.setTextColor(a6Var.j(74));
        }
        CharSequence text = typedArray.getText(72);
        this.u = TextUtils.isEmpty(text) ? null : text;
        r5Var.setText(text);
        o();
        frameLayout.addView(a2);
        addView(r5Var);
        addView(frameLayout);
        addView(a);
        a.setOnFocusableChangedListener(new aa(this) { // from class: gi
            public final /* synthetic */ ki g;

            {
                this.g = this;
            }

            @Override // defpackage.aa
            public final void b() {
                int i3 = i;
                ki kiVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = kiVar.h;
                        jw.e0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = kiVar.l;
                        jw.e0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a2.setOnFocusableChangedListener(new aa(this) { // from class: gi
            public final /* synthetic */ ki g;

            {
                this.g = this;
            }

            @Override // defpackage.aa
            public final void b() {
                int i3 = i2;
                ki kiVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = kiVar.h;
                        jw.e0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = kiVar.l;
                        jw.e0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.k0.add(iiVar);
        if (textInputLayout.j != null) {
            iiVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n9(i2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (e70.D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final li b() {
        li aeVar;
        int i = this.n;
        ji jiVar = this.m;
        SparseArray sparseArray = jiVar.a;
        li liVar = (li) sparseArray.get(i);
        if (liVar != null) {
            return liVar;
        }
        ki kiVar = jiVar.b;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                aeVar = new ae(kiVar, i2);
            } else if (i == 1) {
                aeVar = new qw(kiVar, jiVar.d);
            } else if (i == 2) {
                aeVar = new ua(kiVar);
            } else {
                if (i != 3) {
                    t8.k(d30.e("Invalid end icon mode: ", i));
                    return null;
                }
                aeVar = new rg(kiVar);
            }
        } else {
            aeVar = new ae(kiVar, 0);
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
        li b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.l;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.i) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof rg) || (isActivated = checkableImageButton.isActivated()) == ((rg) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            jw.W(this.f, checkableImageButton, this.p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            jw.e0(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        li b = b();
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
            t8.c();
            return;
        }
        i(i != 0);
        li b2 = b();
        int i2 = this.m.c;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable s = i2 != 0 ? zo.s(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.l;
        checkableImageButton.setImageDrawable(s);
        TextInputLayout textInputLayout = this.f;
        if (s != null) {
            jw.g(textInputLayout, checkableImageButton, this.p, this.q);
            jw.W(textInputLayout, checkableImageButton, this.p);
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
        jw.a0(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.x;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        jw.g(textInputLayout, checkableImageButton, this.p, this.q);
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
        jw.g(this.f, checkableImageButton, this.i, this.j);
    }

    public final void k(li liVar) {
        if (this.x == null) {
            return;
        }
        if (liVar.e() != null) {
            this.x.setOnFocusChangeListener(liVar.e());
        }
        if (liVar.g() != null) {
            this.l.setOnFocusChangeListener(liVar.g());
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
        r5 r5Var = this.v;
        int visibility = r5Var.getVisibility();
        int i = (this.u == null || this.w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        r5Var.setVisibility(i);
        this.f.s();
    }
}
