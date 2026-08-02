package com.squareup.protos.cash.fiatly.api.v2;

import androidx.room.TransactorKt;
import com.squareup.cash.p2p.engine.api.v1.PaymentStateCode;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentUpdate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentUpdate((String) obj, (String) obj2, (Money) obj3, (PaymentStateCode) obj4, (SenderProfileData) obj5, (PaymentStateCategory) obj6, (Long) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    try {
                        obj4 = PaymentStateCode.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(SenderProfileData.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    try {
                        obj6 = PaymentStateCategory.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentUpdate paymentUpdate = (PaymentUpdate) obj;
        reverseProtoWriter.getClass();
        paymentUpdate.getClass();
        reverseProtoWriter.writeBytes(paymentUpdate.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, paymentUpdate.sequence);
        PaymentStateCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 6, paymentUpdate.payment_state_category);
        SenderProfileData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, paymentUpdate.sender_profile);
        PaymentStateCode.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentUpdate.payment_state_code);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paymentUpdate.amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentUpdate.sender_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paymentUpdate.payment_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentUpdate paymentUpdate = (PaymentUpdate) obj;
        paymentUpdate.getClass();
        int size$okio = paymentUpdate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(7, paymentUpdate.sequence) + PaymentStateCategory.ADAPTER.encodedSizeWithTag(6, paymentUpdate.payment_state_category) + SenderProfileData.ADAPTER.encodedSizeWithTag(5, paymentUpdate.sender_profile) + PaymentStateCode.ADAPTER.encodedSizeWithTag(4, paymentUpdate.payment_state_code) + Money.ADAPTER.encodedSizeWithTag(3, paymentUpdate.amount) + protoAdapter.encodedSizeWithTag(2, paymentUpdate.sender_customer_token) + protoAdapter.encodedSizeWithTag(1, paymentUpdate.payment_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentUpdate paymentUpdate = (PaymentUpdate) obj;
        paymentUpdate.getClass();
        Money money = paymentUpdate.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        SenderProfileData senderProfileData = paymentUpdate.sender_profile;
        SenderProfileData senderProfileData2 = senderProfileData != null ? (SenderProfileData) SenderProfileData.ADAPTER.redact(senderProfileData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paymentUpdate.payment_token;
        String str2 = paymentUpdate.sender_customer_token;
        PaymentStateCode paymentStateCode = paymentUpdate.payment_state_code;
        PaymentStateCategory paymentStateCategory = paymentUpdate.payment_state_category;
        Long l = paymentUpdate.sequence;
        byteString.getClass();
        return new PaymentUpdate(str, str2, money2, paymentStateCode, senderProfileData2, paymentStateCategory, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentUpdate paymentUpdate = (PaymentUpdate) obj;
        paymentUpdate.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentUpdate.payment_token);
        protoAdapter.encodeWithTag(protoWriter, 2, paymentUpdate.sender_customer_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, paymentUpdate.amount);
        PaymentStateCode.ADAPTER.encodeWithTag(protoWriter, 4, paymentUpdate.payment_state_code);
        SenderProfileData.ADAPTER.encodeWithTag(protoWriter, 5, paymentUpdate.sender_profile);
        PaymentStateCategory.ADAPTER.encodeWithTag(protoWriter, 6, paymentUpdate.payment_state_category);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, paymentUpdate.sequence);
        protoWriter.writeBytes(paymentUpdate.unknownFields());
    }
}
