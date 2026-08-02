package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RefundPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefundPaymentResponse((ResponseContext) obj, (UiPayment) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = TransactorKt.decodeMessageOrMerge(UiPayment.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) obj;
        reverseProtoWriter.getClass();
        refundPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(refundPaymentResponse.unknownFields());
        UiPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refundPaymentResponse.payment);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, refundPaymentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) obj;
        refundPaymentResponse.getClass();
        return UiPayment.ADAPTER.encodedSizeWithTag(1, refundPaymentResponse.payment) + ResponseContext.ADAPTER.encodedSizeWithTag(3, refundPaymentResponse.response_context) + refundPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) obj;
        refundPaymentResponse.getClass();
        ResponseContext responseContext = refundPaymentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        UiPayment uiPayment = refundPaymentResponse.payment;
        UiPayment uiPayment2 = uiPayment != null ? (UiPayment) UiPayment.ADAPTER.redact(uiPayment) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefundPaymentResponse(responseContext2, uiPayment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) obj;
        refundPaymentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, refundPaymentResponse.response_context);
        UiPayment.ADAPTER.encodeWithTag(protoWriter, 1, refundPaymentResponse.payment);
        protoWriter.writeBytes(refundPaymentResponse.unknownFields());
    }
}
