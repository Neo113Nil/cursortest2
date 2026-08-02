package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str == null) {
                    TransactorKt.missingRequiredFields(obj, "brand_token");
                    throw null;
                }
                String str2 = (String) obj2;
                if (str2 != null) {
                    return new BrandTile(str, str2, (LocalColor) obj3, (LocalColor) obj4, (LocalImage) obj5, (String) obj7, (LocalColor) obj6, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj2, "name");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrandTile brandTile = (BrandTile) obj;
        reverseProtoWriter.getClass();
        brandTile.getClass();
        reverseProtoWriter.writeBytes(brandTile.unknownFields());
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, brandTile.brand_card_outline_color);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, brandTile.brand_tile_client_route);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 5, brandTile.artwork_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, brandTile.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, brandTile.foreground_color);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, brandTile.name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, brandTile.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrandTile brandTile = (BrandTile) obj;
        brandTile.getClass();
        int size$okio = brandTile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, brandTile.name) + protoAdapter.encodedSizeWithTag(1, brandTile.brand_token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, brandTile.brand_card_outline_color) + protoAdapter.encodedSizeWithTag(6, brandTile.brand_tile_client_route) + LocalImage.ADAPTER.encodedSizeWithTag(5, brandTile.artwork_image) + protoAdapter2.encodedSizeWithTag(4, brandTile.background_color) + protoAdapter2.encodedSizeWithTag(3, brandTile.foreground_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrandTile brandTile = (BrandTile) obj;
        brandTile.getClass();
        LocalColor localColor = brandTile.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = brandTile.background_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalImage localImage = brandTile.artwork_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalColor localColor5 = brandTile.brand_card_outline_color;
        LocalColor localColor6 = localColor5 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = brandTile.brand_token;
        String str2 = brandTile.name;
        String str3 = brandTile.brand_tile_client_route;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new BrandTile(str, str2, localColor2, localColor4, localImage2, str3, localColor6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrandTile brandTile = (BrandTile) obj;
        brandTile.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, brandTile.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, brandTile.name);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, brandTile.foreground_color);
        protoAdapter2.encodeWithTag(protoWriter, 4, brandTile.background_color);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 5, brandTile.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 6, brandTile.brand_tile_client_route);
        protoAdapter2.encodeWithTag(protoWriter, 7, brandTile.brand_card_outline_color);
        protoWriter.writeBytes(brandTile.unknownFields());
    }
}
