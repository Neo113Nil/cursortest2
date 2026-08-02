package com.squareup.cash.support.chat.views;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.filepicker.MimeType;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatView f$0;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda1(ChatView chatView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ChatViewEvent.LoadOldMessages loadOldMessages = ChatViewEvent.LoadOldMessages.INSTANCE;
        ChatViewEvent.CloseChat closeChat = ChatViewEvent.CloseChat.INSTANCE;
        ChatViewEvent.RemoveAttachment removeAttachment = ChatViewEvent.RemoveAttachment.INSTANCE;
        ChatView chatView = this.f$0;
        switch (i) {
            case 0:
                chatView.scrollToFirstUnreadOrBottom();
                return Unit.INSTANCE;
            case 1:
                chatView.inputView.clearFocus();
                chatView.chatInputArea.clearFocus();
                Keyboards.hideKeyboard(chatView);
                Ui.EventReceiver eventReceiver = chatView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(closeChat);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 2:
                chatView.handleSendButtonClick();
                return Unit.INSTANCE;
            case 3:
                Ui.EventReceiver eventReceiver2 = chatView.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(removeAttachment);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 4:
                Ui.EventReceiver eventReceiver3 = chatView.eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(loadOldMessages);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 5:
                Ui.EventReceiver eventReceiver4 = chatView.eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(loadOldMessages);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 6:
                Ui.EventReceiver eventReceiver5 = chatView.eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(ChatViewEvent.UpdateCashApp.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 7:
                Ui.EventReceiver eventReceiver6 = chatView.eventReceiver;
                if (eventReceiver6 != null) {
                    eventReceiver6.sendEvent(ChatViewEvent.ClickRetryImageLoad.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 8:
                chatView.handleSendButtonClick();
                return Unit.INSTANCE;
            case 9:
                RealFilePicker realFilePicker = chatView.filePicker;
                String str = ChatView.ALLOWED_MIME_TYPES;
                realFilePicker.getClass();
                realFilePicker.tryLaunch(new MimeType(str));
                return Unit.INSTANCE;
            case 10:
                chatView.chatView.smoothScrollToBottom();
                return Unit.INSTANCE;
            case 11:
                chatView.inputView.clearFocus();
                chatView.chatInputArea.clearFocus();
                Keyboards.hideKeyboard(chatView);
                Ui.EventReceiver eventReceiver7 = chatView.eventReceiver;
                if (eventReceiver7 != null) {
                    eventReceiver7.sendEvent(closeChat);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 12:
                chatView.scrollToFirstUnreadOrBottom();
                return Unit.INSTANCE;
            case 13:
                return Boolean.valueOf((StringsKt.isBlank(chatView.textFieldState.getValue$foundation().text) && chatView.chatInputAreaAttachment.getValue() == null) ? false : true);
            case 14:
                Ui.EventReceiver eventReceiver8 = chatView.eventReceiver;
                if (eventReceiver8 != null) {
                    eventReceiver8.sendEvent(removeAttachment);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 15:
                RealFilePicker realFilePicker2 = chatView.filePicker;
                String str2 = ChatView.ALLOWED_MIME_TYPES;
                realFilePicker2.getClass();
                realFilePicker2.tryLaunch(new MimeType(str2));
                return Unit.INSTANCE;
            default:
                chatView.handleSendButtonClick();
                return Unit.INSTANCE;
        }
    }
}
