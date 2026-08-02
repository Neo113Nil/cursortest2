package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LaborCalculationSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LaborCalculationSummary((LocalDateTimeRange) obj, (Money) obj2, (Long) obj3, (Money) obj4, m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalDateTimeRange.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    m.add(LaborCalculation.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    arrayList.add(LaborCalculation.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    arrayList2.add(LaborCalculation.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LaborCalculationSummary laborCalculationSummary = (LaborCalculationSummary) obj;
        reverseProtoWriter.getClass();
        laborCalculationSummary.getClass();
        reverseProtoWriter.writeBytes(laborCalculationSummary.unknownFields());
        ProtoAdapter protoAdapter = LaborCalculation.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 7, laborCalculationSummary.doubletime_labor_calculations);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, laborCalculationSummary.overtime_labor_calculations);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, laborCalculationSummary.regular_labor_calculations);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, laborCalculationSummary.total_labor_money);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 3, laborCalculationSummary.total_paid_seconds);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, laborCalculationSummary.average_wage);
        LocalDateTimeRange.ADAPTER.encodeWithTag(reverseProtoWriter, 1, laborCalculationSummary.local_date_time_range);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LaborCalculationSummary laborCalculationSummary = (LaborCalculationSummary) obj;
        laborCalculationSummary.getClass();
        int encodedSizeWithTag = LocalDateTimeRange.ADAPTER.encodedSizeWithTag(1, laborCalculationSummary.local_date_time_range) + laborCalculationSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, laborCalculationSummary.total_labor_money) + ProtoAdapter.UINT64.encodedSizeWithTag(3, laborCalculationSummary.total_paid_seconds) + protoAdapter.encodedSizeWithTag(2, laborCalculationSummary.average_wage) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LaborCalculation.ADAPTER;
        return protoAdapter2.asRepeated().encodedSizeWithTag(7, laborCalculationSummary.doubletime_labor_calculations) + protoAdapter2.asRepeated().encodedSizeWithTag(6, laborCalculationSummary.overtime_labor_calculations) + protoAdapter2.asRepeated().encodedSizeWithTag(5, laborCalculationSummary.regular_labor_calculations) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LaborCalculationSummary laborCalculationSummary = (LaborCalculationSummary) obj;
        laborCalculationSummary.getClass();
        LocalDateTimeRange localDateTimeRange = laborCalculationSummary.local_date_time_range;
        LocalDateTimeRange localDateTimeRange2 = localDateTimeRange != null ? (LocalDateTimeRange) LocalDateTimeRange.ADAPTER.redact(localDateTimeRange) : null;
        Money money = laborCalculationSummary.average_wage;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = laborCalculationSummary.total_labor_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        List list = laborCalculationSummary.regular_labor_calculations;
        ProtoAdapter protoAdapter = LaborCalculation.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(laborCalculationSummary.overtime_labor_calculations, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(laborCalculationSummary.doubletime_labor_calculations, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        Long l = laborCalculationSummary.total_paid_seconds;
        byteString.getClass();
        return new LaborCalculationSummary(localDateTimeRange2, money2, l, money4, m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LaborCalculationSummary laborCalculationSummary = (LaborCalculationSummary) obj;
        laborCalculationSummary.getClass();
        LocalDateTimeRange.ADAPTER.encodeWithTag(protoWriter, 1, laborCalculationSummary.local_date_time_range);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, laborCalculationSummary.average_wage);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 3, laborCalculationSummary.total_paid_seconds);
        protoAdapter.encodeWithTag(protoWriter, 4, laborCalculationSummary.total_labor_money);
        ProtoAdapter protoAdapter2 = LaborCalculation.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, laborCalculationSummary.regular_labor_calculations);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, laborCalculationSummary.overtime_labor_calculations);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, laborCalculationSummary.doubletime_labor_calculations);
        protoWriter.writeBytes(laborCalculationSummary.unknownFields());
    }
}
