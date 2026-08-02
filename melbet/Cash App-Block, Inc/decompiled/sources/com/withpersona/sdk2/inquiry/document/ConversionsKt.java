package com.withpersona.sdk2.inquiry.document;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCombinedStepComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;

/* loaded from: classes9.dex */
public abstract class ConversionsKt {
    public static final ButtonCombinedStepComponentStyle to(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
        return new ButtonCombinedStepComponentStyle(buttonSubmitComponentStyle.getPadding(), buttonSubmitComponentStyle.getMargin(), buttonSubmitComponentStyle.getJustify(), buttonSubmitComponentStyle.getFontFamily(), buttonSubmitComponentStyle.getFontSize(), buttonSubmitComponentStyle.getFontWeight(), buttonSubmitComponentStyle.getLetterSpacing(), buttonSubmitComponentStyle.getLineHeight(), buttonSubmitComponentStyle.getTextColor(), buttonSubmitComponentStyle.getHeight(), buttonSubmitComponentStyle.getWidth(), buttonSubmitComponentStyle.getBackgroundColor(), buttonSubmitComponentStyle.getBorderColor(), buttonSubmitComponentStyle.getBorderRadius(), buttonSubmitComponentStyle.getBorderWidth());
    }

    public static final ButtonCombinedStepComponentStyle to(ButtonCancelComponentStyle buttonCancelComponentStyle) {
        return new ButtonCombinedStepComponentStyle(buttonCancelComponentStyle.getPadding(), buttonCancelComponentStyle.getMargin(), buttonCancelComponentStyle.getJustify(), buttonCancelComponentStyle.getFontFamily(), buttonCancelComponentStyle.getFontSize(), buttonCancelComponentStyle.getFontWeight(), buttonCancelComponentStyle.getLetterSpacing(), buttonCancelComponentStyle.getLineHeight(), buttonCancelComponentStyle.getTextColor(), buttonCancelComponentStyle.getHeight(), buttonCancelComponentStyle.getWidth(), buttonCancelComponentStyle.getBackgroundColor(), buttonCancelComponentStyle.getBorderColor(), buttonCancelComponentStyle.getBorderRadius(), buttonCancelComponentStyle.getBorderWidth());
    }
}
