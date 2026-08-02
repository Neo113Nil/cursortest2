package com.squareup.cash.support.chat.backend.real;

import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecordedTranscript {
    public final Conversation conversation;
    public final Map messages;
    public final PagingStatus pagingStatus;

    public RecordedTranscript(Map map, PagingStatus pagingStatus, Conversation conversation) {
        map.getClass();
        pagingStatus.getClass();
        this.messages = map;
        this.pagingStatus = pagingStatus;
        this.conversation = conversation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordedTranscript)) {
            return false;
        }
        RecordedTranscript recordedTranscript = (RecordedTranscript) obj;
        return Intrinsics.areEqual(this.messages, recordedTranscript.messages) && this.pagingStatus == recordedTranscript.pagingStatus && Intrinsics.areEqual(this.conversation, recordedTranscript.conversation);
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final Map getMessages() {
        return this.messages;
    }

    public final PagingStatus getPagingStatus() {
        return this.pagingStatus;
    }

    public final int hashCode() {
        int hashCode = (this.pagingStatus.hashCode() + (this.messages.hashCode() * 31)) * 31;
        Conversation conversation = this.conversation;
        return hashCode + (conversation == null ? 0 : conversation.botStatus.hashCode());
    }

    public final String toString() {
        return "RecordedTranscript(messages=" + this.messages + ", pagingStatus=" + this.pagingStatus + ", conversation=" + this.conversation + ")";
    }
}
