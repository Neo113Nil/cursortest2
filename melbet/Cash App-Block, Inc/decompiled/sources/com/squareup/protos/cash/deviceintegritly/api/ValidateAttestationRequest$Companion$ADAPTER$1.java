package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ValidateAttestationRequest$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ValidateAttestationRequest((String) obj, (String) obj2, (String) obj3, (ByteString) obj4, (Integer) obj5, (Integer) obj6, validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation, (ByteString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 4:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = new ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation((PlayIntegrityAttestation) PlayIntegrityAttestation.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    obj7 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ValidateAttestationRequest validateAttestationRequest = (ValidateAttestationRequest) obj;
        reverseProtoWriter.getClass();
        validateAttestationRequest.getClass();
        reverseProtoWriter.writeBytes(validateAttestationRequest.unknownFields());
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = validateAttestationRequest.device_attestation;
        if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            PlayIntegrityAttestation.ADAPTER.encodeWithTag(reverseProtoWriter, 8, validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation.value);
        } else if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, validateAttestationRequest.device_check_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, validateAttestationRequest.gms_api_status);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, validateAttestationRequest.safetynet_api_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, validateAttestationRequest.attestation_result);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, validateAttestationRequest.nonce);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, validateAttestationRequest.customer_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, validateAttestationRequest.app_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ValidateAttestationRequest validateAttestationRequest = (ValidateAttestationRequest) obj;
        validateAttestationRequest.getClass();
        int size$okio = validateAttestationRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, validateAttestationRequest.nonce) + protoAdapter.encodedSizeWithTag(6, validateAttestationRequest.customer_token) + protoAdapter.encodedSizeWithTag(1, validateAttestationRequest.app_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, validateAttestationRequest.attestation_result) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(5, validateAttestationRequest.gms_api_status) + protoAdapter3.encodedSizeWithTag(4, validateAttestationRequest.safetynet_api_status) + encodedSizeWithTag2;
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = validateAttestationRequest.device_attestation;
        if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            encodedSizeWithTag3 += PlayIntegrityAttestation.ADAPTER.encodedSizeWithTag(8, validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation.value);
        } else if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return protoAdapter2.encodedSizeWithTag(9, validateAttestationRequest.device_check_token) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ValidateAttestationRequest validateAttestationRequest = (ValidateAttestationRequest) obj;
        validateAttestationRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = validateAttestationRequest.app_token;
        String str2 = validateAttestationRequest.customer_token;
        ByteString byteString2 = validateAttestationRequest.attestation_result;
        Integer num = validateAttestationRequest.safetynet_api_status;
        Integer num2 = validateAttestationRequest.gms_api_status;
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = validateAttestationRequest.device_attestation;
        byteString.getClass();
        return new ValidateAttestationRequest(str, str2, null, byteString2, num, num2, validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ValidateAttestationRequest validateAttestationRequest = (ValidateAttestationRequest) obj;
        validateAttestationRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, validateAttestationRequest.app_token);
        protoAdapter.encodeWithTag(protoWriter, 6, validateAttestationRequest.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, validateAttestationRequest.nonce);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
        protoAdapter2.encodeWithTag(protoWriter, 3, validateAttestationRequest.attestation_result);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 4, validateAttestationRequest.safetynet_api_status);
        protoAdapter3.encodeWithTag(protoWriter, 5, validateAttestationRequest.gms_api_status);
        protoAdapter2.encodeWithTag(protoWriter, 9, validateAttestationRequest.device_check_token);
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = validateAttestationRequest.device_attestation;
        if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            PlayIntegrityAttestation.ADAPTER.encodeWithTag(protoWriter, 8, validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation.value);
        } else if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(validateAttestationRequest.unknownFields());
    }
}
