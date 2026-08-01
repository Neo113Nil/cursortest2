package Q0;

import M.P;
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
import com.winpower.neonfit.R;
import java.util.WeakHashMap;
import n.C0267c0;

/* loaded from: classes.dex */
public final class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1108a;

    /* renamed from: b, reason: collision with root package name */
    public final C0267c0 f1109b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1110c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1111d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1112f;

    /* renamed from: g, reason: collision with root package name */
    public int f1113g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f1114h;
    public View.OnLongClickListener i;
    public boolean j;

    public z(TextInputLayout textInputLayout, I0.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1108a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1111d = checkableImageButton;
        C0267c0 c0267c0 = new C0267c0(getContext(), null);
        this.f1109b = c0267c0;
        if (H1.d.P(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        H1.l.Z(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        H1.l.Z(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) hVar.f592c;
        if (typedArray.hasValue(69)) {
            this.e = H1.d.B(getContext(), hVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1112f = H0.m.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(hVar.h(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1113g) {
            this.f1113g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType o2 = H1.l.o(typedArray.getInt(68, -1));
            this.f1114h = o2;
            checkableImageButton.setScaleType(o2);
        }
        c0267c0.setVisibility(8);
        c0267c0.setId(R.id.textinput_prefix_text);
        c0267c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = P.f711a;
        c0267c0.setAccessibilityLiveRegion(1);
        c0267c0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0267c0.setTextColor(hVar.g(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1110c = TextUtils.isEmpty(text2) ? null : text2;
        c0267c0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0267c0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f1111d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = P.f711a;
        return this.f1109b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1111d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            PorterDuff.Mode mode = this.f1112f;
            TextInputLayout textInputLayout = this.f1108a;
            H1.l.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            H1.l.R(textInputLayout, checkableImageButton, this.e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        H1.l.Z(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        H1.l.Z(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1111d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f1108a.f2514d;
        if (editText == null) {
            return;
        }
        if (this.f1111d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = P.f711a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = P.f711a;
        this.f1109b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f1110c == null || this.j) ? 8 : 0;
        setVisibility((this.f1111d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1109b.setVisibility(i);
        this.f1108a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
