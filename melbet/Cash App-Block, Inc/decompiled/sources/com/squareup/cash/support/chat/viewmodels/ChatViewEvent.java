package com.squareup.cash.support.chat.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatViewEvent {

    public final class ActivityTransactionClicked extends ChatViewEvent {
        public final FormattedPaymentHistoryActivityItem activityItem;

        public ActivityTransactionClicked(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
            formattedPaymentHistoryActivityItem.getClass();
            this.activityItem = formattedPaymentHistoryActivityItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityTransactionClicked) && Intrinsics.areEqual(this.activityItem, ((ActivityTransactionClicked) obj).activityItem);
        }

        public final int hashCode() {
            return this.activityItem.hashCode();
        }

        public final String toString() {
            return "ActivityTransactionClicked(activityItem=" + this.activityItem + ")";
        }
    }

    public final class AttachImage extends ChatViewEvent {
        public final String fileUri;

        public AttachImage(String str) {
            this.fileUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AttachImage) && this.fileUri.equals(((AttachImage) obj).fileUri);
        }

        public final int hashCode() {
            return this.fileUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AttachImage(fileUri=", this.fileUri, ")");
        }
    }

    public final class BottomVisibleMessageChanged extends ChatViewEvent {
        public final boolean lastItemVisible;
        public final String messageToken;

        public BottomVisibleMessageChanged(String str, boolean z) {
            this.messageToken = str;
            this.lastItemVisible = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomVisibleMessageChanged)) {
                return false;
            }
            BottomVisibleMessageChanged bottomVisibleMessageChanged = (BottomVisibleMessageChanged) obj;
            return this.messageToken.equals(bottomVisibleMessageChanged.messageToken) && this.lastItemVisible == bottomVisibleMessageChanged.lastItemVisible;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.lastItemVisible) + (this.messageToken.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("BottomVisibleMessageChanged(messageToken=", this.messageToken, ", lastItemVisible=", ")", this.lastItemVisible);
        }
    }

    public final class ClickAction extends ChatViewEvent {
        public final BodyViewModel$ActionBodyViewModel.Action action;
        public final String messageToken;

        public ClickAction(String str, BodyViewModel$ActionBodyViewModel.Action action) {
            action.getClass();
            this.messageToken = str;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAction)) {
                return false;
            }
            ClickAction clickAction = (ClickAction) obj;
            return this.messageToken.equals(clickAction.messageToken) && Intrinsics.areEqual(this.action, clickAction.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.messageToken.hashCode() * 31);
        }

        public final String toString() {
            return "ClickAction(messageToken=" + this.messageToken + ", action=" + this.action + ")";
        }
    }

    public final class ClickImage extends ChatViewEvent {
        public final String url;

        public ClickImage(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickImage) && Intrinsics.areEqual(this.url, ((ClickImage) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClickImage(url=", this.url, ")");
        }
    }

    public final class ClickRetryImageLoad extends ChatViewEvent {
        public static final ClickRetryImageLoad INSTANCE = new ClickRetryImageLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClickRetryImageLoad);
        }

        public final int hashCode() {
            return -2027239178;
        }

        public final String toString() {
            return "ClickRetryImageLoad";
        }
    }

    public final class CloseChat extends ChatViewEvent {
        public static final CloseChat INSTANCE = new CloseChat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseChat);
        }

        public final int hashCode() {
            return 1096074725;
        }

        public final String toString() {
            return "CloseChat";
        }
    }

    public final class DeleteMessage extends ChatViewEvent {
        public final String messageToken;

        public DeleteMessage(String str) {
            str.getClass();
            this.messageToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteMessage) && Intrinsics.areEqual(this.messageToken, ((DeleteMessage) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeleteMessage(messageToken=", this.messageToken, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class FailedMessageClicked extends ChatViewEvent {
        public final String messageKey;

        public FailedMessageClicked(String str) {
            str.getClass();
            this.messageKey = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FailedMessageClicked) && Intrinsics.areEqual(this.messageKey, ((FailedMessageClicked) obj).messageKey);
        }

        public final int hashCode() {
            return this.messageKey.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FailedMessageClicked(messageKey=", this.messageKey, ")");
        }
    }

    public final class ImageLoadFailed extends ChatViewEvent {
        public final String message;

        public ImageLoadFailed(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImageLoadFailed) && Intrinsics.areEqual(this.message, ((ImageLoadFailed) obj).message);
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ImageLoadFailed(message=", this.message, ")");
        }
    }

    public final class InputChanged extends ChatViewEvent {
        public final String input;

        public InputChanged(String str) {
            this.input = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChanged) && Intrinsics.areEqual(this.input, ((InputChanged) obj).input);
        }

        public final int hashCode() {
            String str = this.input;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputChanged(input=", this.input, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class LaunchUrl extends ChatViewEvent {
        public final String messageToken;
        public final String url;

        public LaunchUrl(String str, String str2) {
            str2.getClass();
            this.messageToken = str;
            this.url = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchUrl)) {
                return false;
            }
            LaunchUrl launchUrl = (LaunchUrl) obj;
            return Intrinsics.areEqual(this.messageToken, launchUrl.messageToken) && Intrinsics.areEqual(this.url, launchUrl.url);
        }

        public final int hashCode() {
            String str = this.messageToken;
            return this.url.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("LaunchUrl(messageToken=", this.messageToken, ", url=", this.url, ")");
        }
    }

    public final class LoadOldMessages extends ChatViewEvent {
        public static final LoadOldMessages INSTANCE = new LoadOldMessages();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadOldMessages);
        }

        public final int hashCode() {
            return 1448191106;
        }

        public final String toString() {
            return "LoadOldMessages";
        }
    }

    public final class RemoveAttachment extends ChatViewEvent {
        public static final RemoveAttachment INSTANCE = new RemoveAttachment();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveAttachment);
        }

        public final int hashCode() {
            return -1643266382;
        }

        public final String toString() {
            return "RemoveAttachment";
        }
    }

    public final class ResendMessage extends ChatViewEvent {
        public final String messageToken;

        public ResendMessage(String str) {
            str.getClass();
            this.messageToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResendMessage) && Intrinsics.areEqual(this.messageToken, ((ResendMessage) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResendMessage(messageToken=", this.messageToken, ")");
        }
    }

    public final class SendMessage extends ChatViewEvent {
        public final String text;

        public SendMessage(String str) {
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendMessage) && Intrinsics.areEqual(this.text, ((SendMessage) obj).text);
        }

        public final int hashCode() {
            String str = this.text;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SendMessage(text=", this.text, ")");
        }
    }

    public final class SuggestedReplySelected extends ChatViewEvent {
        public final String token;

        public SuggestedReplySelected(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedReplySelected) && Intrinsics.areEqual(this.token, ((SuggestedReplySelected) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuggestedReplySelected(token=", this.token, ")");
        }
    }

    public final class UpdateCashApp extends ChatViewEvent {
        public static final UpdateCashApp INSTANCE = new UpdateCashApp();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateCashApp);
        }

        public final int hashCode() {
            return -2083861798;
        }

        public final String toString() {
            return "UpdateCashApp";
        }
    }
}
