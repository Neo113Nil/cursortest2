package com.squareup.protos.cash.contacts.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageExifData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageExifData((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageExifData imageExifData = (ImageExifData) obj;
        reverseProtoWriter.getClass();
        imageExifData.getClass();
        reverseProtoWriter.writeBytes(imageExifData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, imageExifData.raw_json);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageExifData imageExifData = (ImageExifData) obj;
        imageExifData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, imageExifData.raw_json) + imageExifData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageExifData imageExifData = (ImageExifData) obj;
        imageExifData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = imageExifData.raw_json;
        byteString.getClass();
        return new ImageExifData(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageExifData imageExifData = (ImageExifData) obj;
        imageExifData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageExifData.raw_json);
        protoWriter.writeBytes(imageExifData.unknownFields());
    }
}
