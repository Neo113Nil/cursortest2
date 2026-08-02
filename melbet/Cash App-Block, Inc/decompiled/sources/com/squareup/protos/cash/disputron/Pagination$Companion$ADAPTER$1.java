package com.squareup.protos.cash.disputron;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Pagination$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Pagination((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.UINT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Pagination pagination = (Pagination) obj;
        reverseProtoWriter.getClass();
        pagination.getClass();
        reverseProtoWriter.writeBytes(pagination.unknownFields());
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 2, pagination.limit);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, pagination.offset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Pagination pagination = (Pagination) obj;
        pagination.getClass();
        return ProtoAdapter.UINT64.encodedSizeWithTag(2, pagination.limit) + ProtoAdapter.STRING.encodedSizeWithTag(1, pagination.offset) + pagination.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Pagination pagination = (Pagination) obj;
        pagination.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = pagination.offset;
        Long l = pagination.limit;
        byteString.getClass();
        return new Pagination(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Pagination pagination = (Pagination) obj;
        pagination.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pagination.offset);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, pagination.limit);
        protoWriter.writeBytes(pagination.unknownFields());
    }
}
