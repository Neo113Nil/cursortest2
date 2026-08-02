package com.squareup.protos.cash.cardspendinginsights;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightRow;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class CardSpendingInsightRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardSpendingInsightRow((CardSpendingInsightRow.RowImage) obj, (LocalizedString) obj2, (String) obj3, (CdfEvent) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CardSpendingInsightRow.RowImage.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightRow cardSpendingInsightRow = (CardSpendingInsightRow) obj;
        reverseProtoWriter.getClass();
        cardSpendingInsightRow.getClass();
        reverseProtoWriter.writeBytes(cardSpendingInsightRow.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cardSpendingInsightRow.subtitle);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cardSpendingInsightRow.cdfEvent);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, cardSpendingInsightRow.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardSpendingInsightRow.title);
        CardSpendingInsightRow.RowImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardSpendingInsightRow.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightRow cardSpendingInsightRow = (CardSpendingInsightRow) obj;
        cardSpendingInsightRow.getClass();
        int encodedSizeWithTag = CardSpendingInsightRow.RowImage.ADAPTER.encodedSizeWithTag(1, cardSpendingInsightRow.image) + cardSpendingInsightRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, cardSpendingInsightRow.subtitle) + CdfEvent.ADAPTER.encodedSizeWithTag(4, cardSpendingInsightRow.cdfEvent) + ProtoAdapter.STRING.encodedSizeWithTag(3, cardSpendingInsightRow.client_route) + protoAdapter.encodedSizeWithTag(2, cardSpendingInsightRow.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsightRow cardSpendingInsightRow = (CardSpendingInsightRow) obj;
        cardSpendingInsightRow.getClass();
        LocalizedString localizedString = cardSpendingInsightRow.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        CdfEvent cdfEvent = cardSpendingInsightRow.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        LocalizedString localizedString3 = cardSpendingInsightRow.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        CardSpendingInsightRow.RowImage rowImage = cardSpendingInsightRow.image;
        String str = cardSpendingInsightRow.client_route;
        byteString.getClass();
        return new CardSpendingInsightRow(rowImage, localizedString2, str, cdfEvent2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightRow cardSpendingInsightRow = (CardSpendingInsightRow) obj;
        cardSpendingInsightRow.getClass();
        CardSpendingInsightRow.RowImage.ADAPTER.encodeWithTag(protoWriter, 1, cardSpendingInsightRow.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, cardSpendingInsightRow.title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cardSpendingInsightRow.client_route);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 4, cardSpendingInsightRow.cdfEvent);
        protoAdapter.encodeWithTag(protoWriter, 5, cardSpendingInsightRow.subtitle);
        protoWriter.writeBytes(cardSpendingInsightRow.unknownFields());
    }
}
