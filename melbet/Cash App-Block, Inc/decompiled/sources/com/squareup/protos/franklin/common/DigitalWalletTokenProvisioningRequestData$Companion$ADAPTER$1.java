package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdt;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningRequestData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzdt zzdtVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletTokenProvisioningRequestData((DigitalWalletToken$Issuer) obj, zzdtVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DigitalWalletToken$Issuer.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                zzdtVar = new DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest((DigitalWalletTokenProvisioningRequestData.ApplePayRequest) DigitalWalletTokenProvisioningRequestData.ApplePayRequest.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzdtVar = new DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest((DigitalWalletTokenProvisioningRequestData.GooglePayRequest) DigitalWalletTokenProvisioningRequestData.GooglePayRequest.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = (DigitalWalletTokenProvisioningRequestData) obj;
        reverseProtoWriter.getClass();
        digitalWalletTokenProvisioningRequestData.getClass();
        reverseProtoWriter.writeBytes(digitalWalletTokenProvisioningRequestData.unknownFields());
        zzdt zzdtVar = digitalWalletTokenProvisioningRequestData.provider_request;
        if (zzdtVar instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) {
            DigitalWalletTokenProvisioningRequestData.ApplePayRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) zzdtVar).value);
        } else if (zzdtVar instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) {
            DigitalWalletTokenProvisioningRequestData.GooglePayRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) zzdtVar).value);
        } else if (zzdtVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DigitalWalletToken$Issuer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, digitalWalletTokenProvisioningRequestData.digital_wallet_issuer);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = (DigitalWalletTokenProvisioningRequestData) obj;
        digitalWalletTokenProvisioningRequestData.getClass();
        int encodedSizeWithTag = DigitalWalletToken$Issuer.ADAPTER.encodedSizeWithTag(1, digitalWalletTokenProvisioningRequestData.digital_wallet_issuer) + digitalWalletTokenProvisioningRequestData.unknownFields().getSize$okio();
        zzdt zzdtVar = digitalWalletTokenProvisioningRequestData.provider_request;
        if (zzdtVar instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) {
            return DigitalWalletTokenProvisioningRequestData.ApplePayRequest.ADAPTER.encodedSizeWithTag(2, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) zzdtVar).value) + encodedSizeWithTag;
        }
        if (zzdtVar instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) {
            return DigitalWalletTokenProvisioningRequestData.GooglePayRequest.ADAPTER.encodedSizeWithTag(3, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) zzdtVar).value) + encodedSizeWithTag;
        }
        if (zzdtVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = (DigitalWalletTokenProvisioningRequestData) obj;
        digitalWalletTokenProvisioningRequestData.getClass();
        ByteString byteString = ByteString.EMPTY;
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = digitalWalletTokenProvisioningRequestData.digital_wallet_issuer;
        zzdt zzdtVar = digitalWalletTokenProvisioningRequestData.provider_request;
        byteString.getClass();
        return new DigitalWalletTokenProvisioningRequestData(digitalWalletToken$Issuer, zzdtVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = (DigitalWalletTokenProvisioningRequestData) obj;
        digitalWalletTokenProvisioningRequestData.getClass();
        DigitalWalletToken$Issuer.ADAPTER.encodeWithTag(protoWriter, 1, digitalWalletTokenProvisioningRequestData.digital_wallet_issuer);
        zzdt zzdtVar = digitalWalletTokenProvisioningRequestData.provider_request;
        if (zzdtVar instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) {
            DigitalWalletTokenProvisioningRequestData.ApplePayRequest.ADAPTER.encodeWithTag(protoWriter, 2, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) zzdtVar).value);
        } else if (zzdtVar instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) {
            DigitalWalletTokenProvisioningRequestData.GooglePayRequest.ADAPTER.encodeWithTag(protoWriter, 3, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) zzdtVar).value);
        } else if (zzdtVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(digitalWalletTokenProvisioningRequestData.unknownFields());
    }
}
