package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SubmitLiteRecoveryEmailOtpBlockerRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitLiteRecoveryEmailOtpBlockerRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitLiteRecoveryEmailOtpBlockerRequest((RequestContext) obj, (String) obj2, (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest submitLiteRecoveryEmailOtpBlockerRequest = (SubmitLiteRecoveryEmailOtpBlockerRequest) obj;
        reverseProtoWriter.getClass();
        submitLiteRecoveryEmailOtpBlockerRequest.getClass();
        reverseProtoWriter.writeBytes(submitLiteRecoveryEmailOtpBlockerRequest.unknownFields());
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature.ADAPTER.encodeWithTag(reverseProtoWriter, 3, submitLiteRecoveryEmailOtpBlockerRequest.client_signature);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, submitLiteRecoveryEmailOtpBlockerRequest.verification_token);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitLiteRecoveryEmailOtpBlockerRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest submitLiteRecoveryEmailOtpBlockerRequest = (SubmitLiteRecoveryEmailOtpBlockerRequest) obj;
        submitLiteRecoveryEmailOtpBlockerRequest.getClass();
        return SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature.ADAPTER.encodedSizeWithTag(3, submitLiteRecoveryEmailOtpBlockerRequest.client_signature) + ProtoAdapter.STRING.encodedSizeWithTag(2, submitLiteRecoveryEmailOtpBlockerRequest.verification_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitLiteRecoveryEmailOtpBlockerRequest.request_context) + submitLiteRecoveryEmailOtpBlockerRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest submitLiteRecoveryEmailOtpBlockerRequest = (SubmitLiteRecoveryEmailOtpBlockerRequest) obj;
        submitLiteRecoveryEmailOtpBlockerRequest.getClass();
        RequestContext requestContext = submitLiteRecoveryEmailOtpBlockerRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature clientSignature = submitLiteRecoveryEmailOtpBlockerRequest.client_signature;
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature clientSignature2 = clientSignature != null ? (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature.ADAPTER.redact(clientSignature) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitLiteRecoveryEmailOtpBlockerRequest(requestContext2, null, clientSignature2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitLiteRecoveryEmailOtpBlockerRequest submitLiteRecoveryEmailOtpBlockerRequest = (SubmitLiteRecoveryEmailOtpBlockerRequest) obj;
        submitLiteRecoveryEmailOtpBlockerRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitLiteRecoveryEmailOtpBlockerRequest.request_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, submitLiteRecoveryEmailOtpBlockerRequest.verification_token);
        SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature.ADAPTER.encodeWithTag(protoWriter, 3, submitLiteRecoveryEmailOtpBlockerRequest.client_signature);
        protoWriter.writeBytes(submitLiteRecoveryEmailOtpBlockerRequest.unknownFields());
    }
}
