package com.squareup.cash.support.views;

import com.squareup.cash.support.chat.viewmodels.ChatErrorViewEvent$Close;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewEvents;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptViewEvents;
import com.squareup.cash.support.chat.viewmodels.ChatFailedDeliveryViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyUnavailableViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewEvent;
import com.squareup.cash.support.chat.views.ChatErrorDialogView;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView;
import com.squareup.cash.support.chat.views.survey.ChatSurveyUnavailableView;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewEvent;
import com.squareup.cash.support.viewmodels.ScreenshotConfirmViewEvent$Confirm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScreenshotConfirmViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ChatSurveyViewEvent.Close close = ChatSurveyViewEvent.Close.INSTANCE;
        ChatErrorViewEvent$Close chatErrorViewEvent$Close = ChatErrorViewEvent$Close.INSTANCE;
        ChatSurveyUnavailableViewEvent.Cancel cancel = ChatSurveyUnavailableViewEvent.Cancel.INSTANCE;
        ContactSupportEmailInputViewEvent.DismissModal dismissModal = ContactSupportEmailInputViewEvent.DismissModal.INSTANCE;
        ContactSupportEmailMessageViewEvent.DismissModal dismissModal2 = ContactSupportEmailMessageViewEvent.DismissModal.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ScreenshotConfirmViewEvent$Confirm.INSTANCE);
                break;
            case 1:
                int i2 = ChatErrorDialogView.$r8$clinit;
                function1.invoke(chatErrorViewEvent$Close);
                break;
            case 2:
                int i3 = ChatErrorDialogView.$r8$clinit;
                function1.invoke(chatErrorViewEvent$Close);
                break;
            case 3:
                int i4 = ChatErrorDialogView.$r8$clinit;
                function1.invoke(chatErrorViewEvent$Close);
                break;
            case 4:
                function1.invoke(ChatExitPromptSheetViewEvents.SaveAndContinue.INSTANCE);
                break;
            case 5:
                function1.invoke(ChatExitPromptSheetViewEvents.EndConversation.INSTANCE);
                break;
            case 6:
                function1.invoke(ChatExitPromptViewEvents.SaveAndContinue.INSTANCE);
                break;
            case 7:
                function1.invoke(ChatExitPromptViewEvents.EndConversation.INSTANCE);
                break;
            case 8:
                int i5 = ChatFailedDeliverySheetView.$r8$clinit;
                function1.invoke(ChatFailedDeliveryViewEvent.Cancel.INSTANCE);
                break;
            case 9:
                int i6 = ChatFailedDeliverySheetView.$r8$clinit;
                function1.invoke(ChatFailedDeliveryViewEvent.ResendMessage.INSTANCE);
                break;
            case 10:
                int i7 = ChatFailedDeliverySheetView.$r8$clinit;
                function1.invoke(ChatFailedDeliveryViewEvent.DeleteMessage.INSTANCE);
                break;
            case 11:
                function1.invoke(ChatImageDetailViewEvent.CloseImageDetail.INSTANCE);
                break;
            case 12:
                function1.invoke(new ChatSurveyViewEvent.Submit(false));
                break;
            case 13:
                function1.invoke(new ChatSurveyViewEvent.Submit(true));
                break;
            case 14:
                function1.invoke(close);
                break;
            case 15:
                function1.invoke(close);
                break;
            case 16:
                int i8 = ChatSurveyUnavailableView.$r8$clinit;
                function1.invoke(cancel);
                break;
            case 17:
                int i9 = ChatSurveyUnavailableView.$r8$clinit;
                function1.invoke(cancel);
                break;
            case 18:
                int i10 = ChatSurveyUnavailableView.$r8$clinit;
                function1.invoke(cancel);
                break;
            case 19:
                int i11 = ChatSurveyUnavailableView.$r8$clinit;
                function1.invoke(ChatSurveyUnavailableViewEvent.Retry.INSTANCE);
                break;
            case 20:
                function1.invoke(Boolean.TRUE);
                break;
            case 21:
                function1.invoke(Boolean.FALSE);
                break;
            case 22:
                function1.invoke(Boolean.FALSE);
                break;
            case 23:
                function1.invoke(ContactSupportEmailInputViewEvent.EditEmail.INSTANCE);
                break;
            case 24:
                function1.invoke(dismissModal);
                break;
            case 25:
                function1.invoke(dismissModal);
                break;
            case 26:
                function1.invoke(dismissModal);
                break;
            case 27:
                function1.invoke(dismissModal2);
                break;
            case 28:
                function1.invoke(dismissModal2);
                break;
            default:
                function1.invoke(dismissModal2);
                break;
        }
        return Unit.INSTANCE;
    }
}
