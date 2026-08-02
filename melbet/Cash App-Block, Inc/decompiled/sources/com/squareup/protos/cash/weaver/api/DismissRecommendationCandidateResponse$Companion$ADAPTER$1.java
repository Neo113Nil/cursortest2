package com.squareup.protos.cash.weaver.api;

import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DismissRecommendationCandidateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DismissRecommendationCandidateResponse((String) obj, (RecommendationType) obj2, (String) obj3, (String) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = RecommendationType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DismissRecommendationCandidateResponse dismissRecommendationCandidateResponse = (DismissRecommendationCandidateResponse) obj;
        reverseProtoWriter.getClass();
        dismissRecommendationCandidateResponse.getClass();
        reverseProtoWriter.writeBytes(dismissRecommendationCandidateResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, dismissRecommendationCandidateResponse.suppressed_until_epoch_millis);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, dismissRecommendationCandidateResponse.item_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dismissRecommendationCandidateResponse.generic_recommendation_name);
        RecommendationType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dismissRecommendationCandidateResponse.recommendation_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dismissRecommendationCandidateResponse.source_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DismissRecommendationCandidateResponse dismissRecommendationCandidateResponse = (DismissRecommendationCandidateResponse) obj;
        dismissRecommendationCandidateResponse.getClass();
        int size$okio = dismissRecommendationCandidateResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(5, dismissRecommendationCandidateResponse.suppressed_until_epoch_millis) + protoAdapter.encodedSizeWithTag(4, dismissRecommendationCandidateResponse.item_id) + protoAdapter.encodedSizeWithTag(3, dismissRecommendationCandidateResponse.generic_recommendation_name) + RecommendationType.ADAPTER.encodedSizeWithTag(2, dismissRecommendationCandidateResponse.recommendation_type) + protoAdapter.encodedSizeWithTag(1, dismissRecommendationCandidateResponse.source_entity_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DismissRecommendationCandidateResponse dismissRecommendationCandidateResponse = (DismissRecommendationCandidateResponse) obj;
        dismissRecommendationCandidateResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = dismissRecommendationCandidateResponse.source_entity_token;
        RecommendationType recommendationType = dismissRecommendationCandidateResponse.recommendation_type;
        String str2 = dismissRecommendationCandidateResponse.generic_recommendation_name;
        String str3 = dismissRecommendationCandidateResponse.item_id;
        Long l = dismissRecommendationCandidateResponse.suppressed_until_epoch_millis;
        byteString.getClass();
        return new DismissRecommendationCandidateResponse(str, recommendationType, str2, str3, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DismissRecommendationCandidateResponse dismissRecommendationCandidateResponse = (DismissRecommendationCandidateResponse) obj;
        dismissRecommendationCandidateResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dismissRecommendationCandidateResponse.source_entity_token);
        RecommendationType.ADAPTER.encodeWithTag(protoWriter, 2, dismissRecommendationCandidateResponse.recommendation_type);
        protoAdapter.encodeWithTag(protoWriter, 3, dismissRecommendationCandidateResponse.generic_recommendation_name);
        protoAdapter.encodeWithTag(protoWriter, 4, dismissRecommendationCandidateResponse.item_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, dismissRecommendationCandidateResponse.suppressed_until_epoch_millis);
        protoWriter.writeBytes(dismissRecommendationCandidateResponse.unknownFields());
    }
}
