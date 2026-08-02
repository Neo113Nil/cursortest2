package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ConfirmPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ConfirmPaymentResponse((ResponseContext) obj, (ConfirmPaymentResponse.Status) obj2, (UiPayment) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = ConfirmPaymentResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(UiPayment.ADAPTER, protoReader, obj3);
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) obj;
        reverseProtoWriter.getClass();
        confirmPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(confirmPaymentResponse.unknownFields());
        UiPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, confirmPaymentResponse.payment);
        ConfirmPaymentResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, confirmPaymentResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 9, confirmPaymentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) obj;
        confirmPaymentResponse.getClass();
        return UiPayment.ADAPTER.encodedSizeWithTag(3, confirmPaymentResponse.payment) + ConfirmPaymentResponse.Status.ADAPTER.encodedSizeWithTag(1, confirmPaymentResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(9, confirmPaymentResponse.response_context) + confirmPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) obj;
        confirmPaymentResponse.getClass();
        ResponseContext responseContext = confirmPaymentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        UiPayment uiPayment = confirmPaymentResponse.payment;
        UiPayment uiPayment2 = uiPayment != null ? (UiPayment) UiPayment.ADAPTER.redact(uiPayment) : null;
        ByteString byteString = ByteString.EMPTY;
        ConfirmPaymentResponse.Status status = confirmPaymentResponse.status;
        byteString.getClass();
        return new ConfirmPaymentResponse(responseContext2, status, uiPayment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) obj;
        confirmPaymentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 9, confirmPaymentResponse.response_context);
        ConfirmPaymentResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, confirmPaymentResponse.status);
        UiPayment.ADAPTER.encodeWithTag(protoWriter, 3, confirmPaymentResponse.payment);
        protoWriter.writeBytes(confirmPaymentResponse.unknownFields());
    }
}
