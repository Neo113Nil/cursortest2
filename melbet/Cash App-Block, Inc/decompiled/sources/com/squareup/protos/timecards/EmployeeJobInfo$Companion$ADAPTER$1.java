package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EmployeeJobInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EmployeeJobInfo((String) obj, (String) obj2, (Money) obj3, (Boolean) obj4, (Integer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmployeeJobInfo employeeJobInfo = (EmployeeJobInfo) obj;
        reverseProtoWriter.getClass();
        employeeJobInfo.getClass();
        reverseProtoWriter.writeBytes(employeeJobInfo.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 5, employeeJobInfo.hours_worked_per_week);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, employeeJobInfo.is_tip_eligible);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, employeeJobInfo.hourly_wage);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, employeeJobInfo.job_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, employeeJobInfo.job_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EmployeeJobInfo employeeJobInfo = (EmployeeJobInfo) obj;
        employeeJobInfo.getClass();
        int size$okio = employeeJobInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.UINT32.encodedSizeWithTag(5, employeeJobInfo.hours_worked_per_week) + ProtoAdapter.BOOL.encodedSizeWithTag(4, employeeJobInfo.is_tip_eligible) + Money.ADAPTER.encodedSizeWithTag(3, employeeJobInfo.hourly_wage) + protoAdapter.encodedSizeWithTag(2, employeeJobInfo.job_title) + protoAdapter.encodedSizeWithTag(1, employeeJobInfo.job_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EmployeeJobInfo employeeJobInfo = (EmployeeJobInfo) obj;
        employeeJobInfo.getClass();
        Money money = employeeJobInfo.hourly_wage;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = employeeJobInfo.job_token;
        Boolean bool = employeeJobInfo.is_tip_eligible;
        Integer num = employeeJobInfo.hours_worked_per_week;
        byteString.getClass();
        return new EmployeeJobInfo(str, null, money2, bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmployeeJobInfo employeeJobInfo = (EmployeeJobInfo) obj;
        employeeJobInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, employeeJobInfo.job_token);
        protoAdapter.encodeWithTag(protoWriter, 2, employeeJobInfo.job_title);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, employeeJobInfo.hourly_wage);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, employeeJobInfo.is_tip_eligible);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, employeeJobInfo.hours_worked_per_week);
        protoWriter.writeBytes(employeeJobInfo.unknownFields());
    }
}
