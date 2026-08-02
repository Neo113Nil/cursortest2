package com.squareup.cash.taptopay.views;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ FocusRequester f$1;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$2;

    public /* synthetic */ TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2(Function1 function1, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = focusRequester;
        this.f$2 = delegatingSoftwareKeyboardController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$2;
        FocusRequester focusRequester = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                focusRequester.freeFocus();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(TapToPayInitiatorNotesViewEvent.Back.INSTANCE);
                break;
            case 1:
                focusRequester.freeFocus();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(DirectDepositSingleInputViewEvent.ButtonClick.INSTANCE);
                break;
            case 2:
                focusRequester.freeFocus();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(DirectDepositSingleInputViewEvent.NavigationIconClick.INSTANCE);
                break;
            default:
                focusRequester.freeFocus();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(TapToPayInitiatorNotesViewEvent.Next.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
