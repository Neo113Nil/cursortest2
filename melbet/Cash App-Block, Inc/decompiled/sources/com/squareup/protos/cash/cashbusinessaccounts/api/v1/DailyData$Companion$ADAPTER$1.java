package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DailyData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DailyData((Money) obj2, (Integer) obj, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DailyData dailyData = (DailyData) obj;
        reverseProtoWriter.getClass();
        dailyData.getClass();
        reverseProtoWriter.writeBytes(dailyData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, dailyData.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dailyData.month);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dailyData.earnings);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dailyData.date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DailyData dailyData = (DailyData) obj;
        dailyData.getClass();
        int size$okio = dailyData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, dailyData.year) + protoAdapter.encodedSizeWithTag(3, dailyData.month) + Money.ADAPTER.encodedSizeWithTag(2, dailyData.earnings) + protoAdapter.encodedSizeWithTag(1, dailyData.date) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DailyData dailyData = (DailyData) obj;
        dailyData.getClass();
        Money money = dailyData.earnings;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = dailyData.date;
        Integer num2 = dailyData.month;
        Integer num3 = dailyData.year;
        byteString.getClass();
        return new DailyData(money2, num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DailyData dailyData = (DailyData) obj;
        dailyData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, dailyData.date);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, dailyData.earnings);
        protoAdapter.encodeWithTag(protoWriter, 3, dailyData.month);
        protoAdapter.encodeWithTag(protoWriter, 4, dailyData.year);
        protoWriter.writeBytes(dailyData.unknownFields());
    }
}
