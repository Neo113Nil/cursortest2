package com.squareup.protos.cash.commerce;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.commerce.CommerceRefund;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CommerceRefund$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CommerceRefund((String) obj, (Money) obj2, (Money) obj3, (Long) obj4, (CommerceRefund.RefundState) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = CommerceRefund.RefundState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CommerceRefund commerceRefund = (CommerceRefund) obj;
        reverseProtoWriter.getClass();
        commerceRefund.getClass();
        reverseProtoWriter.writeBytes(commerceRefund.unknownFields());
        CommerceRefund.RefundState.ADAPTER.encodeWithTag(reverseProtoWriter, 5, commerceRefund.refund_state);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, commerceRefund.display_date);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, commerceRefund.discount_reclaimed_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, commerceRefund.total_money);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, commerceRefund.refund_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CommerceRefund commerceRefund = (CommerceRefund) obj;
        commerceRefund.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, commerceRefund.refund_id) + commerceRefund.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return CommerceRefund.RefundState.ADAPTER.encodedSizeWithTag(5, commerceRefund.refund_state) + ProtoAdapter.INT64.encodedSizeWithTag(4, commerceRefund.display_date) + protoAdapter.encodedSizeWithTag(3, commerceRefund.discount_reclaimed_money) + protoAdapter.encodedSizeWithTag(2, commerceRefund.total_money) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CommerceRefund commerceRefund = (CommerceRefund) obj;
        commerceRefund.getClass();
        Money money = commerceRefund.total_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = commerceRefund.discount_reclaimed_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = commerceRefund.refund_id;
        Long l = commerceRefund.display_date;
        CommerceRefund.RefundState refundState = commerceRefund.refund_state;
        byteString.getClass();
        return new CommerceRefund(str, money2, money4, l, refundState, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CommerceRefund commerceRefund = (CommerceRefund) obj;
        commerceRefund.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commerceRefund.refund_id);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, commerceRefund.total_money);
        protoAdapter.encodeWithTag(protoWriter, 3, commerceRefund.discount_reclaimed_money);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, commerceRefund.display_date);
        CommerceRefund.RefundState.ADAPTER.encodeWithTag(protoWriter, 5, commerceRefund.refund_state);
        protoWriter.writeBytes(commerceRefund.unknownFields());
    }
}
