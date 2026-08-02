package com.squareup.protos.cash.weaver.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.weaver.api.GetRecommendationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRecommendationsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRecommendationsResponse((Long) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GetRecommendationsResponse.RecommendationSet.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRecommendationsResponse getRecommendationsResponse = (GetRecommendationsResponse) obj;
        reverseProtoWriter.getClass();
        getRecommendationsResponse.getClass();
        reverseProtoWriter.writeBytes(getRecommendationsResponse.unknownFields());
        GetRecommendationsResponse.RecommendationSet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getRecommendationsResponse.recommendation_sets);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, getRecommendationsResponse.created_at_millis);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRecommendationsResponse getRecommendationsResponse = (GetRecommendationsResponse) obj;
        getRecommendationsResponse.getClass();
        return GetRecommendationsResponse.RecommendationSet.ADAPTER.asRepeated().encodedSizeWithTag(2, getRecommendationsResponse.recommendation_sets) + ProtoAdapter.INT64.encodedSizeWithTag(1, getRecommendationsResponse.created_at_millis) + getRecommendationsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRecommendationsResponse getRecommendationsResponse = (GetRecommendationsResponse) obj;
        getRecommendationsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getRecommendationsResponse.recommendation_sets, GetRecommendationsResponse.RecommendationSet.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = getRecommendationsResponse.created_at_millis;
        byteString.getClass();
        return new GetRecommendationsResponse(l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRecommendationsResponse getRecommendationsResponse = (GetRecommendationsResponse) obj;
        getRecommendationsResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecommendationsResponse.created_at_millis);
        GetRecommendationsResponse.RecommendationSet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getRecommendationsResponse.recommendation_sets);
        protoWriter.writeBytes(getRecommendationsResponse.unknownFields());
    }
}
