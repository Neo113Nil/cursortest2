package com.squareup.protos.cash.janus.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAuthorizedAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAuthorizedAccountResponse((GetAuthorizedAccountAuthorizedRelationship) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetAuthorizedAccountAuthorizedRelationship.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAuthorizedAccountResponse getAuthorizedAccountResponse = (GetAuthorizedAccountResponse) obj;
        reverseProtoWriter.getClass();
        getAuthorizedAccountResponse.getClass();
        reverseProtoWriter.writeBytes(getAuthorizedAccountResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getAuthorizedAccountResponse.principal_switching_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getAuthorizedAccountResponse.principal_token);
        GetAuthorizedAccountAuthorizedRelationship.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAuthorizedAccountResponse.authorized_relationship);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAuthorizedAccountResponse getAuthorizedAccountResponse = (GetAuthorizedAccountResponse) obj;
        getAuthorizedAccountResponse.getClass();
        int encodedSizeWithTag = GetAuthorizedAccountAuthorizedRelationship.ADAPTER.encodedSizeWithTag(1, getAuthorizedAccountResponse.authorized_relationship) + getAuthorizedAccountResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, getAuthorizedAccountResponse.principal_switching_identifier) + protoAdapter.encodedSizeWithTag(2, getAuthorizedAccountResponse.principal_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAuthorizedAccountResponse getAuthorizedAccountResponse = (GetAuthorizedAccountResponse) obj;
        getAuthorizedAccountResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        GetAuthorizedAccountAuthorizedRelationship getAuthorizedAccountAuthorizedRelationship = getAuthorizedAccountResponse.authorized_relationship;
        String str = getAuthorizedAccountResponse.principal_token;
        String str2 = getAuthorizedAccountResponse.principal_switching_identifier;
        byteString.getClass();
        return new GetAuthorizedAccountResponse(getAuthorizedAccountAuthorizedRelationship, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAuthorizedAccountResponse getAuthorizedAccountResponse = (GetAuthorizedAccountResponse) obj;
        getAuthorizedAccountResponse.getClass();
        GetAuthorizedAccountAuthorizedRelationship.ADAPTER.encodeWithTag(protoWriter, 1, getAuthorizedAccountResponse.authorized_relationship);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getAuthorizedAccountResponse.principal_token);
        protoAdapter.encodeWithTag(protoWriter, 3, getAuthorizedAccountResponse.principal_switching_identifier);
        protoWriter.writeBytes(getAuthorizedAccountResponse.unknownFields());
    }
}
