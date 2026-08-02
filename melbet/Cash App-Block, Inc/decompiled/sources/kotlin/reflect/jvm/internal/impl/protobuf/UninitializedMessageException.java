package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes9.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
