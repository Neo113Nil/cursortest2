package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProvisionDigitalWalletTokenRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProvisionDigitalWalletTokenRequest((DigitalWalletTokenProvisioningRequestData) obj, (RequestContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DigitalWalletTokenProvisioningRequestData.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest = (ProvisionDigitalWalletTokenRequest) obj;
        reverseProtoWriter.getClass();
        provisionDigitalWalletTokenRequest.getClass();
        reverseProtoWriter.writeBytes(provisionDigitalWalletTokenRequest.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, provisionDigitalWalletTokenRequest.request_context);
        DigitalWalletTokenProvisioningRequestData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, provisionDigitalWalletTokenRequest.provisioning_request);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest = (ProvisionDigitalWalletTokenRequest) obj;
        provisionDigitalWalletTokenRequest.getClass();
        return RequestContext.ADAPTER.encodedSizeWithTag(2, provisionDigitalWalletTokenRequest.request_context) + DigitalWalletTokenProvisioningRequestData.ADAPTER.encodedSizeWithTag(1, provisionDigitalWalletTokenRequest.provisioning_request) + provisionDigitalWalletTokenRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest = (ProvisionDigitalWalletTokenRequest) obj;
        provisionDigitalWalletTokenRequest.getClass();
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = provisionDigitalWalletTokenRequest.provisioning_request;
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData2 = digitalWalletTokenProvisioningRequestData != null ? (DigitalWalletTokenProvisioningRequestData) DigitalWalletTokenProvisioningRequestData.ADAPTER.redact(digitalWalletTokenProvisioningRequestData) : null;
        RequestContext requestContext = provisionDigitalWalletTokenRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProvisionDigitalWalletTokenRequest(digitalWalletTokenProvisioningRequestData2, requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest = (ProvisionDigitalWalletTokenRequest) obj;
        provisionDigitalWalletTokenRequest.getClass();
        DigitalWalletTokenProvisioningRequestData.ADAPTER.encodeWithTag(protoWriter, 1, provisionDigitalWalletTokenRequest.provisioning_request);
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, provisionDigitalWalletTokenRequest.request_context);
        protoWriter.writeBytes(provisionDigitalWalletTokenRequest.unknownFields());
    }
}
