package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CategoryTileSection$CategoryTile$IconStyle$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CategoryTileSection.CategoryTile.IconStyle((Icon) obj, (Image) obj2, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CategoryTileSection.CategoryTile.IconStyle iconStyle = (CategoryTileSection.CategoryTile.IconStyle) obj;
        reverseProtoWriter.getClass();
        iconStyle.getClass();
        reverseProtoWriter.writeBytes(iconStyle.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, iconStyle.background_color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, iconStyle.icon);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, iconStyle.arcade_icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CategoryTileSection.CategoryTile.IconStyle iconStyle = (CategoryTileSection.CategoryTile.IconStyle) obj;
        iconStyle.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, iconStyle.background_color) + Image.ADAPTER.encodedSizeWithTag(1, iconStyle.icon) + Icon.ADAPTER.encodedSizeWithTag(3, iconStyle.arcade_icon) + iconStyle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CategoryTileSection.CategoryTile.IconStyle iconStyle = (CategoryTileSection.CategoryTile.IconStyle) obj;
        iconStyle.getClass();
        Icon icon = iconStyle.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        Image image = iconStyle.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = iconStyle.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CategoryTileSection.CategoryTile.IconStyle(icon2, image2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CategoryTileSection.CategoryTile.IconStyle iconStyle = (CategoryTileSection.CategoryTile.IconStyle) obj;
        iconStyle.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 3, iconStyle.arcade_icon);
        Image.ADAPTER.encodeWithTag(protoWriter, 1, iconStyle.icon);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, iconStyle.background_color);
        protoWriter.writeBytes(iconStyle.unknownFields());
    }
}
