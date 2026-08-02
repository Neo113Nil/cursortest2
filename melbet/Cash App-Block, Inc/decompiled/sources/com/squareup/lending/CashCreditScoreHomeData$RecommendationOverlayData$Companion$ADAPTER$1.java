package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$RecommendationOverlayData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashCreditScoreHomeData.RecommendationOverlayData((CashCreditScoreHomeData.Graphic) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (CashCreditScoreHomeData.Action) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Graphic.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Action.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = (CashCreditScoreHomeData.RecommendationOverlayData) obj;
        reverseProtoWriter.getClass();
        recommendationOverlayData.getClass();
        reverseProtoWriter.writeBytes(recommendationOverlayData.unknownFields());
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 5, recommendationOverlayData.primary_button_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, recommendationOverlayData.primary_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recommendationOverlayData.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recommendationOverlayData.title);
        CashCreditScoreHomeData.Graphic.ADAPTER.encodeWithTag(reverseProtoWriter, 1, recommendationOverlayData.graphic);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = (CashCreditScoreHomeData.RecommendationOverlayData) obj;
        recommendationOverlayData.getClass();
        int encodedSizeWithTag = CashCreditScoreHomeData.Graphic.ADAPTER.encodedSizeWithTag(1, recommendationOverlayData.graphic) + recommendationOverlayData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return CashCreditScoreHomeData.Action.ADAPTER.encodedSizeWithTag(5, recommendationOverlayData.primary_button_action) + protoAdapter.encodedSizeWithTag(4, recommendationOverlayData.primary_button_text) + protoAdapter.encodedSizeWithTag(3, recommendationOverlayData.body) + protoAdapter.encodedSizeWithTag(2, recommendationOverlayData.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = (CashCreditScoreHomeData.RecommendationOverlayData) obj;
        recommendationOverlayData.getClass();
        CashCreditScoreHomeData.Graphic graphic = recommendationOverlayData.graphic;
        CashCreditScoreHomeData.Graphic graphic2 = graphic != null ? (CashCreditScoreHomeData.Graphic) CashCreditScoreHomeData.Graphic.ADAPTER.redact(graphic) : null;
        LocalizedString localizedString = recommendationOverlayData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = recommendationOverlayData.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = recommendationOverlayData.primary_button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        CashCreditScoreHomeData.Action action = recommendationOverlayData.primary_button_action;
        CashCreditScoreHomeData.Action action2 = action != null ? (CashCreditScoreHomeData.Action) CashCreditScoreHomeData.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.RecommendationOverlayData(graphic2, localizedString2, localizedString4, localizedString6, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = (CashCreditScoreHomeData.RecommendationOverlayData) obj;
        recommendationOverlayData.getClass();
        CashCreditScoreHomeData.Graphic.ADAPTER.encodeWithTag(protoWriter, 1, recommendationOverlayData.graphic);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, recommendationOverlayData.title);
        protoAdapter.encodeWithTag(protoWriter, 3, recommendationOverlayData.body);
        protoAdapter.encodeWithTag(protoWriter, 4, recommendationOverlayData.primary_button_text);
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(protoWriter, 5, recommendationOverlayData.primary_button_action);
        protoWriter.writeBytes(recommendationOverlayData.unknownFields());
    }
}
