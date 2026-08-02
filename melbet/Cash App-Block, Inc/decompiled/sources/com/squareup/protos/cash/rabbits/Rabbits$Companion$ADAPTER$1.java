package com.squareup.protos.cash.rabbits;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Rabbits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Rabbits((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Rabbits rabbits = (Rabbits) obj;
        reverseProtoWriter.getClass();
        rabbits.getClass();
        reverseProtoWriter.writeBytes(rabbits.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, rabbits.rabbit_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Rabbits rabbits = (Rabbits) obj;
        rabbits.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, rabbits.rabbit_count) + rabbits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Rabbits rabbits = (Rabbits) obj;
        rabbits.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = rabbits.rabbit_count;
        byteString.getClass();
        return new Rabbits(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Rabbits rabbits = (Rabbits) obj;
        rabbits.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rabbits.rabbit_count);
        protoWriter.writeBytes(rabbits.unknownFields());
    }
}
