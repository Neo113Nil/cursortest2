package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageInset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageInset((com.squareup.protos.cash.ui.Image) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ImageInset imageInset = (ImageInset) obj;
        reverseProtoWriter.getClass();
        imageInset.getClass();
        reverseProtoWriter.writeBytes(imageInset.unknownFields());
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, imageInset.image_asset);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, imageInset.asset_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageInset imageInset = (ImageInset) obj;
        imageInset.getClass();
        return com.squareup.protos.cash.ui.Image.ADAPTER.encodedSizeWithTag(2, imageInset.image_asset) + ProtoAdapter.STRING.encodedSizeWithTag(1, imageInset.asset_url) + imageInset.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageInset imageInset = (ImageInset) obj;
        imageInset.getClass();
        com.squareup.protos.cash.ui.Image image = imageInset.image_asset;
        com.squareup.protos.cash.ui.Image image2 = image != null ? (com.squareup.protos.cash.ui.Image) com.squareup.protos.cash.ui.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = imageInset.asset_url;
        byteString.getClass();
        return new ImageInset(image2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageInset imageInset = (ImageInset) obj;
        imageInset.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageInset.asset_url);
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(protoWriter, 2, imageInset.image_asset);
        protoWriter.writeBytes(imageInset.unknownFields());
    }
}
