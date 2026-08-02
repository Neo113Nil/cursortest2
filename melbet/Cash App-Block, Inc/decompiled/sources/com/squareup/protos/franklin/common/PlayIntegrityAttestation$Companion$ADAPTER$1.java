package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class PlayIntegrityAttestation$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PlayIntegrityAttestation((String) obj, (String) obj2, (PlayIntegrityAttestation.Status) obj3, (PlayIntegrityAttestation.IntegrityErrorCode) obj4, (String) obj5, (PlayIntegrityAttestation.AttestationType) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj3 = PlayIntegrityAttestation.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 5) {
                try {
                    obj4 = PlayIntegrityAttestation.IntegrityErrorCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 6) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj6 = PlayIntegrityAttestation.AttestationType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PlayIntegrityAttestation playIntegrityAttestation = (PlayIntegrityAttestation) obj;
        reverseProtoWriter.getClass();
        playIntegrityAttestation.getClass();
        reverseProtoWriter.writeBytes(playIntegrityAttestation.unknownFields());
        PlayIntegrityAttestation.AttestationType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, playIntegrityAttestation.attestation_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, playIntegrityAttestation.request_hash);
        PlayIntegrityAttestation.IntegrityErrorCode.ADAPTER.encodeWithTag(reverseProtoWriter, 5, playIntegrityAttestation.integrity_error_code);
        PlayIntegrityAttestation.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 4, playIntegrityAttestation.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, playIntegrityAttestation.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, playIntegrityAttestation.nonce);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlayIntegrityAttestation playIntegrityAttestation = (PlayIntegrityAttestation) obj;
        playIntegrityAttestation.getClass();
        int size$okio = playIntegrityAttestation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return PlayIntegrityAttestation.AttestationType.ADAPTER.encodedSizeWithTag(7, playIntegrityAttestation.attestation_type) + protoAdapter.encodedSizeWithTag(6, playIntegrityAttestation.request_hash) + PlayIntegrityAttestation.IntegrityErrorCode.ADAPTER.encodedSizeWithTag(5, playIntegrityAttestation.integrity_error_code) + PlayIntegrityAttestation.Status.ADAPTER.encodedSizeWithTag(4, playIntegrityAttestation.status) + protoAdapter.encodedSizeWithTag(2, playIntegrityAttestation.token) + protoAdapter.encodedSizeWithTag(1, playIntegrityAttestation.nonce) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlayIntegrityAttestation playIntegrityAttestation = (PlayIntegrityAttestation) obj;
        playIntegrityAttestation.getClass();
        ByteString byteString = ByteString.EMPTY;
        PlayIntegrityAttestation.Status status = playIntegrityAttestation.status;
        PlayIntegrityAttestation.IntegrityErrorCode integrityErrorCode = playIntegrityAttestation.integrity_error_code;
        PlayIntegrityAttestation.AttestationType attestationType = playIntegrityAttestation.attestation_type;
        byteString.getClass();
        return new PlayIntegrityAttestation(null, null, status, integrityErrorCode, null, attestationType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlayIntegrityAttestation playIntegrityAttestation = (PlayIntegrityAttestation) obj;
        playIntegrityAttestation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, playIntegrityAttestation.nonce);
        protoAdapter.encodeWithTag(protoWriter, 2, playIntegrityAttestation.token);
        PlayIntegrityAttestation.Status.ADAPTER.encodeWithTag(protoWriter, 4, playIntegrityAttestation.status);
        PlayIntegrityAttestation.IntegrityErrorCode.ADAPTER.encodeWithTag(protoWriter, 5, playIntegrityAttestation.integrity_error_code);
        protoAdapter.encodeWithTag(protoWriter, 6, playIntegrityAttestation.request_hash);
        PlayIntegrityAttestation.AttestationType.ADAPTER.encodeWithTag(protoWriter, 7, playIntegrityAttestation.attestation_type);
        protoWriter.writeBytes(playIntegrityAttestation.unknownFields());
    }
}
