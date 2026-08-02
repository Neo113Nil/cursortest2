package com.squareup.protos.cash.cats;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Cats$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Cats((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Cats cats = (Cats) obj;
        reverseProtoWriter.getClass();
        cats.getClass();
        reverseProtoWriter.writeBytes(cats.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, cats.cat_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Cats cats = (Cats) obj;
        cats.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, cats.cat_count) + cats.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Cats cats = (Cats) obj;
        cats.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = cats.cat_count;
        byteString.getClass();
        return new Cats(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Cats cats = (Cats) obj;
        cats.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cats.cat_count);
        protoWriter.writeBytes(cats.unknownFields());
    }
}
