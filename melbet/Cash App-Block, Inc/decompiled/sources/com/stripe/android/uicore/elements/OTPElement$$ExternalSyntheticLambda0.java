package com.stripe.android.uicore.elements;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes8.dex */
public final /* synthetic */ class OTPElement$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OTPElement f$0;

    public /* synthetic */ OTPElement$$ExternalSyntheticLambda0(OTPElement oTPElement, int i) {
        this.$r8$classId = i;
        this.f$0 = oTPElement;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        OTPElement oTPElement = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(new Pair(oTPElement.identifier, new FormFieldEntry(str, str.length() == 6)));
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                OTPElement$$ExternalSyntheticLambda0 oTPElement$$ExternalSyntheticLambda0 = new OTPElement$$ExternalSyntheticLambda0(oTPElement, 2);
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                semanticsPropertyReceiver.set(SemanticsActions.OnAutofillText, new AccessibilityAction(null, oTPElement$$ExternalSyntheticLambda0));
                return Unit.INSTANCE;
            default:
                AnnotatedString annotatedString = (AnnotatedString) obj;
                annotatedString.getClass();
                OTPController oTPController = oTPElement.controller;
                String str2 = annotatedString.text;
                str2.getClass();
                String concat = oTPController.autofillAccumulator.concat(str2);
                oTPController.autofillAccumulator = concat;
                if (concat.length() == 6) {
                    oTPController.onValueChanged(0, oTPController.autofillAccumulator);
                    oTPController.autofillAccumulator = "";
                }
                return Boolean.TRUE;
        }
    }
}
