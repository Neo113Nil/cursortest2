package com.squareup.cash.support.chat.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatState {
    public final boolean canUseEnhancedSuggestedReplies;
    public final Conversation conversation;
    public final MessageBody.FileBody fileAttachment;
    public final boolean hasAcceptedHandover;
    public final boolean hasInput;
    public final List ignoredPhrases;
    public final boolean initialState;
    public final boolean isUserTyping;
    public final boolean lastItemVisible;
    public final String lastReadMessageToken;
    public final List messages;
    public final PagingStatus oldMessageStatus;
    public final List oldMessages;
    public final String savedInput;
    public final boolean shouldDisableCashbotFileUpload;
    public final boolean shouldShowTypingIndicator;
    public final List suggestedReplies;
    public final int unreadMessageCount;

    public ChatState(List list, List list2, boolean z, List list3, boolean z2, PagingStatus pagingStatus, MessageBody.FileBody fileBody, String str, String str2, boolean z3, Conversation conversation, int i, List list4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        pagingStatus.getClass();
        list4.getClass();
        this.messages = list;
        this.oldMessages = list2;
        this.initialState = z;
        this.suggestedReplies = list3;
        this.hasInput = z2;
        this.oldMessageStatus = pagingStatus;
        this.fileAttachment = fileBody;
        this.lastReadMessageToken = str;
        this.savedInput = str2;
        this.isUserTyping = z3;
        this.conversation = conversation;
        this.unreadMessageCount = i;
        this.ignoredPhrases = list4;
        this.lastItemVisible = z4;
        this.canUseEnhancedSuggestedReplies = z5;
        this.shouldShowTypingIndicator = z6;
        this.shouldDisableCashbotFileUpload = z7;
        this.hasAcceptedHandover = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatState)) {
            return false;
        }
        ChatState chatState = (ChatState) obj;
        return Intrinsics.areEqual(this.messages, chatState.messages) && Intrinsics.areEqual(this.oldMessages, chatState.oldMessages) && this.initialState == chatState.initialState && Intrinsics.areEqual(this.suggestedReplies, chatState.suggestedReplies) && this.hasInput == chatState.hasInput && this.oldMessageStatus == chatState.oldMessageStatus && Intrinsics.areEqual(this.fileAttachment, chatState.fileAttachment) && Intrinsics.areEqual(this.lastReadMessageToken, chatState.lastReadMessageToken) && Intrinsics.areEqual(this.savedInput, chatState.savedInput) && this.isUserTyping == chatState.isUserTyping && Intrinsics.areEqual(this.conversation, chatState.conversation) && this.unreadMessageCount == chatState.unreadMessageCount && Intrinsics.areEqual(this.ignoredPhrases, chatState.ignoredPhrases) && this.lastItemVisible == chatState.lastItemVisible && this.canUseEnhancedSuggestedReplies == chatState.canUseEnhancedSuggestedReplies && this.shouldShowTypingIndicator == chatState.shouldShowTypingIndicator && this.shouldDisableCashbotFileUpload == chatState.shouldDisableCashbotFileUpload && this.hasAcceptedHandover == chatState.hasAcceptedHandover;
    }

    public final int hashCode() {
        int hashCode = (this.oldMessageStatus.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.messages.hashCode() * 31, 31, this.oldMessages), 31, this.initialState), 31, this.suggestedReplies), 31, this.hasInput)) * 31;
        MessageBody.FileBody fileBody = this.fileAttachment;
        int hashCode2 = (hashCode + (fileBody == null ? 0 : fileBody.hashCode())) * 31;
        String str = this.lastReadMessageToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.savedInput;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isUserTyping);
        Conversation conversation = this.conversation;
        return Boolean.hashCode(this.hasAcceptedHandover) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.unreadMessageCount, (m + (conversation != null ? conversation.botStatus.hashCode() : 0)) * 31, 31), 31, this.ignoredPhrases), 31, this.lastItemVisible), 31, this.canUseEnhancedSuggestedReplies), 31, this.shouldShowTypingIndicator), 31, this.shouldDisableCashbotFileUpload);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("ChatState(messages=", ", oldMessages=", ", initialState=", this.messages, this.oldMessages);
        m.append(this.initialState);
        m.append(", suggestedReplies=");
        m.append(this.suggestedReplies);
        m.append(", hasInput=");
        m.append(this.hasInput);
        m.append(", oldMessageStatus=");
        m.append(this.oldMessageStatus);
        m.append(", fileAttachment=");
        m.append(this.fileAttachment);
        m.append(", lastReadMessageToken=");
        m.append(this.lastReadMessageToken);
        m.append(", savedInput=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.savedInput, ", isUserTyping=", this.isUserTyping, ", conversation=");
        m.append(this.conversation);
        m.append(", unreadMessageCount=");
        m.append(this.unreadMessageCount);
        m.append(", ignoredPhrases=");
        m.append(this.ignoredPhrases);
        m.append(", lastItemVisible=");
        m.append(this.lastItemVisible);
        m.append(", canUseEnhancedSuggestedReplies=");
        re$$ExternalSyntheticOutline0.m(m, this.canUseEnhancedSuggestedReplies, ", shouldShowTypingIndicator=", this.shouldShowTypingIndicator, ", shouldDisableCashbotFileUpload=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.shouldDisableCashbotFileUpload, ", hasAcceptedHandover=", this.hasAcceptedHandover, ")");
    }
}
