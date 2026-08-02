package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitProveMobileAuthBlockerRequest$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SubmitProveMobileAuthBlockerRequest((RequestContext) obj, (Boolean) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitProveMobileAuthBlockerRequest submitProveMobileAuthBlockerRequest = (SubmitProveMobileAuthBlockerRequest) obj;
        reverseProtoWriter.getClass();
        submitProveMobileAuthBlockerRequest.getClass();
        reverseProtoWriter.writeBytes(submitProveMobileAuthBlockerRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, submitProveMobileAuthBlockerRequest.failure_reason);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, submitProveMobileAuthBlockerRequest.finished);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitProveMobileAuthBlockerRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitProveMobileAuthBlockerRequest submitProveMobileAuthBlockerRequest = (SubmitProveMobileAuthBlockerRequest) obj;
        submitProveMobileAuthBlockerRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, submitProveMobileAuthBlockerRequest.failure_reason) + ProtoAdapter.BOOL.encodedSizeWithTag(2, submitProveMobileAuthBlockerRequest.finished) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitProveMobileAuthBlockerRequest.request_context) + submitProveMobileAuthBlockerRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitProveMobileAuthBlockerRequest submitProveMobileAuthBlockerRequest = (SubmitProveMobileAuthBlockerRequest) obj;
        submitProveMobileAuthBlockerRequest.getClass();
        RequestContext requestContext = submitProveMobileAuthBlockerRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = submitProveMobileAuthBlockerRequest.finished;
        String str = submitProveMobileAuthBlockerRequest.failure_reason;
        byteString.getClass();
        return new SubmitProveMobileAuthBlockerRequest(requestContext2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitProveMobileAuthBlockerRequest submitProveMobileAuthBlockerRequest = (SubmitProveMobileAuthBlockerRequest) obj;
        submitProveMobileAuthBlockerRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitProveMobileAuthBlockerRequest.request_context);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, submitProveMobileAuthBlockerRequest.finished);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, submitProveMobileAuthBlockerRequest.failure_reason);
        protoWriter.writeBytes(submitProveMobileAuthBlockerRequest.unknownFields());
    }
}
