package com.squareup.protos.cash.cashsourceoffunds.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DismissLimitsPageletMessageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DismissLimitsPageletMessageResponse((ResponseContext) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DismissLimitsPageletMessageResponse dismissLimitsPageletMessageResponse = (DismissLimitsPageletMessageResponse) obj;
        reverseProtoWriter.getClass();
        dismissLimitsPageletMessageResponse.getClass();
        reverseProtoWriter.writeBytes(dismissLimitsPageletMessageResponse.unknownFields());
        ProtoAdapter protoAdapter = ResponseContext.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dismissLimitsPageletMessageResponse.response_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dismissLimitsPageletMessageResponse.response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DismissLimitsPageletMessageResponse dismissLimitsPageletMessageResponse = (DismissLimitsPageletMessageResponse) obj;
        dismissLimitsPageletMessageResponse.getClass();
        int size$okio = dismissLimitsPageletMessageResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ResponseContext.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, dismissLimitsPageletMessageResponse.response_context) + protoAdapter.encodedSizeWithTag(2, dismissLimitsPageletMessageResponse.response) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DismissLimitsPageletMessageResponse dismissLimitsPageletMessageResponse = (DismissLimitsPageletMessageResponse) obj;
        dismissLimitsPageletMessageResponse.getClass();
        ResponseContext responseContext = dismissLimitsPageletMessageResponse.response;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ResponseContext responseContext3 = dismissLimitsPageletMessageResponse.response_context;
        ResponseContext responseContext4 = responseContext3 != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DismissLimitsPageletMessageResponse(responseContext2, responseContext4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DismissLimitsPageletMessageResponse dismissLimitsPageletMessageResponse = (DismissLimitsPageletMessageResponse) obj;
        dismissLimitsPageletMessageResponse.getClass();
        ProtoAdapter protoAdapter = ResponseContext.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, dismissLimitsPageletMessageResponse.response);
        protoAdapter.encodeWithTag(protoWriter, 3, dismissLimitsPageletMessageResponse.response_context);
        protoWriter.writeBytes(dismissLimitsPageletMessageResponse.unknownFields());
    }
}
