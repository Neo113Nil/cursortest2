package com.squareup.protos.franklin.investing;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpdateInvestmentHoldingResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateInvestmentHoldingResponse((ResponseContext) obj, (SyncInvestmentHolding) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SyncInvestmentHolding.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateInvestmentHoldingResponse updateInvestmentHoldingResponse = (UpdateInvestmentHoldingResponse) obj;
        reverseProtoWriter.getClass();
        updateInvestmentHoldingResponse.getClass();
        reverseProtoWriter.writeBytes(updateInvestmentHoldingResponse.unknownFields());
        SyncInvestmentHolding.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateInvestmentHoldingResponse.investment_holding);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateInvestmentHoldingResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateInvestmentHoldingResponse updateInvestmentHoldingResponse = (UpdateInvestmentHoldingResponse) obj;
        updateInvestmentHoldingResponse.getClass();
        return SyncInvestmentHolding.ADAPTER.encodedSizeWithTag(2, updateInvestmentHoldingResponse.investment_holding) + ResponseContext.ADAPTER.encodedSizeWithTag(1, updateInvestmentHoldingResponse.response_context) + updateInvestmentHoldingResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateInvestmentHoldingResponse updateInvestmentHoldingResponse = (UpdateInvestmentHoldingResponse) obj;
        updateInvestmentHoldingResponse.getClass();
        ResponseContext responseContext = updateInvestmentHoldingResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        SyncInvestmentHolding syncInvestmentHolding = updateInvestmentHoldingResponse.investment_holding;
        SyncInvestmentHolding syncInvestmentHolding2 = syncInvestmentHolding != null ? (SyncInvestmentHolding) SyncInvestmentHolding.ADAPTER.redact(syncInvestmentHolding) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateInvestmentHoldingResponse(responseContext2, syncInvestmentHolding2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateInvestmentHoldingResponse updateInvestmentHoldingResponse = (UpdateInvestmentHoldingResponse) obj;
        updateInvestmentHoldingResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, updateInvestmentHoldingResponse.response_context);
        SyncInvestmentHolding.ADAPTER.encodeWithTag(protoWriter, 2, updateInvestmentHoldingResponse.investment_holding);
        protoWriter.writeBytes(updateInvestmentHoldingResponse.unknownFields());
    }
}
