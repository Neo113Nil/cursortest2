package K0;

import K.X;
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
import com.luckyarcade.spinthrow.R;
import java.util.WeakHashMap;
import l.C0257d0;

/* loaded from: classes.dex */
public final class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f643a;

    /* renamed from: b, reason: collision with root package name */
    public final C0257d0 f644b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f645c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f646d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f647e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f648f;

    /* renamed from: g, reason: collision with root package name */
    public int f649g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f650j;

    public z(TextInputLayout textInputLayout, T.r rVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f643a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f646d = checkableImageButton;
        C0257d0 c0257d0 = new C0257d0(getContext(), null);
        this.f644b = c0257d0;
        if (q1.d.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        q1.l.p0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        q1.l.p0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) rVar.f812c;
        if (typedArray.hasValue(69)) {
            this.f647e = q1.d.x(getContext(), rVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f648f = B0.o.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(rVar.h(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f649g) {
            this.f649g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType n2 = q1.l.n(typedArray.getInt(68, -1));
            this.h = n2;
            checkableImageButton.setScaleType(n2);
        }
        c0257d0.setVisibility(8);
        c0257d0.setId(R.id.textinput_prefix_text);
        c0257d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = X.f419a;
        c0257d0.setAccessibilityLiveRegion(1);
        c0257d0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0257d0.setTextColor(rVar.g(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f645c = TextUtils.isEmpty(text2) ? null : text2;
        c0257d0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0257d0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f646d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = X.f419a;
        return this.f644b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f646d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f647e;
            PorterDuff.Mode mode = this.f648f;
            TextInputLayout textInputLayout = this.f643a;
            q1.l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            q1.l.c0(textInputLayout, checkableImageButton, this.f647e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        q1.l.p0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        q1.l.p0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f646d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f643a.f1986d;
        if (editText == null) {
            return;
        }
        if (this.f646d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = X.f419a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = X.f419a;
        this.f644b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f645c == null || this.f650j) ? 8 : 0;
        setVisibility((this.f646d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f644b.setVisibility(i);
        this.f643a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
