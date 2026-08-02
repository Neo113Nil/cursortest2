package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSwapEstimateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSwapEstimateResponse((SwapEstimate) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SwapEstimate.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSwapEstimateResponse getSwapEstimateResponse = (GetSwapEstimateResponse) obj;
        reverseProtoWriter.getClass();
        getSwapEstimateResponse.getClass();
        reverseProtoWriter.writeBytes(getSwapEstimateResponse.unknownFields());
        SwapEstimate.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSwapEstimateResponse.estimate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSwapEstimateResponse getSwapEstimateResponse = (GetSwapEstimateResponse) obj;
        getSwapEstimateResponse.getClass();
        return SwapEstimate.ADAPTER.encodedSizeWithTag(1, getSwapEstimateResponse.estimate) + getSwapEstimateResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSwapEstimateResponse getSwapEstimateResponse = (GetSwapEstimateResponse) obj;
        getSwapEstimateResponse.getClass();
        SwapEstimate swapEstimate = getSwapEstimateResponse.estimate;
        SwapEstimate swapEstimate2 = swapEstimate != null ? (SwapEstimate) SwapEstimate.ADAPTER.redact(swapEstimate) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSwapEstimateResponse(swapEstimate2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSwapEstimateResponse getSwapEstimateResponse = (GetSwapEstimateResponse) obj;
        getSwapEstimateResponse.getClass();
        SwapEstimate.ADAPTER.encodeWithTag(protoWriter, 1, getSwapEstimateResponse.estimate);
        protoWriter.writeBytes(getSwapEstimateResponse.unknownFields());
    }
}
