package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.CreditMultiStepLoadPollingResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditMultiStepLoadPollingResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditMultiStepLoadPollingResponse((ResponseContext) obj, (CreditMultiStepLoadPollingResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CreditMultiStepLoadPollingResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditMultiStepLoadPollingResponse creditMultiStepLoadPollingResponse = (CreditMultiStepLoadPollingResponse) obj;
        reverseProtoWriter.getClass();
        creditMultiStepLoadPollingResponse.getClass();
        reverseProtoWriter.writeBytes(creditMultiStepLoadPollingResponse.unknownFields());
        CreditMultiStepLoadPollingResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, creditMultiStepLoadPollingResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditMultiStepLoadPollingResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditMultiStepLoadPollingResponse creditMultiStepLoadPollingResponse = (CreditMultiStepLoadPollingResponse) obj;
        creditMultiStepLoadPollingResponse.getClass();
        return CreditMultiStepLoadPollingResponse.Status.ADAPTER.encodedSizeWithTag(2, creditMultiStepLoadPollingResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, creditMultiStepLoadPollingResponse.response_context) + creditMultiStepLoadPollingResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditMultiStepLoadPollingResponse creditMultiStepLoadPollingResponse = (CreditMultiStepLoadPollingResponse) obj;
        creditMultiStepLoadPollingResponse.getClass();
        ResponseContext responseContext = creditMultiStepLoadPollingResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        CreditMultiStepLoadPollingResponse.Status status = creditMultiStepLoadPollingResponse.status;
        byteString.getClass();
        return new CreditMultiStepLoadPollingResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditMultiStepLoadPollingResponse creditMultiStepLoadPollingResponse = (CreditMultiStepLoadPollingResponse) obj;
        creditMultiStepLoadPollingResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, creditMultiStepLoadPollingResponse.response_context);
        CreditMultiStepLoadPollingResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, creditMultiStepLoadPollingResponse.status);
        protoWriter.writeBytes(creditMultiStepLoadPollingResponse.unknownFields());
    }
}
