package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBlockerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SubmitBlockerResponse((SubmitBlockerResponse.AppResponseContext) obj, (SubmitBlockerResponse.BlockerResponseContext) obj2, (SubmitBlockerResponse.FlowResponseContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SubmitBlockerResponse.AppResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SubmitBlockerResponse.BlockerResponseContext.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(SubmitBlockerResponse.FlowResponseContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) obj;
        reverseProtoWriter.getClass();
        submitBlockerResponse.getClass();
        reverseProtoWriter.writeBytes(submitBlockerResponse.unknownFields());
        SubmitBlockerResponse.FlowResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, submitBlockerResponse.flow_response_context);
        SubmitBlockerResponse.BlockerResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, submitBlockerResponse.blocker_response_context);
        SubmitBlockerResponse.AppResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitBlockerResponse.app_response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) obj;
        submitBlockerResponse.getClass();
        return SubmitBlockerResponse.FlowResponseContext.ADAPTER.encodedSizeWithTag(3, submitBlockerResponse.flow_response_context) + SubmitBlockerResponse.BlockerResponseContext.ADAPTER.encodedSizeWithTag(2, submitBlockerResponse.blocker_response_context) + SubmitBlockerResponse.AppResponseContext.ADAPTER.encodedSizeWithTag(1, submitBlockerResponse.app_response_context) + submitBlockerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) obj;
        submitBlockerResponse.getClass();
        SubmitBlockerResponse.AppResponseContext appResponseContext = submitBlockerResponse.app_response_context;
        SubmitBlockerResponse.AppResponseContext appResponseContext2 = appResponseContext != null ? (SubmitBlockerResponse.AppResponseContext) SubmitBlockerResponse.AppResponseContext.ADAPTER.redact(appResponseContext) : null;
        SubmitBlockerResponse.BlockerResponseContext blockerResponseContext = submitBlockerResponse.blocker_response_context;
        SubmitBlockerResponse.BlockerResponseContext blockerResponseContext2 = blockerResponseContext != null ? (SubmitBlockerResponse.BlockerResponseContext) SubmitBlockerResponse.BlockerResponseContext.ADAPTER.redact(blockerResponseContext) : null;
        SubmitBlockerResponse.FlowResponseContext flowResponseContext = submitBlockerResponse.flow_response_context;
        SubmitBlockerResponse.FlowResponseContext flowResponseContext2 = flowResponseContext != null ? (SubmitBlockerResponse.FlowResponseContext) SubmitBlockerResponse.FlowResponseContext.ADAPTER.redact(flowResponseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitBlockerResponse(appResponseContext2, blockerResponseContext2, flowResponseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) obj;
        submitBlockerResponse.getClass();
        SubmitBlockerResponse.AppResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, submitBlockerResponse.app_response_context);
        SubmitBlockerResponse.BlockerResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, submitBlockerResponse.blocker_response_context);
        SubmitBlockerResponse.FlowResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, submitBlockerResponse.flow_response_context);
        protoWriter.writeBytes(submitBlockerResponse.unknownFields());
    }
}
