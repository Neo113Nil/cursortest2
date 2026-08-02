package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningCompletionData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletTokenProvisioningCompletionData((DigitalWalletToken$Issuer) obj, (DigitalWalletTokenProvisioningCompletionData.ProvisioningResult) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DigitalWalletToken$Issuer.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = (DigitalWalletTokenProvisioningCompletionData) obj;
        reverseProtoWriter.getClass();
        digitalWalletTokenProvisioningCompletionData.getClass();
        reverseProtoWriter.writeBytes(digitalWalletTokenProvisioningCompletionData.unknownFields());
        DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, digitalWalletTokenProvisioningCompletionData.provisioning_result);
        DigitalWalletToken$Issuer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, digitalWalletTokenProvisioningCompletionData.digital_wallet_issuer);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = (DigitalWalletTokenProvisioningCompletionData) obj;
        digitalWalletTokenProvisioningCompletionData.getClass();
        return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ADAPTER.encodedSizeWithTag(2, digitalWalletTokenProvisioningCompletionData.provisioning_result) + DigitalWalletToken$Issuer.ADAPTER.encodedSizeWithTag(1, digitalWalletTokenProvisioningCompletionData.digital_wallet_issuer) + digitalWalletTokenProvisioningCompletionData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = (DigitalWalletTokenProvisioningCompletionData) obj;
        digitalWalletTokenProvisioningCompletionData.getClass();
        ByteString byteString = ByteString.EMPTY;
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = digitalWalletTokenProvisioningCompletionData.digital_wallet_issuer;
        DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult = digitalWalletTokenProvisioningCompletionData.provisioning_result;
        byteString.getClass();
        return new DigitalWalletTokenProvisioningCompletionData(digitalWalletToken$Issuer, provisioningResult, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = (DigitalWalletTokenProvisioningCompletionData) obj;
        digitalWalletTokenProvisioningCompletionData.getClass();
        DigitalWalletToken$Issuer.ADAPTER.encodeWithTag(protoWriter, 1, digitalWalletTokenProvisioningCompletionData.digital_wallet_issuer);
        DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ADAPTER.encodeWithTag(protoWriter, 2, digitalWalletTokenProvisioningCompletionData.provisioning_result);
        protoWriter.writeBytes(digitalWalletTokenProvisioningCompletionData.unknownFields());
    }
}
