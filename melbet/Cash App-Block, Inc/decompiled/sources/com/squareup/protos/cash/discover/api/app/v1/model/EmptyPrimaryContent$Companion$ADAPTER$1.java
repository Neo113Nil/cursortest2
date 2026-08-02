package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EmptyPrimaryContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EmptyPrimaryContent(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmptyPrimaryContent emptyPrimaryContent = (EmptyPrimaryContent) obj;
        reverseProtoWriter.getClass();
        emptyPrimaryContent.getClass();
        reverseProtoWriter.writeBytes(emptyPrimaryContent.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EmptyPrimaryContent emptyPrimaryContent = (EmptyPrimaryContent) obj;
        emptyPrimaryContent.getClass();
        return emptyPrimaryContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((EmptyPrimaryContent) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EmptyPrimaryContent(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmptyPrimaryContent emptyPrimaryContent = (EmptyPrimaryContent) obj;
        emptyPrimaryContent.getClass();
        protoWriter.writeBytes(emptyPrimaryContent.unknownFields());
    }
}
