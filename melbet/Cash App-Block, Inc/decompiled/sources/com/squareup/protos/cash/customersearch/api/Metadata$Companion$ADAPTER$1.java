package com.squareup.protos.cash.customersearch.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Metadata$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Integer num;
        Boolean bool;
        String str;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        Integer num2 = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        Metadata.EntityType entityType = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Metadata.OfferType offerType = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Metadata(str2, num2, bool2, m, str3, str4, entityType, str5, str6, arrayList, str7, str8, str9, offerType, str10, str11, str12, str13, bool3, bool4, bool5, bool6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    num2 = ProtoAdapter.INT32.decode(protoReader);
                    decode = str2;
                    break;
                case 3:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 4:
                    num = num2;
                    bool = bool2;
                    str = str3;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str2;
                    num2 = num;
                    bool2 = bool;
                    str3 = str;
                    break;
                case 5:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 6:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 7:
                    num = num2;
                    bool = bool2;
                    str = str3;
                    try {
                        entityType = Metadata.EntityType.ADAPTER.decode(protoReader);
                        num2 = num;
                        bool2 = bool;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 9:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 10:
                    num = num2;
                    bool = bool2;
                    str = str3;
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str2;
                    num2 = num;
                    bool2 = bool;
                    str3 = str;
                    break;
                case 11:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 12:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 13:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 14:
                    try {
                        offerType = Metadata.OfferType.ADAPTER.decode(protoReader);
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        num = num2;
                        bool = bool2;
                        str = str3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 15:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 16:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 17:
                    str12 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 18:
                    str13 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 19:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 20:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 21:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 22:
                    bool6 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    num = num2;
                    bool = bool2;
                    str = str3;
                    decode = str2;
                    num2 = num;
                    bool2 = bool;
                    str3 = str;
                    break;
            }
            str2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Metadata metadata = (Metadata) obj;
        reverseProtoWriter.getClass();
        metadata.getClass();
        reverseProtoWriter.writeBytes(metadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, metadata.is_first_linked_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, metadata.is_multiple_account_holder);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, metadata.is_c4b_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, metadata.is_linked_account);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, metadata.stock_ticker);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, metadata.offer_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, metadata.app_feature_client_route);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, metadata.app_feature_name);
        Metadata.OfferType.ADAPTER.encodeWithTag(reverseProtoWriter, 14, metadata.offer_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, metadata.business_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, metadata.business_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, metadata.entity_name);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 10, metadata.merchant_tags);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, metadata.entity_attributes);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, metadata.entity_token);
        Metadata.EntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, metadata.entity_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, metadata.query_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, metadata.search_text);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, metadata.match_fields);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, metadata.is_cash_customer);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, metadata.match_length);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, metadata.model_version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Metadata metadata = (Metadata) obj;
        metadata.getClass();
        int size$okio = metadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, metadata.match_length) + protoAdapter.encodedSizeWithTag(1, metadata.model_version) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(22, metadata.is_first_linked_account) + protoAdapter2.encodedSizeWithTag(21, metadata.is_multiple_account_holder) + protoAdapter2.encodedSizeWithTag(20, metadata.is_c4b_account) + protoAdapter2.encodedSizeWithTag(19, metadata.is_linked_account) + protoAdapter.encodedSizeWithTag(18, metadata.stock_ticker) + protoAdapter.encodedSizeWithTag(17, metadata.offer_id) + protoAdapter.encodedSizeWithTag(16, metadata.app_feature_client_route) + protoAdapter.encodedSizeWithTag(15, metadata.app_feature_name) + Metadata.OfferType.ADAPTER.encodedSizeWithTag(14, metadata.offer_type) + protoAdapter.encodedSizeWithTag(13, metadata.business_name) + protoAdapter.encodedSizeWithTag(12, metadata.business_token) + protoAdapter.encodedSizeWithTag(11, metadata.entity_name) + protoAdapter.asRepeated().encodedSizeWithTag(10, metadata.merchant_tags) + protoAdapter.encodedSizeWithTag(9, metadata.entity_attributes) + protoAdapter.encodedSizeWithTag(8, metadata.entity_token) + Metadata.EntityType.ADAPTER.encodedSizeWithTag(7, metadata.entity_type) + protoAdapter.encodedSizeWithTag(6, metadata.query_token) + protoAdapter.encodedSizeWithTag(5, metadata.search_text) + protoAdapter.asRepeated().encodedSizeWithTag(4, metadata.match_fields) + protoAdapter2.encodedSizeWithTag(3, metadata.is_cash_customer) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Metadata metadata = (Metadata) obj;
        metadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = metadata.match_length;
        Boolean bool = metadata.is_cash_customer;
        List list = metadata.match_fields;
        String str = metadata.query_token;
        Metadata.EntityType entityType = metadata.entity_type;
        String str2 = metadata.entity_token;
        String str3 = metadata.entity_attributes;
        List list2 = metadata.merchant_tags;
        String str4 = metadata.entity_name;
        String str5 = metadata.business_token;
        String str6 = metadata.business_name;
        Metadata.OfferType offerType = metadata.offer_type;
        String str7 = metadata.app_feature_name;
        String str8 = metadata.app_feature_client_route;
        String str9 = metadata.offer_id;
        String str10 = metadata.stock_ticker;
        Boolean bool2 = metadata.is_linked_account;
        Boolean bool3 = metadata.is_c4b_account;
        Boolean bool4 = metadata.is_multiple_account_holder;
        Boolean bool5 = metadata.is_first_linked_account;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new Metadata(null, num, bool, list, null, str, entityType, str2, str3, list2, str4, str5, str6, offerType, str7, str8, str9, str10, bool2, bool3, bool4, bool5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Metadata metadata = (Metadata) obj;
        metadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, metadata.model_version);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, metadata.match_length);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, metadata.is_cash_customer);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, metadata.match_fields);
        protoAdapter.encodeWithTag(protoWriter, 5, metadata.search_text);
        protoAdapter.encodeWithTag(protoWriter, 6, metadata.query_token);
        Metadata.EntityType.ADAPTER.encodeWithTag(protoWriter, 7, metadata.entity_type);
        protoAdapter.encodeWithTag(protoWriter, 8, metadata.entity_token);
        protoAdapter.encodeWithTag(protoWriter, 9, metadata.entity_attributes);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, metadata.merchant_tags);
        protoAdapter.encodeWithTag(protoWriter, 11, metadata.entity_name);
        protoAdapter.encodeWithTag(protoWriter, 12, metadata.business_token);
        protoAdapter.encodeWithTag(protoWriter, 13, metadata.business_name);
        Metadata.OfferType.ADAPTER.encodeWithTag(protoWriter, 14, metadata.offer_type);
        protoAdapter.encodeWithTag(protoWriter, 15, metadata.app_feature_name);
        protoAdapter.encodeWithTag(protoWriter, 16, metadata.app_feature_client_route);
        protoAdapter.encodeWithTag(protoWriter, 17, metadata.offer_id);
        protoAdapter.encodeWithTag(protoWriter, 18, metadata.stock_ticker);
        protoAdapter2.encodeWithTag(protoWriter, 19, metadata.is_linked_account);
        protoAdapter2.encodeWithTag(protoWriter, 20, metadata.is_c4b_account);
        protoAdapter2.encodeWithTag(protoWriter, 21, metadata.is_multiple_account_holder);
        protoAdapter2.encodeWithTag(protoWriter, 22, metadata.is_first_linked_account);
        protoWriter.writeBytes(metadata.unknownFields());
    }
}
