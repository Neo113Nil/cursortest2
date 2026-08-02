package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.AdminSyncAuthzRelationshipPoliciesResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AdminSyncAuthzRelationshipPoliciesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AdminSyncAuthzRelationshipPoliciesResponse((AdminSyncAuthzRelationshipPoliciesResponse.Status) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AdminSyncAuthzRelationshipPoliciesResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdminSyncAuthzRelationshipPoliciesResponse adminSyncAuthzRelationshipPoliciesResponse = (AdminSyncAuthzRelationshipPoliciesResponse) obj;
        reverseProtoWriter.getClass();
        adminSyncAuthzRelationshipPoliciesResponse.getClass();
        reverseProtoWriter.writeBytes(adminSyncAuthzRelationshipPoliciesResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, adminSyncAuthzRelationshipPoliciesResponse.error_message);
        AdminSyncAuthzRelationshipPoliciesResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, adminSyncAuthzRelationshipPoliciesResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdminSyncAuthzRelationshipPoliciesResponse adminSyncAuthzRelationshipPoliciesResponse = (AdminSyncAuthzRelationshipPoliciesResponse) obj;
        adminSyncAuthzRelationshipPoliciesResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, adminSyncAuthzRelationshipPoliciesResponse.error_message) + AdminSyncAuthzRelationshipPoliciesResponse.Status.ADAPTER.encodedSizeWithTag(1, adminSyncAuthzRelationshipPoliciesResponse.status) + adminSyncAuthzRelationshipPoliciesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdminSyncAuthzRelationshipPoliciesResponse adminSyncAuthzRelationshipPoliciesResponse = (AdminSyncAuthzRelationshipPoliciesResponse) obj;
        adminSyncAuthzRelationshipPoliciesResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        AdminSyncAuthzRelationshipPoliciesResponse.Status status = adminSyncAuthzRelationshipPoliciesResponse.status;
        String str = adminSyncAuthzRelationshipPoliciesResponse.error_message;
        byteString.getClass();
        return new AdminSyncAuthzRelationshipPoliciesResponse(status, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdminSyncAuthzRelationshipPoliciesResponse adminSyncAuthzRelationshipPoliciesResponse = (AdminSyncAuthzRelationshipPoliciesResponse) obj;
        adminSyncAuthzRelationshipPoliciesResponse.getClass();
        AdminSyncAuthzRelationshipPoliciesResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, adminSyncAuthzRelationshipPoliciesResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adminSyncAuthzRelationshipPoliciesResponse.error_message);
        protoWriter.writeBytes(adminSyncAuthzRelationshipPoliciesResponse.unknownFields());
    }
}
