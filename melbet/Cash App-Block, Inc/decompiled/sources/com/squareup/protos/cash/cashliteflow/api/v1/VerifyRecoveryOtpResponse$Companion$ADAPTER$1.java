package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VerifyRecoveryOtpResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyRecoveryOtpResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyRecoveryOtpResponse verifyRecoveryOtpResponse = (VerifyRecoveryOtpResponse) obj;
        reverseProtoWriter.getClass();
        verifyRecoveryOtpResponse.getClass();
        reverseProtoWriter.writeBytes(verifyRecoveryOtpResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, verifyRecoveryOtpResponse.verification_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyRecoveryOtpResponse verifyRecoveryOtpResponse = (VerifyRecoveryOtpResponse) obj;
        verifyRecoveryOtpResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, verifyRecoveryOtpResponse.verification_token) + verifyRecoveryOtpResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((VerifyRecoveryOtpResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VerifyRecoveryOtpResponse(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyRecoveryOtpResponse verifyRecoveryOtpResponse = (VerifyRecoveryOtpResponse) obj;
        verifyRecoveryOtpResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, verifyRecoveryOtpResponse.verification_token);
        protoWriter.writeBytes(verifyRecoveryOtpResponse.unknownFields());
    }
}
