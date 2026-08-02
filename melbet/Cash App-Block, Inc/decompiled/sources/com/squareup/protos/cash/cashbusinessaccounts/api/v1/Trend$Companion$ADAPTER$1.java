package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Trend$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Trend((Money) obj, (Trend.TrendDirection) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = Trend.TrendDirection.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Trend trend = (Trend) obj;
        reverseProtoWriter.getClass();
        trend.getClass();
        reverseProtoWriter.writeBytes(trend.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, trend.comparison_period);
        Trend.TrendDirection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, trend.trend_direction);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, trend.amount_difference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Trend trend = (Trend) obj;
        trend.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, trend.comparison_period) + Trend.TrendDirection.ADAPTER.encodedSizeWithTag(2, trend.trend_direction) + Money.ADAPTER.encodedSizeWithTag(1, trend.amount_difference) + trend.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Trend trend = (Trend) obj;
        trend.getClass();
        Money money = trend.amount_difference;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Trend.TrendDirection trendDirection = trend.trend_direction;
        String str = trend.comparison_period;
        byteString.getClass();
        return new Trend(money2, trendDirection, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Trend trend = (Trend) obj;
        trend.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, trend.amount_difference);
        Trend.TrendDirection.ADAPTER.encodeWithTag(protoWriter, 2, trend.trend_direction);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, trend.comparison_period);
        protoWriter.writeBytes(trend.unknownFields());
    }
}
