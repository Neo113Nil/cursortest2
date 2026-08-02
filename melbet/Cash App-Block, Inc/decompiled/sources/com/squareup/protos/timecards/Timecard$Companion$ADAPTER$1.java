package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Timecard$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj19 = obj4;
            if (nextTag == -1) {
                return new Timecard((String) obj3, (String) obj18, (String) obj19, (String) obj5, (Employee) obj6, (String) obj7, (String) obj8, (Boolean) obj9, (Long) obj10, (Long) obj11, (Money) obj12, (EmployeeJobInfo) obj13, (Long) obj14, (Long) obj15, (String) obj16, (Money) obj2, (Boolean) obj17, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                if (nextTag != 2) {
                    switch (nextTag) {
                        case 5:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj9 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            obj10 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            obj11 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            obj12 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj12);
                            break;
                        case 11:
                            obj6 = TransactorKt.decodeMessageOrMerge(Employee.ADAPTER, protoReader, obj6);
                            break;
                        case 12:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            obj = obj3;
                            break;
                        case 13:
                            obj14 = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 14:
                            obj15 = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 15:
                            obj13 = TransactorKt.decodeMessageOrMerge(EmployeeJobInfo.ADAPTER, protoReader, obj13);
                            break;
                        case 16:
                            obj16 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            obj18 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                            obj = obj3;
                            break;
                        case 19:
                            obj17 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj3;
                            break;
                    }
                    obj3 = obj;
                } else {
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                }
                obj4 = obj19;
                obj = obj3;
                obj3 = obj;
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
            obj4 = obj19;
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Timecard timecard = (Timecard) obj;
        reverseProtoWriter.getClass();
        timecard.getClass();
        reverseProtoWriter.writeBytes(timecard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, timecard.was_automatically_clocked_out);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, timecard.declared_tip);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, timecard.note);
        ProtoAdapter protoAdapter4 = ProtoAdapter.UINT64;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 14, timecard.updated_at_timestamp_ms);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 13, timecard.created_at_timestamp_ms);
        EmployeeJobInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 15, timecard.employee_job_info);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, timecard.hourly_wage);
        ProtoAdapter protoAdapter5 = ProtoAdapter.INT64;
        protoAdapter5.encodeWithTag(reverseProtoWriter, 9, timecard.clockout_timestamp_ms);
        protoAdapter5.encodeWithTag(reverseProtoWriter, 8, timecard.clockin_timestamp_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, timecard.deleted);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, timecard.clockout_unit_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, timecard.clockin_unit_token);
        Employee.ADAPTER.encodeWithTag(reverseProtoWriter, 11, timecard.employee);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, timecard.employee_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 12, timecard.merchant_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 17, timecard.shift_id);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, timecard.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Timecard timecard = (Timecard) obj;
        timecard.getClass();
        int size$okio = timecard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(6, timecard.clockout_unit_token) + protoAdapter.encodedSizeWithTag(5, timecard.clockin_unit_token) + Employee.ADAPTER.encodedSizeWithTag(11, timecard.employee) + protoAdapter.encodedSizeWithTag(2, timecard.employee_token) + protoAdapter.encodedSizeWithTag(12, timecard.merchant_token) + protoAdapter.encodedSizeWithTag(17, timecard.shift_id) + protoAdapter.encodedSizeWithTag(1, timecard.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, timecard.deleted) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(9, timecard.clockout_timestamp_ms) + protoAdapter3.encodedSizeWithTag(8, timecard.clockin_timestamp_ms) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = Money.ADAPTER;
        int encodedSizeWithTag4 = EmployeeJobInfo.ADAPTER.encodedSizeWithTag(15, timecard.employee_job_info) + protoAdapter4.encodedSizeWithTag(10, timecard.hourly_wage) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter5 = ProtoAdapter.UINT64;
        return protoAdapter2.encodedSizeWithTag(19, timecard.was_automatically_clocked_out) + protoAdapter4.encodedSizeWithTag(18, timecard.declared_tip) + protoAdapter.encodedSizeWithTag(16, timecard.note) + protoAdapter5.encodedSizeWithTag(14, timecard.updated_at_timestamp_ms) + protoAdapter5.encodedSizeWithTag(13, timecard.created_at_timestamp_ms) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Timecard timecard = (Timecard) obj;
        timecard.getClass();
        Employee employee = timecard.employee;
        Employee employee2 = employee != null ? (Employee) Employee.ADAPTER.redact(employee) : null;
        Money money = timecard.hourly_wage;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        EmployeeJobInfo employeeJobInfo = timecard.employee_job_info;
        EmployeeJobInfo employeeJobInfo2 = employeeJobInfo != null ? (EmployeeJobInfo) EmployeeJobInfo.ADAPTER.redact(employeeJobInfo) : null;
        Money money3 = timecard.declared_tip;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = timecard.token;
        String str2 = timecard.shift_id;
        String str3 = timecard.merchant_token;
        String str4 = timecard.employee_token;
        String str5 = timecard.clockin_unit_token;
        String str6 = timecard.clockout_unit_token;
        Boolean bool = timecard.deleted;
        Long l = timecard.clockin_timestamp_ms;
        Long l2 = timecard.clockout_timestamp_ms;
        Long l3 = timecard.created_at_timestamp_ms;
        Long l4 = timecard.updated_at_timestamp_ms;
        Boolean bool2 = timecard.was_automatically_clocked_out;
        byteString.getClass();
        return new Timecard(str, str2, str3, str4, employee2, str5, str6, bool, l, l2, money2, employeeJobInfo2, l3, l4, null, money4, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Timecard timecard = (Timecard) obj;
        timecard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timecard.token);
        protoAdapter.encodeWithTag(protoWriter, 17, timecard.shift_id);
        protoAdapter.encodeWithTag(protoWriter, 12, timecard.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, timecard.employee_token);
        Employee.ADAPTER.encodeWithTag(protoWriter, 11, timecard.employee);
        protoAdapter.encodeWithTag(protoWriter, 5, timecard.clockin_unit_token);
        protoAdapter.encodeWithTag(protoWriter, 6, timecard.clockout_unit_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 7, timecard.deleted);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 8, timecard.clockin_timestamp_ms);
        protoAdapter3.encodeWithTag(protoWriter, 9, timecard.clockout_timestamp_ms);
        ProtoAdapter protoAdapter4 = Money.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 10, timecard.hourly_wage);
        EmployeeJobInfo.ADAPTER.encodeWithTag(protoWriter, 15, timecard.employee_job_info);
        ProtoAdapter protoAdapter5 = ProtoAdapter.UINT64;
        protoAdapter5.encodeWithTag(protoWriter, 13, timecard.created_at_timestamp_ms);
        protoAdapter5.encodeWithTag(protoWriter, 14, timecard.updated_at_timestamp_ms);
        protoAdapter.encodeWithTag(protoWriter, 16, timecard.note);
        protoAdapter4.encodeWithTag(protoWriter, 18, timecard.declared_tip);
        protoAdapter2.encodeWithTag(protoWriter, 19, timecard.was_automatically_clocked_out);
        protoWriter.writeBytes(timecard.unknownFields());
    }
}
