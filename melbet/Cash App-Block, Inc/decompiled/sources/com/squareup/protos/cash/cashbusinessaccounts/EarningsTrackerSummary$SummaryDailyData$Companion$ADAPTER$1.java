package com.squareup.protos.cash.cashbusinessaccounts;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EarningsTrackerSummary$SummaryDailyData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsTrackerSummary.SummaryDailyData((Money) obj2, (Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsTrackerSummary.SummaryDailyData summaryDailyData = (EarningsTrackerSummary.SummaryDailyData) obj;
        reverseProtoWriter.getClass();
        summaryDailyData.getClass();
        reverseProtoWriter.writeBytes(summaryDailyData.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, summaryDailyData.amount);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, summaryDailyData.day);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsTrackerSummary.SummaryDailyData summaryDailyData = (EarningsTrackerSummary.SummaryDailyData) obj;
        summaryDailyData.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, summaryDailyData.amount) + ProtoAdapter.INT32.encodedSizeWithTag(1, summaryDailyData.day) + summaryDailyData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsTrackerSummary.SummaryDailyData summaryDailyData = (EarningsTrackerSummary.SummaryDailyData) obj;
        summaryDailyData.getClass();
        Money money = summaryDailyData.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = summaryDailyData.day;
        byteString.getClass();
        return new EarningsTrackerSummary.SummaryDailyData(money2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsTrackerSummary.SummaryDailyData summaryDailyData = (EarningsTrackerSummary.SummaryDailyData) obj;
        summaryDailyData.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, summaryDailyData.day);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, summaryDailyData.amount);
        protoWriter.writeBytes(summaryDailyData.unknownFields());
    }
}
