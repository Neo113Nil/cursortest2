package com.squareup.protos.cash.investautomator.api.flows;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiateChangeRoundUpDestinationFlowResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateChangeRoundUpDestinationFlowResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateChangeRoundUpDestinationFlowResponse initiateChangeRoundUpDestinationFlowResponse = (InitiateChangeRoundUpDestinationFlowResponse) obj;
        reverseProtoWriter.getClass();
        initiateChangeRoundUpDestinationFlowResponse.getClass();
        reverseProtoWriter.writeBytes(initiateChangeRoundUpDestinationFlowResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateChangeRoundUpDestinationFlowResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateChangeRoundUpDestinationFlowResponse initiateChangeRoundUpDestinationFlowResponse = (InitiateChangeRoundUpDestinationFlowResponse) obj;
        initiateChangeRoundUpDestinationFlowResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, initiateChangeRoundUpDestinationFlowResponse.response_context) + initiateChangeRoundUpDestinationFlowResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateChangeRoundUpDestinationFlowResponse initiateChangeRoundUpDestinationFlowResponse = (InitiateChangeRoundUpDestinationFlowResponse) obj;
        initiateChangeRoundUpDestinationFlowResponse.getClass();
        ResponseContext responseContext = initiateChangeRoundUpDestinationFlowResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitiateChangeRoundUpDestinationFlowResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateChangeRoundUpDestinationFlowResponse initiateChangeRoundUpDestinationFlowResponse = (InitiateChangeRoundUpDestinationFlowResponse) obj;
        initiateChangeRoundUpDestinationFlowResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateChangeRoundUpDestinationFlowResponse.response_context);
        protoWriter.writeBytes(initiateChangeRoundUpDestinationFlowResponse.unknownFields());
    }
}
