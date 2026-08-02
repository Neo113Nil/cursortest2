package com.squareup.cash.support.chat.views;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.ui.focus.FocusRequester;
import bo.app.q2$$ExternalSyntheticLambda8;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatInputView$$ExternalSyntheticLambda2 implements KeyboardActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ChatInputView$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ChatInputView) obj).onSendClick.invoke();
                break;
            case 1:
                ((FocusRequester) obj).freeFocus();
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }
}
