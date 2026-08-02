package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqs extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final fqr n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final kee t;

    public fqs(TextInputLayout textInputLayout, byo byoVar) {
        super(textInputLayout.getContext());
        int i = 0;
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new fqq(this);
        kee keeVar = new kee(this);
        this.t = keeVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton u = u(this, from, R.id.text_input_error_icon);
        this.b = u;
        CheckableImageButton u2 = u(frameLayout, from, R.id.text_input_end_icon);
        this.d = u2;
        this.n = new fqr(this, byoVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = fra.a;
        if (byoVar.p(38)) {
            this.c = fny.r(getContext(), byoVar, 38);
        }
        if (byoVar.p(39)) {
            this.m = a.q(byoVar.e(39, -1), null);
        }
        if (byoVar.p(37)) {
            n(byoVar.j(37));
        }
        u.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        u.setImportantForAccessibility(2);
        u.setClickable(false);
        u.c = false;
        u.a(false);
        u.setFocusable(false);
        if (!byoVar.p(54)) {
            if (byoVar.p(32)) {
                this.f = fny.r(getContext(), byoVar, 32);
            }
            if (byoVar.p(33)) {
                this.g = a.q(byoVar.e(33, -1), null);
            }
        }
        int i2 = 1;
        if (byoVar.p(30)) {
            l(byoVar.e(30, 0));
            if (byoVar.p(27)) {
                k(byoVar.l(27));
            }
            j(byoVar.o(26, true));
        } else if (byoVar.p(54)) {
            if (byoVar.p(55)) {
                this.f = fny.r(getContext(), byoVar, 55);
            }
            if (byoVar.p(56)) {
                this.g = a.q(byoVar.e(56, -1), null);
            }
            l(byoVar.o(54, false) ? 1 : 0);
            k(byoVar.l(52));
        }
        int d = byoVar.d(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (d != this.p) {
            this.p = d;
            fhq.p(u2, d);
            fhq.p(u, d);
        }
        if (byoVar.p(31)) {
            ImageView.ScaleType m = fhq.m(byoVar.e(31, -1));
            u2.setScaleType(m);
            u.setScaleType(m);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(byoVar.h(73, 0));
        if (byoVar.p(74)) {
            appCompatTextView.setTextColor(byoVar.i(74));
        }
        CharSequence l = byoVar.l(72);
        this.h = true != TextUtils.isEmpty(l) ? l : null;
        appCompatTextView.setText(l);
        w();
        frameLayout.addView(u2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(u);
        u.d = new fqp(this, i2);
        u2.d = new fqp(this, i);
        textInputLayout.n.add(keeVar);
        if (textInputLayout.c != null) {
            keeVar.g(textInputLayout);
        }
        addOnAttachStateChangeListener(new fu(this, 6));
    }

    private final CheckableImageButton u(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (fny.g(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void v() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || t()) ? 8 : 0);
        boolean z = (this.h == null || this.q) ? 8 : false;
        if (!s() && !t() && z) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void w() {
        TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        v();
        textView.setVisibility(i);
        this.a.D();
    }

    public final int a() {
        int marginStart;
        if (s() || t()) {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final fqt c() {
        int i = this.e;
        fqr fqrVar = this.n;
        SparseArray sparseArray = fqrVar.a;
        fqt fqtVar = (fqt) sparseArray.get(i);
        if (fqtVar == null) {
            if (i == -1) {
                fqtVar = new fqf(fqrVar.b);
            } else if (i == 0) {
                fqtVar = new fqt(fqrVar.b);
            } else if (i == 1) {
                fqtVar = new fqz(fqrVar.b, fqrVar.d);
            } else if (i == 2) {
                fqtVar = new fqe(fqrVar.b);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(a.Y(i, "Invalid end icon mode: "));
                }
                fqtVar = new fqo(fqrVar.b);
            }
            sparseArray.append(i, fqtVar);
        }
        return fqtVar;
    }

    final CharSequence d() {
        return this.d.getContentDescription();
    }

    public final void e() {
        AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void f(boolean z) {
        this.q = z;
        w();
    }

    public final void g() {
        fhq.o(this.a, this.d, this.f);
    }

    final void h(boolean z) {
        CheckableImageButton checkableImageButton;
        boolean isActivated;
        CheckableImageButton checkableImageButton2;
        boolean z2;
        fqt c = c();
        boolean z3 = false;
        boolean z4 = true;
        if (c.s() && (z2 = (checkableImageButton2 = this.d).a) != c.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!c.q() || (isActivated = (checkableImageButton = this.d).isActivated()) == c.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            g();
        }
    }

    public final void i() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void j(boolean z) {
        this.d.a(z);
    }

    final void k(CharSequence charSequence) {
        if (d() != charSequence) {
            CheckableImageButton checkableImageButton = this.d;
            checkableImageButton.setContentDescription(charSequence);
            fhq.s(checkableImageButton, charSequence);
        }
    }

    final void l(int i) {
        if (this.e == i) {
            return;
        }
        fqt c = c();
        i();
        this.s = null;
        c.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((frf) it.next()).a();
        }
        m(i != 0);
        fqt c2 = c();
        int i2 = this.n.c;
        if (i2 == 0) {
            i2 = c2.b();
        }
        Drawable f = i2 != 0 ? e.f(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(f);
        if (f != null) {
            fhq.n(this.a, checkableImageButton, this.f, this.g);
            g();
        }
        j(c2.s());
        TextInputLayout textInputLayout = this.a;
        int i3 = textInputLayout.m;
        if (!c2.o(i3)) {
            throw new IllegalStateException(a.af(i, i3, "The current box background mode ", " is not supported by the end icon mode "));
        }
        c2.i();
        this.s = c2.A();
        e();
        fhq.q(checkableImageButton, c2.c());
        int a = c2.a();
        k(a != 0 ? getResources().getText(a) : null);
        EditText editText = this.j;
        if (editText != null) {
            c2.g(editText);
            o(c2);
        }
        fhq.n(textInputLayout, checkableImageButton, this.f, this.g);
        h(true);
    }

    public final void m(boolean z) {
        EditText editText;
        if (s() != z) {
            if (!z && this.d.hasFocus() && (editText = this.j) != null) {
                editText.requestFocus();
            }
            this.d.setVisibility(true != z ? 8 : 0);
            v();
            q();
            this.a.D();
        }
    }

    final void n(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        p();
        fhq.n(this.a, checkableImageButton, this.c, this.m);
    }

    public final void o(fqt fqtVar) {
        EditText editText = this.j;
        if (editText == null) {
            return;
        }
        if (fqtVar.d() != null) {
            editText.setOnFocusChangeListener(fqtVar.d());
        }
        if (fqtVar.e() != null) {
            this.d.setOnFocusChangeListener(fqtVar.e());
        }
    }

    public final void p() {
        CheckableImageButton checkableImageButton = this.b;
        int i = 8;
        if (checkableImageButton.getDrawable() != null) {
            TextInputLayout textInputLayout = this.a;
            if (textInputLayout.d.g && textInputLayout.C()) {
                i = 0;
            }
        }
        checkableImageButton.setVisibility(i);
        v();
        q();
        if (r()) {
            return;
        }
        this.a.D();
    }

    public final void q() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c == null) {
            return;
        }
        int i = 0;
        if (!s() && !t()) {
            i = textInputLayout.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c.getPaddingTop(), i, textInputLayout.c.getPaddingBottom());
    }

    public final boolean r() {
        return this.e != 0;
    }

    public final boolean s() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean t() {
        return this.b.getVisibility() == 0;
    }
}
