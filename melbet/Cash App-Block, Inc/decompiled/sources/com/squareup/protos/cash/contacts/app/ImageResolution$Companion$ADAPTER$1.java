package com.squareup.protos.cash.contacts.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageResolution$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageResolution((Long) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageResolution imageResolution = (ImageResolution) obj;
        reverseProtoWriter.getClass();
        imageResolution.getClass();
        reverseProtoWriter.writeBytes(imageResolution.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, imageResolution.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, imageResolution.width);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageResolution imageResolution = (ImageResolution) obj;
        imageResolution.getClass();
        int size$okio = imageResolution.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(2, imageResolution.height) + protoAdapter.encodedSizeWithTag(1, imageResolution.width) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageResolution imageResolution = (ImageResolution) obj;
        imageResolution.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = imageResolution.width;
        Long l2 = imageResolution.height;
        byteString.getClass();
        return new ImageResolution(l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageResolution imageResolution = (ImageResolution) obj;
        imageResolution.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, imageResolution.width);
        protoAdapter.encodeWithTag(protoWriter, 2, imageResolution.height);
        protoWriter.writeBytes(imageResolution.unknownFields());
    }
}
