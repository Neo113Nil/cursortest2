package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$BrandCarousel$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.BrandCarousel((LocalBrand) obj, (String) obj2, m, (String) obj3, (LocalLocationSummary) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalBrand.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    m.add(GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalLocationSummary.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel brandCarousel = (GetEditorialResponse.EditorialContent.BrandCarousel) obj;
        reverseProtoWriter.getClass();
        brandCarousel.getClass();
        reverseProtoWriter.writeBytes(brandCarousel.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, brandCarousel.share_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, brandCarousel.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, brandCarousel.brand_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, brandCarousel.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, brandCarousel.category);
        LocalLocationSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 5, brandCarousel.location);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, brandCarousel.name);
        GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, brandCarousel.carousel_images);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, brandCarousel.brand_profile_url);
        LocalBrand.ADAPTER.encodeWithTag(reverseProtoWriter, 1, brandCarousel.brand);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel brandCarousel = (GetEditorialResponse.EditorialContent.BrandCarousel) obj;
        brandCarousel.getClass();
        int encodedSizeWithTag = LocalBrand.ADAPTER.encodedSizeWithTag(1, brandCarousel.brand) + brandCarousel.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(10, brandCarousel.share_url) + protoAdapter.encodedSizeWithTag(9, brandCarousel.location_token) + protoAdapter.encodedSizeWithTag(8, brandCarousel.brand_token) + protoAdapter.encodedSizeWithTag(7, brandCarousel.description) + protoAdapter.encodedSizeWithTag(6, brandCarousel.category) + LocalLocationSummary.ADAPTER.encodedSizeWithTag(5, brandCarousel.location) + protoAdapter.encodedSizeWithTag(4, brandCarousel.name) + GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage.ADAPTER.asRepeated().encodedSizeWithTag(3, brandCarousel.carousel_images) + protoAdapter.encodedSizeWithTag(2, brandCarousel.brand_profile_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel brandCarousel = (GetEditorialResponse.EditorialContent.BrandCarousel) obj;
        brandCarousel.getClass();
        LocalBrand localBrand = brandCarousel.brand;
        LocalBrand localBrand2 = localBrand != null ? (LocalBrand) LocalBrand.ADAPTER.redact(localBrand) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(brandCarousel.carousel_images, GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage.ADAPTER);
        LocalLocationSummary localLocationSummary = brandCarousel.location;
        LocalLocationSummary localLocationSummary2 = localLocationSummary != null ? (LocalLocationSummary) LocalLocationSummary.ADAPTER.redact(localLocationSummary) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = brandCarousel.brand_profile_url;
        String str2 = brandCarousel.name;
        String str3 = brandCarousel.category;
        String str4 = brandCarousel.description;
        String str5 = brandCarousel.brand_token;
        String str6 = brandCarousel.location_token;
        String str7 = brandCarousel.share_url;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.BrandCarousel(localBrand2, str, m1169redactElements, str2, localLocationSummary2, str3, str4, str5, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.BrandCarousel brandCarousel = (GetEditorialResponse.EditorialContent.BrandCarousel) obj;
        brandCarousel.getClass();
        LocalBrand.ADAPTER.encodeWithTag(protoWriter, 1, brandCarousel.brand);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, brandCarousel.brand_profile_url);
        GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, brandCarousel.carousel_images);
        protoAdapter.encodeWithTag(protoWriter, 4, brandCarousel.name);
        LocalLocationSummary.ADAPTER.encodeWithTag(protoWriter, 5, brandCarousel.location);
        protoAdapter.encodeWithTag(protoWriter, 6, brandCarousel.category);
        protoAdapter.encodeWithTag(protoWriter, 7, brandCarousel.description);
        protoAdapter.encodeWithTag(protoWriter, 8, brandCarousel.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 9, brandCarousel.location_token);
        protoAdapter.encodeWithTag(protoWriter, 10, brandCarousel.share_url);
        protoWriter.writeBytes(brandCarousel.unknownFields());
    }
}
