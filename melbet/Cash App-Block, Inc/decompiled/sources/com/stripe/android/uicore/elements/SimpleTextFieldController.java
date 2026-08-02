package com.stripe.android.uicore.elements;

import androidx.compose.ui.autofill.AndroidContentType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.R;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class SimpleTextFieldController {
    public final StateFlowImpl _fieldState;
    public final StateFlowImpl _fieldValue;
    public final StateFlowImpl _hasFocus;
    public final AndroidContentType autofillType;
    public final FlowToStateFlow contentDescription;
    public final ReadonlyStateFlow fieldState;
    public final ReadonlyStateFlow fieldValue;
    public final FlowToStateFlow formFieldValue;
    public final String initialValue;
    public final int keyboardType;
    public final StateFlowImpl label;
    public final StateFlowImpl loading;
    public final StateFlowImpl placeHolder;
    public final StateFlowImpl trailingIcon;
    public final FlowToStateFlow validationMessage;
    public final FlowToStateFlow visibleValidationMessage;
    public final ReadonlyStateFlow visualTransformation = IblLoaderKt.stateFlowOf(VisualTransformation.Companion.None);

    public SimpleTextFieldController(EmailConfig emailConfig, String str) {
        this.initialValue = str;
        this.trailingIcon = emailConfig.trailingIcon;
        this.keyboardType = emailConfig.keyboard;
        this.label = FlowKt.MutableStateFlow(emailConfig.label);
        ContentType.Companion.getClass();
        this.autofillType = ContentType.Companion.EmailAddress;
        this.placeHolder = FlowKt.MutableStateFlow(null);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        int i = 9;
        FlowToStateFlow mapAsStateFlow = IblLoaderKt.mapAsStateFlow(MutableStateFlow, new EncodeKt$$ExternalSyntheticLambda0(this, i));
        this.contentDescription = IblLoaderKt.mapAsStateFlow(MutableStateFlow, new EncodeKt$$ExternalSyntheticLambda0(this, 10));
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(TextFieldStateConstants$Error$Blank.INSTANCE);
        this._fieldState = MutableStateFlow2;
        this.fieldState = FlowKt.asStateFlow(MutableStateFlow2);
        this.loading = emailConfig.loading;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl MutableStateFlow3 = FlowKt.MutableStateFlow(bool);
        StateFlowImpl MutableStateFlow4 = FlowKt.MutableStateFlow(bool);
        this._hasFocus = MutableStateFlow4;
        FlowToStateFlow combineAsStateFlow = IblLoaderKt.combineAsStateFlow(MutableStateFlow2, MutableStateFlow4, MutableStateFlow3, new PhoneNumberController$$ExternalSyntheticLambda9(i));
        this.visibleValidationMessage = combineAsStateFlow;
        this.validationMessage = IblLoaderKt.combineAsStateFlow(combineAsStateFlow, MutableStateFlow2, new PhoneNumberController$$ExternalSyntheticLambda5(27));
        this.formFieldValue = IblLoaderKt.combineAsStateFlow(IblLoaderKt.mapAsStateFlow(MutableStateFlow2, new EncodeKt$$ExternalSyntheticLambda0(this, 11)), mapAsStateFlow, new PhoneNumberController$$ExternalSyntheticLambda5(28));
        if (str != null) {
            onValueChange(str);
        }
    }

    public final TextFieldState onValueChange(String str) {
        Object textFieldStateConstants$Error$Blank;
        str.getClass();
        StateFlowImpl stateFlowImpl = this._fieldState;
        TextFieldState textFieldState = (TextFieldState) stateFlowImpl.getValue();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!CharsKt.isWhitespace(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        StateFlowImpl stateFlowImpl2 = this._fieldValue;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, sb2);
        String str2 = (String) stateFlowImpl2.getValue();
        str2.getClass();
        if (StringsKt.isBlank(str2)) {
            textFieldStateConstants$Error$Blank = TextFieldStateConstants$Error$Blank.INSTANCE;
        } else if (EmailConfig.PATTERN.matcher(str2).matches()) {
            textFieldStateConstants$Error$Blank = TextFieldStateConstants$Valid$Limitless.INSTANCE;
        } else {
            if (!StringsKt.contains((CharSequence) str2, (CharSequence) "@", false) || !new Regex(".*@.*\\..+").matches(str2)) {
                int i2 = 0;
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    if (str2.charAt(i3) == '@') {
                        i2++;
                    }
                }
                if (i2 <= 1) {
                    textFieldStateConstants$Error$Blank = new TextFieldStateConstants$Error$Blank(new FieldValidationMessage$Error(R.string.stripe_email_is_invalid), 1);
                }
            }
            textFieldStateConstants$Error$Blank = new TextFieldStateConstants$Error$Blank(new FieldValidationMessage$Error(R.string.stripe_email_is_invalid), 2);
        }
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, textFieldStateConstants$Error$Blank);
        if (Intrinsics.areEqual(stateFlowImpl.getValue(), textFieldState)) {
            return null;
        }
        return (TextFieldState) stateFlowImpl.getValue();
    }
}
