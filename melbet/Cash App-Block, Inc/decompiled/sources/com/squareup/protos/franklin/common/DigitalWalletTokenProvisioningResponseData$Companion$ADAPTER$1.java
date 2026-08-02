package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningResponseData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzdu zzduVar = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletTokenProvisioningResponseData((DigitalWalletToken$Issuer) obj, zzduVar, (DigitalWalletTokenProvisioningResponseData.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DigitalWalletToken$Issuer.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                zzduVar = new DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse((DigitalWalletTokenProvisioningResponseData.ApplePayResponse) DigitalWalletTokenProvisioningResponseData.ApplePayResponse.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzduVar = new DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse((DigitalWalletTokenProvisioningResponseData.GooglePayResponse) DigitalWalletTokenProvisioningResponseData.GooglePayResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = DigitalWalletTokenProvisioningResponseData.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = (DigitalWalletTokenProvisioningResponseData) obj;
        reverseProtoWriter.getClass();
        digitalWalletTokenProvisioningResponseData.getClass();
        reverseProtoWriter.writeBytes(digitalWalletTokenProvisioningResponseData.unknownFields());
        zzdu zzduVar = digitalWalletTokenProvisioningResponseData.provider_response;
        if (zzduVar instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) {
            DigitalWalletTokenProvisioningResponseData.ApplePayResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) zzduVar).value);
        } else if (zzduVar instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) {
            DigitalWalletTokenProvisioningResponseData.GooglePayResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) zzduVar).value);
        } else if (zzduVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DigitalWalletTokenProvisioningResponseData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 4, digitalWalletTokenProvisioningResponseData.status);
        DigitalWalletToken$Issuer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, digitalWalletTokenProvisioningResponseData.digital_wallet_issuer);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = (DigitalWalletTokenProvisioningResponseData) obj;
        digitalWalletTokenProvisioningResponseData.getClass();
        int encodedSizeWithTag2 = DigitalWalletToken$Issuer.ADAPTER.encodedSizeWithTag(1, digitalWalletTokenProvisioningResponseData.digital_wallet_issuer) + digitalWalletTokenProvisioningResponseData.unknownFields().getSize$okio();
        zzdu zzduVar = digitalWalletTokenProvisioningResponseData.provider_response;
        if (zzduVar instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) {
            encodedSizeWithTag = DigitalWalletTokenProvisioningResponseData.ApplePayResponse.ADAPTER.encodedSizeWithTag(2, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) zzduVar).value);
        } else {
            if (!(zzduVar instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse)) {
                if (zzduVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return DigitalWalletTokenProvisioningResponseData.Status.ADAPTER.encodedSizeWithTag(4, digitalWalletTokenProvisioningResponseData.status) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = DigitalWalletTokenProvisioningResponseData.GooglePayResponse.ADAPTER.encodedSizeWithTag(3, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) zzduVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return DigitalWalletTokenProvisioningResponseData.Status.ADAPTER.encodedSizeWithTag(4, digitalWalletTokenProvisioningResponseData.status) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = (DigitalWalletTokenProvisioningResponseData) obj;
        digitalWalletTokenProvisioningResponseData.getClass();
        ByteString byteString = ByteString.EMPTY;
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = digitalWalletTokenProvisioningResponseData.digital_wallet_issuer;
        zzdu zzduVar = digitalWalletTokenProvisioningResponseData.provider_response;
        DigitalWalletTokenProvisioningResponseData.Status status = digitalWalletTokenProvisioningResponseData.status;
        byteString.getClass();
        return new DigitalWalletTokenProvisioningResponseData(digitalWalletToken$Issuer, zzduVar, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = (DigitalWalletTokenProvisioningResponseData) obj;
        digitalWalletTokenProvisioningResponseData.getClass();
        DigitalWalletToken$Issuer.ADAPTER.encodeWithTag(protoWriter, 1, digitalWalletTokenProvisioningResponseData.digital_wallet_issuer);
        DigitalWalletTokenProvisioningResponseData.Status.ADAPTER.encodeWithTag(protoWriter, 4, digitalWalletTokenProvisioningResponseData.status);
        zzdu zzduVar = digitalWalletTokenProvisioningResponseData.provider_response;
        if (zzduVar instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) {
            DigitalWalletTokenProvisioningResponseData.ApplePayResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) zzduVar).value);
        } else if (zzduVar instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) {
            DigitalWalletTokenProvisioningResponseData.GooglePayResponse.ADAPTER.encodeWithTag(protoWriter, 3, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) zzduVar).value);
        } else if (zzduVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(digitalWalletTokenProvisioningResponseData.unknownFields());
    }
}
