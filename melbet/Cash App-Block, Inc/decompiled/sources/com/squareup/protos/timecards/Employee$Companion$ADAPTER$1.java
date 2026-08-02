package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Employee$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Employee((String) obj, (String) obj2, (String) obj3, (EmployeeRole) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(EmployeeRole.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Employee employee = (Employee) obj;
        reverseProtoWriter.getClass();
        employee.getClass();
        reverseProtoWriter.writeBytes(employee.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, employee.employee_number);
        EmployeeRole.ADAPTER.encodeWithTag(reverseProtoWriter, 4, employee.employee_role);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, employee.last_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, employee.first_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, employee.employee_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Employee employee = (Employee) obj;
        employee.getClass();
        int size$okio = employee.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, employee.employee_number) + EmployeeRole.ADAPTER.encodedSizeWithTag(4, employee.employee_role) + protoAdapter.encodedSizeWithTag(3, employee.last_name) + protoAdapter.encodedSizeWithTag(2, employee.first_name) + protoAdapter.encodedSizeWithTag(1, employee.employee_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Employee employee = (Employee) obj;
        employee.getClass();
        EmployeeRole employeeRole = employee.employee_role;
        EmployeeRole employeeRole2 = employeeRole != null ? (EmployeeRole) EmployeeRole.ADAPTER.redact(employeeRole) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = employee.employee_token;
        String str2 = employee.employee_number;
        byteString.getClass();
        return new Employee(str, null, null, employeeRole2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Employee employee = (Employee) obj;
        employee.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, employee.employee_token);
        protoAdapter.encodeWithTag(protoWriter, 2, employee.first_name);
        protoAdapter.encodeWithTag(protoWriter, 3, employee.last_name);
        EmployeeRole.ADAPTER.encodeWithTag(protoWriter, 4, employee.employee_role);
        protoAdapter.encodeWithTag(protoWriter, 5, employee.employee_number);
        protoWriter.writeBytes(employee.unknownFields());
    }
}
