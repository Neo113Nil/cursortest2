package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.portfolios.model.UnitType;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HoldingBalanceTick$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HoldingBalanceTick((Long) obj3, (Money) obj4, (Long) obj5, (UnitType) obj6, (Money) obj7, (Money) obj8, (Long) obj9, (Money) obj10, (Money) obj11, (Long) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    continue;
                case 3:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 4:
                    try {
                        obj6 = UnitType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj5;
                        obj2 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    continue;
                case 6:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    continue;
                case 7:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 8:
                    obj10 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj10);
                    continue;
                case 9:
                    obj11 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj11);
                    continue;
                case 10:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj6;
                    break;
            }
            obj5 = obj;
            obj6 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HoldingBalanceTick holdingBalanceTick = (HoldingBalanceTick) obj;
        reverseProtoWriter.getClass();
        holdingBalanceTick.getClass();
        reverseProtoWriter.writeBytes(holdingBalanceTick.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, holdingBalanceTick.total_gain_bps);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, holdingBalanceTick.total_gain_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, holdingBalanceTick.cumulative_realized_gain_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, holdingBalanceTick.unrealized_gain_bps);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, holdingBalanceTick.unrealized_gain_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, holdingBalanceTick.price);
        UnitType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, holdingBalanceTick.unit_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, holdingBalanceTick.units);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, holdingBalanceTick.market_value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, holdingBalanceTick.time_sec);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HoldingBalanceTick holdingBalanceTick = (HoldingBalanceTick) obj;
        holdingBalanceTick.getClass();
        int size$okio = holdingBalanceTick.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, holdingBalanceTick.time_sec) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(10, holdingBalanceTick.total_gain_bps) + protoAdapter2.encodedSizeWithTag(9, holdingBalanceTick.total_gain_amount) + protoAdapter2.encodedSizeWithTag(8, holdingBalanceTick.cumulative_realized_gain_amount) + protoAdapter.encodedSizeWithTag(7, holdingBalanceTick.unrealized_gain_bps) + protoAdapter2.encodedSizeWithTag(6, holdingBalanceTick.unrealized_gain_amount) + protoAdapter2.encodedSizeWithTag(5, holdingBalanceTick.price) + UnitType.ADAPTER.encodedSizeWithTag(4, holdingBalanceTick.unit_type) + protoAdapter.encodedSizeWithTag(3, holdingBalanceTick.units) + protoAdapter2.encodedSizeWithTag(2, holdingBalanceTick.market_value) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HoldingBalanceTick holdingBalanceTick = (HoldingBalanceTick) obj;
        holdingBalanceTick.getClass();
        Money money = holdingBalanceTick.price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = holdingBalanceTick.time_sec;
        Long l2 = holdingBalanceTick.units;
        UnitType unitType = holdingBalanceTick.unit_type;
        Long l3 = holdingBalanceTick.unrealized_gain_bps;
        Long l4 = holdingBalanceTick.total_gain_bps;
        byteString.getClass();
        return new HoldingBalanceTick(l, null, l2, unitType, money2, null, l3, null, null, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HoldingBalanceTick holdingBalanceTick = (HoldingBalanceTick) obj;
        holdingBalanceTick.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, holdingBalanceTick.time_sec);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, holdingBalanceTick.market_value);
        protoAdapter.encodeWithTag(protoWriter, 3, holdingBalanceTick.units);
        UnitType.ADAPTER.encodeWithTag(protoWriter, 4, holdingBalanceTick.unit_type);
        protoAdapter2.encodeWithTag(protoWriter, 5, holdingBalanceTick.price);
        protoAdapter2.encodeWithTag(protoWriter, 6, holdingBalanceTick.unrealized_gain_amount);
        protoAdapter.encodeWithTag(protoWriter, 7, holdingBalanceTick.unrealized_gain_bps);
        protoAdapter2.encodeWithTag(protoWriter, 8, holdingBalanceTick.cumulative_realized_gain_amount);
        protoAdapter2.encodeWithTag(protoWriter, 9, holdingBalanceTick.total_gain_amount);
        protoAdapter.encodeWithTag(protoWriter, 10, holdingBalanceTick.total_gain_bps);
        protoWriter.writeBytes(holdingBalanceTick.unknownFields());
    }
}
