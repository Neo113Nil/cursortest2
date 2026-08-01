package j2;

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
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a0 extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f2287f;
    public final z0 g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f2288i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2289j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2290k;

    /* renamed from: l, reason: collision with root package name */
    public int f2291l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f2292m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnLongClickListener f2293n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2294o;

    public a0(TextInputLayout textInputLayout, androidx.emoji2.text.s sVar) {
        super(textInputLayout.getContext());
        this.f2287f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2288i = checkableImageButton;
        z0 z0Var = new z0(getContext(), null);
        this.g = z0Var;
        if (k3.m.E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f2293n;
        checkableImageButton.setOnClickListener(null);
        k3.d.e0(checkableImageButton, onLongClickListener);
        this.f2293n = null;
        checkableImageButton.setOnLongClickListener(null);
        k3.d.e0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) sVar.c;
        if (typedArray.hasValue(70)) {
            this.f2289j = k3.m.v(getContext(), sVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f2290k = a2.p.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(sVar.i(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2291l) {
            this.f2291l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType o4 = k3.d.o(typedArray.getInt(69, -1));
            this.f2292m = o4;
            checkableImageButton.setScaleType(o4);
        }
        z0Var.setVisibility(8);
        z0Var.setId(R.id.textinput_prefix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        z0Var.setAccessibilityLiveRegion(1);
        z0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            z0Var.setTextColor(sVar.h(62));
        }
        CharSequence text = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text) ? null : text;
        z0Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(z0Var);
        checkableImageButton.setOnFocusableChangedListener(new z(this));
    }

    public final int a() {
        int i4;
        CheckableImageButton checkableImageButton = this.f2288i;
        if (checkableImageButton.getVisibility() == 0) {
            i4 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i4 = 0;
        }
        return this.g.getPaddingStart() + getPaddingStart() + i4;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2288i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            k3.d.k0(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2288i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2289j;
            PorterDuff.Mode mode = this.f2290k;
            TextInputLayout textInputLayout = this.f2287f;
            k3.d.b(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            k3.d.W(textInputLayout, checkableImageButton, this.f2289j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.f2293n;
        checkableImageButton.setOnClickListener(null);
        k3.d.e0(checkableImageButton, onLongClickListener);
        this.f2293n = null;
        checkableImageButton.setOnLongClickListener(null);
        k3.d.e0(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z3) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f2288i;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            if (!z3 && checkableImageButton.hasFocus() && (editText = this.f2287f.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.f2287f.f1402j;
        if (editText == null) {
            return;
        }
        this.g.setPaddingRelative(this.f2288i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i4 = (this.h == null || this.f2294o) ? 8 : 0;
        setVisibility((this.f2288i.getVisibility() == 0 || i4 == 0) ? 0 : 8);
        this.g.setVisibility(i4);
        this.f2287f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        e();
    }
}
