package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EmbeddedImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EmbeddedImage((ByteString) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmbeddedImage embeddedImage = (EmbeddedImage) obj;
        reverseProtoWriter.getClass();
        embeddedImage.getClass();
        reverseProtoWriter.writeBytes(embeddedImage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, embeddedImage.dark_mode);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, embeddedImage.light_mode);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EmbeddedImage embeddedImage = (EmbeddedImage) obj;
        embeddedImage.getClass();
        int size$okio = embeddedImage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(2, embeddedImage.dark_mode) + protoAdapter.encodedSizeWithTag(1, embeddedImage.light_mode) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EmbeddedImage embeddedImage = (EmbeddedImage) obj;
        embeddedImage.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = embeddedImage.light_mode;
        ByteString byteString3 = embeddedImage.dark_mode;
        byteString.getClass();
        return new EmbeddedImage(byteString2, byteString3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmbeddedImage embeddedImage = (EmbeddedImage) obj;
        embeddedImage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, embeddedImage.light_mode);
        protoAdapter.encodeWithTag(protoWriter, 2, embeddedImage.dark_mode);
        protoWriter.writeBytes(embeddedImage.unknownFields());
    }
}
