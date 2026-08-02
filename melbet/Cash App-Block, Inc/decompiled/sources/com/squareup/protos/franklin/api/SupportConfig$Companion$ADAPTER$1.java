package com.squareup.protos.franklin.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SupportConfig((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 11) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportConfig supportConfig = (SupportConfig) obj;
        reverseProtoWriter.getClass();
        supportConfig.getClass();
        reverseProtoWriter.writeBytes(supportConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, supportConfig.terms_of_service_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, supportConfig.privacy_policy_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, supportConfig.contact_support_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportConfig supportConfig = (SupportConfig) obj;
        supportConfig.getClass();
        int size$okio = supportConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(11, supportConfig.terms_of_service_url) + protoAdapter.encodedSizeWithTag(4, supportConfig.privacy_policy_url) + protoAdapter.encodedSizeWithTag(2, supportConfig.contact_support_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportConfig supportConfig = (SupportConfig) obj;
        supportConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = supportConfig.contact_support_url;
        String str2 = supportConfig.privacy_policy_url;
        String str3 = supportConfig.terms_of_service_url;
        byteString.getClass();
        return new SupportConfig(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportConfig supportConfig = (SupportConfig) obj;
        supportConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, supportConfig.contact_support_url);
        protoAdapter.encodeWithTag(protoWriter, 4, supportConfig.privacy_policy_url);
        protoAdapter.encodeWithTag(protoWriter, 11, supportConfig.terms_of_service_url);
        protoWriter.writeBytes(supportConfig.unknownFields());
    }
}
