package com.squareup.cash.taptopay.views;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class TapToPayInitiatorNotesKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState f$0;

    public /* synthetic */ TapToPayInitiatorNotesKt$$ExternalSyntheticLambda4(int i, TextFieldState textFieldState) {
        this.$r8$classId = i;
        this.f$0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        TextFieldState textFieldState = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                TextFieldStateKt.setTextAndPlaceCursorAtEnd(textFieldState, str);
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(textFieldState.getValue$foundation().text.toString()));
                break;
        }
        return Unit.INSTANCE;
    }
}
