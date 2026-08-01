package o2;

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
import com.oriondriftchasers.arordrft.R;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f2977f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f2978g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2979h;
    public final CheckableImageButton i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2980j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2981k;

    /* renamed from: l, reason: collision with root package name */
    public int f2982l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f2983m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnLongClickListener f2984n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2985o;

    public w(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f2977f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        c1 c1Var = new c1(getContext(), null);
        this.f2978g = c1Var;
        if (h.a.P(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f2984n;
        checkableImageButton.setOnClickListener(null);
        h.a.h0(checkableImageButton, onLongClickListener);
        this.f2984n = null;
        checkableImageButton.setOnLongClickListener(null);
        h.a.h0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) tVar.f356c;
        if (typedArray.hasValue(70)) {
            this.f2980j = h.a.u(getContext(), tVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f2981k = e2.o.h(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(tVar.n(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2982l) {
            this.f2982l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType o4 = h.a.o(typedArray.getInt(69, -1));
            this.f2983m = o4;
            checkableImageButton.setScaleType(o4);
        }
        c1Var.setVisibility(8);
        c1Var.setId(R.id.textinput_prefix_text);
        c1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c1Var.setAccessibilityLiveRegion(1);
        c1Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c1Var.setTextColor(tVar.m(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f2979h = TextUtils.isEmpty(text2) ? null : text2;
        c1Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c1Var);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.f2978g.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2980j;
            PorterDuff.Mode mode = this.f2981k;
            TextInputLayout textInputLayout = this.f2977f;
            h.a.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            h.a.Z(textInputLayout, checkableImageButton, this.f2980j);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f2984n;
        checkableImageButton.setOnClickListener(null);
        h.a.h0(checkableImageButton, onLongClickListener);
        this.f2984n = null;
        checkableImageButton.setOnLongClickListener(null);
        h.a.h0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.i;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f2977f.f1020j;
        if (editText == null) {
            return;
        }
        this.f2978g.setPaddingRelative(this.i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.f2979h == null || this.f2985o) ? 8 : 0;
        setVisibility((this.i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f2978g.setVisibility(i);
        this.f2977f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        d();
    }
}
