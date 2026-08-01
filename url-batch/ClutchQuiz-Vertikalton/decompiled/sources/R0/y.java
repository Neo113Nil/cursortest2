package R0;

import K.C0012m;
import K.S;
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
import com.clutchquizarena.app.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import l.C0204b0;

/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f756a;

    /* renamed from: b, reason: collision with root package name */
    public final C0204b0 f757b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f758c;
    public final CheckableImageButton d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f759e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f760f;

    /* renamed from: g, reason: collision with root package name */
    public int f761g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f762j;

    public y(TextInputLayout textInputLayout, C0012m c0012m) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f756a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        C0204b0 c0204b0 = new C0204b0(getContext(), null);
        this.f757b = c0204b0;
        if (A.c.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        A.c.C0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        A.c.C0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0012m.f423c;
        if (typedArray.hasValue(69)) {
            this.f759e = A.c.G(getContext(), c0012m, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f760f = I0.k.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0012m.h(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f761g) {
            this.f761g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType q2 = A.c.q(typedArray.getInt(68, -1));
            this.h = q2;
            checkableImageButton.setScaleType(q2);
        }
        c0204b0.setVisibility(8);
        c0204b0.setId(R.id.textinput_prefix_text);
        c0204b0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = S.f365a;
        c0204b0.setAccessibilityLiveRegion(1);
        c0204b0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0204b0.setTextColor(c0012m.g(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f758c = TextUtils.isEmpty(text2) ? null : text2;
        c0204b0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0204b0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = S.f365a;
        return this.f757b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f759e;
            PorterDuff.Mode mode = this.f760f;
            TextInputLayout textInputLayout = this.f756a;
            A.c.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            A.c.t0(textInputLayout, checkableImageButton, this.f759e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        A.c.C0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        A.c.C0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f756a.d;
        if (editText == null) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = S.f365a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = S.f365a;
        this.f757b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f758c == null || this.f762j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f757b.setVisibility(i);
        this.f756a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
