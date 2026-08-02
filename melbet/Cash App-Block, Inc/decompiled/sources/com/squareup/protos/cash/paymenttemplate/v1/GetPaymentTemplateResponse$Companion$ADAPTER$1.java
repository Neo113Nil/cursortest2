package com.squareup.protos.cash.paymenttemplate.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.paymenttemplate.v1.GetPaymentTemplateResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaymentTemplateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetPaymentTemplateResponse((PaymentTemplate) obj, (GetPaymentTemplateResponse.ErrorCode) obj2, (PaymentOptions) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PaymentTemplate.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = GetPaymentTemplateResponse.ErrorCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(PaymentOptions.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaymentTemplateResponse getPaymentTemplateResponse = (GetPaymentTemplateResponse) obj;
        reverseProtoWriter.getClass();
        getPaymentTemplateResponse.getClass();
        reverseProtoWriter.writeBytes(getPaymentTemplateResponse.unknownFields());
        PaymentOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getPaymentTemplateResponse.payment_options);
        GetPaymentTemplateResponse.ErrorCode.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getPaymentTemplateResponse.error_code);
        PaymentTemplate.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPaymentTemplateResponse.payment_template);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaymentTemplateResponse getPaymentTemplateResponse = (GetPaymentTemplateResponse) obj;
        getPaymentTemplateResponse.getClass();
        return PaymentOptions.ADAPTER.encodedSizeWithTag(3, getPaymentTemplateResponse.payment_options) + GetPaymentTemplateResponse.ErrorCode.ADAPTER.encodedSizeWithTag(2, getPaymentTemplateResponse.error_code) + PaymentTemplate.ADAPTER.encodedSizeWithTag(1, getPaymentTemplateResponse.payment_template) + getPaymentTemplateResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaymentTemplateResponse getPaymentTemplateResponse = (GetPaymentTemplateResponse) obj;
        getPaymentTemplateResponse.getClass();
        PaymentTemplate paymentTemplate = getPaymentTemplateResponse.payment_template;
        PaymentTemplate paymentTemplate2 = paymentTemplate != null ? (PaymentTemplate) PaymentTemplate.ADAPTER.redact(paymentTemplate) : null;
        PaymentOptions paymentOptions = getPaymentTemplateResponse.payment_options;
        PaymentOptions paymentOptions2 = paymentOptions != null ? (PaymentOptions) PaymentOptions.ADAPTER.redact(paymentOptions) : null;
        ByteString byteString = ByteString.EMPTY;
        GetPaymentTemplateResponse.ErrorCode errorCode = getPaymentTemplateResponse.error_code;
        byteString.getClass();
        return new GetPaymentTemplateResponse(paymentTemplate2, errorCode, paymentOptions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaymentTemplateResponse getPaymentTemplateResponse = (GetPaymentTemplateResponse) obj;
        getPaymentTemplateResponse.getClass();
        PaymentTemplate.ADAPTER.encodeWithTag(protoWriter, 1, getPaymentTemplateResponse.payment_template);
        GetPaymentTemplateResponse.ErrorCode.ADAPTER.encodeWithTag(protoWriter, 2, getPaymentTemplateResponse.error_code);
        PaymentOptions.ADAPTER.encodeWithTag(protoWriter, 3, getPaymentTemplateResponse.payment_options);
        protoWriter.writeBytes(getPaymentTemplateResponse.unknownFields());
    }
}
