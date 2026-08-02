package com.squareup.protos.cash.spendinginsights;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.ColoredString;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardSpendingInsight$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsight((CardSpendingInsightType) obj, m, (HorizontalBarGraph) obj2, (ColoredButton) obj3, (TextSize) obj4, (LocalizedString) obj5, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CardSpendingInsightType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(ColoredString.ADAPTER.decode(protoReader));
            } else if (nextTag == 5) {
                obj2 = TransactorKt.decodeMessageOrMerge(HorizontalBarGraph.ADAPTER, protoReader, obj2);
            } else if (nextTag == 6) {
                obj3 = TransactorKt.decodeMessageOrMerge(ColoredButton.ADAPTER, protoReader, obj3);
            } else if (nextTag == 7) {
                try {
                    obj4 = TextSize.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 8) {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            } else if (nextTag != 10) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(SpendingAnalysisCategory.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsight cardSpendingInsight = (CardSpendingInsight) obj;
        reverseProtoWriter.getClass();
        cardSpendingInsight.getClass();
        reverseProtoWriter.writeBytes(cardSpendingInsight.unknownFields());
        SpendingAnalysisCategory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, cardSpendingInsight.spending_analysis_category);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, cardSpendingInsight.subtitle);
        TextSize.ADAPTER.encodeWithTag(reverseProtoWriter, 7, cardSpendingInsight.title_text_size);
        ColoredButton.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cardSpendingInsight.button);
        HorizontalBarGraph.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cardSpendingInsight.horizontal_bar_graph);
        ColoredString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cardSpendingInsight.colored_title);
        CardSpendingInsightType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardSpendingInsight.card_spending_insight_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsight cardSpendingInsight = (CardSpendingInsight) obj;
        cardSpendingInsight.getClass();
        return SpendingAnalysisCategory.ADAPTER.asRepeated().encodedSizeWithTag(10, cardSpendingInsight.spending_analysis_category) + LocalizedString.ADAPTER.encodedSizeWithTag(8, cardSpendingInsight.subtitle) + TextSize.ADAPTER.encodedSizeWithTag(7, cardSpendingInsight.title_text_size) + ColoredButton.ADAPTER.encodedSizeWithTag(6, cardSpendingInsight.button) + HorizontalBarGraph.ADAPTER.encodedSizeWithTag(5, cardSpendingInsight.horizontal_bar_graph) + ColoredString.ADAPTER.asRepeated().encodedSizeWithTag(2, cardSpendingInsight.colored_title) + CardSpendingInsightType.ADAPTER.encodedSizeWithTag(1, cardSpendingInsight.card_spending_insight_type) + cardSpendingInsight.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsight cardSpendingInsight = (CardSpendingInsight) obj;
        cardSpendingInsight.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardSpendingInsight.colored_title, ColoredString.ADAPTER);
        HorizontalBarGraph horizontalBarGraph = cardSpendingInsight.horizontal_bar_graph;
        HorizontalBarGraph horizontalBarGraph2 = horizontalBarGraph != null ? (HorizontalBarGraph) HorizontalBarGraph.ADAPTER.redact(horizontalBarGraph) : null;
        ColoredButton coloredButton = cardSpendingInsight.button;
        ColoredButton coloredButton2 = coloredButton != null ? (ColoredButton) ColoredButton.ADAPTER.redact(coloredButton) : null;
        LocalizedString localizedString = cardSpendingInsight.subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cardSpendingInsight.spending_analysis_category, SpendingAnalysisCategory.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        CardSpendingInsightType cardSpendingInsightType = cardSpendingInsight.card_spending_insight_type;
        TextSize textSize = cardSpendingInsight.title_text_size;
        byteString.getClass();
        return new CardSpendingInsight(cardSpendingInsightType, m1169redactElements, horizontalBarGraph2, coloredButton2, textSize, localizedString2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsight cardSpendingInsight = (CardSpendingInsight) obj;
        cardSpendingInsight.getClass();
        CardSpendingInsightType.ADAPTER.encodeWithTag(protoWriter, 1, cardSpendingInsight.card_spending_insight_type);
        ColoredString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cardSpendingInsight.colored_title);
        HorizontalBarGraph.ADAPTER.encodeWithTag(protoWriter, 5, cardSpendingInsight.horizontal_bar_graph);
        ColoredButton.ADAPTER.encodeWithTag(protoWriter, 6, cardSpendingInsight.button);
        TextSize.ADAPTER.encodeWithTag(protoWriter, 7, cardSpendingInsight.title_text_size);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, cardSpendingInsight.subtitle);
        SpendingAnalysisCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, cardSpendingInsight.spending_analysis_category);
        protoWriter.writeBytes(cardSpendingInsight.unknownFields());
    }
}
