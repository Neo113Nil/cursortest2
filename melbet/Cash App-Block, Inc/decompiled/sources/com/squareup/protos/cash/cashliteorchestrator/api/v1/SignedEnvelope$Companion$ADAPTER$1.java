package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SignedEnvelope$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SignedEnvelope((ByteString) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
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
        SignedEnvelope signedEnvelope = (SignedEnvelope) obj;
        reverseProtoWriter.getClass();
        signedEnvelope.getClass();
        reverseProtoWriter.writeBytes(signedEnvelope.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, signedEnvelope.credential_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, signedEnvelope.signature);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, signedEnvelope.authenticator_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, signedEnvelope.client_data_json);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, signedEnvelope.signing_envelope);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SignedEnvelope signedEnvelope = (SignedEnvelope) obj;
        signedEnvelope.getClass();
        int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, signedEnvelope.signing_envelope) + signedEnvelope.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, signedEnvelope.credential_id) + protoAdapter.encodedSizeWithTag(4, signedEnvelope.signature) + protoAdapter.encodedSizeWithTag(3, signedEnvelope.authenticator_data) + protoAdapter.encodedSizeWithTag(2, signedEnvelope.client_data_json) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SignedEnvelope signedEnvelope = (SignedEnvelope) obj;
        signedEnvelope.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = signedEnvelope.signing_envelope;
        String str = signedEnvelope.client_data_json;
        String str2 = signedEnvelope.authenticator_data;
        String str3 = signedEnvelope.signature;
        String str4 = signedEnvelope.credential_id;
        byteString.getClass();
        return new SignedEnvelope(byteString2, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SignedEnvelope signedEnvelope = (SignedEnvelope) obj;
        signedEnvelope.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, signedEnvelope.signing_envelope);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, signedEnvelope.client_data_json);
        protoAdapter.encodeWithTag(protoWriter, 3, signedEnvelope.authenticator_data);
        protoAdapter.encodeWithTag(protoWriter, 4, signedEnvelope.signature);
        protoAdapter.encodeWithTag(protoWriter, 5, signedEnvelope.credential_id);
        protoWriter.writeBytes(signedEnvelope.unknownFields());
    }
}
