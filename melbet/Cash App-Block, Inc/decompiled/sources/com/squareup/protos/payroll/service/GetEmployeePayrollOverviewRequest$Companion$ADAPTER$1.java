package com.squareup.protos.payroll.service;

import androidx.room.TransactorKt;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEmployeePayrollOverviewRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = GetEmployeePayrollOverviewRequest.APIVersion.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new GetEmployeePayrollOverviewRequest(str, (GetEmployeePayrollOverviewRequest.APIVersion) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "team_member_id");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest = (GetEmployeePayrollOverviewRequest) obj;
        reverseProtoWriter.getClass();
        getEmployeePayrollOverviewRequest.getClass();
        reverseProtoWriter.writeBytes(getEmployeePayrollOverviewRequest.unknownFields());
        GetEmployeePayrollOverviewRequest.APIVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getEmployeePayrollOverviewRequest.api_version);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getEmployeePayrollOverviewRequest.team_member_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest = (GetEmployeePayrollOverviewRequest) obj;
        getEmployeePayrollOverviewRequest.getClass();
        return GetEmployeePayrollOverviewRequest.APIVersion.ADAPTER.encodedSizeWithTag(2, getEmployeePayrollOverviewRequest.api_version) + ProtoAdapter.STRING.encodedSizeWithTag(1, getEmployeePayrollOverviewRequest.team_member_id) + getEmployeePayrollOverviewRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest = (GetEmployeePayrollOverviewRequest) obj;
        getEmployeePayrollOverviewRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getEmployeePayrollOverviewRequest.team_member_id;
        GetEmployeePayrollOverviewRequest.APIVersion aPIVersion = getEmployeePayrollOverviewRequest.api_version;
        str.getClass();
        byteString.getClass();
        return new GetEmployeePayrollOverviewRequest(str, aPIVersion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest = (GetEmployeePayrollOverviewRequest) obj;
        getEmployeePayrollOverviewRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEmployeePayrollOverviewRequest.team_member_id);
        GetEmployeePayrollOverviewRequest.APIVersion.ADAPTER.encodeWithTag(protoWriter, 2, getEmployeePayrollOverviewRequest.api_version);
        protoWriter.writeBytes(getEmployeePayrollOverviewRequest.unknownFields());
    }
}
