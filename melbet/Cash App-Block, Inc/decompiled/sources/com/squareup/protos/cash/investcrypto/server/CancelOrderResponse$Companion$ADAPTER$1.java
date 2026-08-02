package com.squareup.protos.cash.investcrypto.server;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investcrypto.server.CancelOrderResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CancelOrderResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelOrderResponse((CancelOrderResponse.Result) obj, (ResponseContext) obj2, (CancelOrderResponse.InternalResponse) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CancelOrderResponse.Result.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CancelOrderResponse.InternalResponse.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        reverseProtoWriter.getClass();
        cancelOrderResponse.getClass();
        reverseProtoWriter.writeBytes(cancelOrderResponse.unknownFields());
        CancelOrderResponse.InternalResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cancelOrderResponse.internal_response);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cancelOrderResponse.response_context);
        CancelOrderResponse.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cancelOrderResponse.result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        cancelOrderResponse.getClass();
        return CancelOrderResponse.InternalResponse.ADAPTER.encodedSizeWithTag(6, cancelOrderResponse.internal_response) + ResponseContext.ADAPTER.encodedSizeWithTag(2, cancelOrderResponse.response_context) + CancelOrderResponse.Result.ADAPTER.encodedSizeWithTag(1, cancelOrderResponse.result) + cancelOrderResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        cancelOrderResponse.getClass();
        ResponseContext responseContext = cancelOrderResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        CancelOrderResponse.InternalResponse internalResponse = cancelOrderResponse.internal_response;
        CancelOrderResponse.InternalResponse internalResponse2 = internalResponse != null ? (CancelOrderResponse.InternalResponse) CancelOrderResponse.InternalResponse.ADAPTER.redact(internalResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        CancelOrderResponse.Result result = cancelOrderResponse.result;
        byteString.getClass();
        return new CancelOrderResponse(result, responseContext2, internalResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        cancelOrderResponse.getClass();
        CancelOrderResponse.Result.ADAPTER.encodeWithTag(protoWriter, 1, cancelOrderResponse.result);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, cancelOrderResponse.response_context);
        CancelOrderResponse.InternalResponse.ADAPTER.encodeWithTag(protoWriter, 6, cancelOrderResponse.internal_response);
        protoWriter.writeBytes(cancelOrderResponse.unknownFields());
    }
}
