package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetBlockedCustomersRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBlockedCustomersRequest> CREATOR;
    public final BlockingContext blocking_context;
    public final String from_customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetBlockedCustomersRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest$Companion$ADAPTER$1
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
                        return new GetBlockedCustomersRequest((String) obj, (BlockingContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = BlockingContext.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetBlockedCustomersRequest getBlockedCustomersRequest = (GetBlockedCustomersRequest) obj;
                reverseProtoWriter.getClass();
                getBlockedCustomersRequest.getClass();
                reverseProtoWriter.writeBytes(getBlockedCustomersRequest.unknownFields());
                BlockingContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getBlockedCustomersRequest.blocking_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getBlockedCustomersRequest.from_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetBlockedCustomersRequest getBlockedCustomersRequest = (GetBlockedCustomersRequest) obj;
                getBlockedCustomersRequest.getClass();
                return BlockingContext.ADAPTER.encodedSizeWithTag(2, getBlockedCustomersRequest.blocking_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, getBlockedCustomersRequest.from_customer_token) + getBlockedCustomersRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetBlockedCustomersRequest getBlockedCustomersRequest = (GetBlockedCustomersRequest) obj;
                getBlockedCustomersRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getBlockedCustomersRequest.from_customer_token;
                BlockingContext blockingContext = getBlockedCustomersRequest.blocking_context;
                byteString.getClass();
                return new GetBlockedCustomersRequest(str, blockingContext, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetBlockedCustomersRequest getBlockedCustomersRequest = (GetBlockedCustomersRequest) obj;
                getBlockedCustomersRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getBlockedCustomersRequest.from_customer_token);
                BlockingContext.ADAPTER.encodeWithTag(protoWriter, 2, getBlockedCustomersRequest.blocking_context);
                protoWriter.writeBytes(getBlockedCustomersRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBlockedCustomersRequest(String str, BlockingContext blockingContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.from_customer_token = str;
        this.blocking_context = blockingContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBlockedCustomersRequest)) {
            return false;
        }
        GetBlockedCustomersRequest getBlockedCustomersRequest = (GetBlockedCustomersRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getBlockedCustomersRequest.unknownFields()) && Intrinsics.areEqual(this.from_customer_token, getBlockedCustomersRequest.from_customer_token) && this.blocking_context == getBlockedCustomersRequest.blocking_context;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.from_customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BlockingContext blockingContext = this.blocking_context;
        int hashCode3 = hashCode2 + (blockingContext != null ? blockingContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(4);
        builder.errors = this.from_customer_token;
        builder.result = this.blocking_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.from_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "from_customer_token=", arrayList);
        }
        BlockingContext blockingContext = this.blocking_context;
        if (blockingContext != null) {
            arrayList.add("blocking_context=" + blockingContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBlockedCustomersRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetBlockedCustomersRequest(String str, BlockingContext blockingContext) {
        this(str, blockingContext, ByteString.EMPTY);
    }
}
