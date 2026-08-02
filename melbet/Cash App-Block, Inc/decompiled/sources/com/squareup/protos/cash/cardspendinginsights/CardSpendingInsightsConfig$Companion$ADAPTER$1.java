package com.squareup.protos.cash.cardspendinginsights;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardSpendingInsightsConfig((LocalizedString) obj, (LocalizedString) obj2, (CardSpendingInsightsConfig.OverviewSection) obj3, (CardSpendingInsightsConfig.InsightsSection) obj4, (CardSpendingInsightsConfig.ActivitySection) obj5, (LocalizedString) obj6, (LocalizedString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsConfig.OverviewSection.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsConfig.InsightsSection.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(CardSpendingInsightsConfig.ActivitySection.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
        reverseProtoWriter.getClass();
        cardSpendingInsightsConfig.getClass();
        reverseProtoWriter.writeBytes(cardSpendingInsightsConfig.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cardSpendingInsightsConfig.recurring_payment_info_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cardSpendingInsightsConfig.recurring_payment_info_title);
        CardSpendingInsightsConfig.ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cardSpendingInsightsConfig.activity_section);
        CardSpendingInsightsConfig.InsightsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cardSpendingInsightsConfig.insights_section);
        CardSpendingInsightsConfig.OverviewSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardSpendingInsightsConfig.overview_section);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardSpendingInsightsConfig.preview_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardSpendingInsightsConfig.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
        cardSpendingInsightsConfig.getClass();
        int size$okio = cardSpendingInsightsConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(7, cardSpendingInsightsConfig.recurring_payment_info_description) + protoAdapter.encodedSizeWithTag(6, cardSpendingInsightsConfig.recurring_payment_info_title) + CardSpendingInsightsConfig.ActivitySection.ADAPTER.encodedSizeWithTag(5, cardSpendingInsightsConfig.activity_section) + CardSpendingInsightsConfig.InsightsSection.ADAPTER.encodedSizeWithTag(4, cardSpendingInsightsConfig.insights_section) + CardSpendingInsightsConfig.OverviewSection.ADAPTER.encodedSizeWithTag(3, cardSpendingInsightsConfig.overview_section) + protoAdapter.encodedSizeWithTag(2, cardSpendingInsightsConfig.preview_title) + protoAdapter.encodedSizeWithTag(1, cardSpendingInsightsConfig.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
        cardSpendingInsightsConfig.getClass();
        LocalizedString localizedString = cardSpendingInsightsConfig.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = cardSpendingInsightsConfig.preview_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardSpendingInsightsConfig.OverviewSection overviewSection = cardSpendingInsightsConfig.overview_section;
        CardSpendingInsightsConfig.OverviewSection overviewSection2 = overviewSection != null ? (CardSpendingInsightsConfig.OverviewSection) CardSpendingInsightsConfig.OverviewSection.ADAPTER.redact(overviewSection) : null;
        CardSpendingInsightsConfig.InsightsSection insightsSection = cardSpendingInsightsConfig.insights_section;
        CardSpendingInsightsConfig.InsightsSection insightsSection2 = insightsSection != null ? (CardSpendingInsightsConfig.InsightsSection) CardSpendingInsightsConfig.InsightsSection.ADAPTER.redact(insightsSection) : null;
        CardSpendingInsightsConfig.ActivitySection activitySection = cardSpendingInsightsConfig.activity_section;
        CardSpendingInsightsConfig.ActivitySection activitySection2 = activitySection != null ? (CardSpendingInsightsConfig.ActivitySection) CardSpendingInsightsConfig.ActivitySection.ADAPTER.redact(activitySection) : null;
        LocalizedString localizedString5 = cardSpendingInsightsConfig.recurring_payment_info_title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = cardSpendingInsightsConfig.recurring_payment_info_description;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSpendingInsightsConfig(localizedString2, localizedString4, overviewSection2, insightsSection2, activitySection2, localizedString6, localizedString8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
        cardSpendingInsightsConfig.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cardSpendingInsightsConfig.title);
        protoAdapter.encodeWithTag(protoWriter, 2, cardSpendingInsightsConfig.preview_title);
        CardSpendingInsightsConfig.OverviewSection.ADAPTER.encodeWithTag(protoWriter, 3, cardSpendingInsightsConfig.overview_section);
        CardSpendingInsightsConfig.InsightsSection.ADAPTER.encodeWithTag(protoWriter, 4, cardSpendingInsightsConfig.insights_section);
        CardSpendingInsightsConfig.ActivitySection.ADAPTER.encodeWithTag(protoWriter, 5, cardSpendingInsightsConfig.activity_section);
        protoAdapter.encodeWithTag(protoWriter, 6, cardSpendingInsightsConfig.recurring_payment_info_title);
        protoAdapter.encodeWithTag(protoWriter, 7, cardSpendingInsightsConfig.recurring_payment_info_description);
        protoWriter.writeBytes(cardSpendingInsightsConfig.unknownFields());
    }
}
