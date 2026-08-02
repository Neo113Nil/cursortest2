package com.squareup.protos.cash.cardspendinginsights;

import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsHome$ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsightsHome.ActivitySection(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsHome.ActivitySection activitySection = (CardSpendingInsightsHome.ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsHome.ActivitySection activitySection = (CardSpendingInsightsHome.ActivitySection) obj;
        activitySection.getClass();
        return activitySection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CardSpendingInsightsHome.ActivitySection) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSpendingInsightsHome.ActivitySection(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsHome.ActivitySection activitySection = (CardSpendingInsightsHome.ActivitySection) obj;
        activitySection.getClass();
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
