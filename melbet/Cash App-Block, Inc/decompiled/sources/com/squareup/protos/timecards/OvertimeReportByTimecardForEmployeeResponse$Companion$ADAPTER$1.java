package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OvertimeReportByTimecardForEmployeeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OvertimeReportByTimecardForEmployeeResponse(m, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(OvertimeReportByTimecardForEmployeeResponse.ByEmployee.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) obj;
        reverseProtoWriter.getClass();
        overtimeReportByTimecardForEmployeeResponse.getClass();
        reverseProtoWriter.writeBytes(overtimeReportByTimecardForEmployeeResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, overtimeReportByTimecardForEmployeeResponse.cursor);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, overtimeReportByTimecardForEmployeeResponse.next_cursor);
        OvertimeReportByTimecardForEmployeeResponse.ByEmployee.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, overtimeReportByTimecardForEmployeeResponse.by_employees);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) obj;
        overtimeReportByTimecardForEmployeeResponse.getClass();
        int encodedSizeWithTag = OvertimeReportByTimecardForEmployeeResponse.ByEmployee.ADAPTER.asRepeated().encodedSizeWithTag(1, overtimeReportByTimecardForEmployeeResponse.by_employees) + overtimeReportByTimecardForEmployeeResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, overtimeReportByTimecardForEmployeeResponse.cursor) + protoAdapter.encodedSizeWithTag(2, overtimeReportByTimecardForEmployeeResponse.next_cursor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) obj;
        overtimeReportByTimecardForEmployeeResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(overtimeReportByTimecardForEmployeeResponse.by_employees, OvertimeReportByTimecardForEmployeeResponse.ByEmployee.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = overtimeReportByTimecardForEmployeeResponse.next_cursor;
        String str2 = overtimeReportByTimecardForEmployeeResponse.cursor;
        byteString.getClass();
        return new OvertimeReportByTimecardForEmployeeResponse(m1169redactElements, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) obj;
        overtimeReportByTimecardForEmployeeResponse.getClass();
        OvertimeReportByTimecardForEmployeeResponse.ByEmployee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, overtimeReportByTimecardForEmployeeResponse.by_employees);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, overtimeReportByTimecardForEmployeeResponse.next_cursor);
        protoAdapter.encodeWithTag(protoWriter, 3, overtimeReportByTimecardForEmployeeResponse.cursor);
        protoWriter.writeBytes(overtimeReportByTimecardForEmployeeResponse.unknownFields());
    }
}
