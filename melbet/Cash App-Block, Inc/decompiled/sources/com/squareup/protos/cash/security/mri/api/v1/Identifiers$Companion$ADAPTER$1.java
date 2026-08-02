package com.squareup.protos.cash.security.mri.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Identifiers$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Identifiers((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
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
        Identifiers identifiers = (Identifiers) obj;
        reverseProtoWriter.getClass();
        identifiers.getClass();
        reverseProtoWriter.writeBytes(identifiers.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, identifiers.vendor_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, identifiers.device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, identifiers.app_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, identifiers.app_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, identifiers.operating_system_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, identifiers.operating_system);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Identifiers identifiers = (Identifiers) obj;
        identifiers.getClass();
        int size$okio = identifiers.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, identifiers.vendor_id) + protoAdapter.encodedSizeWithTag(5, identifiers.device_id) + protoAdapter.encodedSizeWithTag(4, identifiers.app_token) + protoAdapter.encodedSizeWithTag(3, identifiers.app_version) + protoAdapter.encodedSizeWithTag(2, identifiers.operating_system_version) + protoAdapter.encodedSizeWithTag(1, identifiers.operating_system) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Identifiers identifiers = (Identifiers) obj;
        identifiers.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = identifiers.operating_system;
        String str2 = identifiers.operating_system_version;
        String str3 = identifiers.app_version;
        String str4 = identifiers.app_token;
        String str5 = identifiers.device_id;
        String str6 = identifiers.vendor_id;
        byteString.getClass();
        return new Identifiers(str, str2, str3, str4, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Identifiers identifiers = (Identifiers) obj;
        identifiers.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, identifiers.operating_system);
        protoAdapter.encodeWithTag(protoWriter, 2, identifiers.operating_system_version);
        protoAdapter.encodeWithTag(protoWriter, 3, identifiers.app_version);
        protoAdapter.encodeWithTag(protoWriter, 4, identifiers.app_token);
        protoAdapter.encodeWithTag(protoWriter, 5, identifiers.device_id);
        protoAdapter.encodeWithTag(protoWriter, 6, identifiers.vendor_id);
        protoWriter.writeBytes(identifiers.unknownFields());
    }
}
