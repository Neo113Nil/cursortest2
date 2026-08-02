package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BusinessProfile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ArrayList arrayList6 = arrayList2;
                Object obj22 = obj7;
                Object obj23 = obj8;
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                Object obj24 = obj18;
                String str = (String) obj4;
                if (str != null) {
                    return new BusinessProfile(str, (String) obj21, (Status) obj5, (Image) obj6, m, (String) obj22, arrayList6, arrayList3, arrayList4, (String) obj23, (BusinessMetadata) obj3, (TargetApp) obj9, (String) obj10, (String) obj11, (Long) obj12, (Long) obj13, (String) obj14, (String) obj15, (String) obj16, (String) obj17, (String) obj24, (String) obj19, (String) obj20, arrayList5, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj4, "token");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    arrayList = arrayList2;
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = arrayList2;
                    obj21 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 13:
                case 17:
                case 18:
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 5:
                    arrayList = arrayList2;
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 9:
                    arrayList = arrayList2;
                    obj20 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    try {
                        obj5 = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 11:
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 12:
                    arrayList = arrayList2;
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 14:
                    arrayList = arrayList2;
                    obj6 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj6);
                    break;
                case 15:
                    arrayList = arrayList2;
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 16:
                    arrayList = arrayList2;
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 19:
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    arrayList3.add(ImageAsset.ADAPTER.decode(protoReader));
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 20:
                    arrayList = arrayList2;
                    obj16 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 21:
                    arrayList = arrayList2;
                    obj18 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 22:
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    arrayList5.add(BusinessStatus.ADAPTER.decode(protoReader));
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 23:
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    try {
                        Feature.ADAPTER.tryDecode(protoReader, arrayList4);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 24:
                    arrayList = arrayList2;
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 25:
                    arrayList = arrayList2;
                    obj3 = TransactorKt.decodeMessageOrMerge(BusinessMetadata.ADAPTER, protoReader, obj3);
                    break;
                case 26:
                    try {
                        obj9 = TargetApp.ADAPTER.decode(protoReader);
                        arrayList = arrayList2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        arrayList = arrayList2;
                        obj = obj7;
                        obj2 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 27:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 28:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 29:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 30:
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList2;
                    obj = obj7;
                    obj2 = obj8;
                    obj7 = obj;
                    obj8 = obj2;
                    break;
                case 31:
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 32:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList2;
                    break;
            }
            arrayList2 = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessProfile businessProfile = (BusinessProfile) obj;
        reverseProtoWriter.getClass();
        businessProfile.getClass();
        reverseProtoWriter.writeBytes(businessProfile.unknownFields());
        BusinessStatus.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 22, businessProfile.business_statuses);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, businessProfile.affiliate_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 32, businessProfile.square_merchant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, businessProfile.afterpay_merchant_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 31, businessProfile.bizzy_brand_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, businessProfile.bizzy_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, businessProfile.merchantein_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, businessProfile.afterpay_store_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 29, businessProfile.external_created_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, businessProfile.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 28, businessProfile.locale);
        protoAdapter.encodeWithTag(reverseProtoWriter, 27, businessProfile.region);
        TargetApp.ADAPTER.encodeWithTag(reverseProtoWriter, 26, businessProfile.target_app);
        BusinessMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 25, businessProfile.business_metadata);
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, businessProfile.website_url);
        Feature.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 23, businessProfile.features);
        ImageAsset.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 19, businessProfile.image_assets);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 30, businessProfile.categories);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, businessProfile.canonical_category);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 11, businessProfile.tags);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 14, businessProfile.logo);
        Status.ADAPTER.encodeWithTag(reverseProtoWriter, 10, businessProfile.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, businessProfile.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, businessProfile.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessProfile businessProfile = (BusinessProfile) obj;
        businessProfile.getClass();
        int size$okio = businessProfile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(28, businessProfile.locale) + protoAdapter.encodedSizeWithTag(27, businessProfile.region) + TargetApp.ADAPTER.encodedSizeWithTag(26, businessProfile.target_app) + BusinessMetadata.ADAPTER.encodedSizeWithTag(25, businessProfile.business_metadata) + protoAdapter.encodedSizeWithTag(24, businessProfile.website_url) + Feature.ADAPTER.asRepeated().encodedSizeWithTag(23, businessProfile.features) + ImageAsset.ADAPTER.asRepeated().encodedSizeWithTag(19, businessProfile.image_assets) + protoAdapter.asRepeated().encodedSizeWithTag(30, businessProfile.categories) + protoAdapter.encodedSizeWithTag(16, businessProfile.canonical_category) + protoAdapter.asRepeated().encodedSizeWithTag(11, businessProfile.tags) + Image.ADAPTER.encodedSizeWithTag(14, businessProfile.logo) + Status.ADAPTER.encodedSizeWithTag(10, businessProfile.status) + protoAdapter.encodedSizeWithTag(2, businessProfile.name) + protoAdapter.encodedSizeWithTag(1, businessProfile.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return BusinessStatus.ADAPTER.asRepeated().encodedSizeWithTag(22, businessProfile.business_statuses) + protoAdapter.encodedSizeWithTag(9, businessProfile.affiliate_link) + protoAdapter.encodedSizeWithTag(32, businessProfile.square_merchant_token) + protoAdapter.encodedSizeWithTag(21, businessProfile.afterpay_merchant_id) + protoAdapter.encodedSizeWithTag(31, businessProfile.bizzy_brand_id) + protoAdapter.encodedSizeWithTag(20, businessProfile.bizzy_token) + protoAdapter.encodedSizeWithTag(15, businessProfile.merchantein_token) + protoAdapter.encodedSizeWithTag(12, businessProfile.afterpay_store_id) + protoAdapter2.encodedSizeWithTag(29, businessProfile.external_created_at) + protoAdapter2.encodedSizeWithTag(5, businessProfile.version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessProfile businessProfile = (BusinessProfile) obj;
        businessProfile.getClass();
        Image image = businessProfile.logo;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(businessProfile.image_assets, ImageAsset.ADAPTER);
        BusinessMetadata businessMetadata = businessProfile.business_metadata;
        BusinessMetadata businessMetadata2 = businessMetadata != null ? (BusinessMetadata) BusinessMetadata.ADAPTER.redact(businessMetadata) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(businessProfile.business_statuses, BusinessStatus.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = businessProfile.token;
        String str2 = businessProfile.name;
        Status status = businessProfile.status;
        List list = businessProfile.tags;
        String str3 = businessProfile.canonical_category;
        List list2 = businessProfile.categories;
        List list3 = businessProfile.features;
        String str4 = businessProfile.website_url;
        TargetApp targetApp = businessProfile.target_app;
        String str5 = businessProfile.region;
        String str6 = businessProfile.locale;
        Long l = businessProfile.version;
        Long l2 = businessProfile.external_created_at;
        String str7 = businessProfile.afterpay_store_id;
        String str8 = businessProfile.merchantein_token;
        String str9 = businessProfile.bizzy_token;
        String str10 = businessProfile.bizzy_brand_id;
        String str11 = businessProfile.afterpay_merchant_id;
        String str12 = businessProfile.square_merchant_token;
        String str13 = businessProfile.affiliate_link;
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
        return new BusinessProfile(str, str2, status, image2, list, str3, list2, m1169redactElements, list3, str4, businessMetadata2, targetApp, str5, str6, l, l2, str7, str8, str9, str10, str11, str12, str13, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessProfile businessProfile = (BusinessProfile) obj;
        businessProfile.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, businessProfile.token);
        protoAdapter.encodeWithTag(protoWriter, 2, businessProfile.name);
        Status.ADAPTER.encodeWithTag(protoWriter, 10, businessProfile.status);
        Image.ADAPTER.encodeWithTag(protoWriter, 14, businessProfile.logo);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, businessProfile.tags);
        protoAdapter.encodeWithTag(protoWriter, 16, businessProfile.canonical_category);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 30, businessProfile.categories);
        ImageAsset.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, businessProfile.image_assets);
        Feature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 23, businessProfile.features);
        protoAdapter.encodeWithTag(protoWriter, 24, businessProfile.website_url);
        BusinessMetadata.ADAPTER.encodeWithTag(protoWriter, 25, businessProfile.business_metadata);
        TargetApp.ADAPTER.encodeWithTag(protoWriter, 26, businessProfile.target_app);
        protoAdapter.encodeWithTag(protoWriter, 27, businessProfile.region);
        protoAdapter.encodeWithTag(protoWriter, 28, businessProfile.locale);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 5, businessProfile.version);
        protoAdapter2.encodeWithTag(protoWriter, 29, businessProfile.external_created_at);
        protoAdapter.encodeWithTag(protoWriter, 12, businessProfile.afterpay_store_id);
        protoAdapter.encodeWithTag(protoWriter, 15, businessProfile.merchantein_token);
        protoAdapter.encodeWithTag(protoWriter, 20, businessProfile.bizzy_token);
        protoAdapter.encodeWithTag(protoWriter, 31, businessProfile.bizzy_brand_id);
        protoAdapter.encodeWithTag(protoWriter, 21, businessProfile.afterpay_merchant_id);
        protoAdapter.encodeWithTag(protoWriter, 32, businessProfile.square_merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 9, businessProfile.affiliate_link);
        BusinessStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, businessProfile.business_statuses);
        protoWriter.writeBytes(businessProfile.unknownFields());
    }
}
