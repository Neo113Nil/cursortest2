package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageFixed$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ImageFixed((String) obj, (Integer) obj2, (Integer) obj3, (com.squareup.protos.cash.ui.Image) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.ui.Image.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageFixed imageFixed = (ImageFixed) obj;
        reverseProtoWriter.getClass();
        imageFixed.getClass();
        reverseProtoWriter.writeBytes(imageFixed.unknownFields());
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, imageFixed.image_asset);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, imageFixed.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, imageFixed.width);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, imageFixed.asset_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageFixed imageFixed = (ImageFixed) obj;
        imageFixed.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, imageFixed.asset_url) + imageFixed.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return com.squareup.protos.cash.ui.Image.ADAPTER.encodedSizeWithTag(4, imageFixed.image_asset) + protoAdapter.encodedSizeWithTag(3, imageFixed.height) + protoAdapter.encodedSizeWithTag(2, imageFixed.width) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageFixed imageFixed = (ImageFixed) obj;
        imageFixed.getClass();
        com.squareup.protos.cash.ui.Image image = imageFixed.image_asset;
        com.squareup.protos.cash.ui.Image image2 = image != null ? (com.squareup.protos.cash.ui.Image) com.squareup.protos.cash.ui.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = imageFixed.asset_url;
        Integer num = imageFixed.width;
        Integer num2 = imageFixed.height;
        byteString.getClass();
        return new ImageFixed(str, num, num2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageFixed imageFixed = (ImageFixed) obj;
        imageFixed.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageFixed.asset_url);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, imageFixed.width);
        protoAdapter.encodeWithTag(protoWriter, 3, imageFixed.height);
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(protoWriter, 4, imageFixed.image_asset);
        protoWriter.writeBytes(imageFixed.unknownFields());
    }
}
