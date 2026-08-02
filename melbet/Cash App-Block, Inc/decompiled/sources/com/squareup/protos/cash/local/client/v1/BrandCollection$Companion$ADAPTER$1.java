package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandCollection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
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
                return new BrandCollection((String) obj, (String) obj2, (String) obj3, m, (BrandCollection.GeoFence) obj4, (LocalImage) obj5, (String) obj6, (String) obj7, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    m.add(BrandCollection.Location.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(BrandCollection.GeoFence.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    arrayList.add(TagDefinition.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrandCollection brandCollection = (BrandCollection) obj;
        reverseProtoWriter.getClass();
        brandCollection.getClass();
        reverseProtoWriter.writeBytes(brandCollection.unknownFields());
        TagDefinition.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, brandCollection.tag_catalog);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, brandCollection.primary_cta_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, brandCollection.primary_cta_client_route);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 6, brandCollection.masthead_image);
        BrandCollection.GeoFence.ADAPTER.encodeWithTag(reverseProtoWriter, 5, brandCollection.geo_fence);
        BrandCollection.Location.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, brandCollection.locations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, brandCollection.caption);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, brandCollection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, brandCollection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrandCollection brandCollection = (BrandCollection) obj;
        brandCollection.getClass();
        int size$okio = brandCollection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return TagDefinition.ADAPTER.asRepeated().encodedSizeWithTag(9, brandCollection.tag_catalog) + protoAdapter.encodedSizeWithTag(8, brandCollection.primary_cta_button_label) + protoAdapter.encodedSizeWithTag(7, brandCollection.primary_cta_client_route) + LocalImage.ADAPTER.encodedSizeWithTag(6, brandCollection.masthead_image) + BrandCollection.GeoFence.ADAPTER.encodedSizeWithTag(5, brandCollection.geo_fence) + BrandCollection.Location.ADAPTER.asRepeated().encodedSizeWithTag(4, brandCollection.locations) + protoAdapter.encodedSizeWithTag(3, brandCollection.caption) + protoAdapter.encodedSizeWithTag(2, brandCollection.subtitle) + protoAdapter.encodedSizeWithTag(1, brandCollection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrandCollection brandCollection = (BrandCollection) obj;
        brandCollection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(brandCollection.locations, BrandCollection.Location.ADAPTER);
        BrandCollection.GeoFence geoFence = brandCollection.geo_fence;
        BrandCollection.GeoFence geoFence2 = geoFence != null ? (BrandCollection.GeoFence) BrandCollection.GeoFence.ADAPTER.redact(geoFence) : null;
        LocalImage localImage = brandCollection.masthead_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(brandCollection.tag_catalog, TagDefinition.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = brandCollection.title;
        String str2 = brandCollection.subtitle;
        String str3 = brandCollection.caption;
        String str4 = brandCollection.primary_cta_client_route;
        String str5 = brandCollection.primary_cta_button_label;
        byteString.getClass();
        return new BrandCollection(str, str2, str3, m1169redactElements, geoFence2, localImage2, str4, str5, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrandCollection brandCollection = (BrandCollection) obj;
        brandCollection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, brandCollection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, brandCollection.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, brandCollection.caption);
        BrandCollection.Location.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, brandCollection.locations);
        BrandCollection.GeoFence.ADAPTER.encodeWithTag(protoWriter, 5, brandCollection.geo_fence);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 6, brandCollection.masthead_image);
        protoAdapter.encodeWithTag(protoWriter, 7, brandCollection.primary_cta_client_route);
        protoAdapter.encodeWithTag(protoWriter, 8, brandCollection.primary_cta_button_label);
        TagDefinition.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, brandCollection.tag_catalog);
        protoWriter.writeBytes(brandCollection.unknownFields());
    }
}
