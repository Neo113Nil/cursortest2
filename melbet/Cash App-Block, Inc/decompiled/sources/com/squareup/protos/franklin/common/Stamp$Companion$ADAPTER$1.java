package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Stamp$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Stamp((Integer) obj4, (String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Stamp stamp = (Stamp) obj;
        reverseProtoWriter.getClass();
        stamp.getClass();
        reverseProtoWriter.writeBytes(stamp.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, stamp.min_scale);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, stamp.svg);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, stamp.accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, stamp.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Stamp stamp = (Stamp) obj;
        stamp.getClass();
        int size$okio = stamp.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(4, stamp.min_scale) + protoAdapter.encodedSizeWithTag(3, stamp.svg) + protoAdapter.encodedSizeWithTag(2, stamp.accessibility_text) + protoAdapter.encodedSizeWithTag(1, stamp.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Stamp stamp = (Stamp) obj;
        stamp.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = stamp.name;
        Integer num = stamp.min_scale;
        byteString.getClass();
        return new Stamp(num, str, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Stamp stamp = (Stamp) obj;
        stamp.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, stamp.name);
        protoAdapter.encodeWithTag(protoWriter, 2, stamp.accessibility_text);
        protoAdapter.encodeWithTag(protoWriter, 3, stamp.svg);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, stamp.min_scale);
        protoWriter.writeBytes(stamp.unknownFields());
    }
}
