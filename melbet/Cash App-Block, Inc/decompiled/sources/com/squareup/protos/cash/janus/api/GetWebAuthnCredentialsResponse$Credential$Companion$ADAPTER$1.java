package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetWebAuthnCredentialsResponse$Credential$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetWebAuthnCredentialsResponse.Credential((String) obj, (String) obj2, (Long) obj3, (Long) obj4, (String) obj5, (String) obj6, (GetWebAuthnCredentialsResponse.Credential.DeviceType) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj7 = GetWebAuthnCredentialsResponse.Credential.DeviceType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetWebAuthnCredentialsResponse.Credential credential = (GetWebAuthnCredentialsResponse.Credential) obj;
        reverseProtoWriter.getClass();
        credential.getClass();
        reverseProtoWriter.writeBytes(credential.unknownFields());
        GetWebAuthnCredentialsResponse.Credential.DeviceType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, credential.device_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, credential.localized_creation_device_string);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, credential.localized_creation_string);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, credential.last_used_at_millis);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, credential.registered_at_millis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, credential.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, credential.credential_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetWebAuthnCredentialsResponse.Credential credential = (GetWebAuthnCredentialsResponse.Credential) obj;
        credential.getClass();
        int size$okio = credential.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, credential.description) + protoAdapter.encodedSizeWithTag(1, credential.credential_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return GetWebAuthnCredentialsResponse.Credential.DeviceType.ADAPTER.encodedSizeWithTag(7, credential.device_type) + protoAdapter.encodedSizeWithTag(6, credential.localized_creation_device_string) + protoAdapter.encodedSizeWithTag(5, credential.localized_creation_string) + protoAdapter2.encodedSizeWithTag(4, credential.last_used_at_millis) + protoAdapter2.encodedSizeWithTag(3, credential.registered_at_millis) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetWebAuthnCredentialsResponse.Credential credential = (GetWebAuthnCredentialsResponse.Credential) obj;
        credential.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = credential.credential_id;
        String str2 = credential.description;
        Long l = credential.registered_at_millis;
        Long l2 = credential.last_used_at_millis;
        String str3 = credential.localized_creation_string;
        String str4 = credential.localized_creation_device_string;
        GetWebAuthnCredentialsResponse.Credential.DeviceType deviceType = credential.device_type;
        byteString.getClass();
        return new GetWebAuthnCredentialsResponse.Credential(str, str2, l, l2, str3, str4, deviceType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetWebAuthnCredentialsResponse.Credential credential = (GetWebAuthnCredentialsResponse.Credential) obj;
        credential.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, credential.credential_id);
        protoAdapter.encodeWithTag(protoWriter, 2, credential.description);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, credential.registered_at_millis);
        protoAdapter2.encodeWithTag(protoWriter, 4, credential.last_used_at_millis);
        protoAdapter.encodeWithTag(protoWriter, 5, credential.localized_creation_string);
        protoAdapter.encodeWithTag(protoWriter, 6, credential.localized_creation_device_string);
        GetWebAuthnCredentialsResponse.Credential.DeviceType.ADAPTER.encodeWithTag(protoWriter, 7, credential.device_type);
        protoWriter.writeBytes(credential.unknownFields());
    }
}
