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
import com.awerser.monnit.betplay.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d40 extends LinearLayout {
    public final TextInputLayout f;
    public final i6 g;
    public CharSequence h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public int l;
    public ImageView.ScaleType m;
    public View.OnLongClickListener n;
    public boolean o;

    public d40(TextInputLayout textInputLayout, r6 r6Var) {
        super(textInputLayout.getContext());
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        i6 i6Var = new i6(getContext(), null);
        this.g = i6Var;
        if (op.D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        j8.O(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        j8.O(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) r6Var.b;
        if (typedArray.hasValue(70)) {
            this.j = op.w(getContext(), r6Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.k = l70.H(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(r6Var.k(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            o8.j("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.l) {
            this.l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType f = j8.f(typedArray.getInt(69, -1));
            this.m = f;
            checkableImageButton.setScaleType(f);
        }
        i6Var.setVisibility(8);
        i6Var.setId(R.id.textinput_prefix_text);
        i6Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        i6Var.setAccessibilityLiveRegion(1);
        i6Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            i6Var.setTextColor(r6Var.j(62));
        }
        CharSequence text = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text) ? null : text;
        i6Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(i6Var);
        checkableImageButton.setOnFocusableChangedListener(new u40(8, this));
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
            j8.W(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.j;
            PorterDuff.Mode mode = this.k;
            TextInputLayout textInputLayout = this.f;
            j8.d(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            j8.K(textInputLayout, checkableImageButton, this.j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        j8.O(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        j8.O(checkableImageButton, null);
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
