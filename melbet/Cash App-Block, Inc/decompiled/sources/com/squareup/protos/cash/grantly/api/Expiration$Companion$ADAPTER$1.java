package com.squareup.protos.cash.grantly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Expiration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Expiration((Integer) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Expiration expiration = (Expiration) obj;
        reverseProtoWriter.getClass();
        expiration.getClass();
        reverseProtoWriter.writeBytes(expiration.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, expiration.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, expiration.month);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Expiration expiration = (Expiration) obj;
        expiration.getClass();
        int size$okio = expiration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(2, expiration.year) + protoAdapter.encodedSizeWithTag(1, expiration.month) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Expiration expiration = (Expiration) obj;
        expiration.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = expiration.month;
        Integer num2 = expiration.year;
        byteString.getClass();
        return new Expiration(num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Expiration expiration = (Expiration) obj;
        expiration.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(protoWriter, 1, expiration.month);
        protoAdapter.encodeWithTag(protoWriter, 2, expiration.year);
        protoWriter.writeBytes(expiration.unknownFields());
    }
}
