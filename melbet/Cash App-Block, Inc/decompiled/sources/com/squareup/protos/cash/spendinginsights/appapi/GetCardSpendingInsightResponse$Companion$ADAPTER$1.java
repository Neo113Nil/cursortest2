package com.squareup.protos.cash.spendinginsights.appapi;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsight;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetCardSpendingInsightResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCardSpendingInsightResponse((CardSpendingInsight) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardSpendingInsight.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCardSpendingInsightResponse getCardSpendingInsightResponse = (GetCardSpendingInsightResponse) obj;
        reverseProtoWriter.getClass();
        getCardSpendingInsightResponse.getClass();
        reverseProtoWriter.writeBytes(getCardSpendingInsightResponse.unknownFields());
        CardSpendingInsight.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCardSpendingInsightResponse.insight);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCardSpendingInsightResponse getCardSpendingInsightResponse = (GetCardSpendingInsightResponse) obj;
        getCardSpendingInsightResponse.getClass();
        return CardSpendingInsight.ADAPTER.encodedSizeWithTag(1, getCardSpendingInsightResponse.insight) + getCardSpendingInsightResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCardSpendingInsightResponse getCardSpendingInsightResponse = (GetCardSpendingInsightResponse) obj;
        getCardSpendingInsightResponse.getClass();
        CardSpendingInsight cardSpendingInsight = getCardSpendingInsightResponse.insight;
        CardSpendingInsight cardSpendingInsight2 = cardSpendingInsight != null ? (CardSpendingInsight) CardSpendingInsight.ADAPTER.redact(cardSpendingInsight) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCardSpendingInsightResponse(cardSpendingInsight2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCardSpendingInsightResponse getCardSpendingInsightResponse = (GetCardSpendingInsightResponse) obj;
        getCardSpendingInsightResponse.getClass();
        CardSpendingInsight.ADAPTER.encodeWithTag(protoWriter, 1, getCardSpendingInsightResponse.insight);
        protoWriter.writeBytes(getCardSpendingInsightResponse.unknownFields());
    }
}
