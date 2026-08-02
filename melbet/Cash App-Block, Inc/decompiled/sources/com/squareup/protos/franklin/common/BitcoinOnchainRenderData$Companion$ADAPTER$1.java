package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BitcoinOnchainRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new BitcoinOnchainRenderData((String) obj4, (Money) obj5, (Money) obj6, (Money) obj7, (Money) obj8, (Long) obj9, m, (NetworkCongestionLevel) obj10, (String) obj11, (OnchainTransactionType) obj12, (Long) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    continue;
                case 3:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    continue;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    continue;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    continue;
                case 6:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 7:
                    obj = obj4;
                    obj2 = obj9;
                    obj3 = obj10;
                    m.add(BitcoinStatus.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj = obj4;
                    obj2 = obj9;
                    obj3 = obj10;
                    try {
                        obj4 = obj;
                        obj10 = NetworkCongestionLevel.ADAPTER.decode(protoReader);
                        obj9 = obj2;
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    try {
                        obj12 = OnchainTransactionType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj9;
                        obj3 = obj10;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 11:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj9;
                    obj3 = obj10;
                    break;
            }
            obj4 = obj;
            obj9 = obj2;
            obj10 = obj3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinOnchainRenderData bitcoinOnchainRenderData = (BitcoinOnchainRenderData) obj;
        reverseProtoWriter.getClass();
        bitcoinOnchainRenderData.getClass();
        reverseProtoWriter.writeBytes(bitcoinOnchainRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, bitcoinOnchainRenderData.speed_upgradable_until);
        OnchainTransactionType.ADAPTER.encodeWithTag(reverseProtoWriter, 10, bitcoinOnchainRenderData.transaction_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, bitcoinOnchainRenderData.block_explorer_link);
        NetworkCongestionLevel.ADAPTER.encodeWithTag(reverseProtoWriter, 8, bitcoinOnchainRenderData.network_congestion_level);
        BitcoinStatus.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, bitcoinOnchainRenderData.statuses);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, bitcoinOnchainRenderData.selected_wait_time);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, bitcoinOnchainRenderData.fiat_fee_equivalent);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, bitcoinOnchainRenderData.bitcoin_fee_amount);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, bitcoinOnchainRenderData.fiat_equivalent);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, bitcoinOnchainRenderData.bitcoin_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, bitcoinOnchainRenderData.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinOnchainRenderData bitcoinOnchainRenderData = (BitcoinOnchainRenderData) obj;
        bitcoinOnchainRenderData.getClass();
        int size$okio = bitcoinOnchainRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, bitcoinOnchainRenderData.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, bitcoinOnchainRenderData.fiat_fee_equivalent) + protoAdapter2.encodedSizeWithTag(4, bitcoinOnchainRenderData.bitcoin_fee_amount) + protoAdapter2.encodedSizeWithTag(3, bitcoinOnchainRenderData.fiat_equivalent) + protoAdapter2.encodedSizeWithTag(2, bitcoinOnchainRenderData.bitcoin_amount) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter3.encodedSizeWithTag(11, bitcoinOnchainRenderData.speed_upgradable_until) + OnchainTransactionType.ADAPTER.encodedSizeWithTag(10, bitcoinOnchainRenderData.transaction_type) + protoAdapter.encodedSizeWithTag(9, bitcoinOnchainRenderData.block_explorer_link) + NetworkCongestionLevel.ADAPTER.encodedSizeWithTag(8, bitcoinOnchainRenderData.network_congestion_level) + BitcoinStatus.ADAPTER.asRepeated().encodedSizeWithTag(7, bitcoinOnchainRenderData.statuses) + protoAdapter3.encodedSizeWithTag(6, bitcoinOnchainRenderData.selected_wait_time) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinOnchainRenderData bitcoinOnchainRenderData = (BitcoinOnchainRenderData) obj;
        bitcoinOnchainRenderData.getClass();
        Money money = bitcoinOnchainRenderData.bitcoin_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = bitcoinOnchainRenderData.fiat_equivalent;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = bitcoinOnchainRenderData.bitcoin_fee_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = bitcoinOnchainRenderData.fiat_fee_equivalent;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bitcoinOnchainRenderData.statuses, BitcoinStatus.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = bitcoinOnchainRenderData.token;
        Long l = bitcoinOnchainRenderData.selected_wait_time;
        NetworkCongestionLevel networkCongestionLevel = bitcoinOnchainRenderData.network_congestion_level;
        String str2 = bitcoinOnchainRenderData.block_explorer_link;
        OnchainTransactionType onchainTransactionType = bitcoinOnchainRenderData.transaction_type;
        Long l2 = bitcoinOnchainRenderData.speed_upgradable_until;
        byteString.getClass();
        return new BitcoinOnchainRenderData(str, money2, money4, money6, money8, l, m1169redactElements, networkCongestionLevel, str2, onchainTransactionType, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinOnchainRenderData bitcoinOnchainRenderData = (BitcoinOnchainRenderData) obj;
        bitcoinOnchainRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bitcoinOnchainRenderData.token);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, bitcoinOnchainRenderData.bitcoin_amount);
        protoAdapter2.encodeWithTag(protoWriter, 3, bitcoinOnchainRenderData.fiat_equivalent);
        protoAdapter2.encodeWithTag(protoWriter, 4, bitcoinOnchainRenderData.bitcoin_fee_amount);
        protoAdapter2.encodeWithTag(protoWriter, 5, bitcoinOnchainRenderData.fiat_fee_equivalent);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 6, bitcoinOnchainRenderData.selected_wait_time);
        BitcoinStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, bitcoinOnchainRenderData.statuses);
        NetworkCongestionLevel.ADAPTER.encodeWithTag(protoWriter, 8, bitcoinOnchainRenderData.network_congestion_level);
        protoAdapter.encodeWithTag(protoWriter, 9, bitcoinOnchainRenderData.block_explorer_link);
        OnchainTransactionType.ADAPTER.encodeWithTag(protoWriter, 10, bitcoinOnchainRenderData.transaction_type);
        protoAdapter3.encodeWithTag(protoWriter, 11, bitcoinOnchainRenderData.speed_upgradable_until);
        protoWriter.writeBytes(bitcoinOnchainRenderData.unknownFields());
    }
}
