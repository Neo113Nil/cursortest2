package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentHolding$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncInvestmentHolding((String) obj, (String) obj2, (Money) obj3, (SyncInvestmentHolding.InvestmentHoldingState) obj4, (ScheduledReloadData) obj5, (SyncInvestmentHolding.DailyGainParams) obj6, (Money) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                        obj4 = SyncInvestmentHolding.InvestmentHoldingState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(ScheduledReloadData.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(SyncInvestmentHolding.DailyGainParams.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
        reverseProtoWriter.getClass();
        syncInvestmentHolding.getClass();
        reverseProtoWriter.writeBytes(syncInvestmentHolding.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, syncInvestmentHolding.average_cost);
        SyncInvestmentHolding.DailyGainParams.ADAPTER.encodeWithTag(reverseProtoWriter, 6, syncInvestmentHolding.daily_gain_params);
        ScheduledReloadData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, syncInvestmentHolding.scheduled_buy_data);
        SyncInvestmentHolding.InvestmentHoldingState.ADAPTER.encodeWithTag(reverseProtoWriter, 4, syncInvestmentHolding.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, syncInvestmentHolding.active_invested_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, syncInvestmentHolding.units);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, syncInvestmentHolding.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
        syncInvestmentHolding.getClass();
        int size$okio = syncInvestmentHolding.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, syncInvestmentHolding.units) + protoAdapter.encodedSizeWithTag(1, syncInvestmentHolding.investment_entity_token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, syncInvestmentHolding.average_cost) + SyncInvestmentHolding.DailyGainParams.ADAPTER.encodedSizeWithTag(6, syncInvestmentHolding.daily_gain_params) + ScheduledReloadData.ADAPTER.encodedSizeWithTag(5, syncInvestmentHolding.scheduled_buy_data) + SyncInvestmentHolding.InvestmentHoldingState.ADAPTER.encodedSizeWithTag(4, syncInvestmentHolding.state) + protoAdapter2.encodedSizeWithTag(3, syncInvestmentHolding.active_invested_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
        syncInvestmentHolding.getClass();
        Money money = syncInvestmentHolding.active_invested_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ScheduledReloadData scheduledReloadData = syncInvestmentHolding.scheduled_buy_data;
        ScheduledReloadData scheduledReloadData2 = scheduledReloadData != null ? (ScheduledReloadData) ScheduledReloadData.ADAPTER.redact(scheduledReloadData) : null;
        SyncInvestmentHolding.DailyGainParams dailyGainParams = syncInvestmentHolding.daily_gain_params;
        SyncInvestmentHolding.DailyGainParams dailyGainParams2 = dailyGainParams != null ? (SyncInvestmentHolding.DailyGainParams) SyncInvestmentHolding.DailyGainParams.ADAPTER.redact(dailyGainParams) : null;
        Money money3 = syncInvestmentHolding.average_cost;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = syncInvestmentHolding.investment_entity_token;
        String str2 = syncInvestmentHolding.units;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = syncInvestmentHolding.state;
        byteString.getClass();
        return new SyncInvestmentHolding(str, str2, money2, investmentHoldingState, scheduledReloadData2, dailyGainParams2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
        syncInvestmentHolding.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncInvestmentHolding.investment_entity_token);
        protoAdapter.encodeWithTag(protoWriter, 2, syncInvestmentHolding.units);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, syncInvestmentHolding.active_invested_amount);
        SyncInvestmentHolding.InvestmentHoldingState.ADAPTER.encodeWithTag(protoWriter, 4, syncInvestmentHolding.state);
        ScheduledReloadData.ADAPTER.encodeWithTag(protoWriter, 5, syncInvestmentHolding.scheduled_buy_data);
        SyncInvestmentHolding.DailyGainParams.ADAPTER.encodeWithTag(protoWriter, 6, syncInvestmentHolding.daily_gain_params);
        protoAdapter2.encodeWithTag(protoWriter, 7, syncInvestmentHolding.average_cost);
        protoWriter.writeBytes(syncInvestmentHolding.unknownFields());
    }
}
