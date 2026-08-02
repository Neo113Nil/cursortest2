package com.squareup.protos.cash.paymenttemplate.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentTemplate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentTemplate((String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (Money) obj9, (String) obj10, (TransactionCategory) obj11, (CreationChannel) obj12, (Long) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj9);
                    break;
                case 5:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj11 = TransactionCategory.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 9:
                    try {
                        obj12 = CreationChannel.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 10:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentTemplate paymentTemplate = (PaymentTemplate) obj;
        reverseProtoWriter.getClass();
        paymentTemplate.getClass();
        reverseProtoWriter.writeBytes(paymentTemplate.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 10, paymentTemplate.expires_at_millis);
        CreationChannel.ADAPTER.encodeWithTag(reverseProtoWriter, 9, paymentTemplate.creation_channel);
        TransactionCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 8, paymentTemplate.transaction_category);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, paymentTemplate.note);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentTemplate.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, paymentTemplate.recipient_cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, paymentTemplate.recipient_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, paymentTemplate.sender_cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentTemplate.sender_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paymentTemplate.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentTemplate paymentTemplate = (PaymentTemplate) obj;
        paymentTemplate.getClass();
        int size$okio = paymentTemplate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(10, paymentTemplate.expires_at_millis) + CreationChannel.ADAPTER.encodedSizeWithTag(9, paymentTemplate.creation_channel) + TransactionCategory.ADAPTER.encodedSizeWithTag(8, paymentTemplate.transaction_category) + protoAdapter.encodedSizeWithTag(5, paymentTemplate.note) + Money.ADAPTER.encodedSizeWithTag(4, paymentTemplate.amount) + protoAdapter.encodedSizeWithTag(7, paymentTemplate.recipient_cashtag) + protoAdapter.encodedSizeWithTag(3, paymentTemplate.recipient_customer_token) + protoAdapter.encodedSizeWithTag(6, paymentTemplate.sender_cashtag) + protoAdapter.encodedSizeWithTag(2, paymentTemplate.sender_customer_token) + protoAdapter.encodedSizeWithTag(1, paymentTemplate.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentTemplate paymentTemplate = (PaymentTemplate) obj;
        paymentTemplate.getClass();
        Money money = paymentTemplate.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paymentTemplate.token;
        String str2 = paymentTemplate.sender_customer_token;
        String str3 = paymentTemplate.recipient_customer_token;
        TransactionCategory transactionCategory = paymentTemplate.transaction_category;
        CreationChannel creationChannel = paymentTemplate.creation_channel;
        Long l = paymentTemplate.expires_at_millis;
        byteString.getClass();
        return new PaymentTemplate(str, str2, null, str3, null, money2, null, transactionCategory, creationChannel, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentTemplate paymentTemplate = (PaymentTemplate) obj;
        paymentTemplate.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentTemplate.token);
        protoAdapter.encodeWithTag(protoWriter, 2, paymentTemplate.sender_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 6, paymentTemplate.sender_cashtag);
        protoAdapter.encodeWithTag(protoWriter, 3, paymentTemplate.recipient_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 7, paymentTemplate.recipient_cashtag);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, paymentTemplate.amount);
        protoAdapter.encodeWithTag(protoWriter, 5, paymentTemplate.note);
        TransactionCategory.ADAPTER.encodeWithTag(protoWriter, 8, paymentTemplate.transaction_category);
        CreationChannel.ADAPTER.encodeWithTag(protoWriter, 9, paymentTemplate.creation_channel);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, paymentTemplate.expires_at_millis);
        protoWriter.writeBytes(paymentTemplate.unknownFields());
    }
}
