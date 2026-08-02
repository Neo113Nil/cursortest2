package com.squareup.protos.cash.investflow.flows;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitInvestmentEntitySelectionResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SubmitInvestmentEntitySelectionResponse submitInvestmentEntitySelectionResponse = (SubmitInvestmentEntitySelectionResponse) obj;
        reverseProtoWriter.getClass();
        submitInvestmentEntitySelectionResponse.getClass();
        reverseProtoWriter.writeBytes(submitInvestmentEntitySelectionResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitInvestmentEntitySelectionResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitInvestmentEntitySelectionResponse submitInvestmentEntitySelectionResponse = (SubmitInvestmentEntitySelectionResponse) obj;
        submitInvestmentEntitySelectionResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, submitInvestmentEntitySelectionResponse.response_context) + submitInvestmentEntitySelectionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitInvestmentEntitySelectionResponse submitInvestmentEntitySelectionResponse = (SubmitInvestmentEntitySelectionResponse) obj;
        submitInvestmentEntitySelectionResponse.getClass();
        ResponseContext responseContext = submitInvestmentEntitySelectionResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitInvestmentEntitySelectionResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitInvestmentEntitySelectionResponse submitInvestmentEntitySelectionResponse = (SubmitInvestmentEntitySelectionResponse) obj;
        submitInvestmentEntitySelectionResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, submitInvestmentEntitySelectionResponse.response_context);
        protoWriter.writeBytes(submitInvestmentEntitySelectionResponse.unknownFields());
    }
}
