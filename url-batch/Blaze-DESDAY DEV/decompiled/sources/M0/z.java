package M0;

import K.C0014l;
import K.T;
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
import com.winworm.neongrid.R;
import java.util.WeakHashMap;
import l.C0204c0;

/* loaded from: classes.dex */
public final class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f687a;

    /* renamed from: b, reason: collision with root package name */
    public final C0204c0 f688b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f689c;
    public final CheckableImageButton d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f690e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f691f;

    /* renamed from: g, reason: collision with root package name */
    public int f692g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f693j;

    public z(TextInputLayout textInputLayout, C0014l c0014l) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f687a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        C0204c0 c0204c0 = new C0204c0(getContext(), null);
        this.f688b = c0204c0;
        if (z1.l.F(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        z1.l.W(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        z1.l.W(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0014l.f492b;
        if (typedArray.hasValue(69)) {
            this.f690e = z1.l.s(getContext(), c0014l, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f691f = D0.n.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0014l.c(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f692g) {
            this.f692g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType k2 = z1.l.k(typedArray.getInt(68, -1));
            this.h = k2;
            checkableImageButton.setScaleType(k2);
        }
        c0204c0.setVisibility(8);
        c0204c0.setId(R.id.textinput_prefix_text);
        c0204c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = T.f440a;
        c0204c0.setAccessibilityLiveRegion(1);
        c0204c0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0204c0.setTextColor(c0014l.b(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f689c = TextUtils.isEmpty(text2) ? null : text2;
        c0204c0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0204c0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = T.f440a;
        return this.f688b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f690e;
            PorterDuff.Mode mode = this.f691f;
            TextInputLayout textInputLayout = this.f687a;
            z1.l.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            z1.l.R(textInputLayout, checkableImageButton, this.f690e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        z1.l.W(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        z1.l.W(checkableImageButton, null);
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
        EditText editText = this.f687a.d;
        if (editText == null) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = T.f440a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = T.f440a;
        this.f688b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f689c == null || this.f693j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f688b.setVisibility(i);
        this.f687a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
