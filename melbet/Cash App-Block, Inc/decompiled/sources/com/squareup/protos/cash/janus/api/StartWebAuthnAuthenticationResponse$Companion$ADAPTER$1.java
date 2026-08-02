package com.squareup.protos.cash.janus.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StartWebAuthnAuthenticationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartWebAuthnAuthenticationResponse((String) obj, (String) obj2, (String) obj3, (ByteString) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse = (StartWebAuthnAuthenticationResponse) obj;
        reverseProtoWriter.getClass();
        startWebAuthnAuthenticationResponse.getClass();
        reverseProtoWriter.writeBytes(startWebAuthnAuthenticationResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, startWebAuthnAuthenticationResponse.allow_credential_ids);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, startWebAuthnAuthenticationResponse.challenge);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, startWebAuthnAuthenticationResponse.relying_party_identifier);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, startWebAuthnAuthenticationResponse.options);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, startWebAuthnAuthenticationResponse.request_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse = (StartWebAuthnAuthenticationResponse) obj;
        startWebAuthnAuthenticationResponse.getClass();
        int size$okio = startWebAuthnAuthenticationResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, startWebAuthnAuthenticationResponse.relying_party_identifier) + protoAdapter.encodedSizeWithTag(2, startWebAuthnAuthenticationResponse.options) + protoAdapter.encodedSizeWithTag(1, startWebAuthnAuthenticationResponse.request_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
        return protoAdapter2.asRepeated().encodedSizeWithTag(5, startWebAuthnAuthenticationResponse.allow_credential_ids) + protoAdapter2.encodedSizeWithTag(4, startWebAuthnAuthenticationResponse.challenge) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse = (StartWebAuthnAuthenticationResponse) obj;
        startWebAuthnAuthenticationResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = startWebAuthnAuthenticationResponse.request_id;
        String str2 = startWebAuthnAuthenticationResponse.options;
        String str3 = startWebAuthnAuthenticationResponse.relying_party_identifier;
        ByteString byteString2 = startWebAuthnAuthenticationResponse.challenge;
        List list = startWebAuthnAuthenticationResponse.allow_credential_ids;
        list.getClass();
        byteString.getClass();
        return new StartWebAuthnAuthenticationResponse(str, str2, str3, byteString2, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse = (StartWebAuthnAuthenticationResponse) obj;
        startWebAuthnAuthenticationResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, startWebAuthnAuthenticationResponse.request_id);
        protoAdapter.encodeWithTag(protoWriter, 2, startWebAuthnAuthenticationResponse.options);
        protoAdapter.encodeWithTag(protoWriter, 3, startWebAuthnAuthenticationResponse.relying_party_identifier);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
        protoAdapter2.encodeWithTag(protoWriter, 4, startWebAuthnAuthenticationResponse.challenge);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, startWebAuthnAuthenticationResponse.allow_credential_ids);
        protoWriter.writeBytes(startWebAuthnAuthenticationResponse.unknownFields());
    }
}
