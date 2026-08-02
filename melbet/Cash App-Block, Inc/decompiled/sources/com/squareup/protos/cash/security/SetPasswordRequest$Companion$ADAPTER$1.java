package com.squareup.protos.cash.security;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetPasswordRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetPasswordRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SetPasswordRequest setPasswordRequest = (SetPasswordRequest) obj;
        reverseProtoWriter.getClass();
        setPasswordRequest.getClass();
        reverseProtoWriter.writeBytes(setPasswordRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, setPasswordRequest.new_password);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setPasswordRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetPasswordRequest setPasswordRequest = (SetPasswordRequest) obj;
        setPasswordRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, setPasswordRequest.new_password) + RequestContext.ADAPTER.encodedSizeWithTag(1, setPasswordRequest.request_context) + setPasswordRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPasswordRequest setPasswordRequest = (SetPasswordRequest) obj;
        setPasswordRequest.getClass();
        RequestContext requestContext = setPasswordRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetPasswordRequest(requestContext2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPasswordRequest setPasswordRequest = (SetPasswordRequest) obj;
        setPasswordRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setPasswordRequest.request_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setPasswordRequest.new_password);
        protoWriter.writeBytes(setPasswordRequest.unknownFields());
    }
}
