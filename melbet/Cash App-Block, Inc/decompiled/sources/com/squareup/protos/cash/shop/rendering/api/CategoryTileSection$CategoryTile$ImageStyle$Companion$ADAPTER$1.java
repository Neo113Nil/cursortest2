package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CategoryTileSection$CategoryTile$ImageStyle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CategoryTileSection.CategoryTile.ImageStyle((Image) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CategoryTileSection.CategoryTile.ImageStyle imageStyle = (CategoryTileSection.CategoryTile.ImageStyle) obj;
        reverseProtoWriter.getClass();
        imageStyle.getClass();
        reverseProtoWriter.writeBytes(imageStyle.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, imageStyle.background_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CategoryTileSection.CategoryTile.ImageStyle imageStyle = (CategoryTileSection.CategoryTile.ImageStyle) obj;
        imageStyle.getClass();
        return Image.ADAPTER.encodedSizeWithTag(1, imageStyle.background_image) + imageStyle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CategoryTileSection.CategoryTile.ImageStyle imageStyle = (CategoryTileSection.CategoryTile.ImageStyle) obj;
        imageStyle.getClass();
        Image image = imageStyle.background_image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CategoryTileSection.CategoryTile.ImageStyle(image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CategoryTileSection.CategoryTile.ImageStyle imageStyle = (CategoryTileSection.CategoryTile.ImageStyle) obj;
        imageStyle.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, imageStyle.background_image);
        protoWriter.writeBytes(imageStyle.unknownFields());
    }
}
