package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetScenarioPlanRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetScenarioPlanRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetScenarioPlanRequest getScenarioPlanRequest = (GetScenarioPlanRequest) obj;
        reverseProtoWriter.getClass();
        getScenarioPlanRequest.getClass();
        reverseProtoWriter.writeBytes(getScenarioPlanRequest.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getScenarioPlanRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetScenarioPlanRequest getScenarioPlanRequest = (GetScenarioPlanRequest) obj;
        getScenarioPlanRequest.getClass();
        return RequestContext.ADAPTER.encodedSizeWithTag(3, getScenarioPlanRequest.request_context) + getScenarioPlanRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetScenarioPlanRequest getScenarioPlanRequest = (GetScenarioPlanRequest) obj;
        getScenarioPlanRequest.getClass();
        RequestContext requestContext = getScenarioPlanRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetScenarioPlanRequest(requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetScenarioPlanRequest getScenarioPlanRequest = (GetScenarioPlanRequest) obj;
        getScenarioPlanRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, getScenarioPlanRequest.request_context);
        protoWriter.writeBytes(getScenarioPlanRequest.unknownFields());
    }
}
