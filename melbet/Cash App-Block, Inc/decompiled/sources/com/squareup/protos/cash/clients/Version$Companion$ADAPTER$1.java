package com.squareup.protos.cash.clients;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Version$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Version((Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Version version = (Version) obj;
        reverseProtoWriter.getClass();
        version.getClass();
        reverseProtoWriter.writeBytes(version.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, version.patch);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, version.minor);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, version.major);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Version version = (Version) obj;
        version.getClass();
        int size$okio = version.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, version.patch) + protoAdapter.encodedSizeWithTag(2, version.minor) + protoAdapter.encodedSizeWithTag(1, version.major) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Version version = (Version) obj;
        version.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = version.major;
        Integer num2 = version.minor;
        Integer num3 = version.patch;
        byteString.getClass();
        return new Version(num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Version version = (Version) obj;
        version.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, version.major);
        protoAdapter.encodeWithTag(protoWriter, 2, version.minor);
        protoAdapter.encodeWithTag(protoWriter, 3, version.patch);
        protoWriter.writeBytes(version.unknownFields());
    }
}
