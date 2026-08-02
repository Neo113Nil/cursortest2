package com.squareup.protos.cash.kgoose.api.v3.cash;

import android.os.Parcelable;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type;", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type;", "Companion", "Builder", "Type", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResponseEnvelopeV2 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResponseEnvelopeV2> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Type type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Type type;

        @Override // com.squareup.wire.Message.Builder
        public ResponseEnvelopeV2 build() {
            return new ResponseEnvelopeV2(this.type, buildUnknownFields());
        }

        public final Builder type(Type type2) {
            this.type = type2;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type;", "", "Response", "Heartbeat", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type$Heartbeat;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type$Response;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Type {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.cash.GetMessagesHeartbeat#ADAPTER", declaredName = "heartbeat", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type$Heartbeat;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetMessagesHeartbeat;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetMessagesHeartbeat;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetMessagesHeartbeat;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Heartbeat extends Type {
            private final GetMessagesHeartbeat value;

            public Heartbeat(GetMessagesHeartbeat getMessagesHeartbeat) {
                getMessagesHeartbeat.getClass();
                this.value = getMessagesHeartbeat;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Heartbeat) && Intrinsics.areEqual(this.value, ((Heartbeat) obj).value);
            }

            public final GetMessagesHeartbeat getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Heartbeat(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse#ADAPTER", declaredName = "response", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type$Response;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Type;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Response extends Type {
            private final GetMessagesStreamResponse value;

            public Response(GetMessagesStreamResponse getMessagesStreamResponse) {
                getMessagesStreamResponse.getClass();
                this.value = getMessagesStreamResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Response) && Intrinsics.areEqual(this.value, ((Response) obj).value);
            }

            public final GetMessagesStreamResponse getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Response(value=" + this.value + ")";
            }
        }
    }

    static {
        ResponseEnvelopeV2$Companion$ADAPTER$1 responseEnvelopeV2$Companion$ADAPTER$1 = new ResponseEnvelopeV2$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResponseEnvelopeV2.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.cash.ResponseEnvelopeV2", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_streaming_service.proto");
        ADAPTER = responseEnvelopeV2$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(responseEnvelopeV2$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseEnvelopeV2(Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = type2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseEnvelopeV2)) {
            return false;
        }
        ResponseEnvelopeV2 responseEnvelopeV2 = (ResponseEnvelopeV2) obj;
        return Intrinsics.areEqual(unknownFields(), responseEnvelopeV2.unknownFields()) && Intrinsics.areEqual(this.type, responseEnvelopeV2.type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.type;
        int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResponseEnvelopeV2{", "}", 0, null, null, 56);
    }
}
