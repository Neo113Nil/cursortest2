package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public abstract class InputCheckboxComponentKt {
    public static final ConstraintLayout makeView(InputCheckboxComponent inputCheckboxComponent, MarkwonImpl markwonImpl, Pi2UiInputCheckboxBinding pi2UiInputCheckboxBinding, InputCheckbox inputCheckbox) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value2;
        Context context = (Context) markwonImpl.parser;
        MaterialCheckBox materialCheckBox = pi2UiInputCheckboxBinding.checkbox;
        ConstraintLayout constraintLayout = pi2UiInputCheckboxBinding.rootView;
        TextView textView = pi2UiInputCheckboxBinding.checkboxDescription;
        TextView textView2 = pi2UiInputCheckboxBinding.checkboxLabel;
        materialCheckBox.setChecked(((Boolean) inputCheckboxComponent.twoStateViewController._textValue.getValue()).booleanValue());
        materialCheckBox.setClickable(false);
        materialCheckBox.setFocusable(false);
        InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || StringsKt.isBlank(label)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            ExtensionsKt.setMarkdown(textView2, label);
        }
        InputCheckbox.Attributes attributes2 = inputCheckbox.getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        if (descriptionText == null || StringsKt.isBlank(descriptionText)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            ExtensionsKt.setMarkdown(textView, descriptionText);
        }
        materialCheckBox.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(inputCheckboxComponent, 8));
        constraintLayout.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(pi2UiInputCheckboxBinding, 28));
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckbox.getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            int intValue = value.intValue();
            AttributeStyles.InputCheckboxTextColorStyle textColor = styles.getTextColor();
            int colorFromAttr$default = (textColor == null || (base3 = textColor.getBase()) == null || (base4 = base3.getBase()) == null || (value2 = base4.getValue()) == null) ? ResToolsKt.getColorFromAttr$default(context, R.attr.colorOnSurface) : value2.intValue();
            materialCheckBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{ColorUtils.setAlphaComponent(colorFromAttr$default, (int) (ResourcesCompat.getFloat(context.getResources(), R.dimen.material_emphasis_disabled) * 255.0f)), colorFromAttr$default, intValue}));
        }
        ((LinkedList) markwonImpl.plugins).add(new StateFlowsKt$$ExternalSyntheticLambda2(25, inputCheckbox, pi2UiInputCheckboxBinding));
        constraintLayout.setTag(pi2UiInputCheckboxBinding);
        return constraintLayout;
    }
}
