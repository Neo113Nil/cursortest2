package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.OutputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MessagingClientEventExtension {
    private static final MessagingClientEventExtension DEFAULT_INSTANCE = new Builder().build();
    private final MessagingClientEvent messaging_client_event_;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder {
        private MessagingClientEvent messaging_client_event_ = null;

        public MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.messaging_client_event_);
        }

        public Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.messaging_client_event_ = messagingClientEvent;
            return this;
        }
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.messaging_client_event_;
        return messagingClientEvent == null ? MessagingClientEvent.getDefaultInstance() : messagingClientEvent;
    }

    @Encodable.Field(name = "messagingClientEvent")
    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.messaging_client_event_;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
