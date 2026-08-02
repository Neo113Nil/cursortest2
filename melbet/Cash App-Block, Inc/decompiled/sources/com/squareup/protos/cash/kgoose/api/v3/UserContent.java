package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "Companion", "Builder", "Content", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Content content;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "<init>", "()V", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Content content;

        @Override // com.squareup.wire.Message.Builder
        public UserContent build() {
            return new UserContent(this.content, buildUnknownFields());
        }

        public final Builder content(Content content) {
            this.content = content;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "", "Text", "Image", "ClientRenderable", "StructuredContent", "Resource", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$ClientRenderable;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$Resource;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$StructuredContent;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$Text;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Content {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$ClientRenderable;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderable#ADAPTER", declaredName = "client_renderable", tag = 3)
        @Deprecated
        public static final /* data */ class ClientRenderable extends Content {
            private final com.squareup.protos.cash.kgoose.api.v3.ClientRenderable value;

            public ClientRenderable(com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable) {
                clientRenderable.getClass();
                this.value = clientRenderable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRenderable) && Intrinsics.areEqual(this.value, ((ClientRenderable) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ClientRenderable getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ClientRenderable(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ImageContent#ADAPTER", declaredName = "image", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.EmbeddedResource#ADAPTER", declaredName = "resource", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$Resource;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Resource extends Content {
            private final EmbeddedResource value;

            public Resource(EmbeddedResource embeddedResource) {
                embeddedResource.getClass();
                this.value = embeddedResource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Resource) && Intrinsics.areEqual(this.value, ((Resource) obj).value);
            }

            public final EmbeddedResource getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Resource(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.StructuredContent#ADAPTER", declaredName = "structured_content", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$StructuredContent;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StructuredContent extends Content {
            private final com.squareup.protos.cash.kgoose.api.v3.StructuredContent value;

            public StructuredContent(com.squareup.protos.cash.kgoose.api.v3.StructuredContent structuredContent) {
                structuredContent.getClass();
                this.value = structuredContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StructuredContent) && Intrinsics.areEqual(this.value, ((StructuredContent) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.StructuredContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "StructuredContent(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TextContent#ADAPTER", declaredName = "text", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content$Text;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TextContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TextContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
    }

    static {
        UserContent$Companion$ADAPTER$1 userContent$Companion$ADAPTER$1 = new UserContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UserContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.UserContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = userContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(userContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserContent(Content content, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserContent)) {
            return false;
        }
        UserContent userContent = (UserContent) obj;
        return Intrinsics.areEqual(unknownFields(), userContent.unknownFields()) && Intrinsics.areEqual(this.content, userContent.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Content content = this.content;
        int hashCode2 = hashCode + (content != null ? content.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Content content = this.content;
        if (content != null) {
            arrayList.add("content=" + content);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserContent{", "}", 0, null, null, 56);
    }
}
