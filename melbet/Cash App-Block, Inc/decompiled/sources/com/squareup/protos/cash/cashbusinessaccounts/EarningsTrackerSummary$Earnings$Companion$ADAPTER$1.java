package com.squareup.protos.cash.cashbusinessaccounts;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EarningsTrackerSummary$Earnings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsTrackerSummary.Earnings((Money) obj, (String) obj2, (Integer) obj3, (Integer) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(EarningsTrackerSummary.SummaryDailyData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsTrackerSummary.Earnings earnings = (EarningsTrackerSummary.Earnings) obj;
        reverseProtoWriter.getClass();
        earnings.getClass();
        reverseProtoWriter.writeBytes(earnings.unknownFields());
        EarningsTrackerSummary.SummaryDailyData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, earnings.daily_data);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, earnings.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, earnings.month);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, earnings.duration);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earnings.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsTrackerSummary.Earnings earnings = (EarningsTrackerSummary.Earnings) obj;
        earnings.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, earnings.duration) + Money.ADAPTER.encodedSizeWithTag(1, earnings.amount) + earnings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return EarningsTrackerSummary.SummaryDailyData.ADAPTER.asRepeated().encodedSizeWithTag(5, earnings.daily_data) + protoAdapter.encodedSizeWithTag(4, earnings.year) + protoAdapter.encodedSizeWithTag(3, earnings.month) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsTrackerSummary.Earnings earnings = (EarningsTrackerSummary.Earnings) obj;
        earnings.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earnings.daily_data, EarningsTrackerSummary.SummaryDailyData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = earnings.duration;
        Integer num = earnings.month;
        Integer num2 = earnings.year;
        byteString.getClass();
        return new EarningsTrackerSummary.Earnings(null, str, num, num2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsTrackerSummary.Earnings earnings = (EarningsTrackerSummary.Earnings) obj;
        earnings.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, earnings.amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, earnings.duration);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 3, earnings.month);
        protoAdapter.encodeWithTag(protoWriter, 4, earnings.year);
        EarningsTrackerSummary.SummaryDailyData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, earnings.daily_data);
        protoWriter.writeBytes(earnings.unknownFields());
    }
}
