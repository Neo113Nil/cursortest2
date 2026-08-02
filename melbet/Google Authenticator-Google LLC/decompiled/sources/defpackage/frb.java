package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frb extends LinearLayout {
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private boolean h;

    public frb(TextInputLayout textInputLayout, byo byoVar) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.c = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.a = appCompatTextView;
        if (fny.g(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        i();
        j();
        int[] iArr = fra.a;
        if (byoVar.p(70)) {
            this.e = fny.r(getContext(), byoVar, 70);
        }
        if (byoVar.p(71)) {
            this.f = a.q(byoVar.e(71, -1), null);
        }
        if (byoVar.p(67)) {
            Drawable j = byoVar.j(67);
            checkableImageButton.setImageDrawable(j);
            if (j != null) {
                fhq.n(textInputLayout, checkableImageButton, this.e, this.f);
                f(true);
                d();
            } else {
                f(false);
                i();
                j();
                e(null);
            }
            if (byoVar.p(66)) {
                e(byoVar.l(66));
            }
            checkableImageButton.a(byoVar.o(65, true));
        }
        int d = byoVar.d(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (d != this.g) {
            this.g = d;
            fhq.p(checkableImageButton, d);
        }
        if (byoVar.p(69)) {
            checkableImageButton.setScaleType(fhq.m(byoVar.e(69, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(byoVar.h(61, 0));
        if (byoVar.p(62)) {
            appCompatTextView.setTextColor(byoVar.i(62));
        }
        CharSequence l = byoVar.l(60);
        this.b = true != TextUtils.isEmpty(l) ? l : null;
        appCompatTextView.setText(l);
        k();
        addView(checkableImageButton);
        addView(appCompatTextView);
        checkableImageButton.d = new fqp(this, 2);
    }

    private final void k() {
        int i = 0;
        int i2 = (this.b == null || this.h) ? 8 : 0;
        if (this.c.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.a.setVisibility(i2);
        this.d.D();
    }

    public final int a() {
        int i;
        if (h()) {
            CheckableImageButton checkableImageButton = this.c;
            i = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            i = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + i;
    }

    final CharSequence b() {
        return this.c.getContentDescription();
    }

    public final void c(boolean z) {
        this.h = z;
        k();
    }

    public final void d() {
        fhq.o(this.d, this.c, this.e);
    }

    final void e(CharSequence charSequence) {
        if (b() != charSequence) {
            CheckableImageButton checkableImageButton = this.c;
            checkableImageButton.setContentDescription(charSequence);
            fhq.s(checkableImageButton, charSequence);
        }
    }

    final void f(boolean z) {
        EditText editText;
        if (h() != z) {
            if (!z && this.c.hasFocus() && (editText = this.d.c) != null) {
                editText.requestFocus();
            }
            this.c.setVisibility(true != z ? 8 : 0);
            g();
            k();
        }
    }

    final void g() {
        EditText editText = this.d.c;
        if (editText == null) {
            return;
        }
        this.a.setPaddingRelative(h() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    final boolean h() {
        return this.c.getVisibility() == 0;
    }

    final void i() {
        fhq.q(this.c, null);
    }

    final void j() {
        fhq.r(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        g();
    }
}
