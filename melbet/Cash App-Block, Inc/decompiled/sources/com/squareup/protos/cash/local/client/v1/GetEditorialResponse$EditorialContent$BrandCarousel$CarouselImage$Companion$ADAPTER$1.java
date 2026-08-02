package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$BrandCarousel$CarouselImage$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage((LocalImage) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage carouselImage = (GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage) obj;
        reverseProtoWriter.getClass();
        carouselImage.getClass();
        reverseProtoWriter.writeBytes(carouselImage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, carouselImage.overlay_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, carouselImage.client_route_url);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, carouselImage.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage carouselImage = (GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage) obj;
        carouselImage.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(1, carouselImage.image) + carouselImage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, carouselImage.overlay_text) + protoAdapter.encodedSizeWithTag(2, carouselImage.client_route_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage carouselImage = (GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage) obj;
        carouselImage.getClass();
        LocalImage localImage = carouselImage.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = carouselImage.client_route_url;
        String str2 = carouselImage.overlay_text;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage(localImage2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage carouselImage = (GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage) obj;
        carouselImage.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, carouselImage.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, carouselImage.client_route_url);
        protoAdapter.encodeWithTag(protoWriter, 3, carouselImage.overlay_text);
        protoWriter.writeBytes(carouselImage.unknownFields());
    }
}
