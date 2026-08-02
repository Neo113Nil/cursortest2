package com.squareup.protos.cash.investflow.flows;

import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$CancelAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitInvestmentEntitySelectionRequest.CancelAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitInvestmentEntitySelectionRequest.CancelAction cancelAction = (SubmitInvestmentEntitySelectionRequest.CancelAction) obj;
        reverseProtoWriter.getClass();
        cancelAction.getClass();
        reverseProtoWriter.writeBytes(cancelAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitInvestmentEntitySelectionRequest.CancelAction cancelAction = (SubmitInvestmentEntitySelectionRequest.CancelAction) obj;
        cancelAction.getClass();
        return cancelAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitInvestmentEntitySelectionRequest.CancelAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitInvestmentEntitySelectionRequest.CancelAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitInvestmentEntitySelectionRequest.CancelAction cancelAction = (SubmitInvestmentEntitySelectionRequest.CancelAction) obj;
        cancelAction.getClass();
        protoWriter.writeBytes(cancelAction.unknownFields());
    }
}
