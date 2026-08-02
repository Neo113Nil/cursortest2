package com.squareup.protos.cash.janus.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StartWebAuthnRegistrationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new StartWebAuthnRegistrationResponse((String) obj, (String) obj2, (String) obj3, (ByteString) obj4, (String) obj5, (ByteString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse = (StartWebAuthnRegistrationResponse) obj;
        reverseProtoWriter.getClass();
        startWebAuthnRegistrationResponse.getClass();
        reverseProtoWriter.writeBytes(startWebAuthnRegistrationResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, startWebAuthnRegistrationResponse.challenge);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, startWebAuthnRegistrationResponse.user_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, startWebAuthnRegistrationResponse.user_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, startWebAuthnRegistrationResponse.relying_party_identifier);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, startWebAuthnRegistrationResponse.options);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, startWebAuthnRegistrationResponse.request_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse = (StartWebAuthnRegistrationResponse) obj;
        startWebAuthnRegistrationResponse.getClass();
        int size$okio = startWebAuthnRegistrationResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, startWebAuthnRegistrationResponse.relying_party_identifier) + protoAdapter.encodedSizeWithTag(2, startWebAuthnRegistrationResponse.options) + protoAdapter.encodedSizeWithTag(1, startWebAuthnRegistrationResponse.request_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
        return protoAdapter2.encodedSizeWithTag(6, startWebAuthnRegistrationResponse.challenge) + protoAdapter.encodedSizeWithTag(5, startWebAuthnRegistrationResponse.user_name) + protoAdapter2.encodedSizeWithTag(4, startWebAuthnRegistrationResponse.user_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse = (StartWebAuthnRegistrationResponse) obj;
        startWebAuthnRegistrationResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = startWebAuthnRegistrationResponse.request_id;
        String str2 = startWebAuthnRegistrationResponse.relying_party_identifier;
        ByteString byteString2 = startWebAuthnRegistrationResponse.user_id;
        ByteString byteString3 = startWebAuthnRegistrationResponse.challenge;
        byteString.getClass();
        return new StartWebAuthnRegistrationResponse(str, null, str2, byteString2, null, byteString3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse = (StartWebAuthnRegistrationResponse) obj;
        startWebAuthnRegistrationResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, startWebAuthnRegistrationResponse.request_id);
        protoAdapter.encodeWithTag(protoWriter, 2, startWebAuthnRegistrationResponse.options);
        protoAdapter.encodeWithTag(protoWriter, 3, startWebAuthnRegistrationResponse.relying_party_identifier);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
        protoAdapter2.encodeWithTag(protoWriter, 4, startWebAuthnRegistrationResponse.user_id);
        protoAdapter.encodeWithTag(protoWriter, 5, startWebAuthnRegistrationResponse.user_name);
        protoAdapter2.encodeWithTag(protoWriter, 6, startWebAuthnRegistrationResponse.challenge);
        protoWriter.writeBytes(startWebAuthnRegistrationResponse.unknownFields());
    }
}
