package com.squareup.protos.franklin.investing;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InitiateInvestmentOrderResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateInvestmentOrderResponse((ResponseContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateInvestmentOrderResponse initiateInvestmentOrderResponse = (InitiateInvestmentOrderResponse) obj;
        reverseProtoWriter.getClass();
        initiateInvestmentOrderResponse.getClass();
        reverseProtoWriter.writeBytes(initiateInvestmentOrderResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, initiateInvestmentOrderResponse.order_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateInvestmentOrderResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateInvestmentOrderResponse initiateInvestmentOrderResponse = (InitiateInvestmentOrderResponse) obj;
        initiateInvestmentOrderResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, initiateInvestmentOrderResponse.order_token) + ResponseContext.ADAPTER.encodedSizeWithTag(1, initiateInvestmentOrderResponse.response_context) + initiateInvestmentOrderResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateInvestmentOrderResponse initiateInvestmentOrderResponse = (InitiateInvestmentOrderResponse) obj;
        initiateInvestmentOrderResponse.getClass();
        ResponseContext responseContext = initiateInvestmentOrderResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = initiateInvestmentOrderResponse.order_token;
        byteString.getClass();
        return new InitiateInvestmentOrderResponse(responseContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateInvestmentOrderResponse initiateInvestmentOrderResponse = (InitiateInvestmentOrderResponse) obj;
        initiateInvestmentOrderResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateInvestmentOrderResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, initiateInvestmentOrderResponse.order_token);
        protoWriter.writeBytes(initiateInvestmentOrderResponse.unknownFields());
    }
}
