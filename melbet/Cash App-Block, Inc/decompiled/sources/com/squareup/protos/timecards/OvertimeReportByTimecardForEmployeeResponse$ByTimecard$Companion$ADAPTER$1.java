package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OvertimeReportByTimecardForEmployeeResponse$ByTimecard$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OvertimeReportByTimecardForEmployeeResponse.ByTimecard((DateTimeInterval) obj, (CalculationTotal) obj2, (Timecard) obj3, (LaborCostTotal) obj4, m, arrayList, (Shift) obj5, arrayList2, (Money) obj6, (Money) obj7, (Money) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(DateTimeInterval.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(CalculationTotal.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LaborCostTotal.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    m.add(OvertimeRule.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    arrayList.add(TimecardBreak.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(Shift.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    arrayList2.add(OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                case 11:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard byTimecard = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj;
        reverseProtoWriter.getClass();
        byTimecard.getClass();
        reverseProtoWriter.writeBytes(byTimecard.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, byTimecard.transaction_tips);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, byTimecard.declared_tips);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, byTimecard.tips);
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, byTimecard.converted_paid_break_overages);
        Shift.ADAPTER.encodeWithTag(reverseProtoWriter, 7, byTimecard.shift);
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, byTimecard.timecard_breaks);
        OvertimeRule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, byTimecard.overtime_rules);
        LaborCostTotal.ADAPTER.encodeWithTag(reverseProtoWriter, 4, byTimecard.labor_cost);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 3, byTimecard.timecard);
        CalculationTotal.ADAPTER.encodeWithTag(reverseProtoWriter, 2, byTimecard.calculation_total);
        DateTimeInterval.ADAPTER.encodeWithTag(reverseProtoWriter, 1, byTimecard.calculated_zoned_date_time_range);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard byTimecard = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj;
        byTimecard.getClass();
        int encodedSizeWithTag = OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage.ADAPTER.asRepeated().encodedSizeWithTag(8, byTimecard.converted_paid_break_overages) + Shift.ADAPTER.encodedSizeWithTag(7, byTimecard.shift) + TimecardBreak.ADAPTER.asRepeated().encodedSizeWithTag(6, byTimecard.timecard_breaks) + OvertimeRule.ADAPTER.asRepeated().encodedSizeWithTag(5, byTimecard.overtime_rules) + LaborCostTotal.ADAPTER.encodedSizeWithTag(4, byTimecard.labor_cost) + Timecard.ADAPTER.encodedSizeWithTag(3, byTimecard.timecard) + CalculationTotal.ADAPTER.encodedSizeWithTag(2, byTimecard.calculation_total) + DateTimeInterval.ADAPTER.encodedSizeWithTag(1, byTimecard.calculated_zoned_date_time_range) + byTimecard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(11, byTimecard.transaction_tips) + protoAdapter.encodedSizeWithTag(10, byTimecard.declared_tips) + protoAdapter.encodedSizeWithTag(9, byTimecard.tips) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard byTimecard = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj;
        byTimecard.getClass();
        DateTimeInterval dateTimeInterval = byTimecard.calculated_zoned_date_time_range;
        DateTimeInterval dateTimeInterval2 = dateTimeInterval != null ? (DateTimeInterval) DateTimeInterval.ADAPTER.redact(dateTimeInterval) : null;
        CalculationTotal calculationTotal = byTimecard.calculation_total;
        CalculationTotal calculationTotal2 = calculationTotal != null ? (CalculationTotal) CalculationTotal.ADAPTER.redact(calculationTotal) : null;
        Timecard timecard = byTimecard.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        LaborCostTotal laborCostTotal = byTimecard.labor_cost;
        LaborCostTotal laborCostTotal2 = laborCostTotal != null ? (LaborCostTotal) LaborCostTotal.ADAPTER.redact(laborCostTotal) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(byTimecard.overtime_rules, OvertimeRule.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(byTimecard.timecard_breaks, TimecardBreak.ADAPTER);
        Shift shift = byTimecard.shift;
        Shift shift2 = shift != null ? (Shift) Shift.ADAPTER.redact(shift) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(byTimecard.converted_paid_break_overages, OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage.ADAPTER);
        Money money = byTimecard.tips;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = byTimecard.declared_tips;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = byTimecard.transaction_tips;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OvertimeReportByTimecardForEmployeeResponse.ByTimecard(dateTimeInterval2, calculationTotal2, timecard2, laborCostTotal2, m1169redactElements, m1169redactElements2, shift2, m1169redactElements3, money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard byTimecard = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj;
        byTimecard.getClass();
        DateTimeInterval.ADAPTER.encodeWithTag(protoWriter, 1, byTimecard.calculated_zoned_date_time_range);
        CalculationTotal.ADAPTER.encodeWithTag(protoWriter, 2, byTimecard.calculation_total);
        Timecard.ADAPTER.encodeWithTag(protoWriter, 3, byTimecard.timecard);
        LaborCostTotal.ADAPTER.encodeWithTag(protoWriter, 4, byTimecard.labor_cost);
        OvertimeRule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, byTimecard.overtime_rules);
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, byTimecard.timecard_breaks);
        Shift.ADAPTER.encodeWithTag(protoWriter, 7, byTimecard.shift);
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, byTimecard.converted_paid_break_overages);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 9, byTimecard.tips);
        protoAdapter.encodeWithTag(protoWriter, 10, byTimecard.declared_tips);
        protoAdapter.encodeWithTag(protoWriter, 11, byTimecard.transaction_tips);
        protoWriter.writeBytes(byTimecard.unknownFields());
    }
}
