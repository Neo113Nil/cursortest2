package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LaborCostTotal$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LaborCostTotal((Money) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LaborCostTotal laborCostTotal = (LaborCostTotal) obj;
        reverseProtoWriter.getClass();
        laborCostTotal.getClass();
        reverseProtoWriter.writeBytes(laborCostTotal.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, laborCostTotal.doubletime_labor_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, laborCostTotal.overtime_labor_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, laborCostTotal.regular_labor_money);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LaborCostTotal laborCostTotal = (LaborCostTotal) obj;
        laborCostTotal.getClass();
        int size$okio = laborCostTotal.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, laborCostTotal.doubletime_labor_money) + protoAdapter.encodedSizeWithTag(3, laborCostTotal.overtime_labor_money) + protoAdapter.encodedSizeWithTag(2, laborCostTotal.regular_labor_money) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LaborCostTotal laborCostTotal = (LaborCostTotal) obj;
        laborCostTotal.getClass();
        Money money = laborCostTotal.regular_labor_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = laborCostTotal.overtime_labor_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = laborCostTotal.doubletime_labor_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LaborCostTotal(money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LaborCostTotal laborCostTotal = (LaborCostTotal) obj;
        laborCostTotal.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, laborCostTotal.regular_labor_money);
        protoAdapter.encodeWithTag(protoWriter, 3, laborCostTotal.overtime_labor_money);
        protoAdapter.encodeWithTag(protoWriter, 4, laborCostTotal.doubletime_labor_money);
        protoWriter.writeBytes(laborCostTotal.unknownFields());
    }
}
