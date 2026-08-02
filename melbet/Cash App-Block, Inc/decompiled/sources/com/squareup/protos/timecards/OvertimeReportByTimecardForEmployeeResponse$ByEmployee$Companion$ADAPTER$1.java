package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OvertimeReportByTimecardForEmployeeResponse$ByEmployee$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OvertimeReportByTimecardForEmployeeResponse.ByEmployee((String) obj, m, arrayList, (PaidBreakOverageConversionSummary) obj2, (Money) obj3, (Money) obj4, (Money) obj5, arrayList2, (Money) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(LaborCalculationSummary.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    arrayList.add(OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj2 = TransactorKt.decodeMessageOrMerge(PaidBreakOverageConversionSummary.ADAPTER, protoReader, obj2);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    arrayList2.add(OvertimeReportByTimecardForEmployeeResponse.BySalary.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByEmployee byEmployee = (OvertimeReportByTimecardForEmployeeResponse.ByEmployee) obj;
        reverseProtoWriter.getClass();
        byEmployee.getClass();
        reverseProtoWriter.writeBytes(byEmployee.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, byEmployee.average_wage);
        OvertimeReportByTimecardForEmployeeResponse.BySalary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, byEmployee.by_salaries);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, byEmployee.total_declared_tips);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, byEmployee.total_transaction_tips);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, byEmployee.total_tips);
        PaidBreakOverageConversionSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 4, byEmployee.paid_break_overage_conversion_summary);
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, byEmployee.by_timecards);
        LaborCalculationSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, byEmployee.labor_calculation_summaries_by_workweek);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, byEmployee.employee_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByEmployee byEmployee = (OvertimeReportByTimecardForEmployeeResponse.ByEmployee) obj;
        byEmployee.getClass();
        int encodedSizeWithTag = PaidBreakOverageConversionSummary.ADAPTER.encodedSizeWithTag(4, byEmployee.paid_break_overage_conversion_summary) + OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ADAPTER.asRepeated().encodedSizeWithTag(3, byEmployee.by_timecards) + LaborCalculationSummary.ADAPTER.asRepeated().encodedSizeWithTag(2, byEmployee.labor_calculation_summaries_by_workweek) + ProtoAdapter.STRING.encodedSizeWithTag(1, byEmployee.employee_token) + byEmployee.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, byEmployee.average_wage) + OvertimeReportByTimecardForEmployeeResponse.BySalary.ADAPTER.asRepeated().encodedSizeWithTag(8, byEmployee.by_salaries) + protoAdapter.encodedSizeWithTag(7, byEmployee.total_declared_tips) + protoAdapter.encodedSizeWithTag(6, byEmployee.total_transaction_tips) + protoAdapter.encodedSizeWithTag(5, byEmployee.total_tips) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByEmployee byEmployee = (OvertimeReportByTimecardForEmployeeResponse.ByEmployee) obj;
        byEmployee.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(byEmployee.labor_calculation_summaries_by_workweek, LaborCalculationSummary.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(byEmployee.by_timecards, OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ADAPTER);
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = byEmployee.paid_break_overage_conversion_summary;
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary2 = paidBreakOverageConversionSummary != null ? (PaidBreakOverageConversionSummary) PaidBreakOverageConversionSummary.ADAPTER.redact(paidBreakOverageConversionSummary) : null;
        Money money = byEmployee.total_tips;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = byEmployee.total_transaction_tips;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = byEmployee.total_declared_tips;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(byEmployee.by_salaries, OvertimeReportByTimecardForEmployeeResponse.BySalary.ADAPTER);
        Money money7 = byEmployee.average_wage;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = byEmployee.employee_token;
        byteString.getClass();
        return new OvertimeReportByTimecardForEmployeeResponse.ByEmployee(str, m1169redactElements, m1169redactElements2, paidBreakOverageConversionSummary2, money2, money4, money6, m1169redactElements3, money8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByEmployee byEmployee = (OvertimeReportByTimecardForEmployeeResponse.ByEmployee) obj;
        byEmployee.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, byEmployee.employee_token);
        LaborCalculationSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, byEmployee.labor_calculation_summaries_by_workweek);
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, byEmployee.by_timecards);
        PaidBreakOverageConversionSummary.ADAPTER.encodeWithTag(protoWriter, 4, byEmployee.paid_break_overage_conversion_summary);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, byEmployee.total_tips);
        protoAdapter.encodeWithTag(protoWriter, 6, byEmployee.total_transaction_tips);
        protoAdapter.encodeWithTag(protoWriter, 7, byEmployee.total_declared_tips);
        OvertimeReportByTimecardForEmployeeResponse.BySalary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, byEmployee.by_salaries);
        protoAdapter.encodeWithTag(protoWriter, 9, byEmployee.average_wage);
        protoWriter.writeBytes(byEmployee.unknownFields());
    }
}
