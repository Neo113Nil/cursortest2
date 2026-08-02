package com.squareup.protos.cash.weaver.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.weaver.api.GetRecommendationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetRecommendationsResponse$RecommendationItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRecommendationsResponse.RecommendationItem((String) obj, (Double) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (Boolean) obj6, (Long) obj7, (ApStoreList) obj8, getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 9) {
                obj8 = TransactorKt.decodeMessageOrMerge(ApStoreList.ADAPTER, protoReader, obj8);
            } else if (nextTag != 102) {
                switch (nextTag) {
                    case 1:
                        obj = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 3:
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        obj5 = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 6:
                        obj6 = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        obj7 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = new GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata((PromoterMessagingMetadata) PromoterMessagingMetadata.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRecommendationsResponse.RecommendationItem recommendationItem = (GetRecommendationsResponse.RecommendationItem) obj;
        reverseProtoWriter.getClass();
        recommendationItem.getClass();
        reverseProtoWriter.writeBytes(recommendationItem.unknownFields());
        GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = recommendationItem.item_metadata;
        if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null) {
            PromoterMessagingMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 102, getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata.getValue());
        } else if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ApStoreList.ADAPTER.encodeWithTag(reverseProtoWriter, 9, recommendationItem.item_store_list);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, recommendationItem.item_store_id);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, recommendationItem.is_post_processing_overridden);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, recommendationItem.is_missing_ml_result);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, recommendationItem.predicted_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, recommendationItem.recommendation_id);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, recommendationItem.score);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, recommendationItem.item_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRecommendationsResponse.RecommendationItem recommendationItem = (GetRecommendationsResponse.RecommendationItem) obj;
        recommendationItem.getClass();
        int size$okio = recommendationItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, recommendationItem.predicted_at) + protoAdapter.encodedSizeWithTag(3, recommendationItem.recommendation_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, recommendationItem.score) + protoAdapter.encodedSizeWithTag(1, recommendationItem.item_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = ApStoreList.ADAPTER.encodedSizeWithTag(9, recommendationItem.item_store_list) + ProtoAdapter.INT64.encodedSizeWithTag(7, recommendationItem.item_store_id) + protoAdapter2.encodedSizeWithTag(6, recommendationItem.is_post_processing_overridden) + protoAdapter2.encodedSizeWithTag(5, recommendationItem.is_missing_ml_result) + encodedSizeWithTag;
        GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = recommendationItem.item_metadata;
        if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null) {
            return PromoterMessagingMetadata.ADAPTER.encodedSizeWithTag(102, getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata.getValue()) + encodedSizeWithTag2;
        }
        if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata == null) {
            return encodedSizeWithTag2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRecommendationsResponse.RecommendationItem recommendationItem = (GetRecommendationsResponse.RecommendationItem) obj;
        recommendationItem.getClass();
        ApStoreList apStoreList = recommendationItem.item_store_list;
        ApStoreList apStoreList2 = apStoreList != null ? (ApStoreList) ApStoreList.ADAPTER.redact(apStoreList) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recommendationItem.item_id;
        Double d = recommendationItem.score;
        String str2 = recommendationItem.recommendation_id;
        String str3 = recommendationItem.predicted_at;
        Boolean bool = recommendationItem.is_missing_ml_result;
        Boolean bool2 = recommendationItem.is_post_processing_overridden;
        Long l = recommendationItem.item_store_id;
        GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = recommendationItem.item_metadata;
        byteString.getClass();
        return new GetRecommendationsResponse.RecommendationItem(str, d, str2, str3, bool, bool2, l, apStoreList2, getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRecommendationsResponse.RecommendationItem recommendationItem = (GetRecommendationsResponse.RecommendationItem) obj;
        recommendationItem.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recommendationItem.item_id);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, recommendationItem.score);
        protoAdapter.encodeWithTag(protoWriter, 3, recommendationItem.recommendation_id);
        protoAdapter.encodeWithTag(protoWriter, 4, recommendationItem.predicted_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, recommendationItem.is_missing_ml_result);
        protoAdapter2.encodeWithTag(protoWriter, 6, recommendationItem.is_post_processing_overridden);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, recommendationItem.item_store_id);
        ApStoreList.ADAPTER.encodeWithTag(protoWriter, 9, recommendationItem.item_store_list);
        GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = recommendationItem.item_metadata;
        if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null) {
            PromoterMessagingMetadata.ADAPTER.encodeWithTag(protoWriter, 102, getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata.getValue());
        } else if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(recommendationItem.unknownFields());
    }
}
