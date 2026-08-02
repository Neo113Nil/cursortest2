package com.squareup.protos.cash.cardspendinginsights;

import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsConfig$OverviewSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsightsConfig.OverviewSection(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsConfig.OverviewSection overviewSection = (CardSpendingInsightsConfig.OverviewSection) obj;
        reverseProtoWriter.getClass();
        overviewSection.getClass();
        reverseProtoWriter.writeBytes(overviewSection.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsConfig.OverviewSection overviewSection = (CardSpendingInsightsConfig.OverviewSection) obj;
        overviewSection.getClass();
        return overviewSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CardSpendingInsightsConfig.OverviewSection) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSpendingInsightsConfig.OverviewSection(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsConfig.OverviewSection overviewSection = (CardSpendingInsightsConfig.OverviewSection) obj;
        overviewSection.getClass();
        protoWriter.writeBytes(overviewSection.unknownFields());
    }
}
