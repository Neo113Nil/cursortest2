package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\u0006\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response;", "response", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response;", "Companion", "Builder", "Response", "DeltaMessageContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMessagesStreamResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMessagesStreamResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Response response;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse;", "<init>", "()V", "response", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Response response;

        @Override // com.squareup.wire.Message.Builder
        public GetMessagesStreamResponse build() {
            return new GetMessagesStreamResponse(this.response, buildUnknownFields());
        }

        public final Builder response(Response response) {
            this.response = response;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent$Builder;", "", "streaming_message_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "message_content", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "", "is_final", "Ljava/lang/Boolean;", "is_start", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeltaMessageContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeltaMessageContent> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
        public final Boolean is_final;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
        public final Boolean is_start;

        @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MessageContent#ADAPTER", schemaIndex = 1, tag = 2)
        public final MessageContent message_content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String streaming_message_id;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent;", "<init>", "()V", "streaming_message_id", "", "message_content", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "is_final", "", "Ljava/lang/Boolean;", "is_start", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Boolean is_final;
            public Boolean is_start;
            public MessageContent message_content;
            public String streaming_message_id;

            @Override // com.squareup.wire.Message.Builder
            public DeltaMessageContent build() {
                return new DeltaMessageContent(this.streaming_message_id, this.message_content, this.is_final, this.is_start, buildUnknownFields());
            }

            public final Builder is_final(Boolean is_final) {
                this.is_final = is_final;
                return this;
            }

            public final Builder is_start(Boolean is_start) {
                this.is_start = is_start;
                return this;
            }

            public final Builder message_content(MessageContent message_content) {
                this.message_content = message_content;
                return this;
            }

            public final Builder streaming_message_id(String streaming_message_id) {
                this.streaming_message_id = streaming_message_id;
                return this;
            }
        }

        static {
            GetMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1 getMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1 = new GetMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeltaMessageContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetMessagesStreamResponse.DeltaMessageContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
            ADAPTER = getMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeltaMessageContent(String str, MessageContent messageContent, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.streaming_message_id = str;
            this.message_content = messageContent;
            this.is_final = bool;
            this.is_start = bool2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeltaMessageContent)) {
                return false;
            }
            DeltaMessageContent deltaMessageContent = (DeltaMessageContent) obj;
            return Intrinsics.areEqual(unknownFields(), deltaMessageContent.unknownFields()) && Intrinsics.areEqual(this.streaming_message_id, deltaMessageContent.streaming_message_id) && Intrinsics.areEqual(this.message_content, deltaMessageContent.message_content) && Intrinsics.areEqual(this.is_final, deltaMessageContent.is_final) && Intrinsics.areEqual(this.is_start, deltaMessageContent.is_start);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.streaming_message_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            MessageContent messageContent = this.message_content;
            int hashCode3 = (hashCode2 + (messageContent != null ? messageContent.hashCode() : 0)) * 37;
            Boolean bool = this.is_final;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_start;
            int hashCode5 = hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.streaming_message_id = this.streaming_message_id;
            builder.message_content = this.message_content;
            builder.is_final = this.is_final;
            builder.is_start = this.is_start;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.streaming_message_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "streaming_message_id=", arrayList);
            }
            MessageContent messageContent = this.message_content;
            if (messageContent != null) {
                arrayList.add("message_content=" + messageContent);
            }
            Boolean bool = this.is_final;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_final=", bool, arrayList);
            }
            Boolean bool2 = this.is_start;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_start=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeltaMessageContent{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response;", "", "GetMessagesResponse", "DeltaMessageContent", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response$DeltaMessageContent;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response$GetMessagesResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Response {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse$DeltaMessageContent#ADAPTER", declaredName = "delta_message_content", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response$DeltaMessageContent;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DeltaMessageContent extends Response {
            private final DeltaMessageContent value;

            public DeltaMessageContent(DeltaMessageContent deltaMessageContent) {
                deltaMessageContent.getClass();
                this.value = deltaMessageContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeltaMessageContent) && Intrinsics.areEqual(this.value, ((DeltaMessageContent) obj).value);
            }

            public final DeltaMessageContent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DeltaMessageContent(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse#ADAPTER", declaredName = "get_messages_response", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response$GetMessagesResponse;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Response;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GetMessagesResponse extends Response {
            private final com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse value;

            public GetMessagesResponse(com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse getMessagesResponse) {
                getMessagesResponse.getClass();
                this.value = getMessagesResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GetMessagesResponse) && Intrinsics.areEqual(this.value, ((GetMessagesResponse) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GetMessagesResponse(value=" + this.value + ")";
            }
        }
    }

    static {
        GetMessagesStreamResponse$Companion$ADAPTER$1 getMessagesStreamResponse$Companion$ADAPTER$1 = new GetMessagesStreamResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMessagesStreamResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetMessagesStreamResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = getMessagesStreamResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMessagesStreamResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessagesStreamResponse(Response response, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = response;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMessagesStreamResponse)) {
            return false;
        }
        GetMessagesStreamResponse getMessagesStreamResponse = (GetMessagesStreamResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMessagesStreamResponse.unknownFields()) && Intrinsics.areEqual(this.response, getMessagesStreamResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Response response = this.response;
        int hashCode2 = hashCode + (response != null ? response.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.response = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Response response = this.response;
        if (response != null) {
            arrayList.add("response=" + response);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMessagesStreamResponse{", "}", 0, null, null, 56);
    }
}
