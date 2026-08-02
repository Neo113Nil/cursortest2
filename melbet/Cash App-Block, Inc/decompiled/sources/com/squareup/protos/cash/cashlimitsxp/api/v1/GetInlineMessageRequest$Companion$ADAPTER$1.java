package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInlineMessageRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInlineMessageRequest getInlineMessageRequest = (GetInlineMessageRequest) obj;
        reverseProtoWriter.getClass();
        getInlineMessageRequest.getClass();
        reverseProtoWriter.writeBytes(getInlineMessageRequest.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInlineMessageRequest getInlineMessageRequest = (GetInlineMessageRequest) obj;
        getInlineMessageRequest.getClass();
        return getInlineMessageRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetInlineMessageRequest) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetInlineMessageRequest(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInlineMessageRequest getInlineMessageRequest = (GetInlineMessageRequest) obj;
        getInlineMessageRequest.getClass();
        protoWriter.writeBytes(getInlineMessageRequest.unknownFields());
    }
}
