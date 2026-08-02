package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.CancelPaymentResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CancelPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelPaymentResponse((ResponseContext) obj, (CancelPaymentResponse.Status) obj2, (UiPayment) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = CancelPaymentResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(UiPayment.ADAPTER, protoReader, obj3);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelPaymentResponse cancelPaymentResponse = (CancelPaymentResponse) obj;
        reverseProtoWriter.getClass();
        cancelPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(cancelPaymentResponse.unknownFields());
        UiPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cancelPaymentResponse.payment);
        CancelPaymentResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cancelPaymentResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cancelPaymentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelPaymentResponse cancelPaymentResponse = (CancelPaymentResponse) obj;
        cancelPaymentResponse.getClass();
        return UiPayment.ADAPTER.encodedSizeWithTag(3, cancelPaymentResponse.payment) + CancelPaymentResponse.Status.ADAPTER.encodedSizeWithTag(1, cancelPaymentResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(6, cancelPaymentResponse.response_context) + cancelPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelPaymentResponse cancelPaymentResponse = (CancelPaymentResponse) obj;
        cancelPaymentResponse.getClass();
        ResponseContext responseContext = cancelPaymentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        UiPayment uiPayment = cancelPaymentResponse.payment;
        UiPayment uiPayment2 = uiPayment != null ? (UiPayment) UiPayment.ADAPTER.redact(uiPayment) : null;
        ByteString byteString = ByteString.EMPTY;
        CancelPaymentResponse.Status status = cancelPaymentResponse.status;
        byteString.getClass();
        return new CancelPaymentResponse(responseContext2, status, uiPayment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelPaymentResponse cancelPaymentResponse = (CancelPaymentResponse) obj;
        cancelPaymentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 6, cancelPaymentResponse.response_context);
        CancelPaymentResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, cancelPaymentResponse.status);
        UiPayment.ADAPTER.encodeWithTag(protoWriter, 3, cancelPaymentResponse.payment);
        protoWriter.writeBytes(cancelPaymentResponse.unknownFields());
    }
}
