package com.squareup.protos.common.signing;

import com.squareup.protos.common.signing.SigningData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SigningData$AssertionSigningData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SigningData.AssertionSigningData((String) obj, (ByteString) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SigningData.AssertionSigningData assertionSigningData = (SigningData.AssertionSigningData) obj;
        reverseProtoWriter.getClass();
        assertionSigningData.getClass();
        reverseProtoWriter.writeBytes(assertionSigningData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, assertionSigningData.attestation_payload);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, assertionSigningData.assertion_payload);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, assertionSigningData.key_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SigningData.AssertionSigningData assertionSigningData = (SigningData.AssertionSigningData) obj;
        assertionSigningData.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, assertionSigningData.key_identifier) + assertionSigningData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(3, assertionSigningData.attestation_payload) + protoAdapter.encodedSizeWithTag(2, assertionSigningData.assertion_payload) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SigningData.AssertionSigningData assertionSigningData = (SigningData.AssertionSigningData) obj;
        assertionSigningData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = assertionSigningData.key_identifier;
        ByteString byteString2 = assertionSigningData.assertion_payload;
        ByteString byteString3 = assertionSigningData.attestation_payload;
        byteString.getClass();
        return new SigningData.AssertionSigningData(str, byteString2, byteString3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SigningData.AssertionSigningData assertionSigningData = (SigningData.AssertionSigningData) obj;
        assertionSigningData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, assertionSigningData.key_identifier);
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 2, assertionSigningData.assertion_payload);
        protoAdapter.encodeWithTag(protoWriter, 3, assertionSigningData.attestation_payload);
        protoWriter.writeBytes(assertionSigningData.unknownFields());
    }
}
