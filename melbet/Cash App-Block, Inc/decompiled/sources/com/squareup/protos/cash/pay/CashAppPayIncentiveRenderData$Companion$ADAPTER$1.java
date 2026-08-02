package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayIncentiveRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayIncentiveRenderData((String) obj, (Long) obj2, (Money) obj3, (Money) obj4, (Money) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayIncentiveRenderData cashAppPayIncentiveRenderData = (CashAppPayIncentiveRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayIncentiveRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayIncentiveRenderData.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cashAppPayIncentiveRenderData.minimum_eligible_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashAppPayIncentiveRenderData.maximum_variable_discount_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppPayIncentiveRenderData.flat_discount_money);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, cashAppPayIncentiveRenderData.discount_bps);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cashAppPayIncentiveRenderData.incentive_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayIncentiveRenderData cashAppPayIncentiveRenderData = (CashAppPayIncentiveRenderData) obj;
        cashAppPayIncentiveRenderData.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, cashAppPayIncentiveRenderData.discount_bps) + ProtoAdapter.STRING.encodedSizeWithTag(1, cashAppPayIncentiveRenderData.incentive_id) + cashAppPayIncentiveRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, cashAppPayIncentiveRenderData.minimum_eligible_money) + protoAdapter.encodedSizeWithTag(4, cashAppPayIncentiveRenderData.maximum_variable_discount_money) + protoAdapter.encodedSizeWithTag(3, cashAppPayIncentiveRenderData.flat_discount_money) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayIncentiveRenderData cashAppPayIncentiveRenderData = (CashAppPayIncentiveRenderData) obj;
        cashAppPayIncentiveRenderData.getClass();
        Money money = cashAppPayIncentiveRenderData.flat_discount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayIncentiveRenderData.maximum_variable_discount_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayIncentiveRenderData.minimum_eligible_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayIncentiveRenderData.incentive_id;
        Long l = cashAppPayIncentiveRenderData.discount_bps;
        byteString.getClass();
        return new CashAppPayIncentiveRenderData(str, l, money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayIncentiveRenderData cashAppPayIncentiveRenderData = (CashAppPayIncentiveRenderData) obj;
        cashAppPayIncentiveRenderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cashAppPayIncentiveRenderData.incentive_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cashAppPayIncentiveRenderData.discount_bps);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppPayIncentiveRenderData.flat_discount_money);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppPayIncentiveRenderData.maximum_variable_discount_money);
        protoAdapter.encodeWithTag(protoWriter, 5, cashAppPayIncentiveRenderData.minimum_eligible_money);
        protoWriter.writeBytes(cashAppPayIncentiveRenderData.unknownFields());
    }
}
