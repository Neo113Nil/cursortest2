package com.squareup.cash.support.chat.backend.api;

import androidx.glance.session.TimerScopeKt;
import com.squareup.cash.support.chat.backend.api.Message;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PendingMessage extends Message {
    public final MessageBody body;
    public final String idempotenceToken;
    public final Message.Sender sender;
    public final TimerScopeKt status;
    public final Instant timestamp;

    public PendingMessage(String str, Instant instant, MessageBody messageBody, TimerScopeKt timerScopeKt) {
        str.getClass();
        instant.getClass();
        messageBody.getClass();
        this.idempotenceToken = str;
        this.timestamp = instant;
        this.body = messageBody;
        this.status = timerScopeKt;
        this.sender = Message.Sender.CUSTOMER;
    }

    public static PendingMessage copy$default(PendingMessage pendingMessage, Instant instant, MessageBody messageBody, TimerScopeKt timerScopeKt, int i) {
        String str = pendingMessage.idempotenceToken;
        if ((i & 2) != 0) {
            instant = pendingMessage.timestamp;
        }
        if ((i & 4) != 0) {
            messageBody = pendingMessage.body;
        }
        if ((i & 8) != 0) {
            timerScopeKt = pendingMessage.status;
        }
        pendingMessage.getClass();
        str.getClass();
        instant.getClass();
        messageBody.getClass();
        return new PendingMessage(str, instant, messageBody, timerScopeKt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) obj;
        return Intrinsics.areEqual(this.idempotenceToken, pendingMessage.idempotenceToken) && Intrinsics.areEqual(this.timestamp, pendingMessage.timestamp) && Intrinsics.areEqual(this.body, pendingMessage.body) && this.status.equals(pendingMessage.status);
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final MessageBody getBody() {
        return this.body;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final String getIdempotenceToken() {
        return this.idempotenceToken;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final Message.Sender getSender() {
        return this.sender;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final TimerScopeKt getStatus() {
        return this.status;
    }

    @Override // com.squareup.cash.support.chat.backend.api.Message
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final int hashCode() {
        return this.status.hashCode() + ((this.body.hashCode() + ((this.timestamp.hashCode() + (this.idempotenceToken.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PendingMessage(idempotenceToken=" + this.idempotenceToken + ", timestamp=" + this.timestamp + ", body=" + this.body + ", status=" + this.status + ")";
    }
}
