package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSignedCertificateRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSignedCertificateRequest((ByteString) obj, (String) obj2, getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = new GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion((AppAttestAssertion) AppAttestAssertion.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSignedCertificateRequest getSignedCertificateRequest = (GetSignedCertificateRequest) obj;
        reverseProtoWriter.getClass();
        getSignedCertificateRequest.getClass();
        reverseProtoWriter.writeBytes(getSignedCertificateRequest.unknownFields());
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = getSignedCertificateRequest.device_assertion;
        if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null) {
            AppAttestAssertion.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion.value);
        } else if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getSignedCertificateRequest.challenge);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, getSignedCertificateRequest.trifle_mobile_cert_request);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSignedCertificateRequest getSignedCertificateRequest = (GetSignedCertificateRequest) obj;
        getSignedCertificateRequest.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, getSignedCertificateRequest.challenge) + ProtoAdapter.BYTES.encodedSizeWithTag(1, getSignedCertificateRequest.trifle_mobile_cert_request) + getSignedCertificateRequest.unknownFields().getSize$okio();
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = getSignedCertificateRequest.device_assertion;
        if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null) {
            return AppAttestAssertion.ADAPTER.encodedSizeWithTag(3, getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion.value) + encodedSizeWithTag;
        }
        if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSignedCertificateRequest getSignedCertificateRequest = (GetSignedCertificateRequest) obj;
        getSignedCertificateRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = getSignedCertificateRequest.trifle_mobile_cert_request;
        String str = getSignedCertificateRequest.challenge;
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = getSignedCertificateRequest.device_assertion;
        byteString.getClass();
        return new GetSignedCertificateRequest(byteString2, str, getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSignedCertificateRequest getSignedCertificateRequest = (GetSignedCertificateRequest) obj;
        getSignedCertificateRequest.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, getSignedCertificateRequest.trifle_mobile_cert_request);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSignedCertificateRequest.challenge);
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = getSignedCertificateRequest.device_assertion;
        if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null) {
            AppAttestAssertion.ADAPTER.encodeWithTag(protoWriter, 3, getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion.value);
        } else if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getSignedCertificateRequest.unknownFields());
    }
}
