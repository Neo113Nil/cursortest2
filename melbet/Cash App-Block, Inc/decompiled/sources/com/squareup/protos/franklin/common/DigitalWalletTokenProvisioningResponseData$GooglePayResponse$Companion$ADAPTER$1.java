package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningResponseData$GooglePayResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletTokenProvisioningResponseData.GooglePayResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DigitalWalletTokenProvisioningResponseData.GooglePayResponse googlePayResponse = (DigitalWalletTokenProvisioningResponseData.GooglePayResponse) obj;
        reverseProtoWriter.getClass();
        googlePayResponse.getClass();
        reverseProtoWriter.writeBytes(googlePayResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, googlePayResponse.opaque_payment_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletTokenProvisioningResponseData.GooglePayResponse googlePayResponse = (DigitalWalletTokenProvisioningResponseData.GooglePayResponse) obj;
        googlePayResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, googlePayResponse.opaque_payment_card) + googlePayResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DigitalWalletTokenProvisioningResponseData.GooglePayResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DigitalWalletTokenProvisioningResponseData.GooglePayResponse(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningResponseData.GooglePayResponse googlePayResponse = (DigitalWalletTokenProvisioningResponseData.GooglePayResponse) obj;
        googlePayResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, googlePayResponse.opaque_payment_card);
        protoWriter.writeBytes(googlePayResponse.unknownFields());
    }
}
