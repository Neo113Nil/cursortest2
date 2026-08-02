package com.squareup.protos.cash.plasma.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CallContext$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CallContext((String) obj, (ClientInfo) obj2, (RequestContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ClientInfo.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CallContext callContext = (CallContext) obj;
        reverseProtoWriter.getClass();
        callContext.getClass();
        reverseProtoWriter.writeBytes(callContext.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, callContext.initial_request_context);
        ClientInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, callContext.client_info);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, callContext.app_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CallContext callContext = (CallContext) obj;
        callContext.getClass();
        return RequestContext.ADAPTER.encodedSizeWithTag(3, callContext.initial_request_context) + ClientInfo.ADAPTER.encodedSizeWithTag(2, callContext.client_info) + ProtoAdapter.STRING.encodedSizeWithTag(1, callContext.app_token) + callContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CallContext callContext = (CallContext) obj;
        callContext.getClass();
        ClientInfo clientInfo = callContext.client_info;
        ClientInfo clientInfo2 = clientInfo != null ? (ClientInfo) ClientInfo.ADAPTER.redact(clientInfo) : null;
        RequestContext requestContext = callContext.initial_request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = callContext.app_token;
        byteString.getClass();
        return new CallContext(str, clientInfo2, requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CallContext callContext = (CallContext) obj;
        callContext.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, callContext.app_token);
        ClientInfo.ADAPTER.encodeWithTag(protoWriter, 2, callContext.client_info);
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, callContext.initial_request_context);
        protoWriter.writeBytes(callContext.unknownFields());
    }
}
