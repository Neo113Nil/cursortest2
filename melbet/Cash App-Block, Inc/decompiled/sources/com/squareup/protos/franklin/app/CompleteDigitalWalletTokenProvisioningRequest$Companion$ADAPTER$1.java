package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CompleteDigitalWalletTokenProvisioningRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CompleteDigitalWalletTokenProvisioningRequest((RequestContext) obj, (DigitalWalletTokenProvisioningCompletionData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(DigitalWalletTokenProvisioningCompletionData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = (CompleteDigitalWalletTokenProvisioningRequest) obj;
        reverseProtoWriter.getClass();
        completeDigitalWalletTokenProvisioningRequest.getClass();
        reverseProtoWriter.writeBytes(completeDigitalWalletTokenProvisioningRequest.unknownFields());
        DigitalWalletTokenProvisioningCompletionData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, completeDigitalWalletTokenProvisioningRequest.completion_request);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, completeDigitalWalletTokenProvisioningRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = (CompleteDigitalWalletTokenProvisioningRequest) obj;
        completeDigitalWalletTokenProvisioningRequest.getClass();
        return DigitalWalletTokenProvisioningCompletionData.ADAPTER.encodedSizeWithTag(2, completeDigitalWalletTokenProvisioningRequest.completion_request) + RequestContext.ADAPTER.encodedSizeWithTag(1, completeDigitalWalletTokenProvisioningRequest.request_context) + completeDigitalWalletTokenProvisioningRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = (CompleteDigitalWalletTokenProvisioningRequest) obj;
        completeDigitalWalletTokenProvisioningRequest.getClass();
        RequestContext requestContext = completeDigitalWalletTokenProvisioningRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = completeDigitalWalletTokenProvisioningRequest.completion_request;
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData2 = digitalWalletTokenProvisioningCompletionData != null ? (DigitalWalletTokenProvisioningCompletionData) DigitalWalletTokenProvisioningCompletionData.ADAPTER.redact(digitalWalletTokenProvisioningCompletionData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CompleteDigitalWalletTokenProvisioningRequest(requestContext2, digitalWalletTokenProvisioningCompletionData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = (CompleteDigitalWalletTokenProvisioningRequest) obj;
        completeDigitalWalletTokenProvisioningRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, completeDigitalWalletTokenProvisioningRequest.request_context);
        DigitalWalletTokenProvisioningCompletionData.ADAPTER.encodeWithTag(protoWriter, 2, completeDigitalWalletTokenProvisioningRequest.completion_request);
        protoWriter.writeBytes(completeDigitalWalletTokenProvisioningRequest.unknownFields());
    }
}
