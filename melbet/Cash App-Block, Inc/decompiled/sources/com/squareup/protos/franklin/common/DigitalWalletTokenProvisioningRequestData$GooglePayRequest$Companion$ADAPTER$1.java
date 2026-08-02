package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningRequestData$GooglePayRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletTokenProvisioningRequestData.GooglePayRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletTokenProvisioningRequestData.GooglePayRequest googlePayRequest = (DigitalWalletTokenProvisioningRequestData.GooglePayRequest) obj;
        reverseProtoWriter.getClass();
        googlePayRequest.getClass();
        reverseProtoWriter.writeBytes(googlePayRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, googlePayRequest.device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, googlePayRequest.wallet_account_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletTokenProvisioningRequestData.GooglePayRequest googlePayRequest = (DigitalWalletTokenProvisioningRequestData.GooglePayRequest) obj;
        googlePayRequest.getClass();
        int size$okio = googlePayRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, googlePayRequest.device_id) + protoAdapter.encodedSizeWithTag(1, googlePayRequest.wallet_account_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DigitalWalletTokenProvisioningRequestData.GooglePayRequest) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DigitalWalletTokenProvisioningRequestData.GooglePayRequest(null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningRequestData.GooglePayRequest googlePayRequest = (DigitalWalletTokenProvisioningRequestData.GooglePayRequest) obj;
        googlePayRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, googlePayRequest.wallet_account_id);
        protoAdapter.encodeWithTag(protoWriter, 2, googlePayRequest.device_id);
        protoWriter.writeBytes(googlePayRequest.unknownFields());
    }
}
