package com.squareup.protos.common.signing;

import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SigningData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzms zzmsVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SigningData((Integer) obj, (ByteString) obj2, zzmsVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 101) {
                zzmsVar = new SigningData$SignatureData$AttestedKey((SigningData.AttestedKeySigningData) SigningData.AttestedKeySigningData.ADAPTER.decode(protoReader));
            } else if (nextTag != 102) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzmsVar = new SigningData$SignatureData$Assertion((SigningData.AssertionSigningData) SigningData.AssertionSigningData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SigningData signingData = (SigningData) obj;
        reverseProtoWriter.getClass();
        signingData.getClass();
        reverseProtoWriter.writeBytes(signingData.unknownFields());
        zzms zzmsVar = signingData.signature_data;
        if (zzmsVar instanceof SigningData$SignatureData$AttestedKey) {
            SigningData.AttestedKeySigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 101, ((SigningData$SignatureData$AttestedKey) zzmsVar).value);
        } else if (zzmsVar instanceof SigningData$SignatureData$Assertion) {
            SigningData.AssertionSigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 102, ((SigningData$SignatureData$Assertion) zzmsVar).value);
        } else if (zzmsVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, signingData.serialized_outer_proto);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, signingData.serialization_version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SigningData signingData = (SigningData) obj;
        signingData.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, signingData.serialized_outer_proto) + ProtoAdapter.INT32.encodedSizeWithTag(1, signingData.serialization_version) + signingData.unknownFields().getSize$okio();
        zzms zzmsVar = signingData.signature_data;
        if (zzmsVar instanceof SigningData$SignatureData$AttestedKey) {
            encodedSizeWithTag = SigningData.AttestedKeySigningData.ADAPTER.encodedSizeWithTag(101, ((SigningData$SignatureData$AttestedKey) zzmsVar).value);
        } else {
            if (!(zzmsVar instanceof SigningData$SignatureData$Assertion)) {
                if (zzmsVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SigningData.AssertionSigningData.ADAPTER.encodedSizeWithTag(102, ((SigningData$SignatureData$Assertion) zzmsVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SigningData signingData = (SigningData) obj;
        signingData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = signingData.serialization_version;
        ByteString byteString2 = signingData.serialized_outer_proto;
        zzms zzmsVar = signingData.signature_data;
        byteString.getClass();
        return new SigningData(num, byteString2, zzmsVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SigningData signingData = (SigningData) obj;
        signingData.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, signingData.serialization_version);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, signingData.serialized_outer_proto);
        zzms zzmsVar = signingData.signature_data;
        if (zzmsVar instanceof SigningData$SignatureData$AttestedKey) {
            SigningData.AttestedKeySigningData.ADAPTER.encodeWithTag(protoWriter, 101, ((SigningData$SignatureData$AttestedKey) zzmsVar).value);
        } else if (zzmsVar instanceof SigningData$SignatureData$Assertion) {
            SigningData.AssertionSigningData.ADAPTER.encodeWithTag(protoWriter, 102, ((SigningData$SignatureData$Assertion) zzmsVar).value);
        } else if (zzmsVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(signingData.unknownFields());
    }
}
