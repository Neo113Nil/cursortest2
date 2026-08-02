package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$EntityInformation$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InAppBrowserMetadata.EntityInformation((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserMetadata.EntityInformation entityInformation = (InAppBrowserMetadata.EntityInformation) obj;
        reverseProtoWriter.getClass();
        entityInformation.getClass();
        reverseProtoWriter.writeBytes(entityInformation.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, entityInformation.business_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, entityInformation.business_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, entityInformation.entity_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, entityInformation.entity_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, entityInformation.entity_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserMetadata.EntityInformation entityInformation = (InAppBrowserMetadata.EntityInformation) obj;
        entityInformation.getClass();
        int size$okio = entityInformation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, entityInformation.business_token) + protoAdapter.encodedSizeWithTag(4, entityInformation.business_name) + protoAdapter.encodedSizeWithTag(3, entityInformation.entity_type) + protoAdapter.encodedSizeWithTag(2, entityInformation.entity_token) + protoAdapter.encodedSizeWithTag(1, entityInformation.entity_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserMetadata.EntityInformation entityInformation = (InAppBrowserMetadata.EntityInformation) obj;
        entityInformation.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = entityInformation.entity_name;
        String str2 = entityInformation.entity_token;
        String str3 = entityInformation.entity_type;
        String str4 = entityInformation.business_name;
        String str5 = entityInformation.business_token;
        byteString.getClass();
        return new InAppBrowserMetadata.EntityInformation(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserMetadata.EntityInformation entityInformation = (InAppBrowserMetadata.EntityInformation) obj;
        entityInformation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, entityInformation.entity_name);
        protoAdapter.encodeWithTag(protoWriter, 2, entityInformation.entity_token);
        protoAdapter.encodeWithTag(protoWriter, 3, entityInformation.entity_type);
        protoAdapter.encodeWithTag(protoWriter, 4, entityInformation.business_name);
        protoAdapter.encodeWithTag(protoWriter, 5, entityInformation.business_token);
        protoWriter.writeBytes(entityInformation.unknownFields());
    }
}
