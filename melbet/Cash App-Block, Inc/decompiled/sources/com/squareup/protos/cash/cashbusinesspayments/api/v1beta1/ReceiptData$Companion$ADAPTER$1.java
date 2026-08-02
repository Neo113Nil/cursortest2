package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReceiptData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReceiptData((String) obj, (String) obj2, (String) obj3, (PaymentActivity) obj4, (UiAvatar) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(PaymentActivity.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReceiptData receiptData = (ReceiptData) obj;
        reverseProtoWriter.getClass();
        receiptData.getClass();
        reverseProtoWriter.writeBytes(receiptData.unknownFields());
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 5, receiptData.avatar);
        PaymentActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 4, receiptData.payment_activity);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, receiptData.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, receiptData.seller_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, receiptData.cashtag);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReceiptData receiptData = (ReceiptData) obj;
        receiptData.getClass();
        int size$okio = receiptData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return UiAvatar.ADAPTER.encodedSizeWithTag(5, receiptData.avatar) + PaymentActivity.ADAPTER.encodedSizeWithTag(4, receiptData.payment_activity) + protoAdapter.encodedSizeWithTag(3, receiptData.profile_photo_url) + protoAdapter.encodedSizeWithTag(2, receiptData.seller_name) + protoAdapter.encodedSizeWithTag(1, receiptData.cashtag) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReceiptData receiptData = (ReceiptData) obj;
        receiptData.getClass();
        PaymentActivity paymentActivity = receiptData.payment_activity;
        PaymentActivity paymentActivity2 = paymentActivity != null ? (PaymentActivity) PaymentActivity.ADAPTER.redact(paymentActivity) : null;
        UiAvatar uiAvatar = receiptData.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = receiptData.profile_photo_url;
        byteString.getClass();
        return new ReceiptData(null, null, str, paymentActivity2, uiAvatar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReceiptData receiptData = (ReceiptData) obj;
        receiptData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, receiptData.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 2, receiptData.seller_name);
        protoAdapter.encodeWithTag(protoWriter, 3, receiptData.profile_photo_url);
        PaymentActivity.ADAPTER.encodeWithTag(protoWriter, 4, receiptData.payment_activity);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 5, receiptData.avatar);
        protoWriter.writeBytes(receiptData.unknownFields());
    }
}
