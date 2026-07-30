package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;

    @Nullable
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(tintTypedArray);
        initPrefixTextView(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(TintTypedArray tintTypedArray) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.prefixTextView.setAccessibilityLiveRegion(1);
        setPrefixTextAppearance(tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i8 = R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i8)) {
            setPrefixTextColor(tintTypedArray.getColorStateList(i8));
        }
        setPrefixText(tintTypedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i8 = R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i8)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i8);
        }
        int i9 = R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i9)) {
            this.startIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i9, -1), null);
        }
        int i10 = R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i10)) {
            setStartIconDrawable(tintTypedArray.getDrawable(i10));
            int i11 = R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i11)) {
                setStartIconContentDescription(tintTypedArray.getText(i11));
            }
            setStartIconCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i12 = R.styleable.TextInputLayout_startIconScaleType;
        if (tintTypedArray.hasValue(i12)) {
            setStartIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(i12, -1)));
        }
    }

    private void updateVisibility() {
        int i8 = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i8 == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i8);
        this.textInputLayout.updateDummyDrawables();
    }

    @Nullable
    CharSequence getPrefixText() {
        return this.prefixText;
    }

    @Nullable
    ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    int getPrefixTextStartOffset() {
        return getPaddingStart() + this.prefixTextView.getPaddingStart() + (isStartIconVisible() ? this.startIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).getMarginEnd() : 0);
    }

    @NonNull
    TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    @Nullable
    CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    @Nullable
    Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    @NonNull
    ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    void onHintStateChanged(boolean z7) {
        this.hintExpanded = z7;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        updatePrefixTextViewPadding();
    }

    void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    void setPrefixText(@Nullable CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    void setPrefixTextAppearance(@StyleRes int i8) {
        TextViewCompat.setTextAppearance(this.prefixTextView, i8);
    }

    void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    void setStartIconCheckable(boolean z7) {
        this.startIconView.setCheckable(z7);
    }

    void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    void setStartIconMinSize(@Px int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i8 != this.startIconMinSize) {
            this.startIconMinSize = i8;
            IconHelper.setIconMinSize(this.startIconView, i8);
        }
    }

    void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    void setStartIconVisible(boolean z7) {
        if (isStartIconVisible() != z7) {
            this.startIconView.setVisibility(z7 ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    void setupAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.prefixTextView.getVisibility() != 0) {
            accessibilityNodeInfoCompat.setTraversalAfter(this.startIconView);
        } else {
            accessibilityNodeInfoCompat.setLabelFor(this.prefixTextView);
            accessibilityNodeInfoCompat.setTraversalAfter(this.prefixTextView);
        }
    }

    void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        this.prefixTextView.setPaddingRelative(isStartIconVisible() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
