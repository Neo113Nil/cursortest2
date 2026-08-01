package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class x60 extends LinearLayout {
    public final TextInputLayout f;
    public final b6 g;
    public CharSequence h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public int l;
    public ImageView.ScaleType m;
    public View.OnLongClickListener n;
    public boolean o;

    public x60(TextInputLayout textInputLayout, k6 k6Var) {
        super(textInputLayout.getContext());
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        b6 b6Var = new b6(getContext(), null);
        this.g = b6Var;
        if (kr.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        kr.c0(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        kr.c0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) k6Var.g;
        if (typedArray.hasValue(70)) {
            this.j = kr.v(getContext(), k6Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.k = la0.S(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(k6Var.o(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            g9.i("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.l) {
            this.l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType o = kr.o(typedArray.getInt(69, -1));
            this.m = o;
            checkableImageButton.setScaleType(o);
        }
        b6Var.setVisibility(8);
        b6Var.setId(R.id.textinput_prefix_text);
        b6Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        b6Var.setAccessibilityLiveRegion(1);
        b6Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            b6Var.setTextColor(k6Var.n(62));
        }
        CharSequence text = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text) ? null : text;
        b6Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(b6Var);
        checkableImageButton.setOnFocusableChangedListener(new c2(5, this));
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.g.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            kr.h0(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.j;
            PorterDuff.Mode mode = this.k;
            TextInputLayout textInputLayout = this.f;
            kr.a(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            kr.V(textInputLayout, checkableImageButton, this.j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        kr.c0(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        kr.c0(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.i;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.f.j;
        if (editText == null) {
            return;
        }
        this.g.setPaddingRelative(this.i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i = (this.h == null || this.o) ? 8 : 0;
        setVisibility((this.i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.g.setVisibility(i);
        this.f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        e();
    }
}
