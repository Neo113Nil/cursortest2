package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBitcoinP2pConversionPercentageRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBitcoinP2pConversionPercentageRequest((RequestContext) obj, (BitcoinP2pConversionPercentageInputs) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BitcoinP2pConversionPercentageInputs.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBitcoinP2pConversionPercentageRequest submitBitcoinP2pConversionPercentageRequest = (SubmitBitcoinP2pConversionPercentageRequest) obj;
        reverseProtoWriter.getClass();
        submitBitcoinP2pConversionPercentageRequest.getClass();
        reverseProtoWriter.writeBytes(submitBitcoinP2pConversionPercentageRequest.unknownFields());
        BitcoinP2pConversionPercentageInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 2, submitBitcoinP2pConversionPercentageRequest.inputs);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitBitcoinP2pConversionPercentageRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBitcoinP2pConversionPercentageRequest submitBitcoinP2pConversionPercentageRequest = (SubmitBitcoinP2pConversionPercentageRequest) obj;
        submitBitcoinP2pConversionPercentageRequest.getClass();
        return BitcoinP2pConversionPercentageInputs.ADAPTER.encodedSizeWithTag(2, submitBitcoinP2pConversionPercentageRequest.inputs) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitBitcoinP2pConversionPercentageRequest.request_context) + submitBitcoinP2pConversionPercentageRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBitcoinP2pConversionPercentageRequest submitBitcoinP2pConversionPercentageRequest = (SubmitBitcoinP2pConversionPercentageRequest) obj;
        submitBitcoinP2pConversionPercentageRequest.getClass();
        RequestContext requestContext = submitBitcoinP2pConversionPercentageRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = submitBitcoinP2pConversionPercentageRequest.inputs;
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs2 = bitcoinP2pConversionPercentageInputs != null ? (BitcoinP2pConversionPercentageInputs) BitcoinP2pConversionPercentageInputs.ADAPTER.redact(bitcoinP2pConversionPercentageInputs) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitBitcoinP2pConversionPercentageRequest(requestContext2, bitcoinP2pConversionPercentageInputs2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBitcoinP2pConversionPercentageRequest submitBitcoinP2pConversionPercentageRequest = (SubmitBitcoinP2pConversionPercentageRequest) obj;
        submitBitcoinP2pConversionPercentageRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitBitcoinP2pConversionPercentageRequest.request_context);
        BitcoinP2pConversionPercentageInputs.ADAPTER.encodeWithTag(protoWriter, 2, submitBitcoinP2pConversionPercentageRequest.inputs);
        protoWriter.writeBytes(submitBitcoinP2pConversionPercentageRequest.unknownFields());
    }
}
