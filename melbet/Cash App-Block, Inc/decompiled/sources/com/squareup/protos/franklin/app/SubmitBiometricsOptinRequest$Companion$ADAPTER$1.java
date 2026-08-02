package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBiometricsOptinRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBiometricsOptinRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBiometricsOptinRequest submitBiometricsOptinRequest = (SubmitBiometricsOptinRequest) obj;
        reverseProtoWriter.getClass();
        submitBiometricsOptinRequest.getClass();
        reverseProtoWriter.writeBytes(submitBiometricsOptinRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, submitBiometricsOptinRequest.biometrics_optin_status);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitBiometricsOptinRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBiometricsOptinRequest submitBiometricsOptinRequest = (SubmitBiometricsOptinRequest) obj;
        submitBiometricsOptinRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, submitBiometricsOptinRequest.biometrics_optin_status) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitBiometricsOptinRequest.request_context) + submitBiometricsOptinRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBiometricsOptinRequest submitBiometricsOptinRequest = (SubmitBiometricsOptinRequest) obj;
        submitBiometricsOptinRequest.getClass();
        RequestContext requestContext = submitBiometricsOptinRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = submitBiometricsOptinRequest.biometrics_optin_status;
        byteString.getClass();
        return new SubmitBiometricsOptinRequest(requestContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBiometricsOptinRequest submitBiometricsOptinRequest = (SubmitBiometricsOptinRequest) obj;
        submitBiometricsOptinRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitBiometricsOptinRequest.request_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, submitBiometricsOptinRequest.biometrics_optin_status);
        protoWriter.writeBytes(submitBiometricsOptinRequest.unknownFields());
    }
}
