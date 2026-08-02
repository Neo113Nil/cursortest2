package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitLiteRecoveryEmailOtpBlockerRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitLiteRecoveryEmailOtpBlockerRequest$ClientSignature$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature clientSignature = (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) obj;
        reverseProtoWriter.getClass();
        clientSignature.getClass();
        reverseProtoWriter.writeBytes(clientSignature.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, clientSignature.scheme);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, clientSignature.signature);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientSignature.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientSignature.public_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature clientSignature = (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) obj;
        clientSignature.getClass();
        int size$okio = clientSignature.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, clientSignature.scheme) + protoAdapter.encodedSizeWithTag(3, clientSignature.signature) + protoAdapter.encodedSizeWithTag(2, clientSignature.message) + protoAdapter.encodedSizeWithTag(1, clientSignature.public_key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature clientSignature = (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) obj;
        clientSignature.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientSignature.public_key;
        String str2 = clientSignature.message;
        String str3 = clientSignature.scheme;
        byteString.getClass();
        return new SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature(str, str2, null, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature clientSignature = (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) obj;
        clientSignature.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientSignature.public_key);
        protoAdapter.encodeWithTag(protoWriter, 2, clientSignature.message);
        protoAdapter.encodeWithTag(protoWriter, 3, clientSignature.signature);
        protoAdapter.encodeWithTag(protoWriter, 4, clientSignature.scheme);
        protoWriter.writeBytes(clientSignature.unknownFields());
    }
}
