package com.squareup.protos.cash.postcard.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RefreshCardTabSchemeRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshCardTabSchemeRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = (RefreshCardTabSchemeRequest) obj;
        reverseProtoWriter.getClass();
        refreshCardTabSchemeRequest.getClass();
        reverseProtoWriter.writeBytes(refreshCardTabSchemeRequest.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshCardTabSchemeRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = (RefreshCardTabSchemeRequest) obj;
        refreshCardTabSchemeRequest.getClass();
        return RequestContext.ADAPTER.encodedSizeWithTag(1, refreshCardTabSchemeRequest.request_context) + refreshCardTabSchemeRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = (RefreshCardTabSchemeRequest) obj;
        refreshCardTabSchemeRequest.getClass();
        RequestContext requestContext = refreshCardTabSchemeRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefreshCardTabSchemeRequest(requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = (RefreshCardTabSchemeRequest) obj;
        refreshCardTabSchemeRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshCardTabSchemeRequest.request_context);
        protoWriter.writeBytes(refreshCardTabSchemeRequest.unknownFields());
    }
}
