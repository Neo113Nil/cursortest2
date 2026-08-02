package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.Action((String) obj, (CashCreditScoreHomeData.ScoreSummaryOverlayData) obj2, (CashCreditScoreHomeData.RecommendationOverlayData) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.ScoreSummaryOverlayData.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.RecommendationOverlayData.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        CashCreditScoreHomeData.RecommendationOverlayData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, action.recommendation_overlay);
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, action.score_summary_overlay);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, action.uri);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
        action.getClass();
        return CashCreditScoreHomeData.RecommendationOverlayData.ADAPTER.encodedSizeWithTag(3, action.recommendation_overlay) + CashCreditScoreHomeData.ScoreSummaryOverlayData.ADAPTER.encodedSizeWithTag(2, action.score_summary_overlay) + ProtoAdapter.STRING.encodedSizeWithTag(1, action.uri) + action.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
        action.getClass();
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = action.score_summary_overlay;
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData2 = scoreSummaryOverlayData != null ? (CashCreditScoreHomeData.ScoreSummaryOverlayData) CashCreditScoreHomeData.ScoreSummaryOverlayData.ADAPTER.redact(scoreSummaryOverlayData) : null;
        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = action.recommendation_overlay;
        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData2 = recommendationOverlayData != null ? (CashCreditScoreHomeData.RecommendationOverlayData) CashCreditScoreHomeData.RecommendationOverlayData.ADAPTER.redact(recommendationOverlayData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = action.uri;
        byteString.getClass();
        return new CashCreditScoreHomeData.Action(str, scoreSummaryOverlayData2, recommendationOverlayData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
        action.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, action.uri);
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ADAPTER.encodeWithTag(protoWriter, 2, action.score_summary_overlay);
        CashCreditScoreHomeData.RecommendationOverlayData.ADAPTER.encodeWithTag(protoWriter, 3, action.recommendation_overlay);
        protoWriter.writeBytes(action.unknownFields());
    }
}
