package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateAppOrderResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateAppOrderResponse((ResponseContext) obj, (CreateOrderResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CreateOrderResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateAppOrderResponse createAppOrderResponse = (CreateAppOrderResponse) obj;
        reverseProtoWriter.getClass();
        createAppOrderResponse.getClass();
        reverseProtoWriter.writeBytes(createAppOrderResponse.unknownFields());
        CreateOrderResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createAppOrderResponse.response);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createAppOrderResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateAppOrderResponse createAppOrderResponse = (CreateAppOrderResponse) obj;
        createAppOrderResponse.getClass();
        return CreateOrderResponse.ADAPTER.encodedSizeWithTag(2, createAppOrderResponse.response) + ResponseContext.ADAPTER.encodedSizeWithTag(1, createAppOrderResponse.response_context) + createAppOrderResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateAppOrderResponse createAppOrderResponse = (CreateAppOrderResponse) obj;
        createAppOrderResponse.getClass();
        ResponseContext responseContext = createAppOrderResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        CreateOrderResponse createOrderResponse = createAppOrderResponse.response;
        CreateOrderResponse createOrderResponse2 = createOrderResponse != null ? (CreateOrderResponse) CreateOrderResponse.ADAPTER.redact(createOrderResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateAppOrderResponse(responseContext2, createOrderResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateAppOrderResponse createAppOrderResponse = (CreateAppOrderResponse) obj;
        createAppOrderResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, createAppOrderResponse.response_context);
        CreateOrderResponse.ADAPTER.encodeWithTag(protoWriter, 2, createAppOrderResponse.response);
        protoWriter.writeBytes(createAppOrderResponse.unknownFields());
    }
}
