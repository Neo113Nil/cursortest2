package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandCollection$Location$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        String str6 = null;
        LocalBrand.Banner banner = null;
        String str7 = null;
        LocalOpenStatus localOpenStatus = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BrandCollection.Location((LocalColor) obj3, (LocalColor) obj4, str, str6, str7, localOpenStatus, (LocalOpenHours) obj9, (LocalAddress) obj10, str10, str2, str3, str4, num, num2, str5, (LocalColor) obj5, (LocalColor) obj6, banner, (LocalImage) obj7, (LocalImage) obj8, str8, str9, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 2:
                    arrayList = m;
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 3:
                    arrayList = m;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    arrayList = m;
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                    arrayList = m;
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 6:
                    arrayList = m;
                    obj = obj7;
                    obj2 = obj8;
                    try {
                        localOpenStatus = LocalOpenStatus.ADAPTER.decode(protoReader);
                        obj8 = obj2;
                        obj7 = obj;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    arrayList = m;
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, protoReader, obj9);
                    decode = str;
                    break;
                case 8:
                    arrayList = m;
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, protoReader, obj10);
                    decode = str;
                    break;
                case 9:
                    arrayList = m;
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    arrayList = m;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 11:
                    arrayList = m;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    arrayList = m;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    arrayList = m;
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    arrayList = m;
                    num2 = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    arrayList = m;
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 16:
                    arrayList = m;
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 17:
                    arrayList = m;
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 18:
                    try {
                        banner = LocalBrand.Banner.ADAPTER.decode(protoReader);
                        arrayList = m;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        arrayList = m;
                        obj = obj7;
                        obj2 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 19:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj7);
                    arrayList = m;
                    decode = str;
                    break;
                case 20:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj8);
                    arrayList = m;
                    decode = str;
                    break;
                case 21:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str;
                    break;
                case 22:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str;
                    break;
                case 23:
                    m.add(BrandTag.ADAPTER.decode(protoReader));
                    arrayList = m;
                    obj = obj7;
                    obj2 = obj8;
                    decode = str;
                    obj8 = obj2;
                    obj7 = obj;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    obj = obj7;
                    obj2 = obj8;
                    decode = str;
                    obj8 = obj2;
                    obj7 = obj;
                    break;
            }
            str = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrandCollection.Location location = (BrandCollection.Location) obj;
        reverseProtoWriter.getClass();
        location.getClass();
        reverseProtoWriter.writeBytes(location.unknownFields());
        BrandTag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 23, location.tags);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, location.promo_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, location.promo_tag);
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 20, location.hero_image);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 19, location.item_image);
        LocalBrand.Banner.ADAPTER.encodeWithTag(reverseProtoWriter, 18, location.banner);
        ProtoAdapter protoAdapter3 = LocalColor.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 17, location.max_heat_color);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, location.min_heat_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, location.activity_label);
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT32;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 14, location.heat_level);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 13, location.recent_order_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, location.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, location.brand_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, location.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, location.client_route);
        LocalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 8, location.address);
        LocalOpenHours.ADAPTER.encodeWithTag(reverseProtoWriter, 7, location.open_hours);
        LocalOpenStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, location.open_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, location.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, location.category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, location.artwork_image_url);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, location.foreground_color);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, location.background_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrandCollection.Location location = (BrandCollection.Location) obj;
        location.getClass();
        int size$okio = location.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, location.foreground_color) + protoAdapter.encodedSizeWithTag(1, location.background_color) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(12, location.location_token) + protoAdapter2.encodedSizeWithTag(11, location.brand_token) + protoAdapter2.encodedSizeWithTag(10, location.name) + protoAdapter2.encodedSizeWithTag(9, location.client_route) + LocalAddress.ADAPTER.encodedSizeWithTag(8, location.address) + LocalOpenHours.ADAPTER.encodedSizeWithTag(7, location.open_hours) + LocalOpenStatus.ADAPTER.encodedSizeWithTag(6, location.open_status) + protoAdapter2.encodedSizeWithTag(5, location.time_zone) + protoAdapter2.encodedSizeWithTag(4, location.category) + protoAdapter2.encodedSizeWithTag(3, location.artwork_image_url) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = LocalBrand.Banner.ADAPTER.encodedSizeWithTag(18, location.banner) + protoAdapter.encodedSizeWithTag(17, location.max_heat_color) + protoAdapter.encodedSizeWithTag(16, location.min_heat_color) + protoAdapter2.encodedSizeWithTag(15, location.activity_label) + protoAdapter3.encodedSizeWithTag(14, location.heat_level) + protoAdapter3.encodedSizeWithTag(13, location.recent_order_count) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = LocalImage.ADAPTER;
        return BrandTag.ADAPTER.asRepeated().encodedSizeWithTag(23, location.tags) + protoAdapter2.encodedSizeWithTag(22, location.promo_description) + protoAdapter2.encodedSizeWithTag(21, location.promo_tag) + protoAdapter4.encodedSizeWithTag(20, location.hero_image) + protoAdapter4.encodedSizeWithTag(19, location.item_image) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrandCollection.Location location = (BrandCollection.Location) obj;
        location.getClass();
        LocalColor localColor = location.background_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = location.foreground_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalOpenHours localOpenHours = location.open_hours;
        LocalOpenHours localOpenHours2 = localOpenHours != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours) : null;
        LocalAddress localAddress = location.address;
        LocalAddress localAddress2 = localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null;
        LocalColor localColor5 = location.min_heat_color;
        LocalColor localColor6 = localColor5 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor5) : null;
        LocalColor localColor7 = location.max_heat_color;
        LocalColor localColor8 = localColor7 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor7) : null;
        LocalImage localImage = location.item_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalImage localImage3 = location.hero_image;
        LocalImage localImage4 = localImage3 != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(location.tags, BrandTag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = location.artwork_image_url;
        String str2 = location.category;
        String str3 = location.time_zone;
        LocalOpenStatus localOpenStatus = location.open_status;
        String str4 = location.client_route;
        String str5 = location.name;
        String str6 = location.brand_token;
        String str7 = location.location_token;
        Integer num = location.recent_order_count;
        Integer num2 = location.heat_level;
        String str8 = location.activity_label;
        LocalBrand.Banner banner = location.banner;
        String str9 = location.promo_tag;
        String str10 = location.promo_description;
        byteString.getClass();
        return new BrandCollection.Location(localColor2, localColor4, str, str2, str3, localOpenStatus, localOpenHours2, localAddress2, str4, str5, str6, str7, num, num2, str8, localColor6, localColor8, banner, localImage2, localImage4, str9, str10, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrandCollection.Location location = (BrandCollection.Location) obj;
        location.getClass();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, location.background_color);
        protoAdapter.encodeWithTag(protoWriter, 2, location.foreground_color);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, location.artwork_image_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, location.category);
        protoAdapter2.encodeWithTag(protoWriter, 5, location.time_zone);
        LocalOpenStatus.ADAPTER.encodeWithTag(protoWriter, 6, location.open_status);
        LocalOpenHours.ADAPTER.encodeWithTag(protoWriter, 7, location.open_hours);
        LocalAddress.ADAPTER.encodeWithTag(protoWriter, 8, location.address);
        protoAdapter2.encodeWithTag(protoWriter, 9, location.client_route);
        protoAdapter2.encodeWithTag(protoWriter, 10, location.name);
        protoAdapter2.encodeWithTag(protoWriter, 11, location.brand_token);
        protoAdapter2.encodeWithTag(protoWriter, 12, location.location_token);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 13, location.recent_order_count);
        protoAdapter3.encodeWithTag(protoWriter, 14, location.heat_level);
        protoAdapter2.encodeWithTag(protoWriter, 15, location.activity_label);
        protoAdapter.encodeWithTag(protoWriter, 16, location.min_heat_color);
        protoAdapter.encodeWithTag(protoWriter, 17, location.max_heat_color);
        LocalBrand.Banner.ADAPTER.encodeWithTag(protoWriter, 18, location.banner);
        ProtoAdapter protoAdapter4 = LocalImage.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 19, location.item_image);
        protoAdapter4.encodeWithTag(protoWriter, 20, location.hero_image);
        protoAdapter2.encodeWithTag(protoWriter, 21, location.promo_tag);
        protoAdapter2.encodeWithTag(protoWriter, 22, location.promo_description);
        BrandTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 23, location.tags);
        protoWriter.writeBytes(location.unknownFields());
    }
}
