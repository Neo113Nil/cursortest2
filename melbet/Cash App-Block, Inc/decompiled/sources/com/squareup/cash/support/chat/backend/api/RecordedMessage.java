package com.squareup.cash.support.chat.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.glance.session.TimerScopeKt;
import com.squareup.cash.support.chat.backend.api.Message;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecordedMessage extends Message {
    public final MessageBody body;
    public final String disclaimerMarkdown;
    public final String idempotenceToken;
    public final String messageToken;
    public final Message.Sender sender;
    public final ArrayList suggestedReplies;
    public final Instant timestamp;

    public RecordedMessage(String str, Instant instant, MessageBody messageBody, Message.Sender sender, String str2, ArrayList arrayList, String str3) {
        instant.getClass();
        str2.getClass();
        this.idempotenceToken = str;
        this.timestamp = instant;
        this.body = messageBody;
        this.sender = sender;
        this.messageToken = str2;
        this.suggestedReplies = arrayList;
        this.disclaimerMarkdown = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordedMessage)) {
            return false;
        }
        RecordedMessage recordedMessage = (RecordedMessage) obj;
        return Intrinsics.areEqual(this.idempotenceToken, recordedMessage.idempotenceToken) && Intrinsics.areEqual(this.timestamp, recordedMessage.timestamp) && this.body.equals(recordedMessage.body) && this.sender == recordedMessage.sender && Intrinsics.areEqual(this.messageToken, recordedMessage.messageToken) && this.suggestedReplies.equals(recordedMessage.suggestedReplies) && Intrinsics.areEqual(this.disclaimerMarkdown, recordedMessage.disclaimerMarkdown);
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final MessageBody getBody() {
        return this.body;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final String getIdempotenceToken() {
        return this.idempotenceToken;
    }

    public final String getMessageToken() {
        return this.messageToken;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final Message.Sender getSender() {
        return this.sender;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final /* bridge */ /* synthetic */ TimerScopeKt getStatus() {
        return MessageStatus$Recorded.INSTANCE;
    }

    public final List getSuggestedReplies() {
        return this.suggestedReplies;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final int hashCode() {
        String str = this.idempotenceToken;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.suggestedReplies, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.sender.hashCode() + ((this.body.hashCode() + ((this.timestamp.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.messageToken), 31);
        String str2 = this.disclaimerMarkdown;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordedMessage(idempotenceToken=");
        sb.append(this.idempotenceToken);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", messageToken=");
        sb.append(this.messageToken);
        sb.append(", suggestedReplies=");
        sb.append(this.suggestedReplies);
        sb.append(", disclaimerMarkdown=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.disclaimerMarkdown, ")");
    }
}
