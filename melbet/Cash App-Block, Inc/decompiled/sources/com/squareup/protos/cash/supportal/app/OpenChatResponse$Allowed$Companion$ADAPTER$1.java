package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OpenChatResponse$Allowed$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OpenChatResponse.Allowed(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OpenChatResponse.Allowed allowed = (OpenChatResponse.Allowed) obj;
        reverseProtoWriter.getClass();
        allowed.getClass();
        reverseProtoWriter.writeBytes(allowed.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OpenChatResponse.Allowed allowed = (OpenChatResponse.Allowed) obj;
        allowed.getClass();
        return allowed.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OpenChatResponse.Allowed) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OpenChatResponse.Allowed(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OpenChatResponse.Allowed allowed = (OpenChatResponse.Allowed) obj;
        allowed.getClass();
        protoWriter.writeBytes(allowed.unknownFields());
    }
}
