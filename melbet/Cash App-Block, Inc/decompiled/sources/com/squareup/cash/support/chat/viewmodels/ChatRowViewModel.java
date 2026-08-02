package com.squareup.cash.support.chat.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda1;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public abstract class ChatRowViewModel {

    public final class BottomBookmarkRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.BottomBookmarkViewModel model;

        public BottomBookmarkRowViewModel(ChatContentViewModel.BottomBookmarkViewModel bottomBookmarkViewModel) {
            this.model = bottomBookmarkViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomBookmarkRowViewModel) && this.model.equals(((BottomBookmarkRowViewModel) obj).model);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "BottomBookmarkRowViewModel(model=" + this.model + ")";
        }
    }

    public final class DisclaimerRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.DisclaimerViewModel model;
        public final BottomSheet$$ExternalSyntheticLambda3 onLinkClicked;

        public DisclaimerRowViewModel(ChatContentViewModel.DisclaimerViewModel disclaimerViewModel, BottomSheet$$ExternalSyntheticLambda3 bottomSheet$$ExternalSyntheticLambda3) {
            this.model = disclaimerViewModel;
            this.onLinkClicked = bottomSheet$$ExternalSyntheticLambda3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DisclaimerRowViewModel) {
                DisclaimerRowViewModel disclaimerRowViewModel = (DisclaimerRowViewModel) obj;
                return this.model.equals(disclaimerRowViewModel.model) && this.onLinkClicked == disclaimerRowViewModel.onLinkClicked;
            }
            return false;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.onLinkClicked.hashCode() + (this.model.hashCode() * 31);
        }

        public final String toString() {
            return "DisclaimerRowViewModel(model=" + this.model + ", onLinkClicked=" + this.onLinkClicked + ")";
        }
    }

    public final class DividerRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.DividerViewModel model;

        public DividerRowViewModel(ChatContentViewModel.DividerViewModel dividerViewModel) {
            this.model = dividerViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DividerRowViewModel) && this.model.equals(((DividerRowViewModel) obj).model);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.model.chatUiUpliftEnabled);
        }

        public final String toString() {
            return "DividerRowViewModel(model=" + this.model + ")";
        }
    }

    public final class ErrorRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.ErrorViewModel model;
        public final ChatView$$ExternalSyntheticLambda1 onRetryClick;

        public ErrorRowViewModel(ChatContentViewModel.ErrorViewModel errorViewModel, ChatView$$ExternalSyntheticLambda1 chatView$$ExternalSyntheticLambda1) {
            this.model = errorViewModel;
            this.onRetryClick = chatView$$ExternalSyntheticLambda1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ErrorRowViewModel) {
                ErrorRowViewModel errorRowViewModel = (ErrorRowViewModel) obj;
                return this.model.equals(errorRowViewModel.model) && this.onRetryClick == errorRowViewModel.onRetryClick;
            }
            return false;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.onRetryClick.hashCode() + 498448019;
        }

        public final String toString() {
            return "ErrorRowViewModel(model=" + this.model + ", onRetryClick=" + this.onRetryClick + ")";
        }
    }

    public final class LoadOldMessagesRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.LoadOldMessagesViewModel model;
        public final ChatView$$ExternalSyntheticLambda1 onBind;

        public LoadOldMessagesRowViewModel(ChatContentViewModel.LoadOldMessagesViewModel loadOldMessagesViewModel, ChatView$$ExternalSyntheticLambda1 chatView$$ExternalSyntheticLambda1) {
            this.model = loadOldMessagesViewModel;
            this.onBind = chatView$$ExternalSyntheticLambda1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LoadOldMessagesRowViewModel) {
                LoadOldMessagesRowViewModel loadOldMessagesRowViewModel = (LoadOldMessagesRowViewModel) obj;
                return this.model.equals(loadOldMessagesRowViewModel.model) && this.onBind == loadOldMessagesRowViewModel.onBind;
            }
            return false;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.onBind.hashCode() + 534275928;
        }

        public final String toString() {
            return "LoadOldMessagesRowViewModel(model=" + this.model + ", onBind=" + this.onBind + ")";
        }
    }

    public final class MessageRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.EntryViewModel model;
        public final Function1 onActionClick;
        public final Function1 onActivityTransactionClick;
        public final Function1 onDeleteMessage;
        public final Function1 onImageClick;
        public final Function1 onImageLoadFailed;
        public final Function1 onMessageStatusIconClick;
        public final Function1 onResendMessage;
        public final Function0 onRetryImageLoadClick;
        public final Function0 onUpdateCashAppClick;
        public final Function1 onUrlClick;

        public MessageRowViewModel(ChatContentViewModel.EntryViewModel entryViewModel, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function0 function02, Function1 function18) {
            this.model = entryViewModel;
            this.onMessageStatusIconClick = function1;
            this.onResendMessage = function12;
            this.onDeleteMessage = function13;
            this.onUpdateCashAppClick = function0;
            this.onUrlClick = function14;
            this.onActionClick = function15;
            this.onImageClick = function16;
            this.onImageLoadFailed = function17;
            this.onRetryImageLoadClick = function02;
            this.onActivityTransactionClick = function18;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageRowViewModel)) {
                return false;
            }
            MessageRowViewModel messageRowViewModel = (MessageRowViewModel) obj;
            return this.model.equals(messageRowViewModel.model) && this.onMessageStatusIconClick.equals(messageRowViewModel.onMessageStatusIconClick) && this.onResendMessage.equals(messageRowViewModel.onResendMessage) && this.onDeleteMessage.equals(messageRowViewModel.onDeleteMessage) && this.onUpdateCashAppClick.equals(messageRowViewModel.onUpdateCashAppClick) && this.onUrlClick.equals(messageRowViewModel.onUrlClick) && this.onActionClick.equals(messageRowViewModel.onActionClick) && this.onImageClick.equals(messageRowViewModel.onImageClick) && this.onImageLoadFailed.equals(messageRowViewModel.onImageLoadFailed) && this.onRetryImageLoadClick.equals(messageRowViewModel.onRetryImageLoadClick) && this.onActivityTransactionClick.equals(messageRowViewModel.onActivityTransactionClick);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.onActivityTransactionClick.hashCode() + ((this.onRetryImageLoadClick.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m((this.onUpdateCashAppClick.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(this.model.hashCode() * 31, 31, this.onMessageStatusIconClick), 31, this.onResendMessage), 31, this.onDeleteMessage)) * 31, 31, this.onUrlClick), 31, this.onActionClick), 31, this.onImageClick), 31, this.onImageLoadFailed)) * 31);
        }

        public final String toString() {
            return "MessageRowViewModel(model=" + this.model + ", onMessageStatusIconClick=" + this.onMessageStatusIconClick + ", onResendMessage=" + this.onResendMessage + ", onDeleteMessage=" + this.onDeleteMessage + ", onUpdateCashAppClick=" + this.onUpdateCashAppClick + ", onUrlClick=" + this.onUrlClick + ", onActionClick=" + this.onActionClick + ", onImageClick=" + this.onImageClick + ", onImageLoadFailed=" + this.onImageLoadFailed + ", onRetryImageLoadClick=" + this.onRetryImageLoadClick + ", onActivityTransactionClick=" + this.onActivityTransactionClick + ")";
        }
    }

    public final class NameDisplayRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.NameDisplayViewModel model;

        public NameDisplayRowViewModel(ChatContentViewModel.NameDisplayViewModel nameDisplayViewModel) {
            this.model = nameDisplayViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameDisplayRowViewModel) && this.model.equals(((NameDisplayRowViewModel) obj).model);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "NameDisplayRowViewModel(model=" + this.model + ")";
        }
    }

    public final class StatusRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.StatusViewModel model;

        public StatusRowViewModel(ChatContentViewModel.StatusViewModel statusViewModel) {
            this.model = statusViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusRowViewModel) && this.model.equals(((StatusRowViewModel) obj).model);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.model.text.hashCode();
        }

        public final String toString() {
            return "StatusRowViewModel(model=" + this.model + ")";
        }
    }

    public final class StatusTimestampRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.StatusTimestampViewModel model;

        public StatusTimestampRowViewModel(ChatContentViewModel.StatusTimestampViewModel statusTimestampViewModel) {
            this.model = statusTimestampViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusTimestampRowViewModel) && this.model.equals(((StatusTimestampRowViewModel) obj).model);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "StatusTimestampRowViewModel(model=" + this.model + ")";
        }
    }

    public final class SuggestedRepliesRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.SuggestedRepliesViewModel model;
        public final ChatView$$ExternalSyntheticLambda6 onReplySelected;

        public SuggestedRepliesRowViewModel(ChatContentViewModel.SuggestedRepliesViewModel suggestedRepliesViewModel, ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda6) {
            this.model = suggestedRepliesViewModel;
            this.onReplySelected = chatView$$ExternalSyntheticLambda6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SuggestedRepliesRowViewModel) {
                SuggestedRepliesRowViewModel suggestedRepliesRowViewModel = (SuggestedRepliesRowViewModel) obj;
                return this.model.equals(suggestedRepliesRowViewModel.model) && this.onReplySelected == suggestedRepliesRowViewModel.onReplySelected;
            }
            return false;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.onReplySelected.hashCode() + (this.model.hashCode() * 31);
        }

        public final String toString() {
            return "SuggestedRepliesRowViewModel(model=" + this.model + ", onReplySelected=" + this.onReplySelected + ")";
        }
    }

    public final class TimestampDividerRowViewModel extends ChatRowViewModel {
        public final ChatContentViewModel.TimestampDividerViewModel model;

        public TimestampDividerRowViewModel(ChatContentViewModel.TimestampDividerViewModel timestampDividerViewModel) {
            this.model = timestampDividerViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimestampDividerRowViewModel) && this.model.equals(((TimestampDividerRowViewModel) obj).model);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatRowViewModel
        public final ChatContentViewModel getModel() {
            return this.model;
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "TimestampDividerRowViewModel(model=" + this.model + ")";
        }
    }

    public abstract ChatContentViewModel getModel();
}
