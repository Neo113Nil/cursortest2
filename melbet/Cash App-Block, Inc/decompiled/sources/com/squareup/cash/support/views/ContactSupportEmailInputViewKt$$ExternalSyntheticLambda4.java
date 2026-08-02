package com.squareup.cash.support.views;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import bo.app.q2$$ExternalSyntheticLambda8;

/* loaded from: classes7.dex */
public final /* synthetic */ class ContactSupportEmailInputViewKt$$ExternalSyntheticLambda4 implements KeyboardActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$0;

    public /* synthetic */ ContactSupportEmailInputViewKt$$ExternalSyntheticLambda4(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingSoftwareKeyboardController;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$0;
        switch (i) {
            case 0:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                    break;
                }
                break;
            default:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                    break;
                }
                break;
        }
    }
}
