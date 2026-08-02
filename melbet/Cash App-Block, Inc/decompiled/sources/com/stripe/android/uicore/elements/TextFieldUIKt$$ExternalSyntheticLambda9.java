package com.stripe.android.uicore.elements;

import androidx.compose.ui.autofill.AndroidContentType;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes8.dex */
public final /* synthetic */ class TextFieldUIKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SimpleTextFieldController f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda9(SimpleTextFieldController simpleTextFieldController, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = simpleTextFieldController;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        SimpleTextFieldController simpleTextFieldController = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                AndroidContentType androidContentType = simpleTextFieldController.autofillType;
                if (androidContentType != null) {
                    SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidContentType);
                }
                TextFieldUIKt$$ExternalSyntheticLambda9 textFieldUIKt$$ExternalSyntheticLambda9 = new TextFieldUIKt$$ExternalSyntheticLambda9(simpleTextFieldController, function1, 1);
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                semanticsPropertyReceiver.set(SemanticsActions.OnAutofillText, new AccessibilityAction(null, textFieldUIKt$$ExternalSyntheticLambda9));
                return Unit.INSTANCE;
            default:
                AnnotatedString annotatedString = (AnnotatedString) obj;
                annotatedString.getClass();
                AndroidContentType androidContentType2 = simpleTextFieldController.autofillType;
                if (androidContentType2 != null) {
                    function1.invoke(androidContentType2.toString());
                }
                simpleTextFieldController.onValueChange(annotatedString.text);
                return Boolean.TRUE;
        }
    }
}
