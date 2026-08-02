package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncInvestmentHolding$DailyGainParams$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncInvestmentHolding.DailyGainParams((Long) obj, (String) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentHolding.DailyGainParams dailyGainParams = (SyncInvestmentHolding.DailyGainParams) obj;
        reverseProtoWriter.getClass();
        dailyGainParams.getClass();
        reverseProtoWriter.writeBytes(dailyGainParams.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, dailyGainParams.day_cash_value_change);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, dailyGainParams.units_at_market_open);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, dailyGainParams.valid_until_seconds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentHolding.DailyGainParams dailyGainParams = (SyncInvestmentHolding.DailyGainParams) obj;
        dailyGainParams.getClass();
        return Money.ADAPTER.encodedSizeWithTag(3, dailyGainParams.day_cash_value_change) + ProtoAdapter.STRING.encodedSizeWithTag(2, dailyGainParams.units_at_market_open) + ProtoAdapter.INT64.encodedSizeWithTag(1, dailyGainParams.valid_until_seconds) + dailyGainParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentHolding.DailyGainParams dailyGainParams = (SyncInvestmentHolding.DailyGainParams) obj;
        dailyGainParams.getClass();
        Money money = dailyGainParams.day_cash_value_change;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = dailyGainParams.valid_until_seconds;
        String str = dailyGainParams.units_at_market_open;
        byteString.getClass();
        return new SyncInvestmentHolding.DailyGainParams(l, str, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentHolding.DailyGainParams dailyGainParams = (SyncInvestmentHolding.DailyGainParams) obj;
        dailyGainParams.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, dailyGainParams.valid_until_seconds);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, dailyGainParams.units_at_market_open);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, dailyGainParams.day_cash_value_change);
        protoWriter.writeBytes(dailyGainParams.unknownFields());
    }
}
