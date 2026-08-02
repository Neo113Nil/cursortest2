package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageFill$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageFill((com.squareup.protos.cash.ui.Image) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.ui.Image.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageFill imageFill = (ImageFill) obj;
        reverseProtoWriter.getClass();
        imageFill.getClass();
        reverseProtoWriter.writeBytes(imageFill.unknownFields());
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, imageFill.image_asset);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, imageFill.asset_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageFill imageFill = (ImageFill) obj;
        imageFill.getClass();
        return com.squareup.protos.cash.ui.Image.ADAPTER.encodedSizeWithTag(2, imageFill.image_asset) + ProtoAdapter.STRING.encodedSizeWithTag(1, imageFill.asset_url) + imageFill.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageFill imageFill = (ImageFill) obj;
        imageFill.getClass();
        com.squareup.protos.cash.ui.Image image = imageFill.image_asset;
        com.squareup.protos.cash.ui.Image image2 = image != null ? (com.squareup.protos.cash.ui.Image) com.squareup.protos.cash.ui.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = imageFill.asset_url;
        byteString.getClass();
        return new ImageFill(image2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageFill imageFill = (ImageFill) obj;
        imageFill.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageFill.asset_url);
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(protoWriter, 2, imageFill.image_asset);
        protoWriter.writeBytes(imageFill.unknownFields());
    }
}
