package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProvisionDigitalWalletTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProvisionDigitalWalletTokenResponse((DigitalWalletTokenProvisioningResponseData) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DigitalWalletTokenProvisioningResponseData.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProvisionDigitalWalletTokenResponse provisionDigitalWalletTokenResponse = (ProvisionDigitalWalletTokenResponse) obj;
        reverseProtoWriter.getClass();
        provisionDigitalWalletTokenResponse.getClass();
        reverseProtoWriter.writeBytes(provisionDigitalWalletTokenResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, provisionDigitalWalletTokenResponse.response_context);
        DigitalWalletTokenProvisioningResponseData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, provisionDigitalWalletTokenResponse.provisioning_response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProvisionDigitalWalletTokenResponse provisionDigitalWalletTokenResponse = (ProvisionDigitalWalletTokenResponse) obj;
        provisionDigitalWalletTokenResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, provisionDigitalWalletTokenResponse.response_context) + DigitalWalletTokenProvisioningResponseData.ADAPTER.encodedSizeWithTag(1, provisionDigitalWalletTokenResponse.provisioning_response) + provisionDigitalWalletTokenResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProvisionDigitalWalletTokenResponse provisionDigitalWalletTokenResponse = (ProvisionDigitalWalletTokenResponse) obj;
        provisionDigitalWalletTokenResponse.getClass();
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = provisionDigitalWalletTokenResponse.provisioning_response;
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData2 = digitalWalletTokenProvisioningResponseData != null ? (DigitalWalletTokenProvisioningResponseData) DigitalWalletTokenProvisioningResponseData.ADAPTER.redact(digitalWalletTokenProvisioningResponseData) : null;
        ResponseContext responseContext = provisionDigitalWalletTokenResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProvisionDigitalWalletTokenResponse(digitalWalletTokenProvisioningResponseData2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProvisionDigitalWalletTokenResponse provisionDigitalWalletTokenResponse = (ProvisionDigitalWalletTokenResponse) obj;
        provisionDigitalWalletTokenResponse.getClass();
        DigitalWalletTokenProvisioningResponseData.ADAPTER.encodeWithTag(protoWriter, 1, provisionDigitalWalletTokenResponse.provisioning_response);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, provisionDigitalWalletTokenResponse.response_context);
        protoWriter.writeBytes(provisionDigitalWalletTokenResponse.unknownFields());
    }
}
