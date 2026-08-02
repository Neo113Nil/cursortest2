package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningRequestData$ApplePayRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletTokenProvisioningRequestData.ApplePayRequest(m, (ByteString) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletTokenProvisioningRequestData.ApplePayRequest applePayRequest = (DigitalWalletTokenProvisioningRequestData.ApplePayRequest) obj;
        reverseProtoWriter.getClass();
        applePayRequest.getClass();
        reverseProtoWriter.writeBytes(applePayRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, applePayRequest.nonce_signature);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, applePayRequest.nonce);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, applePayRequest.certificates);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletTokenProvisioningRequestData.ApplePayRequest applePayRequest = (DigitalWalletTokenProvisioningRequestData.ApplePayRequest) obj;
        applePayRequest.getClass();
        int size$okio = applePayRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(3, applePayRequest.nonce_signature) + protoAdapter.encodedSizeWithTag(2, applePayRequest.nonce) + protoAdapter.asRepeated().encodedSizeWithTag(1, applePayRequest.certificates) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DigitalWalletTokenProvisioningRequestData.ApplePayRequest) obj).getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        emptyList.getClass();
        byteString.getClass();
        return new DigitalWalletTokenProvisioningRequestData.ApplePayRequest(emptyList, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningRequestData.ApplePayRequest applePayRequest = (DigitalWalletTokenProvisioningRequestData.ApplePayRequest) obj;
        applePayRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, applePayRequest.certificates);
        protoAdapter.encodeWithTag(protoWriter, 2, applePayRequest.nonce);
        protoAdapter.encodeWithTag(protoWriter, 3, applePayRequest.nonce_signature);
        protoWriter.writeBytes(applePayRequest.unknownFields());
    }
}
