package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class YearlyData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new YearlyData((Money) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        YearlyData yearlyData = (YearlyData) obj;
        reverseProtoWriter.getClass();
        yearlyData.getClass();
        reverseProtoWriter.writeBytes(yearlyData.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, yearlyData.year);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, yearlyData.earnings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        YearlyData yearlyData = (YearlyData) obj;
        yearlyData.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, yearlyData.year) + Money.ADAPTER.encodedSizeWithTag(2, yearlyData.earnings) + yearlyData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        YearlyData yearlyData = (YearlyData) obj;
        yearlyData.getClass();
        Money money = yearlyData.earnings;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = yearlyData.year;
        byteString.getClass();
        return new YearlyData(money2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        YearlyData yearlyData = (YearlyData) obj;
        yearlyData.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 2, yearlyData.earnings);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, yearlyData.year);
        protoWriter.writeBytes(yearlyData.unknownFields());
    }
}
