package s2;

import a.g0;
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
import com.gdmhkmf.belbet.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f3337f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f3338g;
    public CharSequence h;
    public final CheckableImageButton i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3339j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f3340k;

    /* renamed from: l, reason: collision with root package name */
    public int f3341l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f3342m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnLongClickListener f3343n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3344o;

    public w(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        super(textInputLayout.getContext());
        this.f3337f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        z0 z0Var = new z0(getContext(), null);
        this.f3338g = z0Var;
        if (b4.l.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3343n;
        checkableImageButton.setOnClickListener(null);
        r1.b.A(checkableImageButton, onLongClickListener);
        this.f3343n = null;
        checkableImageButton.setOnLongClickListener(null);
        r1.b.A(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) tVar.f473b;
        if (typedArray.hasValue(70)) {
            this.f3339j = b4.l.s(getContext(), tVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f3340k = i2.o.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(tVar.d(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3341l) {
            this.f3341l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType g3 = r1.b.g(typedArray.getInt(69, -1));
            this.f3342m = g3;
            checkableImageButton.setScaleType(g3);
        }
        z0Var.setVisibility(8);
        z0Var.setId(R.id.textinput_prefix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        z0Var.setAccessibilityLiveRegion(1);
        z0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            z0Var.setTextColor(tVar.c(62));
        }
        CharSequence text = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text) ? null : text;
        z0Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(z0Var);
        checkableImageButton.setOnFocusableChangedListener(new g0(6, this));
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.f3338g.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            r1.b.E(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3339j;
            PorterDuff.Mode mode = this.f3340k;
            TextInputLayout textInputLayout = this.f3337f;
            r1.b.a(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            r1.b.x(textInputLayout, checkableImageButton, this.f3339j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.f3343n;
        checkableImageButton.setOnClickListener(null);
        r1.b.A(checkableImageButton, onLongClickListener);
        this.f3343n = null;
        checkableImageButton.setOnLongClickListener(null);
        r1.b.A(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z4) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.i;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            if (!z4 && checkableImageButton.hasFocus() && (editText = this.f3337f.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.f3337f.f1209j;
        if (editText == null) {
            return;
        }
        this.f3338g.setPaddingRelative(this.i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i = (this.h == null || this.f3344o) ? 8 : 0;
        setVisibility((this.i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f3338g.setVisibility(i);
        this.f3337f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        e();
    }
}
