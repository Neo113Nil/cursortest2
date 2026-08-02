package com.squareup.protos.cash.investflow.flows;

import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$CancelWithDisableIntent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent cancelWithDisableIntent = (SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent) obj;
        reverseProtoWriter.getClass();
        cancelWithDisableIntent.getClass();
        reverseProtoWriter.writeBytes(cancelWithDisableIntent.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent cancelWithDisableIntent = (SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent) obj;
        cancelWithDisableIntent.getClass();
        return cancelWithDisableIntent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent cancelWithDisableIntent = (SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent) obj;
        cancelWithDisableIntent.getClass();
        protoWriter.writeBytes(cancelWithDisableIntent.unknownFields());
    }
}
