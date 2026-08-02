package com.squareup.protos.cash.weaver.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.weaver.api.GetRecommendationsResponse;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetRecommendationsResponse$RecommendationSet$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001e. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList arrayList;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRecommendationsResponse.RecommendationSet((RecommendationType) obj2, (String) obj3, m, (Boolean) obj4, (String) obj5, (String) obj6, arrayList2, (Boolean) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj2 = RecommendationType.ADAPTER.decode(protoReader);
                        arrayList = m;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 3:
                    m.add(GetRecommendationsResponse.RecommendationItem.ADAPTER.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    obj2 = obj;
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 7:
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    obj2 = obj;
                    break;
                case 8:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    arrayList = m;
                    obj2 = obj;
                    break;
            }
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRecommendationsResponse.RecommendationSet recommendationSet = (GetRecommendationsResponse.RecommendationSet) obj;
        reverseProtoWriter.getClass();
        recommendationSet.getClass();
        reverseProtoWriter.writeBytes(recommendationSet.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, recommendationSet.generic_recommendation_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, recommendationSet.eligible_for_personalization);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 7, recommendationSet.retriever_input_names);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, recommendationSet.variation_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, recommendationSet.source_entity_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, recommendationSet.is_default_set);
        GetRecommendationsResponse.RecommendationItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, recommendationSet.recommendation_items);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recommendationSet.model_version);
        RecommendationType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, recommendationSet.recommendation_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRecommendationsResponse.RecommendationSet recommendationSet = (GetRecommendationsResponse.RecommendationSet) obj;
        recommendationSet.getClass();
        int encodedSizeWithTag = RecommendationType.ADAPTER.encodedSizeWithTag(1, recommendationSet.recommendation_type) + recommendationSet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = GetRecommendationsResponse.RecommendationItem.ADAPTER.asRepeated().encodedSizeWithTag(3, recommendationSet.recommendation_items) + protoAdapter.encodedSizeWithTag(2, recommendationSet.model_version) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(9, recommendationSet.generic_recommendation_name) + protoAdapter2.encodedSizeWithTag(8, recommendationSet.eligible_for_personalization) + protoAdapter.asRepeated().encodedSizeWithTag(7, recommendationSet.retriever_input_names) + protoAdapter.encodedSizeWithTag(6, recommendationSet.variation_name) + protoAdapter.encodedSizeWithTag(5, recommendationSet.source_entity_token) + protoAdapter2.encodedSizeWithTag(4, recommendationSet.is_default_set) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRecommendationsResponse.RecommendationSet recommendationSet = (GetRecommendationsResponse.RecommendationSet) obj;
        recommendationSet.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(recommendationSet.recommendation_items, GetRecommendationsResponse.RecommendationItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        RecommendationType recommendationType = recommendationSet.recommendation_type;
        String str = recommendationSet.model_version;
        Boolean bool = recommendationSet.is_default_set;
        String str2 = recommendationSet.source_entity_token;
        String str3 = recommendationSet.variation_name;
        List list = recommendationSet.retriever_input_names;
        Boolean bool2 = recommendationSet.eligible_for_personalization;
        String str4 = recommendationSet.generic_recommendation_name;
        list.getClass();
        byteString.getClass();
        return new GetRecommendationsResponse.RecommendationSet(recommendationType, str, m1169redactElements, bool, str2, str3, list, bool2, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRecommendationsResponse.RecommendationSet recommendationSet = (GetRecommendationsResponse.RecommendationSet) obj;
        recommendationSet.getClass();
        RecommendationType.ADAPTER.encodeWithTag(protoWriter, 1, recommendationSet.recommendation_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, recommendationSet.model_version);
        GetRecommendationsResponse.RecommendationItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, recommendationSet.recommendation_items);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 4, recommendationSet.is_default_set);
        protoAdapter.encodeWithTag(protoWriter, 5, recommendationSet.source_entity_token);
        protoAdapter.encodeWithTag(protoWriter, 6, recommendationSet.variation_name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, recommendationSet.retriever_input_names);
        protoAdapter2.encodeWithTag(protoWriter, 8, recommendationSet.eligible_for_personalization);
        protoAdapter.encodeWithTag(protoWriter, 9, recommendationSet.generic_recommendation_name);
        protoWriter.writeBytes(recommendationSet.unknownFields());
    }
}
