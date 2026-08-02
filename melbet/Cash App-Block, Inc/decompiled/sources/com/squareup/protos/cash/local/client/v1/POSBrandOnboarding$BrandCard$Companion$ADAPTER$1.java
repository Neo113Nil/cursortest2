package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSBrandOnboarding$BrandCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new POSBrandOnboarding.BrandCard((String) obj, (LocalImage) obj2, (LocalColor) obj3, (LocalColor) obj4, (LocalColor) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        POSBrandOnboarding.BrandCard brandCard = (POSBrandOnboarding.BrandCard) obj;
        reverseProtoWriter.getClass();
        brandCard.getClass();
        reverseProtoWriter.writeBytes(brandCard.unknownFields());
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, brandCard.brand_card_outline_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, brandCard.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, brandCard.foreground_color);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 2, brandCard.artwork_image);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, brandCard.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSBrandOnboarding.BrandCard brandCard = (POSBrandOnboarding.BrandCard) obj;
        brandCard.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(2, brandCard.artwork_image) + ProtoAdapter.STRING.encodedSizeWithTag(1, brandCard.name) + brandCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, brandCard.brand_card_outline_color) + protoAdapter.encodedSizeWithTag(4, brandCard.background_color) + protoAdapter.encodedSizeWithTag(3, brandCard.foreground_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSBrandOnboarding.BrandCard brandCard = (POSBrandOnboarding.BrandCard) obj;
        brandCard.getClass();
        LocalImage localImage = brandCard.artwork_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalColor localColor = brandCard.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = brandCard.background_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalColor localColor5 = brandCard.brand_card_outline_color;
        LocalColor localColor6 = localColor5 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = brandCard.name;
        byteString.getClass();
        return new POSBrandOnboarding.BrandCard(str, localImage2, localColor2, localColor4, localColor6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSBrandOnboarding.BrandCard brandCard = (POSBrandOnboarding.BrandCard) obj;
        brandCard.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, brandCard.name);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 2, brandCard.artwork_image);
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, brandCard.foreground_color);
        protoAdapter.encodeWithTag(protoWriter, 4, brandCard.background_color);
        protoAdapter.encodeWithTag(protoWriter, 5, brandCard.brand_card_outline_color);
        protoWriter.writeBytes(brandCard.unknownFields());
    }
}
