package com.squareup.protos.payroll.service;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEmployeeAccessDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
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
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new GetEmployeeAccessDetailsResponse(str, (String) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "team_member_id");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse = (GetEmployeeAccessDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getEmployeeAccessDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getEmployeeAccessDetailsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, getEmployeeAccessDetailsResponse.requires_onboarding);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, getEmployeeAccessDetailsResponse.can_use_on_demand_pay);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getEmployeeAccessDetailsResponse.can_use_direct_deposit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getEmployeeAccessDetailsResponse.can_access_benefits);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getEmployeeAccessDetailsResponse.merchant_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getEmployeeAccessDetailsResponse.team_member_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse = (GetEmployeeAccessDetailsResponse) obj;
        getEmployeeAccessDetailsResponse.getClass();
        int size$okio = getEmployeeAccessDetailsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, getEmployeeAccessDetailsResponse.merchant_token) + protoAdapter.encodedSizeWithTag(1, getEmployeeAccessDetailsResponse.team_member_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(6, getEmployeeAccessDetailsResponse.requires_onboarding) + protoAdapter2.encodedSizeWithTag(5, getEmployeeAccessDetailsResponse.can_use_on_demand_pay) + protoAdapter2.encodedSizeWithTag(4, getEmployeeAccessDetailsResponse.can_use_direct_deposit) + protoAdapter2.encodedSizeWithTag(3, getEmployeeAccessDetailsResponse.can_access_benefits) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse = (GetEmployeeAccessDetailsResponse) obj;
        getEmployeeAccessDetailsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getEmployeeAccessDetailsResponse.team_member_id;
        String str2 = getEmployeeAccessDetailsResponse.merchant_token;
        Boolean bool = getEmployeeAccessDetailsResponse.can_access_benefits;
        Boolean bool2 = getEmployeeAccessDetailsResponse.can_use_direct_deposit;
        Boolean bool3 = getEmployeeAccessDetailsResponse.can_use_on_demand_pay;
        Boolean bool4 = getEmployeeAccessDetailsResponse.requires_onboarding;
        str.getClass();
        byteString.getClass();
        return new GetEmployeeAccessDetailsResponse(str, str2, bool, bool2, bool3, bool4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse = (GetEmployeeAccessDetailsResponse) obj;
        getEmployeeAccessDetailsResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getEmployeeAccessDetailsResponse.team_member_id);
        protoAdapter.encodeWithTag(protoWriter, 2, getEmployeeAccessDetailsResponse.merchant_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, getEmployeeAccessDetailsResponse.can_access_benefits);
        protoAdapter2.encodeWithTag(protoWriter, 4, getEmployeeAccessDetailsResponse.can_use_direct_deposit);
        protoAdapter2.encodeWithTag(protoWriter, 5, getEmployeeAccessDetailsResponse.can_use_on_demand_pay);
        protoAdapter2.encodeWithTag(protoWriter, 6, getEmployeeAccessDetailsResponse.requires_onboarding);
        protoWriter.writeBytes(getEmployeeAccessDetailsResponse.unknownFields());
    }
}
