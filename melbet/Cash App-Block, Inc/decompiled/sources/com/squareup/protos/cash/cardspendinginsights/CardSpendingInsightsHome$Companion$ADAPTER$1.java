package com.squareup.protos.cash.cardspendinginsights;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsHome$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsightsHome((CardSpendingInsightsHome.EntryPoint) obj, (CardSpendingInsightsHome.OverviewSection) obj2, (CardSpendingInsightsHome.InsightsSection) obj3, (CardSpendingInsightsHome.ActivitySection) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsHome.EntryPoint.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsHome.OverviewSection.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsHome.InsightsSection.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsHome.ActivitySection.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj;
        reverseProtoWriter.getClass();
        cardSpendingInsightsHome.getClass();
        reverseProtoWriter.writeBytes(cardSpendingInsightsHome.unknownFields());
        CardSpendingInsightsHome.ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cardSpendingInsightsHome.activity_section);
        CardSpendingInsightsHome.InsightsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardSpendingInsightsHome.insights_section);
        CardSpendingInsightsHome.OverviewSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardSpendingInsightsHome.overview_section);
        CardSpendingInsightsHome.EntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardSpendingInsightsHome.entry_point);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj;
        cardSpendingInsightsHome.getClass();
        return CardSpendingInsightsHome.ActivitySection.ADAPTER.encodedSizeWithTag(4, cardSpendingInsightsHome.activity_section) + CardSpendingInsightsHome.InsightsSection.ADAPTER.encodedSizeWithTag(3, cardSpendingInsightsHome.insights_section) + CardSpendingInsightsHome.OverviewSection.ADAPTER.encodedSizeWithTag(2, cardSpendingInsightsHome.overview_section) + CardSpendingInsightsHome.EntryPoint.ADAPTER.encodedSizeWithTag(1, cardSpendingInsightsHome.entry_point) + cardSpendingInsightsHome.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj;
        cardSpendingInsightsHome.getClass();
        CardSpendingInsightsHome.EntryPoint entryPoint = cardSpendingInsightsHome.entry_point;
        CardSpendingInsightsHome.EntryPoint entryPoint2 = entryPoint != null ? (CardSpendingInsightsHome.EntryPoint) CardSpendingInsightsHome.EntryPoint.ADAPTER.redact(entryPoint) : null;
        CardSpendingInsightsHome.OverviewSection overviewSection = cardSpendingInsightsHome.overview_section;
        CardSpendingInsightsHome.OverviewSection overviewSection2 = overviewSection != null ? (CardSpendingInsightsHome.OverviewSection) CardSpendingInsightsHome.OverviewSection.ADAPTER.redact(overviewSection) : null;
        CardSpendingInsightsHome.InsightsSection insightsSection = cardSpendingInsightsHome.insights_section;
        CardSpendingInsightsHome.InsightsSection insightsSection2 = insightsSection != null ? (CardSpendingInsightsHome.InsightsSection) CardSpendingInsightsHome.InsightsSection.ADAPTER.redact(insightsSection) : null;
        CardSpendingInsightsHome.ActivitySection activitySection = cardSpendingInsightsHome.activity_section;
        CardSpendingInsightsHome.ActivitySection activitySection2 = activitySection != null ? (CardSpendingInsightsHome.ActivitySection) CardSpendingInsightsHome.ActivitySection.ADAPTER.redact(activitySection) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSpendingInsightsHome(entryPoint2, overviewSection2, insightsSection2, activitySection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj;
        cardSpendingInsightsHome.getClass();
        CardSpendingInsightsHome.EntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, cardSpendingInsightsHome.entry_point);
        CardSpendingInsightsHome.OverviewSection.ADAPTER.encodeWithTag(protoWriter, 2, cardSpendingInsightsHome.overview_section);
        CardSpendingInsightsHome.InsightsSection.ADAPTER.encodeWithTag(protoWriter, 3, cardSpendingInsightsHome.insights_section);
        CardSpendingInsightsHome.ActivitySection.ADAPTER.encodeWithTag(protoWriter, 4, cardSpendingInsightsHome.activity_section);
        protoWriter.writeBytes(cardSpendingInsightsHome.unknownFields());
    }
}
