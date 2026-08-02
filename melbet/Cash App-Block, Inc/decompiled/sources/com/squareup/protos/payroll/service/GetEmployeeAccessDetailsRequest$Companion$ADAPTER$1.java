package com.squareup.protos.payroll.service;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEmployeeAccessDetailsRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new GetEmployeeAccessDetailsRequest(str, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "team_member_id");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest = (GetEmployeeAccessDetailsRequest) obj;
        reverseProtoWriter.getClass();
        getEmployeeAccessDetailsRequest.getClass();
        reverseProtoWriter.writeBytes(getEmployeeAccessDetailsRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getEmployeeAccessDetailsRequest.team_member_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest = (GetEmployeeAccessDetailsRequest) obj;
        getEmployeeAccessDetailsRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, getEmployeeAccessDetailsRequest.team_member_id) + getEmployeeAccessDetailsRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest = (GetEmployeeAccessDetailsRequest) obj;
        getEmployeeAccessDetailsRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getEmployeeAccessDetailsRequest.team_member_id;
        str.getClass();
        byteString.getClass();
        return new GetEmployeeAccessDetailsRequest(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest = (GetEmployeeAccessDetailsRequest) obj;
        getEmployeeAccessDetailsRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEmployeeAccessDetailsRequest.team_member_id);
        protoWriter.writeBytes(getEmployeeAccessDetailsRequest.unknownFields());
    }
}
