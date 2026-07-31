package z5;

import a0.g1;
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
import com.snovikpovik.vuevnxsj.R;
import l.j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f9271d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f9272e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f9273f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f9274g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f9275h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public int f9276j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView.ScaleType f9277k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnLongClickListener f9278l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9279m;

    public t(TextInputLayout textInputLayout, g1 g1Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f9271d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f9274g = checkableImageButton;
        j0 j0Var = new j0(getContext(), null);
        this.f9272e = j0Var;
        if (r2.o.U(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f9278l;
        checkableImageButton.setOnClickListener(null);
        r2.r.W(checkableImageButton, onLongClickListener);
        this.f9278l = null;
        checkableImageButton.setOnLongClickListener(null);
        r2.r.W(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) g1Var.f85c;
        if (typedArray.hasValue(70)) {
            this.f9275h = r2.o.B(getContext(), g1Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.i = r5.k.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(g1Var.q(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f9276j) {
            this.f9276j = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType s5 = r2.r.s(typedArray.getInt(69, -1));
            this.f9277k = s5;
            checkableImageButton.setScaleType(s5);
        }
        j0Var.setVisibility(8);
        j0Var.setId(R.id.textinput_prefix_text);
        j0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        j0Var.setAccessibilityLiveRegion(1);
        j0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            j0Var.setTextColor(g1Var.p(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f9273f = TextUtils.isEmpty(text2) ? null : text2;
        j0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(j0Var);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f9274g;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.f9272e.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9274g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f9275h;
            PorterDuff.Mode mode = this.i;
            TextInputLayout textInputLayout = this.f9271d;
            r2.r.g(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            r2.r.O(textInputLayout, checkableImageButton, this.f9275h);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f9278l;
        checkableImageButton.setOnClickListener(null);
        r2.r.W(checkableImageButton, onLongClickListener);
        this.f9278l = null;
        checkableImageButton.setOnLongClickListener(null);
        r2.r.W(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.f9274g;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f9271d.f1974h;
        if (editText == null) {
            return;
        }
        this.f9272e.setPaddingRelative(this.f9274g.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.f9273f == null || this.f9279m) ? 8 : 0;
        setVisibility((this.f9274g.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f9272e.setVisibility(i);
        this.f9271d.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        d();
    }
}
