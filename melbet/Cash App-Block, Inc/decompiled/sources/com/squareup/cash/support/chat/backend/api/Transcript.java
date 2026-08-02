package com.squareup.cash.support.chat.backend.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Transcript {
    public final Conversation conversation;
    public final List messages;
    public final PagingStatus pagingStatus;

    public Transcript(List list, PagingStatus pagingStatus, Conversation conversation) {
        list.getClass();
        pagingStatus.getClass();
        this.messages = list;
        this.pagingStatus = pagingStatus;
        this.conversation = conversation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transcript)) {
            return false;
        }
        Transcript transcript = (Transcript) obj;
        return Intrinsics.areEqual(this.messages, transcript.messages) && this.pagingStatus == transcript.pagingStatus && Intrinsics.areEqual(this.conversation, transcript.conversation);
    }

    public final int hashCode() {
        int hashCode = (this.pagingStatus.hashCode() + (this.messages.hashCode() * 31)) * 31;
        Conversation conversation = this.conversation;
        return hashCode + (conversation == null ? 0 : conversation.botStatus.hashCode());
    }

    public final String toString() {
        return "Transcript(messages=" + this.messages + ", pagingStatus=" + this.pagingStatus + ", conversation=" + this.conversation + ")";
    }
}
