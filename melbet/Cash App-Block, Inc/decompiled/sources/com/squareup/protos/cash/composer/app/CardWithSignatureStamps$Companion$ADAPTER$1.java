package com.squareup.protos.cash.composer.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardWithSignatureStamps$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardWithSignatureStamps((Card) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardWithSignatureStamps cardWithSignatureStamps = (CardWithSignatureStamps) obj;
        reverseProtoWriter.getClass();
        cardWithSignatureStamps.getClass();
        reverseProtoWriter.writeBytes(cardWithSignatureStamps.unknownFields());
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardWithSignatureStamps.card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardWithSignatureStamps cardWithSignatureStamps = (CardWithSignatureStamps) obj;
        cardWithSignatureStamps.getClass();
        return Card.ADAPTER.encodedSizeWithTag(1, cardWithSignatureStamps.card) + cardWithSignatureStamps.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardWithSignatureStamps cardWithSignatureStamps = (CardWithSignatureStamps) obj;
        cardWithSignatureStamps.getClass();
        Card card = cardWithSignatureStamps.card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardWithSignatureStamps(card2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardWithSignatureStamps cardWithSignatureStamps = (CardWithSignatureStamps) obj;
        cardWithSignatureStamps.getClass();
        Card.ADAPTER.encodeWithTag(protoWriter, 1, cardWithSignatureStamps.card);
        protoWriter.writeBytes(cardWithSignatureStamps.unknownFields());
    }
}
