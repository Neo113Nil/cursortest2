package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "", "base_system_preamble_only", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetRuntimeMetadataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRuntimeMetadataRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean base_system_preamble_only;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatContext#ADAPTER", schemaIndex = 0, tag = 1)
    public final ChatContext chat_context;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest;", "<init>", "()V", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "base_system_preamble_only", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public Boolean base_system_preamble_only;
        public ChatContext chat_context;

        public final Builder base_system_preamble_only(Boolean base_system_preamble_only) {
            this.base_system_preamble_only = base_system_preamble_only;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetRuntimeMetadataRequest build() {
            return new GetRuntimeMetadataRequest(this.chat_context, this.base_system_preamble_only, buildUnknownFields());
        }

        public final Builder chat_context(ChatContext chat_context) {
            this.chat_context = chat_context;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetRuntimeMetadataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.GetRuntimeMetadataRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetRuntimeMetadataRequest((ChatContext) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ChatContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetRuntimeMetadataRequest getRuntimeMetadataRequest = (GetRuntimeMetadataRequest) obj;
                reverseProtoWriter.getClass();
                getRuntimeMetadataRequest.getClass();
                reverseProtoWriter.writeBytes(getRuntimeMetadataRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, getRuntimeMetadataRequest.base_system_preamble_only);
                ChatContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getRuntimeMetadataRequest.chat_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetRuntimeMetadataRequest getRuntimeMetadataRequest = (GetRuntimeMetadataRequest) obj;
                getRuntimeMetadataRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, getRuntimeMetadataRequest.base_system_preamble_only) + ChatContext.ADAPTER.encodedSizeWithTag(1, getRuntimeMetadataRequest.chat_context) + getRuntimeMetadataRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetRuntimeMetadataRequest getRuntimeMetadataRequest = (GetRuntimeMetadataRequest) obj;
                getRuntimeMetadataRequest.getClass();
                ChatContext chatContext = getRuntimeMetadataRequest.chat_context;
                ChatContext chatContext2 = chatContext != null ? (ChatContext) ChatContext.ADAPTER.redact(chatContext) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = getRuntimeMetadataRequest.base_system_preamble_only;
                byteString.getClass();
                return new GetRuntimeMetadataRequest(chatContext2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetRuntimeMetadataRequest getRuntimeMetadataRequest = (GetRuntimeMetadataRequest) obj;
                getRuntimeMetadataRequest.getClass();
                ChatContext.ADAPTER.encodeWithTag(protoWriter, 1, getRuntimeMetadataRequest.chat_context);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getRuntimeMetadataRequest.base_system_preamble_only);
                protoWriter.writeBytes(getRuntimeMetadataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRuntimeMetadataRequest(ChatContext chatContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.chat_context = chatContext;
        this.base_system_preamble_only = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRuntimeMetadataRequest)) {
            return false;
        }
        GetRuntimeMetadataRequest getRuntimeMetadataRequest = (GetRuntimeMetadataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getRuntimeMetadataRequest.unknownFields()) && Intrinsics.areEqual(this.chat_context, getRuntimeMetadataRequest.chat_context) && Intrinsics.areEqual(this.base_system_preamble_only, getRuntimeMetadataRequest.base_system_preamble_only);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ChatContext chatContext = this.chat_context;
        int hashCode2 = (hashCode + (chatContext != null ? chatContext.hashCode() : 0)) * 37;
        Boolean bool = this.base_system_preamble_only;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.chat_context = this.chat_context;
        builder.base_system_preamble_only = this.base_system_preamble_only;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ChatContext chatContext = this.chat_context;
        if (chatContext != null) {
            arrayList.add("chat_context=" + chatContext);
        }
        Boolean bool = this.base_system_preamble_only;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("base_system_preamble_only=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRuntimeMetadataRequest{", "}", 0, null, null, 56);
    }
}
