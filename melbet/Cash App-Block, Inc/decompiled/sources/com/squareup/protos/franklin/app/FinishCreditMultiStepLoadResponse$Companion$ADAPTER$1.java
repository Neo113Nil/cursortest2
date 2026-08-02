package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FinishCreditMultiStepLoadResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FinishCreditMultiStepLoadResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        FinishCreditMultiStepLoadResponse finishCreditMultiStepLoadResponse = (FinishCreditMultiStepLoadResponse) obj;
        reverseProtoWriter.getClass();
        finishCreditMultiStepLoadResponse.getClass();
        reverseProtoWriter.writeBytes(finishCreditMultiStepLoadResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, finishCreditMultiStepLoadResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FinishCreditMultiStepLoadResponse finishCreditMultiStepLoadResponse = (FinishCreditMultiStepLoadResponse) obj;
        finishCreditMultiStepLoadResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, finishCreditMultiStepLoadResponse.response_context) + finishCreditMultiStepLoadResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FinishCreditMultiStepLoadResponse finishCreditMultiStepLoadResponse = (FinishCreditMultiStepLoadResponse) obj;
        finishCreditMultiStepLoadResponse.getClass();
        ResponseContext responseContext = finishCreditMultiStepLoadResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FinishCreditMultiStepLoadResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FinishCreditMultiStepLoadResponse finishCreditMultiStepLoadResponse = (FinishCreditMultiStepLoadResponse) obj;
        finishCreditMultiStepLoadResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, finishCreditMultiStepLoadResponse.response_context);
        protoWriter.writeBytes(finishCreditMultiStepLoadResponse.unknownFields());
    }
}
