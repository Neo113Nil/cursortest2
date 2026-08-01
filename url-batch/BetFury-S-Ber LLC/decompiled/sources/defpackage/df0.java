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
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class df0 extends LinearLayout {
    public final TextInputLayout f;
    public final j6 g;
    public CharSequence h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public int l;
    public ImageView.ScaleType m;
    public View.OnLongClickListener n;
    public boolean o;

    public df0(TextInputLayout textInputLayout, s6 s6Var) {
        super(textInputLayout.getContext());
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        j6 j6Var = new j6(getContext(), null);
        this.g = j6Var;
        if (mv.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        gk0.O(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        gk0.O(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) s6Var.b;
        if (typedArray.hasValue(70)) {
            this.j = mv.q(getContext(), s6Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.k = xc0.b(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(s6Var.j(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            s9.k("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.l) {
            this.l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType j = gk0.j(typedArray.getInt(69, -1));
            this.m = j;
            checkableImageButton.setScaleType(j);
        }
        j6Var.setVisibility(8);
        j6Var.setId(R.id.textinput_prefix_text);
        j6Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        j6Var.setAccessibilityLiveRegion(1);
        j6Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            j6Var.setTextColor(s6Var.i(62));
        }
        CharSequence text = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text) ? null : text;
        j6Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(j6Var);
        checkableImageButton.setOnFocusableChangedListener(new cv(this));
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
            gk0.T(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.j;
            PorterDuff.Mode mode = this.k;
            TextInputLayout textInputLayout = this.f;
            gk0.a(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            gk0.I(textInputLayout, checkableImageButton, this.j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        gk0.O(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        gk0.O(checkableImageButton, null);
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
