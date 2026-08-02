package com.squareup.cash.taptopay.views;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import bo.app.q2$$ExternalSyntheticLambda8;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3 implements KeyboardActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3(ArcadeFormTextInputGroupView arcadeFormTextInputGroupView, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, MutableState mutableState) {
        this.$r8$classId = 2;
        this.f$0 = arcadeFormTextInputGroupView;
        this.f$2 = delegatingSoftwareKeyboardController;
        this.f$1 = mutableState;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2;
                ((FocusRequester) obj).freeFocus();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(TapToPayInitiatorNotesViewEvent.Next.INSTANCE);
                break;
            case 1:
                ((Function1) obj3).invoke(new LocalMenuItemDetailsViewEvent.FreeTextEntryChanged(((LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) obj).token, String.valueOf(((TextFieldState) ((MutableState) obj2).getValue()).getValue$foundation().text)));
                break;
            default:
                ArcadeFormTextInputGroupView arcadeFormTextInputGroupView = (ArcadeFormTextInputGroupView) obj3;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj2;
                if (((Boolean) ((State) obj).getValue()).booleanValue()) {
                    arcadeFormTextInputGroupView.onSubmit.invoke();
                }
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3(Function1 function1, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = obj;
        this.f$2 = obj2;
    }
}
