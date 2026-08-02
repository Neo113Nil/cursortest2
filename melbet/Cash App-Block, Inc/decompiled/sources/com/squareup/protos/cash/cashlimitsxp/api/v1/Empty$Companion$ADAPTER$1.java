package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Empty$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Empty(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Empty empty = (Empty) obj;
        reverseProtoWriter.getClass();
        empty.getClass();
        reverseProtoWriter.writeBytes(empty.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Empty empty = (Empty) obj;
        empty.getClass();
        return empty.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Empty) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Empty(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Empty empty = (Empty) obj;
        empty.getClass();
        protoWriter.writeBytes(empty.unknownFields());
    }
}
