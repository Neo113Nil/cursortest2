package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda33;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import sqip.internal.CreditCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class TextInputLayoutStylingKt {
    public static final void setBackgroundStateColors(TextInputLayout textInputLayout, boolean z, int i, int i2, int i3) {
        textInputLayout.getClass();
        if (z) {
            textInputLayout.setBoxBackgroundColor(i2);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i);
        } else {
            textInputLayout.setBoxBackgroundColor(i3);
        }
    }

    public static final void setCursorColorFilter(TextInputLayout textInputLayout, int i) {
        Drawable textCursorDrawable;
        EditText editText = textInputLayout.editText;
        if (editText == null || (textCursorDrawable = editText.getTextCursorDrawable()) == null) {
            return;
        }
        textCursorDrawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
    }

    public static final void style(TextInputLayout textInputLayout, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
        int i;
        Integer focusedBackgroundColorValue;
        final TextInputLayout textInputLayout2 = textInputLayout;
        textInputLayout2.getClass();
        Integer baseBorderColorValue = inputTextBasedComponentStyle.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int intValue = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = inputTextBasedComponentStyle.getFocusedBorderColorValue();
            int intValue2 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : intValue;
            Integer disabledBorderColorValue = inputTextBasedComponentStyle.getDisabledBorderColorValue();
            textInputLayout2.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue, intValue2, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : intValue}));
            Integer errorBorderColorValue = inputTextBasedComponentStyle.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                intValue = errorBorderColorValue.intValue();
            }
            textInputLayout2.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue, intValue, intValue}));
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Integer baseBackgroundColorValue = inputTextBasedComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            int intValue3 = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue2 = inputTextBasedComponentStyle.getFocusedBackgroundColorValue();
            int intValue4 = focusedBackgroundColorValue2 != null ? focusedBackgroundColorValue2.intValue() : intValue3;
            Integer disabledBackgroundColorValue = inputTextBasedComponentStyle.getDisabledBackgroundColorValue();
            int intValue5 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : intValue3;
            Integer errorBackgroundColorValue = inputTextBasedComponentStyle.getErrorBackgroundColorValue();
            int intValue6 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : intValue3;
            textInputLayout2.setBoxBackgroundMode(2);
            setBackgroundStateColors(textInputLayout2, textInputLayout2.hasFocus(), intValue3, intValue4, intValue5);
            ref$ObjectRef.element = new InputSelectStylingKt$$ExternalSyntheticLambda0(textInputLayout2, intValue3, intValue4, intValue5, 1);
            textInputLayout2 = textInputLayout;
            textInputLayout2.addOnLayoutChangeListener(new InputSelectStylingKt$$ExternalSyntheticLambda1(textInputLayout2, intValue6, intValue3, intValue4, intValue5, 1));
        }
        Double borderWidthValue = inputTextBasedComponentStyle.getBorderWidthValue();
        if (borderWidthValue != null) {
            double doubleValue = borderWidthValue.doubleValue();
            textInputLayout2.setBoxStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(doubleValue)));
            textInputLayout2.setBoxStrokeWidthFocused((int) Math.ceil(ExtensionsKt.getDpToPx(doubleValue)));
        }
        Double borderRadiusValue = inputTextBasedComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double doubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout2.setBoxCornerRadii((float) ExtensionsKt.getDpToPx(doubleValue2), (float) ExtensionsKt.getDpToPx(doubleValue2), (float) ExtensionsKt.getDpToPx(doubleValue2), (float) ExtensionsKt.getDpToPx(doubleValue2));
        }
        Double valueFontSizeValue = inputTextBasedComponentStyle.getValueFontSizeValue();
        if (valueFontSizeValue != null) {
            double doubleValue3 = valueFontSizeValue.doubleValue();
            EditText editText = textInputLayout2.editText;
            if (editText != null) {
                editText.setTextSize((float) doubleValue3);
            }
        }
        Double valueLetterSpacingValue = inputTextBasedComponentStyle.getValueLetterSpacingValue();
        if (valueLetterSpacingValue != null) {
            double doubleValue4 = valueLetterSpacingValue.doubleValue() / (textInputLayout2.editText != null ? r0.getTextSize() : 12.0f);
            EditText editText2 = textInputLayout2.editText;
            if (editText2 != null) {
                editText2.setLetterSpacing((float) doubleValue4);
            }
        }
        EditText editText3 = textInputLayout2.editText;
        if (editText3 != null) {
            String baseFontFamilyValue = inputTextBasedComponentStyle.getBaseFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue = inputTextBasedComponentStyle.getValueFontWeightValue();
            if (valueFontWeightValue == null) {
                valueFontWeightValue = StyleElements.FontWeight.NORMAL;
            }
            TextStylingKt.setTypeface(editText3, baseFontFamilyValue, valueFontWeightValue, new ForwardingFileSystem$$ExternalSyntheticLambda0(textInputLayout2, 9));
        }
        EditText editText4 = textInputLayout2.editText;
        textInputLayout2.setTypeface(editText4 != null ? editText4.getTypeface() : null);
        EditText editText5 = textInputLayout2.editText;
        if (editText5 != null) {
            String valueFontFamilyValue = inputTextBasedComponentStyle.getValueFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue2 = inputTextBasedComponentStyle.getValueFontWeightValue();
            if (valueFontWeightValue2 == null) {
                valueFontWeightValue2 = StyleElements.FontWeight.NORMAL;
            }
            TextStylingKt.setTypeface(editText5, valueFontFamilyValue, valueFontWeightValue2, new InstantKt$$ExternalSyntheticLambda0(3));
        }
        Double valueLineHeightValue = inputTextBasedComponentStyle.getValueLineHeightValue();
        if (valueLineHeightValue != null) {
            double doubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText6 = textInputLayout2.editText;
            if (editText6 != null) {
                editText6.setLineHeight((int) ExtensionsKt.getDpToPx(doubleValue5));
            }
        }
        Integer baseTextColor = inputTextBasedComponentStyle.getBaseTextColor();
        if (baseTextColor != null) {
            int intValue7 = baseTextColor.intValue();
            Integer valueFocusedTextColor = inputTextBasedComponentStyle.getValueFocusedTextColor();
            final int intValue8 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : intValue7;
            Integer valueDisabledTextColor = inputTextBasedComponentStyle.getValueDisabledTextColor();
            int intValue9 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : intValue7;
            Integer valueErrorTextColor = inputTextBasedComponentStyle.getValueErrorTextColor();
            final int intValue10 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : intValue7;
            i = -16842914;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue7, intValue8, intValue9, intValue7});
            EditText editText7 = textInputLayout2.editText;
            if (editText7 != null) {
                editText7.setTextColor(colorStateList);
            }
            setCursorColorFilter(textInputLayout2, intValue8);
            textInputLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    TextInputLayout textInputLayout3 = TextInputLayout.this;
                    CharSequence error = textInputLayout3.getError();
                    if (error == null || !StringsKt___StringsKt.any(error)) {
                        EditText editText8 = textInputLayout3.editText;
                        if (editText8 != null) {
                            editText8.setTextColor(colorStateList);
                        }
                        TextInputLayoutStylingKt.setCursorColorFilter(textInputLayout3, intValue8);
                        return;
                    }
                    EditText editText9 = textInputLayout3.editText;
                    int i10 = intValue10;
                    if (editText9 != null) {
                        editText9.setTextColor(i10);
                    }
                    TextInputLayoutStylingKt.setCursorColorFilter(textInputLayout3, i10);
                }
            });
        } else {
            i = -16842914;
        }
        Integer errorBaseTextColor = inputTextBasedComponentStyle.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int intValue11 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = inputTextBasedComponentStyle.getErrorErrorTextColor();
            int intValue12 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : intValue11;
            Integer errorFocusedTextColor = inputTextBasedComponentStyle.getErrorFocusedTextColor();
            int intValue13 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : intValue11;
            Integer errorDisabledTextColor = inputTextBasedComponentStyle.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                intValue11 = errorDisabledTextColor.intValue();
            }
            textInputLayout2.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{i}}, new int[]{intValue12, intValue13, intValue11, intValue12}));
        }
        Integer labelBaseTextColor = inputTextBasedComponentStyle.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int intValue14 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = inputTextBasedComponentStyle.getLabelFocusedTextColor();
            int intValue15 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : intValue14;
            Integer labelDisabledTextColor = inputTextBasedComponentStyle.getLabelDisabledTextColor();
            int intValue16 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : intValue14;
            Integer labelErrorTextColor = inputTextBasedComponentStyle.getLabelErrorTextColor();
            int intValue17 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : intValue14;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{i}}, new int[]{intValue14, intValue15, intValue16, intValue14});
            ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{i}}, new int[]{intValue17, intValue17, intValue17, intValue17});
            textInputLayout2.setDefaultHintTextColor(colorStateList2);
            textInputLayout2.addOnLayoutChangeListener(new UiScreenRunner$$ExternalSyntheticLambda33(3, textInputLayout2, colorStateList3, colorStateList2));
        }
        EditText editText8 = textInputLayout2.editText;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = editText8 instanceof MaterialAutoCompleteTextView ? (MaterialAutoCompleteTextView) editText8 : null;
        if (materialAutoCompleteTextView != null && (focusedBackgroundColorValue = inputTextBasedComponentStyle.getFocusedBackgroundColorValue()) != null) {
            materialAutoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(focusedBackgroundColorValue.intValue()));
        }
        StyleElements.SizeSet inputTextBoxMargins = inputTextBasedComponentStyle.getInputTextBoxMargins();
        if (inputTextBoxMargins != null) {
            ViewUtilsKt.setMargins(textInputLayout2, inputTextBoxMargins);
        }
        Integer placeholderBaseTextColor = inputTextBasedComponentStyle.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int intValue18 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = inputTextBasedComponentStyle.getPlaceholderFocusedTextColor();
            int intValue19 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : intValue18;
            Integer placeholderErrorTextColor = inputTextBasedComponentStyle.getPlaceholderErrorTextColor();
            int intValue20 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : intValue18;
            Integer placeholderDisabledTextColor = inputTextBasedComponentStyle.getPlaceholderDisabledTextColor();
            ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{i}}, new int[]{intValue18, intValue19, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : intValue18, intValue18});
            ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{i}}, new int[]{intValue20, intValue20, intValue20, intValue20});
            textInputLayout2.setPlaceholderTextColor(colorStateList4);
            textInputLayout2.addOnLayoutChangeListener(new UiScreenRunner$$ExternalSyntheticLambda33(4, textInputLayout2, colorStateList5, colorStateList4));
        }
        EditText editText9 = textInputLayout2.editText;
        if (editText9 != null) {
            editText9.setOnFocusChangeListener(new CreditCardEditor$$ExternalSyntheticLambda0(2, textInputLayout2, ref$ObjectRef));
        }
        Integer baseMaskToggleColor = inputTextBasedComponentStyle.getBaseMaskToggleColor();
        if (baseMaskToggleColor != null) {
            int intValue21 = baseMaskToggleColor.intValue();
            Integer focusedMaskToggleColor = inputTextBasedComponentStyle.getFocusedMaskToggleColor();
            int intValue22 = focusedMaskToggleColor != null ? focusedMaskToggleColor.intValue() : intValue21;
            Integer disabledMaskToggleColor = inputTextBasedComponentStyle.getDisabledMaskToggleColor();
            textInputLayout2.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{i}}, new int[]{intValue21, intValue22, disabledMaskToggleColor != null ? disabledMaskToggleColor.intValue() : intValue21, intValue21}));
        }
    }
}
