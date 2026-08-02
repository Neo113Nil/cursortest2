package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RequestPushNotificationsRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RequestPushNotificationsRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RequestPushNotificationsRequest requestPushNotificationsRequest = (RequestPushNotificationsRequest) obj;
        reverseProtoWriter.getClass();
        requestPushNotificationsRequest.getClass();
        reverseProtoWriter.writeBytes(requestPushNotificationsRequest.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, requestPushNotificationsRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RequestPushNotificationsRequest requestPushNotificationsRequest = (RequestPushNotificationsRequest) obj;
        requestPushNotificationsRequest.getClass();
        return RequestContext.ADAPTER.encodedSizeWithTag(1, requestPushNotificationsRequest.request_context) + requestPushNotificationsRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RequestPushNotificationsRequest requestPushNotificationsRequest = (RequestPushNotificationsRequest) obj;
        requestPushNotificationsRequest.getClass();
        RequestContext requestContext = requestPushNotificationsRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RequestPushNotificationsRequest(requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RequestPushNotificationsRequest requestPushNotificationsRequest = (RequestPushNotificationsRequest) obj;
        requestPushNotificationsRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, requestPushNotificationsRequest.request_context);
        protoWriter.writeBytes(requestPushNotificationsRequest.unknownFields());
    }
}
