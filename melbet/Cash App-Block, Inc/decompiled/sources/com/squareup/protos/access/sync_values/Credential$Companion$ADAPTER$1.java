package com.squareup.protos.access.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Credential$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Credential((String) obj, (String) obj2, (Long) obj3, (Long) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Credential credential = (Credential) obj;
        reverseProtoWriter.getClass();
        credential.getClass();
        reverseProtoWriter.writeBytes(credential.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, credential.localized_creation_device_string);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, credential.localized_creation_string);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, credential.last_used_at_millis);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, credential.registered_at_millis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, credential.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, credential.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Credential credential = (Credential) obj;
        credential.getClass();
        int size$okio = credential.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, credential.description) + protoAdapter.encodedSizeWithTag(1, credential.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(6, credential.localized_creation_device_string) + protoAdapter.encodedSizeWithTag(5, credential.localized_creation_string) + protoAdapter2.encodedSizeWithTag(4, credential.last_used_at_millis) + protoAdapter2.encodedSizeWithTag(3, credential.registered_at_millis) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Credential credential = (Credential) obj;
        credential.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = credential.id;
        String str2 = credential.description;
        Long l = credential.registered_at_millis;
        Long l2 = credential.last_used_at_millis;
        String str3 = credential.localized_creation_string;
        String str4 = credential.localized_creation_device_string;
        byteString.getClass();
        return new Credential(str, str2, l, l2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Credential credential = (Credential) obj;
        credential.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, credential.id);
        protoAdapter.encodeWithTag(protoWriter, 2, credential.description);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, credential.registered_at_millis);
        protoAdapter2.encodeWithTag(protoWriter, 4, credential.last_used_at_millis);
        protoAdapter.encodeWithTag(protoWriter, 5, credential.localized_creation_string);
        protoAdapter.encodeWithTag(protoWriter, 6, credential.localized_creation_device_string);
        protoWriter.writeBytes(credential.unknownFields());
    }
}
