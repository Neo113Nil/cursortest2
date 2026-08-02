package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MonthlyData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MonthlyData((Money) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MonthlyData monthlyData = (MonthlyData) obj;
        reverseProtoWriter.getClass();
        monthlyData.getClass();
        reverseProtoWriter.writeBytes(monthlyData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, monthlyData.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, monthlyData.month);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, monthlyData.earnings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MonthlyData monthlyData = (MonthlyData) obj;
        monthlyData.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, monthlyData.earnings) + monthlyData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, monthlyData.year) + protoAdapter.encodedSizeWithTag(3, monthlyData.month) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MonthlyData monthlyData = (MonthlyData) obj;
        monthlyData.getClass();
        Money money = monthlyData.earnings;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = monthlyData.month;
        Integer num2 = monthlyData.year;
        byteString.getClass();
        return new MonthlyData(money2, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MonthlyData monthlyData = (MonthlyData) obj;
        monthlyData.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 2, monthlyData.earnings);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 3, monthlyData.month);
        protoAdapter.encodeWithTag(protoWriter, 4, monthlyData.year);
        protoWriter.writeBytes(monthlyData.unknownFields());
    }
}
