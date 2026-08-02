package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda33;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt___StringsKt;
import sqip.internal.CreditCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class InputSelectStylingKt {
    public static final void style(TextInputLayout textInputLayout, InputSelectComponentStyle inputSelectComponentStyle) {
        int i;
        final TextInputLayout textInputLayout2 = textInputLayout;
        textInputLayout2.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Integer baseBackgroundColorValue = inputSelectComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            int intValue = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue = inputSelectComponentStyle.getFocusedBackgroundColorValue();
            int intValue2 = focusedBackgroundColorValue != null ? focusedBackgroundColorValue.intValue() : intValue;
            Integer disabledBackgroundColorValue = inputSelectComponentStyle.getDisabledBackgroundColorValue();
            int intValue3 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : intValue;
            Integer errorBackgroundColorValue = inputSelectComponentStyle.getErrorBackgroundColorValue();
            int intValue4 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : intValue;
            textInputLayout2.setBoxBackgroundMode(2);
            TextInputLayoutStylingKt.setBackgroundStateColors(textInputLayout2, textInputLayout2.hasFocus(), intValue, intValue2, intValue3);
            ref$ObjectRef.element = new InputSelectStylingKt$$ExternalSyntheticLambda0(textInputLayout2, intValue, intValue2, intValue3, 0);
            textInputLayout2 = textInputLayout;
            textInputLayout2.addOnLayoutChangeListener(new InputSelectStylingKt$$ExternalSyntheticLambda1(textInputLayout2, intValue4, intValue, intValue2, intValue3, 0));
        }
        Integer baseBorderColorValue = inputSelectComponentStyle.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int intValue5 = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = inputSelectComponentStyle.getFocusedBorderColorValue();
            int intValue6 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : intValue5;
            Integer disabledBorderColorValue = inputSelectComponentStyle.getDisabledBorderColorValue();
            textInputLayout2.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue5, intValue6, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : intValue5}));
            Integer errorBorderColorValue = inputSelectComponentStyle.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                intValue5 = errorBorderColorValue.intValue();
            }
            textInputLayout2.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue5, intValue5, intValue5}));
        }
        Double topBorderWidthValue = inputSelectComponentStyle.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double doubleValue = topBorderWidthValue.doubleValue();
            textInputLayout2.setBoxStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(doubleValue)));
            textInputLayout2.setBoxStrokeWidthFocused((int) Math.ceil(ExtensionsKt.getDpToPx(doubleValue)));
        }
        if (textInputLayout2.boxStrokeWidthDefaultPx == 0) {
            Double bottomBorderWidthValue = inputSelectComponentStyle.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = inputSelectComponentStyle.getBottomBorderWidthValue();
                int ceil = (int) Math.ceil(bottomBorderWidthValue2 != null ? ExtensionsKt.getDpToPx(bottomBorderWidthValue2.doubleValue()) : 0.0d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(ceil, textInputLayout2.focusedStrokeColor);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
                int i2 = -ceil;
                ViewGroup.LayoutParams layoutParams = textInputLayout2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                layerDrawable.setLayerInset(0, i2, i2, i2, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                textInputLayout2.setBackground(layerDrawable);
            }
        }
        Integer chevronColor = inputSelectComponentStyle.getChevronColor();
        if (chevronColor != null) {
            int intValue7 = chevronColor.intValue();
            textInputLayout2.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842908}, new int[]{R.attr.state_hovered}, new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{intValue7, intValue7, intValue7, intValue7, intValue7, intValue7}));
        }
        Double borderRadiusValue = inputSelectComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double doubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout2.setBoxCornerRadii((float) ExtensionsKt.getDpToPx(doubleValue2), (float) ExtensionsKt.getDpToPx(doubleValue2), (float) ExtensionsKt.getDpToPx(doubleValue2), (float) ExtensionsKt.getDpToPx(doubleValue2));
        }
        StyleElements.SizeSet inputSelectBoxMargins = inputSelectComponentStyle.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            ViewUtilsKt.setMargins(textInputLayout2, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout2.editText;
        if (editText != null) {
            TextStylingKt.style(editText, inputSelectComponentStyle.getTextBasedStyle(), EmptySet.INSTANCE);
        }
        EditText editText2 = textInputLayout2.editText;
        if (editText2 != null) {
            ViewUtilsKt.setMargins(editText2, new StyleElements.SizeSet(new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d)));
        }
        Integer baseTextColor = inputSelectComponentStyle.getBaseTextColor();
        if (baseTextColor != null) {
            int intValue8 = baseTextColor.intValue();
            Integer valueFocusedTextColor = inputSelectComponentStyle.getValueFocusedTextColor();
            int intValue9 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : intValue8;
            Integer valueDisabledTextColor = inputSelectComponentStyle.getValueDisabledTextColor();
            int intValue10 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : intValue8;
            Integer valueErrorTextColor = inputSelectComponentStyle.getValueErrorTextColor();
            final int intValue11 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : intValue8;
            i = -16842910;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue8, intValue9, intValue10, intValue8});
            EditText editText3 = textInputLayout2.editText;
            if (editText3 != null) {
                editText3.setTextColor(colorStateList);
            }
            textInputLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    TextInputLayout textInputLayout3 = TextInputLayout.this;
                    CharSequence error = textInputLayout3.getError();
                    if (error == null || !StringsKt___StringsKt.any(error)) {
                        EditText editText4 = textInputLayout3.editText;
                        if (editText4 != null) {
                            editText4.setTextColor(colorStateList);
                            return;
                        }
                        return;
                    }
                    EditText editText5 = textInputLayout3.editText;
                    if (editText5 != null) {
                        editText5.setTextColor(intValue11);
                    }
                }
            });
        } else {
            i = -16842910;
        }
        Integer errorBaseTextColor = inputSelectComponentStyle.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int intValue12 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = inputSelectComponentStyle.getErrorErrorTextColor();
            int intValue13 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : intValue12;
            Integer errorFocusedTextColor = inputSelectComponentStyle.getErrorFocusedTextColor();
            int intValue14 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : intValue12;
            Integer errorDisabledTextColor = inputSelectComponentStyle.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                intValue12 = errorDisabledTextColor.intValue();
            }
            textInputLayout2.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{intValue13, intValue14, intValue12, intValue13}));
        }
        Integer labelBaseTextColor = inputSelectComponentStyle.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int intValue15 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = inputSelectComponentStyle.getLabelFocusedTextColor();
            int intValue16 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : intValue15;
            Integer labelDisabledTextColor = inputSelectComponentStyle.getLabelDisabledTextColor();
            int intValue17 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : intValue15;
            Integer labelErrorTextColor = inputSelectComponentStyle.getLabelErrorTextColor();
            int intValue18 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : intValue15;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{intValue15, intValue16, intValue17, intValue15});
            ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{intValue18, intValue18, intValue18, intValue18});
            textInputLayout2.setDefaultHintTextColor(colorStateList2);
            textInputLayout2.addOnLayoutChangeListener(new UiScreenRunner$$ExternalSyntheticLambda33(1, textInputLayout2, colorStateList3, colorStateList2));
        }
        Integer placeholderBaseTextColor = inputSelectComponentStyle.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int intValue19 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = inputSelectComponentStyle.getPlaceholderFocusedTextColor();
            int intValue20 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : intValue19;
            Integer placeholderErrorTextColor = inputSelectComponentStyle.getPlaceholderErrorTextColor();
            int intValue21 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : intValue19;
            Integer placeholderDisabledTextColor = inputSelectComponentStyle.getPlaceholderDisabledTextColor();
            ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{intValue19, intValue20, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : intValue19, intValue19});
            ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{intValue21, intValue21, intValue21, intValue21});
            textInputLayout2.setPlaceholderTextColor(colorStateList4);
            textInputLayout2.addOnLayoutChangeListener(new UiScreenRunner$$ExternalSyntheticLambda33(2, textInputLayout2, colorStateList5, colorStateList4));
        }
        EditText editText4 = textInputLayout2.editText;
        if (editText4 != null) {
            editText4.setOnFocusChangeListener(new CreditCardEditor$$ExternalSyntheticLambda0(1, textInputLayout2, ref$ObjectRef));
        }
    }
}
