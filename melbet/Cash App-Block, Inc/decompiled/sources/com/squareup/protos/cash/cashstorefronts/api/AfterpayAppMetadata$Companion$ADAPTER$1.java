package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayAppMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002c. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
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
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj20 = obj3;
            if (nextTag == -1) {
                return new AfterpayAppMetadata((String) obj2, (String) obj20, (String) obj4, (String) obj5, (String) obj6, (Boolean) obj7, (String) obj8, (Long) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (String) obj14, (String) obj15, (String) obj16, (Boolean) obj17, (String) obj18, (Long) obj19, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 6:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 7:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 8:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 9:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 10:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 11:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 12:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 13:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 14:
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 15:
                    obj16 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 16:
                    obj17 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 17:
                    obj18 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                case 18:
                    obj19 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj20;
                    obj = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj20;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppMetadata afterpayAppMetadata = (AfterpayAppMetadata) obj;
        reverseProtoWriter.getClass();
        afterpayAppMetadata.getClass();
        reverseProtoWriter.writeBytes(afterpayAppMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, afterpayAppMetadata.last_url_validation_time);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, afterpayAppMetadata.invalid_url_reason);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, afterpayAppMetadata.has_locations);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, afterpayAppMetadata.landing_page_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, afterpayAppMetadata.location_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, afterpayAppMetadata.banner_image_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, afterpayAppMetadata.background_color);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, afterpayAppMetadata.store_short_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, afterpayAppMetadata.avatar_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, afterpayAppMetadata.merchant_outbound_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, afterpayAppMetadata.last_outbound_count);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, afterpayAppMetadata.new_logo_url);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, afterpayAppMetadata.in_store_only);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, afterpayAppMetadata.logo_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, afterpayAppMetadata.main_image_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, afterpayAppMetadata.merchant_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, afterpayAppMetadata.shop_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, afterpayAppMetadata.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppMetadata afterpayAppMetadata = (AfterpayAppMetadata) obj;
        afterpayAppMetadata.getClass();
        int size$okio = afterpayAppMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, afterpayAppMetadata.logo_url) + protoAdapter.encodedSizeWithTag(4, afterpayAppMetadata.main_image_url) + protoAdapter.encodedSizeWithTag(3, afterpayAppMetadata.merchant_id) + protoAdapter.encodedSizeWithTag(2, afterpayAppMetadata.shop_url) + protoAdapter.encodedSizeWithTag(1, afterpayAppMetadata.name) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, afterpayAppMetadata.new_logo_url) + protoAdapter2.encodedSizeWithTag(6, afterpayAppMetadata.in_store_only) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter3.encodedSizeWithTag(18, afterpayAppMetadata.last_url_validation_time) + protoAdapter.encodedSizeWithTag(17, afterpayAppMetadata.invalid_url_reason) + protoAdapter2.encodedSizeWithTag(16, afterpayAppMetadata.has_locations) + protoAdapter.encodedSizeWithTag(15, afterpayAppMetadata.landing_page_url) + protoAdapter.encodedSizeWithTag(14, afterpayAppMetadata.location_url) + protoAdapter.encodedSizeWithTag(13, afterpayAppMetadata.banner_image_url) + protoAdapter.encodedSizeWithTag(12, afterpayAppMetadata.background_color) + protoAdapter.encodedSizeWithTag(11, afterpayAppMetadata.store_short_name) + protoAdapter.encodedSizeWithTag(10, afterpayAppMetadata.avatar_url) + protoAdapter.encodedSizeWithTag(9, afterpayAppMetadata.merchant_outbound_url) + protoAdapter3.encodedSizeWithTag(8, afterpayAppMetadata.last_outbound_count) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppMetadata afterpayAppMetadata = (AfterpayAppMetadata) obj;
        afterpayAppMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = afterpayAppMetadata.name;
        String str2 = afterpayAppMetadata.shop_url;
        String str3 = afterpayAppMetadata.merchant_id;
        String str4 = afterpayAppMetadata.main_image_url;
        String str5 = afterpayAppMetadata.logo_url;
        Boolean bool = afterpayAppMetadata.in_store_only;
        String str6 = afterpayAppMetadata.new_logo_url;
        Long l = afterpayAppMetadata.last_outbound_count;
        String str7 = afterpayAppMetadata.merchant_outbound_url;
        String str8 = afterpayAppMetadata.avatar_url;
        String str9 = afterpayAppMetadata.store_short_name;
        String str10 = afterpayAppMetadata.background_color;
        String str11 = afterpayAppMetadata.banner_image_url;
        String str12 = afterpayAppMetadata.location_url;
        String str13 = afterpayAppMetadata.landing_page_url;
        Boolean bool2 = afterpayAppMetadata.has_locations;
        String str14 = afterpayAppMetadata.invalid_url_reason;
        Long l2 = afterpayAppMetadata.last_url_validation_time;
        byteString.getClass();
        return new AfterpayAppMetadata(str, str2, str3, str4, str5, bool, str6, l, str7, str8, str9, str10, str11, str12, str13, bool2, str14, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppMetadata afterpayAppMetadata = (AfterpayAppMetadata) obj;
        afterpayAppMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, afterpayAppMetadata.name);
        protoAdapter.encodeWithTag(protoWriter, 2, afterpayAppMetadata.shop_url);
        protoAdapter.encodeWithTag(protoWriter, 3, afterpayAppMetadata.merchant_id);
        protoAdapter.encodeWithTag(protoWriter, 4, afterpayAppMetadata.main_image_url);
        protoAdapter.encodeWithTag(protoWriter, 5, afterpayAppMetadata.logo_url);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, afterpayAppMetadata.in_store_only);
        protoAdapter.encodeWithTag(protoWriter, 7, afterpayAppMetadata.new_logo_url);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 8, afterpayAppMetadata.last_outbound_count);
        protoAdapter.encodeWithTag(protoWriter, 9, afterpayAppMetadata.merchant_outbound_url);
        protoAdapter.encodeWithTag(protoWriter, 10, afterpayAppMetadata.avatar_url);
        protoAdapter.encodeWithTag(protoWriter, 11, afterpayAppMetadata.store_short_name);
        protoAdapter.encodeWithTag(protoWriter, 12, afterpayAppMetadata.background_color);
        protoAdapter.encodeWithTag(protoWriter, 13, afterpayAppMetadata.banner_image_url);
        protoAdapter.encodeWithTag(protoWriter, 14, afterpayAppMetadata.location_url);
        protoAdapter.encodeWithTag(protoWriter, 15, afterpayAppMetadata.landing_page_url);
        protoAdapter2.encodeWithTag(protoWriter, 16, afterpayAppMetadata.has_locations);
        protoAdapter.encodeWithTag(protoWriter, 17, afterpayAppMetadata.invalid_url_reason);
        protoAdapter3.encodeWithTag(protoWriter, 18, afterpayAppMetadata.last_url_validation_time);
        protoWriter.writeBytes(afterpayAppMetadata.unknownFields());
    }
}
