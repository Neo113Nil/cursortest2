package com.squareup.protos.franklin.investing;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.CancelInvestmentOrderResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CancelInvestmentOrderResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelInvestmentOrderResponse((ResponseContext) obj, (CancelInvestmentOrderResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CancelInvestmentOrderResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelInvestmentOrderResponse cancelInvestmentOrderResponse = (CancelInvestmentOrderResponse) obj;
        reverseProtoWriter.getClass();
        cancelInvestmentOrderResponse.getClass();
        reverseProtoWriter.writeBytes(cancelInvestmentOrderResponse.unknownFields());
        CancelInvestmentOrderResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cancelInvestmentOrderResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cancelInvestmentOrderResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelInvestmentOrderResponse cancelInvestmentOrderResponse = (CancelInvestmentOrderResponse) obj;
        cancelInvestmentOrderResponse.getClass();
        return CancelInvestmentOrderResponse.Status.ADAPTER.encodedSizeWithTag(2, cancelInvestmentOrderResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, cancelInvestmentOrderResponse.response_context) + cancelInvestmentOrderResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelInvestmentOrderResponse cancelInvestmentOrderResponse = (CancelInvestmentOrderResponse) obj;
        cancelInvestmentOrderResponse.getClass();
        ResponseContext responseContext = cancelInvestmentOrderResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        CancelInvestmentOrderResponse.Status status = cancelInvestmentOrderResponse.status;
        byteString.getClass();
        return new CancelInvestmentOrderResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelInvestmentOrderResponse cancelInvestmentOrderResponse = (CancelInvestmentOrderResponse) obj;
        cancelInvestmentOrderResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, cancelInvestmentOrderResponse.response_context);
        CancelInvestmentOrderResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, cancelInvestmentOrderResponse.status);
        protoWriter.writeBytes(cancelInvestmentOrderResponse.unknownFields());
    }
}
