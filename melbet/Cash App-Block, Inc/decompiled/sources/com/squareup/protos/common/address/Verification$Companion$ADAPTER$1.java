package com.squareup.protos.common.address;

import com.squareup.protos.common.address.Verification;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Verification$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Verification((Verification.VerificationStatus) obj, (Verification.VerificationLevel) obj2, (Long) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Verification.VerificationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = Verification.VerificationLevel.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Verification verification = (Verification) obj;
        reverseProtoWriter.getClass();
        verification.getClass();
        reverseProtoWriter.writeBytes(verification.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, verification.debug_info);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, verification.verified_at);
        Verification.VerificationLevel.ADAPTER.encodeWithTag(reverseProtoWriter, 2, verification.verification_level);
        Verification.VerificationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verification.verification_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Verification verification = (Verification) obj;
        verification.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, verification.debug_info) + ProtoAdapter.INT64.encodedSizeWithTag(3, verification.verified_at) + Verification.VerificationLevel.ADAPTER.encodedSizeWithTag(2, verification.verification_level) + Verification.VerificationStatus.ADAPTER.encodedSizeWithTag(1, verification.verification_status) + verification.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Verification verification = (Verification) obj;
        verification.getClass();
        ByteString byteString = ByteString.EMPTY;
        Verification.VerificationStatus verificationStatus = verification.verification_status;
        Verification.VerificationLevel verificationLevel = verification.verification_level;
        Long l = verification.verified_at;
        String str = verification.debug_info;
        byteString.getClass();
        return new Verification(verificationStatus, verificationLevel, l, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Verification verification = (Verification) obj;
        verification.getClass();
        Verification.VerificationStatus.ADAPTER.encodeWithTag(protoWriter, 1, verification.verification_status);
        Verification.VerificationLevel.ADAPTER.encodeWithTag(protoWriter, 2, verification.verification_level);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, verification.verified_at);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, verification.debug_info);
        protoWriter.writeBytes(verification.unknownFields());
    }
}
