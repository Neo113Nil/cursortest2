package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AnalyticsMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AnalyticsMetadata((String) obj, (String) obj2, (AnalyticsMetadata.EntityType) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = AnalyticsMetadata.EntityType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnalyticsMetadata analyticsMetadata = (AnalyticsMetadata) obj;
        reverseProtoWriter.getClass();
        analyticsMetadata.getClass();
        reverseProtoWriter.writeBytes(analyticsMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, analyticsMetadata.business_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, analyticsMetadata.business_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, analyticsMetadata.initial_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, analyticsMetadata.store_id);
        AnalyticsMetadata.EntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, analyticsMetadata.entity_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, analyticsMetadata.entity_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, analyticsMetadata.entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnalyticsMetadata analyticsMetadata = (AnalyticsMetadata) obj;
        analyticsMetadata.getClass();
        int size$okio = analyticsMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, analyticsMetadata.business_name) + protoAdapter.encodedSizeWithTag(6, analyticsMetadata.business_token) + protoAdapter.encodedSizeWithTag(5, analyticsMetadata.initial_url) + protoAdapter.encodedSizeWithTag(4, analyticsMetadata.store_id) + AnalyticsMetadata.EntityType.ADAPTER.encodedSizeWithTag(3, analyticsMetadata.entity_type) + protoAdapter.encodedSizeWithTag(2, analyticsMetadata.entity_name) + protoAdapter.encodedSizeWithTag(1, analyticsMetadata.entity_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AnalyticsMetadata analyticsMetadata = (AnalyticsMetadata) obj;
        analyticsMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = analyticsMetadata.entity_token;
        String str2 = analyticsMetadata.entity_name;
        AnalyticsMetadata.EntityType entityType = analyticsMetadata.entity_type;
        String str3 = analyticsMetadata.store_id;
        String str4 = analyticsMetadata.initial_url;
        String str5 = analyticsMetadata.business_token;
        String str6 = analyticsMetadata.business_name;
        byteString.getClass();
        return new AnalyticsMetadata(str, str2, entityType, str3, str4, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnalyticsMetadata analyticsMetadata = (AnalyticsMetadata) obj;
        analyticsMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, analyticsMetadata.entity_token);
        protoAdapter.encodeWithTag(protoWriter, 2, analyticsMetadata.entity_name);
        AnalyticsMetadata.EntityType.ADAPTER.encodeWithTag(protoWriter, 3, analyticsMetadata.entity_type);
        protoAdapter.encodeWithTag(protoWriter, 4, analyticsMetadata.store_id);
        protoAdapter.encodeWithTag(protoWriter, 5, analyticsMetadata.initial_url);
        protoAdapter.encodeWithTag(protoWriter, 6, analyticsMetadata.business_token);
        protoAdapter.encodeWithTag(protoWriter, 7, analyticsMetadata.business_name);
        protoWriter.writeBytes(analyticsMetadata.unknownFields());
    }
}
