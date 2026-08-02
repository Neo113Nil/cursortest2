package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DigitalWalletTokenProvisioningResponseData$ApplePayResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DigitalWalletTokenProvisioningResponseData.ApplePayResponse((ByteString) obj, (ByteString) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
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
        DigitalWalletTokenProvisioningResponseData.ApplePayResponse applePayResponse = (DigitalWalletTokenProvisioningResponseData.ApplePayResponse) obj;
        reverseProtoWriter.getClass();
        applePayResponse.getClass();
        reverseProtoWriter.writeBytes(applePayResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, applePayResponse.ephemeral_public_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, applePayResponse.activation_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, applePayResponse.encrypted_pass_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletTokenProvisioningResponseData.ApplePayResponse applePayResponse = (DigitalWalletTokenProvisioningResponseData.ApplePayResponse) obj;
        applePayResponse.getClass();
        int size$okio = applePayResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(3, applePayResponse.ephemeral_public_key) + protoAdapter.encodedSizeWithTag(2, applePayResponse.activation_data) + protoAdapter.encodedSizeWithTag(1, applePayResponse.encrypted_pass_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DigitalWalletTokenProvisioningResponseData.ApplePayResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DigitalWalletTokenProvisioningResponseData.ApplePayResponse(null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningResponseData.ApplePayResponse applePayResponse = (DigitalWalletTokenProvisioningResponseData.ApplePayResponse) obj;
        applePayResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, applePayResponse.encrypted_pass_data);
        protoAdapter.encodeWithTag(protoWriter, 2, applePayResponse.activation_data);
        protoAdapter.encodeWithTag(protoWriter, 3, applePayResponse.ephemeral_public_key);
        protoWriter.writeBytes(applePayResponse.unknownFields());
    }
}
