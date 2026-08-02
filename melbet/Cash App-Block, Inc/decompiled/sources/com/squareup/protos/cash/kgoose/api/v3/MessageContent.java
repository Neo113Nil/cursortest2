package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageType;", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageType;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Companion", "Builder", "Content", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MessageContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Content content;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MessageType#ADAPTER", schemaIndex = 0, tag = 1)
    public final MessageType type;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageType;", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Content content;
        public MessageType type;

        @Override // com.squareup.wire.Message.Builder
        public MessageContent build() {
            return new MessageContent(this.type, this.content, buildUnknownFields());
        }

        public final Builder content(Content content) {
            this.content = content;
            return this;
        }

        public final Builder type(MessageType type2) {
            this.type = type2;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "", "Text", "Image", "ToolRequest", "ToolResponse", "Thinking", "RedactedThinking", "File", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$File;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$RedactedThinking;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$Text;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$Thinking;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$ToolRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$ToolResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Content {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.FileContent#ADAPTER", declaredName = "file", tag = 8)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$File;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/FileContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/FileContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/FileContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class File extends Content {
            private final FileContent value;

            public File(FileContent fileContent) {
                fileContent.getClass();
                this.value = fileContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof File) && Intrinsics.areEqual(this.value, ((File) obj).value);
            }

            public final FileContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "File(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ImageContent#ADAPTER", declaredName = "image", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Image extends Content {
            private final ImageContent value;

            public Image(ImageContent imageContent) {
                imageContent.getClass();
                this.value = imageContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && Intrinsics.areEqual(this.value, ((Image) obj).value);
            }

            public final ImageContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Image(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RedactedThinkingContent#ADAPTER", declaredName = "redacted_thinking", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$RedactedThinking;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/RedactedThinkingContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/RedactedThinkingContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/RedactedThinkingContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RedactedThinking extends Content {
            private final RedactedThinkingContent value;

            public RedactedThinking(RedactedThinkingContent redactedThinkingContent) {
                redactedThinkingContent.getClass();
                this.value = redactedThinkingContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RedactedThinking) && Intrinsics.areEqual(this.value, ((RedactedThinking) obj).value);
            }

            public final RedactedThinkingContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RedactedThinking(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TextContent#ADAPTER", declaredName = "text", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$Text;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TextContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TextContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Text extends Content {
            private final TextContent value;

            public Text(TextContent textContent) {
                textContent.getClass();
                this.value = textContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
            }

            public final TextContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Text(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ThinkingContent#ADAPTER", declaredName = "thinking", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$Thinking;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ThinkingContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ThinkingContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ThinkingContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Thinking extends Content {
            private final ThinkingContent value;

            public Thinking(ThinkingContent thinkingContent) {
                thinkingContent.getClass();
                this.value = thinkingContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Thinking) && Intrinsics.areEqual(this.value, ((Thinking) obj).value);
            }

            public final ThinkingContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Thinking(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolRequest#ADAPTER", declaredName = "tool_request", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$ToolRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ToolRequest extends Content {
            private final com.squareup.protos.cash.kgoose.api.v3.ToolRequest value;

            public ToolRequest(com.squareup.protos.cash.kgoose.api.v3.ToolRequest toolRequest) {
                toolRequest.getClass();
                this.value = toolRequest;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToolRequest) && Intrinsics.areEqual(this.value, ((ToolRequest) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ToolRequest getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ToolRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolResponse#ADAPTER", declaredName = "tool_response", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content$ToolResponse;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolResponse;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolResponse;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ToolResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ToolResponse extends Content {
            private final com.squareup.protos.cash.kgoose.api.v3.ToolResponse value;

            public ToolResponse(com.squareup.protos.cash.kgoose.api.v3.ToolResponse toolResponse) {
                toolResponse.getClass();
                this.value = toolResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToolResponse) && Intrinsics.areEqual(this.value, ((ToolResponse) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ToolResponse getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ToolResponse(value=" + this.value + ")";
            }
        }
    }

    static {
        MessageContent$Companion$ADAPTER$1 messageContent$Companion$ADAPTER$1 = new MessageContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MessageContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.MessageContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = messageContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(messageContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContent(MessageType messageType, Content content, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = messageType;
        this.content = content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageContent)) {
            return false;
        }
        MessageContent messageContent = (MessageContent) obj;
        return Intrinsics.areEqual(unknownFields(), messageContent.unknownFields()) && this.type == messageContent.type && Intrinsics.areEqual(this.content, messageContent.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MessageType messageType = this.type;
        int hashCode2 = (hashCode + (messageType != null ? messageType.hashCode() : 0)) * 37;
        Content content = this.content;
        int hashCode3 = hashCode2 + (content != null ? content.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MessageType messageType = this.type;
        if (messageType != null) {
            arrayList.add("type=" + messageType);
        }
        Content content = this.content;
        if (content != null) {
            arrayList.add("content=" + content);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MessageContent{", "}", 0, null, null, 56);
    }
}
