package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaymentReceiptDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaymentReceiptDetailsResponse((ReceiptData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ReceiptData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaymentReceiptDetailsResponse getPaymentReceiptDetailsResponse = (GetPaymentReceiptDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getPaymentReceiptDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getPaymentReceiptDetailsResponse.unknownFields());
        ReceiptData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPaymentReceiptDetailsResponse.receipt_details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaymentReceiptDetailsResponse getPaymentReceiptDetailsResponse = (GetPaymentReceiptDetailsResponse) obj;
        getPaymentReceiptDetailsResponse.getClass();
        return ReceiptData.ADAPTER.encodedSizeWithTag(1, getPaymentReceiptDetailsResponse.receipt_details) + getPaymentReceiptDetailsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaymentReceiptDetailsResponse getPaymentReceiptDetailsResponse = (GetPaymentReceiptDetailsResponse) obj;
        getPaymentReceiptDetailsResponse.getClass();
        ReceiptData receiptData = getPaymentReceiptDetailsResponse.receipt_details;
        ReceiptData receiptData2 = receiptData != null ? (ReceiptData) ReceiptData.ADAPTER.redact(receiptData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPaymentReceiptDetailsResponse(receiptData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaymentReceiptDetailsResponse getPaymentReceiptDetailsResponse = (GetPaymentReceiptDetailsResponse) obj;
        getPaymentReceiptDetailsResponse.getClass();
        ReceiptData.ADAPTER.encodeWithTag(protoWriter, 1, getPaymentReceiptDetailsResponse.receipt_details);
        protoWriter.writeBytes(getPaymentReceiptDetailsResponse.unknownFields());
    }
}
