package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EmployeeRole$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EmployeeRole((String) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmployeeRole employeeRole = (EmployeeRole) obj;
        reverseProtoWriter.getClass();
        employeeRole.getClass();
        reverseProtoWriter.writeBytes(employeeRole.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, employeeRole.is_owner_role);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, employeeRole.is_account_owner_role);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, employeeRole.name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, employeeRole.employee_role_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EmployeeRole employeeRole = (EmployeeRole) obj;
        employeeRole.getClass();
        int size$okio = employeeRole.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, employeeRole.name) + protoAdapter.encodedSizeWithTag(1, employeeRole.employee_role_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(4, employeeRole.is_owner_role) + protoAdapter2.encodedSizeWithTag(3, employeeRole.is_account_owner_role) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EmployeeRole employeeRole = (EmployeeRole) obj;
        employeeRole.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = employeeRole.employee_role_token;
        String str2 = employeeRole.name;
        Boolean bool = employeeRole.is_account_owner_role;
        Boolean bool2 = employeeRole.is_owner_role;
        byteString.getClass();
        return new EmployeeRole(str, str2, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmployeeRole employeeRole = (EmployeeRole) obj;
        employeeRole.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, employeeRole.employee_role_token);
        protoAdapter.encodeWithTag(protoWriter, 2, employeeRole.name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, employeeRole.is_account_owner_role);
        protoAdapter2.encodeWithTag(protoWriter, 4, employeeRole.is_owner_role);
        protoWriter.writeBytes(employeeRole.unknownFields());
    }
}
