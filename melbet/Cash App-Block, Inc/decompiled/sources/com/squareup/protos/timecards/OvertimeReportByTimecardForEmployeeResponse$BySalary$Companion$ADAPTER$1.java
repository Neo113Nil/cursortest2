package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OvertimeReportByTimecardForEmployeeResponse$BySalary$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OvertimeReportByTimecardForEmployeeResponse.BySalary((CalculationTotal) obj, (Boolean) obj2, (LaborCostTotal) obj3, (EmployeeJobInfo) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CalculationTotal.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(LaborCostTotal.ADAPTER, protoReader, obj3);
            } else if (nextTag == 3) {
                obj4 = TransactorKt.decodeMessageOrMerge(EmployeeJobInfo.ADAPTER, protoReader, obj4);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.BySalary bySalary = (OvertimeReportByTimecardForEmployeeResponse.BySalary) obj;
        reverseProtoWriter.getClass();
        bySalary.getClass();
        reverseProtoWriter.writeBytes(bySalary.unknownFields());
        EmployeeJobInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bySalary.employee_job_info);
        LaborCostTotal.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bySalary.labor_cost);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, bySalary.override_timecards);
        CalculationTotal.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bySalary.calculation_total);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.BySalary bySalary = (OvertimeReportByTimecardForEmployeeResponse.BySalary) obj;
        bySalary.getClass();
        return EmployeeJobInfo.ADAPTER.encodedSizeWithTag(3, bySalary.employee_job_info) + LaborCostTotal.ADAPTER.encodedSizeWithTag(2, bySalary.labor_cost) + ProtoAdapter.BOOL.encodedSizeWithTag(4, bySalary.override_timecards) + CalculationTotal.ADAPTER.encodedSizeWithTag(1, bySalary.calculation_total) + bySalary.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.BySalary bySalary = (OvertimeReportByTimecardForEmployeeResponse.BySalary) obj;
        bySalary.getClass();
        CalculationTotal calculationTotal = bySalary.calculation_total;
        CalculationTotal calculationTotal2 = calculationTotal != null ? (CalculationTotal) CalculationTotal.ADAPTER.redact(calculationTotal) : null;
        LaborCostTotal laborCostTotal = bySalary.labor_cost;
        LaborCostTotal laborCostTotal2 = laborCostTotal != null ? (LaborCostTotal) LaborCostTotal.ADAPTER.redact(laborCostTotal) : null;
        EmployeeJobInfo employeeJobInfo = bySalary.employee_job_info;
        EmployeeJobInfo employeeJobInfo2 = employeeJobInfo != null ? (EmployeeJobInfo) EmployeeJobInfo.ADAPTER.redact(employeeJobInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = bySalary.override_timecards;
        byteString.getClass();
        return new OvertimeReportByTimecardForEmployeeResponse.BySalary(calculationTotal2, bool, laborCostTotal2, employeeJobInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.BySalary bySalary = (OvertimeReportByTimecardForEmployeeResponse.BySalary) obj;
        bySalary.getClass();
        CalculationTotal.ADAPTER.encodeWithTag(protoWriter, 1, bySalary.calculation_total);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, bySalary.override_timecards);
        LaborCostTotal.ADAPTER.encodeWithTag(protoWriter, 2, bySalary.labor_cost);
        EmployeeJobInfo.ADAPTER.encodeWithTag(protoWriter, 3, bySalary.employee_job_info);
        protoWriter.writeBytes(bySalary.unknownFields());
    }
}
